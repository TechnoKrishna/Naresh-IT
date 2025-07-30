#include <stdio.h>
#include <conio.h>

int main() {

    int m;

    printf("Enter Month NO Between 1-12 : ");
    scanf("%d", &m);

    puts(m < 1 || m > 12 ? "INVALID MONTH": m >= 3 && m <=6 ? "IT IS VERY HOT GURU" : m >= 7 && m <= 10 ? "IT IS RAINY SEASON GURU" : "IT IS VERY CHILLINNG GURU");

    return 0;
}