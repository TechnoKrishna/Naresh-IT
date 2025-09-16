#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= 5; j++)
        {
            if(i == 1 || i == 5 || j == 1 || j == 5 || (i == 3 && j == 3))
            {
                printf("%2d", 1);
            }
            else
            {
                printf("%2d", 0);
            }
        }
        printf("\n");
    }

    return 0;
}