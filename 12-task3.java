import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((x, y) -> {
            int c = map.get(y) - map.get(x);
            return c != 0 ? c : Integer.compare(x, y);
        });

        for (int i = 0; i < Math.min(k, list.size()); i++)
            System.out.print(list.get(i) + " ");
    }
}