package StackPackage;


public class LinkedStack
{
    private StackNode topNode;

    public LinkedStack()
    {

    }

    public void push (int newValue)
    {
        StackNode newNode = new StackNode();
        newNode.setValue(newValue);
        newNode.setLowerNode(topNode);
        topNode = newNode;
    }

    public int pop()
    {
        int returnValue = topNode.getValue();
        topNode = topNode.getLowerNode();
        return returnValue;
    }

    public int peek ()
    {
        return topNode.getValue();
    }
}
