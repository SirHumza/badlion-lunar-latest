package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.Date;

public abstract class ICICIOCHHHIHOCHCOHORIHRCOHHOCR<T>
   extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<T>
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH,
   Serializable {
   private static final long serialVersionUID = 1L;
   protected static final int F_MASK_INT_COERCIONS = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_INTEGER_FOR_INTS
         .getMask()
      | com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_LONG_FOR_INTS.getMask();
   @Deprecated
   protected static final int F_MASK_ACCEPT_ARRAYS = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
         .getMask()
      | com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
         .getMask();
   protected final Class<?> _valueClass;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI _valueType;

   protected ICICIOCHHHIHOCHCOHORIHRCOHHOCR(Class<?> var1) {
      this._valueClass = var1;
      this._valueType = null;
   }

   protected ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      this._valueClass = var1 == null ? Object.class : var1.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      this._valueType = var1;
   }

   protected ICICIOCHHHIHOCHCOHORIHRCOHHOCR(ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> var1) {
      this._valueClass = var1._valueClass;
      this._valueType = var1._valueType;
   }

   @Override
   public Class<?> handledType() {
      return this._valueClass;
   }

   @Deprecated
   public final Class<?> getValueClass() {
      return this._valueClass;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getValueType() {
      return this._valueType;
   }

   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getValueType(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      return this._valueType != null ? this._valueType : var1.OCIIROIOORRIOIIIRHIRRCCIIRRROH(this._valueClass);
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI getValueInstantiator() {
      return null;
   }

   protected boolean isDefaultDeserializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var1
   ) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(
         var1
      );
   }

   protected boolean isDefaultKeyDeserializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR var1
   ) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(
         var1
      );
   }

   @Override
   public Object deserializeWithType(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3
   ) {
      return var3.IORRORCRRHRRORHIRHRROHCRRIHRII(var1, var2);
   }

   protected T _deserializeFromArray(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this._findCoercionFromEmptyArray(
         var2
      );
      boolean var4 = var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
      );
      if (var4
         || var3
            != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         )
       {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var5 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         if (var5 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
            switch (var3) {
               case AsEmpty:
                  return (T)this.getEmptyValue(var2);
               case AsNull:
               case TryConvert:
                  return this.getNullValue(var2);
            }
         } else if (var4) {
            Object var6 = this._deserializeWrappedValue(var1, var2);
            if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
               != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
               this.handleMissingEndArrayForSingle(var1, var2);
            }

            return (T)var6;
         }
      }

      return (T)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.getValueType(var2),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY,
         var1,
         null
      );
   }

   @Deprecated
   protected T _deserializeFromEmpty(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY
         )
         && var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
         )) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         return (T)(var3 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY
            ? null
            : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1));
      } else {
         return (T)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
      }
   }

   protected T _deserializeFromString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI var3 = this.getValueInstantiator();
      Class var4 = this.handledType();
      String var5 = var1.getValueAsString();
      if (var3 != null && var3.IICCRIICCCRORRCRIHIHCICOROHIHH()) {
         return (T)var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var5);
      }

      if (var5.isEmpty()) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.logicalType(),
            var4,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.EmptyString
         );
         return (T)this._deserializeFromEmptyString(var1, var2, var8, var4, "empty String (\"\")");
      }

      if (_isBlank(var5)) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.logicalType(),
            var4,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         );
         return (T)this._deserializeFromEmptyString(var1, var2, var7, var4, "blank String (all whitespace)");
      }

      if (var3 != null) {
         var5 = var5.trim();
         if (var3.HHOOCOOROOICHIHHCIRCCHOICCOIOI()
            && var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
                  Integer.class,
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.String
               )
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TryConvert
            )
          {
            return (T)var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this._parseIntPrimitive(var2, var5));
         }

         if (var3.IRIHOIIIRRCCOOCIRHHRCHHRCRRICH()
            && var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
                  Long.class,
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.String
               )
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TryConvert
            )
          {
            return (T)var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this._parseLongPrimitive(var2, var5));
         }

         if (var3.ICIRHIHOOOCIHCICIORCCOCOORCCRC()
            && var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Boolean,
                  Boolean.class,
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.String
               )
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TryConvert
            )
          {
            String var6 = var5.trim();
            if ("true".equals(var6)) {
               return (T)var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, true);
            }

            if ("false".equals(var6)) {
               return (T)var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, false);
            }
         }
      }

      return (T)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var4, var3, var2.IHICOOIOCRHRCHIIOHRHICRIOHHIOR(), "no String-argument constructor/factory method to deserialize from String value ('%s')", var5
      );
   }

   protected Object _deserializeFromEmptyString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      Class<?> var4,
      String var5
   ) {
      switch (var3) {
         case AsEmpty:
            return this.getEmptyValue(var2);
         case Fail:
            this._checkCoercionFail(var2, var3, var4, "", "empty String (\"\")");
         case AsNull:
         case TryConvert:
         default:
            return null;
      }
   }

   protected T _deserializeWrappedValue(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      return (T)(var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY
         )
         ? this.handleNestedArrayForSingle(var1, var2)
         : this.deserialize(var1, var2));
   }

   @Deprecated
   protected final boolean _parseBooleanPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      Class<?> var3
   ) {
      return this._parseBooleanPrimitive(var2, var1);
   }

   protected final boolean _parseBooleanPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, boolean.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Boolean)this.handleNestedArrayForSingle(var1, var2);
               }

               boolean var4 = this._parseBooleanPrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var4;
            }
         case 2:
         case 4:
         case 5:
         case 8:
         default:
            return (Boolean)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean.class, var1);
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            return Boolean.TRUE.equals(this._coerceBooleanFromInt(var1, var2, boolean.class));
         case 9:
            return true;
         case 10:
            return false;
         case 11:
            this._verifyNullForPrimitive(var2);
            return false;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = this._checkFromStringCoercion(
         var2,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Boolean,
         boolean.class
      );
      if (var8
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         this._verifyNullForPrimitive(var2);
         return false;
      }

      if (var8
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return false;
      }

      var3 = var3.trim();
      int var5 = var3.length();
      if (var5 == 4) {
         if (this._isTrue(var3)) {
            return true;
         }
      } else if (var5 == 5 && this._isFalse(var3)) {
         return false;
      }

      if (this._hasTextualNull(var3)) {
         this._verifyNullForPrimitiveCoercion(var2, var3);
         return false;
      } else {
         Boolean var6 = (Boolean)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            boolean.class, var3, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
         );
         return Boolean.TRUE.equals(var6);
      }
   }

   protected boolean _isTrue(String var1) {
      char var2 = var1.charAt(0);
      if (var2 == 't') {
         return "true".equals(var1);
      } else {
         return var2 != 'T' ? false : "TRUE".equals(var1) || "True".equals(var1);
      }
   }

   protected boolean _isFalse(String var1) {
      char var2 = var1.charAt(0);
      if (var2 == 'f') {
         return "false".equals(var1);
      } else {
         return var2 != 'F' ? false : "FALSE".equals(var1) || "False".equals(var1);
      }
   }

   protected final Boolean _parseBoolean(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      String var4;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var4 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, var3);
            break;
         case 2:
         case 4:
         case 5:
         case 8:
         default:
            return (Boolean)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1);
         case 3:
            return (Boolean)this._deserializeFromArray(var1, var2);
         case 6:
            var4 = var1.getText();
            break;
         case 7:
            return this._coerceBooleanFromInt(var1, var2, var3);
         case 9:
            return true;
         case 10:
            return false;
         case 11:
            return null;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this._checkFromStringCoercion(
         var2,
         var4,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Boolean,
         var3
      );
      if (var5
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         return null;
      }

      if (var5
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return false;
      }

      var4 = var4.trim();
      int var6 = var4.length();
      if (var6 == 4) {
         if (this._isTrue(var4)) {
            return true;
         }
      } else if (var6 == 5 && this._isFalse(var4)) {
         return false;
      }

      return this._checkTextualNull(var2, var4) ? null : (Boolean)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var4, "only \"true\" or \"false\" recognized");
   }

   protected final byte _parseBytePrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, byte.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Byte)this.handleNestedArrayForSingle(var1, var2);
               }

               byte var5 = this._parseBytePrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var5;
            }
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return (Byte)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.OCIIROIOORRIOIIIRHIRRCCIIRRROH(byte.class), var1);
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            return var1.CHCRRRHHRCCRHCCCCRROHHRICICROO();
         case 8:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkFloatToIntCoercion(
               var1, var2, byte.class
            );
            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return 0;
            }

            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return 0;
            }

            return var1.CHCRRRHHRCCRHCCCCRROHHRICICROO();
         case 11:
            this._verifyNullForPrimitive(var2);
            return 0;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this._checkFromStringCoercion(
         var2,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
         byte.class
      );
      if (var9
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         this._verifyNullForPrimitive(var2);
         return 0;
      }

      if (var9
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return 0;
      }

      var3 = var3.trim();
      if (this._hasTextualNull(var3)) {
         this._verifyNullForPrimitiveCoercion(var2, var3);
         return 0;
      }

      int var10;
      try {
         var10 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.parseInt(
            var3
         );
      } catch (IllegalArgumentException var7) {
         return (Byte)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this._valueClass, var3, "not a valid `byte` value");
      }

      return this._byteOverflow(var10)
         ? (Byte)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this._valueClass, var3, "overflow, value cannot be represented as 8-bit value")
         : (byte)var10;
   }

   protected final short _parseShortPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, short.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Short)this.handleNestedArrayForSingle(var1, var2);
               }

               short var5 = this._parseShortPrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var5;
            }
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return (Short)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.OCIIROIOORRIOIIIRHIRRCCIIRRROH(short.class), var1);
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            return var1.RIRCCCIICCHHICROCRIOCCHCIRCCCR();
         case 8:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkFloatToIntCoercion(
               var1, var2, short.class
            );
            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return 0;
            }

            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return 0;
            }

            return var1.RIRCCCIICCHHICROCRIOCCHCIRCCCR();
         case 11:
            this._verifyNullForPrimitive(var2);
            return 0;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this._checkFromStringCoercion(
         var2,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
         short.class
      );
      if (var9
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         this._verifyNullForPrimitive(var2);
         return 0;
      }

      if (var9
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return 0;
      }

      var3 = var3.trim();
      if (this._hasTextualNull(var3)) {
         this._verifyNullForPrimitiveCoercion(var2, var3);
         return 0;
      }

      int var10;
      try {
         var10 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.parseInt(
            var3
         );
      } catch (IllegalArgumentException var7) {
         return (Short)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(short.class, var3, "not a valid `short` value");
      }

      return this._shortOverflow(var10)
         ? (Short)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(short.class, var3, "overflow, value cannot be represented as 16-bit value")
         : (short)var10;
   }

   protected final int _parseIntPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, int.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Integer)this.handleNestedArrayForSingle(var1, var2);
               }

               int var5 = this._parseIntPrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var5;
            }
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return ((Number)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int.class, var1)).intValue();
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            return var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO();
         case 8:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkFloatToIntCoercion(
               var1, var2, int.class
            );
            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return 0;
            }

            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return 0;
            }

            return var1.IIOCRIHORIRHOHICRHIHOHHRCHOCRI();
         case 11:
            this._verifyNullForPrimitive(var2);
            return 0;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this._checkFromStringCoercion(
         var2,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
         int.class
      );
      if (var7
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         this._verifyNullForPrimitive(var2);
         return 0;
      } else if (var7
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return 0;
      } else {
         var3 = var3.trim();
         if (this._hasTextualNull(var3)) {
            this._verifyNullForPrimitiveCoercion(var2, var3);
            return 0;
         } else {
            return this._parseIntPrimitive(var2, var3);
         }
      }
   }

   protected final int _parseIntPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      try {
         if (var2.length() > 9) {
            long var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
               var2
            );
            if (this._intOverflow(var3)) {
               Number var5 = (Number)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  int.class, var2, "Overflow: numeric value (%s) out of range of int (%d -%d)", var2, Integer.MIN_VALUE, Integer.MAX_VALUE
               );
               return this._nonNullNumber(var5).intValue();
            } else {
               return (int)var3;
            }
         } else {
            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.parseInt(
               var2
            );
         }
      } catch (IllegalArgumentException var6) {
         Number var4 = (Number)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(int.class, var2, "not a valid `int` value");
         return this._nonNullNumber(var4).intValue();
      }
   }

   protected final Integer _parseInteger(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      String var4;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var4 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, var3);
            break;
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return (Integer)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
         case 3:
            return (Integer)this._deserializeFromArray(var1, var2);
         case 6:
            var4 = var1.getText();
            break;
         case 7:
            return var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO();
         case 8:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this._checkFloatToIntCoercion(
               var1, var2, var3
            );
            if (var5
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return (Integer)this.getNullValue(var2);
            }

            if (var5
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return (Integer)this.getEmptyValue(var2);
            }

            return var1.IIOCRIHORIRHOHICRHIHOHHRCHOCRI();
         case 11:
            return (Integer)this.getNullValue(var2);
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this._checkFromStringCoercion(
         var2, var4
      );
      if (var7
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         return (Integer)this.getNullValue(var2);
      }

      if (var7
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return (Integer)this.getEmptyValue(var2);
      }

      var4 = var4.trim();
      return this._checkTextualNull(var2, var4) ? (Integer)this.getNullValue(var2) : this._parseInteger(var2, var4);
   }

   protected final Integer _parseInteger(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      try {
         if (var2.length() > 9) {
            long var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
               var2
            );
            return this._intOverflow(var3)
               ? (Integer)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  Integer.class, var2, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", var2, Integer.MIN_VALUE, Integer.MAX_VALUE
               )
               : (int)var3;
         } else {
            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.parseInt(
               var2
            );
         }
      } catch (IllegalArgumentException var5) {
         return (Integer)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Integer.class, var2, "not a valid `java.lang.Integer` value");
      }
   }

   protected final long _parseLongPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, long.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Long)this.handleNestedArrayForSingle(var1, var2);
               }

               long var5 = this._parseLongPrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var5;
            }
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return ((Number)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long.class, var1)).longValue();
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            return var1.getLongValue();
         case 8:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkFloatToIntCoercion(
               var1, var2, long.class
            );
            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return 0L;
            }

            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return 0L;
            }

            return var1.RCCOOOOOIOIOHHIORHOCICRRIRRICR();
         case 11:
            this._verifyNullForPrimitive(var2);
            return 0L;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = this._checkFromStringCoercion(
         var2,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
         long.class
      );
      if (var8
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         this._verifyNullForPrimitive(var2);
         return 0L;
      } else if (var8
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return 0L;
      } else {
         var3 = var3.trim();
         if (this._hasTextualNull(var3)) {
            this._verifyNullForPrimitiveCoercion(var2, var3);
            return 0L;
         } else {
            return this._parseLongPrimitive(var2, var3);
         }
      }
   }

   protected final long _parseLongPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
            var2
         );
      } catch (IllegalArgumentException var4) {
         Number var3 = (Number)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(long.class, var2, "not a valid `long` value");
         return this._nonNullNumber(var3).longValue();
      }
   }

   protected final Long _parseLong(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      String var4;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var4 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, var3);
            break;
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return (Long)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
         case 3:
            return (Long)this._deserializeFromArray(var1, var2);
         case 6:
            var4 = var1.getText();
            break;
         case 7:
            return var1.getLongValue();
         case 8:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = this._checkFloatToIntCoercion(
               var1, var2, var3
            );
            if (var5
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return (Long)this.getNullValue(var2);
            }

            if (var5
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return (Long)this.getEmptyValue(var2);
            }

            return var1.RCCOOOOOIOIOHHIORHOCICRRIRRICR();
         case 11:
            return (Long)this.getNullValue(var2);
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = this._checkFromStringCoercion(
         var2, var4
      );
      if (var7
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         return (Long)this.getNullValue(var2);
      }

      if (var7
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return (Long)this.getEmptyValue(var2);
      }

      var4 = var4.trim();
      return this._checkTextualNull(var2, var4) ? (Long)this.getNullValue(var2) : this._parseLong(var2, var4);
   }

   protected final Long _parseLong(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
            var2
         );
      } catch (IllegalArgumentException var4) {
         return (Long)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(Long.class, var2, "not a valid `java.lang.Long` value");
      }
   }

   protected final float _parseFloatPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, float.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Float)this.handleNestedArrayForSingle(var1, var2);
               }

               float var5 = this._parseFloatPrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var5;
            }
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return ((Number)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float.class, var1)).floatValue();
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkIntToFloatCoercion(
               var1, var2, float.class
            );
            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return 0.0F;
            }

            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return 0.0F;
            }
         case 8:
            return var1.getFloatValue();
         case 11:
            this._verifyNullForPrimitive(var2);
            return 0.0F;
      }

      Float var7 = this._checkFloatSpecialValue(var3);
      if (var7 != null) {
         return var7;
      } else {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = this._checkFromStringCoercion(
            var2,
            var3,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
            float.class
         );
         if (var8
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
            )
          {
            this._verifyNullForPrimitive(var2);
            return 0.0F;
         } else if (var8
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
            )
          {
            return 0.0F;
         } else {
            var3 = var3.trim();
            if (this._hasTextualNull(var3)) {
               this._verifyNullForPrimitiveCoercion(var2, var3);
               return 0.0F;
            } else {
               return this._parseFloatPrimitive(var1, var2, var3);
            }
         }
      }
   }

   protected final float _parseFloatPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.IHOROCHCICHIIOOHHRRIRIIICIRRRR(
            var2
         );
      } catch (IllegalArgumentException var4) {
         Number var3 = (Number)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(float.class, var2, "not a valid `float` value");
         return this._nonNullNumber(var3).floatValue();
      }
   }

   protected final float _parseFloatPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      String var3
   ) {
      try {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(
            var3,
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_DOUBLE_PARSER
            )
         );
      } catch (IllegalArgumentException var5) {
         Number var4 = (Number)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(float.class, var3, "not a valid `float` value");
         return this._nonNullNumber(var4).floatValue();
      }
   }

   protected Float _checkFloatSpecialValue(String var1) {
      if (!var1.isEmpty()) {
         switch (var1.charAt(0)) {
            case '-':
               if (this._isNegInf(var1)) {
                  return Float.NEGATIVE_INFINITY;
               }
               break;
            case 'I':
               if (this._isPosInf(var1)) {
                  return Float.POSITIVE_INFINITY;
               }
               break;
            case 'N':
               if (this._isNaN(var1)) {
                  return Float.NaN;
               }
         }
      }

      return null;
   }

   protected final double _parseDoublePrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, double.class);
            break;
         case 3:
            if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
            )) {
               if (var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC()
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
                  return (Double)this.handleNestedArrayForSingle(var1, var2);
               }

               double var5 = this._parseDoublePrimitive(var1, var2);
               this._verifyEndArrayForSingle(var1, var2);
               return var5;
            }
         case 2:
         case 4:
         case 5:
         case 9:
         case 10:
         default:
            return ((Number)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double.class, var1)).doubleValue();
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = this._checkIntToFloatCoercion(
               var1, var2, double.class
            );
            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
               )
             {
               return 0.0;
            }

            if (var4
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
               )
             {
               return 0.0;
            }
         case 8:
            return var1.getDoubleValue();
         case 11:
            this._verifyNullForPrimitive(var2);
            return 0.0;
      }

      Double var8 = this._checkDoubleSpecialValue(var3);
      if (var8 != null) {
         return var8;
      } else {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = this._checkFromStringCoercion(
            var2,
            var3,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
            double.class
         );
         if (var9
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
            )
          {
            this._verifyNullForPrimitive(var2);
            return 0.0;
         } else if (var9
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
            )
          {
            return 0.0;
         } else {
            var3 = var3.trim();
            if (this._hasTextualNull(var3)) {
               this._verifyNullForPrimitiveCoercion(var2, var3);
               return 0.0;
            } else {
               return this._parseDoublePrimitive(var1, var2, var3);
            }
         }
      }
   }

   protected final double _parseDoublePrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      try {
         return _parseDouble(var2);
      } catch (IllegalArgumentException var4) {
         Number var3 = (Number)var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(double.class, var2, "not a valid `double` value (as String to convert)");
         return this._nonNullNumber(var3).doubleValue();
      }
   }

   protected final double _parseDoublePrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      String var3
   ) {
      try {
         return _parseDouble(
            var3,
            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.USE_FAST_DOUBLE_PARSER
            )
         );
      } catch (IllegalArgumentException var5) {
         Number var4 = (Number)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(double.class, var3, "not a valid `double` value (as String to convert)");
         return this._nonNullNumber(var4).doubleValue();
      }
   }

   protected static final double _parseDouble(String var0) {
      return _parseDouble(var0, false);
   }

   protected static final double _parseDouble(String var0, boolean var1) {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(
         var0, var1
      );
   }

   protected Double _checkDoubleSpecialValue(String var1) {
      if (!var1.isEmpty()) {
         switch (var1.charAt(0)) {
            case '-':
               if (this._isNegInf(var1)) {
                  return Double.NEGATIVE_INFINITY;
               }
               break;
            case 'I':
               if (this._isPosInf(var1)) {
                  return Double.POSITIVE_INFINITY;
               }
               break;
            case 'N':
               if (this._isNaN(var1)) {
                  return Double.NaN;
               }
         }
      }

      return null;
   }

   protected Date _parseDate(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            var3 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, this._valueClass);
            break;
         case 2:
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
         default:
            return (Date)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this._valueClass, var1);
         case 3:
            return this._parseDateFromArray(var1, var2);
         case 6:
            var3 = var1.getText();
            break;
         case 7:
            long var4;
            try {
               var4 = var1.getLongValue();
            } catch (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8) {
               Number var7 = (Number)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this._valueClass, var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH(), "not a valid 64-bit `long` for creating `java.util.Date`"
               );
               var4 = var7.longValue();
            }

            return new Date(var4);
         case 11:
            return (Date)this.getNullValue(var2);
      }

      return this._parseDate(var3.trim(), var2);
   }

   protected Date _parseDateFromArray(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this._findCoercionFromEmptyArray(
         var2
      );
      boolean var4 = var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.UNWRAP_SINGLE_VALUE_ARRAYS
      );
      if (var4
         || var3
            != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         )
       {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var5 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
         if (var5 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
            switch (var3) {
               case AsEmpty:
                  return (Date)this.getEmptyValue(var2);
               case AsNull:
               case TryConvert:
                  return (Date)this.getNullValue(var2);
            }
         } else if (var4) {
            if (var5 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY) {
               return (Date)this.handleNestedArrayForSingle(var1, var2);
            }

            Date var6 = this._parseDate(var1, var2);
            this._verifyEndArrayForSingle(var1, var2);
            return var6;
         }
      }

      return (Date)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this._valueClass,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY,
         var1,
         null
      );
   }

   protected Date _parseDate(
      String var1, com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      try {
         if (var1.isEmpty()) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this._checkFromStringCoercion(
               var2, var1
            );
            switch (var3) {
               case AsEmpty:
                  return new Date(0L);
               case AsNull:
               case TryConvert:
               default:
                  return null;
            }
         } else {
            return this._hasTextualNull(var1) ? null : var2.CHCCHCHORCHRIHHOHRHCRRRRIHOHCO(var1);
         }
      } catch (IllegalArgumentException var4) {
         return (Date)var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this._valueClass,
            var1,
            "not a valid representation (error: %s)",
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var4
            )
         );
      }
   }

   @Deprecated
   protected final String _parseString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      return this._parseString(
         var1,
         var2,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IOHHOICCHRRCROIOROOHIIIHICCOOI()
      );
   }

   protected final String _parseString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TryConvert;
      Class<String> var5 = String.class;
      switch (var1.OHIIIHRHICHRCHHHRIICRRRIROHHII()) {
         case 1:
            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, this._valueClass);
         case 2:
         case 3:
         case 4:
         case 5:
         case 11:
         default:
            break;
         case 6:
            return var1.getText();
         case 7:
            var4 = this._checkIntToStringCoercion(var1, var2, var5);
            break;
         case 8:
            var4 = this._checkFloatToStringCoercion(var1, var2, var5);
            break;
         case 9:
         case 10:
            var4 = this._checkBooleanToStringCoercion(var1, var2, var5);
            break;
         case 12:
            Object var6 = var1.RRIHRHCOCCRROCCHIRHHHIIICHCRRR();
            if (var6 instanceof byte[]) {
               return var2.RCCIOIICIOCROOHHORRHROIRRIOCOC().HHCCIRHCCCIIRHCROHIORHIRHHIORH((byte[])var6, false);
            }

            if (var6 == null) {
               return null;
            }

            return var6.toString();
      }

      if (var4
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsNull
         )
       {
         return (String)var3.getNullValue(var2);
      }

      if (var4
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.AsEmpty
         )
       {
         return "";
      }

      if (var1.COCHOCOHRICCHIIIHIOORCIIRROOHI().isScalarValue()) {
         String var7 = var1.getValueAsString();
         if (var7 != null) {
            return var7;
         }
      }

      return (String)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1);
   }

   protected boolean _hasTextualNull(String var1) {
      return "null".equals(var1);
   }

   protected final boolean _isNegInf(String var1) {
      return "-Infinity".equals(var1) || "-INF".equals(var1);
   }

   protected final boolean _isPosInf(String var1) {
      return "Infinity".equals(var1) || "INF".equals(var1);
   }

   protected final boolean _isNaN(String var1) {
      return "NaN".equals(var1);
   }

   protected static final boolean _isBlank(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var1; var2++) {
         if (var0.charAt(var2) > ' ') {
            return false;
         }
      }

      return true;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkFromStringCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      return this._checkFromStringCoercion(var1, var2, this.logicalType(), this.handledType());
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkFromStringCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      String var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3,
      Class<?> var4
   ) {
      if (var2.isEmpty()) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3,
            var4,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.EmptyString
         );
         return this._checkCoercionFail(var1, var7, var4, var2, "empty String (\"\")");
      }

      if (_isBlank(var2)) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3,
            var4,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         );
         return this._checkCoercionFail(var1, var6, var4, var2, "blank String (all whitespace)");
      }

      if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO.UNTYPED_SCALARS
      )) {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.TryConvert;
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var3,
         var4,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.String
      );
      if (var5
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         )
       {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", var2, this._coercedTypeDesc()
         );
      }

      return var5;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkFloatToIntCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Integer,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.Float
      );
      return var4
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         ? this._checkCoercionFail(var2, var4, var3, var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH(), "Floating-point value (" + var1.getText() + ")")
         : var4;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkIntToStringCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      return this._checkToStringCoercion(
         var1,
         var2,
         var3,
         var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.Integer
      );
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkFloatToStringCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      return this._checkToStringCoercion(
         var1,
         var2,
         var3,
         var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.Float
      );
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkBooleanToStringCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      return this._checkToStringCoercion(
         var1,
         var2,
         var3,
         var1.CICRIIIRCRCHOIROOIRHIIRHOCHCRR(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.Boolean
      );
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkToStringCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3,
      Object var4,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Textual,
         var3,
         var5
      );
      return var6
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         ? this._checkCoercionFail(var2, var6, var3, var4, var5.name() + " value (" + var1.getText() + ")")
         : var6;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkIntToFloatCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Float,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.Integer
      );
      return var4
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         ? this._checkCoercionFail(var2, var4, var3, var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH(), "Integer value (" + var1.getText() + ")")
         : var4;
   }

   protected Boolean _coerceBooleanFromInt(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Class<?> var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.Boolean,
         var3,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.Integer
      );
      switch (var4) {
         case AsEmpty:
            return Boolean.FALSE;
         case AsNull:
            return null;
         case TryConvert:
         default:
            if (var1.RHOHOCOOROCIOOHHCCRCIIRRRRHCHR()
               == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.INT
               )
             {
               return var1.HHHRCIIIIHOCHICIORORCCOCHOIHIO() != 0;
            }

            return !"0".equals(var1.getText());
         case Fail:
            this._checkCoercionFail(var2, var4, var3, var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH(), "Integer value (" + var1.getText() + ")");
            return Boolean.FALSE;
      }
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _checkCoercionFail(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      Class<?> var3,
      Object var4,
      String var5
   ) {
      if (var2
         == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
         )
       {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, var3, var4, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", var5, this._coercedTypeDesc(var3)
         );
      }

      return var2;
   }

   protected boolean _checkTextualNull(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      if (this._hasTextualNull(var2)) {
         if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS
         )) {
            this._reportFailedNullCoerce(
               var1,
               true,
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS,
               "String \"null\""
            );
         }

         return true;
      } else {
         return false;
      }
   }

   protected Object _coerceIntegral(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_BIG_INTEGER_FOR_INTS
      )) {
         return var1.ORHIIIOHCCCCRROHORHIICRHROIORH();
      } else {
         return var2.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.USE_LONG_FOR_INTS
            )
            ? var1.getLongValue()
            : var1.CCHRCRRHRROCOOIRHHOCIIICIORRHH();
      }
   }

   protected final void _verifyNullForPrimitive(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      if (var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.FAIL_ON_NULL_FOR_PRIMITIVES
      )) {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", new Object[]{this._coercedTypeDesc()}
         );
      }
   }

   protected final void _verifyNullForPrimitiveCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      Enum var3;
      boolean var4;
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS
      )) {
         var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS;
         var4 = true;
      } else {
         if (!var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.FAIL_ON_NULL_FOR_PRIMITIVES
         )) {
            return;
         }

         var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.FAIL_ON_NULL_FOR_PRIMITIVES;
         var4 = false;
      }

      String var5 = var2.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", var2);
      this._reportFailedNullCoerce(var1, var4, var3, var5);
   }

   protected void _reportFailedNullCoerce(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      boolean var2,
      Enum<?> var3,
      String var4
   ) {
      String var5 = var2 ? "enable" : "disable";
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this,
         "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)",
         var4,
         this._coercedTypeDesc(),
         var5,
         var3.getDeclaringClass().getSimpleName(),
         var3.name()
      );
   }

   protected String _coercedTypeDesc() {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3 = this.getValueType();
      boolean var1;
      String var2;
      if (var3 != null && !var3.isPrimitive()) {
         var1 = var3.HCHCCRRRHHICOIRRIOOOOHHHOIIORR() || var3.HCHHHORHIRHCRRRHRIICHHROHICCOH();
         var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRORCOIRRIICOOICOIOCORHORCHCOC(
            var3
         );
      } else {
         Class var4 = this.handledType();
         var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRIHROCORIOOCHHCHCHOHCIOHHRRI(
            var4
         );
         var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCRHHCRHIIIHROOCORCHHHRIIROIR(
            var4
         );
      }

      return var1 ? "element of " + var2 : var2 + " value";
   }

   protected String _coercedTypeDesc(Class<?> var1) {
      String var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCRHHCRHIIIHROOCORCHHHRIIROIR(
         var1
      );
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRIHROCORIOOCHHCHCHOHCIOHHRRI(
            var1
         )
         ? "element of " + var2
         : var2 + " value";
   }

   @Deprecated
   protected boolean _parseBooleanFromInt(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      this._verifyNumberForScalarCoercion(var2, var1);
      return !"0".equals(var1.getText());
   }

   @Deprecated
   protected void _verifyStringForScalarCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS;
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)) {
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this,
            "Cannot coerce String \"%s\" to %s (enable `%s.%s` to allow)",
            var2,
            this._coercedTypeDesc(),
            var3.getDeclaringClass().getSimpleName(),
            var3.name()
         );
      }
   }

   @Deprecated
   protected Object _coerceEmptyString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, boolean var2
   ) {
      Enum var3;
      boolean var4;
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS
      )) {
         var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS;
         var4 = true;
      } else {
         if (!var2
            || !var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.FAIL_ON_NULL_FOR_PRIMITIVES
            )) {
            return this.getNullValue(var1);
         }

         var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.FAIL_ON_NULL_FOR_PRIMITIVES;
         var4 = false;
      }

      this._reportFailedNullCoerce(var1, var4, var3, "empty String (\"\")");
      return null;
   }

   @Deprecated
   protected void _failDoubleToIntCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      String var3
   ) {
      var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.handledType(),
         "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)",
         var1.getValueAsString(),
         var3
      );
   }

   @Deprecated
   protected final void _verifyNullForScalarCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2
   ) {
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS
      )) {
         String var3 = var2.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", var2);
         this._reportFailedNullCoerce(
            var1,
            true,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS,
            var3
         );
      }
   }

   @Deprecated
   protected void _verifyNumberForScalarCoercion(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR var3 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS;
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3)) {
         String var4 = var2.getText();
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this,
            "Cannot coerce Number (%s) to %s (enable `%s.%s` to allow)",
            var4,
            this._coercedTypeDesc(),
            var3.getDeclaringClass().getSimpleName(),
            var3.name()
         );
      }
   }

   @Deprecated
   protected Object _coerceNullToken(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, boolean var2
   ) {
      if (var2) {
         this._verifyNullForPrimitive(var1);
      }

      return this.getNullValue(var1);
   }

   @Deprecated
   protected Object _coerceTextualNull(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, boolean var2
   ) {
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS
      )) {
         this._reportFailedNullCoerce(
            var1,
            true,
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ALLOW_COERCION_OF_SCALARS,
            "String \"null\""
         );
      }

      return this.getNullValue(var1);
   }

   @Deprecated
   protected boolean _isEmptyOrTextualNull(String var1) {
      return var1.isEmpty() || "null".equals(var1);
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<Object> findDeserializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var3
   ) {
      return var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3);
   }

   protected final boolean _isIntNumber(String var1) {
      int var2 = var1.length();
      if (var2 <= 0) {
         return false;
      }

      char var3 = var1.charAt(0);
      int var4;
      if (var3 != '-' && var3 != '+') {
         var4 = 0;
      } else {
         if (var2 == 1) {
            return false;
         }

         var4 = 1;
      }

      while (var4 < var2) {
         char var5 = var1.charAt(var4);
         if (var5 > '9' || var5 < '0') {
            return false;
         }

         var4++;
      }

      return true;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> findConvertingContentDeserializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var1.RCRORHCOCRIIOHICORIHOHRIIRIORH();
      if (_neitherNull(var4, var2)) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.getMember();
         if (var5 != null) {
            Object var6 = var4.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var5);
            if (var6 != null) {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.CRICCOOHHHCHOORCICOCOHIHOIRHOO var7 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var2.getMember(), var6
               );
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var8 = var7.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                  var1.CCOCHOROIOICHHICOCIHCHHOCOOIII()
               );
               if (var3 == null) {
                  var3 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var2);
               }

               return new IHCRORHRORIICHRHRCHRRIRRHHOCOO(var7, var8, var3);
            }
         }
      }

      return var3;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH findFormatOverrides(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      Class<?> var3
   ) {
      return var2 != null ? var2.findPropertyFormat(var1.IIICIOIHIHICHHIHRICHCIRHHIIRII(), var3) : var1.IOCIIROIRCOHIRHHHROHCOOHIICIHI(var3);
   }

   protected Boolean findFormatFeature(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      Class<?> var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH var5 = this.findFormatOverrides(
         var1, var2, var3
      );
      return var5 != null ? var5.CRRRICCRROCOHHOHIICIHORCOORRRH(var4) : null;
   }

   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR findValueNullProvider(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIROICHCRROROHCCROOCCCCOCHCCRI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO var3
   ) {
      return var2 != null ? this._findNullProvider(var1, var2, var3.RHCCOORRRIHCIICOCRHCOCORCHOICI(), var2.CROCICOOIIHHCCRHIHOICHHHRCIIIC()) : null;
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR findContentNullProvider(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI var4 = this.findContentNullStyle(
         var1, var2
      );
      if (var4 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI.SKIP) {
         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CIICOCRIORHORCIICIORCHRHICRCIO();
      }

      if (var4 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI.FAIL) {
         if (var2 == null) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var6 = var1.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
               var3.handledType()
            );
            if (var6.HCHCCRRRHHICOIRRIOOOOHHHOIIORR()) {
               var6 = var6.RCCRIHIHOIICHCIICCOHHHIRICOHHC();
            }

            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
               var6
            );
         } else {
            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, var2.getType().RCCRIHIHOIICHCIICCOHHHIRICOHHC()
            );
         }
      } else {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR var5 = this._findNullProvider(
            var1, var2, var4, var3
         );
         return var5 != null ? var5 : var3;
      }
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI findContentNullStyle(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      return var2 != null
         ? var2.getMetadata().COHICOICIIOHHHCCIIOCHOCCOIOIRI()
         : var1.IIICIOIHIHICHHIHRICHCIRHHIIRII().HORROIICIRCOCOHORHOHORHRICIRCR().COHICOICIIOHHHCCIIOCHOCCOIOIRI();
   }

   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR _findNullProvider(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var4
   ) {
      if (var3 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI.FAIL) {
         if (var2 == null) {
            Class<Object> var9 = var4 == null ? Object.class : var4.handledType();
            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
               var1.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var9)
            );
         } else {
            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var2
            );
         }
      } else if (var3 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI.AS_EMPTY) {
         if (var4 == null) {
            return null;
         }

         if (var4 instanceof com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH
            )
          {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var5 = (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var4;
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI var6 = var5.getValueInstantiator();
            if (!var6.CIIOHRIOROOROOIIHOCHCRHCIRORCO()) {
               com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var7 = var2 == null
                  ? var5.getValueType()
                  : var2.getType();
               return var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var7, String.format("Cannot create empty instance of %s, no default Creator", var7));
            }
         }

         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = var4.getEmptyAccessPattern();
         if (var8
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ALWAYS_NULL
            )
          {
            return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IOHHOICCHRRCROIOROOHIIIHICCOOI();
         } else {
            return var8
                  == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CONSTANT
               ? com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRHIOIHIIIHIIROOIIRIIHHIRHHOOC(
                  var4.getEmptyValue(var1)
               )
               : new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
                  var4
               );
         }
      } else {
         return var3 == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI.SKIP
            ? com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CIICOCRIORHORCIICIORCHRHICRCIO()
            : null;
      }
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _findCoercionFromEmptyString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      return var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.logicalType(),
         this.handledType(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.EmptyString
      );
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _findCoercionFromEmptyArray(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      return var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.logicalType(),
         this.handledType(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.EmptyArray
      );
   }

   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH _findCoercionFromBlankString(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1
   ) {
      return var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.logicalType(),
         this.handledType(),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.Fail
      );
   }

   protected void handleUnknownProperty(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      Object var3,
      String var4
   ) {
      if (var3 == null) {
         var3 = this.handledType();
      }

      if (!var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this, var3, var4)) {
         var1.CIHCRICOCCRRHOOCCCIROOOHHROORC();
      }
   }

   protected void handleMissingEndArrayForSingle(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this,
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY,
         "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value",
         this.handledType().getName()
      );
   }

   protected Object handleNestedArrayForSingle(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      String var3 = String.format(
         "Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s",
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.ROIHROCROORRCCOIRRIHHORCROOORO(
            this._valueClass
         ),
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.START_ARRAY,
         "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"
      );
      return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.getValueType(var2), var1.COCHOCOHRICCHIIIHIOORCIIRROOHI(), var1, var3);
   }

   protected void _verifyEndArrayForSingle(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI var3 = var1.OHHCRICRRCCHOHIRIRIHOIRHIROOIC();
      if (var3 != com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.END_ARRAY) {
         this.handleMissingEndArrayForSingle(var1, var2);
      }
   }

   protected static final boolean _neitherNull(Object var0, Object var1) {
      return var0 != null && var1 != null;
   }

   protected final boolean _byteOverflow(int var1) {
      return var1 < -128 || var1 > 255;
   }

   protected final boolean _shortOverflow(int var1) {
      return var1 < -32768 || var1 > 32767;
   }

   protected final boolean _intOverflow(long var1) {
      return var1 < -2147483648L || var1 > 2147483647L;
   }

   protected Number _nonNullNumber(Number var1) {
      if (var1 == null) {
         var1 = 0;
      }

      return var1;
   }
}
