#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= 9; j++)
        {
            if(j > i && j < 10-i)
            {
                printf("%3c", ' ');
            }
            else
            {
                printf("%3c", '*');
            }
        }
        printf("\n");
    }

    for(int i = 1; i <= 4; i++)
    {
        for(int j = 1; j <= 9; j++)
        {
            if(j > 5 - i && j < 5 + i)
            {
                printf("%3c", ' ');   
            }
            else
            {
                printf("%3c", '*');
            }
        }
        printf("\n");
    }


    return 0;
}