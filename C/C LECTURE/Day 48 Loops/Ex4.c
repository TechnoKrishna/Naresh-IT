#include <stdio.h>
#include <conio.h>

int main() {

    long n;

    printf("Enter a No : ");
    scanf("%ld", &n);

    if (n<0)
    {
        printf("-",n=-n);
    }
    
    do
    {
        if(n % 100 < 10 && n > 9)
        {
            printf("0");
        }
        printf("%d  ", n%100);
        n /= 100;
    } while (n != 0);
    
    return 0;
}