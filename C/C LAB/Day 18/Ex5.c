#include <stdio.h>
#include <conio.h>

int main() {

    int no, i = 1;

    printf("Enter Limit : ");
    scanf("%d", &no);

    while (i != no)
    {
        (i % 2 == 1) ? printf("%d ", i) : printf("");
        i++;
    }

    return 0;
}