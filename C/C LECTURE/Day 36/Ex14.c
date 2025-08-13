#include <stdio.h>
#include <conio.h>

int main() {

//  Read baby age in years, months, weeks and days. Find baby age in days.

    long int tdays, y, m, w, d;

    printf("Enter Baby Age in Years, Months, Weeks & Days : ");
    scanf("%ld %ld %ld %ld", &y, &m, &w, &d);

    tdays = y*365 + m*30 + w*7 + d;

    printf("Baby Age %ld Days ", tdays);

    return 0;
}