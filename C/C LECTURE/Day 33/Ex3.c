#include <stdio.h>
#include <conio.h>

int a = 10; // GLOBAL

int main() {

   int a = 20; // LOCAL

   printf("a = %d\n", a);

   {
    a = 30;
    printf("a = %d\n", a);
   }

    printf("a = %d\n", a);

    return 0;
}