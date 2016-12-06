package interfaces;

public interface Mapping<V, K> {

	public void put(K key, V value);

	public V get(K key);
}
