#include <stdio.h>
#include <conio.h>

int main() {

    int i = 1;

    start:

    if (i <= 5)
    {
        printf("Krishna\n");
        i++;
        goto start;
    }  

    return 0;
}