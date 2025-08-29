#include <stdio.h>
#include <conio.h>
int main()
{
    int n, m, r, f, s = 0;
    printf("Enter n value ");
    scanf("%d", &n);
    for (m = n; m != 0; m /= 10);
    {
        for (r = m % 10, f = 1; r > 1; r--)
        {
            f = f * r;
        }
        s += f;
    }
    puts(n == s ? "Strong no" : "Not a Strong no");
    return 0;
}