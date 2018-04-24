
public class AirConditonerData {
	public int TurnOnOff;
	public int TempUpDown;
	public int defaulttemp;
	public int currenttemp;

	public AirConditonerData(int defaulttemp, int currenttemp) {
		this.defaulttemp = defaulttemp;
		this.currenttemp = currenttemp;
	}
}