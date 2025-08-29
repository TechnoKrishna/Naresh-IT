#include <stdio.h>
#include <conio.h>

int main() {

    int n, t, i;

    printf("Enter How Many Many Tables : ");
    scanf("%d", &n);

    for(i = 1; i <= 10; i++)
    {
        for(t = 1; t <= n; t++)
        {
            printf("%d*%d=%d\t", t, i, t*i);
        }
        printf("\n");
    }

    return 0;
}