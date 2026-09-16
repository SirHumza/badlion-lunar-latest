package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 25)
public record CRRRICCRROCOHHOHIICIHORCOORRRH() implements HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @NotNull
   private final Map<String, String> values;
   @NotNull
   private final Set<String> flags;
   public static CRRRICCRROCOHHOHIICIHORCOORRRH RORCCRIIRHIHIHOOCIRORCCRHOROIO = new CRRRICCRROCOHHOHIICIHORCOORRRH(Map.of(), Set.of());

   public CRRRICCRROCOHHOHIICIHORCOORRRH(@NotNull Map<String, String> var1, @NotNull Set<String> var2) {
      this.values = var1;
      this.flags = var2;
   }

   @Contract("->new")
   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHIRHHIORIOROICCRCHHROCCIRHOHI() {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Contract("_->this")
   public CRRRICCRROCOHHOHIICIHORCOORRRH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      if (this.isEmpty()) {
         return var1;
      }

      if (var1.isEmpty()) {
         return this;
      }

      HashMap var2 = new HashMap<>(this.values);
      var2.putAll(var1.values);
      Builder var3 = ImmutableSet.builder();
      var3.addAll(this.flags);
      var3.addAll(var1.flags);
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(ImmutableMap.copyOf(var2), var3.build());
   }

   public String RIRCCRRRCOROICICCOORORHCHICRCC() {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : this.values.entrySet()) {
         String var4 = (String)var3.getKey();
         String var5 = (String)var3.getValue();
         var1.append("#define ").append(var4).append(" ").append(var5).append('\n');
      }

      for (String var7 : this.flags) {
         var1.append("#define ").append(var7).append('\n');
      }

      return var1.toString();
   }

   public boolean isEmpty() {
      return this.values.isEmpty() && this.flags.isEmpty();
   }

   @Override
   public Map<String, String> bridge$values() {
      return this.values;
   }

   @Override
   public Collection<String> bridge$flags() {
      return this.flags;
   }

   @NotNull
   public Map<String, String> IRHHOROIRHRHOOHCOHCCCHRORHHHII() {
      return this.values;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private com.google.common.collect.ImmutableMap.Builder<String, String> values;
      private Builder<String> flags;

      @Override
      public void bridge$copyFrom(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
         this.values.putAll(var1.bridge$values());
         this.flags.addAll(var1.bridge$flags());
      }

      @Override
      public void bridge$copyFrom(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         this.values.putAll(var1.bridge$values());
         this.flags.addAll(var1.bridge$flags());
      }

      @Override
      public void bridge$define(@NotNull String var1, String var2) {
         if (this.values == null) {
            this.values = ImmutableMap.builder();
         }

         this.values.put(var1, CRICCIRRRCIICCHOOIORCHIHIIROHO(var2));
      }

      @Override
      public void bridge$define(@NotNull String var1) {
         if (this.flags == null) {
            this.flags = ImmutableSet.builder();
         }

         this.flags.add(var1);
      }

      @Override
      public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$build() {
         return new CRRRICCRROCOHHOHIICIHORCOORRRH(
            this.values == null ? ImmutableMap.of() : this.values.build(), this.flags == null ? ImmutableSet.of() : this.flags.build()
         );
      }

      private static String CRICCIRRRCIICCHOOIORCHIHIIROHO(String var0) {
         return var0.replaceAll("\n", "\\\\\n");
      }

      @Override
      public Map<String, String> bridge$values() {
         return Map.of();
      }

      @Override
      public Collection<String> bridge$flags() {
         return List.of();
      }
   }
}
