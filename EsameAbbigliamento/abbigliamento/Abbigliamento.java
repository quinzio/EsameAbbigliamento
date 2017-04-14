package abbigliamento;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Abbigliamento {
	@SuppressWarnings("unused")
	private List<Collezione> lcollezioni = new ArrayList<>();
	private List<Capo> lcapi = new ArrayList<>();
	private List<Colore> lcolori = new ArrayList<>();
	private List<Materiale> lmateriali = new ArrayList<>();
	private List<Modello> lmodelli = new ArrayList<>();

	public void leggiFile(String fileName) {
		Path p = Paths.get("Inputs.txt");
		try {
			List<String> lines = Files.readAllLines(p);
			for (String s : lines) {
				String[] words = s.split(";");
				if (words[0].equals("MOD")) {
					String nome = words[1];
					Double costoFisso = new Double(words[2]);
					Double qTessuto = new Double(words[3]);
					lmodelli.add(new Modello(nome, costoFisso, qTessuto));
				}
				if (words[0].equals("COL")) {
					String nome = words[1];
					lcolori.add(new Colore(nome));
				}
				if (words[0].equals("MAT")) {
					String nome = words[1];
					Double costomq = new Double(words[2]);
					lmateriali.add(new Materiale(nome, costomq));
				}
				/*
				 * I capi sono definiti in linee che iniziano per CAP, seguiti
				 * da nome, nome del modello, nome del materiale, e nome del
				 * colore, tutti separati da ";".
				 */
				if (words[0].equals("CAP")) {
					String nome = words[1];
					String modello = words[2];
					String materiale = words[3];
					String colore = words[4];

					Modello mod = null;
					for (Modello m : lmodelli) {
						if (m.getNome().equals(modello))
							mod = m;
					}
					Materiale mat = null;
					for (Materiale m : lmateriali) {
						if (m.getNome().equals(materiale))
							mat = m;
					}
					Colore col = null;
					for (Colore c : lcolori) {
						if (c.getNome().equals(colore))
							col = c;
					}
					lcapi.add(new Capo(nome, mod, mat, col));
				}

			}
		} catch (IOException e) {
			System.out.println("Error reading file");
			return;
		}

	}

	private <T extends WithName> T ltom(Collection<T> coll, String name) {
		Map<String, T> m = coll.stream().collect(
				Collectors.toMap(T::getNome, el -> el));
		return m.get(name);
	}

	public Modello getModello(String name) {
		return ltom(lmodelli, name);
	}

	public Colore getColore(String name) {
		return ltom(lcolori, name);
	}

	public Materiale getMateriale(String name) {
		return ltom(lmateriali, name);
	}

	public Capo getCapo(String name) {
		return ltom(lcapi, name);
	}

	public Collezione getCollezione(String name) {
		return null;
	}

}
