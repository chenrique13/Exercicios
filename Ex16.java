import java.text.*;
import java.util.*;

public class Teste {

	public static void main(String args[]) {

		String s;
		Format formatter;
		Date date = new Date();

		// 01/09/02
		formatter = new SimpleDateFormat("MM/dd/yy");
		s = formatter.format(date);
		System.out.println(s);

		// 01/09/02
		formatter = new SimpleDateFormat("dd/MM/yy");
		s = formatter.format(date);
		System.out.println(s);

		// 29-Jan-02
		formatter = new SimpleDateFormat("dd-MMM-yy");
		s = formatter.format(date);
		System.out.println(s);

		// 2002.01.29.08.36.33
		formatter = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		s = formatter.format(date);
		System.out.println(s);

		// Tue, 09 Jan 2002 22:14:02 -0500
		formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
		s = formatter.format(date);
		System.out.println(s);

		formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss zzzz");
		s = formatter.format(date);
		System.out.println(s);
	}
}
