package br.com.amaral.services;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author leandro.amaral
 *
 */

public class HashMap {
	public static final int SIZE = 10;
	public LinkedList[] buckets;

	public HashMap() {
		buckets = new LinkedList[SIZE];
		for (int i = 0; i < SIZE; i++) {
			buckets[i] = new LinkedList();
		}
	}

	public void put(int key, int value) {
		int bucketIndex = key % SIZE;
		LinkedList bucket = buckets[bucketIndex];
		for (Object obj : bucket) {
			Map.Entry entry = (Map.Entry) obj;
			if (entry.getKey().equals(key)) {
				entry.setValue(value);
				return;
			}
		}
		bucket.add(new AbstractMap.SimpleEntry(key, value));
	}

	public void delete(int key) {
		int bucketIndex = key % SIZE;
		LinkedList bucket = buckets[bucketIndex];
		for (Object obj : bucket) {
			Map.Entry entry = (Map.Entry) obj;
			if (entry.getKey().equals(key)) {
				bucket.remove(entry);
				return;
			}
		}
	}

	public int get(int key) {
		int bucketIndex = key % SIZE;
		LinkedList bucket = buckets[bucketIndex];
		for (Object obj : bucket) {
			Map.Entry entry = (Map.Entry) obj;
			if (entry.getKey().equals(key)) {
				return (int) entry.getValue();
			}
		}
		return -1;
	}

	public void clear() {
		for (int i = 0; i < SIZE; i++) {
			buckets[i].clear();
		}
	}
}
