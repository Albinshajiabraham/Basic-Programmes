import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n = sc . nextInt(),b;
    switch(n)
    {
        case 1:
            int a = sc . nextInt();
            System.out.println(a*a);
            break;
        case 2:
            b = sc . nextInt();
            int c = sc . nextInt();
            System.out.println((b*c));
            break;    
        case 3:
            int d = sc . nextInt();
            b = sc . nextInt();
            System.out.println((b*d)/2);
            break;
        case 4:
            int e = sc . nextInt();
            System.out.println(3.14*e*e);
            break;    
    }
    
    }
}