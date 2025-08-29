#include <stdio.h>
#include <conio.h>

int main() {

    int i, sum = 0, n;

    printf("Enter a No : ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        printf("%d+", i , sum += i);
    }

    printf("\b=%d", sum);
    return 0;
}