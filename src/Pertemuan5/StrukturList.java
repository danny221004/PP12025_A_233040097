package Pertemuan5;
public class StrukturList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    // Tambah elemen di awal list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = HEAD;
        HEAD = newNode;
    }

    // Tambah elemen di akhir list (penting untuk tugas)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        Node current = HEAD;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Tampilkan elemen list
    public void display() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Hapus elemen pertama (head)
    public void removeHead() {
        if (HEAD != null) {
            HEAD = HEAD.next;
        }
    }

    // Hapus elemen terakhir (tail)
    public void removeTail() {
        if (HEAD == null) return;
        if (HEAD.next == null) {
            HEAD = null;
            return;
        }
        Node current = HEAD;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Hapus elemen tengah berdasarkan nilai
    public void removeMiddle(int value) {
        if (HEAD == null) return;
        if (HEAD.data == value) {
            removeHead();
            return;
        }
        Node current = HEAD;
        Node prev = null;
        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }
    }
}
