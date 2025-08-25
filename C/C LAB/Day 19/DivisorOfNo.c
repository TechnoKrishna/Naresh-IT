#include <stdio.h>
#include <conio.h>

int main() {

    int no;

    scanf("%d", &no);

    printf("The Divisors of %d are :", no);

    for (int i = 1; i <= no; i++)
    {
        if(no % i == 0)
        {
            printf(" %d", i);
        }
    }
    

    return 0;
}