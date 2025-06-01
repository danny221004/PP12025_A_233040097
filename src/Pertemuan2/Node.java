package Pertemuan2;

// Kelas Node
public class Node {
    private int nilai;
    private Node next;

    // Constructor
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }

    // Setter dan Getter untuk nilai
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    // Setter dan Getter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
