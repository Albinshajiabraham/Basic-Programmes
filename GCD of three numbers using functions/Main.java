#include <stdio.h>
int greatest(int num1,int num2);
int main() 
{
  int a,b,c,d;
  scanf("%d",&a);
   scanf("%d",&b);
   scanf("%d",&c);
  d=greatest(a,b);
  printf("%d",greatest(c,d));
  return 0;
}
         
int greatest(int num1,int num2)
{
  int e;
if(num1>num2)
  {
    e=num2;
  }
    else
    {
      e=num1;
    }
  while(e>=1)
  {
     if((num1%e==0)&&(num2%e==0))
     {
       return e;
       break;
     }
    e--;
  }
}