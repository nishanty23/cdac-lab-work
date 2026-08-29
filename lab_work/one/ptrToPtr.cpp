#include <iostream>
using namespace std;

//void inputEleOfArr(int arr[], int size){
//    cout<<"Enter the elements of the array: "<<endl;
//    for(int i=0; i<size; i++){
//        cin>>arr[i];
//    }
//}
//
//void displayArr(int arr[], int size){
//    cout<<"Elements of the array: ";
//    for(int i=0; i<size; i++){
//        cout<<arr[i]<<" ";
//    }
//    cout<<endl;
//}

int main(){
//    int n;
//    cout<<"Enter the size of array: ";
//    cin>>n;
//    int arr[n];
//    inputEleOfArr(arr, n);
//    displayArr(arr, n);

    int num1 = 10;
    int *p = &num1;
    int **pp = &p;
    cout<<"num1 = "<<num1<<endl;
    cout<<"&num1 = "<<&num1<<endl;
    cout<<"p = "<<p<<endl;
    cout<<"*p = "<<*p<<endl;
    cout<<"pp = "<<pp<<endl;
    cout<<"**pp = "<<**pp<<endl;
    cout<<"&pp = "<<&pp<<endl;
    cout<<"&p = "<<&p<<endl;

    // What if we change the value at **pp
    **pp = 20;
    cout<<"**pp = "<<**pp<<endl;
    cout<<"*p = "<<*p<<endl; // value at *p also changes
    cout<<"num1 = "<<num1<<endl; // value of num1 also changes

    // What if variable is constant
    const int num2 = 40;
    //int *p2 = &num2; // a value of type "const int *" cannot be used to initialize an entity of type "int *"
    const int *p2 = &num2;
    cout<<"*p2 = "<<*p2<<endl;

    // What if we change where the pointer points
    int num3 = 300;
    int num4 = 400;
    int *p3 = &num3;
    cout<<"*p3 = "<<*p3<<endl;
    cout<<"p3 = "<<p3<<endl;
    p3 = &num4;
    cout<<"*p3 = "<<*p3<<endl;
    cout<<"p3 = "<<p3<<endl;

//    cout<<"num3 = "<<num3<<endl;
//    *p3 = num4;
//    cout<<"num3 = "<<num3<<endl;

    return 0;
}