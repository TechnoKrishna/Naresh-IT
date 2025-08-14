#include <stdio.h>
#include <conio.h>
#include <string.h>

int main()
{
    char name[30];
    char bike[30];
    char problem[30];
    int type;
    float bill;
    int input;
    int age;
    float cost;
    float qyt;

    printf("Enter 2 for 2 Wheeler\n");
    printf("Enter 3 for 3 Wheeler\n");
    printf("Enter 4 for 4 Wheeler\n");
    printf("Enter Wheel Type : ");
    scanf("%d", &type);

    if (type == 2 || type == 3 || type == 4)
    {
        printf("\nEnter Vehicle Age : ");
        scanf("%d", &age);

        if (age > 8)
        {
            printf("\nEnter 1 for Tire Problem\n");
            printf("Enter 2 for Fuel Problem\n");
            printf("Enter 3 for Engine Problem\n");
            printf("Enter 4 for General Services Problem\n");
            printf("Select The Issue : ");

            scanf("%d", &input);

            if (input == 1 && type == 2)
            {
                cost = 400;
                printf("\nHow many tires are you facing issues with : ");
                scanf("%f", &qyt);

                bill = cost * qyt;
                strcpy(problem, "Tyre Problem");
            }
            else if(input == 2 && type == 2)
            {
                cost = 1500;
                bill = cost;
                strcpy(problem, "Fuel Problem");
            }
            else if(input == 3 && type == 2)
            {
                cost = 5000;
                bill = cost;
                strcpy(problem, "Engine Problem");
            }
            else
            {
                cost = 1000;
                bill = cost;
                strcpy(problem, "General Services Problem");
            }

            scanf("%49s", name);
            scanf("%49s", bike);

            printf("\nName : %s", name);

            printf("\nBike : %s", bike);

            printf("\nIssue : %s", problem);

            printf("\nBill : %.2f", bill);

        }
        else
        {
            printf("Your vehicle service will be done after a while.");
        }
    }
    else
    {
        printf("This service center does not accept vehicles other than 2-wheelers, 3-wheelers, and 4-wheelers");
    }

    return 0;
}

// 2 12 1 2 krishna Kawasaki