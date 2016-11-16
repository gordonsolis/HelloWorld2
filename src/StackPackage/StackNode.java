package StackPackage;

public class StackNode
{
    private int value;
    private StackNode lowerNode;

    public StackNode ()
    {
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int newValue)
    {
        value = newValue;
    }

    public StackNode getLowerNode()
    {
        return lowerNode;
    }

    public void setLowerNode (StackNode newLowerNode)
    {
        lowerNode = newLowerNode;
    }

}
