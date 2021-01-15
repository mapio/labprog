#include <stdio.h>

int main(int argc, char *argv[]) {
    int somma, x;

    somma = 0;
    while (scanf("%d", &x) != EOF) somma += x;
    printf("%d\n", somma);

    return 0;
}
