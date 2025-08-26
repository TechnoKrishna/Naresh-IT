#include <stdio.h>
#include <conio.h>

int main() {

    int no, sqr;
    int sum = 0;

    printf("Enter The Number : ");
    scanf("%d", &no);

    sqr = no * no;

    while (sqr != 0)
    {
        sum = sum + (sqr%10); 
        sqr /= 10;
    }

    (no == sum) ? printf("Number is Neon %d", sum) : printf("Number is Not Neon");

    return 0;
}