#include <stdio.h>
#include <conio.h>

int main() {

    int a = 10.3, b = 5.5, c = 2.2;

    a += b *= c /= 1.3;

    printf("a=%d, b=%d, c=%d", a, b, c);

    return 0;
}