import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      int n = sc . nextInt();
      for(int i=n;i>0;i--)
      {
        for(int j=n;j>0;j--)
        {
          if(i<=j)
          {
            System.out.print(j);
          }
          else
          {
            System.out.print(i);
          }
        }
        System.out.println();
      }
    }
}