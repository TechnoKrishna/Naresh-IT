#include <stdio.h>
#include <conio.h>

int main() {

    int n, i = 1, s = 0;

    printf("Enter n Value ");
    scanf("%d", &n);

    while (i <= n)
    {
        s += i;
        i++;
    }
    
    printf("Sum=%d, Avg=%.2f", s, (float) s/n); // Explicit Type Casting

    return 0;
}