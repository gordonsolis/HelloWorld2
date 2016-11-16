/**
 * Created by Gordon Solis on 11/1/2016.
 */
public class SinglyLinkedList {

    private SinglyLinkedNode baseNode;

    private boolean isEmpty()
    {
        return baseNode == null;
    }

    public void addNumberToList(int newNumber)
    {
        SinglyLinkedNode newNode = new SinglyLinkedNode();
        newNode.setValue(newNumber);
        if (baseNode == null)
        {
            baseNode = newNode;
        }
        else
        {
            SinglyLinkedNode endofList = baseNode;
            while (!endofList.isEndofList())
            {
                endofList = endofList.getNextNode();
            }
            endofList.setNextNode(newNode);
        }
    }

    public void printWholeList()
    {
        if (this.isEmpty())
        {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("list: " + baseNode.getValue()+ ", ");
        SinglyLinkedNode currentNode = baseNode;
        while(!currentNode.isEndofList())
        {
            currentNode = currentNode.getNextNode();
            System.out.print(currentNode.getValue() + ",");
        }
    }

    public void printListBetter ()
    {
        System.out.print("List: ");
        SinglyLinkedNode currNode = baseNode;
        while (currNode != null)
        {
            System.out.print(", " + currNode.getValue());
            currNode = currNode.getNextNode();
        }
        // Prints out the line of code
        System.out.println();
    }

    /**
     * Gets the value of the node at index
     * @param index the index of the node that you want to get the value from.
     * @return the value of the node at index
     */

    public int get (int index)
    {
        SinglyLinkedNode currNode = baseNode;
        for (int i = 0; i <= index; i++)
        {
            if (currNode == null)
            {
                throw new IllegalArgumentException("Does not work");
            }
            currNode = currNode.getNextNode();
        }
        return currNode.getValue();
    }

    public int delete(int index)
    {
        if (index<1)
        {
            int returnValue = baseNode.getValue();
            baseNode = baseNode.getNextNode();
            return returnValue;
        }
        SinglyLinkedNode currNode = baseNode;
        for (int i = 0; i < index-1; i++)
        {
            currNode = currNode.getNextNode();
        }
        int returnValue = currNode.getNextNode().getValue();
        currNode.setNextNode(currNode.getNextNode().getNextNode());

        return returnValue;
    }

    public void update(int index, int newValue)
    {

        SinglyLinkedNode currNode = baseNode;
        for (int i = 0; i <= index; i++)
        {
            if (currNode == null)
            {
                throw new IllegalArgumentException("Does not work");
            }
            currNode = currNode.getNextNode();
        }
        currNode.setValue(newValue);
    }

    public void insertAtIndex(int index, int value)
    {
        SinglyLinkedNode newNode = new SinglyLinkedNode();
        newNode.setValue(value);
        if (baseNode == null)
        {
            baseNode = newNode;
            return;
        }
        SinglyLinkedNode currNode = baseNode;
        for (int i = 0; i <index-1; i++)
        {
            currNode = currNode.getNextNode();
        }
        newNode = currNode.getNextNode();
        currNode.setNextNode(newNode);
    }

}
