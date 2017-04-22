package com.gmail.s12348.evgen;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BlackList blackList = new BlackList();
		blackList.addToBlackList(String.class);
		blackList.addToBlackList(Integer.class);
		blackList.addToBlackList(File.class);
		System.out.println(blackList);

		Stek stek = new Stek();
		stek.addToStek(new File("a.txt"), blackList);
		stek.addToStek(1234, blackList);
		stek.addToStek(true, blackList);
		stek.addToStek("Hello world", blackList);
		stek.addToStek(false, blackList);
		stek.addToStek(Scanner.class, blackList);

		stek.searchInArray("Hello");
		stek.searchInArray(123);
		stek.searchLast();

		stek.deleteObjectFromArray();
		stek.deleteWithSearch("Hello");

		System.out.println(stek);

	}

}