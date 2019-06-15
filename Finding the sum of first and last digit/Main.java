#include <stdio.h>
int main() {
	int n,l,f;
  scanf("%d",&n);
  f=n;
   while(f>=10)
   {
     f=f/10;
   }
    
  l=n%10;
  int s=l+f;
  printf("%d",s);
	return 0;
}