import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            first.putIfAbsent(a[i], i);
            last.put(a[i], i);
        }

        int degree = 0, ans = n;

        for (int x : freq.keySet())
            degree = Math.max(degree, freq.get(x));

        for (int x : freq.keySet()) {
            if (freq.get(x) == degree)
                ans = Math.min(ans, last.get(x) - first.get(x) + 1);
        }

        System.out.println(ans);
    }
}