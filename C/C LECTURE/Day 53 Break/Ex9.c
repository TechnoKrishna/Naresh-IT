#include <stdio.h>
#include <conio.h>

void show() /* user defined function definition_*/
{
    puts("Good afternoon");
    return;
    puts("Good evening");
}

int main()
{

    puts("Good morning");
    show(); /* fun calling */
    puts("Good night");

    return 0;
}