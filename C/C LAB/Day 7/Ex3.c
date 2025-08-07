#include <stdio.h>

int main()
{
    char c;

    scanf("%c", &c);

    (c >= 'a' && c <= 'z') ? printf("%c is a lowercase letter.", c) : (c >= 'A' && c <= 'Z') ? printf("%c is an uppercase letter.", c): printf("Invalid");


    return 0;
}