
public class TV {
	 	int TurnOnOff;
		int ChannelNextPrevious;
		int VolumeIncreaseDecrease;
		int defaultchannel=01;
		int defaultvolume=18;
		int channelno=0;
		int vol=0;
		
	public int getOnOff() {
		return TurnOnOff;
	}
	public void setOnOff(int onOff) {
		TurnOnOff = onOff;
	}
	public int getChannelNextPrevious() {
		return ChannelNextPrevious;
	}

	public void setChannelNextPrevious(int channelNextPrevious) {
		ChannelNextPrevious = channelNextPrevious;
	}
	public int getVolumeIncreaseDecrease() {
		return VolumeIncreaseDecrease;
	}

	public void setVolumeIncreaseDecrease(int volumeIncreaseDecrease) {
		VolumeIncreaseDecrease = volumeIncreaseDecrease;
	}

  






	
	
	public TV(int OnOff,int NextPrevious, int VolumeIncreaseDecrease){
	
		this.TurnOnOff=OnOff;
		this.ChannelNextPrevious=NextPrevious;
		this.VolumeIncreaseDecrease=VolumeIncreaseDecrease;
		
	}
	

	public void SetTv(TV tv)
	{
		if(this.TurnOnOff==1)
		{
			System.out.println("TV is ON");
		}
		else
		{
			System.out.println("TV  is OFF");
		}
	}
	
	public void SetChannel(TV tv)
	{

		if(this.TurnOnOff==0)
		{
			System.out.println("TV  is OFF , switch on the TV first \n");
		}
		else
		{
			channelno=this.getChannelNextPrevious()+defaultchannel;
			System.out.println("You are on channelno number "+channelno);
		}
	}
	
	public void SetVolume(TV tv)
	{

		if(this.TurnOnOff==0)
		{
			System.out.println("TV  is OFF , switch on the TV first \n");
		}
		else
		{
			vol=this.getVolumeIncreaseDecrease()+defaultvolume;
			System.out.println("Volume of TV is set to  "+vol);
		}
	}
	
	
}
