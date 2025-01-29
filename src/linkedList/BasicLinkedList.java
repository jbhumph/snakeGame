package linkedList;

public class BasicLinkedList<T> {
    private MyNode<T> head;
    private int size;

    public BasicLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // adds a new node to the end of the list
    public void add(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // returns the number of nodes in the list
    public int size() {
        return size;
    }

    // returns the first element in the array
    public T getLast() {
        MyNode<T> temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // returns the last element in the array
    public T getFirst() {
        return head.data;
    }

    // returns an element at a given position
    public T get(int index) {
        MyNode<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // create a function that removes head
    public void removeFirst() {
        head = head.next;
        size--;
    }
}