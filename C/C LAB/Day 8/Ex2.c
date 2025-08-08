#include <stdio.h>
#include <conio.h>

int main() {

    float a, b;
    char ch;

    printf("Enter A , B , Operator : ");

    scanf("%f %f %c", &a, &b, &ch);

    (ch == '+') ? printf("%.2f", a + b) : (ch == '-') ? printf("%.2f", a - b) : (ch == '*') ? printf("%.2f", a * b) : (ch == '/') ? printf("%.2f", a / b) : (ch == '%') ? printf("%.2f", (int)a % (int)b) : printf("INVALID");

    return 0;
}