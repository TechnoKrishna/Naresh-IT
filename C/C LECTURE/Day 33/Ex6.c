#include <stdio.h>
#include <conio.h>

int a = 1, b = 2, c; // GLOBAL

int main() {

   {
    int a = 10, b = 20;
    printf("sum = %d\n", a+b+c);
    c = 30;
   }
   
    printf("sum = %d\n", a+b+c);

    return 0;
}