#include<iostream>
#include<string>
using namespace std;
class bro{

    public:
    int x;

    bro(int x):x(x){
        cout<<"Constructor is called "<<x<<endl;
    }};
int main(){
    bro obj(10);
    return 0;
}
