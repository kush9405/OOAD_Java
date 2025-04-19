#include <iostream>
using namespace std;

// Standard entry-point main function
int main() {
    cout << "Standard main function called." << endl;

    // Call the overloaded main functions
    main(10);           // Calls the version with one int parameter
    main(10, 20);       // Calls the version with two int parameters

    return 0;
}

// Overloaded main function with one parameter
void main(int x) {
    cout << "Overloaded main function with one parameter called. x = " << x << endl;
}
// Overloaded main function with two parameters
void main(int x, int y) {
    cout << "Overloaded main function with two parameters called. x = " << x << ", y = " << y << endl;
}



