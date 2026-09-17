package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public abstract class ORHIOICIOCRRHOOCOHRORIHICHRCRR<T>
   extends ICICIOCHHHIHOCHCOHORIHRCOHHOCR<T>
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR {
   private static final long serialVersionUID = 2L;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI _fullType;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI _valueInstantiator;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI _valueTypeDeserializer;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<Object> _valueDeserializer;

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var4
   ) {
      super(var1);
      this._valueInstantiator = var2;
      this._fullType = var1;
      this._valueDeserializer = var4;
      this._valueTypeDeserializer = var3;
   }

   @Deprecated
   public ORHIOICIOCRRHOOCOHRORIHICHRCRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var3
   ) {
      this(var1, null, var2, var3);
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> createContextual(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR var3 = this._valueDeserializer;
      if (var3 == null) {
         var3 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this._fullType.ROIRRRIHROCRRIIIICORRRIRHROCCO(), var2);
      } else {
         var3 = var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3, var2, this._fullType.ROIRRRIHROCRRIIIICORRRIRHROCCO());
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var4 = this._valueTypeDeserializer;
      if (var4 != null) {
         var4 = var4.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2);
      }

      return var3 == this._valueDeserializer && var4 == this._valueTypeDeserializer ? this : this.withResolved(var4, var3);
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getNullAccessPattern() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DYNAMIC;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getEmptyAccessPattern() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DYNAMIC;
   }

   protected abstract ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> withResolved(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var2
   );

   @Override
   public abstract T getNullValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1);

   @Override
   public Object getEmptyValue(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      return this.getNullValue(var1);
   }

   public abstract T referenceValue(Object var1);

   public abstract T updateReference(T var1, Object var2);

   public abstract Object getReferenced(T var1);

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHRIICOIOORCHCOIICOOIHIRHHICRI getValueInstantiator() {
      return this._valueInstantiator;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getValueType() {
      return this._fullType;
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH logicalType() {
      return this._valueDeserializer != null ? this._valueDeserializer.logicalType() : super.logicalType();
   }

   @Override
   public Boolean supportsUpdate(com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return this._valueDeserializer == null ? null : this._valueDeserializer.supportsUpdate(var1);
   }

   @Override
   public T deserialize(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (this._valueInstantiator != null) {
         Object var4 = this._valueInstantiator.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2);
         return this.deserialize(var1, var2, (T)var4);
      } else {
         Object var3 = this._valueTypeDeserializer == null
            ? this._valueDeserializer.deserialize(var1, var2)
            : this._valueDeserializer.deserializeWithType(var1, var2, this._valueTypeDeserializer);
         return this.referenceValue(var3);
      }
   }

   @Override
   public T deserialize(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      T var3
   ) {
      Boolean var5 = this._valueDeserializer.supportsUpdate(var2.IIICIOIHIHICHHIHRICHCIRHHIIRII());
      Object var4;
      if (!var5.equals(Boolean.FALSE) && this._valueTypeDeserializer == null) {
         var4 = this.getReferenced((T)var3);
         if (var4 == null) {
            var4 = this._valueTypeDeserializer == null
               ? this._valueDeserializer.deserialize(var1, var2)
               : this._valueDeserializer.deserializeWithType(var1, var2, this._valueTypeDeserializer);
            return this.referenceValue(var4);
         }

         var4 = this._valueDeserializer.deserialize(var1, var2, var4);
      } else {
         var4 = this._valueTypeDeserializer == null
            ? this._valueDeserializer.deserialize(var1, var2)
            : this._valueDeserializer.deserializeWithType(var1, var2, this._valueTypeDeserializer);
      }

      return this.updateReference((T)var3, var4);
   }

   @Override
   public Object deserializeWithType(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3
   ) {
      if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_NULL
      )) {
         return this.getNullValue(var2);
      } else {
         return this._valueTypeDeserializer == null
            ? this.deserialize(var1, var2)
            : this.referenceValue(this._valueTypeDeserializer.IORRORCRRHRRORHIRHRROHCRRIHRII(var1, var2));
      }
   }
}
