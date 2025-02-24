#include <iostream>
using namespace std;
class Engineer{
    public:
    string name;
    int experience;
    Engineer(string name, int experience){
        this->name = name;
        this->experience = experience;
    }
    virtual void display(){
        cout<<name<<" is working as an engineer with an experience of "<<experience<<" years" <<endl;
    }
};
#include <iostream>
using namespace std;
class SoftwareEngineer : public Engineer {
public:
    string language;
    SoftwareEngineer(string name, int experience, string language)
        : Engineer(name, experience) {
        this->language = language;
    }
    void display() override {
        cout << name << " is working as a software engineer with anf experience of " << experience << " years and codes in " << language << endl;
    }
    void code() {
        cout << name << " is coding in " << language << endl;
    }
};
int main()
{
    SoftwareEngineer obj1("John",5,"C++");
    obj1.display();
    obj1.code();
    return 0;
}