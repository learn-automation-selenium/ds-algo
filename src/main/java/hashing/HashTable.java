package hashing;

public class HashTable {

	private HashNode[] buckets;
	private int noOfBuckets;
	private int size;
	
	public HashTable() {
		this(10);
	}
	
	public HashTable(int capacity) {
		this.noOfBuckets = capacity;
		buckets = new HashNode[noOfBuckets];
		this.size = 0;
	}
	
	private class HashNode {
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void put(Integer key, String value) {
		
	}
	
	public String get(Integer key) {
		return "";
	}
	
	public String remove(Integer key) {
		return "";
	}
}
