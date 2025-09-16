#include <stdio.h>
#include <conio.h>

int main() {

    int i, j;
    int n = 5;

    for(i = 1; i <= n; i++)
    {
        for(j = 1; j <= n; j++)
        {
            if(j <= n-i)
            {
                printf("%4d", 0);
            }
            else{
                printf("%4d", 1);
            }
        }
        printf("\n");
    }

    return 0;
}