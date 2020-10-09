#include<iostream>
using namespace std;
int main()
{
  int n,i,s;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  cin>>s;
  for(i=0;i<n;i++)
  {
    if(arr[i]==s)
    {  cout<<"She passed her exam";
      return 0;
    }    
  }
  
  cout<<"She failed";
}