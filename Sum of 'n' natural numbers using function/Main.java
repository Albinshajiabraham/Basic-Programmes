#include<stdio.h>
int sum(int num);

int main() 
{
  int n;
  scanf("%d",&n);
  printf("%d",sum(n));
  return 0;
}
int sum(int num)
{
  int s=0;
  for(int i=1;i<=num;i++)
  {
    s=s+i;
  }
  return s;
}