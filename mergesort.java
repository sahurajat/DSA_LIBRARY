//wap to perform the merge sort
public class one
{
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei)
    {
        //base case
        if(si >= ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int  ei )
    {
        //left(0,3)=4  right(4,6)=3  ->6-0+1=7
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temporary array
        while(i<=mid && j<=ei)
        {
            if(arr[i] < arr[j])
            {
                temp[k]=arr[i];
                i++;k++;
            }
            else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        //when the one element in the left side
        while(i<=mid)
        {
            temp[k]=arr[i];
            k++;
            i++;
        }
         //when the one element in the right side
        while(j<=ei)
        {
          temp[k]=arr[j];
            k++;
            j++;
            //temp[k++]=arr[j++];

        }
        //copy the temporary into original array
        for(k=0,i=si ;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }

    }
    public static void main(String[]args)
    {
       int arr[]={6,3,9,5,2,8};
       mergeSort(arr, 0,arr.length-1);
       printArray(arr);
    }
}
