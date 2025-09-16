#include <stdio.h>
#include <conio.h>

int main() {

    int i, j, k, temp;

    k = 1;

    for(i = 0; i <= 4; i++)
    {
        for(j = k; j <= k+i; j++)
        {
            printf("%4d", j);
            temp = j;
        }
        k = temp;
        printf("\n");
    }

    return 0;
}