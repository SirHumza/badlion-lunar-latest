package com.lunarclient.dfu.datafixers;

public interface FamilyOptic<A, B> {
   TypedOptic<?, ?, A, B> apply(int var1);
}
