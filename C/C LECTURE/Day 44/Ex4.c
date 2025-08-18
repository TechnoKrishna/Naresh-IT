#include <stdio.h>
#include <conio.h>

int main() {

    printf("%d\n", 0 ? 1 ? 2 : 3 : 4);
    printf("%d\n", 1 ? 0 ? 2 : 3 : 4);
    printf("%d\n", 1 ? 2 ? 0 : 3 : 4);

    return 0;
}