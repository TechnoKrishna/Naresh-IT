#include <conio.h>
#include <string.h>
int main()
{
    char user[20], pass[20], cap[20];

    printf("Enter user id ");
    scanf("%s", user);
    printf("Enter pass word");
    scanf("%s", pass);
    if (strcmp(user, "Kishore") == 0 && strcmp(pass, "Indian") == 0 && strcmp(cap, "Hyd-1") == 0)
        puts("Welcome to HDFC BANK");
    else
        puts("Invalid User id/Pass word / Captcha");
    return 0;
}