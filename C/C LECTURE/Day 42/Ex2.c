#include<stdio.h>
#include<conio.h>
int main()
{

char ch;
printf("Enter a charater "); scanf("%c",&ch);
if(ch>='a' && ch<='z' )puts ("Lower case char");
else if(ch>='A'&&ch<='Z')puts ("Upper case char");
else if(ch>='0'&&ch<='9')puts("It is a Digit");
else if(ch==' ')puts("It is a space");
else puts("It is a special char");

return 0;
}