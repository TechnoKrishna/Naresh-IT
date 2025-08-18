#include <stdio.h>

int main()
{
    int n1, n2;

    scanf("%d%d", &n1, &n2);

    switch(n1 > n2)
    {
        case 0:
            printf("%d", n2);
            break;
        case 1:
            printf("%d", n1);

    }

    return 0;
}