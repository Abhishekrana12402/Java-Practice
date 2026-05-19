public class Interfaces {
    public static void main(String[] args) {
        Queen Q=new Queen();
        Q.moves();
        Bear B=new Bear();
        B.eats();
        B.lives();
        Goat G=new Goat();
        G.eats();
        G.lives();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
   public void moves(){
       System.out.println("moves up,dow,left,right,diagonally in all 4 directions");
    }
}
class Rook implements ChessPlayer{
   public void moves(){
       System.out.println(" moves up,down,left ,right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println(" moves up,down,left ,right, diagonal by 1 steps");
    }
}
interface Herbivores{
    void eats();
    void lives();
}
interface Carnivores{
    void eats();
    void lives();
}
class Bear implements Herbivores,Carnivores{
    public void eats(){
        System.out.println("Eats meat");
    }
    public void lives(){
        System.out.println(" mainly lives in jungle");
    }
}
class Goat implements Herbivores,Carnivores{
    public void eats(){
        System.out.println("Eats grass");
    }
    public void lives(){
        System.out.println(" can live in human residents ");
    }
}

