import java.util.*;

public class StackList {
    private int[] arr;
    private int top;
    private int capacity;

    public StackList(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    class Node{
        int data;
	Node next;
		
	public Node(int initialData){
            data= initialData;
            next=null;
	}
    }
	
    public Node head = null;
    public Node tail = null;
    
    public int length(){
        int counter = 0;
        Node temp = head;
        if (head == null){
            return 0;
        }
        else if(head!=null){
            while(temp.next != null){
                temp = temp.next;
                counter++;
            }
        }
        return counter;
    }
    
    public void addNodeToEnd(int newEntry){
        Node newNode = new Node(newEntry);	
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void removeLastNode(){
        Node temp = head;
        if(head == null){
            System.out.println("The linked list is empty. ");
        }else{
            for (int i = 1; i < length(); i++){
                temp = temp.next;
            }
        tail = temp;
        temp.next = null;
        }
    }

    
    public boolean isEmpty(){return (top < 0) ? true: false;}

    public boolean isFull(){return (top >= capacity - 1)? true: false;}

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            addNodeToEnd(data);
            top++;
            System.out.println("Item " +  data + " is added.");
            System.out.println(" ");
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            System.out.println("Item " + tail.data + " has been removed.");
            removeLastNode();
            top--;
            return tail.data;
        }
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return tail.data;
        }
    }

    public int size() {
        return top + 1;
    }
    
    public static void main(String[] args){
        StackList obj = new StackList(5);
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (true){
            System.out.println("Choose one option from the following: ");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Exit. ");
            System.out.print("Enter your option: ");
            
            ch= sc.nextInt();
            switch(ch){
                case 1: // Push
                    int input;
                    System.out.print("Enter the number that you want to add: ");
                    input = sc.nextInt();
                    obj.push(input);
                    continue;
                case 2: // Pop
                    if(obj.isEmpty()){
                        System.out.println("Stack is empty.");
                    }else{
                       obj.pop();
                    }
                    System.out.println(" "); 
                    continue;
                case 3: // Peek
                    if(obj.isEmpty()){
                        System.out.println("Stack is empty.");
                    }else{
                        System.out.println("The top item is " + obj.peek());
                    }
                    System.out.println(" ");
                    continue;
                case 4:
                    break;
                default: System.out.println("Invalid input. ");
            }
            
        }
    }
}