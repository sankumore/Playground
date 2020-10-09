#include<iostream>
using namespace std;
int main()
{
int max,a,c;
  cin>>max>>a>>c;
  int temp;
  temp=(75*a)+(30*c)+75;
  
  if(max<temp)
  {
    cout<<"Boat will drow";
  }
  if(max>temp)
  {
    cout<<"Boat is stable";
  }
}