public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return (top <= 0) ? true: false;
    }

    public boolean isFull() {
        return (top >= capacity - 1)? true: false;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            arr[top+1] = data;
            top++;
            System.out.println("Item " +  data + " is added,");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[top];
        }
    }

    public int size() {
        return top + 1;
    }
    
    public static void main(String[] args){
        Stack obj = new Stack(3);
        System.out.println(" ");
        
        obj.pop();
        
        System.out.println("The size is: " + obj.size());
        if (obj.isEmpty()){
            System.out.println("There is no top item in the stack.");
        }else{
            System.out.println("The top item is: " + obj.peek());
        }
    }
}