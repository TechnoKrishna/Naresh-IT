#include <stdio.h>
#include <conio.h>

int main() {

    float a;

    a = 1.1;
    if( a == 1.1 ) puts("Yes"); else puts("No");
    a = 1.0;
    if( a == 1.0 ) puts("Yes"); else puts("No");
    a = 1.5;
    if( a == 1.5 ) puts("Yes"); else puts("No");
    a = 1.2;
    if( a == 1.2 ) puts("Yes"); else puts("No");

    printf("\n");

    a = 1.1;
    if( a == 1.1f ) puts("Yes"); else puts("No");
    a = 1.0;
    if( a == 1.0 ) puts("Yes"); else puts("No");
    a = 1.5;
    if( a == 1.5 ) puts("Yes"); else puts("No");
    a = 1.2;
    if( a == 1.2f ) puts("Yes"); else puts("No");

    return 0;
}