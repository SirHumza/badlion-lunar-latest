package com.moonsworth.lunar.lib.adventure.key;

import org.jetbrains.annotations.NotNull;

public interface Namespaced {
   @KeyPattern.Namespace
   @NotNull
   String namespace();
}
