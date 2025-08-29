#include <stdio.h>
#include <conio.h>

int main() {

    int n = 1234, s = 0;

    while (n > 9)
    {
        for(s = 0; n != 0; n = n/10)
        {
            s += n % 10;
        }
        n = s;
    }
    if (n==1) printf("Magic No");
    else printf("Magic No");

    return 0;
}