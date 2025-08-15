#include <stdio.h>
#include <conio.h>
int main()
{
    int age;
    char gen;
    printf("Enter person age ");
    scanf("%d", &age);
    getchar();
    // flushall();
    printf("Enter gender ");
    scanf("%c", &gen);
    if (gen == 'm' || gen == 'M' || gen == 'f' || gen == 'F')
        if (age >= 21 || (gen == 'F' || gen == 'f') && age >= 18)
            puts("Eligible");
        else
            puts("Not Eligible");
    else
        puts("Invalid gender");
    return 0;
}