#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    int somma, i;

    somma = 0;
    for (i = 1; i < argc; i++) somma += atoi(argv[i]);
    printf("%d\n", somma);

    return 0;
}
