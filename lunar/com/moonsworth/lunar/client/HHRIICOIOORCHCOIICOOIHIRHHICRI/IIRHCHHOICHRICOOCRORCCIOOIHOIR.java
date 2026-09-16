package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<Set<String>> {
   private final List<String> CORIHCROOICHRRCOIIIHROCRHCORIC = new ArrayList<>();
   private final @Nullable Consumer<String> OROOHIRIRCIRCOIROROHCCCHHCIOCI;
   private final Function<String, String> IRRHOOCIIROHHCOCHICICRIHOCHCCO;

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Set<String>> var2,
      Collection<String> var3,
      Set<String> var4,
      @Nullable Consumer<String> var5,
      Function<String, String> var6
   ) {
      super(var1, var2, new LinkedHashSet<>(var4));
      this.OROOHIRIRCIRCOIROROHCCCHHCIOCI = var5;
      this.IRRHOOCIIROHHCOCHICICRIHOCHCCO = var6;
      this.CORIHCROOICHRRCOIIIHROCRHCORIC.addAll(var3);
      this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(new HashSet<>(var4));
   }

   public IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      Collection<String> var2,
      Set<String> var3,
      Function<String, String> var4
   ) {
      this(var1, null, var2, var3, null, var4);
   }

   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(Set<String> var1) {
      super.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(new LinkedHashSet(var1));
   }

   public boolean OIHIRIHHROCIHCCOROROIRIOHHIHHR(String var1) {
      boolean var2 = this.get().add(var1);
      if (this.OROOHIRIRCIRCOIROROHCCCHHCIOCI != null) {
         this.OROOHIRIRCIRCOIROROHCCCHHCIOCI.accept(var1);
      }

      return var2;
   }

   public boolean remove(String var1) {
      boolean var2 = this.get().remove(var1);
      if (this.OROOHIRIRCIRCOIROROHCCCHHCIOCI != null) {
         this.OROOHIRIRCIRCOIROROHCCCHHCIOCI.accept(var1);
      }

      return var2;
   }

   public boolean contains(String var1) {
      return this.get().contains(var1);
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<IIRHCHHOICHRICOOCRORCCIOOIHOIR> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this, var1
      );
   }

   @Override
   public void reset() {
      this.IOIICIRIICICIIOORHCIIIIRRIHRHI(new LinkedHashSet<>());
   }

   @Override
   public boolean isDefault() {
      return this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC().isEmpty();
   }

   @Generated
   public List<String> ROROOCRROIHIICHCOIIHCRROCHHCOI() {
      return this.CORIHCROOICHRRCOIIIHROCRHCORIC;
   }

   @Generated
   public Function<String, String> OIHICICOHICRIIHRRHRRICHRICRCCO() {
      return this.IRRHOOCIIROHHCOCHICICRIHOCHCCO;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<O extends IIRHCHHOICHRICOOCRORCCIOOIHOIR, B extends IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<O, B>>
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<B, O, Set<String>> {
      protected @Nullable Collection<String> IIRCICOICHOHRCOORCOIRRCOOIHHIO;
      protected @Nullable Consumer<String> OROOHIRIRCIRCOIROROHCCCHHCIOCI;
      protected @Nullable Function<String, String> HCRIRRCOHIOOOHOOCHOHOICRRRCIRI;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.MODIFIABLE_LIST;
      }

      @Override
      protected @Nullable Codec<Set<String>> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Codec.STRING);
      }

      @Contract("_->this")
      public B CORCOCICIRIOHROHROIIOOHICCHCRR(Collection<String> var1) {
         this.IIRCICOICHOHRCOORCOIRRCOOIHHIO = var1;
         return (B)this;
      }

      @Contract("_->this")
      public B IHCRORHRORIICHRHRCHRRIRRHHOCOO(String... var1) {
         return this.CORCOCICIRIOHROHROIIOOHICCHCRR(List.of(var1));
      }

      @Contract("_->this")
      public B IIOIROIHIHHCCRICRCOOCHIICHRCOI(Consumer<String> var1) {
         this.OROOHIRIRCIRCOIROROHCCCHHCIOCI = var1;
         return (B)this;
      }

      @Contract("_->this")
      public B HICHRCOHCCRHOHCICOOCHOIHCCHIRI(@Nullable Function<String, String> var1) {
         this.HCRIRRCOHIOOOHOOCHOHOICRRRCIRI = var1;
         return (B)this;
      }

      protected O CHIRHRRHCIORIHCROOOORCOOIIOHHH() {
         return (O)(new IIRHCHHOICHRICOOCRORCCIOOIHOIR(
            this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO,
            this.codec,
            this.IIRCICOICHOHRCOORCOIRRCOOIHHIO == null ? List.of() : this.IIRCICOICHOHRCOORCOIRRCOOIHHIO,
            this.defaultValue == null ? new HashSet<>() : this.defaultValue,
            this.OROOHIRIRCIRCOIROROHCCCHHCIOCI,
            this.HCRIRRCOHIOOOHOOCHOHOICRRRCIRI == null ? var0 -> var0 : this.HCRIRRCOHIOOOHOOCHOHOICRRRCIRI
         ));
      }
   }
}
