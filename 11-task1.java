import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int candidate = 0, count = 0;

        for (int x : a) {
            if (count == 0)
                candidate = x;

            count += (x == candidate) ? 1 : -1;
        }

        System.out.println(candidate);
    }
}