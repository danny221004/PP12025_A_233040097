package Pertemuan3;

/**
 * Kelas StrukturList mengelola linked list,
 * khususnya operasi penambahan elemen di akhir (addTail)
 */
public class StrukturList {
    private Node HEAD;  // pointer ke node pertama

    public StrukturList() {
        this.HEAD = null;  // list kosong saat inisialisasi
    }

    /**
     * Menambahkan elemen baru di akhir linked list
     * @param data nilai data yang akan ditambahkan
     */
    public void addTail(int data) {
        Node newNode = new Node(data);

        // Jika list kosong, set HEAD ke node baru
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            // Cari node terakhir
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // Tambahkan node baru di akhir
            current.setNext(newNode);
        }
    }

    /**
     * Menampilkan semua elemen dalam linked list
     */
    public void display() {
        if (HEAD == null) {
            System.out.println("List kosong.");
            return;
        }

        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}