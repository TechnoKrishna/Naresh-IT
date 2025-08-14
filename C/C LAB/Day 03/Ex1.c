#include <stdio.h>
#include <conio.h>

int main() {

    int a = 35;

    ((a % 10) >=5) ? printf("%d", a = (((a/10)+1)*10)) : printf("%d", ((a/10)*10));

    return 0;
}