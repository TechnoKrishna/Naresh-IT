#include <stdio.h>
#include <conio.h>

int main() {

    int n;
    int i = 1;

    printf("Enter The No : ");
    scanf("%d", &n);

    if(n <= 0)
    {
        printf("Invalid");
        return 0;
    }

    s:

    (i%2==0) ? printf("%d ", i) : printf("");
    i++;

    while(i <= n)
    {
        goto s;
    }


    return 0;
}