
public class AirConditoner {
	int TurnOnOff;
	int TempUpDown;
	int defaulttemp=28;
	int currenttemp=0;

	public int getOnOff() {
		return TurnOnOff;
	}

	public void setOnOff(int onOff) {
		TurnOnOff = onOff;
	}

	public int getTempUpDown() {
		return TempUpDown;
	}

	public void setTempUpDown(int tempUpDown) {
		TempUpDown = tempUpDown;
	}

	
	
	
	
	public AirConditoner(int OnOff,int TempUpDown){
		this.TurnOnOff=OnOff;
		this.TempUpDown=TempUpDown;
		
		
	}

	public void SetAc(AirConditoner AC){
		if(this.TurnOnOff==1)
		{
			System.out.println("AC is now ON");
		}
	}
	public void SetTemp(AirConditoner AC){
		if(this.TurnOnOff==0)
		{
			System.out.println("AC is Off,turn on the AC to adjust the temperature\n\n");
		}
		if(this.TurnOnOff==1)
		{
			currenttemp=defaulttemp+this.getTempUpDown();
			System.out.println("AC temperature is:"+currenttemp+"\n\n");
		}
	}
		
	
}
