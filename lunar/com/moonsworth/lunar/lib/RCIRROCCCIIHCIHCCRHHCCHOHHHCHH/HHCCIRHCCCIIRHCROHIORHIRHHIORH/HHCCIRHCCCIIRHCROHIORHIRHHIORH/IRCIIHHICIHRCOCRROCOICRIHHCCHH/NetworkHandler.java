package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Locale.Builder;
import java.util.regex.Pattern;

public abstract class IIRHCHHOICHRICOOCRORCCIOOIHOIR<T> extends ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<T> {
   public static Class<?>[] types() {
      return new Class[]{
         File.class,
         URL.class,
         URI.class,
         Class.class,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
         Currency.class,
         Pattern.class,
         Locale.class,
         Charset.class,
         TimeZone.class,
         InetAddress.class,
         InetSocketAddress.class,
         StringBuilder.class,
         StringBuffer.class
      };
   }

   protected IIRHCHHOICHRICOOCRORCCIOOIHOIR(Class<?> var1) {
      super(var1);
   }

   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR<?> ROIOROHRIHRRHIHRRRIHHHIICCHIOI(Class<?> var0) {
      byte var1 = 0;
      if (var0 == File.class) {
         var1 = 1;
      } else if (var0 == URL.class) {
         var1 = 2;
      } else if (var0 == URI.class) {
         var1 = 3;
      } else if (var0 == Class.class) {
         var1 = 4;
      } else if (var0 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class) {
         var1 = 5;
      } else if (var0 == Currency.class) {
         var1 = 6;
      } else if (var0 == Pattern.class) {
         var1 = 7;
      } else if (var0 == Locale.class) {
         var1 = 8;
      } else if (var0 == Charset.class) {
         var1 = 9;
      } else if (var0 == TimeZone.class) {
         var1 = 10;
      } else if (var0 == InetAddress.class) {
         var1 = 11;
      } else {
         if (var0 != InetSocketAddress.class) {
            if (var0 == StringBuilder.class) {
               return new IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
            }

            if (var0 == StringBuffer.class) {
               return new IIRHCHHOICHRICOOCRORCCIOOIHOIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
            }

            return null;
         }

         var1 = 12;
      }

      return new IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OtherScalar;
   }

   @Override
   public T deserialize(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3 = var1.getValueAsString();
      if (var3 == null) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var4 = var1.COCHOCOHRICCHIIIHIOORCIIRROOHI();
         if (var4 != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_OBJECT) {
            return (T)this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2, var4);
         }

