#include<stdio.h>
int main()
{
  int n,i,j,k,f=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  for(j=0;j<n-1;j++)
  {
    for(int c=j+1;c<n;c++)
    {
      if(k==(arr[j]+arr[c]))
      {
        printf("Perfect couple: %d %d",arr[j],arr[c]);
        f=1;
        break;
      }
    }
  }
  if(f==0)
  {
   printf("No perfect couple found!");
  }
  return 0;
}
