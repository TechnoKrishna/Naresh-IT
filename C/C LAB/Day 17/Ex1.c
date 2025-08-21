#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int sum = 0;

    printf("Enter Number : ");
    scanf("%d", &no);

    while(no!=0)
    {
        sum += no%10;
        no /= 10;
    }

    printf("Sum is : %d", sum);

    return 0;
}