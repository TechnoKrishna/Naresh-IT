#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int main()
{
char ch;
printf( "Enter a charater "); ch=getchar();
if(islower(ch) )puts ("Lower case char");
else if(isupper(ch))puts("Upper case char");
else if(isdigit(ch))puts("It is a Digit");
else if(isspace(ch))puts("It is a space");
else puts("It is a special char");
return 0;
}