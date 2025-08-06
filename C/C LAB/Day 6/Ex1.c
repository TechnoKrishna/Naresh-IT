#include <stdio.h>
#include <conio.h>

int main()
{
    char ch;
    scanf("%c", &ch);
    (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? printf("Vowel") : (ch >= 'A' && ch <= 'Z') ? printf("Consonant") : printf("Invalid");
}