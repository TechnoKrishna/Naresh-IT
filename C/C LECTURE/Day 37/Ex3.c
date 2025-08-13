#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <dos.h>

int main() {

    start:

    // sound(random(1000));

    textcolor(random(16));

    _cprintf("krishna");

    delay(50);

    goto start;

    return 0;
}