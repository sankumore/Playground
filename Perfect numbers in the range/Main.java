#include<iostream>
using namespace std;
int main ()
{  
    int num1,num2,div=0,count=0,sum=0;
  
    cin>>num1>>num2;
  for(int j=num1;j<=num2;j++)
  {
    for (int i=1; i <j; i++)
    {
        div = j % i;
        if (div == 0)
            sum = sum + i;
      
    }
  if(j==sum)
  {
    cout<<sum<<" ";
  }
    sum=0;
 }
  
}