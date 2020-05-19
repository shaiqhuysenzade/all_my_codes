package atHome.linked_list;

import java.util.StringJoiner;

public class XLinkedList {
    private int n;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node head = null;

    void prepend(int element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
        n++;
    }

    void append(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        n++;
    }

    int size() {
        return n;
    }

    boolean contains() {
        throw new IllegalArgumentException("contains:has't implemented");
    }

    Node reverse() {
        throw new IllegalArgumentException("reverse:has't implemented");
    }

    String represent() {
        StringJoiner stringJoiner = new StringJoiner(",", "(", ")");

        for (Node node = head; node != null; node = node.next) {
            stringJoiner.add(String.valueOf(node.value));
        }
        return stringJoiner.toString();
    }

    String represent2() {
        StringJoiner stringJoiner = new StringJoiner(",", "(", ")");

        attachNext(head, stringJoiner);
        return stringJoiner.toString();
    }

    private void attachNext(Node current, StringJoiner stringJoiner) {
        if (current == null) return;
        stringJoiner.add(String.valueOf(current.value));
        attachNext(current.next, stringJoiner);
    }

    public int length_iter() {
        int length = 0;
        for (Node node = head; node != null; node = node.next) length++;
        return length;
    }
    public int length_itder_from(Node node){
        if(node==null) return 0;
        int part = length_itder_from(node.next);
        return part++;
    }
    public int length_tail_recursion(Node current , int acc){
        if(current==null) return  acc;
        return  length_tail_recursion(current.next,acc+1);
    }
}
