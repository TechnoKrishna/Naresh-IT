#include <stdio.h>

int main()
{
    int m1, m2, m3;

    scanf("%d %d %d", &m1, &m2, &m3);

    if(m1 > 35 && m2 > 35 && m3 > 35)
    {
        printf("Result is pass");
    }
    else
    {
        printf("Result is Fail");
    }

    return 0;
}