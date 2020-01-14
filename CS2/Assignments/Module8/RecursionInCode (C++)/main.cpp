#include <iostream>

int factorial2(int n);
int Fib(int n);

using namespace std;

int main() {

    cout << "Factorial Tests:" << endl;
    cout << factorial2(4) << endl; //8
    cout << factorial2(5) << endl; //15
    cout << factorial2(6) << "\n" << endl; //48

    cout << "Fibonacci Tests:" << endl;
    cout << Fib(8) << endl; //21
    cout << Fib(10) << endl; //55
    cout << Fib(20) << endl; //6765

    return 0;
}

int factorial2(int n){
    if(n <= 1){
        return 1;
    }
    return n * factorial2(n-2);
}

int Fib(int n){
    if(n <= 1){
        return n;
    }
    return Fib(n-1) + Fib(n-2);
}