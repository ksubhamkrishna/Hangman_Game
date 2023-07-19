// 5. The Char Type:-

/*
 * Char is a primitive type,it doesn't have any methods,it's just a bit of data it's not a class or an obkject so we can use == for it.
 * The default value for char is '\u0000' (Hexadecimal number - Unicode charcter for null character)(Unicode is is the method of encoding characters so that computers can display them basically) .
 * Char is not an object ,it's a primitive datatype,it's just a bit of data,Size = 2 bits.
 * char is designed to hold a single Unicode character.
 * The null unicode character or unicode 0 it's get displayed a nothing not even as blank in java.
 * Char is exactly 2 bytes & using a hexadecimal number will represent 2 bytes using 4 digits always.
 * Hexadecimal is used to represent numers from 0 to 15 0to 9 using same 0 to 9 and A,B,C,D,E,F for 10,11,12,13,14,15.
 * Char really in a way is a numeric type ,which can hold number & can hold a number get in them i.e. 2 bytes
 * Char is like a small int.
 * We can use charAt to get characters out of the String.
 */

// Java program to use and print emojis using Unicode encoding of different emojis for different programs in Java,Refer the website :- Search Unicode-> go to home.unicode.org (https://home.unicode.org/)/(https://unicode-table.com/en/emoji/)-> Search the unique characters hexadecimal 2 byte unicode encoding for characters and assign it to char to use and print emojis.

package hangmangame;

public class CharTypeForEmojis {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'B';
		System.out.println(c1 == c2);

		char c3 = '\u0000';
		System.out.println("'" + c3 + "'");

		char c4 = '\u00A9';
		System.out.println("'" + c4 + "'");

		char c5 = 65;
		System.out.println(c5);

	}

}