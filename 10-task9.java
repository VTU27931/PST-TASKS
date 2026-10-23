import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> marks = new HashMap<>();

        for (int i = 0; i < n; i++)
            marks.put(sc.nextInt(), sc.nextInt());

        int roll = sc.nextInt();

        if (marks.containsKey(roll))
            System.out.println(marks.get(roll));
        else
            System.out.println("Student Not Found");

        sc.close();
    }
}