package Pertemuan2;

public class NodeMain_a {
    public static void main(String[] args) {
        // **Urutan pertama: 5 → 7 → 9 → 8**
        Node node1 = new Node(5);
        Node node2 = new Node(7);
        Node node3 = new Node(9);
        Node node4 = new Node(8);

        // Menghubungkan node sesuai urutan
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        // Menampilkan list pertama
        System.out.println("Urutan pertama:");
        printList(node1);
    }

    // Fungsi untuk mencetak isi linked list
    public static void printList(Node head) {
        Node p = head; // Pointer ke node pertama
        while (p != null) {
            System.out.print(p.getNilai() + " ");
            p = p.getNext(); // Pindah ke node berikutnya
        }
        System.out.println();
    }
}
