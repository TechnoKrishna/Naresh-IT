#include <stdio.h>
#include <conio.h>

int main() {

    int a = 10;

    printf("%d\n", 'A' << 2);

    a << 4;

    printf("a = %d\n",a);

    a >> 1;

    printf("a = %d\n",a);

    a << 2 + 1 >>2;

    printf("a = %d\n",a);

    ///////////////////////////////////////////////////

    printf("\n");

    printf("%d\n", 'A' << 2);

    a = a << 4;

    printf("a = %d\n",a);

    a = a >> 1;

    printf("a = %d\n",a);

    a = a << 2 + 1 >>2;

    printf("a = %d\n",a);

    ///////////////////////////////////////////////////

    a = 10.5;

    printf("\n");

    printf("a = %d\n",a = a << 3);
    printf("a = %d\n",a<<=5);

    return 0;
}