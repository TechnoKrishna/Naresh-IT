#include<stdio.h>

int main()
{
    char emp = 'M';
    float salary = 50000;
    char c = '%';

    // scanf("%c %f", emp, salary);

(emp == 'M') ? printf("Final Salary with 10%c bonus = %.2f", c, (salary + (salary*10)/100)) : (emp == 'M') ? printf("Final Salary with 5%c bonus = %.2f", c, (salary + (salary*5)/100)) : printf("Error");

    return 0;
}