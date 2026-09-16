package org.jgrapht.alg.shortestpath;

import org.jgrapht.GraphPath;

public interface PathValidator<V, E> {
   boolean isValidPath(GraphPath<V, E> var1, E var2);
}
