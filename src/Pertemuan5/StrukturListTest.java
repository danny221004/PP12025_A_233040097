package Pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // --- Latihan 1: Remove Head ---
        System.out.println("Latihan 1: Remove Head");
        // Buat list kosong, operasi removeHead dijalankan (tidak error)
        list.removeHead();
        list.display();

        // --- Latihan 2 ---
        System.out.println("\nLatihan 2:");
        StrukturList list2 = new StrukturList();
        list2.addFirst(2);
        list2.addFirst(9);
        list2.addFirst(7);
        System.out.print("List setelah tambah 7,9,2 di awal: ");
        list2.display();  // 7 9 2

        list2.removeHead();
        System.out.print("Setelah removeHead: ");
        list2.display();  // 9 2

        // Hapus head 3 kali berturut-turut (perintah tambahan)
        list2.removeHead(); // Hapus 9
        list2.removeHead(); // Hapus 2
        list2.removeHead(); // Sudah kosong, tidak error
        System.out.print("Setelah removeHead 3x: ");
        list2.display();

        // --- Latihan 3: Remove Tail ---
        System.out.println("\nLatihan 3: Remove Tail");
        StrukturList list3 = new StrukturList();
        // (2,6,3,5,1) akan ditambahkan di Latihan 4

        // --- Latihan 4 ---
        System.out.println("\nLatihan 4:");
        StrukturList list4 = new StrukturList();
        list4.addFirst(1);
        list4.addFirst(5);
        list4.addFirst(3);
        list4.addFirst(6);
        list4.addFirst(2);
        // Karena addFirst, urutan menjadi 2 6 3 5 1

        System.out.print("List awal: ");
        list4.display();  // 2 6 3 5 1

        list4.removeTail();
        System.out.print("Setelah removeTail: ");
        list4.display();  // 2 6 3 5

        list4.removeHead();
        System.out.print("Setelah removeHead: ");
        list4.display();  // 6 3 5

        // Tambah instruksi hapus tail sampai output jadi 6 3
        list4.removeTail();
        System.out.print("Setelah removeTail lagi: ");
        list4.display();  // 6 3

        // --- Tugas ---
        System.out.println("\nTugas:");
        StrukturList list5 = new StrukturList();
        // Tambah elemen (4,3,7,8,1,9)
        list5.addLast(4);
        list5.addLast(3);
        list5.addLast(7);
        list5.addLast(8);
        list5.addLast(1);
        list5.addLast(9);

        System.out.print("List awal: ");
        list5.display();  // 4 3 7 8 1 9

        list5.removeMiddle(8);
        System.out.print("Setelah hapus elemen 8: ");
        list5.display();  // 4 3 7 1 9

        list5.removeMiddle(3);
        System.out.print("Setelah hapus elemen 3: ");
        list5.display();  // 4 7 1 9

        list5.removeTail();
        System.out.print("Setelah hapus elemen terakhir: ");
        list5.display();  // 4 7 1

        // Tambah elemen 2 di awal (supaya output 2 4 1)
        list5.addFirst(2);
        System.out.print("Setelah tambah 2 di awal: ");
        list5.display();  // 2 4 7 1

        // Hapus elemen 7 supaya output jadi 2 4 1
        list5.removeMiddle(7);
        System.out.print("Setelah hapus elemen 7: ");
        list5.display();  // 2 4 1
    }
}
