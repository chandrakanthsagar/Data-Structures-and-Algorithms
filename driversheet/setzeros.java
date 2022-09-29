import java.util.*;
public class Main{
    public static void setzeros(int[][] nums){
        int col0=1;
        int rows=nums.length;
        int cols=nums[0].length;
        for(int i=0;i<rows;i++){
            if(nums[i][0]==0)
                  col0=0;
            for(int j=0;j<cols;j++){
                if(nums[i][j]==0)
                   {
                       nums[i][0]=0;
                       nums[0][j]=0;
                   }
            }
        }
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(nums[i][0]==0 || nums[0][j]==0){
                    nums[i][j]=0;
                    
                }
            }
                if(col0==0);
                     nums[i][0]=0;
            
        }
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
        
    }
    setzeros(a);
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
        
    }
    
    
}
}