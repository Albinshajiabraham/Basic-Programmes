#include<stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    while(n != 0)
    {
        int r = n % 10;
        n = n / 10;
      if(n>1&&n<10)
        printf("%d",r );
      }
  return 0;
}