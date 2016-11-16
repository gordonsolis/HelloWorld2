/**
 * Created by Gordon Solis on 11/1/2016.
 */
public class SinglyLinkedNode
{
    private SinglyLinkedNode nextNode;
    private int value;

    public SinglyLinkedNode()
    {

    }

    public SinglyLinkedNode getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(SinglyLinkedNode nextNode)
    {
        this.nextNode =  nextNode;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int newValue)
    {
        value = newValue;
    }

    public boolean isEndofList()
    {
        return nextNode == null;
    }

}
