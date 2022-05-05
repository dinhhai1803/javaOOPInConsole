import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Check {

    public int checkPath(String url) {
        File f = new File(url);
        if(f.isFile())  return 1;
        if(f.isDirectory()) return 2;
        else  return 0;
    }

    public int listenFileJava(String url){
        int count = 0;
        while(true){
            if(checkPath(url) == 0){
                System.out.println("Path doesn't exist");
                url = Inputter.inpString("Try again");
            }
            else {
                File f = new File(url);
                if(f.exists() && f.isDirectory()){
                    File[] fList = f.listFiles();
                    for(File i : fList){
                        if(i.getName().contains(".java"))
                            count ++;
                    }
                }
                return count;   
            }

        }
    }

    public int getFileWithGreaterSize(int size, String url){
        int count = 0;
        while(true){
            if(checkPath(url) == 0){
                System.out.println("Path doesn't exist");
                url = Inputter.inpString("Try again");
            }
            else {
                File f = new File(url);
                if(f.exists() && f.isDirectory()){
                    File[] fList = f.listFiles();
                    for(File i : fList){
                        if(i.length() > size)
                            count ++;
                    }
                }
                return count;
            }
        }
    }

    public void writeContentToFile(String content, String url){
        while(true){
            if(checkPath(url) == 0){
                System.out.println("Path doesn't exist");
                url = Inputter.inpString("Try again");
            }
            else {
                File f = new File(url);
                if(f.exists() && (checkPath(url) == 1)){
                    try {
                        FileWriter fileWriter = new FileWriter(f, true);
                        // BufferedWriter writer = new BufferedWriter(fileWriter);
                        // writer.append(content);
                        // writer.close();
                        fileWriter.append(content);
                        fileWriter.close();
                        System.out.println("Write done"); 
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                }
                break;
            }

        }
    }

    public int countCharInALine(String line){
        int count = 0;
        String[] b  = line.split("\\s+");
        // for(String i : b) {
        //     count += i.length();
        // }
        return b.length;
    }

    public int readFileAndCountChar(String url){
        String line;
        int totalOfChar = 0;
        while(true){

            if(checkPath(url) == 0){
            System.out.println("Path doesn't exist");
            url = Inputter.inpString("Try again");
            }
            else {
                File f = new File(url);
                if(f.exists() && (checkPath(url) == 1)){
                    try {
                
                        FileReader r = new FileReader(f);
                        BufferedReader reader = new BufferedReader(r);
                        while((line = reader.readLine()) !=null){
                            totalOfChar += countCharInALine(line);
                        }
                        reader.close();
                
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                }
                return totalOfChar;
            }
        }
    }

} 