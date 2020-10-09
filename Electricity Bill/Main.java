#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x;
  float rs;
  cin>>x;
  if(x<=200)
    rs=floor(x*0.50);
  else if(x<=400)
    rs=100.00+float(x)*0.65;
  else if(x<=600)
    rs=200.00+0.808*float(x);
  else
    rs=425.00+float(x)*1.25;
  cout<<"Rs."<<rs;
}