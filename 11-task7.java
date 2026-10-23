import java.util.*;

class Main {
    static void preorder(int[] a, int i) {
        if (i >= a.length || a[i] == -1)
            return;

        System.out.print(a[i] + " ");
        preorder(a, 2 * i + 1);
        preorder(a, 2 * i + 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        preorder(a, 0);
    }
}