package StackProg;

/**
 * Program to Implement Stack.
 */
public class StackImplementation {
    int stacktop = 1000;
    int stackArray[] = new int[stacktop];
    int top;

    boolean stackEmpty(){
        return (top < 0);
    }
    StackImplementation(){
        top = top - 1;
    }


    /*
    Method to add Element Into Stack.
     */
    public void pushStack(int x){
        if(top > stacktop){
            System.out.println("Stack is Overflow.");
        }
        else{
            stackArray[++top] = x;
            System.out.println(x);
        }
    }

    /*
    Method to remove Element From Stack
     */
    public void popStack(){
        if(top < 0 ){
            System.out.println("Stack is Underflow");
        }
        else{
            int x = stackArray[top--];
            System.out.println(x+ " Element removed from Stack");
        }
    }

    public static void main(String[] args) {
        StackImplementation implementation = new StackImplementation();
        implementation.pushStack(15);
        implementation.pushStack(20);
        implementation.pushStack(25);
        implementation.pushStack(30);
        implementation.popStack();
        implementation.popStack();

    }


}
