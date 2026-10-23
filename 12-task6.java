import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

            if (i >= k) {
                int old = a[i - k];
                map.put(old, map.get(old) - 1);

                if (map.get(old) == 0)
                    map.remove(old);
            }

            if (i >= k - 1)
                max = Math.max(max, map.size());
        }

        System.out.println(max);
    }
}