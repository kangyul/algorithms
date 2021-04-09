//
//  main.c
//  recursiveFunc
//
//  Created by Yul Kang on 2021/04/09.
//

#include <stdio.h>

void Recursive(int num)
{
    if(num<=0) return;
    printf("Recursive Call! %d \n", num);
    Recursive(num-1);
}

int main(int argc, const char * argv[]) {
    Recursive(3);
    return 0;
}
