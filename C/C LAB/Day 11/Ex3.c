#include <stdio.h>

int main()
{

    char ch;
    scanf("%c", &ch);

    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
        printf("%c is Alphabet", ch);
    }
    else
    {
        printf("%c Is Not Alphabet", ch);
    }

    return 0;
}