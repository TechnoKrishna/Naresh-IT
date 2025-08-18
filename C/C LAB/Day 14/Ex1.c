#include <stdio.h>
#include <conio.h>

int main() {

    int n;

    scanf("%d", &n);

    s:

    printf("%d ", n--);

    if(n < 0)
    {
        printf("Invalid");
    }

    while(n > 0)
    {
        goto s;
    }


    return 0;
} 