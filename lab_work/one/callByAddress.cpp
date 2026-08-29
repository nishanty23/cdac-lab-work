#include <iostream>
using namespace std;

void swapaddress(int *p, int *q){
//    cout<<"p = "<<p<<" q = "<<q<<endl;
    int *temp = p;
    p = q;
    q = temp;
//    cout<<"p = "<<p<<" q = "<<q<<endl;
}

void swapvalue(int *p, int *q){
//    int temp = *p;
//    *p = *q;
//    *q = temp;
    *p = *p + *q;
    *q = *p - *q;
    *p = *p - *q;
}

int main(){
    int a = 10;
    int b = 20;
//    cout<<"Before swap:"<<endl;
//    cout<<"&a = "<<&a<<" &b = "<<&b<<endl;
//    swapaddress(&a, &b);
//    cout<<"After swap:"<<endl;
//    cout<<"&a = "<<&a<<" &b = "<<&b<<endl;

    swapvalue(&a, &b);
    cout<<"a = "<<a<<" b = "<<b<<endl;

//    int arr[4] = {10,20,30,40};
//    cout<<arr<<endl;
//    cout<<arr[5]<<endl; // Undefined behaviour sometimes right answer like 20 sometimes garbage value
//    int *ptrArr = arr;
//    cout<<"*ptrArr = "<<*ptrArr<<endl;
//    cout<<"ptrArr = "<<ptrArr<<endl;

    return 0;
}