import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, String> contacts = new HashMap<>();

        for (int i = 0; i < n; i++)
            contacts.put(sc.next(), sc.next());

        String operation = sc.next();
        String name = sc.next();

        if (operation.equalsIgnoreCase("search")) {
            System.out.println(
                contacts.getOrDefault(name, "Contact Not Found")
            );
        } else if (operation.equalsIgnoreCase("update")) {
            String phone = sc.next();

            if (contacts.containsKey(name)) {
                contacts.put(name, phone);
                System.out.println("Updated");
            } else {
                System.out.println("Contact Not Found");
            }
        }

        sc.close();
    }
}