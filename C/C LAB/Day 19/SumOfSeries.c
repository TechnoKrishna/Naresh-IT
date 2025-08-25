#include <stdio.h>

int main() {

    int no;
    int total = 0;

    scanf("%d", &no);

    for(int i = 1; i <= no ; i++)
    {
        total = total * 10 + i;
    }

    printf("\n%d", total);

    return 0;
}