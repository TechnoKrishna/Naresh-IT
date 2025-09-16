#include <stdio.h>
#include <conio.h>

int main() {

    int k = 1;

    // for(int i = 1; i <= 4; i++)
    // {
    //     for(int j = 0+i; j <= k; j++)
    //     {
    //         printf("%4d",j);
    //     }
    //     printf("\n");
    //     k += 2;
    // }

    for (int i = 1; i <= 10 ; i++)
    {
        printf("%4d", i);

        if(i % k == 0)
        {
            printf("\n");
            k+=i;
        }

    }
    

    return 0;
}