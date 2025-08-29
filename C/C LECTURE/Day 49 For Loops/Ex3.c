#include <stdio.h>
#include <conio.h>

int main() {

    int n, i, s=0;

    printf("Enter The No : ");
    scanf("%d", &n);

    for(i = 1; i <= n ; i++)
    {
        s += i*i;

        if(i < n)
        {
            printf("%d%c+", i, 253);
        }
        else{
            printf("%d%c=%d", i, 253, s);
        }

    }

    return 0;
}