#include<stdio.h>
int main() 
{  
  int x;
  for(x=1; x<=6; x++)
  {
    if(x < 7)
      printf("CTS \n");
    else
      break;
  } 
  return 0;  
}

