package com.rays.streamapii;

import java.util.Arrays;
import java.util.List;

public class TestStreamsApi {
	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,4,4,5,6,6,7,7,7,8,9,10,10,16,17,18);
		List <String> list2= Arrays.asList("java", "python", "RAYS","spring");

		//list.stream().forEach(li-> System.out.println(li));
		
		//list.stream().distinct().forEach(li-> System.out.println(li));
		
		//list2.stream().map(li2->li2.toUpperCase()).forEach(li2-> System.out.println(li2));
		
		
		//list2.stream().sorted().forEach(li2-> System.out.println(li2));
		
		//list.stream().limit(3).forEach(li-> System.out.println(li));

		
		//list2.stream().limit(3).forEach(li2-> System.out.println(li2));
		
		
		//list2.stream().limit(3).skip(2).forEach(li2-> System.out.println(li2));

		
		list.stream().filter(li ->li%4==0 ).forEach(li-> System.out.println(li));
		



		 
	}
}