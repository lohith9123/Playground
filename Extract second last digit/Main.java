#include<stdio.h>
int main()
{
  int n,a;
  scanf("%d",&n);
  n = n % 100;
  a = n / 10;
  printf("%d",a);
  return 0;
}