package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.Generated;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> ROOCCRHRCHRRCRHORHHRORCCOHRCHH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      ArrayList var2 = new ArrayList(this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH.size());

      record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         private final String OHICOORHHHRHOCOROIROCOCCRRHROC;
         private final String RHCCRCCHIIHCIRIOOORHCHRRORHHIO;

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
            this.OHICOORHHHRHOCOROIROCOCCRRHROC = var1;
            this.RHCCRCCHIIHCIRIOOORHCHRRORHHIO = var2;
         }

         public String name() {
            return this.OHICOORHHHRHOCOROIROCOCCRRHROC;
         }

         public String HICICHIICICRRIHIHCOHCRORORORHO() {
            return this.RHCCRCCHIIHCIRIOOORHCHRRORHHIO;
         }
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH,
         var1.ROOCCRHRCHRRCRHORHHRORCCOHRCHH,
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::getNewName,
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::IOCIHHHCCICRHCIIRIOHOHHRROCCRH,
         (var1x, var2x) -> {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1x.CCIIICOOHHRHHICHHRIORRICOOIIOR, var2x.COIHCIRICROCOHRCOCIIIOHOIHOOHO
            );
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1x.IRIRHOCHRRCHHRHICICRROHOHIHHRC,
               var2x.IRIRHOCHRRCHHRHICICRROHOHIHHRC,
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::getNewName,
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::IOCIHHHCCICRHCIIRIOHOHHRROCCRH,
               (var1xx, var2xx) -> var3.IRIRHOCHRRCHHRHICICRROHOHIHHRC
                  .add(
                     new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var1xx.RIHCCCRICHORCCCORCOHOCOCHOROOC,
                        var1xx.CHIRORIHRHCIOHIIIIHRCOOCROICRH,
                        var2xx.CRRRROIHRCRHRRCIHCRORHHIOOHHOO,
                        var2xx.CORIRCIICCHIRRIHCIHHIRIOIRRHIC
                     )
                  )
            );
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1x.OORHCHORHCCIHRIROHCROROHHHCOHI,
               var2x.OORHCHORHCCIHRIROHCROROHHHCOHI,
               var0x -> new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0x.IIIHHRIIHIOHHRHICRHCHCICHORRHC, var0x.CROHHHCRIHHCCCCCIOCCIRORCROHOC),
               var0x -> new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0x.HHRHHHHCOCICIROHCOCOIRHIIORIHR, var0x.IHRHHIIRIOIRROHRCHOICRIHRCIHIH),
               (var1xx, var2xx) -> var3.OORHCHORHCCIHRIROHCROROHHHCOHI
                  .add(
                     new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                        var1xx.HHRHHHHCOCICIROHCOCOIRHIIORIHR,
                        var1xx.IHRHHIIRIOIRROHRCHOICRIHRCIHIH,
                        var2xx.IIIHHRIIHIOHHRHICRHCHCICHORRHC,
                        var2xx.CROHHHCRIHHCCCCCIOCCIRORCROHOC
                     )
                  )
            );
            var2.add(var3);
         }
      );
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }

   private static <T, K> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<T> var0, List<T> var1, Function<T, K> var2, Function<T, K> var3, BiConsumer<T, T> var4) {
      Map var5 = var1.stream().collect(Collectors.toMap(var3, Function.identity()));

      for (Object var7 : var0) {
         Object var8 = var5.get(var2.apply(var7));
         if (var8 != null) {
            var4.accept(var7, var8);
         }
      }
   }

   public MappingSet IRCIIHHICIHRCOCRROCOICRIHHCCHH(MappingSet var1, MappingSet var2) {
      MappingSet var3 = MappingSet.create();

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH) {
         ClassMapping var6 = var1.getOrCreateClassMapping(var5.CCIIICOOHHRHHICHHRIORRICOOIIOR);
         ClassMapping var7 = var2.getOrCreateClassMapping(var5.COIHCIRICROCOHRCOCIIIOHOIHOOHO);
         ClassMapping var8 = var3.getOrCreateClassMapping(var6.getFullDeobfuscatedName());
         var8.setDeobfuscatedName(var7.getFullDeobfuscatedName());

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var10 : var5.IRIRHOCHRRCHHRHICICRROHOHIHHRC) {
            var6.getFieldMapping(var10.RIHCCCRICHORCCCORCOHOCOCHOROOC)
               .ifPresent(
                  var3x -> var7.getFieldMapping(var10.CRRRROIHRCRHRRCIHCRORHHIOOHHOO)
                     .ifPresent(var2xx -> var8.createFieldMapping(var3x.getDeobfuscatedName(), var2xx.getDeobfuscatedName()))
               );
         }

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var12 : var5.OORHCHORHCCIHRIROHCROROHHHCOHI) {
            var6.getMethodMapping(var12.HHRHHHHCOCICIROHCOCOIRHIIORIHR, var12.IHRHHIIRIOIRROHRCHOICRIHRCIHIH)
               .ifPresent(
                  var3x -> var7.getMethodMapping(var12.IIIHHRIIHIOHHRHICRHCHCICHORRHC, var12.CROHHHCRIHHCCCCCIOCCIRORCROHOC)
                     .ifPresent(var2xx -> var8.createMethodMapping(var3x.getDeobfuscatedSignature()).setDeobfuscatedName(var2xx.getDeobfuscatedName()))
               );
         }
      }

      return var3;
   }

   public MappingSet RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(MappingSet var1) {
      MappingSet var2 = MappingSet.create();

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH) {
         var1.getClassMapping(var4.CCIIICOOHHRHHICHHRIORRICOOIIOR)
            .ifPresent(
               var2x -> {
                  ClassMapping var3 = var2.getOrCreateClassMapping(var4.COIHCIRICROCOHRCOCIIIOHOIHOOHO);
                  var3.setDeobfuscatedName(var2x.getFullDeobfuscatedName());

                  for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 : var4.IRIRHOCHRRCHHRHICICRROHOHIHHRC) {
                     var2x.getFieldMapping(var5.RIHCCCRICHORCCCORCOHOCOCHOROOC)
                        .ifPresent(
                           var2xx -> var3.getOrCreateFieldMapping(var5.CRRRROIHRCRHRRCIHCRORHHIOOHHOO).setDeobfuscatedName(var2xx.getFullObfuscatedName())
                        );
                  }

                  for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 : var4.OORHCHORHCCIHRIROHCROROHHHCOHI) {
                     var2x.getMethodMapping(var7.HHRHHHHCOCICIROHCOCOIRHIIORIHR, var7.IHRHHIIRIOIRROHRCHOICRIHRCIHIH)
                        .ifPresent(
                           var2xx -> var3.getOrCreateMethodMapping(var7.IIIHHRIIHIOHHRHICRHCHCICHORRHC, var7.CROHHHCRIHHCCCCCIOCCIRORCROHOC)
                              .setDeobfuscatedName(var2xx.getDeobfuscatedName())
                        );
                  }
               }
            );
      }

      return var2;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIOIRHOIHRCCROOORIICHCORICCRR() {
      ArrayList var1 = new ArrayList();

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var3.COIHCIRICROCOHRCOCIIIOHOIHOOHO, var3.CCIIICOOHHRHHICHHRIORRICOOIIOR
         );
         var1.add(var4);

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 : var3.IRIRHOCHRRCHHRHICICRROHOHIHHRC) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var6.CRRRROIHRCRHRRCIHCRORHHIOOHHOO,
               var6.CORIRCIICCHIRRIHCIHHIRIOIRRHIC,
               var6.RIHCCCRICHORCCCORCOHOCOCHOROOC,
               var6.CHIRORIHRHCIOHIIIIHRCOOCROICRH
            );
            var4.IRIRHOCHRRCHHRHICICRROHOHIHHRC.add(var7);
         }

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var9 : var3.OORHCHORHCCIHRIROHCROROHHHCOHI) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var10 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               var9.IIIHHRIIHIOHHRHICRHCHCICHORRHC,
               var9.CROHHHCRIHHCCCCCIOCCIRORCROHOC,
               var9.HHRHHHHCOCICIROHCOCOIRHIIORIHR,
               var9.CROHHHCRIHHCCCCCIOCCIRORCROHOC
            );
            var4.OORHCHORHCCIHRIROHCROROHHHCOHI.add(var10);
         }
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   public MappingSet RROCIIHIHIIICOCIHICIOHCRIRCRCI() {
      MappingSet var1 = MappingSet.create();

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH) {
         ClassMapping var4 = var1.getOrCreateClassMapping(var3.CCIIICOOHHRHHICHHRIORRICOOIIOR);
         var4.setDeobfuscatedName(var3.COIHCIRICROCOHRCOCIIIOHOIHOOHO);

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 : var3.IRIRHOCHRRCHHRHICICRROHOHIHHRC) {
            var4.createFieldMapping(var6.RIHCCCRICHORCCCORCOHOCOCHOROOC).setDeobfuscatedName(var6.CRRRROIHRCRHRRCIHCRORHHIOOHHOO);
         }

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 : var3.OORHCHORHCCIHRIROHCROROHHHCOHI) {
            var4.createMethodMapping(var8.HHRHHHHCOCICIROHCOCOIRHIIORIHR, var8.IHRHHIIRIOIRROHRCHOICRIHRCIHIH)
               .setDeobfuscatedName(var8.IIIHHRIIHIOHHRHICRHCHCICHORRHC);
         }
      }

      return var1;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHHCHIIHOOHRROCRRRHHHCOOHCOORC(List<String> var0) {
      try {
         ArrayList var1 = new ArrayList();
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = null;

         for (String var4 : var0) {
            if (var4.contains("\t")) {
               String[] var5 = var4.split("\t");
               if (var4.startsWith("c\t")) {
                  String var6 = var5[1].substring(1, var5[1].length() - 1);
                  String var7 = var5[2].substring(1, var5[2].length() - 1);
                  var2 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6, var7);
                  var1.add(var2);
               } else if (var4.startsWith("\tm\t")) {
                  if (var2 != null) {
                     String var15 = var5[2];
                     int var17 = var15.indexOf(40);
                     String var8 = var15.substring(0, var17);
                     String var9 = var15.substring(var17);
                     String var10 = var5[3];
                     var17 = var10.indexOf(40);
                     String var11 = var10.substring(0, var17);
                     String var12 = var10.substring(var17);
                     var2.OORHCHORHCCIHRIROHCROROHHHCOHI.add(new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8, var9, var11, var12));
                  }
               } else if (var4.startsWith("\tf\t") && var2 != null) {
                  String var16 = var5[2];
                  String[] var19 = var16.split(";;");
                  String var20 = var19[0];
                  String var21 = var19[1];
                  String var22 = var5[3];
                  String[] var23 = var22.split(";;");
                  String var24 = var23[0];
                  String var13 = var23[1];
                  var2.IRIRHOCHRRCHHRHICICRROHOHIHHRC.add(new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var20, var21, var24, var13));
               }
            }
         }

         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      } catch (Throwable var14) {
         throw var14;
      }
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCHROOHRIHCRCRHRIIROCIRHOIRHH(MappingSet var0) {
      ArrayList var1 = new ArrayList();

      for (TopLevelClassMapping var3 : var0.getTopLevelClassMappings()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var0, ClassMapping<?, ?> var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1.getFullObfuscatedName(), var1.getFullDeobfuscatedName()
      );
      var0.add(var2);

      for (FieldMapping var4 : var1.getFieldMappings()) {
         var2.IRIRHOCHRRCHHRHICICRROHOHIHHRC
            .add(
               new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var4.getObfuscatedName(), var4.getSignature().toString(), var4.getDeobfuscatedName(), var4.getDeobfuscatedSignature().toString()
               )
            );
      }

      for (MethodMapping var7 : var1.getMethodMappings()) {
         var2.OORHCHORHCCIHRIROHCROROHHHCOHI
            .add(
               new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  var7.getObfuscatedName(), var7.getSignature().toString(), var7.getDeobfuscatedName(), var7.getDeobfuscatedSignature().toString()
               )
            );
      }

      for (InnerClassMapping var8 : var1.getInnerClassMappings()) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var8);
      }
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(MappingSet var0, MappingSet var1) {
      ArrayList var2 = new ArrayList();

      label23:
      for (TopLevelClassMapping var4 : var0.getTopLevelClassMappings()) {
         for (TopLevelClassMapping var6 : var1.getTopLevelClassMappings()) {
            if (var4.getFullDeobfuscatedName().equals(var6.getFullDeobfuscatedName())) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4, var6);
               continue label23;
            }
         }

         System.out.println("Couldn't find match for " + var4.getFullDeobfuscatedName());
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var0, ClassMapping<?, ?> var1, ClassMapping<?, ?> var2
   ) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1.getFullObfuscatedName(), var2.getFullObfuscatedName()
      );
      var0.add(var3);

      for (FieldMapping var5 : var1.getFieldMappings()) {
         for (FieldMapping var7 : var2.getFieldMappings()) {
            if (var5.getDeobfuscatedName().equals(var7.getDeobfuscatedName())) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var5.getObfuscatedName(),
                  var5.getSignature().getType().map(Object::toString).orElse(""),
                  var7.getObfuscatedName(),
                  var7.getSignature().getType().map(Object::toString).orElse("")
               );
               var3.IRIRHOCHRRCHHRHICICRROHOHIHHRC.add(var8);
               break;
            }
         }
      }

      for (MethodMapping var11 : var1.getMethodMappings()) {
         for (MethodMapping var15 : var2.getMethodMappings()) {
            if (var11.getDeobfuscatedName().equals(var15.getDeobfuscatedName())
               && var11.getSignature().getDescriptor().toString().equals(var15.getSignature().getDescriptor().toString())) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var17 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  var11.getObfuscatedName(),
                  var11.getSignature().getDescriptor().toString(),
                  var15.getObfuscatedName(),
                  var15.getSignature().getDescriptor().toString()
               );
               var3.OORHCHORHCCIHRIROHCROROHHHCOHI.add(var17);
               break;
            }
         }
      }

      for (InnerClassMapping var12 : var1.getInnerClassMappings()) {
         for (InnerClassMapping var16 : var2.getInnerClassMappings()) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var12, var16);
         }
      }
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH = var1;
   }

   @Generated
   public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CHOOCIIOIOCICCHHOHOHRIICCRICOO() {
      return this.ROOCCRHRCHRRCRHORHHRORCCOHRCHH;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         List var3 = this.CHOOCIIOIOCICCHHOHOHRIICCRICOO();
         List var4 = var2.CHOOCIIOIOCICCHHOHOHRIICCRICOO();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      List var3 = this.CHOOCIIOIOCICCHHOHOHRIICCRICOO();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "Match(classMatches=" + this.CHOOCIIOIOCICCHHOHOHRIICCRICOO() + ")";
   }

   public interface CRRRICCRROCOHHOHIICIHORCOORRRH {
      String IOCIHHHCCICRHCIIRIOHOHHRROCCRH();

      String RIHIHRRCCIIOIOCIHOCIHRHHOHIIOI();

      String getNewName();

      String HCOOOOIRICHRCRIRCHORROIIRRIROO();
   }

   public static class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final String RIHCCCRICHORCCCORCOHOCOCHOROOC;
      private final String CHIRORIHRHCIOHIIIIHRCOOCROICRH;
      private final String CRRRROIHRCRHRRCIHCRORHHIOOHHOO;
      private final String CORIRCIICCHIRRIHCIHHIRIOIRRHIC;

      @Override
      public String RIHIHRRCCIIOIOCIHOCIHRHHOHIIOI() {
         return this.CHIRORIHRHCIOHIIIIHRCOOCROICRH;
      }

      @Override
      public String HCOOOOIRICHRCRIRCHORROIIRRIROO() {
         return this.CORIRCIICCHIRRIHCIHHIRIOIRRHIC;
      }

      @Generated
      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, String var2, String var3, String var4) {
         this.RIHCCCRICHORCCCORCOHOCOCHOROOC = var1;
         this.CHIRORIHRHCIOHIIIIHRCOOCROICRH = var2;
         this.CRRRROIHRCRHRRCIHCRORHHIOOHHOO = var3;
         this.CORIRCIICCHIRRIHCIHHIRIOIRRHIC = var4;
      }

      @Generated
      @Override
      public String IOCIHHHCCICRHCIIRIOHOHHRROCCRH() {
         return this.RIHCCCRICHORCCCORCOHOCOCHOROOC;
      }

      @Generated
      public String HCCRHHCRCRCCHCHOOORHICCHHCCOIR() {
         return this.CHIRORIHRHCIOHIIIIHRCOOCROICRH;
      }

      @Generated
      @Override
      public String getNewName() {
         return this.CRRRROIHRCRHRRCIHCRORHHIOOHHOO;
      }

      @Generated
      public String ORORCHHCCOOORHCRRORHRRHROROOCH() {
         return this.CORIRCIICCHIRRIHCIHHIRIOIRRHIC;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2)) {
            return false;
         } else {
            if (!var2.canEqual(this)) {
               return false;
            }

            String var3 = this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
            String var4 = var2.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.HCCRHHCRCRCCHCHOOORHICCHHCCOIR();
               String var6 = var2.HCCRHHCRCRCCHCHOOORHICCHHCCOIR();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  String var7 = this.getNewName();
                  String var8 = var2.getNewName();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     String var9 = this.ORORCHHCCOOORHCRRORHRRHROROOCH();
                     String var10 = var2.ORORCHHCCOOORHCRRORHRRHROROOCH();
                     return var9 == null ? var10 == null : var9.equals(var10);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }

      @Generated
      protected boolean canEqual(Object var1) {
         return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         String var3 = this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         String var4 = this.HCCRHHCRCRCCHCHOOORHICCHHCCOIR();
         var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
         String var5 = this.getNewName();
         var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
         String var6 = this.ORORCHHCCOOORHCRRORHRRHROROOCH();
         return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "Match.FieldMatch(oldName="
            + this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH()
            + ", oldFieldType="
            + this.HCCRHHCRCRCCHCHOOORHICCHHCCOIR()
            + ", newName="
            + this.getNewName()
            + ", newFieldType="
            + this.ORORCHHCCOOORHCRRORHRRHROROOCH()
            + ")";
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final String CCIIICOOHHRHHICHHRIORRICOOIIOR;
      private final String COIHCIRICROCOHRCOCIIIOHOIHOOHO;
      private final List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> IRIRHOCHRRCHHRHICICRROHOHIHHRC = new ArrayList<>();
      private final List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> OORHCHORHCCIHRIROHCROROHHHCOHI = new ArrayList<>();

      @Generated
      public String IOCIHHHCCICRHCIIRIOHOHHRROCCRH() {
         return this.CCIIICOOHHRHHICHHRIORRICOOIIOR;
      }

      @Generated
      public String getNewName() {
         return this.COIHCIRICROCOHRCOCIIIOHOIHOOHO;
      }

      @Generated
      public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> IOIRCORHCORCIHHCOHIHIHHIHIRIII() {
         return this.IRIRHOCHRRCHHRHICICRROHOHIHHRC;
      }

      @Generated
      public List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> HCOIRHOIOHCICOHOICHHHRHIRCRORO() {
         return this.OORHCHORHCCIHRIROHCROROHHHCOHI;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2)) {
            return false;
         } else {
            if (!var2.canEqual(this)) {
               return false;
            }

            String var3 = this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
            String var4 = var2.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.getNewName();
               String var6 = var2.getNewName();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  List var7 = this.IOIRCORHCORCIHHCOHIHIHHIHIRIII();
                  List var8 = var2.IOIRCORHCORCIHHCOHIHIHHIHIRIII();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     List var9 = this.HCOIRHOIOHCICOHOICHHHRHIRCRORO();
                     List var10 = var2.HCOIRHOIOHCICOHOICHHHRHIRCRORO();
                     return var9 == null ? var10 == null : var9.equals(var10);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }

      @Generated
      protected boolean canEqual(Object var1) {
         return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         String var3 = this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         String var4 = this.getNewName();
         var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
         List var5 = this.IOIRCORHCORCIHHCOHIHIHHIHIRIII();
         var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
         List var6 = this.HCOIRHOIOHCICOHOICHHHRHIRCRORO();
         return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "Match.ClassMatch(oldName="
            + this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH()
            + ", newName="
            + this.getNewName()
            + ", fieldMatches="
            + this.IOIRCORHCORCIHHCOHIHIHHIHIRIII()
            + ", methodMatches="
            + this.HCOIRHOIOHCICOHOICHHHRHIRCRORO()
            + ")";
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2) {
         this.CCIIICOOHHRHHICHHRIORRICOOIIOR = var1;
         this.COIHCIRICROCOHRCOCIIIOHOIHOOHO = var2;
      }
   }

   public static class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final String HHRHHHHCOCICIROHCOCOIRHIIORIHR;
      private final String IHRHHIIRIOIRROHRCHOICRIHRCIHIH;
      private final String IIIHHRIIHIOHHRHICRHCHCICHORRHC;
      private final String CROHHHCRIHHCCCCCIOCCIRORCROHOC;

      @Override
      public String RIHIHRRCCIIOIOCIHOCIHRHHOHIIOI() {
         return this.IHRHHIIRIOIRROHRCHOICRIHRCIHIH;
      }

      @Override
      public String HCOOOOIRICHRCRIRCHORROIIRRIROO() {
         return this.CROHHHCRIHHCCCCCIOCCIRORCROHOC;
      }

      @Generated
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, String var2, String var3, String var4) {
         this.HHRHHHHCOCICIROHCOCOIRHIIORIHR = var1;
         this.IHRHHIIRIOIRROHRCHOICRIHRCIHIH = var2;
         this.IIIHHRIIHIOHHRHICRHCHCICHORRHC = var3;
         this.CROHHHCRIHHCCCCCIOCCIRORCROHOC = var4;
      }

      @Generated
      @Override
      public String IOCIHHHCCICRHCIIRIOHOHHRROCCRH() {
         return this.HHRHHHHCOCICIROHCOCOIRHIIORIHR;
      }

      @Generated
      public String HHROHRHRCIOOOOCHRCOHCOIHHHHRIH() {
         return this.IHRHHIIRIOIRROHRCHOICRIHRCIHIH;
      }

      @Generated
      @Override
      public String getNewName() {
         return this.IIIHHRIIHIOHHRHICRHCHCICHORRHC;
      }

      @Generated
      public String HCRICOHIICORIRIROROHIIORHOHCHC() {
         return this.CROHHHCRIHHCCCCCIOCCIRORCROHOC;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2)) {
            return false;
         } else {
            if (!var2.canEqual(this)) {
               return false;
            }

            String var3 = this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
            String var4 = var2.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.HHROHRHRCIOOOOCHRCOHCOIHHHHRIH();
               String var6 = var2.HHROHRHRCIOOOOCHRCOHCOIHHHHRIH();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  String var7 = this.getNewName();
                  String var8 = var2.getNewName();
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     String var9 = this.HCRICOHIICORIRIROROHIIORHOHCHC();
                     String var10 = var2.HCRICOHIICORIRIROROHIIORHOHCHC();
                     return var9 == null ? var10 == null : var9.equals(var10);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }

      @Generated
      protected boolean canEqual(Object var1) {
         return var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         String var3 = this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         String var4 = this.HHROHRHRCIOOOOCHRCOHCOIHHHHRIH();
         var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
         String var5 = this.getNewName();
         var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
         String var6 = this.HCRICOHIICORIRIROROHIIORHOHCHC();
         return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "Match.MethodMatch(oldName="
            + this.IOCIHHHCCICRHCIIRIOHOHHRROCCRH()
            + ", oldSignature="
            + this.HHROHRHRCIOOOOCHRCOHCOIHHHHRIH()
            + ", newName="
            + this.getNewName()
            + ", newSignature="
            + this.HCRICOHIICORIRIROROHIIORHOHCHC()
            + ")";
      }
   }
}
