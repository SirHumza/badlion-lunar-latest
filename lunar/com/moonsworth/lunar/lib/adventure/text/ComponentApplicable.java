package com.moonsworth.lunar.lib.adventure.text;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface ComponentApplicable {
   @NotNull
   Component componentApply(@NotNull Component var1);
}
