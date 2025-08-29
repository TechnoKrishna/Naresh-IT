#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int m = 1;
    int a = 0;

    printf("Enter a No : ");
    scanf("%d", &no);

    while(no != 0)
    {
        a += no%10;
        m *= no%10;

        no /= 10;
    }

    // printf("%d %d", a, m);

    if(a == m)
    {
        printf("Spy Number");
    }
    else
    {
        printf("Not Spy Number");
    }


    return 0;
}