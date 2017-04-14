package abbigliamento;

public class Capo implements WithName {
	private String nome;
	private Modello modello;
	private Materiale materiale;
	private Colore colore;

	public Capo(String nome, Modello modello, Materiale materiale, Colore colore) {
		this.nome = nome;
		this.modello = modello;
		this.materiale = materiale;
		this.colore = colore;
	}

	public Capo(Modello modello, Materiale materiale, Colore colore) {
		this("", modello, materiale, colore);
	}

	/*
	 * Il metodo prezzo() permette di calcolare il prezzo di un singolo capo:
	 * 
	 * 
	 * prezzo = costoFisso + quantit‡Materiale * costoMateriale
	 */
	public double prezzo() {
		return modello.getCosto() + modello.getQuantita()
				* materiale.getCosto();
	}

	/*
	 * Deve essere possibile stampare un capo tramite il metodo toString() che
	 * restituisce una stringa strutturata come segue: <modello> <colore> di
	 * <materiale>, ad esempio t-shirt rosa di cotone.
	 */
	@Override
	public String toString() {
		String capoStr;
		capoStr = modello.getNome() + " " + colore.getNome() + " di "
				+ materiale.getNome();
		return capoStr;
	}

	public Modello getModello() {
		return modello;
	}

	public Materiale getMateriale() {
		return materiale;
	}

	public Colore getColore() {
		return colore;
	}

	@Override
	public String getNome() {
		return nome;
	}

}
