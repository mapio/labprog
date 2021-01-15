#include <stdio.h>
#include <string.h>

#define MAX_LEN 256

int main(int argc, char *argv[]) {
    int n, tot;
    char buffer[MAX_LEN + 1];

    tot = n = 0;
    while (fgets(buffer, MAX_LEN + 1, stdin) != NULL) {
        tot += strlen(buffer) - 1;
        n++;
    }

    printf("%f", (float)tot / n);

    return 0;
}
