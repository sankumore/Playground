#include<iostream>
using namespace std;
int main()
{
int age;
  float time;
  float a1=8.00;
  float c1=4.00;
  cin>>age;
  cin>>time;
  float x=13.3;
  if(time==x)
  {
     float a1=5.00;
  float c1=2.00;
    if(age>13)
    {
         cout << fixed;
   cout.precision(2);
      cout<<"$"<<a1;
    }
    else
    {
      cout << fixed;
   cout.precision(2);
      cout<<"$"<<c1;
  }
  }
  else
  {
   if(age>13)
   {
        cout << fixed;
   cout.precision(2);
      cout<<"$"<<a1;
   }
    else
    {
         cout << fixed;
   cout.precision(2);
      cout<<"$"<<c1;
    }
  }
}