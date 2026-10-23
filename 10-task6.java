import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> items = new LinkedHashSet<>();

        for (int i = 0; i < n; i++)
            items.add(sc.next());

        for (String item : items)
            System.out.println(item);

        sc.close();
    }
}