#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main(){
    int w;
    int h;
    int sx;
    int sy;
    int direction = 1;
    int xx;
    int xy;
    int px;
    int py;
    int ix;
    int iy;
    int cr;
    scanf("%d%d",&w,&h);
    long long n;
    long long p;
    char map[11][21]={0};
    scanf("%lld",&n);
    fprintf(stderr, "%d %d %lld \n",w,h,n);
    for (int i = 0; i < h; i++) {
        scanf("%s",map[i]);

        for (int j = 0; j < w; j++) {
            if (map[i][j]=='O') {
                sx=j;
                sy=i;              
            }
            fprintf(stderr, "%c",map[i][j]);
        }
       fprintf(stderr, "\n");

    }
    printf("%d %d",sx,sy);
    return 0;
}