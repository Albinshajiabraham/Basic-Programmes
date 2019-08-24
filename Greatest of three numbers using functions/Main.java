#include <stdio.h>
int largest(int num1,int num2);
int main()
{
int a,b,c;
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);
  int d=largest(a,b);
  if(c>d)
  {
    printf("%d",c);
  }
  else
  {
    printf("%d",d);
  }
  return 0;
}
int largest(int num1,int num2)
{
  if(num1>num2)
  {
    return num1;
  }
  else
  {
    return num2;
  }
}
