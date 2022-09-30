import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIOExercise {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("From input.txt.");
		try {
			File myFile = new File("input.txt");
//			FileWriter myFWriter = new FileWriter("input.txt", true);
//			myFWriter.write("\nhello");
//			
//			myFWriter.close();

			Scanner reader = new Scanner(myFile);
			int num;
			while (reader.hasNext()) {
				num = reader.nextInt();
				System.out.println(num);
			}
		} catch (IOException e) {
			System.out.println("File not found.");
		} catch (InputMismatchException e) {
			System.out.println("Error. Input value is not of type int.");
		} finally {
			System.out.println("Done.");
		}
		
		try {
			readInputFile();
		} catch (IOException e) {
			System.out.println("File not found.");
		}
		
		try {
			readAndSumIntegers();
		} catch (IOException e) {
			System.out.println("File not found.");
		}
		

	}

	public static void readInputFile() throws FileNotFoundException {
		System.out.println();
		System.out.println("From input1.txt.");
		File myFile2 = new File("input1.txt");
		Scanner reader = new Scanner(myFile2);
		int num;
		while (reader.hasNext()) {
			try {
				num = reader.nextInt();
				System.out.println(num);
			}catch(InputMismatchException e) {
				reader.next();
				System.out.println("Error. Input value is not of type int.");
			}
			
		}

	}
	public static void readAndSumIntegers() throws FileNotFoundException {
		System.out.println();
		System.out.println("From input2.txt.");
		File myFile = new File("input2.txt");
		Scanner reader = new Scanner(myFile);
		while(reader.hasNext()) {
			
			String[] numbs = reader.nextLine().trim().split(",");
			int total = 0;
			try {
			for(String numb: numbs ) {
				int num = Integer.parseInt(numb);
				total+=num;
			}
			System.out.println(total);
			}catch(NumberFormatException e) {
				System.out.println("Error. Input value is not of type int.");
			}
			
		}
	}

}
