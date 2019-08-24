#include<stdio.h>
int main()
{
    int n,c,r2;
    scanf("%d", &n);
  int r1 = n % 10;
  
    while(n>= 1)
    {
        r2 = n % 10;
        n = n / 10;
    } 
     c=r1+r2;
  printf("%d",c);
  return 0;
}