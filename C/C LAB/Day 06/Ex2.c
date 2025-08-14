#include <stdio.h>
#include <conio.h>

int main()
{

int temp;

scanf("%d", &temp);

(temp > 30) ? printf("Hot") : (temp >= 20 && temp <= 30) ? printf("Normal") : printf("Cold");

return 0;

}