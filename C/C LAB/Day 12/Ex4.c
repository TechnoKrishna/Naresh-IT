#include<stdio.h>
int main(){
	int years;
	char ch = '%';
	scanf("%d",&years);
	if(years<2){
		printf("Not Eligible");
	}
	else if (years>=2 && years<=4){
		printf("15%c bonus",ch);
	}
	else if (years>=5 && years <=9){
		printf("15%c bonus",ch);
	}
	else if(years>=10){
		printf("20%c bonus",ch);
	}
	else printf("Not Eligible");
	
}