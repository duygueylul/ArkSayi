package ArkSayi;
import java.util.Scanner;

public class Ssayi {
	
	public static boolean Arkmi(int s1, int s2) {
		if(s1 == BolToplami(s2) && s2 == BolToplami(s1)) {
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public static int BolToplami(int s) {
		int bolenToplami = 0;
		for (int i = 1; i < s; i++) {
			if(s % i == 0) {
				bolenToplami = bolenToplami + i;
			}
		}
		return bolenToplami;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int s1, s2;
		System.out.println("Birinci Sayıyı Giriniz: ");
		s1 = scan.nextInt();
		System.out.println("İkinci Sayıyı Giriniz: ");
		s2 = scan.nextInt();
		
		if(Arkmi(s1, s2)) {
			System.out.println("Bu İki Sayı Eşittir.");
		}
		else
		{
			System.out.println("Bu İki Sayı Arkadaş Değildir.");
		}
	}
	
	
	

}
