package singleton;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class SingletonFile {
    private static SingletonFile instance;
    private File file;

    private SingletonFile() {
        try {
            file = new File("/tmp/myfile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SingletonFile getInstance() {
        if (instance == null) {
            instance = new SingletonFile();
        }
        return instance;
    }

    public File getFile() {
        return file;
    }

    public void writeToFile(String content) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile() {
        String result = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void clearFile() {
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean deleteFile() {
        return file.delete();
    }

    public void clearFileIfContainsMoreThan50Lines() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
                if (lineCount > 50) {
                    clearFile();
                    break;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
