#include <stdio.h>
#include <string.h>

#define MAX_LINES 10
#define MAX_LEN 256

int main(void) {
    char *linea[MAX_LINES], buffer[MAX_LEN + 1];
    int i;

    i = 0;
    while (scanf("%s", buffer) != EOF)
        linea[i++] = strdup(buffer);

    while (i-- > 0)
        printf("%s\n", linea[i]);

    return 0;
}
