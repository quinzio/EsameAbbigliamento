package abbigliamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {
	private List<Capo> collAbb = new ArrayList<>();

	public void add(Capo capo) {
		collAbb.add(capo);
	}

	@SuppressWarnings("rawtypes")
	public Collection trova(Colore colore) {
		Collection byColor = collAbb.stream()
				.filter(c -> c.getColore().equals(colore))
				.collect(Collectors.toList());
		return byColor;
	}

	@SuppressWarnings("rawtypes")
	public Collection trova(Materiale materiale) {
		Collection byMaterial = collAbb.stream()
				.filter(c -> c.getMateriale().equals(materiale))
				.collect(Collectors.toList());
		return byMaterial;
	}

	@SuppressWarnings("rawtypes")
	public Collection trova(Modello modello) {
		Collection byModel = collAbb.stream()
				.filter(c -> c.getModello().equals(modello))
				.collect(Collectors.toList());
		return byModel;
	}

}
