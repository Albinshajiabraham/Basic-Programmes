#include<stdio.h>
int main()
{
int n,i,j,c;
scanf("%d",&n);
  int arr[n];
for(i=0;i<n;i++)
{
  scanf("%d",&arr[i]);
}
for(i=0;i<n-1;i++)
{
  for(j=i+1;j<n;j++)
  {
    for(c=j+1;c<n;c++)
    {
      printf("(%d, %d, %d) ",arr[i],arr[j],arr[c]);
    }
  }
printf("\n");
}
  return 0;
}
