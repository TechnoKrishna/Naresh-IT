#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 25; i++)
    {
        printf("%4d", i);

        if(i % 5 == 0)
        {
            printf("\n");
        }
    }


    return 0;
}