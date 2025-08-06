#include <stdio.h>
#include <conio.h>

int main() {

    int a = 11;

    // printf("%s", !(a % 10) ? "Even" : "ODD");

    a % 10 && printf("odd") || printf("Even");

    return 0;
}