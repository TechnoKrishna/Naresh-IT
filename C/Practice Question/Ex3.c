#include <stdio.h>
#include <conio.h>

int main() {

    int count = 1;

    for(int i = 5; i > 0; i--)
    {
        for(int j = 1; j <= 6-i; j++)
        {
            printf("%4d", count++);
        }
        printf("\n");
    }


    return 0;
}