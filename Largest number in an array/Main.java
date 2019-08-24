#include<stdio.h>
#include<stdio.h>
 int main()
 {
  int n;
  scanf("%d \n", &n);
  int arr[n];
  for(int i= 0; i <= n - 1; i++)
   {
    scanf("%d",&arr[i]);
   }
   int max=0;
   for(int i=0;i<=n-1;i++)
   {
     if(arr[0]>arr[1])
     {
       max=arr[0];
     }
     else
     {
      max=arr[1];
     }
   }
   for(int i=2;i<=n-1;i++)
   {
     if(max<arr[i])
     {
       max=arr[i];
     }
   }
   printf("%d",max);
   return 0;
 }






