// controller.cpp
#include "controller.h"

EmployeeController::EmployeeController(Employee model, EmployeeView view) : model(model), view(view) {}

void EmployeeController::setupRoutes(crow::SimpleApp &app) {
    // Route to get employee details
    CROW_ROUTE(app, "/employee")([this]() {
        return view.generateHTML(model);
    });

    // Route to update employee salary
    CROW_ROUTE(app, "/update_salary/<double>")
        .methods(crow::HTTPMethod::POST)([this](double newSalary) {
            model.setSalary(newSalary);
            return "Salary updated to $" + to_string(model.getSalary());
        });
}
