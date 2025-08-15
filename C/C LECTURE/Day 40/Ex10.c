#include <stdio.h>
#include <conio.h>

int main() {

    char ch;
    
    printf("Enter any character"); 
    scanf("%c" ,&ch);

    if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z' )puts("lt is an Alphabet"); else puts("lt is not an Alphabet");

    return 0;
}