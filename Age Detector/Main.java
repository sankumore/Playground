#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,age;
  cin>>by>>cy;
  

  if(cy<by)
  {
     age=100-by+cy;
    cout<<age;
   
  }
  else 
  {
    cout<<cy-by;
  }
    
  
}