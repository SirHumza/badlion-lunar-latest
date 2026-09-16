package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.util.Index;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum TextDecoration implements StyleBuilderApplicable, TextFormat {
   OBFUSCATED("obfuscated"),
   BOLD("bold"),
   STRIKETHROUGH("strikethrough"),
   UNDERLINED("underlined"),
   ITALIC("italic");

   public static final Index<String, TextDecoration> NAMES = Index.create(TextDecoration.class, var0 -> var0.name);
   private final String name;

   TextDecoration(String var3) {
      this.name = var3;
   }

   @Deprecated
   @NotNull
   public final TextDecorationAndState as(boolean var1) {
      return this.withState(var1);
   }

   @Deprecated
   @NotNull
   public final TextDecorationAndState as(@NotNull TextDecoration.State var1) {
      return this.withState(var1);
   }

   @NotNull
   public final TextDecorationAndState withState(boolean var1) {
      return new TextDecorationAndStateImpl(this, TextDecoration.State.byBoolean(var1));
   }

   @NotNull
   public final TextDecorationAndState withState(@NotNull TextDecoration.State var1) {
      return new TextDecorationAndStateImpl(this, var1);
   }

   @NotNull
   public final TextDecorationAndState withState(@NotNull TriState var1) {
      return new TextDecorationAndStateImpl(this, TextDecoration.State.byTriState(var1));
   }

   @Override
   public void styleApply(Style.@NotNull Builder var1) {
      var1.decorate(this);
   }

   @NotNull
   @Override
   public String toString() {
      return this.name;
   }

   public enum State {
      NOT_SET("not_set"),
      FALSE("false"),
      TRUE("true");

      private final String name;

      State(String var3) {
         this.name = var3;
      }

      @Override
      public String toString() {
         return this.name;
      }

      @NotNull
      public static TextDecoration.State byBoolean(boolean var0) {
         return var0 ? TRUE : FALSE;
      }

      @NotNull
      public static TextDecoration.State byBoolean(@Nullable Boolean var0) {
         return var0 == null ? NOT_SET : byBoolean(var0.booleanValue());
      }

      @NotNull
      public static TextDecoration.State byTriState(@NotNull TriState var0) {
         Objects.requireNonNull(var0);
         switch (var0) {
            case TRUE:
               return TRUE;
            case FALSE:
               return FALSE;
            case NOT_SET:
               return NOT_SET;
            default:
               throw new IllegalArgumentException("Unable to turn TriState: " + var0 + " into a TextDecoration.State");
         }
      }
   }
}
