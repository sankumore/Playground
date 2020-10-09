#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  int fact=1;
  cin>>n;
  if(n==0 || n==1)
    cout<<n;
  else
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
  cout<<fact;
}