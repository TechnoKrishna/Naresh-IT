#include <stdio.h>
#include <conio.h>

int main() {

    int no;

    printf("Enter Number : ");
    scanf("%d", &no);

    while (no != 0)
    {
        printf("%d\n", no%10);
        no /= 10;
    }
    
    return 0;
}