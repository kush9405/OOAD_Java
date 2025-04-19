// main.cpp
#include "controller.h"
using namespace std;

int main() {
    crow::SimpleApp app;

    // Create Employee Model
    Employee emp(101, "John Doe", 50000.0);

    // Create View
    EmployeeView view;

    // Create Controller and Setup Routes
    EmployeeController controller(emp, view);
    controller.setupRoutes(app);

    // Start the server
    app.port(8080).multithreaded().run();
}
