package abbigliamento;

public class Materiale implements WithName {
	private String nome;
	private double costomq;

	public Materiale(String nome, double costomq) {
		this.nome = nome;
		this.costomq = costomq;
	}

	public String getNome() {
		return nome;
	}

	public double getCosto() {
		return costomq;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Materiale))
			return false;
		if (this == obj)
			return true;

		Materiale mat = (Materiale) obj;

		boolean cond;
		cond = (mat.costomq == costomq) && (mat.nome.equals(nome));
		return cond;
	}

}
