//
//  ReadingString.c
//
//  Created by Yul Kang on 2021/04/10.
//

#include <stdio.h>

int main(void) {
    char str[50];
    int idx = 0;
    
    printf("Put String: ");
    scanf("%s", str);
    printf("Input: %s\n", str);
    
    printf("Printing as a character: ");
    while(str[idx] != 0) {
        printf("%c", str[idx]);
        idx++;
    }
    printf("\n");
    
    return  0;
}


