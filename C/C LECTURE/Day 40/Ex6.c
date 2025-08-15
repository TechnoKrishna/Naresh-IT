#include <stdio.h>
#include <conio.h>

int main()
{

    int a = 32767;

    if (a + 3 >= 32767) puts("Yes"); else puts("No");
    if (sizeof(1.2) == sizeof(float)) puts("Yes"); else puts ("No");
    if (sizeof (1.2f)==sizeof(float)) puts("Yes"); else puts ("No");
    if (5 && 5 == 5) puts ("Yes"); else puts ("No");
    if ( (5 && 5) == 5) puts ("Yes"); else puts ("No");

    return 0;
}