#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 0; i <= 5; i++)
    {
        for (int j = 1; j <= 9; j++)
        {
            if(j > i && j < 10-i)
            {
                printf("%2c", '*');
            }
            else
            {
                printf("%2c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}