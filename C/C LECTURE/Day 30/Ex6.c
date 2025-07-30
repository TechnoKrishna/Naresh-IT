#include <stdio.h>
#include <conio.h>

// Finding given char is alphabet or not using ternary operator?

int main() {

    char ch;

    printf("Enter a Character : "); 
    scanf("%c", &ch);

    puts(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ? "IT IS AN ALPHABET" : "NOT AN ALPHABET");

    return 0;
}