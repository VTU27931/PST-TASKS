import java.util.*;

class Main {
    static class Node {
        String song;
        Node next;

        Node(String song) {
            this.song = song;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.next());

            if (head == null)
                head = node;
            else
                tail.next = node;

            tail = node;
        }

        String remove = sc.next();
        Node dummy = new Node("");
        dummy.next = head;
        Node p = dummy;

        while (p.next != null) {
            if (p.next.song.equals(remove)) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }

        for (Node x = dummy.next; x != null; x = x.next)
            System.out.print(x.song + " ");

        sc.close();
    }
}