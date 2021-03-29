public class Main {
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

    public static void main(String[] args) {
        Main linkedList = new Main();
        for (int i=5; i>0; --i)
        {
            linkedList.push(i);
            linkedList.printList();
        }
    }
}