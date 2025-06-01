package Pertemuan3;

/**
 * Program utama untuk menguji operasi linked list
 */
public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen ke list
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);
        list.addTail(7);

        // Tampilkan elemen list
        System.out.print("Isi list: ");
        list.display();  // Output: Isi list: 3 4 5
    }
}


