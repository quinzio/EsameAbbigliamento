package abbigliamento;

public class Modello implements WithName {
	private String nome;
	private double costoFisso;
	private double quantitaTessuto;

	/*
	 * modelli vengono definiti tramite la clase Modello, il cui costruttore
	 * riceve come paremetri: il nome del modello, il costo fisso per unità e la
	 * quantità di tessuto richiesta per confezionare il modello espressa in
	 * metri quadri.
	 */
	public Modello(String nome, double costoFisso, double quantitaTessuto) {
		this.nome = nome;
		this.costoFisso = costoFisso;
		this.quantitaTessuto = quantitaTessuto;
	}

	public String getNome() {
		return nome;
	}

	public double getCosto() {
		return costoFisso;
	}

	public double getQuantita() {
		return quantitaTessuto;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Modello))
			return false;
		if (this == obj)
			return true;

		Modello mod = (Modello) obj;

		boolean cond;
		cond = (mod.costoFisso == costoFisso)
				&& (mod.quantitaTessuto == quantitaTessuto)
				&& (mod.nome.equals(nome));
		return cond;
	}

}
