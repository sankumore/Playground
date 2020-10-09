/*#include<iostream>
using namespace std;
int main()
{
  int num1,num2,num,div;
  int sum=0;
  cin>>num1>>num2;
  num=num1+num2;
    for (int i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
if(num==sum)
{
  cout<<"They can read the message";
}
else
{
  cout<"They can't read the message";
}
}*/
#include<iostream>
using namespace std;
int main ()
{  
    int i, num,num2, div, sum1=0;
   
    cin >> num>>num2;
  int sum=num+num2;
    for (i=1; i <sum; i++)
    {
        div = sum % i;
        if (div == 0)
            sum1 = sum1 + i;
    }
    if (sum1==sum)
        cout << "They can read the message" ;
    else
        cout << "They can't read the message";
}