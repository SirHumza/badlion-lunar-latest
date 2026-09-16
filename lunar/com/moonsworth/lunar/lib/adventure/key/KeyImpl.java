package com.moonsworth.lunar.lib.adventure.key;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.NotNull;

final class KeyImpl implements Key {
   static final Comparator<? super Key> COMPARATOR = Comparator.comparing(Key::value).thenComparing(Key::namespace);
   @RegExp
   static final String NAMESPACE_PATTERN = "[a-z0-9_\\-.]+";
   @RegExp
   static final String VALUE_PATTERN = "[a-z0-9_\\-./]+";
   private final String namespace;
   private final String value;

   KeyImpl(@NotNull String var1, @NotNull String var2) {
      checkError("namespace", var1, var1, var2, Key.checkNamespace(var1), "[a-z0-9_\\-.]+");
      checkError("value", var2, var1, var2, Key.checkValue(var2), "[a-z0-9_\\-./]+");
      this.namespace = Objects.requireNonNull(var1, "namespace");
      this.value = Objects.requireNonNull(var2, "value");
   }

   private static void checkError(String var0, String var1, String var2, String var3, OptionalInt var4, String var5) {
      if (var4.isPresent()) {
         int var6 = var4.getAsInt();
         char var7 = var1.charAt(var6);
         throw new InvalidKeyException(
            var2,
            var3,
            String.format(
               "Non " + var5 + " character in %s of Key[%s] at index %d ('%s', bytes: %s)",
               var0,
               asString(var2, var3),
               var6,
               var7,
               Arrays.toString(String.valueOf(var7).getBytes(StandardCharsets.UTF_8))
            )
         );
      }
   }

   static boolean allowedInNamespace(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.';
   }

   static boolean allowedInValue(char var0) {
      return var0 == '_' || var0 == '-' || var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.' || var0 == '/';
   }

   @NotNull
   @Override
   public String namespace() {
      return this.namespace;
   }

   @NotNull
   @Override
   public String value() {
      return this.value;
   }

   @NotNull
   @Override
   public String asString() {
      return asString(this.namespace, this.value);
   }

   @NotNull
   private static String asString(@NotNull String var0, @NotNull String var1) {
      return var0 + ':' + var1;
   }

   @NotNull
   @Override
   public String toString() {
      return this.asString();
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("namespace", this.namespace), ExaminableProperty.of("value", this.value));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof Key)) {
         return false;
      }

      Key var2 = (Key)var1;
      return Objects.equals(this.namespace, var2.namespace()) && Objects.equals(this.value, var2.value());
   }

   @Override
   public int hashCode() {
      int var1 = this.namespace.hashCode();
      return 31 * var1 + this.value.hashCode();
   }

   @Override
   public int compareTo(@NotNull Key var1) {
      return Key.super.compareTo(var1);
   }
}
