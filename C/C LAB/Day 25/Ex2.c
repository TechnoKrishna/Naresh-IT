#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i < 40; i++)
    {
        if(i % 2 != 0)
        {
            printf("%4d", i);
        }

        if(i % 10 == 0)
        {
            printf("\n");
        }
    }

    return 0;
}