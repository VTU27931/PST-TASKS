import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, String> names = new HashMap<>();
        Map<Integer, Integer> marks = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int mark = sc.nextInt();

            names.put(id, name);
            marks.put(id, mark);
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int id = sc.nextInt();

            if (names.containsKey(id))
                System.out.println(names.get(id) + " " + marks.get(id));
            else
                System.out.println("Student Not Found");
        }
    }
}