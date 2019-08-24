#include<stdio.h>
int power(int num1, int num2);
int main(){
    int a, b;
    scanf("%d%d", &a, &b);
    printf("%d", power(a,b));
  	return 0;
}

int power(int num1, int num2)
{
    int d = 1;
    while(num2 >= 1)
    {
        d = d * num1;
        num2--;
    }
    return d;
}
