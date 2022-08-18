import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public Solution(...)
    {
        String [][] map = new String[w][h];
    }

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        //數字近來
        int w = in.nextInt();
        
        int z = int nextInt();
        //make q into array
        
        int q = String nextLine();

        for(int i=0; i< w ; i++)
        {
            for(int o=0; o < h ; o++)
            {
                map[i][o]=in;
            }
        }


        
        for(int i=0; i<w.length();i++)
        {
            if(i.substring(i).equals(" "))
            {
                int x = i.substring(0,i)
                int y = i.substring(i,w.length())
                //x 跟 y 
            }
        }
        int cnt =0;
        int nice =0;
        //如果變方向，
        //0就是往上，
        //1就是往右，
        //2上往下，
        //3是往左

        // suppose "map"  is the map it is 2d array
        }
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
        // 這裡寫如果 上面有# 或是碰到邊界 v
        // 方向往右轉 v
        //如果沒有 就cnt +1 v 
        // 



        System.out.println("cnt");
    }
}