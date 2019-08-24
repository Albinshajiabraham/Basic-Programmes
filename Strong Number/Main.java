#include <stdio.h>
int main()
{
  int n,sum,v=0;
  scanf("%d",&n);
  int c=n;
  while(n>0)
  {
    int b=n%10;
    sum=1;
    for(int i=1;i<=b;i++)
    {
      sum=sum*i;
    }
    v=v+sum;
    n=n/10;
  }
  if(c==v)
    printf("Yes");
  else
   printf("No"); 
  return 0;
}