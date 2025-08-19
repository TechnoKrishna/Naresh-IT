#include <stdio.h>
#include <conio.h>

int main()
{

    int n, f = 1;

    printf("Enter n Value ");
    scanf("%d", &n);

    while (n > 1)
    {
        f = f * n;
        n--;
    }
    printf("Factotial=%d", f);

    return 0;
}