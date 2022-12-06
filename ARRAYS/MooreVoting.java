public class MooreVoting {
    //finding the majority element a majority element is the one whic appears more than n/2 times
    public static int Moore(int nums[]){
        int candidate=0;int votes=0;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(votes==0){
                candidate = x;
            }

            if(candidate==x)
                votes++;
            
            else
                votes--;
        }
        return candidate;
    }
    public static void main(String[] args) {
    
        int arr[]={4,6,6
            
            ,6,6,7,7};
        System.out.println(Moore(arr));
    }
}
