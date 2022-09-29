import java.util.*;
public class Main{
  public static void selectionsort(int arr[]){
      int n=arr.length;
      for(int i=0;i<n-1;i++){
          int min=arr[i];
          int index=i;
          for(int j=i+1;j<n-1;j++){
              if(arr[j]<min){
                  min=arr[j];
                  swap(index,j,arr);
                  
              }
          }
      }
  }
      public static void swap(int x,int y,int arr[]){
          int temp=arr[x];
          arr[x]=arr[y];
          arr[y]=temp;
      }
  
    public static void main(String args[]){
        int arr[]={8,2,1,4,9,7};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}