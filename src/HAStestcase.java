import static org.junit.Assert.*;

import org.junit.Test;

public class HAStestcase {

	@Test
	public void test() {
		
		
		
		 Light light= new Light(1);
		 light.setLight(light);
		 
		 AirConditoner AC=new AirConditoner(0,1); 
		 AC.SetAc(AC);
		 AC.SetTemp(AC);
		 
		 WashingMachine WM =new WashingMachine(1,1); 
		 WM.SetWM(WM);
		 WM.Wash(WM);
		 
		 TV tv =new TV(1,-1,1);  
		 tv.SetTv(tv);
		 tv.SetChannel(tv);
		 tv.SetVolume(tv);
		 
		 
		 
	}

}
