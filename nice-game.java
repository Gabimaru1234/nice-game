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
    int cnt =0;
    while(cnt < z)
        {
            if(nice == 0)
            {
                if(!map[x][y-1].equals("#")||(y-1)>=0)
                {
                    y-=1;
                    cnt+=1;
                }
                if(map[x][y-1].equals("#"))
                {
                    
                    nice=1;
                    
                }

            }
            if(nice == 1)
            {
                if(!map[x+1][y].equals("#")||(x+1)<=w)
                {
                    x+=1;
                    cnt+=1;
                }
                if(map[x+1][y].equals("#"))
                {
                    
                    nice=2;
                    
                }
            }
            if(nice == 2)
            {
                if(!map[x][y+1].equals("#")||(y+1)<=h)
                {
                    y+=1;
                    cnt+=1;
                }
                if(map[x][y+1].equals("#"))
                {
                    
                    nice=3;
                    
                }
            }
            if(nice == 3)
            {
                if(!map[x-1][y].equals("#")||(y-1)>=0)
                {
                    x-=1;
                    cnt+=1;
                }
                if(map[x-1][y].equals("#"))
                {
                    
                    nice=0;
                    
                }
            }
        }
    printf("%d %d",sx,sy);
    return 0;
}