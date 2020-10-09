#include<iostream>
using namespace std;
int main()
{
  int n,i,temp=0;
  cin>>n;
  int arr[n];
  for( i=0;i<n;i++)
    cin>>arr[i];
  int max=arr[0];
  for(i=0;i<n;i++)
  {
    if(max<arr[i])
    {
      max=arr[i];    
    }
  }
  cout<<max;
}