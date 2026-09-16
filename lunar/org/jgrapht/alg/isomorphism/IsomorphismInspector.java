package org.jgrapht.alg.isomorphism;

import java.util.Iterator;
import org.jgrapht.GraphMapping;

public interface IsomorphismInspector<V, E> {
   Iterator<GraphMapping<V, E>> getMappings();

   boolean isomorphismExists();
}
