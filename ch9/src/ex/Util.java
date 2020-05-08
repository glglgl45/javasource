package ex;

public class Util {
	public static <K,V> V getValue(Pair<K,V> pair, K k) {
		if (pair.getKey().equals(k)) {
			return pair.getValue();
		}
		return null;
	}
	
//	public static <P extends Pair<K,V>,K,V> V getValue(P pair, K k) {
//		if (pair.getKey().equals(k)) {
//			return pair.getValue();
//		}
//		return null;
//	}

}
