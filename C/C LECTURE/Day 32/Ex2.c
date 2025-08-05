#include <stdio.h>
#include <conio.h>

int a = 10;

void show()
{
    int b = 20;
    printf("SHOW METHOD CALLING a = %d , b = %d\n", a, b);
}

int main() {

    show();

    printf("MAIN METHOD CALLING a = %d\n", a);

    // b is not accessed here

    return 0;
}