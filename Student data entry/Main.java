#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  cin.get(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<endl;
  cout<<"Student Details"<<"\n";
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks<<endl;
  return 0;
}