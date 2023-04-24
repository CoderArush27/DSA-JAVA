import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Call> calls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int value = scanner.nextInt();
            calls.add(new Call(start, end, value));
        }
        Collections.sort(calls, Comparator.comparingInt(Call::getEnd));
        int[] dp = new int[n];
        dp[0] = calls.get(0).getValue();
        for (int i = 1; i < n; i++) {
            int j = binarySearch(calls, i);
            int prev = j == -1 ? 0 : dp[j];
            dp[i] = Math.max(dp[i-1], prev + calls.get(i).getValue());
        }
        System.out.println(dp[n-1]);
    }
    
    private static int binarySearch(List<Call> calls, int i) {
        int low = 0;
        int high = i - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (calls.get(mid).getEnd() <= calls.get(i).getStart()) {
                if (calls.get(mid+1).getEnd() <= calls.get(i).getStart()) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    private static class Call {
        private final int start;
        private final int end;
        private final int value;
        
        public Call(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }
        
        public int getStart() {
            return start;
        }
        
        public int getEnd() {
            return end;
        }
        
        public int getValue() {
            return value;
        }
    }
}
