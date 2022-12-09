interface ChessPlayer{
    void move();
    void name();
}
class Queen implements ChessPlayer{
    public void move(){
        System.out.println("MOVES IN ALL DIRECTIONS AS MANY STEPS");
    }
    public void name(){
    System.out.println("QUEEN");
    }
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("MOVES IN ALL DIRECTIONS BUT JUST ONE STEP");
    }
    public void name(){
    System.out.println("KING");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("MOVES FORWARD, BACKWARD, LEFT AND RIGHT");
    }
    public void name(){
    System.out.println("ROOK");
    }
}

class Pawn implements ChessPlayer{
    public void move(){
        System.out.println("MOVES ONLY IN FORWARD DIRECTION BY ONE STEP");
    }
    public void name(){
    System.out.println("PAWN");
    }
}
public class Interfaces {
    Interfaces(){
        System.out.println("HELLO WORLD");
    }
    public static void main(String[] args) {
        Interfaces i = new Interfaces();
        Queen q = new Queen();
        q.move();
        q.name();

        King k = new King();
        k.move();
        k.name();

        Pawn p = new Pawn();
        p.move();
        p.name();

        Rook r = new Rook();
        r.move();
        r.name();
    }
}
