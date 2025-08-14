#include<stdio.h>

int main()
{
    int no;
    scanf("%d", &no);

    if(no % 2 == 0)
    {
        printf("even");
    }
    else
    {
        printf("odd");
    }

    return 0;
}