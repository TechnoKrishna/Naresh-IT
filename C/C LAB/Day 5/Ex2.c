#include <stdio.h>
#include <conio.h>

int main() {

    int total = 999;

    (total > 5000) ? printf("\n%d", (total - (total*10)/100)) : (total >= 1000 && total <= 5000) ? printf("\n%d", total - (total*5)/100) : printf("\n%d", total);

    return 0;
}