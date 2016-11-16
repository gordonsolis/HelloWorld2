import StackPackage.LinkedStack;

//homework; write a main method

public class MainClass {
    public static void main(String[] args)
    {
        SinglyLinkedList List1 = new SinglyLinkedList();
        List1.addNumberToList(5);
        List1.addNumberToList(3);
        List1.addNumberToList(12);
        List1.addNumberToList(20);
        List1.printListBetter();

        LinkedStack myStack = new LinkedStack();
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);

        System.out.println("The top node of our stack is currently: "+ myStack.peek());
        System.out.println("If i remove the number " + myStack.pop()+ ", the new top number in the stack is: "+ myStack.peek());
    }

}
