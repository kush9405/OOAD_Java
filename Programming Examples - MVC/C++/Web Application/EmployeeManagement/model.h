// model.h
#ifndef MODEL_H
#define MODEL_H

#include <string>
using namespace std;

class Employee {
private:
    int id;
    string name;
    double salary;

public:
    Employee(int id, string name, double salary);
    int getId() const;
    string getName() const;
    double getSalary() const;
    void setSalary(double newSalary);
};

#endif
