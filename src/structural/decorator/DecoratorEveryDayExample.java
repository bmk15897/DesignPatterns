package structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecoratorEveryDayExample {

	public static void main(String[] args) throws IOException {
		File file = new File("sample.txt");
		file.createNewFile();
		OutputStream ostream = new FileOutputStream(file);
		DataOutputStream dostream = new DataOutputStream(ostream);
		dostream.writeChars("Text");
		dostream.close();
		ostream.close();
	}

}
