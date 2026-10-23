import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++)
            marks.add(sc.nextInt());

        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + Collections.max(marks));

        double avg = marks.stream()
                          .mapToInt(Integer::intValue)
                          .average().orElse(0);

        System.out.printf("Average: %.2f%n", avg);
        sc.close();
    }
}