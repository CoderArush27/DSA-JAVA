public class TrapperRainWater {
    public static int trapperWater(int height[]){
        int n = height.length;
        if(n<2){
            return 0;
        }
        
        int tWater;
        int wLevel;
        int width=1;
        int trapped=0;
        //calculate left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        //caluculate water level and trapper water
        for(int i=0;i<n;i++){
            tWater=0;
            wLevel = Math.min(leftMax[i],rightMax[i]);
            tWater = (wLevel-height[i])*width;
            if(tWater>0){
                trapped = trapped+tWater;
            }
        }
        return trapped;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapperWater(height));
    }
}
