#include <stdio.h>

int main()
{
    int no;

    scanf("%d", &no);

    if(no < 0)
    {
        printf("Negative value not allowed.");
        return 0;
    }

    for(int i = 1 ; i <= 10 ; i++)
    {
        printf("%d X %d = %d\n", no, i, no * i);
    }

    return 0;
}