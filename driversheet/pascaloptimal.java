import java.util.*;
public class Main{
    public static ArrayList<ArrayList<Integer>> pascal(int n){
        ArrayList<ArrayList<Integer>> k=new ArrayList<>();
        ArrayList<Integer> row=null;
        for(int i=0;i<n;i++){
            ArrayList<Integer> pre=new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    pre.add(1);
                }
                else{
                    pre.add(row.get(j-1)+row.get(j));
                }
            }
            row=pre;
            k.add(pre);
        }
        return k;
    }
    public static void main(String args[]){
        int n=5;
        ArrayList<ArrayList<Integer>> k=null;
        k=pascal(n);
        for(ArrayList<Integer> i: k){
            System.out.print(i);
        }
    }
}