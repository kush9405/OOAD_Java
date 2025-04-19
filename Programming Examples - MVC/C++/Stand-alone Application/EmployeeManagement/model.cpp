// model.cpp
#include "model.h"

Employee::Employee(int id, std::string name, double salary) : id(id), name(name), salary(salary) {}

int Employee::getId() const {
    return id;
}

std::string Employee::getName() const {
    return name;
}

double Employee::getSalary() const {
    return salary;
}

void Employee::setSalary(double newSalary) {
    salary = newSalary;
}
