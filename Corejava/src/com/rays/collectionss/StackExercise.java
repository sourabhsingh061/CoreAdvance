package com.rays.collectionss;

import java.util.Stack;

public class StackExercise {
	public static void main(String[] args) {
		Stack s = new Stack();
       
        s.push('A');
        s.push('B');
        s.push('C');
        s.push('D');
        s.push('E');
        s.push('F');
        s.push('G');
        s.push('H');
        s.push('I');
        s.push('J');
        s.push('K');
        s.push('L');
        s.push('M');
        s.push('N');
        s.push('O');
        s.push('P');
        s.push('Q');
        s.push('R');
        s.push('S');
        s.push('T');
        s.push('U');
        s.push('V');
        s.push('W');
        s.push('X');
        s.push('Y');
        s.push('Z');
        
        System.out.println("1st stack is : "+ s);
        
        Stack st = new Stack();
        while(s.size()>0) {
        	Object o =s.pop();
        	st.push(o);
        	
        	//System.out.print("the value is"+st);
        }
        
        System.out.println(st);
        }

}
