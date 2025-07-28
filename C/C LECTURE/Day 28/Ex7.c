#include <stdio.h>
#include <conio.h>

int main() {

    int a = (10, 5, 2);

    printf("\na=%d", a);

    int b;
    b = 10, 5, 2;

    printf("\nb=%d", b);

    int c;
    c = 10, (5), 2;

    printf("\nc=%d", c);

    int d;
    d = (10, 5), 2;

    printf("\nd=%d", d);

    int e;
    e = (10, 5), (2, 9), 20;

    printf("\ne=%d", e);

    int f;
    f = printf("Mine Pyar Kiya"), printf("Kahona Pyar Hai");
    printf("%d", a);


    return 0;
}