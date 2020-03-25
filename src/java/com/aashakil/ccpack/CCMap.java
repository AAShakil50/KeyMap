package com.aashakil.ccpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class CCMap<K extends Object, V extends Object>{
	
	private List<K> keyList = new ArrayList<K>(0);
	private List<V> valList = new ArrayList<V>(0);
	
	public CCMap(){
		this(0);
	}
	
	public CCMap(int count){
		keyList = new ArrayList<K>(count);
		valList = new ArrayList<V>(count);
	}

	
	public void add(int index, K key, V val) {
		keyList.add(index, key);
		valList.add(index, val);
	}

	
	public boolean add(K key, V val) {
		return keyList.add(key) && valList.add(val);
	}

	
	public void clear() {
		keyList.clear();
		valList.clear();
	}

	public boolean contains(K key, V val){
		return keyList.contains(key) && valList.contains(key);
	}
	
	public boolean containsKey(K key) {
		return keyList.contains(key);
	}
	
	public boolean containsVal(V val){
		return valList.contains(val);
	}

	
	public K getKeyAt(int index) {
		return keyList.get(index);
	}
	
	public K getKeyOfVal(V val){
		return keyList.get(valList.indexOf(val));
	}
	
	public V getValAt(int index){
		return valList.get(index);
	}
	
	public V getValOfKey(K key){
		return valList.get(keyList.indexOf(key));
	}

	public int indexOfKey(K key) {
		return keyList.indexOf(key);
	}
	
	public int indexOfVal(V val){
		return valList.indexOf(val);
	}
	
	public boolean isKeyEmpty(){
		return keyList.isEmpty();
	}
	
	public boolean isValEmpty(){
		return valList.isEmpty();
	}
	
	public Iterator<K> iteratorKey() {
		return keyList.iterator();
	}
	
	public Iterator<V> iteratorVal(){
		return valList.iterator();
	}
	
	public ListIterator<K> listIteratorKey() {
		return keyList.listIterator();
	}
	
	public List<K> listKeys(){
		return keyList;
	}
	
	public List<V> listVals(){
		return valList;
	}
	
	public int lastIndexOfKey(K key) {
		return keyList.lastIndexOf(key);
	}
	
	public int lastIndexOfVal(V val) {
		return valList.lastIndexOf(val);
	}
	
	public ListIterator<V> listIteratorVal(){
		return valList.listIterator();
	}
	
	public void remove(int index) {
		keyList.remove(index);
		valList.remove(index);
	}

	
	public void remove(K key) {
		valList.remove(keyList.indexOf(key));
		keyList.remove(key);
	}
	
	public K setKey(int index, K newKey) {
		return keyList.set(index, newKey);
	}
	
	public K setKeyOfVal(V val, K newKey){
		return keyList.set(valList.indexOf(val), newKey);
	}
	
	public V setVal(int index, V newVal){
		return valList.set(index, newVal);
	}
	
	public V setValOfKey(K key, V newVal){
		return valList.set(keyList.indexOf(key), newVal);
	}

	
	public int size() {
		return keyList.size();
	}
	
	public Object[] toArrayKeys() {
		return keyList.toArray();
	}
	
	public <T extends Object> T[] toArrayKeys(T[] array) {
		return keyList.toArray(array);
	}
	
	public Object[] toArrayVals() {
		return valList.toArray();
	}

	public <T extends Object> T[] toArrayVals(T[] array) {
		return valList.toArray(array);
	}
	
	public void mapToKeyMap(Map map){
		K[] keys = (K[]) map.keySet().toArray();
		V[] vals = (V[]) map.values().toArray();
		keyList.clear();
		valList.clear();
		for(int i=0; i<keys.length; i++){
			keyList.add(keys[i]);
			valList.add(vals[i]);
		}
	}
	
}
