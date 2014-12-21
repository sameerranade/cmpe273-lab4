package edu.sjsu.cmpe.cache.client;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Cache Service Interface
 */
public interface CacheServiceInterface {
    public void remove(long Key);
    public String get(long key);
    public void put(long key, String value);
}