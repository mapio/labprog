#include <stdio.h>
#include <stdlib.h>

int compara(const void *px, const void *py) {
    int x = *(int *)px, y = *(int *)py;

    if (x < y) return -1;
    else if (x > y) return 1;
    return 0;
}

int main(void) {
    int i, n;

    int array[] = {6, 4, 5, 3, 1, 2};

    n = sizeof(array) / sizeof(array[0]);
    qsort(array, n, sizeof(array[0]), compara);

    for (i = 0; i < n; i++)
        printf("%d ", array[i]);
    printf("\n");

    return 0;
}
