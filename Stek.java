package com.gmail.s12348.evgen;

import java.util.ArrayList;

public class Stek {

	private ArrayList<Object> stackArray = new ArrayList<Object>();

	public Stek() {
		super();
	}

	public void addToStek(Object obj, BlackList bl) {
		if (!bl.controlObject(obj)) {
			stackArray.add(obj);
			System.out.println("Object " + obj + ") was added to stek");
		} else {
			System.out.println("Object " + obj + " on the blacklist");
		}
	}

	public void searchInArray(Object obj) {
		int c = 0;
		for (int i = 0; i < stackArray.size(); i++) {
			if (stackArray.get(i).equals(obj)) {
				System.out.println("Object " + obj + " is present in this stek on the " + i + " position");
				c += 1;
			}
		}
		if (c == 0) {
			System.out.println("Object " + obj + " is absent in this stek");
		}
	}

	public void deleteWithSearch(Object obj) {
		if (stackArray.get(stackArray.size() - 1).equals(obj)) {
			stackArray.remove(stackArray.size() - 1);
			System.out.println("Object " + obj + " was deleted from this stek");
		} else {
			System.out.println("Object " + obj + " wasn't deleted, not the last element in this stek");
			searchInArray(obj);
		}

	}

	public void deleteObjectFromArray() {
		Object obj = stackArray.get(stackArray.size() - 1);
		stackArray.remove(stackArray.size() - 1);
		System.out.println("Object " + obj + " was deleted from this stek");

	}

	public void searchLast() {
		System.out.println("The last object in this stek is " + (stackArray.get(stackArray.size() - 1)));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Object object : stackArray) {
			sb.append(object).append(System.lineSeparator());
		}
		return sb.toString();
	}
}
