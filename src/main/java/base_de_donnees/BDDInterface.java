package main.java.base_de_donnees;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map.Entry;

import main.java.exception.NonExistingKeyException;

import java.util.Set;

/**
 * Classe d'interface de BDD, a ajouter au ServerManager
 * @author bizarda
 * Interface similaire à Hashtable<Object,Object>
 */
public interface BDDInterface {

	public void put(Object cle, Object valeur);
	public Object get(Object cle) throws NonExistingKeyException;
	
	public boolean contains(Object valeur);
	public boolean containsKey(Object cle);

	public boolean isEmpty();
	public void clear();

	public Enumeration<Object> keys();
	public Enumeration<Object> elements();
	
	public Set<Object> keySet();
	public Set<Entry<Object, Object>> entrySet();
	
	public Collection<Object> values();

	public void remove(Object cle) throws NonExistingKeyException;
}
