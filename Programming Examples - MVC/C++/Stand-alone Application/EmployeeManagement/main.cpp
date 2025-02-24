// main.cpp
#include "controller.h"

int main() {
    // Creating Employee model
    Employee emp(101, "John Doe", 50000.0);

    // Creating View
    EmployeeView view;

    // Creating Controller
    EmployeeController controller(emp, view);

    // Display Initial Employee Details
    controller.display();

    // Updating Employee Salary
    std::cout << "\nUpdating Salary...\n";
    controller.updateSalary(55000.0);

    // Display Updated Details
    controller.display();

    return 0;
}
