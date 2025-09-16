#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= 5; j++)
        {
            if(i == j || i == 1 || j > i-1)
            {
                printf("%4d", i*j);
            }
            else{
                printf("%4c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}