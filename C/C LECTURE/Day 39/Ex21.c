#include <stdio.h>
#include <conio.h>

int main() {

    char ch;

    printf("Enter A char : ");
    scanf("%c", &ch);

    if (ch >= 'a' && ch <= 'z') printf("Lower Case");

    return 0;
}