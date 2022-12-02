import java.util.Scanner;
public class Main{
    public static void main(String []args){
      Scanner s = new Scanner (System.in);
      System.out.println("please enter number to find out if it is divisble by 3:");
      int num=s.nextInt();
      System.out.println(by3(num));
      s.close();
      
    }
   public static boolean by3(int num){
      int sum=0;
      do{
        sum+=num%10;
        num=num/10;
        
      } while (num>0);
      System.out.println(sum);
      return (sum%3==0);
      
   }
