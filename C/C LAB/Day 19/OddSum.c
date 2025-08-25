#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int sum = 0;

    scanf("%d", &no);

    printf("1 to %d odd numbers is", no);

    for(int i = 1; i <= no ; i++)
    {
        if(i % 2 == 1)
        {
            sum = sum + i;
            printf(" %d", i);
        }
    }

    printf("\nSum of number is = %d", sum);

    return 0;
}