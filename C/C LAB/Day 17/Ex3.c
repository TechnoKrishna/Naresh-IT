#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int Temp = 0;

    printf("Enter Number : ");
    scanf("%d", &no);

    while (no != 0)
    {
        Temp = (Temp * 10) + no % 10;
        no /= 10;
    }
    
    printf("Reversed : %d", Temp);

    return 0;
}