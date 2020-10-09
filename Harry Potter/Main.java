#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  int x,y;
  cin>>n;
  x=n%10;
  y=n/1000;
  int ans=x+y;
  cout<<ans;
}