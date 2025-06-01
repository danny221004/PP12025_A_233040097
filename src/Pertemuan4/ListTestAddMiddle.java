package pertemuan4;

public class ListTestAddMiddle {
    public static void main(String[] args) {
        StrukturListAddMiddle list = new StrukturListAddMiddle();

        // Tambah elemen di awal list untuk contoh
        list.addHead(10);
        list.addHead(5);
        list.addHead(3);

        System.out.print("List awal: ");
        list.display();  // Output: 3 5 10

        // Tambah elemen di tengah list pada index 1
        list.addMiddle(7, 1);
        System.out.print("Setelah addMiddle(7, 1): ");
        list.display();  // Output: 3 7 5 10

        // Tambah elemen di tengah list pada index 0 (seharusnya sama dengan addHead)
        list.addMiddle(2, 0);
        System.out.print("Setelah addMiddle(2, 0): ");
        list.display();  // Output: 2 3 7 5 10

        // Tambah elemen di tengah list pada index 4
        list.addMiddle(9, 4);
        System.out.print("Setelah addMiddle(9, 4): ");
        list.display();  // Output: 2 3 7 5 9 10

        // Uji input indeks di luar panjang list
        list.addMiddle(20, 10); // Output: Index melebihi panjang list
    }
}
