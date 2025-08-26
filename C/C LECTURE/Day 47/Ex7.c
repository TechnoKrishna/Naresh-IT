#include <stdio.h>
#include <conio.h>

int main() {

    long n;
    int r, e, o, z;

    e = o = z = 0;

    printf("Enter a No : ");
    scanf("%ld", &n);

    do
    {
        r = n%10;

        if(r == 0)
        z++;
        else if(r%2==0)
        e++;
        else
        o++;

        n/=10;

    }while(n!=0);

    printf("%d Even, %d Odd, %d Zero's", e, o, z);

    return 0;
}