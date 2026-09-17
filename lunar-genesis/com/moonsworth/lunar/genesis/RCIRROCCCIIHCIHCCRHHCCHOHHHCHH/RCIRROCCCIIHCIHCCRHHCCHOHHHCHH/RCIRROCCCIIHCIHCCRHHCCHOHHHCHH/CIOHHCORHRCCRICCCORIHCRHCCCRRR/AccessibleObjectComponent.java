package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import org.checkerframework.checker.nullness.qual.Nullable;

class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends AccessibleObject implements Member {
   private final AccessibleObject HCROIICICHIIRHIIRCIOCOHCRIIRHC;
   private final Member ICHOORIHRRIHRIHROIHRCRCRIHCHHH;

   <M extends AccessibleObject & Member> HHCCIRHCCCIIRHCROHIORHIRHHIORH(M var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      this.HCROIICICHIIRHIIRCIOCOHCRIIRHC = var1;
      this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH = (Member)var1;
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI<?> ICCIOIORRCOCORCOCIOHHICORIOCHC() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.OHRRHHOCROROCCIRROIHOCCHCIHCIR(this.getDeclaringClass());
   }

   @Override
   public final boolean isAnnotationPresent(Class<? extends Annotation> var1) {
      return this.HCROIICICHIIRHIIRCIOCOHCRIIRHC.isAnnotationPresent(var1);
   }

   @Override
   public final <A extends Annotation> A getAnnotation(Class<A> var1) {
      return this.HCROIICICHIIRHIIRCIOCOHCRIIRHC.getAnnotation(var1);
   }

   @Override
   public final Annotation[] getAnnotations() {
      return this.HCROIICICHIIRHIIRCIOCOHCRIIRHC.getAnnotations();
   }

   @Override
   public final Annotation[] getDeclaredAnnotations() {
      return this.HCROIICICHIIRHIIRCIOCOHCRIIRHC.getDeclaredAnnotations();
   }

   @Override
   public final void setAccessible(boolean var1) {
      this.HCROIICICHIIRHIIRCIOCOHCRIIRHC.setAccessible(var1);
   }

   @Override
   public final boolean isAccessible() {
      return this.HCROIICICHIIRHIIRCIOCOHCRIIRHC.isAccessible();
   }

   @Override
   public Class<?> getDeclaringClass() {
      return this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.getDeclaringClass();
   }

   @Override
   public final String getName() {
      return this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.getName();
   }

   @Override
   public final int getModifiers() {
      return this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.getModifiers();
   }

   @Override
   public final boolean isSynthetic() {
      return this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.isSynthetic();
   }

   public final boolean HCIICCROOORHROOIOCCHOORHRRCHCR() {
      return Modifier.isPublic(this.getModifiers());
   }

   public final boolean OHRHOCCROCCIIHCROOORRIOIHHICRO() {
      return Modifier.isProtected(this.getModifiers());
   }

   public final boolean HIIIOHOROIOORIRRIIHHHIOIIICROC() {
      return !this.RHCRHOCOCOHORIIRRROHCROIHRICCC() && !this.HCIICCROOORHROOIOCCHOORHRRCHCR() && !this.OHRHOCCROCCIIHCROOORRIOIHHICRO();
   }

   public final boolean RHCRHOCOCOHORIIRRROHCROIHRICCC() {
      return Modifier.isPrivate(this.getModifiers());
   }

   public final boolean RICOOIHIOOCOROICIIRCORRIOHRROR() {
      return Modifier.isStatic(this.getModifiers());
   }

   public final boolean HHIHROCCCIHOHRCOHCIHHHCCHRHCHR() {
      return Modifier.isFinal(this.getModifiers());
   }

   public final boolean RHICRICICICOHRCCRCCIHRICRHHRCR() {
      return Modifier.isAbstract(this.getModifiers());
   }

   public final boolean IIHCHRORCRROOHHRICIIOCCROCRIIO() {
      return Modifier.isNative(this.getModifiers());
   }

   public final boolean RHCOCCCRHCRHOHCIICOORRIORIOHCR() {
      return Modifier.isSynchronized(this.getModifiers());
   }

   final boolean HRHCCCCOORHICOORIOIRIHHIHIOHIO() {
      return Modifier.isVolatile(this.getModifiers());
   }

   final boolean HRHOHHOCRHRIOHOCOIHRIRIIRHRHCC() {
      return Modifier.isTransient(this.getModifiers());
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (!(var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH)) {
         return false;
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
      return this.ICCIOIORRCOCORCOCIOHHICORIOCHC().equals(var2.ICCIOIORRCOCORCOCIOHHICORIOCHC())
         && this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.equals(var2.ICHOORIHRRIHRIHROIHRCRCRIHCHHH);
   }

   @Override
   public int hashCode() {
      return this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.hashCode();
   }

   @Override
   public String toString() {
      return this.ICHOORIHRRIHRIHROIHRCRCRIHCHHH.toString();
   }
}
