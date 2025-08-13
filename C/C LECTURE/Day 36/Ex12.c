#include <stdio.h>
#include <conio.h>

int main() {

    // Read a baby age in no of days and find the baby age in years, months, weeks and days.

    int tdays, y, m, w, d;

    printf("Enter Baby Age in Days : ");
    scanf("%d", &tdays);

    y = tdays/365;
    m = tdays%365/30;
    w = tdays%365%30/7;
    d = tdays%365%30%7;

    printf("Baby age %d yers %d months %d weeks & %d days", y, m, w, d);


    return 0;
}