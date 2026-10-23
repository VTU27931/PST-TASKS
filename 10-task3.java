import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<String> history = new Stack<>();

        for (int i = 0; i < n; i++)
            history.push(sc.next());

        int back = sc.nextInt();

        while (back-- > 0 && !history.empty())
            history.pop();

        if (history.empty())
            System.out.println("No History");
        else
            System.out.println(history.peek());

        sc.close();
    }
}