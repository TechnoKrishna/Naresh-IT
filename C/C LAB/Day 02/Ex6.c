#include <stdio.h>
#include <conio.h>

int main() {

    int a;
    float b = 1.1;
    double c;
    char d = 'a';

    printf("\nSize of Int = %d bytes", sizeof(a));
    printf("\nSize of float = %d bytes", sizeof(b));
    printf("\nSize of double = %d bytes", sizeof(c));
    printf("\nSize of Char = %d bytes", sizeof(d));

    return 0;
}