#include<stdio.h>
#include<math.h>
#include<stdbool.h>

//Bai 218

bool doiXung(int n) {
	if (n >= 0 && n <= 9) return true;
	int b[20];
	int k = 0;
	while(n > 0) {
		b[k] = n % 10;
		k++;
		n/=10;
	}
	int i;
	for (i = 0; i <= k/2; i++) {
		if(b[i] != b[k-i-1]) return false;
	}
	return true;
}

void timKq(int a[], int n) {
	int i;
	for (i = 0; i < n; i++) {
		if(doiXung(a[i])) printf("%d ", a[i]);
	}
}

int main () {
	int n;
	printf("Nhap n: ");
	scanf("%d", &n);
	
	int a[n];
	int i;
	for (i = 0; i < n; i++) {
		printf("Nhap a[%d] : ", i);
		scanf("%d", &a[i]);
	}
	
	timKq(a, n);
	return 0;
}
