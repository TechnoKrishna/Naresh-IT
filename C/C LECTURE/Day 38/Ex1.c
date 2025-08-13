#include <stdio.h>
#include <conio.h>

int main() {

    goto a;

    c:

    puts("Hyd");

    goto last; // if this

    getch(); return; // or this

    getch(); exit(0); // or this

    b:

    puts("Ameerpet");

    goto c;

    a:

    puts("Naresh IT");

    goto b;

    last:

    return 0;
}