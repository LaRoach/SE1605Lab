
public class HASClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
 Light light= new Light(1);
 light.setLight(light);
 
 AirConditoner AC=new AirConditoner(1,1); 
 AC.SetAc(AC);
 AC.SetTemp(AC);
 
 WashingMachine WM =new WashingMachine(1,1); 
 WM.SetWM(WM);
 WM.Wash(WM);
 
 TV tv =new TV(1,1,1);  
 tv.SetTv(tv);
 tv.SetChannel(tv);
 tv.SetVolume(tv);
 
 
 
	}

}
