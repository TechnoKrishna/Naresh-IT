#include <stdio.h>
#include <conio.h>

int main() {

    int n, i;
    float s = 1;

    printf("Enter The No : ");
    scanf("%d", &n);

    printf("1+");

    for(i = 1; i <=n ; i++)
    {
        printf("1/%d+", i, s += 1.0/i);
    }
    printf("\b=%.2f", s);


    return 0;
}