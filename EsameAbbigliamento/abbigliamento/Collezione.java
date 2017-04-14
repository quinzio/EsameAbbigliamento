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
		Collection byColor = collAbb.stream()
				.filter(c -> c.getColore().equals(materiale))
				.collect(Collectors.toList());
		return byColor;
	}

	@SuppressWarnings("rawtypes")
	public Collection trova(Modello modello) {
		Collection byColor = collAbb.stream()
				.filter(c -> c.getColore().equals(modello))
				.collect(Collectors.toList());
		return byColor;
	}

}
