#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 7; i++)
    {
        for(int j = 1; j <= 7; j++)
        {
            if(i == 4 || j == 4 || i == 1 || i == 7 || j == 1 || j == 7)
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