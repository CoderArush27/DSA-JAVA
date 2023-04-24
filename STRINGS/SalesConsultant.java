import java.util.*;

public class SalesConsultant {
    // binary search for the latest non-overlapping call
private static int binarySearch(int[][] calls, int i) {
    int lo = 0, hi = i - 1;
    while (lo <= hi) {
        int mid = (lo + hi) / 2;
        if (calls[mid][1] <= calls[i][0]) {
            if (calls[mid + 1][1] <= calls[i][0]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        } else {
            hi = mid - 1;
        }
    }
    return -1; // no non-overlapping call found
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt(); // number of calls scheduled
int[][] calls = new int[n][3]; // start time, end time, and value
for (int i = 1; i < n; i++) {
calls[i][0] = scanner.nextInt(); // start time
calls[i][1] = scanner.nextInt(); // end time
calls[i][2] = scanner.nextInt(); // value
}
Arrays.sort(calls, (a, b) -> a[1] - b[1]); // sort calls by end time
int[] dp = new int[n]; // dp[i] is the maximum value achievable up to the ith call
dp[0] = calls[0][2]; // base case
for (int i = 0; i < n; i++) {
int j = binarySearch(calls, i); // find the latest non-overlapping call
dp[i] = Math.max(dp[i - 1], dp[j] + calls[i][2]); // take the max value
}
System.out.println(dp[n - 1]); // the maximum value achievable up to the last call
}
}