import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();

        while (q-- > 0) {
            int op = sc.nextInt();
            int x = sc.nextInt();

            if (op == 1) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            } else if (op == 2) {
                if (freq.getOrDefault(x, 0) > 0)
                    freq.put(x, freq.get(x) - 1);
            } else if (op == 3) {
                int found = 0;

                for (int count : freq.values()) {
                    if (count == x && x > 0) {
                        found = 1;
                        break;
                    }
                }

                System.out.println(found);
            }
        }
    }
}