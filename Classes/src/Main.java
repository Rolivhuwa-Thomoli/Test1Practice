//Used concepts from later chapters like enum and arrays

import java.security.SecureRandom;

class Coin{
    public Main.Toss toss;
    Coin(int num){
        toss = (num==0)? Main.Toss.HEAD:Main.Toss.TAIL;
    }
}

public class Main {
    public static enum Toss{HEAD,TAIL}
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        Coin[] coins = new Coin[10]; //an array of 10 Coin
        for(int i=0;i<coins.length;i++){
            coins[i] = new Coin(generator.nextInt(2));//assign each Coin object memory
        }
        for(int i=0;i<coins.length;i++){
            System.out.println(coins[i].toss);
        }
    }
}
