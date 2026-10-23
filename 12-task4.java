import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] a = s.toCharArray();
            Arrays.sort(a);

            String key = new String(a);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        for (List<String> group : map.values())
            System.out.println(group);
    }
}