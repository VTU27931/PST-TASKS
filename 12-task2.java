import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            String s = sc.next();
            System.out.println(map.getOrDefault(s, 0));
        }
    }
}