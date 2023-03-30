package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonFile singletonFile1 = SingletonFile.getInstance();
        SingletonFile singletonFile2 = SingletonFile.getInstance();

        // Verify that singletonFile1 and singletonFile2 are the same object
        System.out.println("Are singletonFile1 and singletonFile2 the same object? " + (singletonFile1 == singletonFile2));

        // Test writing to file
        singletonFile1.writeToFile("Hello, world!\n");
        singletonFile1.writeToFile("This is a test.\n");

        // Test reading from file
        String fileContent = singletonFile1.readFromFile();
        System.out.println("File content:\n" + fileContent);

        // Test clearing file
        singletonFile1.clearFile();
        System.out.println("File content after clearing:\n" + singletonFile1.readFromFile());

        // Test adding more than 50 lines to file
        for (int i = 0; i < 60; i++) {
            singletonFile1.writeToFile("Line " + i + "\n");
        }
        System.out.println("File content after adding more than 50 lines:\n" + singletonFile1.readFromFile());

        singletonFile1.clearFileIfContainsMoreThan50Lines();
        System.out.println("File content after clearing:\n" + singletonFile1.readFromFile());

        // Test deleting file
        singletonFile1.deleteFile();
        System.out.println("File exists after deleting: " + singletonFile1.getFile().exists());
    }
}
