
public class Zivotinja {
	
	private String tip;
	private String ime;
	
	public Zivotinja(String tip)
	{
		this.tip = tip;
		this.ime = ", nema ime";
	}
	
	public Zivotinja(String tip, String ime)
	{
		this.tip = tip;
		this.ime = ime;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		if (tip!="pas" || tip!="ma�ka")
		{
			throw new IllegalArgumentException("Tip mora biti pas ili ma�ka!");
		}
		this.tip = tip;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime.length()==0)
		{
			throw new IllegalArgumentException("Ime ne mo�e biti prazno!");
		}
		this.ime = ime;
	}
	
	public String toString()
	{
		return tip + " " + ime;
	}
}
