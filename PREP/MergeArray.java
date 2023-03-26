public class MergeArray {
    public int[] merge(int a[],int b[]){
        int l1 = a.length;
        int l2 = b.length;

        int c[]=new int[l1+l2];
        int k=0;
        int i=0;
        int j=0;
        while(i<l1 && j<l2){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<l1)
            c[k++]=a[i++];
        
        while(j<l2)
            c[k++]=a[j++];

        return c;
    }
    public void print(int a[]){
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        MergeArray m = new MergeArray();
        int a[]={10,21,31,41,51};
        int b[]={2,10,18,29,45};

        int d[]= m.merge(a, b);
        m.print(d);

    }
}
