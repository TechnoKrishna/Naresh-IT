#include <stdio.h>

int main()
{
    int ch;

    scanf("%d", &ch);

    switch(ch%2)
    {
        case 0:
            printf("Even");
            break;
        case 1:
            printf("Odd");
    }

    return 0;
}