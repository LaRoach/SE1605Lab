
public class Light {
	int TurnOnOff;
	
	
	
	public int getOnOff() {
		return TurnOnOff;
	}



	public void setOnOff(int onOff) {
		TurnOnOff = onOff;
	}



	public Light(int OnOff){
		this.TurnOnOff=OnOff;
	}
		
	
	
	public void setLight(Light light)
	{
		if(this.TurnOnOff==1)
		{
			System.out.println("Lights are now ON\n\n");
		}
		else
		{
			System.out.println("Lights are now OFF\n\n");
		}
	}
}
