#include<stdio.h>
int main()
{
int i,j,a[5][5],r,c;
  scanf("%d",&r);
  scanf("%d",&c);
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  int k;
        for(k= 0; k< c; k++)
        {
              for(i = 0, j = k; j < c ; i++, j++)
            printf("%d ", a[i][j]);
        }
	return 0;
}