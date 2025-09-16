#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 4; i++)
    {
        for(int j = 5; j > 0; j--)
        {
            if(j > 5-i)
            {
            printf("%2d", j);
            }
            else
            {
            printf("%2c", ' ');
            }
        }
        printf("\n");
    }

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 5; j > 0; j--)
        {
            if(j < 7-i )
            {
                printf("%2d", j);  
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