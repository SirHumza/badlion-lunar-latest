package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class RORCHCIIICOHIRROOORHOCCCCIOCCI extends ICICIOCHHHIHOCHCOHORIHRCOHHOCR<Object> {
   private static final long COCHCOHIHHOIORCIIIIIICRHCHCHRI = 1L;
   protected static final Object[] IRORIORCORIRCOIOCICHIOOOOCHCIO = new Object[0];
   public static final RORCHCIIICOHIRROOORHOCCCCIOCCI IIICOOCOCIRHRRRCHCCCHIOCHOHROI = new RORCHCIIICOHIRROOORHOCCCCIOCCI();
   protected final boolean HHICORIOHIHOOHIHRRCHCOCRIHRIOO;

   public RORCHCIIICOHIRROOORHOCCCCIOCCI() {
      this(false);
   }

   protected RORCHCIIICOHIRROOORHOCCCCIOCCI(boolean var1) {
      super(Object.class);
      this.HHICORIOHIHOOHIHRRCHCOCRIHRIOO = var1;
   }

   public static RORCHCIIICOHIRROOORHOCCCCIOCCI RRORIOHCCOCRHICHRIHHCIHOOHICHO(boolean var0) {
      return var0 ? new RORCHCIIICOHIRROOORHOCCCCIOCCI(true) : IIICOOCOCIRHRRRCHCCCHIOCHOHROI;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Untyped;
   }

   @Override
   public Boolean supportsUpdate(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return this.HHICORIOHIHOOHIHRRCHCOCRIHRIOO ? Boolean.FALSE : null;
   }

   @Override
   public Object deserialize(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1,
               var2,
               RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OICROOOICOOHCIIHHOCRRRIRIHHIIH(
                  var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.DUPLICATE_PROPERTIES
                  )
               )
            );
         case 2:
            return RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRRHCIIIOOOCCCOCHOOIHRROHCOHHC();
         case 3:
            return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRIROHICRRCCHRICOOCHIIOHIROI()
            );
         case 4:
         default:
            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
         case 5:
            return this.OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(var1, var2);
         case 6:
            return var1.getText();
         case 7:
            if (var2.CHIROICRORCCHHIIHRCCCICCIOCOHI(F_MASK_INT_COERCIONS)) {
               return this._coerceIntegral(var1, var2);
            }

            return var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
         case 8:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_DECIMAL_FOR_FLOATS
            )) {
               return var1.ICRHCOHOHIRRROHOCICOOCCIIHOOHI();
            }

            return var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
         case 9:
            return Boolean.TRUE;
         case 10:
            return Boolean.FALSE;
         case 11:
            return null;
         case 12:
            return var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
      }
   }

   @Override
   public Object deserializeWithType(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3
   ) {
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
         case 3:
         case 5:
            return var3.IORRORCRRHRRORHIRHRROHCRRIHRII(var1, var2);
         case 2:
         case 4:
         default:
            return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var1.OHIIIHRHICHRCHHHRIICRRRIROHHII());
      }
   }

   @Override
   public Object deserialize(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Object var3
   ) {
      if (this.HHICORIOHIHOOHIHRRCHCOCRIHRIOO) {
         return this.deserialize(var1, var2);
      }

      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var9 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
            if (var9 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_OBJECT) {
               return var3;
            }
         case 5:
            if (var3 instanceof Map) {
               Map var10 = (Map)var3;
               String var5 = var1.RRORHCRCCRHRICIIIICOHRCICCHRIC();

               do {
                  var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
                  Object var6 = var10.get(var5);
                  Object var7;
                  if (var6 != null) {
                     var7 = this.deserialize(var1, var2, var6);
                  } else {
                     var7 = this.deserialize(var1, var2);
                  }

                  if (var7 != var6) {
                     var10.put(var5, var7);
                  }
               } while ((var5 = var1.IOHIOOCIHIHRCCIHRCORICOCIHICII()) != null);

               return var3;
            }
            break;
         case 2:
         case 4:
            return var3;
         case 3:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var4 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
            if (var4 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
               return var3;
            }

            if (var3 instanceof Collection) {
               Collection var8 = (Collection)var3;

               do {
                  var8.add(this.deserialize(var1, var2));
               } while (
                  var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                     != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY
               );

               return var3;
            }
      }

      return this.deserialize(var1, var2);
   }

   private Object OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OICROOOICOOHCIIHHOCRRRIRIHHIIH(
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.DUPLICATE_PROPERTIES
         )
      );

      for (String var4 = var1.RRORHCRCCRHRICIIIICOHRCICCHRIC(); var4 != null; var4 = var1.IOHIOOCIHIHRCCIHRCORICOCIHICII()) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var6 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         if (var6 == null) {
            var6 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
         }

         Object var5;
         switch (var6.id()) {
            case 1:
               var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3.RCRIRRRHOHHIHICRIIRIIRRHHHHOOH());
               break;
            case 2:
               return var3.ORCHIOCIIHORRHORRRCCRIHRCOHHHR();
            case 3:
               var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3.OROCHCHHOICHCIIROROHICROHOIIII());
               break;
            default:
               var5 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var6.id());
         }

         var3.putValue(var4, var5);
      }

      return var3.ORCHIOCIIHORRHORRRCCRIHRCOHHHR();
   }

   private Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      boolean var4 = var2.CHIROICRORCCHHIIHRCCCICCIOCOHI(F_MASK_INT_COERCIONS);
      boolean var5 = var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_JAVA_ARRAY_FOR_JSON_ARRAY
      );
      RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var3;

      label93:
      while (true) {
         if (!var6.CHRCRHRIOOHHORIIHHRIOROIRCCCIH()) {
            while (true) {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var10 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
               if (var10 == null) {
                  var10 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }

               Object var11;
               switch (var10.id()) {
                  case 1:
                     var6 = var6.RCRIRRRHOHHIHICRIIRIIRRHHHHOOH();
                     continue label93;
                  case 2:
                  case 5:
                  default:
                     return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
                  case 3:
                     var6 = var6.OROCHCHHOICHCIIROROHICROHOIIII();
                     continue label93;
                  case 4:
                     if (var6 == var3) {
                        return var6.ROCCRHOORIOOROOIOIRRCRRIROIROH(var5);
                     }

                     var6 = var6.COHRICOCOHIIRICOHIOOHHCCRROCCI(var5);
                     continue label93;
                  case 6:
                     var11 = var1.getText();
                     break;
                  case 7:
                     var11 = var4 ? this._coerceIntegral(var1, var2) : var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
                     break;
                  case 8:
                     var11 = var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
                           com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_DECIMAL_FOR_FLOATS
                        )
                        ? var1.ICRHCOHOHIRRROHOCICOOCCIIHOOHI()
                        : var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
                     break;
                  case 9:
                     var11 = Boolean.TRUE;
                     break;
                  case 10:
                     var11 = Boolean.FALSE;
                     break;
                  case 11:
                     var11 = null;
                     break;
                  case 12:
                     var11 = var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
               }

               var6.RRRHHIRORHCHHCOOCIHOICORHHCHHO(var11);
            }
         } else {
            for (String var7 = var1.IOHIOOCIHIHRCCIHRCORICOCIHICII(); var7 != null; var7 = var1.IOHIOOCIHIHRCCIHRCORICOCIHICII()) {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var9 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
               if (var9 == null) {
                  var9 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.NOT_AVAILABLE;
               }

               Object var8;
               switch (var9.id()) {
                  case 1:
                     var6 = var6.HIHICIOOCHCIIHOIHIHCCOCHICIRRI(var7);
                     continue;
                  case 2:
                  case 4:
                  case 5:
                  default:
                     return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
                  case 3:
                     var6 = var6.ROHOIIRCHCRRRCOROORORROIIRCHIH(var7);
                     continue label93;
                  case 6:
                     var8 = var1.getText();
                     break;
                  case 7:
                     var8 = var4 ? this._coerceIntegral(var1, var2) : var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
                     break;
                  case 8:
                     var8 = var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
                           com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_DECIMAL_FOR_FLOATS
                        )
                        ? var1.ICRHCOHOHIRRROHOCICOOCCIIHOOHI()
                        : var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
                     break;
                  case 9:
                     var8 = Boolean.TRUE;
                     break;
                  case 10:
                     var8 = Boolean.FALSE;
                     break;
                  case 11:
                     var8 = null;
                     break;
                  case 12:
                     var8 = var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
               }

               var6.putValue(var7, var8);
            }

            if (var6 == var3) {
               return var6.ORCHIOCIIHORRHORRRCCRIHRCOHHHR();
            }

            var6 = var6.CHRROIRCRICRRIORIOCOHCRCOHRCCR();
         }
      }
   }

   private Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      int var3
   ) {
      switch (var3) {
         case 6:
            return var1.getText();
         case 7:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_INTEGER_FOR_INTS
            )) {
               return var1.ORHIIIOHCCCCRROHORHIICRHROIORH();
            }

            return var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
         case 8:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_DECIMAL_FOR_FLOATS
            )) {
               return var1.ICRHCOHOHIRRROHOCICOOCCIIHOOHI();
            }

            return var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
         case 9:
            return Boolean.TRUE;
         case 10:
            return Boolean.FALSE;
         case 11:
            return null;
         case 12:
            return var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
         default:
            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
      }
   }

   protected Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Map<String, Object> var3,
      String var4,
      Object var5,
      Object var6,
      String var7
   ) {
      boolean var8 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.DUPLICATE_PROPERTIES
      );
      if (var8) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var4, var5, var6);
      }

      while (var7 != null) {
         var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         var6 = this.deserialize(var1, var2);
         var5 = var3.put(var7, var6);
         if (var5 != null && var8) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var7, var5, var6);
         }

         var7 = var1.IOHIOOCIHIHRCCIHRCORICOCIHICII();
      }

      return var3;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<String, Object> var1, String var2, Object var3, Object var4) {
      if (var3 instanceof List) {
         ((List)var3).add(var4);
         var1.put(var2, var3);
      } else {
         ArrayList var5 = new ArrayList();
         var5.add(var3);
         var5.add(var4);
         var1.put(var2, var5);
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHCHIIRICHIHHCIIHOCCHCIIIROHOO;
      private RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICOCCCIRORICRHOCOIRCIRORRHIOHH;
      private boolean ICHRORHOCIOORCCORIIRIOICOIOCII;
      private boolean IIHCCRCRRRIIOCIHCHOICCHCOHRROR;
      private String IHRCCRHOIOOICIIIHIRIIOOOOHORHO;
      private Map<String, Object> IICCCHRIIORIRCIRCHHIRCIRIIIHHO;
      private List<Object> OCORCOCOIHRIHCHCHOCRIIRIHHHROH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO = var1;
         this.ICHRORHOCIOORCCORIIRIOICOIOCII = false;
         this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR = false;
      }

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2, boolean var3) {
         this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO = var1;
         this.ICHRORHOCIOORCCORIIRIOICOIOCII = var2;
         this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR = var3;
      }

      public static RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OICROOOICOOHCIIHHOCRRRIRIHHIIH(boolean var0) {
         return new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, true, var0);
      }

      public static RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHRIROHICRRCCHRICOOCHIIOHIROI() {
         return new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null);
      }

      private RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCCIRHHCRHRCHOORRCHOOICOOCHCCR() {
         this.ICHRORHOCIOORCCORIIRIOICOIOCII = false;
         return this;
      }

      private RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HROHHOOORHRHIRIHOIIORHOCHOOOHO(boolean var1) {
         this.ICHRORHOCIOORCCORIIRIOICOIOCII = true;
         this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR = var1;
         return this;
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCRIRRRHOHHIHICRIIRIIRRHHHHOOH() {
         return this.ICOCCCIRORICRHOCOIRCIRORRHIOHH == null
            ? new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, true, this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR)
            : this.ICOCCCIRORICRHOCOIRCIRORRHIOHH.HROHHOOORHRHIRIHOIIORHOCHOOOHO(this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR);
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIHICIOOCHCIIHOIHIHCCOCHICIRRI(String var1) {
         this.IHRCCRHOIOOICIIIHIRIIOOOOHORHO = var1;
         return this.ICOCCCIRORICRHOCOIRCIRORRHIOHH == null
            ? new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, true, this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR)
            : this.ICOCCCIRORICRHOCOIRCIRORRHIOHH.HROHHOOORHRHIRIHOIIORHOCHOOOHO(this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR);
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OROCHCHHOICHCIIROROHICROHOIIII() {
         return this.ICOCCCIRORICRHOCOIRCIRORRHIOHH == null
            ? new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this)
            : this.ICOCCCIRORICRHOCOIRCIRORRHIOHH.RCCIRHHCRHRCHOORRCHOOICOOCHCCR();
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROHOIIRCHCRRRCOROORORROIIRCHIH(String var1) {
         this.IHRCCRHOIOOICIIIHIRIIOOOOHORHO = var1;
         return this.ICOCCCIRORICRHOCOIRCIRORRHIOHH == null
            ? new RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this)
            : this.ICOCCCIRORICRHOCOIRCIRORRHIOHH.RCCIRHHCRHRCHOORRCHOOICOOCHCCR();
      }

      public boolean CHRCRHRIOOHHORIIHHRIOROIRCCCIH() {
         return this.ICHRORHOCIOORCCORIIRIOICOIOCII;
      }

      public void putValue(String var1, Object var2) {
         if (this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR) {
            this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1, var2);
         } else {
            if (this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO == null) {
               this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO = new LinkedHashMap<>();
            }

            this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO.put(var1, var2);
         }
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RRROCCOIROROHIRRHOHIRRIHOCIIRO(Object var1) {
         String var2 = Objects.requireNonNull(this.IHRCCRHOIOOICIIIHIRIIOOOOHORHO);
         this.IHRCCRHOIOOICIIIHIRIIOOOOHORHO = null;
         if (this.IIHCCRCRRRIIOCIHCHOICCHCOHRROR) {
            this.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var2, var1);
            return this;
         }

         if (this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO == null) {
            this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO = new LinkedHashMap<>();
         }

         this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO.put(var2, var1);
         return this;
      }

      public void RRRHHIRORHCHHCOOCIHOICORHHCHHO(Object var1) {
         if (this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH == null) {
            this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH = new ArrayList<>();
         }

         this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH.add(var1);
      }

      public Object ORCHIOCIIHORRHORRRCCRIHRCOHHHR() {
         return this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO == null ? HRRHCIIIOOOCCCOCHOOIHRROHCOHHC() : this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO;
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHRROIRCRICRRIORIOCOHCRCOHRCCR() {
         Map var1;
         if (this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO == null) {
            var1 = new LinkedHashMap();
         } else {
            var1 = this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO;
            this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO = null;
         }

         if (this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO.CHRCRHRIOOHHORIIHHRIOROIRCCCIH()) {
            return this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO.RRROCCOIROROHIRRHOHIRRIHOCIIRO(var1);
         }

         this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO.RRRHHIRORHCHHCOOCIHOICORHHCHHO(var1);
         return this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO;
      }

      public Object ROCCRHOORIOOROOIOIRRCRRIROIROH(boolean var1) {
         if (this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH == null) {
            return var1 ? RORCHCIIICOHIRROOORHOCCCCIOCCI.IRORIORCORIRCOIOCICHIOOOOCHCIO : OIRICOROCHIROOIOOHHHHOORORCCRC();
         } else {
            return var1
               ? this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH.toArray(RORCHCIIICOHIRROOORHOCCCCIOCCI.IRORIORCORIRCOIOCICHIOOOOCHCIO)
               : this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH;
         }
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COHRICOCOHIIRICOHIOOHHCCRROCCI(boolean var1) {
         Object var2;
         if (this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH == null) {
            if (var1) {
               var2 = RORCHCIIICOHIRROOORHOCCCCIOCCI.IRORIORCORIRCOIOCICHIOOOOCHCIO;
            } else {
               var2 = OIRICOROCHIROOIOOHHHHOORORCCRC();
            }
         } else {
            if (var1) {
               var2 = this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH.toArray(RORCHCIIICOHIRROOORHOCCCCIOCCI.IRORIORCORIRCOIOCICHIOOOOCHCIO);
            } else {
               var2 = this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH;
            }

            this.OCORCOCOIHRIHCHCHOCRIIRIHHHROH = null;
         }

         if (this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO.CHRCRHRIOOHHORIIHHRIOROIRCCCIH()) {
            return this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO.RRROCCOIROROHIRRHOHIRRIHOCIIRO(var2);
         }

         this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO.RRRHHIRORHCHHCOOCIHOICORHHCHHO(var2);
         return this.OHCHIIRICHIHHCIIHOCCHCIIIROHOO;
      }

      private void IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(String var1, Object var2) {
         if (this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO == null) {
            this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO = new LinkedHashMap<>();
            this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO.put(var1, var2);
         } else {
            Object var3 = this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO.put(var1, var2);
            if (var3 != null) {
               if (var3 instanceof List) {
                  ((List)var3).add(var2);
                  this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO.put(var1, var3);
               } else {
                  ArrayList var4 = new ArrayList();
                  var4.add(var3);
                  var4.add(var2);
                  this.IICCCHRIIORIRCIRCHHIRCIRIIIHHO.put(var1, var4);
               }
            }
         }
      }

      public static Map<String, Object> HRRHCIIIOOOCCCOCHOOIHRROHCOHHC() {
         return new LinkedHashMap<>(2);
      }

      public static List<Object> OIRICOROCHIROOIOOHHHHOORORCCRC() {
         return new ArrayList<>(2);
      }
   }
}
