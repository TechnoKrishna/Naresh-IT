#include <stdio.h>
#include <conio.h>

int main() {

    int n;
    int f = 1;

    printf("Enter A Number : ");
    scanf("%d", &n);

    while(n > 0)
    {

        f = f * n;
        n--;
    }

    printf("%d", f);


    return 0;
}