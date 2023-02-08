package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 
		comparableInt[] ListOfInts = null;
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		
		while(option != 8) {
			
			System.out.println("Elige la opcion que deseas realizar \n"
					+ "1.Leer el archivo para obtener los numeros \n"
					+ "2.Crear nuevos numeros y ordenarlos\n"
					+ "3.Usar Gnome Sort \n"
					+ "4.Usar Merge Sort \n"
					+ "5.Usar Quick Sort \n"
					+ "6.Usar Radix sort \n"
					+ "7.Usar Bubble Sort \n"
					+ "8.Salir");
			option = scan.nextInt();
			
			
			if(option == 1) {
				/**
				 * In this option, user selects how many values are going to be read from the file
				 * so only the necessary values are stored
				 */
				System.out.println("Cuantos numeros desea obtener del documento? (10 a 3000)");
				int QtyOfInts = scan.nextInt();
				
				/**
				 * The quantity of numbers that will be stored, is going to be the length of the array
				 */
				ListOfInts = new comparableInt[QtyOfInts];
				
				String ScannedNumber = "";
				System.out.println("Lista de numeros");
				try {
					BufferedReader reader = new BufferedReader(new FileReader("src/project/data.txt"));
					
					/**
					 * The length makes it so only a set amount of numbers are read from the txt file
					 */
					for (int i = 0; i < ListOfInts.length; i++) {
						ScannedNumber= reader.readLine();
						
						/**
						 * Each read line is parsed into an int, to creat a comparableInt Object
						 */
						ListOfInts[i] = new comparableInt(Integer.parseInt(ScannedNumber));
						System.out.println(Integer.parseInt(ScannedNumber));
					}

			
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			else if(option == 2) {
				try {
					/**
					 * Every time this option is called, the txt file becomes blanc
					 */
					new FileOutputStream("src/project/data.txt").close();
					Writer wr = new FileWriter("src/project/data.txt");
					Random rand = new Random();
					
					/**
					 * Then 3000 random ints are created
					 */
					for (int i = 0; i < 3000; i++) {
						
						wr.write( rand.nextInt(3001) + "\n");
						
					}
					wr.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			else if(option == 3) {
				
			}
			
			else if(option == 4) {
				
			}
			
			else if(option == 5) {
				QuickSort myQuickSort = new QuickSort();
				comparableInt[] listResult = (comparableInt[]) myQuickSort.Ascending(ListOfInts, 0, ListOfInts.length-1);
				for (int i = 0; i < listResult.length; i++) {
					System.out.println(listResult[i].getIntNumber());
				}
			}
			
			else if(option == 6) {
				RadixSort RadixSort = new RadixSort();
				RadixSort.AscendigSort(ListOfInts, ListOfInts.length);
				for (int i = 0; i < ListOfInts.length; i++)
					System.out.println(ListOfInts[i].getIntNumber());
			}
			
			else if(option == 7) {
				
				BubbleSort BubbleSort = new BubbleSort(ListOfInts);
				BubbleSort.AscendingSort();
				
				for (int i = 0; i < ListOfInts.length; i++) {
					System.out.println(ListOfInts[i].getIntNumber());
					
				}
			}
			
		}

	}

}
