#include <stdio.h>
#include <conio.h>

int main() {

    int n = 5;

    for(int i = 1; i <= 5; i++)
    {
        for(int j = i; j <= n; j++)
        {
            printf("%4d", j);
        }
        n++;
        printf("\n");
    }

    return 0;
}