package com.rony.rohan.Algorithm.recursion.backtracking;

import java.util.ArrayList;
// Amazon
public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3)); // 3x3 maze , 6 ways we can reach our destiny
        path("",3,3);
        System.out.println(pathRet("",3,3));
        System.out.println(pathRetDiagonal("",3,3));

        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathWithObstacles("",board,0,0);
    }

    static int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }

    static void path(String p,int r,int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + 'D',r-1,c);
        }
        if(c > 1){
            path(p + 'R',r,c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathRet(p + 'D',r-1,c)); //Down
        }
        if(c > 1){
            list.addAll(pathRet(p + 'R',r,c - 1)); //Right
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p + 'D',r-1,c-1));
        }
        if(r > 1){
            list.addAll(pathRetDiagonal(p + 'V',r-1,c)); // \ vertical ,cross
        }
        if(c > 1){
            list.addAll(pathRetDiagonal(p + 'R',r,c - 1));
        }
        return list;
    }

    static void pathWithObstacles(String p,boolean[][] maze,int r,int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length -1){
            pathWithObstacles(p + 'D',maze,r+1,c);
        }
        if(c < maze[0].length - 1){
            pathWithObstacles(p + 'R',maze,r,c + 1);
        }
    }
}
