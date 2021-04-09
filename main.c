//
//  main.c
//  practice_problems
//
//  Created by Yul Kang on 2021/04/09.
//

#include <stdio.h>


int AddToTotal(int num)
{
    static int total = 0;
    total += num;
    return total;
}


int main(int argc, const char * argv[]) {
    int num, i;
    for(i=0; i<3; i++)
    {
        printf("input%d: ", i+1);
        scanf("%d", &num);
        printf("Total: %d \n", AddToTotal(num));
    }
    return 0;
}
