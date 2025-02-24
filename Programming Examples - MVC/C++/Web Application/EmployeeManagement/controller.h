// controller.h
#ifndef CONTROLLER_H
#define CONTROLLER_H

#include "model.h"
#include "view.h"
#include "crow_all.h"
using namespace std;

class EmployeeController {
private:
    Employee model;
    EmployeeView view;

public:
    EmployeeController(Employee model, EmployeeView view);
    void setupRoutes(crow::SimpleApp &app);
};

#endif
