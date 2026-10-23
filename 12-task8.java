import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int k = sc.nextInt();
        List<String> words = new ArrayList<>(map.keySet());

        words.sort((a, b) -> {
            int c = map.get(b) - map.get(a);
            return c != 0 ? c : a.compareTo(b);
        });

        for (int i = 0; i < Math.min(k, words.size()); i++)
            System.out.println(words.get(i));
    }
}