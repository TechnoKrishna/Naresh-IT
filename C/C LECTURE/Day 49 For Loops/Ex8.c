#include <stdio.h>
#include <conio.h>

int main() {

    int n, r1, r2;

    printf("Enter The No : ");
    scanf("%d", &n);

    for(r1 = n % 10, n = n / 10; n != 0; n /= 10)
    {
        r2 = n % 10;

        if(r1-r2==1 || r2-r1==1) r1=r2;
        else{
            puts("It is not a step no");
            return 0;
        }
        puts("It is a step no");

    }

    return 0;
}