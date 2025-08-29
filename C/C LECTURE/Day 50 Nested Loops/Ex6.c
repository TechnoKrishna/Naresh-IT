#include <stdio.h>
#include <conio.h>

int main() {

    int n = 5677, s = 0;

    while (n > 9)
    {
        for(s = 0; n != 0; n = n/10)
        {
            s += n % 10;
        }
        n = s;
    }
    printf("Generic root = %d", s);

    return 0;
}