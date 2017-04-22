package com.gmail.s12348.evgen;

public class BlackList {

	private Class<?>[] blackListArray = new Class<?>[0];

	public BlackList() {
		super();
	}

	public void addToBlackList(Class<?> cl) {
		if (!controlBlackList(cl)) {
			resizeArray();
			blackListArray[searchPosition()] = cl;
		}
	}

	private boolean controlBlackList(Class<?> cl) {
		for (Class<?> classOne : blackListArray) {
			if (classOne == cl) {
				return true;
			}
		}
		return false;
	}

	public void resizeArray() {
		Class<?>[] temp = new Class<?>[blackListArray.length + 1];
		System.arraycopy(blackListArray, 0, temp, 0, blackListArray.length);
		blackListArray = temp;
	}

	public int searchPosition() {
		int i = 0;
		for (i = 0; i < blackListArray.length;) {
			if (blackListArray[i] != null) {
				i += 1;
			} else {
				break;
			}

		}
		return i;
	}

	public boolean controlObject(Object obj) {
		if (obj == null) {
			return false;
		}
		Class<?> cl = obj.getClass();
		System.out.println(cl);
		return controlBlackList(cl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Class<?> class1 : blackListArray) {
			sb.append(class1).append(System.lineSeparator());
		}
		return sb.toString();
	}

}
