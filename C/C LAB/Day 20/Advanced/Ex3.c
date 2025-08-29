#include <stdio.h>
#include <conio.h>
#include <math.h>

int main()
{

    int no;
    int sum = 0;
    int power;
    int i;
    int digit = 0;

    printf("Enter a NO : ");
    scanf("%d", &no);

    int temp = no;

    while (temp != 0)
    {
        digit++;
        temp /= 10;
    }

    temp = no;

    i = digit;

    while (temp != 0)
    {
        power =(int) pow(temp % 10, i);

        printf("%d\n", power);

        temp /= 10;

        sum = sum + power;

        i--;
    }


    printf("\nNo = %d, Result = %d", no, sum);

    if(no == sum)
    {
        printf("Disarium");
    } 
    else
    {
        printf("Not Disarium");
    }

    return 0;
}