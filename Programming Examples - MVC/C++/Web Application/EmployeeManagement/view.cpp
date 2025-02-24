// view.cpp
#include "view.h"

string EmployeeView::generateHTML(const Employee &emp) {
    return "<html><head><title>Employee Details</title></head><body>"
           "<h1>Employee Details</h1>"
           "<p><strong>ID:</strong> " + to_string(emp.getId()) + "</p>"
           "<p><strong>Name:</strong> " + emp.getName() + "</p>"
           "<p><strong>Salary:</strong> $" + to_string(emp.getSalary()) + "</p>"
           "</body></html>";
}
