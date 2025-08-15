#include <stdio.h>
#include <conio.h>
int main()
{
    int id, tel, eng, hin, mat, sci, soc, tot, pass = 0;
    char name[20];
    float avg;
    printf("Enter stu id, name, 6 sub marks ");
    scanf("%d%s%d%d%d%d%d%d", &id, name, &tel, &eng, &hin, &mat, &sci, &soc);
    tot = tel + eng + hin + mat + sci + soc;
    avg = tot / 6.0;
    printf("%s id=%d, Tot=%d, Avg=%.2f, Grade=", name, id, tot, avg);
    if (tel >= 35 && eng >= 35 && hin >= 35 && mat >= 35 && sci >= 35 && soc >= 35)
    {
        pass = 1;
    }
    if (pass == 0)
    {
        puts("Failed");
    }
    else if (avg >= 80)
    {
        puts("Distinction");
    }
    else if (avg >= 60)
    {
        puts("1st class");
    }
    else if (avg >= 50)
    {
        puts("2nd class");
    }
    else
    {
        puts("3rd class");
    }
    return 0;
}