#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

void show() /* user defined function definition_*/
{
    puts("Good afternoon");
    exit(0);
    puts("Good evening");
}

int main()
{

    puts("Good morning");
    show(); /* fun calling */
    puts("Good night");

    return 0;
}