import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc. nextInt();
      int c=1;
      int v=0;
      int u=a;
      while(b!=1)
      {
        v=u*a;
        b--;
        u=v;
        v=0;
        //c++;
      }
      System.out.println(u);
    }
}