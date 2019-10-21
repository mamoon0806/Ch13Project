package edu.seminolestate.exceptions;

public class InvalidArgumentException extends Exception {
	public InvalidArgumentException(){
		super("Invalid values sent to method");
	}
	public InvalidArgumentException(String msg){
		super(msg);
	}
}