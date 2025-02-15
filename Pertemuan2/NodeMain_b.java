package Pertemuan2;

public class NodeMain_b {
    public static void main(String[] args) {
        // **Urutan kedua: 2 → 3 → 5 → 7 → 9**
        Node nodeA = new Node(2);
        Node nodeB = new Node(3);
        Node nodeC = new Node(5);
        Node nodeD = new Node(7);
        Node nodeE = new Node(9);

        // Menghubungkan node sesuai urutan kedua
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);
        nodeD.setNext(nodeE);

        // Menampilkan list kedua
        System.out.println("\nUrutan kedua:");
        printList(nodeA);
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