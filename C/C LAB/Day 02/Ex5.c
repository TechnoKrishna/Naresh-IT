#include <stdio.h>
#include <conio.h>

int main() {

    int a = 5, b = 5, c = 10;

    printf("\n(a==b) && (c>b) is %d", (a==b) && (c>b));
    printf("\n(a==b) && (c<b) is %d", (a==b) && (c<b));
    printf("\n(a==b) || (c<b) is %d", (a==b) || (c<b));
    printf("\n(a!=b) || (c<b) is %d", (a!=b) || (c<b));
    printf("\n!(a!=b) is %d", !(a!=b));
    printf("\n!(a==b) is %d", !(a==b));

    return 0;
}