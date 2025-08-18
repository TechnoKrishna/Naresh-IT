#include<stdio.h>
#include<conio.h>
#include<math.h>
int main()
{
float a,b;
char op;

abc:
// clrscr();
puts("-------------------------------------------------------------------");
printf("Enter two numbers "); scanf("%f %f",&a, &b);
puts("-------------------------------------------------------------------");
puts("\t\t\t OPERATIONS");
puts("-------------------------------------------------------------------");
puts("\t\t\t + . Add");
puts("\t\t\t - . Sub");
puts("\t\t\t * . Mul");
puts("\t\t\t % . Mod");
puts("\t\t\t / . Div");
puts("\t\t\t ^ . Power");
puts("\t\t\t E . Exit");
puts("-------------------------------------------------------------------");
// flushall();
printf("\t\t\t Enter Ur option[ ]\b\b"); scanf(" %c",&op);
/*printf("\n\n\n\n\n\n\n\t\t\t\t\t\t\t");*/

// gotoxy(50,18); /* x-col, y-row */
switch(op)
{
case '+': printf("Sum = %.2f",a+b);break;
case '-': printf("Sub = %.2f",a-b);break;
case '*': printf("Mul = %.2f",a*b);break;
case '%': printf("Mod = %.2f",fmod(a,b));break;
case '/': printf("Div = %.2f",a/b);break;
case '^': printf("Power = %.2f",pow(a,b));break;
case 'e': case 'E': return 0;
default: puts("Invalid choice");
}
getch();
goto abc;
return 0;
}