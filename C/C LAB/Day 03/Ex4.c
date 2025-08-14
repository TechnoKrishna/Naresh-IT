#include <stdio.h>
#include <conio.h>

int main() {

    int seconds = 3665;

    int hour = 3665 / 3600;

    int minute = (3665 - 3600) / 60;

    int second =  (3665 - 3600) % 60;

    printf("\n%d Hours", hour);
    printf("\n%d Minutes", minute);
    printf("\n%d seconds", second);

    return 0;
}