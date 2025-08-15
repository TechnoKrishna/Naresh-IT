#include <stdio.h>
#include <conio.h>

int main() {

    char ch;
    
    printf("Enter any character"); 
    scanf("%c" ,&ch);

    if(ch>=97 && ch<=122 || ch>=65 && ch<=90 )puts("lt is an Alphabet"); else puts("lt is not an Alphabet");

    return 0;
}