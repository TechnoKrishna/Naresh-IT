#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int temp;
    int sum = 0;

    printf("Enter The Number : ");
    scanf("%d", &no);

    temp = no;

    while (temp != 0)
    {
        sum = sum + (temp % 10);
        temp /= 10;
    }

    printf("%d %d", no, sum);

    if(no % sum == 0)
    {
        printf("\nIs an Niven");
    }
    else
    {
        printf("\nIs Not an Niven");
    }
    
    return 0;
}
