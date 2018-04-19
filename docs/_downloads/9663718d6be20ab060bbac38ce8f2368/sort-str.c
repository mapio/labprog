#include <stdio.h>
#include <stdlib.h>
#include <strings.h>

int compara(const void *ps, const void *pt) {
    char *s = *(char **)ps, *t = *(char **)pt;

    return strcmp(s, t);
}

int main(void) {
    int i, n;

    char *array[] = {"ciao", "mamma", "bella"};

    n = sizeof(array) / sizeof(array[0]);
    qsort(array, n, sizeof(array[0]), compara);

    for (i = 0; i < n; i++)
        printf("%s ", array[i]);
    printf("\n");

    return 0;
}
