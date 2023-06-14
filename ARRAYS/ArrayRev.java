public class ArrayRev {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static boolean linearSearch(int arr[],int key){
        for(int x:arr){
            if(x==key)
                return true;
        }
        return false;
    }
    public static boolean binarySearch(int arr[],int key,int si,int ei){
        //always performed on a sorted array
        while(si<ei){
        int mid = (si+ei)/2;
        if(arr[mid]==key)
            return true;

        else if(arr[mid]>key)
        ei = mid-1;

        else
        si = mid+1;
        }
    return false;
    }

    //sorting
    public static void bubbleSort(int arr[]){
        //biggest element is placed at a correct position
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        //smallest element is arranged first
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            //find the minimum value
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            int cur = arr[i];
            int prev  = i-1;
            
            while(prev>=0 && (arr[prev] > cur)){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }

    public static void countingSort(int arr[]){
        //for largest positive amd negative
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max,arr[i]);
        }
        //creating array largest and smallest
        int arrPos[] = new int[max+1];
        int arrNeg[] = new int[min*(-1)+1];

        //iterating
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int idx = arr[i]*-1;
                arrNeg[idx]++;
            }
            else{
                arrPos[arr[i]]++;
            }
        }
        //printing
        int j=0;
        //negative
        for(int i=arrNeg.length-1;i>0;i--){
            while(arrNeg[i]>0){
                arr[j++]=i*(-1);
                arrNeg[i]--;
            }
        }
        //positive
        for(int i=0;i<arrPos.length;i++){
            while(arrPos[i]>0){
                arr[j++]=i;
                arrPos[i]--;
            }
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei)
        return;

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i];
                i++;
            }
            else{
                temp[k++]=arr[j];
                j++;
            }
        }
        while(i<=mid)
        temp[k++]=arr[i++];

        while(j<=ei)
        temp[k++]=arr[j++];

        for(int s=0,t=si;s<temp.length;s++,t++){
            arr[t]=temp[s];
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int arr1[]={3,6,9,1,2,7};
        int arr2[]={3,6,9,1,2,7};
        int arr3[]={12,11,5,13,6};
        int arr4[]={3,2,1,5,1,6,7,1,1,-2,-2,-3,6,9,5,8,0,0,0};
        int arr5[]={1,80,9,5,10,6,10,98,17,27};
        int n = arr.length;
        System.out.println(binarySearch(arr, 80, 0, n-1));
        System.out.println(linearSearch(arr, 50));

        //sorting
        bubbleSort(arr1);
        print(arr1);
        selectionSort(arr2);
        print(arr2);

        insertionSort(arr3);
        print(arr3);

        countingSort(arr4);
        print(arr4);

        mergeSort(arr5, 0, arr5.length-1);
        print(arr5);
    }
}
