#include <stdio.h>
#include <conio.h>

int main() {

    int n = 5;
    int f1 = 0;
    int f2 = 1;
    int f3;

    for (int i = 1; i <= n; i++)
    {
        printf(" %d", f1);
        f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
    }
    
    return 0;
}