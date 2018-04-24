import static org.junit.Assert.*;

import org.junit.Test;

public class HAStestcase {

	@Test
	public void test() {
		
		
		
		 Light light= new Light(1);
		 light.setLight(light);
		 
		 AirConditoner AC=new AirConditoner(0,1); 
		 AC.SetAc(AC);
		 if(AC.data.TurnOnOff==0)
		{
			System.out.println("AC is Off,turn on the AC to adjust the temperature\n\n");
		}
		if(AC.data.TurnOnOff==1)
		{
			AC.data.currenttemp=AC.data.defaulttemp+AC.getTempUpDown();
			System.out.println("AC temperature is:"+AC.data.currenttemp+"\n\n");
		}
		 
		 WashingMachine WM =new WashingMachine(1,1); 
		 WM.SetWM(WM);
		 WM.Wash(WM);
		 
		 TV tv =new TV(1,-1,1);  
		 tv.SetTv(tv);
		 tv.SetChannel(tv);
		 tv.SetVolume(tv);
		 
		 
		 
	}

}
