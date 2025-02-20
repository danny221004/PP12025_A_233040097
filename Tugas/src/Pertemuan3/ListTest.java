package Pertemuan3;

public class ListTest {

    public static void main(String[] args) {
        System.out.println("Hasil :");

        StrukturList list1 = new StrukturList();
        // Tes-1a: Menambahkan elemen di akhir list
        list1.addTail(3);
        list1.addTail(2);
        list1.addTail(1);
        list1.displayList(); // Output: 3 2 1
        System.out.println();

        // Tes-1b: Menambahkan elemen di akhir list
        StrukturList list2 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        list2.displayList(); // Output: 1 4 5 7
        System.out.println();

        // Tes-2: Menambahkan elemen di awal list
        StrukturList list3 = new StrukturList();
        list3.addHead(5);
        list3.addHead(4);
        list3.addHead(3);
        list3.displayList(); // Output: 3 4 5
        System.out.println();

        // Tes-3a: Menambahkan elemen di awal list
        StrukturList list4 = new StrukturList();
        list4.addHead(1);
        list4.addHead(2);
        list4.addHead(3);
        list4.displayList(); // Output: 3 2 1
        System.out.println();

        // Tes-3b: Menambahkan elemen di akhir list
        StrukturList list5 = new StrukturList();
        list5.addTail(1);
        list5.addTail(4);
        list5.addTail(5);
        list5.addTail(7);
        list5.displayList(); // Output: 1 4 5 7
        System.out.println();
    }
}
