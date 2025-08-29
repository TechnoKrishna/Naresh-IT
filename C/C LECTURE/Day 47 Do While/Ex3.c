#include <stdio.h>
#include <conio.h>

int main() {

    long n;
    int c;

    printf("Enter a no : ");
    scanf("%ld", &n);

    c = printf("%ld", n);

    if(n < 0) c--;

    printf(" is a %d digits no", c);

    return 0;
}