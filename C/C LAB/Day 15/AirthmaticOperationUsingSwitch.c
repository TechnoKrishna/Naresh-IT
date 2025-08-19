#include<stdio.h>
#include<math.h>

int main()
{

    int a, b;
    char ch;

    scanf("%d %d %c", &a, &b, &ch);

    switch(ch)
    {
        case '+':
            printf("Addition is: %d", a + b);
            break;
        case '-':
            printf("Subtraction is: %d", a - b);
            break;
        case '*':
            printf("Multiplication is: %d", a * b);
            break;
        case '/':
            printf("Division is: %d", a/ b);
            break;
        case '%':
            printf("Modulus is: %d", a % b);
            break;
        default:
            printf("Invalid");
    }

    return 0;
}