package asalSayi;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Bir sayi girin: ");
		int sayi = scanner.nextInt();
		
		
		if (sayi < 2) {
			System.out.println(sayi + " Asal sayi degildir.");
			
		} else {
			if (asalMi(sayi,2)) {
				System.out.println(sayi + " Asal bir sayidir.");
				
			} else {
				System.out.println(sayi + " Asal bir sayi degildir.");

			}

		}
		
		scanner.close();
		
	}
	
	static boolean asalMi(int sayi, int bolen) {
		if (bolen > sayi / 2) {
			return true;
			
		} else {
			if (sayi % bolen == 0) {
				return false;
				
			} else {
				return asalMi(sayi, bolen +1);

			}

		}
	}

}
