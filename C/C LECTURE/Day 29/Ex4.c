#include <stdio.h>
#include <conio.h>

int main() {

    printf("%d, %d\n", sizeof((int)100000), sizeof((unsigned)100000)); // PREFIX
    printf("%d, %d\n", sizeof(100000u), sizeof(100000U)); // SUFFIX
    printf("%d, %d\n", sizeof(10l), sizeof(10L));
    printf("%d, %d\n", sizeof((int)10.4), sizeof((char)10.4));
    printf("%d, %d\n", sizeof((float)10), sizeof((long double)10));

    return 0;
}