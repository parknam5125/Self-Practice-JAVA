public class MoveablePoint implements Moveable{
    private int x, y;
    public MoveablePoint(){
        x = 0;
        y = 0;
    }
    public MoveablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
}
