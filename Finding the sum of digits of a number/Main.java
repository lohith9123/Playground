#include <stdio.h>
int main() {
	int a,s=0,n;
  scanf("%d",&n);
  while(n != 0)
  {
    a = n %10;
    s=s+a;
    n=n/10;
  }
  printf("%d",s);
	return 0;
}