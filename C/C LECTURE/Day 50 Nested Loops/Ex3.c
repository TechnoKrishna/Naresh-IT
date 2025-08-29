#include <stdio.h>
#include <conio.h>

int main() {

    int n, t, i;

    printf("Enter How Many Many Tables : ");
    scanf("%d", &n);

    for(t = 1; t <= n; t++)
    {
        for(i = 1; i <= 10; i++)
        {
            printf("%d*%d=%d\n", t, i, t*i);
        }
    }

    return 0;
}