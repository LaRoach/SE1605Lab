
public class WashingMachine {
int TurnOnOff;
int DryRinse;
public int getDryRinse() {
	return DryRinse;
}



public void setDryRinse(int dryRinse) {
	DryRinse = dryRinse;
}

int x;
	
	
	public int getOnOff() {
		return TurnOnOff;
	}



	public void setOnOff(int onOff) {
		TurnOnOff = onOff;
	}



	public WashingMachine(int OnOff,int DryRinse){
		this.TurnOnOff=OnOff;
		this.DryRinse=DryRinse;
	}
	
	public void SetWM(WashingMachine WM)
	{
		if(this.TurnOnOff==1)
		{
			System.out.println("WashingMachine  is ON");
		}
		else
		{
			System.out.println("WashingMachine  is OFF");
		}
	}
	
	public void Wash(WashingMachine WM)
	{
		if(this.TurnOnOff==0)
		{
			System.out.println("WashingMachine  is OFF , turn on the machine\n");
		}
		else
		{
			x=this.getDryRinse();
			if(x==1)
			{
				System.out.println("WashingMachine  is now washing the clothes\n");
			}
			else
			{
				System.out.println("WashingMachine  is now drying the clothes\n");
			}
		}

	}
		
}
