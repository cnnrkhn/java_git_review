/**
 *  Controls a game.
 *
 *  @author Connor Khin
 *  @version 1/28/23
 */
public abstract class Game {
    
    /**
     *  Takes input for the game.
     */ 
    public abstract void input();
   
    /**
    *   Plays a turn in the game.
    *
    *   @return boolean returns whether or not the gmae should continue running
    */ 
    public abstract boolean playTurn();
 
    /**
     *  Outputs the game state.
     */ 
    public abstract void output();
}
