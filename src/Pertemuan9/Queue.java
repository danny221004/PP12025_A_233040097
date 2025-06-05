package Pertemuan9;

// Queue.java
public class Queue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor untuk inisialisasi Queue
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Menambahkan elemen ke dalam antrian
    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
            System.out.println("Enqueued: " + element);
        }
    }

    // Menghapus elemen dari antrian
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int dequeuedElement = queue[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println("Dequeued: " + dequeuedElement);
            return dequeuedElement;
        }
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Mengembalikan ukuran antrian
    public int size() {
        return size;
    }

    // Mengambil elemen paling depan tanpa menghapusnya
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return queue[front];
        }
    }

    // Menampilkan semua elemen dalam antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
}
