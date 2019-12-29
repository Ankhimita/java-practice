package practice2;

public class ReverseSinglyLinkedList {

    static class Node {
        Node next;
        int data;

        Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    public static Node reverseLinks(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printList(Node head) {
        while(head!=null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Before Reversing-->");
        printList(head);
        head = reverseLinks(head);
        System.out.println("After Reversing-->");
        printList(head);

    }
}
