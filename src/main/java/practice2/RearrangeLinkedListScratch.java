package practice2;


public class RearrangeLinkedListScratch {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }


    public Node reverseList(Node head) {
        Node current = head;
        Node prev=null , next = null;

        while(current!=null) {
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    Node rearrange(Node head){
        Node slow = head;
        Node fast = slow.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node node1 = head;
        Node node2 = slow.next;
        slow.next=null;

        node2 = reverseList(node2);

        Node resultHead = new Node(0);
        Node curr = resultHead;

        while(node1!=null && node2!=null) {

            if(node1!=null){
                curr.next=node1;
                curr = curr.next;
                node1 = node1.next;
            }

            if(node2!=null) {
                curr.next=node2;
                curr = curr.next;
                node2 = node2.next;
            }

        }

        resultHead=resultHead.next;
        return resultHead;
    }

    void printlist(Node node)
    {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);

        RearrangeLinkedListScratch rearrangeLinkedListScratch = new RearrangeLinkedListScratch();
        rearrangeLinkedListScratch.printlist(node);
        System.out.println("\n");
        node = rearrangeLinkedListScratch.rearrange(node);
        rearrangeLinkedListScratch.printlist(node);
    }
}
