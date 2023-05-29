package com.codingpractice;

class Mobile{
	private Game game;
	public Mobile() {
		
	}
	public Mobile(Game game) {
		this.game=game;
		
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game=game;
		
	}
	public void play() {
		game.playGame();
	}
	
}
abstract class Game{
	public abstract void playGame();
	
}
class CandySmash extends Game{
	
	public void playGame() {
		System.out.println("slide and win");
	}
}
class Numpuz extends Game{
	public void playGame() {
		System.out.println("click bottle,pour and win");
	}
}
public class Gameapplication {

	public static void main(String[] args) {
		Game game=new CandySmash();
		Mobile mobile=new Mobile(game);
		mobile.play();

	}

}
