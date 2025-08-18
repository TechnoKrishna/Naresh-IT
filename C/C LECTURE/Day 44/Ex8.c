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
        switch (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
        case 1:
            puts("Vowel");
            break;
        default:
            puts("Consonant");
        }
    }
    else if (ch >= '0' && ch <= '9')
        puts("It is a digit");
    else
        puts("It is a special char");
    return 0;
}