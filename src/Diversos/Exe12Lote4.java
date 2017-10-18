package Diversos;

import java.util.Scanner;

class Exe12Lote4 {
	
	private static int[][] array = new int[8][8];
	private static int[] soma = new int[7];
	
	public static void main(String[] args){
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 0; j < array[i].length; j++){
	
				array[i][j] = (int)(Math.random() * 7);
                                soma[array[i][j]]++;
				
			}// End For
			
		}// End For
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 0; j < array[i].length; j++){
				System.out.print(" " + array[i][j]);
			}// End For
			
			System.out.print("\n");
			
		}// End For
		
		/*for(int i = 0; i < array.length; i++){
			
			for(int j =  0; j < array[i].length; j++){
				soma[array[i][j]]++;
			}// End For
			
		}// End For*/
	
		System.out.print("\n");
			
		System.out.print("Peao(0): " + soma[0]);
		System.out.print("\nTorre(1): " + soma[1]);
		System.out.print("\nBispo(2): " + soma[2]);
		System.out.print("\nCavalo(3): " + soma[3]);
		System.out.print("\nRainha(4): " + soma[4]);
		System.out.print("\nRei(5): " + soma[5]);
		System.out.print("\nVazio(6): " + soma[6] + "\n");
			
	}// End Main
	
}// End Class
	