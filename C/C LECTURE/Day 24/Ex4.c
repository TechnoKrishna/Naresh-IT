// Find lower case character or not without using if..else or ternary operator?

#include<stdio.h>
#include<conio.h>

int main()
{
    char ch;

    printf("Enter a Character : ");
    scanf("%c", &ch);

    ch >= 'a' && ch <= 'z' && printf("Lower Case Char") || printf("Not a Lower Case Char");

    (ch >= 97 && ch <= 122 || ch >=65 && ch <=90) && puts("\nIt is an Alphabet") || puts("\nNot an Alphabet");

    return 0;
}