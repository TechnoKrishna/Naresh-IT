#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
int bal=10000,ch,amt;

puts("SBI MENU");

puts("-------------------------------");
puts("1. Deposit");
puts("2. Withdrawl");
puts("3. Bal enquiry");
puts("-------------------------------");
printf("Enter ur choice ");scanf("%d",&ch);
if(ch==1)
{
printf("Enter amount to deposit "); scanf("%d",&amt);
bal+=amt;
printf("Ur current bal is %d",bal);
}
else if(ch==2)
{
printf("Enter amount to Withdraw "); scanf("%d",&amt);
if(amt<bal)
{
printf("Take the amount %d\n",amt, bal-=amt);

printf("Ur bal is %d",bal);
}
else puts("Insufficient balance ");
}
else if(ch==3) printf("Ur bal is %d",bal);
else puts("Invalid selection");
getch();
}