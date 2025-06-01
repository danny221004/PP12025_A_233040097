package pertemuan4;

public class StrukturListAddMiddle {
    private Node head;

    public StrukturListAddMiddle() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Fungsi addHead sebagai pendukung jika indeks 0
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    // Fungsi addMiddle sesuai modul (tambah di posisi index)
    public void addMiddle(int data, int index) {
        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            addHead(data);
            return;
        }

        Node current = head;
        int count = 0;

        // Traversal ke node sebelum posisi index
        while (current != null && count < index - 1) {
            current = current.getNext();
            count++;
        }

        if (current == null) {
            System.out.println("Index melebihi panjang list");
            return;
        }

        // Sisipkan node baru
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    // Fungsi display untuk menampilkan list
    public void display() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
