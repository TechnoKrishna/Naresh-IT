#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int count = 0;

    printf("Enter Number : ");
    scanf("%d", &no);

    while (no != 0)
    {
        count++;
        no /= 10;
    }

    printf("%d", count);
    

    return 0;
}