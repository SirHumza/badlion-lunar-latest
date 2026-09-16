package org.jgrapht.alg.interfaces;

import java.util.Iterator;
import java.util.Set;

public interface MaximalCliqueEnumerationAlgorithm<V, E> extends Iterable<Set<V>> {
   @Override
   Iterator<Set<V>> iterator();
}
