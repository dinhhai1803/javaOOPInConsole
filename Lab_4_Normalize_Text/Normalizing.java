package JavaLab.Lab_4_Normalize_Text;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Normalizing {

    
    static void readFile(String src){	
        try {
			
			FileReader reader = new FileReader(src);
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
    }

	static void writeFile(String src, String data){
		try{
			FileWriter writer = new FileWriter(src);
			writer.write(data);
			writer.close();
		}
		catch(Exception e){
			System.out.println("Something went wrong");
		}
	}

    static String storeFile(String src){
        String text = "";	
        try {
			
			FileReader reader = new FileReader(src);
			int data = reader.read();
			while(data != -1) {
				text += (char)data;
				data = reader.read();
			}
			reader.close();
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
        return text;
    }

    public static void main(String[] args) {
        String src = "D:\\SEMESTER_3\\Java_Lab\\text.txt"; 

        File file = new File(src);
        String text = storeFile(src);
        readFile(src);
		// String newText = space(text);
		// System.out.println(newText);
		// writeFile(src, "DinhHai");
		// readFile(src);
        
    }
}
