import java.util.*;
public class Main{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                    flag=true;
                }
            }
            if(flag=false)
                break;
        }
    }
    public static void swap(int x,int y,int arr[]){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String args[]){
        int arr[]={8,2,1,4,9,7};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}