#include <iostream>
using namespace std;
class Myclass{
    int *ptr;
    public:
    Myclass(int x):ptr(new int(x)){
        // ptr = new int(x);
        cout << "Constructor is called "<<ptr <<':' <<x << endl;
    }
    ~Myclass(){
        cout << "Destructor is called "<<ptr << endl;
        delete ptr;
    }
};
int main()
{
    Myclass obj1(10);
    Myclass obj2(20);
    return 0; //Destructor is automatically called when the object goes out of scope
};