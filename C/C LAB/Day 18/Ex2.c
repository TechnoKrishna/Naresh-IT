#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() {

    int no;
    int temp;
    int sqr;
    int ld;
    int digit;
    int smp = 1;

    printf("Enter The Number : ");
    scanf("%d", &no);

    sqr = no * no;

    temp = sqr;

    while (temp != 0)
    {
        digit++;
        temp/=10;
    }

    int i = 1;

    // while ( i < digit)
    // {
    //     smp = smp * 10;
    //     i++;
    // }

    if(digit > 2)
    {
        smp = 100;
    } else{
        smp = 10;
    }

    ld = sqr % smp;

    if(no == ld)
    {
        printf("Yes (ends with %d) Automorphic", no);
    } else{
        printf("No (ends with %d) Not Automorphic", no);
    }
    


    // printf("%d %d %d", digit , smp, ld);

    return 0;
}