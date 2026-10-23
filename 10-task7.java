import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeSet<Integer> marks = new TreeSet<>();

        for (int i = 0; i < n; i++)
            marks.add(sc.nextInt());

        for (int mark : marks)
            System.out.print(mark + " ");

        sc.close();
    }
}