#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= 9; j++)
        {
            if(j == 6-i || j == 4 + i)
            {
                printf("%2c", '*');
            }
            else{
                printf("%2c", ' ');
            }
        }
        printf("\n");
    }

        for(int i = 1; i <= 4; i++)
    {
        for(int j = 1; j <= 9; j++)
        {
            if(j == 1+i || j ==  9 - i)
            {
                printf("%2c", '*');
            }
            else{
                printf("%2c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}