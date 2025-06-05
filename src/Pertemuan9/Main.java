package Pertemuan9;

// Main.java
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);  // Membuat queue dengan kapasitas 5

        // Melakukan operasi enqueue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);  // Queue penuh, akan menampilkan pesan error

        // Menampilkan antrian
        queue.display();

        // Melakukan operasi dequeue
        queue.dequeue();
        queue.dequeue();

        // Menampilkan antrian setelah dequeue
        queue.display();

        // Menampilkan elemen depan
        System.out.println("Front element: " + queue.front());

        // Menampilkan ukuran antrian
        System.out.println("Queue size: " + queue.size());
    }
}

