#include <stdio.h>
#include <conio.h>

int main()
{

    int no, temp;
    int sum = 0;

    printf("Enter a No : ");
    scanf("%d", &no);

    temp = no;

    while (temp != 0)
    {
        sum = sum + temp % 10;
        temp /= 10;
    }

    // printf("%d %d", no, sum);

    printf((no % sum == 0) ? "Harshad" : "Not Harshad");

    return 0;
}