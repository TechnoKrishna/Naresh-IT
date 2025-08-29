#include <stdio.h>
#include <conio.h>

int main() {

    int n, m, c=0, s=0;

    printf("Enter a No : ");
    scanf("%d", &n);

    m=n;

    while (m!=0)
    {
        c++;
        m = m/10;
    }
    
    m=n;

    while (m!=0)
    {
        s += pow(m%10, c);
        m /= 10;
    }

    puts(n==s ? "Armstrong no" : "Not An Armstrong no");
    

    return 0;
}