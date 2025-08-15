#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf("Enter a charater "); ch=getchar();
if(ch>= 'a'&&ch<='z')ch-=32;
else ch+=32;
printf("Char = %c", ch);
return 0;
}