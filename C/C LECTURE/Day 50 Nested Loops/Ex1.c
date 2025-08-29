#include <stdio.h>
#include <conio.h>

int main() {

    int n, i, s = 0;

    printf("Enter The No : ");
    scanf("%d", &n);

    for(i = 1; i <= n/2 ; i++)
    {
        if(n%i==0)
            s+=i;
    }
    puts(n==s?"Perfect No":"Not a Perfect No");

    return 0;
}