import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MiniDatenbank implements Serializable { // erlaubt alle daten dieser klasse in textform(Javalesbar) zu überführen und zurück. ZB versand ins internet

	/**
	 * 
	 */
	private static final long serialVersionUID = 4952928175191843266L;
	private String name;
	private int alter;
	 List<String> kinder;

	public MiniDatenbank(String name, int alter) {
		this.name = name;
		this.alter = alter;
		kinder = new ArrayList<>();
		
		kinder.add("Ella");
		kinder.add("Ava");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getName() {
		return this.name;
	}

	public int getAlter() {
		return this.alter;
	}
	
	public List<String> getKinder(){
		return kinder;
	}
}
