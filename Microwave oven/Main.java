#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  float t1;
  cin>>x>>t1;
  float tr;
  if(x==2)
  {  
  tr=t1+t1/2.00;
  cout<<tr;
  }
  else if(x==3)
  {
    tr=t1+t1;
    cout<<tr;
  }
  else
    cout<<"Number of items is more";
  }