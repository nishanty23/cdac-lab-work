#include <iostream>
using namespace std;

class Student{
private:
    int marks = 95;

public:
    friend class Teacher;
};

class Teacher{
public:
    void showMarks(Student s) {
        cout<<"Marks: "<<s.marks<<endl;
    }
};

int main() {
    Student s;
    Teacher t;

    t.showMarks(s);

    return 0;
}
