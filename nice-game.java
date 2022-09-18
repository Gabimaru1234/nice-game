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
    int nx = sx;
    int ny = sy;
    
    int cnt =0;
    int nice =0;
    // 算跑一圈 多少 
    // q --> 找到 就+1 跳出來
    // n % 找到的數字 --> 數字
    // 跑 這個數字 步
    // print 座標
    int cnt1=0;
    int originalpnt=0;
    while(true)
    {

        
            

                if(nx==sx && ny==sy)
                {   

                    originalpnt+=1;

                    
                    if(originalpnt==3)
                    //第二次碰到原點
                    {
                        
                        fprintf(stderr,"%d \n", cnt1);
                        break;
                    }
                    cnt1=0;
                }
            
        if(nice==0)
        {   
            
            if((sy-1)>=0 && map[sy-1][sx]!='#')
            {
                cnt1+=1;
                sy-=1;
            }
            else if((sy-1)<0||map[sy-1][sx]=='#')
            {
                nice=1;
            }
        }
        if(nice==1)
        {
            if((sx+1)<=w && map[sy][sx+1]!='#')
            {
                cnt1+=1;
                sx+=1;
            }
            else if((sx+1)>w||map[sy][sx+1]=='#')
            {
                nice=2;
            }
        }
        if(nice==2)
        {
            if((sy+1)<=h && map[sy+1][sx]!='#')
            {
                cnt1+=1;
                sy+=1;
            }
            else if((sy+1)>h||map[sy+1][sx]=='#')
            {
                nice=3;
            }
        }
        if(nice==3)
        {
            if((sx-1)>=0 && map[sy][sx-1]!='#')
            {
                cnt1+=1;
                sx-=1;
            }
            else if((sx-1)<0||map[sy][sx-1]=='#')
            {
                nice=0;
            }
        } 
    }

    int niccce= 0;
    niccce = cnt1;

    fprintf(stderr,"sx=%d sy=%d\n",sx,sy);
    while(cnt<(n-cnt1)%cnt1)
    //他走到原點的時候可以算碰到原點時間
    //算比一圈小的(先把回原點步驟扣掉)
    {
        if(nice==0)
        {
            if((sy-1)>=0 && map[sy-1][sx]!='#')
            {
                cnt+=1;
                sy-=1;
            }
            else if((sy-1)<0||map[sy-1][sx]=='#')
            {
                nice=1;
            }
        }
        if(nice==1)
        {
            if((sx+1)<=w && map[sy][sx+1]!='#')
            {
                cnt+=1;
                sx+=1;
            }
            else if((sx+1)>w||map[sy][sx+1]=='#')
            {
                nice=2;
            }
        }
        if(nice==2)
        {
            if((sy+1)<=h && map[sy+1][sx]!='#')
            {
                cnt+=1;
                sy+=1;
            }
            else if((sy+1)>h||map[sy+1][sx]=='#')
            {
                nice=3;
            }
        }
        if(nice==3)
        {
            if((sx-1)>=0 && map[sy][sx-1]!='#')
            {
                cnt+=1;
                sx-=1;
            }
            else if((sx-1)<0||map[sy][sx-1]=='#')
            {
                nice=0;
            }
        }

    }
    printf("%d %d", sx, sy);
    //printf("%d", sy ,sx);
    
    // 大圈 跟 小圈 
    // 要想辦法找小圈的大小
    //大圈上面找過
    // . --------|
    // ^         |
    // |         |
    // ----------|

    /*like this-->
    xy : starting pt
    nx, ny : current
    cnt : 1 small circle 
    int i=0
    if nx, ny = xy
    int i=1
    
    --> when i =1
    每棟一次 cnt++
    最後回到原點 i=0
    cnt --> 一圈
    */
}