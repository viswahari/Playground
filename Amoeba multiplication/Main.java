#include <iostream>  
using namespace std;  
int main() {  
  int n1=0,n2=1,n3,i,number;    
// cout<<"Enter the number of elements: ";    
 cin>>number;  
  if(number==1)
 cout<<n1<<" ";
  else if(number==2)
   cout<<n2<<" ";
  else{
 for(i=2;i<number;++i)    
 {    
  n3=n1+n2;       
  n1=n2;    
  n2=n3;    
 }  
    cout<<n3;
  } 
   } 