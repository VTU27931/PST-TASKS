import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        while (sc.hasNextInt())
            marks.add(sc.nextInt());

        System.out.println(marks);
        sc.close();
    }
}