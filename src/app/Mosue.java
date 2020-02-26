package app;


/**
 * Mosue
 */
public class Mosue {

    public static int ExitX = 8;
    public static int ExitY = 10;
    public static int[][] Maze = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1},
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
        {1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1},
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1},
        {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public static void main(String[] args) {
        int x, y;
        TraceRecord path = new TraceRecord();
        x = 1;
        y = 1;

        System.out.println("[迷宮的路徑(0 的部分)]\n");
        printMaze();
       
        while (x<=ExitX && y<=ExitY) {
            Maze[x][y] = 2;
            if (Maze[x-1][y]==0) {
                x -= 1;
                path.insert(x, y);
            }
            else if (Maze[x+1][y]==0) {
                x += 1;
                path.insert(x, y);
            }
            else if (Maze[x][y-1]==0) {
                y -= 1;
                path.insert(x, y);
            }
            else if (Maze[x][y+1]==0) {
                y += 1;
                path.insert(x, y);
            }
            else if (checkExit(x, y, ExitX, ExitY)) {
                break;
            }
            else {
                path.delete();
                x = path.last.x;
                y = path.last.y;
            }
        }

        System.out.println("[老鼠走過的路徑(2 的部分)]\n");
        printMaze();
    }

    public static void printMaze(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(Maze[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static boolean checkExit(int x, int y, int ex, int ey){
        if (x==ex && y==ey) {
            if (Maze[x-1][y]==1 || Maze[x+1][y]==1 || Maze[x][y-1]==1 || Maze[x][y+1]==2) {
                return true;
            }
            else if (Maze[x-1][y]==1 || Maze[x+1][y]==1 || Maze[x][y-1]==2 || Maze[x][y+1]==1) {
                return true;
            }
            else if (Maze[x-1][y]==1 || Maze[x+1][y]==2 || Maze[x][y-1]==1 || Maze[x][y+1]==1) {
                return true;
            }
            else if (Maze[x-1][y]==2 || Maze[x+1][y]==1 || Maze[x][y-1]==1 || Maze[x][y+1]==1) {
                return true;
            }
        }
        return false;
    }
}