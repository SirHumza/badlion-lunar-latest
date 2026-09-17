package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends IHHCHHHCRIHOOCOIOOCRIIICIOROIR implements Serializable {
   private static final long CCCOCRIOROHOROROHCRCORICHIHHCH = 1L;
   protected final transient Method COHIIHHCCOOICHRIOOCCOHHCRIHHOH;
   protected Class<?>[] RRCOCHHCOCRORIHRCCICRORIIORCCC;
   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOCCICORROOOICORHCOOIOOOIHRCIO;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Method var2, RHOCHHIRRCHHHOHOIRROIROHHHIHIO var3, RHOCHHIRRCHHHOHOIRROIROHHHIHIO[] var4
   ) {
      super(var1, var3, var4);
      if (var2 == null) {
         throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
      }

      this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH = var2;
   }

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      super(null, null, null);
      this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH = null;
      this.OOCCICORROOOICORHCOOIOOOIHRCIO = var1;
   }

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI CRRRICCRROCOHHOHIICIHORCOORRRH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         this.IRIOIRIROIIOCRCIRHICCOCIOOHICO, this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH, var1, this.ORIRIOIRORIHCRCCRRCCOHIHROORCR
      );
   }

   public Method IIIOCCHOOIHCOICCIICHCRRCIRIHOI() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH;
   }

   @Override
   public int getModifiers() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getModifiers();
   }

   @Override
   public String getName() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getName();
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI getType() {
      return this.IRIOIRIROIIOCRCIRHICCOCIOOHICO.IIHRRHORCRCROCHHOHORCHCROCIHRO(this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getGenericReturnType());
   }

   @Override
   public Class<?> getRawType() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getReturnType();
   }

   @Override
   public final Object call() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(null);
   }

   @Override
   public final Object call(Object[] var1) {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(null, var1);
   }

   @Override
   public final Object OHRCIORHOCHOORCRHHOHRRRCCOICCO(Object var1) {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(null, var1);
   }

   public final Object OOCHIIROORIOCCCCCOORRIRIOHOORH(Object var1) {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(var1, (Object[])null);
   }

   public final Object IIHRRHORCRCROCHHOHORCHCROCIHRO(Object var1, Object... var2) {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(var1, var2);
   }

   @Override
   public int CICHIHICOCHIIOCICRICIRRRIOCROO() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getParameterCount();
   }

   @Override
   public Class<?> OICOOCHOORCCCIIIORHCRIRHOIIORI(int var1) {
      Class[] var2 = this.CIOHRROOOIHHIROHCRCRRIIRHOIORI();
      return var1 >= var2.length ? null : var2[var1];
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RCICCRIHIORCCCRCCORIROCOIIORHC(
      int var1
   ) {
      Type[] var2 = this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getGenericParameterTypes();
      return var1 >= var2.length ? null : this.IRIOIRIROIIOCRCIRHICCOCIOOHICO.IIHRRHORCRCROCHHOHORCHCROCIHRO(var2[var1]);
   }

   @Deprecated
   @Override
   public Type CCHICRHRHOIHHRORCROCHHROIHOCHO(int var1) {
      Type[] var2 = this.getGenericParameterTypes();
      return var1 >= var2.length ? null : var2[var1];
   }

   @Override
   public Class<?> getDeclaringClass() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getDeclaringClass();
   }

   public Method getMember() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH;
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Object var1, Object var2) {
      try {
         this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(var1, var2);
      } catch (IllegalAccessException | InvocationTargetException var4) {
         throw new IllegalArgumentException(
            "Failed to setValue() with method "
               + this.getFullName()
               + ": "
               + com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO(
                  var4
               ),
            var4
         );
      }
   }

   @Override
   public Object getValue(Object var1) {
      try {
         return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.invoke(var1, (Object[])null);
      } catch (IllegalAccessException | InvocationTargetException var3) {
         throw new IllegalArgumentException(
            "Failed to getValue() with method "
               + this.getFullName()
               + ": "
               + com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO(
                  var3
               ),
            var3
         );
      }
   }

   @Override
   public String getFullName() {
      String var1 = super.getFullName();
      switch (this.CICHIHICOCHIIOCICRICIRRRIOCROO()) {
         case 0:
            return var1 + "()";
         case 1:
            return var1 + "(" + this.OICOOCHOORCCCIIIORHCRIRHOIIORI(0).getName() + ")";
         default:
            return String.format("%s(%d params)", super.getFullName(), this.CICHIHICOCHIIOCICRICIRRRIOCROO());
      }
   }

   public Class<?>[] CIOHRROOOIHHIROHCRCRRIIRHOIORI() {
      if (this.RRCOCHHCOCRORIHRCCICRORIIORCCC == null) {
         this.RRCOCHHCOCRORIHRCCICRORIIORCCC = this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getParameterTypes();
      }

      return this.RRCOCHHCOCRORIHRCCICRORIIORCCC;
   }

   @Deprecated
   public Type[] getGenericParameterTypes() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getGenericParameterTypes();
   }

   public Class<?> HCOIRRHRCHIIORCOIROIHHRRCIIRIH() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getReturnType();
   }

   @Deprecated
   public boolean hasReturnType() {
      Class var1 = this.HCOIRRHRCHIIORCOIROIHHRRCIIRIH();
      return var1 != void.class;
   }

   @Override
   public String toString() {
      return "[method " + this.getFullName() + "]";
   }

   @Override
   public int hashCode() {
      return this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.getName().hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
         var1, this.getClass()
      )) {
         return false;
      }

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1;
      return var2.COHIIHHCCOOICHRIOOCCOHHCRIHHOH == null
         ? this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH == null
         : var2.COHIIHHCCOOICHRIOOCCOHHCRIHHOH.equals(this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH);
   }

   Object writeReplace() {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.COHIIHHCCOOICHRIOOCCOHHCRIHHOH));
   }

   Object readResolve() {
      Class var1 = this.OOCCICORROOOICORHCOOIOOOIHRCIO.clazz;

      try {
         Method var2 = var1.getDeclaredMethod(this.OOCCICORROOOICORHCOOIOOOIHRCIO.name, this.OOCCICORROOOICORHCOOIOOOIHRCIO.HORIICIRCIHOCHHOHRIHCHOHOIRCOC);
         if (!var2.isAccessible()) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, false
            );
         }

         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(null, var2, null, null);
      } catch (Exception var3) {
         throw new IllegalArgumentException("Could not find method '" + this.OOCCICORROOOICORHCOOIOOOIHRCIO.name + "' from Class '" + var1.getName());
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Serializable {
      private static final long RHRRHOICICHOOOCOOHICHIORORHOOI = 1L;
      protected Class<?> clazz;
      protected String name;
      protected Class<?>[] HORIICIRCIHOCHHOHRIHCHOHOIRCOC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Method var1) {
         this.clazz = var1.getDeclaringClass();
         this.name = var1.getName();
         this.HORIICIRCIHOCHHOHRIHCHOHOIRCOC = var1.getParameterTypes();
      }
   }
}
