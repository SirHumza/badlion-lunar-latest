package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.common.base.CaseFormat;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.util.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public interface HCHRIROHHHCORIOCROOCHRCIOROOCI<T>
   extends IOHHOIIOCRHCHHCRORICCOHOHROOIH,
   com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH<HCHRIROHHHCORIOCROOCHRCIOROOCI<T>, T>,
   RHOCHHIRRCHHHOHOIRROIROHHHIHIO,
   com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH,
   com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.CRICCOOHHHCHOORCICOCOHIHOIRHOO,
   com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.IHHCHHHCRIHOOCOIOOCRIIICIOROIR,
   Cloneable {
   @ORRCOOOCHCIIRRRCORIIOOHHOHCOIH
   @Override
   String getId();

   default String CHIIRICICCCIIRRRICIICCCIIHHRRO() {
      return this.getId();
   }

   default String IHORCCORHOCIHHIHRRHOOHHOIRORRH() {
      return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, this.getId());
   }

   default String getName() {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ROIIHIIRRCCHIRIIOCIORICOHCRIRC
      );
      if (var1 != null) {
         String var2 = var1.RCHCRRRHCIRHCOOIOCICOHCHCOOHHO();
         if (var2 != null) {
            return var2;
         }
      }

      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.CHIIRICICCCIIRRRICIICCCIIHHRRO());
   }

   T getDefaultValue();

   void IOHHOIIOCRHCHHCRORICCOHOHROOIH(T var1);

   T HRHHHHIICCCIROOOHIIIHIHIHHHOHC();

   default Class<? extends HCHRIROHHHCORIOCROOCHRCIOROOCI> HRIOIIOORCRIRCROHOHRIRIIRRCCOR() {
      return (Class<? extends HCHRIROHHHCORIOCROOCHRCIOROOCI>)this.getClass();
   }

   default com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> ORIOOOCCIIIROICIHCOCHHRCOOHIIR() {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         (com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T>>)com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORHIRHCROOIOOIIOCRIHOIRHCHOIOI,
         var0 -> com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRIIIOOIIOIHRCCOOCRIIORIRHHOII()
      );
   }

   default <S extends HCHRIROHHHCORIOCROOCHRCIOROOCI<T>> S IOIOHIORIROHRRCOOOHCROHORCOIIH(Consumer<T> var1) {
      this.ORIOOOCCIIIROICIHCOCHHRCOOHIIR().OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);

      try {
         var1.accept(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC());
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      return (S)this;
   }

   default <S extends HCHRIROHHHCORIOCROOCHRCIOROOCI<T>> S IIOCHOIICCIORCOROIROHICCHIOHIC(Consumer<T> var1) {
      this.ORIOOOCCIIIROICIHCOCHHRCOOHIIR().OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
      return (S)this;
   }

   default <S extends HCHRIROHHHCORIOCROOCHRCIOROOCI<T>> S OHIIIOHIRIRCCRRIOIICCHHIORRHOH(Runnable var1) {
      this.ORIOOOCCIIIROICIHCOCHHRCOOHIIR().OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1x -> var1.run());
      return (S)this;
   }

   default void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(T var1) {
      this.CRRRICCRROCOHHOHIICIHORCOORRRH((T)var1, false);
   }

   void CRRRICCRROCOHHOHIICIHORCOORRRH(T var1, boolean var2);

   void RRHOOOORORHHOOIHRCCHIIHHIIIIOH(T var1);

   void HIHHOCRHHRORRHHRORRRIIHHORIHOC(Object var1);

   @com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      RHCCIRHOHROOOIOHHIIHOCHRCOHOCO = com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DYNAMICLISTENER_ISENABLED
   )
   T get();

   String getValueAsString();

   boolean isHidden();

   Optional<T> RIROICHCRROROHCCROOCCCCOCHCCRI(JsonElement var1);

   default void OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(String var1) {
      throw new RuntimeException("This option doesn't support parseUpdate()");
   }

   default void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1, boolean var2) {
      this.load(var1);
   }

   @Override
   void load(JsonObject var1);

   @Override
   void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1);

   default void reset() {
      this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(this.getDefaultValue());
   }

   default boolean isDefault() {
      return Objects.equals(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC(), this.getDefaultValue());
   }

   @Nullable
   ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   );

   @Override
   String getLanguagePath();

   void ORHIOICIOCRRHOOCOHRORIHICHRCRR(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1);

   HCHRIROHHHCORIOCROOCHRCIOROOCI<T> OROOOIIIIOCROOOHOIORCIHHCIHOIR();

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1);

   List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> getChildren();

   @Nullable
   default Collection<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> CIIRCHCRCRHOCICHCHCRIICCCORICO() {
      return null;
   }

   @Contract("->this")
   @Override
   default HCHRIROHHHCORIOCROOCHRCIOROOCI<T> CHCROCIHRRCHHCIHIICOCOCIIHCCOO() {
      return this;
   }

   @Nullable
   default T IIIIRHIHROIRCROHHROIHIIHRCRRHO(@NonNull Object var1) {
      Class var2 = var1.getClass();
      Class var3 = this.getDefaultValue().getClass();
      if (var2 == var3) {
         return (T)var1;
      }

      if (this.getDefaultValue() instanceof Number var4 && var1 instanceof Number var5) {
         if (var4 instanceof Double) {
            return (T)var5.doubleValue();
         }

         if (var4 instanceof Float) {
            return (T)var5.floatValue();
         }

         if (var4 instanceof Integer) {
            return (T)var5.intValue();
         }

         if (var4 instanceof Long) {
            return (T)var5.longValue();
         }

         if (var4 instanceof Short) {
            return (T)var5.shortValue();
         }

         if (var4 instanceof Byte) {
            return (T)var5.byteValue();
         }
      }

      if (var1 instanceof String var7) {
         return this.RIROICHCRROROHCCROOCCCCOCHCCRI(new JsonPrimitive(var7)).orElse(null);
      } else {
         throw new RuntimeException("Invalid type for option: " + this.getId() + ", expected: " + var3.getSimpleName() + ", got: " + var2.getSimpleName());
      }
   }
}
