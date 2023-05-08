import java.util.ArrayList;

public class ContainerWithMostWater {
    //brute force
    public static int totalWater(ArrayList <Integer> height){
        int n = height.size();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int width = j-i;
                int h = Math.min(height.get(i),height.get(j));
                int water = h*width;
                max = Math.max(max,water);
            }
        }
        return max;
    }

    //two pointer approach
    public static int totalWater1(ArrayList<Integer> height){
        int max = Integer.MIN_VALUE;
        int LP = 0;
        int RP = height.size()-1;

        while(LP<RP){
            int width = RP - LP;
            int h = Math.min(height.get(LP),height.get(RP));
            int water = h*width;
            max = Math.max(max,water);
            
            if(height.get(LP)<height.get(RP))
                LP++;
            else
                RP--;
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("BRUTE FORCE = "+totalWater(height));
        System.out.println("TWO POINTER = "+totalWater1(height));
    }
}
