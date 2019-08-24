#include <stdio.h>
int main() 
{
  int n,count=0,sum=0;
  scanf("%d",&n);
   int v=n;
  int d=n;
  while(n>0)
  {
    int b=n%10;
    count=count+1;
    n=n/10;
  }
  while(v>0)
  {
    int c=v%10;
    sum=sum+pow(c,count);
    v=v/10;
  }
  if(d==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
   return 0;
}