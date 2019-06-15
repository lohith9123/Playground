#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n>1 && n<5)
  {
    if(n==2)
    printf("Two");
    if(n==3)
    printf("Three");
    if(n==4)
    printf("Four");
    
  }
  else
    printf("Invalid");
  return 0;
}