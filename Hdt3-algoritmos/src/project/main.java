package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 
		comparableInt[] ListOfInts;
		
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
				
				System.out.println("Cuantos numeros desea obtener? (10 a 3000)");
				int QtyOfInts = scan.nextInt();

				ListOfInts = new comparableInt[QtyOfInts];
				
				
				String ScannedNumber = "";
				try {
					BufferedReader reader = new BufferedReader(new FileReader("src/project/data.txt"));
					
					for (int i = 0; i < ListOfInts.length; i++) {
						ScannedNumber= reader.readLine();
						ListOfInts[i] = new comparableInt(Integer.parseInt(ScannedNumber));
					}

			
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				for (comparableInt comparableInt : ListOfInts) {
					System.out.println(comparableInt.getIntNumber());
				}
				
			}
			
			else if(option == 2) {
				try {
					new FileOutputStream("src/project/data.txt").close();
					
					
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
				
			}
			
			else if(option == 6) {
				
			}
			
			else if(option == 7) {
				
			}
			
		}

	}

}
