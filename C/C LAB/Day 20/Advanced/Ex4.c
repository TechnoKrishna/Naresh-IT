#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int s = 9;
    int m = 0;
    int c;

    printf("Enter a No : ");
    scanf("%d", &no);

    while(no != 0)
    {
        c = no % 10;

        (m < c) ? m = c : printf("");
        (s > c) ? s = c : printf("");

        no/=10;
    }

    printf("Largest is %d & Smallest is %d", m, s);


    return 0;
}