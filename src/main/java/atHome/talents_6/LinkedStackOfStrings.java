package atHome.talents_6;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedStackOfStrings {
    private int n;
    private Node first;
    private class Node{
        private String item;
        private Node next;
        Node(String item){
            this.item=item;
        }
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return n;
    }

    public void push(String item){
        Node oldFirst=first;
        first=new Node(item);
        first.next=oldFirst;
        n++;
    }
    public void push2(String item){
        Node newItem=new Node(item);
        newItem.next=first;
        first=newItem;
        n++;
    }

    public String pop(){
        if(isEmpty()) throw  new NoSuchElementException("stack underflow");
        String item =first.item;
        first =first.next;
        n--;
        return item;
    }
    public void allItems(){
        for (Node x = first; x != null; x = x.next)
            System.out.println(x.item);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
//        String item = in.nextLine();
        stack.push("Shaiq");
        System.out.println("Wright STOP , if you want to end pushing");
        while (!stack.isEmpty()){
            String item = in.nextLine();
             if(item.equalsIgnoreCase("STOp")) break;
            if (!item.equals("-"))     stack.push(item);
            else if (stack.isEmpty())  System.out.println("BAD INPUT");

            else                        System.out.print(stack.pop());

        }
        System.out.println( "Size is : " + stack.size());
        stack.allItems();
    }
}
