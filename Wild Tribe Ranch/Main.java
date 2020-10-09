#include<iostream>
using namespace std;
int main()
{
  int wt,fl;
  cin>>wt;
  cin>>fl;
  if(wt<fl)
    cout<<"Sorry, you can't enter";
  else if(wt==fl)
    cout<<"Yes, you can enter. Kindly use a rope.";
    else
      cout<<"Yes, you can enter.";
}