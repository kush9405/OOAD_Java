// view.cpp
#include "view.h"

void EmployeeView::displayEmployeeDetails(const Employee &emp) {
    std::cout << "Employee ID: " << emp.getId() << std::endl;
    std::cout << "Name: " << emp.getName() << std::endl;
    std::cout << "Salary: $" << emp.getSalary() << std::endl;
}
