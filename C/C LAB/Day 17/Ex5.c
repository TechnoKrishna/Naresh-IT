#include <stdio.h>
#include <conio.h>

int main() {

    int no, i = 1, f = 1;

    printf("Enter Number : ");
    scanf("%d", &no);

    while(i < no)
    {
        f = f * ++i;
    }

    printf("Factorial : %d", f);

    return 0;
}