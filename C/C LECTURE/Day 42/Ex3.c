#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf( "Enter a charater "); scanf("%c",&ch);
if(ch>=97 && ch<=122)puts ("Lower case char");
else if(ch>=65&&ch<=90)puts("Upper case char");
else if(ch>=48&&ch<=57)puts("It is a Digit");
else if(ch==32)puts("It is a space");
else puts("It is a special char");
return 0;
}