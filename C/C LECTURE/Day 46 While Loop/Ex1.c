#include <stdio.h>
#include <conio.h>

int main() {

    int i = 1, n;

    printf("Enter n Value : ");
    scanf("%d", &n);

    while(i <= n)
    {
        printf("%4d", i);
        i++;
    }

    return 0;
}