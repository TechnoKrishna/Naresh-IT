#include <stdio.h>
#include <conio.h>

int main() {

    long n;
    int r, max = -9, min = 9;

    printf("Enter a No : ");
    scanf("%ld", &n);

    while(n!=0)
    {
        r = n % 10;

        if(max < r)
        {
            max = r;
        }

        if(min > r)
        {
            min = r;
        }

        n /= 10;
    }

    printf("Max = %d, Min = %d", max, min);

    return 0;
}