#include <ctype.h>
#include <stdio.h>

int main(int argc, char *argv[]) {
    int ch;

    while ((ch = getchar()) != EOF)
        putchar(isalpha(ch) ? toupper(ch) : ch);

    return 0;
}
