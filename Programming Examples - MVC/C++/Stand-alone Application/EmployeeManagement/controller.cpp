// controller.cpp
#include "controller.h"

EmployeeController::EmployeeController(Employee model, EmployeeView view) : model(model), view(view) {}

void EmployeeController::updateSalary(double newSalary) {
    model.setSalary(newSalary);
}

void EmployeeController::display() {
    view.displayEmployeeDetails(model);
}
