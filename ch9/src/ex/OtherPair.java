package ex;

public class OtherPair <K, V> extends Pair<K,V>{
	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		super(key, value);
		this.key = key;
		this.value = value;
	}
	
	public K getKey()	{ return key;	}
	public V getValue() { return value;	}
}
