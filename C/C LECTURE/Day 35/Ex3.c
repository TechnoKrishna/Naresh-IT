#include <stdio.h>
#include <conio.h>

int main() {

    int a = 37;

    printf("%4d\n", a); //  - - 3 7
    printf("%-4d\n", a); // 3 7 - -
    printf("%1d\n", a);
    printf("%.5d\n", a);
    printf("%*d\n", 5, a);

    return 0;
}