package org.jgrapht.alg.cycle;

import java.util.List;

public interface DirectedSimpleCycles<V, E> {
   List<List<V>> findSimpleCycles();
}
