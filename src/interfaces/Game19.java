package interfaces;

import java.util.Random;

interface Game{
    void toss();
}
interface GameFactory{
    Game GetGame();
}
class Coin implements Game{
    Random random = new Random();
     @Override
     public void toss() {
         int c = random.nextInt(2);
         if(c==1)
             System.out.println("Орёл");
         else System.out.println("Решка");
     }
 }
class CoinFactory implements GameFactory{
     @Override
     public Game GetGame() {
         return new Coin();
     }
 }
class Dice implements Game{
    Random random = new Random();
    @Override
    public void toss() {
        int c = random.nextInt(5);
        System.out.println("Dice roll: " + c);
    }
}
class DiceFactory implements GameFactory{
    @Override
    public Game GetGame() {
        return new Dice();
    }
}
public class Game19 {
    static void Throw(GameFactory gameFactory){
        Game game = gameFactory.GetGame();
        game.toss();
    }

    public static void main(String[] args) {
        Throw(new CoinFactory());
        Throw(new DiceFactory());
    }
}
