package Util;

import java.io.File;

public class DeleteFilesInDirectory {
    public static void main(String[] args) {
    String directoryPath = "D:\\testing\\Automation project\\Project-nopcommerce\\allure-results";

        // Call the method to delete files in the directory
        deleteFilesInDirectory(directoryPath);
    }
    public static void deleteFilesInDirectory(String directoryPath) {
        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // Get all files in the directory
            File[] files = directory.listFiles();

            // Check if files exist
            if (files != null) {
                // Iterate through each file
                for (File file : files) {
                    // Check if it's a file
                    if (file.isFile()) {
                     file.delete();
                        System.out.println("Deleted file: " + file.getAbsolutePath());
                    }
                    else if (file.isDirectory()) {
                        deleteFilesInDirectory(file.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
