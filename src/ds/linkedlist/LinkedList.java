package ds.linkedlist;

public class LinkedList
{

    private Node head;
    private Node tail;
    private Integer length;

    public LinkedList(Integer value)
    {
        Node newNode = new Node(4);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }


    class Node
    {
        Integer value;
        Node node;

        Node(Integer value)
        {
            this.value = value;
        }
    }

    public void getHead()
    {
        System.out.println("Head: " + this.head.value);
    }

    public void getTail()
    {
        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength()
    {
        System.out.println("Length: " + this.length);
    }

    public void printList()
    {
        System.out.println(this.head.value);
    }
}
