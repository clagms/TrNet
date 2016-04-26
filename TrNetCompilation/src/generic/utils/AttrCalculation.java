package generic.utils;

public class AttrCalculation {

	public static String colID(String string) {
		return "colid_"+string;
	}

	public static String junctTableName(String string) {
		return "juncTable_" + string;
	}

	public static String foreignkeycol(String className) {
		return "foreignKeytrg_" + className;
	}

	public static String junctablecolid(String attribute) {
		return "foreignKeysrc_" + attribute;
	}
}
