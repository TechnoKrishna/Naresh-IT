#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int main()
{
char ch;
printf("Enter a charater "); ch=getchar();
if(islower (ch))ch=toupper (ch);
else ch=tolower(ch);
printf( "Char = %c", ch);
return 0;
}