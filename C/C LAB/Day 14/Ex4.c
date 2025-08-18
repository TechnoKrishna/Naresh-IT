#include <stdio.h>
#include <conio.h>

int main() {

    int n;
    int i = 0;

    printf("Enter The Number : ");
    scanf("%d", &n);

    s:

    if(n <= 0)
    {
        printf("Invalid");
    } 
    else
    {
        i++;
        n = n/10;
    }

    while(n > 0)
    {
        goto s;
    }

    (i > 0) ? printf("%d", i) : printf("");

    return 0;
}