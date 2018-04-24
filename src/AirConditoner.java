
public class AirConditoner {
	AirConditonerData data = new AirConditonerData(28, 0);

	public int getOnOff() {
		return data.TurnOnOff;
	}

	public void setOnOff(int onOff) {
		data.TurnOnOff = onOff;
	}

	public int getTempUpDown() {
		return data.TempUpDown;
	}

	public void setTempUpDown(int tempUpDown) {
		data.TempUpDown = tempUpDown;
	}

	
	
	
	
	public AirConditoner(int OnOff,int TempUpDown){
		this.data.TurnOnOff=OnOff;
		this.data.TempUpDown=TempUpDown;
		
		
	}

	public void SetAc(AirConditoner AC){
		if(this.data.TurnOnOff==1)
		{
			System.out.println("AC is now ON");
		}
	}
	public void SetTemp(AirConditoner AC){
		if(this.data.TurnOnOff==0)
		{
			System.out.println("AC is Off,turn on the AC to adjust the temperature\n\n");
		}
		if(this.data.TurnOnOff==1)
		{
			data.currenttemp=data.defaulttemp+this.getTempUpDown();
			System.out.println("AC temperature is:"+data.currenttemp+"\n\n");
		}
	}
		
	
}
