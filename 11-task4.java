import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] marks = new double[n];
        TreeSet<Double> grades = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            marks[i] = sc.nextDouble();
            grades.add(marks[i]);
        }

        grades.pollFirst();
        double second = grades.first();

        TreeSet<String> result = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (marks[i] == second)
                result.add(names[i]);
        }

        for (String name : result)
            System.out.println(name);
    }
}