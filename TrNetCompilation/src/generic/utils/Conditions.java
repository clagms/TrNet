package generic.utils;

public class Conditions {

	public static boolean isfalse(String string) {
		return string.equals("false");
	}

	public static boolean istrue(String string) {
		return string.equals("true");
	}

	public static boolean isexternalColumn(String string) {
		return string.equals("externalColumn");
	}

	public static boolean isid(String string) {
		return string.equals("id");
	}

	public static boolean isclassTable(String string) {
		return string.equals("classTable");
	}

	public static boolean isInteger(String string) {
		return string.equals("Integer");
	}

	public static boolean isID(String string) {
		return string.equals("ID");
	}

	public static boolean isdataType(String string) {
		return string.equals("dataType");
	}

	public static boolean isextendsColumn(String string) {
		return string.equals("extendsColumn");
	}

	public static boolean isinitial(String string) {
		return string.equals("initial");
	}

	public static boolean isjoin(String string) {
		return string.equals("join");
	}

	public static boolean isfork(String string) {
		return string.equals("fork");
	}

	public static boolean isjunction(String string) {
		return string.equals("junction");
	}


}
