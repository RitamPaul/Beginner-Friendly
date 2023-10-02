#include <stdio.h>

int main() {
    int n, sum = 0;

    printf("Enter a positive integer: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Please enter a positive integer.\n");
    } else {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        printf("Sum of natural numbers from 1 to %d = %d\n", n, sum);
    }

    return 0;
}
