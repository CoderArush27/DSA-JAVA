
public class SortingArray {
    public void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
    }

    public void SelectionSort(int arr[]){
        int minIdx = 0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            minIdx = i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[minIdx])
                    minIdx = j;
            }     
                int a = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = a;    
    }
}

public void insertionSort(int arr[]){
    int n = arr.length;
    for(int i=1;i<n;i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){      //find right position
            arr[j+1]=arr[j];
            j=j-1;                                                  
        }
        arr[j+1]=key;  //inserting key at a right position
    }
    }

public void countingSort(int arr[]){
    int max = Integer.MIN_VALUE;
    int n = arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]>max)
            max = arr[i];
    }
    int count[]=new int[max+1];

    for(int i=0;i<max+1;i++){
        count[arr[i]]++;
    }

    int j=0;
    for(int i=0;i<max+1;i++){
        while(count[i]>0){
           arr[j]=i;
           j++;
           count[i]--;
        }
    }
}

   public static void main(String[] args) {
    SortingArray s = new SortingArray();
    int arr[] = {5,4,3,2,1};
    int arr1[] = {6,1,3,4,8,2};
    int arr2[] = {12,11,13,5,6};
    int arr3[]={1,2,3,1,2,3,4,5,5,6};

    s.BubbleSort(arr);
    s.print(arr);

    s.SelectionSort(arr1);
    s.print(arr1);

    s.insertionSort(arr2);
    s.print(arr2);

    s.countingSort(arr3);
    s.print(arr3);
   } 
}
