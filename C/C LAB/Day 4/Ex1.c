#include <stdio.h>
#include <conio.h>

int main() {

    int sub1 = 38, sub2 = 34, sub3 = 35, sub4 = 78, sub5 = 20;

    int pass = 0, fail = 0;

    printf("\nSubject 1 : %d", sub1, ((sub1 >= 35) && ++pass || ++fail));
    printf("\nSubject 2 : %d", sub2, ((sub2 >= 35) && ++pass || ++fail));
    printf("\nSubject 3 : %d", sub3, ((sub3 >= 35) && ++pass || ++fail));
    printf("\nSubject 4 : %d", sub4, ((sub4 >= 35) && ++pass || ++fail));
    printf("\nSubject 5 : %d", sub5, ((sub5 >= 35) && ++pass || ++fail));

    printf("\nPass %d & Fail %d", pass, fail);

    return 0;
}