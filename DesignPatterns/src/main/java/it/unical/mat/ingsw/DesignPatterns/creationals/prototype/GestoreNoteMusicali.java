package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

import java.util.HashMap;
import java.util.Map;

public class GestoreNoteMusicali {

	private static Map<String, NotaMusicale> noteMap = new HashMap<String, NotaMusicale>();

	static {
		noteMap.put("croma", new Croma());
		noteMap.put("semicroma", new SemiCroma());
		noteMap.put("breve", new Breve());
		noteMap.put("semibreve", new SemiBreve());
	}

	public static NotaMusicale getNota(String nota) throws CloneNotSupportedException {
		return noteMap.get(nota).clone();
	}

}
