#include<stdio.h>

int main()
{
    float s1,s2,s3,s4,s5;
    float Total;
    float per;

    scanf("%f%f%f%f%f", &s1,&s2,&s3,&s4,&s5);

    if(s1 >= 35 && s2 >= 35 && s3 >= 35 && s4 >= 35 && s5 >= 35)
    {
        Total = s1 + s2 + s3 + s4 + s5;

        per = (Total / 500) * 100;

        switch((int)per)
        {
            case 90 ...100:
                printf("Total Marks: %.0f\n", Total);
                printf("Percentage: %.2f%%\n", per);
                printf("Grade: A", per);
                break;
            case 75 ...89:
                printf("Total Marks: %.0f\n", Total);
                printf("Percentage: %.2f%%\n", per);
                printf("Grade: B", per);
                break;
            case 50 ...74:
                printf("Total Marks: %.0f\n", Total);
                printf("Percentage: %.2f%%\n", per);
                printf("Grade: C", per);
                break;
            case 35 ...49:
                printf("Total Marks: %.0f\n", Total);
                printf("Percentage: %.2f%%\n", per);
                printf("Grade: D", per);
                break;
            Default:
                printf("Fail");
        }

    } 
    else
    {
        printf("Fail");
    }

    return 0;
}