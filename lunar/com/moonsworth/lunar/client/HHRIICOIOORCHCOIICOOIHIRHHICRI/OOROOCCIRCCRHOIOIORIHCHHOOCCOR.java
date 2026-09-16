package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.common.base.CaseFormat;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.lunarclient.apollo.module.modsetting.ModSettingModule;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.JsonOps;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import com.moonsworth.lunar.client.util.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T>
   implements HCHRIROHHHCORIOCROOCHRCIOROOCI<T>,
   com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final boolean RHOHOCHHOROHICORCCCOOCRCOCCRII = false;
   private static final boolean CCIICHHCHIRCRHHROICHRIHHHORIHC = false;
   protected com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH RIRIRIOHROCRIIHOCIOCROIHICHOOO;
   @ORRCOOOCHCIIRRRCORIIOOHHOHCOIH
   private final String IIIROHROOCOIHRCHIOCORROOOROIOC;
   @Nullable
   private final Codec<T> RRRORCROCOCRIOCRORHRHORCRIHCOH;
   private String IIIRRHRHICCHHRHIHROCOOHCRICCHI;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2
   ) {
      this.IIIROHROOCOIHRCHIOCORROOOROIOC = var1;
      this.RRRORCROCOCRIOCRORHRHORCRIHCOH = var2;
      this.RIRIRIOHROCRIIHOCIOCROIHICHOOO = new com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCHHIOIROOIOCOHRHRICHCIIHHRIHC
      );
   }

   @Override
   public String CHIIRICICCCIIRRRICIICCCIIHHRRO() {
      return this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRRIIIHCRCRHCOIIIIICCCIIICROCR
         )
         .orElse(this.IIIROHROOCOIHRCHIOCORROOOROIOC);
   }

   @Override
   public String IHORCCORHOCIHHIHRRHOOHHOIRORRH() {
      if (this.IIIRRHRHICCHHRHIHROCOOHCRICCHI == null) {
         this.IIIRRHRHICCHHRHIHROCOOHCRICCHI = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, this.getId());
      }

      return this.IIIRRHRHICCHHRHIHROCOOHCRICCHI;
   }

   protected abstract void RRORCOIRRIICOOICOIOCORHORCHCOC(T var1);

   @Override
   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(Runnable var1) {
      this.ORIOOOCCIIIROICIHCOCHHRCOOHIIR().OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var1);
   }

   @Override
   public void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(Runnable var1) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORHIRHCROOIOOIIOCRIHOIRHCHOIOI
      );
      if (var2 != null) {
         var2.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var1);
      }
   }

   @Override
   public void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(T var1) {
      this.CRRRICCRROCOHHOHIICIHORCOORRRH((T)var1, false);
   }

   @Override
   public void CRRRICCRROCOHHOHIICIHORCOORRRH(T var1, boolean var2) {
      if (var2 || !Objects.equals(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC(), var1)) {
         this.RRORCOIRRIICOOICOIOCORHORCHCOC((T)var1);
         this.OOCHRIIIRIHRRCRIORHCROIIHCRRIC((T)var1);
         com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
         );
         if (var3 == null || var3.RROOOOIIOCRRHIOHCHRIOIIIHCHCCH().isEmpty()) {
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var4 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORHIRHCROOIOOIIOCRIHOIRHCHOIOI
            );
            if (var4 != null) {
               var4.COOCCHICCCIIICRHIOCOCIOOORCOCC(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC());
            }
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
            && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHHIHROORHHOOCCOOCHRIRHRHCRHIH().IOIICIRIICICIIOORHCIIIIRRIHRHI(this);
         }
      }
   }

   @Override
   public void RRHOOOORORHHOOIHRCCHIIHHIIIIOH(T var1) {
      if (!Objects.equals(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC(), var1)) {
         this.RRORCOIRRIICOOICOIOCORHORCHCOC((T)var1);
         this.OOCHRIIIRIHRRCRIORHCROIIHCRRIC((T)var1);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHHIHROORHHOOCCOOCHRIRHRHCRHIH().IOIICIRIICICIIOORHCIIIIRRIHRHI(this);
         }
      }
   }

   @Override
   public void HIHHOCRHHRORRHHRORRRIIHHORIHOC(Object var1) {
      if (var1 instanceof HCHRIROHHHCORIOCROOCHRCIOROOCI var2) {
         var1 = var2.get();
      }

      if (var1 != null && var1.getClass().isInstance(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC())) {
         this.RRORCOIRRIICOOICOIOCORHORCHCOC((T)var1);
         this.OOCHRIIIRIHRRCRIORHCROIIHCRRIC((T)var1);
      }
   }

   private void OOCHRIIIRIHRRCRIORHCROIIHCRRIC(T var1) {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null) {
         try {
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
            if (var2 != null) {
               var2.<com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     ModSettingModule.class
                  )
                  .ifPresent(
                     var2x -> ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2x)
                        .ORRIOOIROHHROIRCIIHIOOCIOOIIOO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1)
                  );
            }
         } catch (Throwable var3) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Apollo", "Apollo broadcast failed", var3
            );
         }
      }
   }

   @com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RHCCIRHOHROOOIOHHIIHOCHRCOHOCO = com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DYNAMICLISTENER_ISENABLED
   )
   @Override
   public T get() {
      com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
      com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
      );
      return (T)(var1 == null ? this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC() : var1.RROOOOIIOCRRHIOHCHRIOIIIHCHCCH().orElse(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC()));
   }

   @Override
   public String getValueAsString() {
      return this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC() == null ? "null" : this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC().toString();
   }

   @Override
   public boolean isHidden() {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ROIIHIIRRCCHIRIIOCIORICOHCRIRC
      );
      return var1 != null ? var1.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(this) : true;
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var1
   ) {
   }

   @Nullable
   @Override
   public final Collection<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> CIIRCHCRCRHOCICHCHCRIICCCORICO() {
      com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         LinkedList::new, (Class<T>)null
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      return var1.build();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      Collection var2 = this.CIIRCHCRCRHOCICHCHCRIICCCORICO();
      JsonObject var3 = var2 == null ? var1 : new JsonObject();
      if (this.RRRORCROCOCRIOCRORHRHORCRIHCOH != null && !Objects.equals(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC(), this.getDefaultValue())) {
         this.RRRORCROCOCRIOCRORHRHORCRIHCOH
            .encodeStart(JsonOps.INSTANCE, this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC())
            .ifError(var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((DataResult.Error<?>)var1x, "saving", "Option Save"))
            .ifSuccess(var3x -> {
               if (var2 == null) {
                  if (var3x instanceof JsonObject var4) {
                     if (!var4.isEmpty()) {
                        var3.add(this.IIIROHROOCOIHRCHIOCORROOOROIOC, var4);
                     }
                  } else if (var3x instanceof JsonArray var5x) {
                     if (!var5x.isEmpty()) {
                        var3.add(this.IIIROHROOCOIHRCHIOCORROOOROIOC, var5x);
                     }
                  } else if (!var3x.isJsonNull()) {
                     var3.add(this.IIIROHROOCOIHRCHIOCORROOOROIOC, var3x);
                  }
               } else {
                  var3.add("value", var3x);
               }
            });
      } else if (var2 == null) {
         var3.remove(this.IIIROHROOCOIHRCHIOCORROOOROIOC);
      }

      if (var2 != null) {
         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var5 : var2) {
            var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
         }

         if (!var3.isEmpty()) {
            var1.add(this.IIIROHROOCOIHRCHIOCORROOOROIOC, var3);
         }
      }

      for (RHOCHHIRRCHHHOHOIRROIROHHHIHIO var9 : this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(null)) {
         try {
            var9.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1, boolean var2) {
      try {
         this.load(var1);
      } finally {
         if (var2) {
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var5 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORHIRHCROOIOOIIOCRIHOIRHCHOIOI
            );
            if (var5 != null) {
               var5.COOCCHICCCIIICRHIOCOCIOOORCOCC(this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC());
            }
         }
      }
   }

   @Override
   public void load(JsonObject var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null);
      com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         LinkedList::new, (Class<T>)null
      );
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      List var3 = var2.build();
      if (var1.has(this.IIIROHROOCOIHRCHIOCORROOOROIOC) && !var1.get(this.IIIROHROOCOIHRCHIOCORROOOROIOC).isJsonNull()) {
         JsonElement var8 = var1.get(this.IIIROHROOCOIHRCHIOCORROOOROIOC);
         if (this.RRRORCROCOCRIOCRORHRHORCRIHCOH != null && (var3 == null || !var8.isJsonObject())) {
            this.RRRORCROCOCRIOCRORHRHORCRIHCOH
               .parse(JsonOps.INSTANCE, var8)
               .ifError(var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((DataResult.Error<?>)var1x, "loading", "Option Load"))
               .ifSuccess(this::RHRIIOOOCRHIIOORCOCRCHRCCRRCIH);
            if (var3 != null) {
               JsonObject var10 = new JsonObject();

               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var14 : var3) {
                  var14.load(var10);
               }
            }
         } else {
            JsonObject var9;
            if (var8.isJsonObject()) {
               var9 = var8.getAsJsonObject();
               String var11 = "value";
               if (this.RRRORCROCOCRIOCRORHRHORCRIHCOH != null) {
                  if (var9.has(var11) && !var9.get(var11).isJsonNull()) {
                     this.RRRORCROCOCRIOCRORHRHORCRIHCOH
                        .parse(JsonOps.INSTANCE, var9.get(var11))
                        .ifError(var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((DataResult.Error<?>)var1x, "loading", "Option Load"))
                        .ifSuccess(this::RHRIIOOOCRHIIOORCOCRCHRCCRRCIH);
                  } else {
                     this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(this.getDefaultValue());
                  }
               }
            } else {
               var9 = new JsonObject();
            }

            if (var3 != null) {
               for (HCHRIROHHHCORIOCROOCHRCIOROOCI var7 : var3) {
                  var7.load(var9);
               }
            }
         }
      } else {
         this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(this.getDefaultValue());
         if (var3 != null) {
            JsonObject var4 = new JsonObject();

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var6 : var3) {
               var6.load(var4);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DataResult.Error<?> var1, String var2, String var3) {
      String var4 = "Error " + var2 + " option " + this + ": " + var1;
      if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SENTRY_OPTION_PARSING
         .isEnabled()) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new IOException(var4), var3);
      } else {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var4);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, @Nullable List<RHOCHHIRRCHHHOHOIRROIROHHHIHIO> var2) {
      int var3 = this.RIRIRIOHROCRIIHOCIOCROIHICHOOO.size();
      List var4 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var2);

      for (RHOCHHIRRCHHHOHOIRROIROHHHIHIO var6 : var4) {
         try {
            var6.load(var1);
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      if (var3 != this.RIRIRIOHROCRIIHOCIOCROIHICHOOO.size()) {
         if (var2 != null) {
            var4.addAll(var2);
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4);
      }
   }

   private List<RHOCHHIRRCHHHOHOIRROIROHHHIHIO> IHCRORHRORIICHRHRCHRRIRRHHOCOO(@Nullable List<RHOCHHIRRCHHHOHOIRROIROHHHIHIO> var1) {
      ArrayList var2 = new ArrayList();

      for (Object var4 : this.RIRIRIOHROCRIIHOCIOCROIHICHOOO.values()) {
         if (var4 instanceof RHOCHHIRRCHHHOHOIRROIROHHHIHIO var5 && (var1 == null || !var1.contains(var5))) {
            var2.add(var5);
         }
      }

      var2.sort(Comparator.comparingInt(RHOCHHIRRCHHHOHOIRROIROHHHIHIO::priority));
      return var2;
   }

   @Override
   public String getLanguagePath() {
      return "settings";
   }

   @Override
   public void ORHIOICIOCRRHOOCOHRORIHICHRCRR(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      Object var2 = var1.get();
      if (var2 == null) {
         throw new IllegalArgumentException("Can't set value to null!");
      }

      if (this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC() == null) {
         throw new IllegalArgumentException("Can't copy into a null option!");
      }

      Class var3 = this.HRHHHHIICCCIROOOHIIIHIHIHHHOHC().getClass();
      Class var4 = var2.getClass();
      if (!Objects.equals(var3, var4)) {
         String var5 = String.format(
            "Can't set '%s %s' option value, expected %s, got %s from '%s %s'",
            this.getId(),
            this.getClass().getName(),
            var3,
            var4,
            var1.getId(),
            var1.getClass().getName()
         );
         throw new IllegalArgumentException(var5);
      }

      this.CRRRICCRROCOHHOHIICIHORCOORRRH((T)var2, false);
   }

   @Override
   public HCHRIROHHHCORIOCROOCHRCIOROOCI<T> OROOOIIIIOCROOOHOIORCIHHCIHOIR() {
      try {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)super.clone();
         var1.RIRIRIOHROCRIIHOCIOCROIHICHOOO = this.RIRIRIOHROCRIIHOCIOCROIHICHOOO.OCRHRHHOCIIRRIICIRRCIOCCHIHRIR();
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORHIRHCROOIOOIIOCRIHOIRHCHOIOI
         );
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO
         );
         if (var2 != null) {
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO,
               var2.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var1)
            );
         }

         return var1;
      } catch (CloneNotSupportedException var3) {
         throw new AssertionError();
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1) {
      if (!var1.getChildren().isEmpty()) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORCHIHOHHRORHCOIHIRCROIIOCCCII,
               var0 -> com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHHOHHCRRROCCIORCICIRHCCHRIOHO()
            )
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1.getChildren());
      }

      BooleanSupplier var2 = var1.HCORHHRCICRCCOOCHOHORHHRICHCII();
      if (var2 != null) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ROIIHIIRRCCHIRIIOCIORICOHCRIRC,
            (var1x, var2x) -> var2x == null
               ? com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
                  var2
               )
               : var2x.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2)
         );
      }

      if (var1.getFeatureId() != null) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IOCCCOOCOOHOCIRRHCCIOHRHIOHCCH,
            var1x -> var1.getFeatureId()
         );
      }
   }

   @Override
   public List<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> getChildren() {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.ORCHIHOHHRORHCOIHIRCROIIOCCCII
      );
      return var1 == null ? List.of() : var1.getChildren();
   }

   @Override
   public void OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(String var1) {
      this.RIROICHCRROROHCCROOCCCCOCHCCRI(CIOICHOCCRHORIRHHOOHHOROCCCIOR(var1)).ifPresent(this::RHRIIOOOCRHIIOORCOCRCHRCCRRCIH);
   }

   protected static JsonElement CIOICHOCCRHORIRHHOOHHOROCCCIOR(String var0) {
      try {
         JsonElement var1 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var0, JsonElement.class);
         return var1 == null ? new JsonPrimitive(var0) : var1;
      } catch (JsonSyntaxException var2) {
         return new JsonPrimitive(var0);
      }
   }

   @Override
   public final Optional<T> RIROICHCRROROHCCROOCCCCOCHCCRI(JsonElement var1) {
      return this.RRRORCROCOCRIOCRORHRHORCRIHCOH != null
         ? this.RRRORCROCOCRIOCRORHRHORCRIHCOH
            .parse(JsonOps.INSTANCE, var1)
            .ifError(var1x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((DataResult.Error<?>)var1x, "parsing", "Option Parse"))
            .result()
         : Optional.empty();
   }

   @Nullable
   @Override
   public final ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      BiFunction var2 = this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOIIIIOIRRRRHIOOHCRCCOHCCHCCIO
      );
      return var2 != null
         ? (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR)var2.apply(
            this, var1
         )
         : this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1);
   }

   @Nullable
   protected ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return null;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "[" + this.IIIROHROOCOIHRCHIOCORROOOROIOC + "]";
   }

   @Contract("->this")
   @Override
   public final HCHRIROHHHCORIOCROOCHRCIOROOCI<T> CHCROCIHRRCHHCIHIICOCOCIIHCCOO() {
      return this;
   }

   @Generated
   public com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.HHCCIRHCCCIIRHCROHIORHIRHHIORH HHRCIHOCOCHOHIOIIORRRIIRRIIIIO() {
      return this.RIRIRIOHROCRIIHOCIOCROIHICHOOO;
   }

   @Generated
   @Override
   public String getId() {
      return this.IIIROHROOCOIHRCHIOCORROOOROIOC;
   }

   @Generated
   @Override
   public <TRAIT> TRAIT RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT> var1, TRAIT var2
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, (TRAIT)var2);
   }

   @Generated
   @Override
   public <TRAIT> TRAIT RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT> var1, OOHRIIOOHROIOHCIRIHRHRRICRRHOI<TRAIT> var2
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Generated
   @Override
   public <TRAIT, B extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI<TRAIT>> TRAIT RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<TRAIT, B> var1, Consumer<B> var2
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Generated
   @Override
   public <TRAIT> TRAIT RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT> var1,
      Function<com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT>, ? extends TRAIT> var2
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Generated
   @Override
   public <TRAIT> TRAIT IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT> var1,
      Function<com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT>, ? extends TRAIT> var2
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
   }

   @Generated
   @Override
   public <TRAIT> TRAIT RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT> var1,
      BiFunction<com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<TRAIT>, ? super TRAIT, ? extends TRAIT> var2
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Generated
   @Override
   public <TRAIT> TRAIT RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<? extends TRAIT> var1
   ) {
      return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Generated
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Generated
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Generated
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
      this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }
}
