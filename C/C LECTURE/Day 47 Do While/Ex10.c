#include <stdio.h>
#include <conio.h>

int main() {

    long n;

    printf("Enter a no : ");
    scanf("%ld", &n);

    printf("Reverse no is ");

    if(n < 0) 
    printf("-", n=-n);
    
    do
    {
        int r = n % 10;
        printf("%d", r); 
        n /= 10;
    } while (n!=0);
    
    return 0;
}