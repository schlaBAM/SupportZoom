//
// Created by Brett Morrison on 2019-11-20.
//

#include <iostream>
#include <string>

using namespace std;

struct Course {
    string deptCode;
    int courseNumber;
    string courseTitle;
};

int numCoursesInDepartment(Course [], int, string);

int main() {

    const int ARRAY_SIZE = 10;

    Course courseArray[ARRAY_SIZE] = {
            {"COMP", 111, "Computer Programming I"},
            {"COMP", 121, "Computer Programming II"},
            {"COMP", 211, "Computer Architecture"},
            {"COMP", 221, "Data Structures"},
            {"ECON", 101, "Introduction to Macroeconomics"},
            {"DATA", 301, "Introduction to Data Analytics"},
            {"DATA", 311, "Machine Learning"},
            {"MATH", 100, "Differential Calculus"},
            {"MATH", 101, "Integral Calculus"},
            {"MATH", 200, "Calculus III"}
    };

    cout << "Number of courses in COMP: " << numCoursesInDepartment(courseArray, ARRAY_SIZE, "COMP") << endl;
    cout << "Number of courses in MATH: " << numCoursesInDepartment(courseArray, ARRAY_SIZE, "MATH") << endl;
    cout << "Number of courses in DATA: " << numCoursesInDepartment(courseArray, ARRAY_SIZE, "DATA") << endl;
    cout << "Number of courses in ECON: " << numCoursesInDepartment(courseArray, ARRAY_SIZE, "ECON") << endl;

    return 0;
}

int numCoursesInDepartment(Course courseArray[], int numCourses, string deptCode){
    int count = 0;

    for(int i = 0; i < numCourses; i++){
        if(courseArray[i].deptCode == deptCode) count++;
    }

    return count;
}