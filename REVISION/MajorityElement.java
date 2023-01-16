// an element that appears for more than n/2 times is known as majoirty element
public class MajorityElement {
    public static int majorityEle(int arr[]){
        int count=0;
        int mE=0;
        
        for(int x:arr){
            if(count==0)
                mE=x; 
            
            if(mE==x)
                count++;
            else
                count--;    
     }
     return mE;
}
    public static void main(String[] args) {
        int arr[]={-1,2,-2,-2,-3,-5,6,7,-2,-2,-2,-2};
        System.out.println(majorityEle(arr));
    }
    
}
