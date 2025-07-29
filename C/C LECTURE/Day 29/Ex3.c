// sizeof operator: It return the number of bytes taken by a variable / data type / value.

#include <stdio.h>
#include <conio.h>

int main() {

    int a = 100;
    float b = 1.2;
    char c = 'X';

    printf("%d, %d, %d\n", sizeof(a), sizeof(b), sizeof(c));
    printf("%d, %d, %d\n", sizeof(int), sizeof(float), sizeof(char));
    printf("%d, %d\n", sizeof(100), sizeof(-100));
    printf("%d, %d\n", sizeof(32767), sizeof(32768));
    printf("%d, %d\n", sizeof(32768u), sizeof(32768U));
    printf("%d, %d\n", sizeof((int)32768), sizeof((unsigned)32768U));

    return 0;
}