         var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, this._valueClass);
      }

      if (var3.isEmpty()) {
         return (T)this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2);
      }

      if (this.OCIIIHHIIHROCHICCCHOOCHICHIHHR()) {
         String var8 = var3;
         var3 = var3.trim();
         if (var3 != var8 && var3.isEmpty()) {
            return (T)this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var2);
         }
      }

      Object var9 = null;

      try {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2);
      } catch (IllegalArgumentException | MalformedURLException var7) {
         String var5 = "not a valid textual representation";
         String var6 = var7.getMessage();
         if (var6 != null) {
            var5 = var5 + ", problem: " + var6;
         }

         throw var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, this._valueClass, var5).IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var7);
      }
   }

   protected abstract T IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   );

   protected boolean OCIIIHHIIHROCHICCCHOOCHICHIHHR() {
      return true;
   }

   protected Object CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var3
   ) {
      if (var3 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
         return this._deserializeFromArray(var1, var2);
      }

      if (var3 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_EMBEDDED_OBJECT) {
         Object var4 = var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
         if (var4 == null) {
            return null;
         } else {
            return this._valueClass.isAssignableFrom(var4.getClass()) ? var4 : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
         }
      } else {
         return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this._valueClass, var1);
      }
   }

   protected T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Object var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this, "Don't know how to convert embedded Object of type %s into %s", var1.getClass().getName(), this._valueClass.getName()
      );
      return null;
   }

   @Deprecated
   protected final T RRHHRIOHCIHRHCIHOIRHCHHIIIRRHO() {
      return null;
   }

   protected Object IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.logicalType(),
         this._valueClass,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.EmptyString
      );
      if (var2
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         )
       {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", new Object[]{this._coercedTypeDesc()}
         );
      }

      if (var2
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         return this.getNullValue(var1);
      } else {
         return var2
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
            ? this.getEmptyValue(var1)
            : this.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1);
      }
   }

   protected Object OHHRIOHROOIHOROCIRHCHORIHRRRRI(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      return this.getNullValue(var1);
   }

   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<Object> {
      public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(StringBuilder.class);
      }

      @Override
      public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Textual;
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         return new StringBuilder();
      }

      @Override
      public Object deserialize(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         String var3 = var1.getValueAsString();
         return var3 != null ? this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2) : super.deserialize(var1, var2);
      }

      @Override
      protected Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return new StringBuilder(var1);
      }
   }

   static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<Object> {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(StringBuffer.class);
      }

      @Override
      public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Textual;
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         return new StringBuffer();
      }

      @Override
      public Object deserialize(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         String var3 = var1.getValueAsString();
         return var3 != null ? this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2) : super.deserialize(var1, var2);
      }

      @Override
      protected Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         return new StringBuffer(var1);
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<Object> {
      private static final long CICCCHIOOHIRROHOIRCICOHOHCRROI = 1L;
      public static final int COCOIRRCIOCIHORCHHOICRICIRICRI = 1;
      public static final int IRIROCIRHCIRIHCOHRRIIRIRHHICRI = 2;
      public static final int HCICOOCICHCRIROCRORHOHRICOOIRR = 3;
      public static final int ICRHHOCCRIRRRHROHIIRHHCOIRIIOH = 4;
      public static final int OIIIOOHHHCIOIROORIRROIHCRORRIC = 5;
      public static final int HOHOHRRRHHRIHIHOROICOOHIOCIOIR = 6;
      public static final int RCORRHRHIIOHCOHOCOCRRIIRRRRIOI = 7;
      public static final int HCHOOCHCORHIHIRRORORIHIHOIOCIC = 8;
      public static final int RHHCRHHHRORIRRIORCOHIRHORROHOC = 9;
      public static final int OHCCROHIRHIRHCORCHOCHHIIROORHC = 10;
      public static final int RCCIHCRICOIHRICHRROHHIORHRCOHI = 11;
      public static final int CCHORIRCRHHIHRHIOICOICIHORROIO = 12;
      protected static final String CRICIIRHRROCICHHRHOIICCIOCCRHR = "_#";
      protected final int OHOOICRICHHHHRHOROHCCRICCHRROR;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var1, int var2) {
         super(var1);
         this.OHOOICRICHHHHRHOROHCCRICCHRROR = var2;
      }

      @Override
      protected Object IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         switch (this.OHOOICRICHHHHRHOROHCCRICCHRROR) {
            case 1:
               return new File(var1);
            case 2:
               return new URL(var1);
            case 3:
               return URI.create(var1);
            case 4:
               try {
                  return var2.findClass(var1);
               } catch (Exception var6) {
                  return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     this._valueClass,
                     var1,
                     com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.getRootCause(
                        var6
                     )
                  );
               }
            case 5:
               return var2.CCOCHOROIOICHHICOCIHCHHOCOOIII().RRCCHIROHRORRIORHHCRHOICIRHCRR(var1);
            case 6:
               return Currency.getInstance(var1);
            case 7:
               return Pattern.compile(var1);
            case 8:
               return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
            case 9:
               return Charset.forName(var1);
            case 10:
               return TimeZone.getTimeZone(var1);
            case 11:
               return InetAddress.getByName(var1);
            case 12:
               if (var1.startsWith("[")) {
                  int var7 = var1.lastIndexOf(93);
                  if (var7 == -1) {
                     throw new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var2.IHICOOIOCRHRCHIIOHRHICRIOHHIOR(), "Bracketed IPv6 address must contain closing bracket", var1, InetSocketAddress.class
                     );
                  }

                  int var8 = var1.indexOf(58, var7);
                  int var5 = var8 > -1 ? Integer.parseInt(var1.substring(var8 + 1)) : 0;
                  return new InetSocketAddress(var1.substring(0, var7 + 1), var5);
               } else {
                  int var3 = var1.indexOf(58);
                  if (var3 >= 0 && var1.indexOf(58, var3 + 1) < 0) {
                     int var4 = Integer.parseInt(var1.substring(var3 + 1));
                     return new InetSocketAddress(var1.substring(0, var3), var4);
                  }

                  return new InetSocketAddress(var1, 0);
               }
            default:
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCCHCIICICCCIOOIIOOOCCOCH();
               return null;
         }
      }

      @Override
      public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
         switch (this.OHOOICRICHHHHRHOROHCCRICCHRROR) {
            case 3:
               return URI.create("");
            case 8:
               return Locale.ROOT;
            default:
               return super.getEmptyValue(var1);
         }
      }

      @Override
      protected Object OHHRIOHROOIHOROCIRHCHORIHRRRRI(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
      ) {
         return this.getEmptyValue(var1);
      }

      @Override
      protected boolean OCIIIHHIIHROCHICCCHOOCHICHIHHR() {
         return this.OHOOICRICHHHHRHOROHCCRICCHRROR != 7;
      }

      protected int IRICRORRCCIHCHHOOOCHCOOOOIHHRC(String var1) {
         int var2 = 0;

         for (int var3 = var1.length(); var2 < var3; var2++) {
            char var4 = var1.charAt(var2);
            if (var4 == '_' || var4 == '-') {
               return var2;
            }
         }

         return -1;
      }

      private Locale HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
      ) {
         int var3 = this.IRICRORRCCIHCHHOOOCHCOOOOIHHRC(var1);
         if (var3 < 0) {
            return new Locale(var1);
         }

         String var4 = var1.substring(0, var3);
         var1 = var1.substring(var3 + 1);
         var3 = this.IRICRORRCCIHCHHOOOCHCOOOOIHHRC(var1);
         if (var3 < 0) {
            return new Locale(var4, var1);
         }

         String var5 = var1.substring(0, var3);
         int var6 = var1.indexOf("_#");
         return var6 < 0 ? new Locale(var4, var5, var1.substring(var3 + 1)) : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3, var4, var5, var6);
      }

      private Locale RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, String var3, String var4, int var5) {
         String var6 = "";

         try {
            if (var5 > 0 && var5 > var2) {
               var6 = var1.substring(var2 + 1, var5);
            }

            var1 = var1.substring(var5 + 2);
            int var7 = var1.indexOf(95);
            if (var7 < 0) {
               int var12 = var1.indexOf(45);
               return var12 < 0
                  ? new Builder().setLanguage(var3).setRegion(var4).setVariant(var6).setScript(var1).build()
                  : new Builder().setLanguage(var3).setRegion(var4).setVariant(var6).setExtension(var1.charAt(0), var1.substring(var12 + 1)).build();
            }

            int var8 = var1.length();
            Builder var9 = new Builder().setLanguage(var3).setRegion(var4).setVariant(var6).setScript(var1.substring(0, var7));
            if (var7 + 1 < var8) {
               var9 = var9.setExtension(var1.charAt(var7 + 1), var1.substring(Math.min(var8, var7 + 3)));
            }

            return var9.build();
         } catch (IllformedLocaleException var10) {
            return new Locale(var3, var4, var6);
         }
      }
   }
}
