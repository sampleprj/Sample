package DebugMain;

import Debugging.Counter;

public class Main {
public static void main(String[] args)
{
	Counter counter = new Counter();
	counter.count();
	
	System.out.println("We have counted" + counter.getResult());
}
	
}
