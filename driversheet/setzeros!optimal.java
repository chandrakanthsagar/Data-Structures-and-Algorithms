import java.util.*;
public class Main{
    public static void setzeros(int[][] nums){
        int rows[]=new int[nums.length];
        int cols[]=new int[nums[0].length];
        Arrays.fill(rows,-1);
        Arrays.fill(cols,-1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==0){
                    rows[i]=0;
                    cols[i]=0;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(rows[i]==0 || cols[j]==0){
                    nums[i][j]=0;
                }
            }
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