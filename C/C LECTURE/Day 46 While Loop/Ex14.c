#include <stdio.h>
#include <conio.h>
#include <math.h>

long power()
{
    int b, p;
    long s = 0;

    printf("Enter base, power values ");
    scanf("%d %d", &b, &p);

    while (p >= 1)
    {
        s += pow(b, p);
        p--;
    }
    return s;
}

int main()
{

    printf("Power Sum = %ld", power());

    return 0;
}