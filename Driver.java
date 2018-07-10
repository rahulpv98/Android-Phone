import java.util.Scanner;


public class Driver {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		AndroidPhone ap=new AndroidPhone();
		int PhonePrice,ScreenSize;
		double Thickness;
		boolean isAudioJackPresent;
		String phoneName,phoneBrand;
	    System.out.println("Enter phone price");
	    PhonePrice=scn.nextInt();
	    System.out.println("Enter screen size");
	    ScreenSize=scn.nextInt();
	    System.out.println("Enter phone thickness ");
	    Thickness=scn.nextDouble();
	    System.out.println("Enter phone audio jack present or not ");
	    isAudioJackPresent=scn.nextBoolean();
	    System.out.println("Enter phone name");
	    phoneName=scn.nextLine();
	    phoneName=scn.nextLine();
	    System.out.println("Enter phone brand");
	    phoneBrand=scn.nextLine();
	    ap.BuildPhone(PhonePrice,ScreenSize,Thickness,isAudioJackPresent, phoneName,phoneBrand);
	    
	}
	

}

