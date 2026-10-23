import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, String> products = new HashMap<>();
        PriorityQueue<Integer> orders = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            products.put(id, name);
            orders.add(id);
        }

        int searchId = sc.nextInt();
        System.out.println(products.getOrDefault(searchId, "Not Found"));

        while (!orders.isEmpty())
            System.out.println(orders.poll());

        sc.close();
    }
}