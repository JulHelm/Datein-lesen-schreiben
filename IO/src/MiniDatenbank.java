import java.io.Serializable;

public class MiniDatenbank implements Serializable { // erlaubt daten in textform zu überführen und zurück

	private String name;
	private int alter;

	public MiniDatenbank(String name, int alter) {
		this.name = name;
		this.alter = alter;
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
}
