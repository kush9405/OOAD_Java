// controller.h
#ifndef CONTROLLER_H
#define CONTROLLER_H

#include "model.h"
#include "view.h"

class EmployeeController {
private:
    Employee model;
    EmployeeView view;

public:
    EmployeeController(Employee model, EmployeeView view);
    void updateSalary(double newSalary);
    void display();
};

#endif
