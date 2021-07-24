import java.util.*;
import java.lang.*;
import java.io.*;

class Snake{
	
	private int startingPosition;
	private int endingPosition;
	
	public Snake(int startingPosition, int endingPosition){
		this.startingPosition = startingPosition;
		this.endingPosition = endingPosition;
	}

	public int getSnakeStartingPosition(){
		return this.startingPosition;
	}
	
	public int getSnakeEndingPosition(){
		return this.endingPosition;
	}
}