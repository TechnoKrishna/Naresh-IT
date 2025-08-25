#include <stdio.h>

int main()
{
    int no;

    scanf("%d", &no);

    if(!(no<0))
    {
    for(int i = 1 ; i <= no ; i++)
    {
        printf("Number is : %d and cube of the %d is :%d\n", i,i,i*i*i);
    }
    } else{
        printf("Negative value not allowed.");
    }

    return 0;
}