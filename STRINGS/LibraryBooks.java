import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxBookCount = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int start = 0;
        for (int i = 0; i < n; i++) {
            sum += prices[i];
            if (i >= maxBookCount - 1) {
                if (sum < minSum) {
                    minSum = sum;
                    start = i - maxBookCount + 1;
                }
                sum -= prices[i - maxBookCount + 1];
            }
        }
        System.out.println(start);
        System.out.println(start + maxBookCount - 1);
    }
}
