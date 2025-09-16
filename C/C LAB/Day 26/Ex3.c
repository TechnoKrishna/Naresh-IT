#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 65; i <= 84; i++)
    {
        printf("%4c", i);

        if(i % 4 == 0)
        {
            printf("\n");
        }

    }


    return 0;
}