#include <stdio.h>
#include <conio.h>

int main() {

    // Read a baby age in no of days and find the baby age in years, months, weeks and days.

    long int tdays, y, m, w, d;

    printf("Enter Baby Age in Days : ");
    scanf("%ld", &tdays);

    y = tdays/365;
    m = tdays%365/30;
    w = tdays%365%30/7;
    d = tdays%365%30%7;

    printf("Baby age %ld yers %ld months %ld weeks & %ld days", y, m, w, d);

    return 0;
}