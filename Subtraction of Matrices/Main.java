#include<stdio.h>
int main()
{
 int i,j,a,b,arr[5][5],brr[5][5],crr[5][5];
  scanf("%d",&a);
  scanf("%d",&b);
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      scanf("%d",&arr[i][j]);
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      scanf("%d",&brr[i][j]);
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      crr[i][j]=arr[i][j]-brr[i][j];
    }
  }
   for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      printf("%d ",crr[i][j]);
    }
     printf("\n");
  }
  return 0;
}