#include <stdio.h>
#include <conio.h>

int main() {

    int days = 500;

    int years = days / 365;

    int months = (days / 30) % 12;

    int day = (days / 30)-1;

    printf("\n%d Years", years);
    printf("\n%d Months", months);
    printf("\n%d Days", day);

    return 0;
}