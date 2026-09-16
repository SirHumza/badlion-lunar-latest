package com.lunarclient;

import java.util.Set;

public class ImmutableSet<T> extends ImmutableCollection<T> implements Set<T> {
   public ImmutableSet(Set<T> var1) {
      super(var1);
   }
}
