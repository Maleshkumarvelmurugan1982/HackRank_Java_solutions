import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                int ls = 15-s1.length();
                for(int j=0;j<ls;j++){
                    System.out.print(" "); 
                }
                String number= "";
                if(x < 10){
                    number="00"+x;
                }
                else if(x<100){
                    number="0"+x;
                }
                else{
                    number=""+x;
                }
                System.out.println(number);
            }
            System.out.println("================================");

    }
}



