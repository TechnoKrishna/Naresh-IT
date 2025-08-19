#include <stdio.h>
#include <conio.h>

int main() {

    int n;

    printf("Enter n Value : ");
    scanf("%d", &n);

    while(n > 0) printf("%4d", n--);

    return 0;
}