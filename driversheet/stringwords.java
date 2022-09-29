import java.util.*;
public class Main{
    public static void main(String args[]){
        String s="god good morning";
        Stringreverse(s);
    }
    public static  void Stringreverse(String s){
        String split[]=s.split(" ");//splitting string using delimiter
        for(int i=0;i<split.length;i++){
            split[i]=reverse(split[i]);
            
        }
        String res=String.join(" ",split); // concatinating string words into string using delimiter 
        System.out.print(res);
        
        }
        public static String reverse(String x){
            char charray[]=x.toCharArray(); // converting stirng to charray 
            int p1=0;
            int p2=x.length()-1;
            while(p1<p2){
                char temp=charray[p1];
                charray[p1]=charray[p2];
                charray[p2]=temp;
                p1++;
                p2--;
            }
            String t=new String(charray);// converting charray to String
            return t;
            
        }
        
       
    }

