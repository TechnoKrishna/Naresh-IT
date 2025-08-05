#include <stdio.h>
#include <conio.h>

int a = 1, b = 2, c = 3; // GLOBAL

int main() {

   {
    int a = 10, b = 20, c = 30;
    printf("a = %d\n", a+b+c);
   }
   
    printf("a = %d\n", a+b+c);

    return 0;
}