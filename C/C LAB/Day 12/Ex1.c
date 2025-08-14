#include<stdio.h>
int main(){
    float bill,surcharge,amount,total;
    scanf("%f",&bill);

    if(bill<=50){
        amount=bill*.50;
    }
    else if (bill <=150){
        amount=25+(bill-50)*.75;
    }
    else if (bill<=250){
        amount=100+(bill-150)*1.20;
    }
    else {
        amount=220+(bill-250)*1.50;
    }

    surcharge=amount*.20;

    total = surcharge+amount;

    printf("Total electricity bill: Rs. %.2f",total);
    

}