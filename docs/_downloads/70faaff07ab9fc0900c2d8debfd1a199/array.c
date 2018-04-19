#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int x, *v, n, i;

    n = 1;
    v = (int *)malloc(sizeof(int) * n);

    i = 0;
    for (;;) {
        scanf("%d", &x);
        if (x == 0) break;
        if (i == n) {
            n *= 2;
            v = (int *)realloc(v, sizeof(int) * n);
        }
        v[i++] = x;
    }

    n = i;
    v = (int *)realloc(v, sizeof(int) * n);

    for (i = n - 1; i >= 0; i--)
        printf("%d\n", v[i]);

    free(v);

    return 0;
}
