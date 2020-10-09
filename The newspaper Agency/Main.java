#include<iostream>
using namespace std;
int main()
{
  int sold,cperc,ctoa;
  cin>>sold>>cperc>>ctoa;
  int total=(sold*cperc)-(sold*ctoa)-100;
  cout<<total;
}