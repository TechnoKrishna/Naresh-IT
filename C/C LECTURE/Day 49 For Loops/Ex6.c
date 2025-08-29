#include <stdio.h>
#include <conio.h>

int main() {

    int n = 10, i;


    for(i = 1; i <=n ; i++)
    {
        printf(" %d", i);
        if(i % 3 == 0)
        {
            printf(" %d", i*3);
        }
    }

    return 0;
}