import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[6];

        for (int i = 0; i < n; i++)
            freq[sc.nextInt()]++;

        int max = 0, bird = 1;

        for (int i = 1; i <= 5; i++) {
            if (freq[i] > max) {
                max = freq[i];
                bird = i;
            }
        }

        System.out.println(bird);
    }
}