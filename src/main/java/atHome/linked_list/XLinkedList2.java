package atHome.linked_list;

import java.util.StringJoiner;

public class XLinkedList2 {
    int n = 0;

    private static class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    Node head = null;

    public void prepend(int element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
        n++;
    }

    public int size() {
        return n;
    }

    public void append(int element) {
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

    public String represent() {
        StringJoiner joiner = new StringJoiner(",", "{", "}");
        for (Node node = head; node != null; node = node.next) {
            joiner.add(String.valueOf(node.value));
        }
        return joiner.toString();
    }

    public String represent2() {
        StringJoiner joiner = new StringJoiner(",", "{", "}");
        attach_next(head, joiner);
        return joiner.toString();
    }

    private void attach_next(Node cuurent, StringJoiner joiner) {
        if (cuurent == null) return;
        joiner.add(String.valueOf(cuurent.value));
        attach_next(cuurent.next, joiner);
    }

    public int length_iter() {
        int length = 0;
        for (Node node = head; node != null; node = node.next) length++;
        return length;
    }

    private int length_iter_from(Node node) {
        if (node == null) return 0;
        int part = length_iter_from(node.next);
        return part + 1;
    }

    private int length_tail_recursion(Node current, int acc) {
        if (current == null) return acc;
        return length_tail_recursion(current.next, acc + 1);
    }

    public int length_r() {
        return length_iter_from(head);
    }

    public int length_tr() {
        return length_tail_recursion(head, 0);
    }

    //recursion
    private boolean containFrom(Node current, int element) {
        if (current == null) return false;
        if (current.value == element) return true;
        return containFrom(current.next, element);
    }

    //recursion
    public boolean contains(int element) {
        return containFrom(head, element);
    }

    //iteration
    public boolean contains_iteration(int element) {
        Node current = head;
        while (current != null) {
            if (current.value == element) return true;
            current=current.next;
        }
        return false;
    }
}
