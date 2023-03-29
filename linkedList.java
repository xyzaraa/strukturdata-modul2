/**
 * Kiara Azzahra
 * 202110370311426
 * Kegiatan 2
 */

package praktikumModul2.kegiatan2;

public class linkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void print() {
        Node current = head;

        System.out.print("Before: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void bubbleSort() {
        if (head == null) {
            return;
        }

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            Node current = head;
            Node prev = null;
            while (current.getNext() != null) {
                if (current.getData() > current.getNext().getData()) {
                    Node next = current.getNext();
                    current.setNext(next.getNext());
                    next.setNext(current);
                    if (prev == null) {
                        head = next;
                    } else {
                        prev.setNext(next);
                    }
                    prev = next;
                    swapped = true;
                } else {
                    prev = current;
                    current = current.getNext();
                }
            }
        }
    }

    public void printSorted() {
        Node current = head;

        System.out.print("After: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(9);

        list.print();


        list.bubbleSort();

        list.printSorted();
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
