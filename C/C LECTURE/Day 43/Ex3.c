#include <conio.h>
#include <string.h>
int main()
{
    char user[20], pass[20], cap[20];
    printf("Enter user id ");
    scanf("%s", user);
    printf("Enter pass word ");
    scanf("%s", pass);
    printf("Enter captcha");
    scanf("%s", cap);
    if(strcmp(user, "Kishore") == 0)
    {
        if(strcmp(pass, "Indian") == 0)
        {
            if(strcmp(cap, "Hyd-1") == 0)
            {
                puts("Welcome to IRCTC");
            }
            else
                puts("Invalid Captcha");
        }
        else
            puts("Invalid Pass word");
    }
    else
        puts("Invalid User id");
    return 0;
}