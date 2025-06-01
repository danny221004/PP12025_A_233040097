package Pertemuan3;

/**
 * Kelas Node merepresentasikan elemen pada linked list
 * yang menyimpan data dan pointer ke node berikutnya
 */
public class Node {
    private int data;    // data disimpan di node
    private Node next;   // referensi node berikutnya

    // Konstruktor node untuk inisialisasi data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Getter dan Setter untuk data
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // Getter dan Setter untuk next
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
