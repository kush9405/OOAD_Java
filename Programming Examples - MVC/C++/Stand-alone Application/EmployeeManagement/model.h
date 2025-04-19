// model.h
#ifndef MODEL_H
#define MODEL_H

#include <string>

class Employee {
private:
    int id;
    std::string name;
    double salary;

public:
    Employee(int id, std::string name, double salary);
    int getId() const;
    std::string getName() const;
    double getSalary() const;
    void setSalary(double newSalary);
};

#endif
