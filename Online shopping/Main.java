#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,aa,ad,as,sa,sd,ss;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int f,a,s;
  int temp=0;
   temp=fa*fd/100.00;
 
  f=fa-temp+fs;
  int temp2=ad/100.00*aa;
  a=aa-temp2+as;
  int temp3=sd/100.00*sa;
  s=sa-temp3+ss;
  cout<<"In Flipkart Rs."<<f;
  cout<<"\nIn Snapdeal Rs."<<s;
  cout<<"\nIn Amazon Rs."<<a;
  if(f<=s && f<=a)
    cout<<"\nHe will prefer Flipkart";
  else if(s<=f && s<=a)
     cout<<"\nHe will prefer Snapdeal";
  else
     cout<<"\nHe will prefer Amazon";
}