package com.est;

public class MyBase64 {
	public static void main(String[] args) {
		MyBase64 m=new MyBase64();
		String str="a2b4c12d9";
		m.convert(str);
	}
	static void printCharSeq(char c, int num) {
		while (num > 1) {
			System.out.print(c);
			num--;
		}
	}

void convert(String str) {
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int val = 0;
			if ((c[i] >= '0' && c[i] <= '9')) {
				// val=c[i]-48;
				try {
					if (c[i + 1] >= '0' && c[i + 1] <= '9') {
						String a1 = String.valueOf(c[i] - 48);
						String a2 = String.valueOf(c[i + 1] - 48);
						val = Integer.parseInt(a1 + a2);
						// System.out.println(val);
						printCharSeq(c[i - 1], val);
						i++;
					} else {
						val = c[i] - 48;
						printCharSeq(c[i - 1], val);
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					val = c[i] - 48;
					printCharSeq(c[i - 1], val);
				}
			} else {
				System.out.print(c[i]);
				// printCharSeq(c[i], val);
			}
		}
	}

}
