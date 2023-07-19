// 7. String Builder.

// Some Important points:-

/*
 * String builder is used for concatenating Strings.
 * In java,String classes are final that means we can't change a String.
 * When we are Appending sStrings in a String,Specially when you are doing hat in a loop,You Should really use StringBuilder Class b/c this involves the unnecessary creation of Strings when using Strings instead of St4ring Builder class.
 * If you are ever concatenating Strings in a loop usually it's better to use String Builder,b/c it's ore efficient and will use less memory.
 * String Builder avoids creating unnecessary new Strings. 
 */

// Program to declare String Builder Declare,Append and use String Builder and All possible ways to append a String.

package hangmangame;

public class StringBuilderDeclareUseAppendStrings {

	public static void main(String[] args) {

		String text = "I ";
		text += "am ";
		text += "a ";
		text += "giraffe ";
		System.out.println(text);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("I ");
		sb1.append("am ");
		sb1.append("a ");
		sb1.append("herring ");
		System.out.println(sb1);

		String animal = "otter";
		StringBuilder sb2 = new StringBuilder("I ");
		sb2.append("am ").append("a ").append(animal);
		System.out.println(sb2);
	}

}
