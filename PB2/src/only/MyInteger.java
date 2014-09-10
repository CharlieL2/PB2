package only;

public class MyInteger {

	private int value;

	private MyInteger(int value) {
		this.value = value;
	}

	public int GetValue() {
		return this.value;
	}

	// even odd prime methods

	public boolean isEven() {
		return this.value % 2 == 0;
	}

	public boolean isOdd() {
		return this.value % 2 != 0;
	}

	public boolean isPrime() {
		if (this.value % 2 == 0)
			return false;
		int chk;
		for (chk = 3; chk * chk <= this.value; chk += 2)
			if (this.value % chk == 0)
				return false;
		return true;
	}

	// even odd prime methods, static

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	public static boolean isPrime(int value) {
		if (value % 2 == 0)
			return false;
		int chk;
		for (chk = 3; chk * chk <= value; chk += 2)
			if (value % chk == 0)
				return false;
		return true;
	}

	// even odd prime methods, myint

	public static boolean isEven(MyInteger myint) {
		return myint.value % 2 == 0;
	}

	public static boolean isOdd(MyInteger myint) {
		return myint.value % 2 != 0;
	}

	public static boolean isPrime(MyInteger myint) {
		if (myint.value % 2 == 0)
			return false;
		int chk;
		for (chk = 3; chk * chk <= myint.value; chk += 2)
			if (myint.value % chk == 0)
				return false;
		return true;
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger myint) {
		return myint.value == this.value;
	}

	public static int parseInt(char[] aR) {
		int add = Integer.parseInt(new String(aR));

		return add;
	}

	public static int parseInt(String aG) {
		int add = Integer.parseInt(aG);

		return add;
	}

}
