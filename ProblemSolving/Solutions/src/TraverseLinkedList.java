public class TraverseLinkedList {
     /*
        print the elements of the linked list
     */
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public void push(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList()
    {
        while ( head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

}
