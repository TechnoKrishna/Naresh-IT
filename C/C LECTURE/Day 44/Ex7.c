#include <stdio.h>
#include <conio.h>
int main()
{
    char ch;

    printf("Enter a character ");
    scanf("%c", &ch);

    if (ch >= 'A' && ch <= 'Z')
        ch += 32;
    if (ch >= 'a' && ch <= 'z')
    {
        switch (ch)
        {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            puts("Vowel");
            break;
        default:
            puts("Consonant");
        }
    } else if(ch>='0' && ch <='9') puts("It is a digit");
    else puts("It is a special char");
    return 0;
}