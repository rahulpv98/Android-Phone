

	public class AndroidPhone {
		  private int PhonePrice,ScreenSize;
		  private double Thickness;
		  private boolean isAudioJackPresent;
		  private String phoneName,phoneBrand;
		  
		  public void AwesomePhone() {
			  System.out.println("Name "+phoneName);
			  System.out.println("Brand "+phoneBrand);
			  System.out.println("Price "+PhonePrice);
			  System.out.println("Screen size "+ScreenSize);
			  System.out.println("Audio jack "+isAudioJackPresent);
			  System.out.println("Thickness "+Thickness);
		  }
		  
		  public void BuildPhone(int PhonePrice,int ScreenSize,double Thickness,boolean isAudioJackPresent,String phoneName,String phoneBrand  ) {
			  this.isAudioJackPresent=isAudioJackPresent;
			  this.phoneBrand=phoneBrand;
			  this.Thickness=Thickness;
			  this.phoneName=phoneName;
			  this.PhonePrice=PhonePrice;
			  this.ScreenSize=ScreenSize;
			  AwesomePhone();
		  }
		}

