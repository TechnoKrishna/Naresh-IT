#include <stdio.h>
#include <conio.h>

int main() {

    long no;
    int temp;
    int max = 0;

    printf("Enter Number : ");
    scanf("%ld", &no);

    while (no != 0)
    {

        temp = no % 10;

        if(temp > max)
        {
            max = temp;
        }
        
        no /= 10;

    }

    printf("Max Value is %d", max);
    

    return 0;
}