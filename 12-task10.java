import java.util.*;

class Main {
    static class Product {
        String name;
        int stock;
        double price;

        Product(String name, int stock, double price) {
            this.name = name;
            this.stock = stock;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Product> products = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int stock = sc.nextInt();
            double price = sc.nextDouble();

            products.put(id, new Product(name, stock, price));
        }

        int sales = sc.nextInt();

        for (int i = 0; i < sales; i++) {
            int id = sc.nextInt();
            int qty = sc.nextInt();

            if (products.containsKey(id)) {
                Product p = products.get(id);

                if (qty > 0 && qty <= p.stock)
                    p.stock -= qty;
            }
        }

        int threshold = sc.nextInt();

        List<Map.Entry<Integer, Product>> list =
            new ArrayList<>(products.entrySet());

        list.sort((a, b) -> {
            int c = Integer.compare(a.getValue().stock,
                                    b.getValue().stock);
            return c != 0 ? c :
                Integer.compare(a.getKey(), b.getKey());
        });

        for (Map.Entry<Integer, Product> e : list) {
            Product p = e.getValue();

            if (p.stock < threshold)
                System.out.println(e.getKey() + " " +
                    p.name + " " + p.stock);
        }
    }
}