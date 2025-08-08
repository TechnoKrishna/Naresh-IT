#include <stdio.h>
#include <conio.h>

int main() {

    int m;

    printf("Enter Your Marks : ");

    scanf("%d", &m);

    (m >= 90) ? printf("Grade A") : (m >= 80 && m <=89) ? printf("Grade B") : (m >= 70 && m <=79) ? printf("Grade C") :(m >= 60 && m <=69) ? printf("Grade D") :(m < 60) ? printf("Grade F") : printf("Invalid");

    return 0;
}