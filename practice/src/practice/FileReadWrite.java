package practice;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	
public class FileReadWrite {
	
                  public static void main(String[] args) {
			        
			        String filePath = "example.txt";

			        
			        writeToFile(filePath, "This is a sample text for writing to a file.");

			       
			        String content = readFromFile(filePath);
			        System.out.println("Content read from the file:\n" + content);

			        
			        appendToFile(filePath, "\nThis text is appended to the file.");

			       
			        content = readFromFile(filePath);
			        System.out.println("\nContent read from the file after appending:\n" + content);
			    }

			  
			    private static void writeToFile(String filePath, String content) {
			        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			            writer.write(content);
			            System.out.println("Content successfully written to the file.");
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			    }

			   
			    private static String readFromFile(String filePath) {
			        StringBuilder content = new StringBuilder();
			        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			            String line;
			            while ((line = reader.readLine()) != null) {
			                content.append(line).append("\n");
			            }
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			        return content.toString();
			    }

			    
			    private static void appendToFile(String filePath, String content) {
			        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			            writer.write(content);
			            System.out.println("Content successfully appended to the file.");
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			    
			

		}

	}

