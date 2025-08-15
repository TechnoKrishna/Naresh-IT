#include<stdio.h>
#include<conio.h>
int main()
{
float a,b;

int op;
start:
printf("Enter two numbers "); scanf("%f %f",&a,&b);
if(a==b) {puts("Both are equal");getch(); goto start;}
puts("------------------------------------------------------------------");
puts("\t\t 1. Bigger");
puts("\t\t 2. Smaller");
puts("\t\t 3. Exit");
puts("------------------------------------------------------------------");
printf("Enter ur option ");
scanf("%d",&op);
if(op==1) printf("%f is big", a>b?a:b);
if(op==2) printf("%f is small",a<b?a:b);
if(op==3) {puts("Application closed");
    return 0;
}

if(op<1||op>3) puts("Invalid selection");
goto start;

return 0;
}