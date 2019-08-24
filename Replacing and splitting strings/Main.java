import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      String str = sc.nextLine();
      String strr = sc.nextLine();
      int n=sc.nextInt();
      String str1=str.replace(str,strr);
      String [] arr=str1.split(" ",n);
      for(String s:arr)
      {
          System.out.println(s);
      }
      
    }
}