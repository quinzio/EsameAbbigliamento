package abbigliamento;

public class Colore implements WithName {
	private String nome;

	public Colore(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Colore))
			return false;
		if (this == obj)
			return true;

		Colore mod = (Colore) obj;

		boolean cond;
		cond = (mod.nome.equals(nome));
		return cond;

	}

}
