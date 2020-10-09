#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x1,y1,x2,y2;
  cin>>x1>>y1;
  int tot=(3-x1)*(3-x1)+(4-y1)*(4-y1);
  int san=sqrt(tot);
  cout<<san;
}