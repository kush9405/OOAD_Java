// view.h
#ifndef VIEW_H
#define VIEW_H

#include "model.h"
#include <string>
using namespace std;

class EmployeeView {
public:
    string generateHTML(const Employee &emp);
};

#endif
