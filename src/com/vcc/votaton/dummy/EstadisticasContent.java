package com.vcc.votaton.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class EstadisticasContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 12 sample items(se agregan los 12 items de las estadisticas).
		addItem(new DummyItem("1", "Pobreza Nacional."));
		addItem(new DummyItem("2", "Pobreza Exrema."));
		addItem(new DummyItem("3", "Pobreza Multidimensional."));
		addItem(new DummyItem("4", "Gini (desigualdad)."));
		addItem(new DummyItem("5", "Analfabetismo."));
		addItem(new DummyItem("6", "Rezago Estudiantil."));
		addItem(new DummyItem("7", "Trabajo Infantil."));
		addItem(new DummyItem("8", "Trabajo Informal."));
		addItem(new DummyItem("9", "Desempleo de Alta Duración."));
		addItem(new DummyItem("10", "Hogares con Inadecuado Manejo de Excretas."));
		addItem(new DummyItem("11", "Hogares sin Aseguramiento en Salud."));
		addItem(new DummyItem("12", "Hogares sin Acceso a Fuente Mejorada de Agua."));

	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String content;

		public DummyItem(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}