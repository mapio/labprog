#include <stdio.h>

int main(void) {
    int p, i;
    char buffer[4];

    p = 1;
    for (i = 0; i < 10; i++) {
        sprintf(buffer, "%d", p);
        putchar(buffer[0]);
        p *= 2;
    }
    putchar('\n');

    return 0;
}
