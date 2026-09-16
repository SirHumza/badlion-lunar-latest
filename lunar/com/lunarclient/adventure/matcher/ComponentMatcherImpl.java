package com.lunarclient.adventure.matcher;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lombok.Generated;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

public class ComponentMatcherImpl implements ComponentMatcher {
   private final List<ComponentPattern> patterns;
   private final boolean startsWith;
   private final boolean endsWith;
   private final boolean gapsBetween;
   private final int requiredMatches;

   @Override
   public boolean matches(Component var1, boolean var2) {
      ComponentMatchPerformerImpl.State var3;
      if (var2) {
         var3 = new ComponentMatchPerformerImpl.StateInherit(
            new ArrayList<>(this.patterns), this.startsWith, this.endsWith, this.gapsBetween, this.requiredMatches
         );
      } else {
         var3 = new ComponentMatchPerformerImpl.State(new ArrayList<>(this.patterns), this.startsWith, this.endsWith, this.gapsBetween, this.requiredMatches);
      }

      return ComponentMatchPerformerImpl.INSTANCE.matches(var1, var3);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("patterns", this.patterns),
         ExaminableProperty.of("startsWith", this.startsWith),
         ExaminableProperty.of("endsWith", this.endsWith),
         ExaminableProperty.of("gapsBetween", this.gapsBetween),
         ExaminableProperty.of("requiredMatches", this.requiredMatches)
      );
   }

   @Generated
   public ComponentMatcherImpl(List<ComponentPattern> var1, boolean var2, boolean var3, boolean var4, int var5) {
      this.patterns = var1;
      this.startsWith = var2;
      this.endsWith = var3;
      this.gapsBetween = var4;
      this.requiredMatches = var5;
   }
}
