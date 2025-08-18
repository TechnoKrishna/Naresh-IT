#include <stdio.h>

int main()
{
    char ch;

    scanf("%c", &ch);

    switch(ch)
    {
        case 'a' ...'z':
            printf("LowerCase");
            break;
        case 'A' ...'Z':
            printf("UpperCase");
            break;
        default:
            printf("Invalid");
    }

    return 0;
}