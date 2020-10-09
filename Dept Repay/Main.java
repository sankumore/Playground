#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,n;
  float i,a,d,fs;
  cin>>p>>r>>n;
  i=n*p*r/100;
  a=p+i;
  d=0.02*i;
  fs=a-d;
  cout<<i<<"\n";
  cout<<a<<"\n";
  cout<<d<<"\n";
  cout<<fs;
}