import java.util.*;
public class Main{
    public static void sortarray(int nums[]){
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        
        while(mid<=high){
            switch(nums[mid]){
                case 0:{
                    swap(low,mid,nums);
                    
                    mid++;
                    low++;
                    break;
                    
            }
            case 1:{
                mid++;
               break;
            }
            case 2:{
                swap(mid,high,nums);
                high--;
                break;
            }
        }
    }
}
public static void swap(int x,int y,int nums[]){
    int temp=nums[x];
    nums[x]=nums[y];
    nums[y]=temp;
}
public static void main(String args[]){
    
  int nums[]={1,0,0,2,1,0,1,2};
  sortarray(nums);
    for(int i: nums){
        System.out.print(i);
    }
}}