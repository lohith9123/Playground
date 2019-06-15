#include<stdio.h>
int main()
{
  int n,a,b,c,d,e,f;
  scanf("%d",&n);
  if(n>0)
  {
    a = n / 10;
    b = n % 10;
    e = a + b;
    c = e / 10;
    d = e % 10;
    f = c + d;
    printf("%d",f);
    return 0;
  }
}
    