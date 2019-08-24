#include<stdio.h>
 int main()
 {
  int n,i;
  scanf("%d \n", &n);
  int arr[n];
  for(i= 0; i <= n - 1; i++)
   {
    scanf("%d",&arr[i]);
   }
  int s1,s2,max=0,flag1=1,flag2=1;
  scanf("%d", &s1);
  scanf("%d", &s2);
  for( i=0;i<=n-1;i++)
   {
     if(s1== arr[i])
       {
        flag1=0;
       printf("%d",i);
        break;
       }
  }
    for( i=0;i<=n-1;i++)
   {
     if(s2== arr[i])
    {
      flag2=0;
      printf("\n%d",i);
      break;
    }
    }
   if(flag1!=0)
    {
      printf("\n-1");
    }
     if(flag2!=0)
    {
      printf("\n-1");
    }
}
 
