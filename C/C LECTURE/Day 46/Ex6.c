#include <stdio.h>
#include <conio.h>

int main()
{

    int n, es = 0, os = 0;

    printf("Enter n Value ");
    scanf("%d", &n);

    while (n >= 1)
    {
        if (n % 2 == 0)
            es += n;
        else
            os += n;
        n--;
    }
    printf("Even Sum=%d, Odd Sum=%d", es, os);

    return 0;
}