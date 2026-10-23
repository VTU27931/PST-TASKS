import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> a = new LinkedHashSet<>();

        for (int i = 0; i < n; i++)
            a.add(sc.next());

        int m = sc.nextInt();
        Set<String> b = new LinkedHashSet<>();

        for (int i = 0; i < m; i++)
            b.add(sc.next());

        a.retainAll(b);
        System.out.println(a);

        sc.close();
    }
}