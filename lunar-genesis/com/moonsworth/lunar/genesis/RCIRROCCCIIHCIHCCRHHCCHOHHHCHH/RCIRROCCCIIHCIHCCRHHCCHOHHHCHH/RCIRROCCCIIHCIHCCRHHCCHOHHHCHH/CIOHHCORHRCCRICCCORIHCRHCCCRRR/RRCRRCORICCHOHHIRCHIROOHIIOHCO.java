package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.COIRRRCIORROCHIROCHROCHICCICIC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, R> extends HHCCIRHCCCIIRHCROHIORHIRHHIORH implements GenericDeclaration {
   <M extends AccessibleObject & Member> RRCRRCORICCHOHHIRCHIROOHIIOHCO(M var1) {
      super((M)var1);
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO<?, Object> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Method var0) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   public static <T> RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Constructor<T> var0) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   public abstract boolean isOverridable();

   public abstract boolean isVarArgs();

   @CanIgnoreReturnValue
   public final R HICHRCOHCCRHOHCICOOCHOIHCCHIRI(@Nullable T var1, Object... var2) {
      return (R)this.invokeInternal(var1, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2));
   }

   public final OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends R> CRHIOICIHHRRCOHRIOHCICORRRCHII() {
      return (OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends R>)OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.getGenericReturnType());
   }

   public final COIRRRCIORROCHIROCHROCHICCICIC<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> RRROIIIHIHCCICHCIOHHHCIIORCIOR() {
      Type[] var1 = this.getGenericParameterTypes();
      Annotation[][] var2 = this.getParameterAnnotations();
      AnnotatedType[] var3 = this.getAnnotatedParameterTypes();
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = COIRRRCIORROCHIROCHROCHICCICIC.HOOCHHHRHCRIRHCIHIRIRCOICCOIOR();

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(
            new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this, var5, OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1[var5]), var2[var5], var3[var5])
         );
      }

      return var4.IORRHROIIRHIIOOHCOOIRHOIHRHRHI();
   }

   public final COIRRRCIORROCHIROCHROCHICCICIC<OCOHORHCROHICRRIHCIHHRRCIHICRI<? extends Throwable>> RCIHCRHIHHIOCCIRRHOIORIHOHOIIC() {
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = COIRRRCIORROCHIROCHROCHICCICIC.HOOCHHHRHCRIRHCIHIRIRCOICCOIOR();

      for (Type var5 : this.getGenericExceptionTypes()) {
         OCOHORHCROHICRRIHCIHHRRCIHICRI var6 = OCOHORHCROHICRRIHCIHHRRCIHICRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5);
         var1.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(var6);
      }

      return var1.IORRHROIIRHIIOOHCOOIRHOIHRHRHI();
   }

   public final <R1 extends R> RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, R1> HRRHRCCOOIOIIIRORIOOORORHOORIH(Class<R1> var1) {
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(OCOHORHCROHICRRIHCIHHRRCIHICRI.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var1));
   }

   public final <R1 extends R> RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, R1> HHCCIRHCCCIIRHCROHIORHIRHHIORH(OCOHORHCROHICRRIHCIHHRRCIHICRI<R1> var1) {
      if (!var1.CRRRICCRROCOHHOHIICIHORCOORRRH(this.CRHIOICIHHRRCOHRIOHCICORRRCHII())) {
         throw new IllegalArgumentException("Invokable is known to return " + this.CRHIOICIHHRRCOHRIOHCICORRRCHII() + ", not " + var1);
      } else {
         return this;
      }
   }

   @Override
   public final Class<? super T> getDeclaringClass() {
      return (Class<? super T>)super.getDeclaringClass();
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI<T> ICCIOIORRCOCORCOCIOHHICORIOCHC() {
      return OCOHORHCROHICRRIHCIHHRRCIHICRI.OHRRHHOCROROCCIRROIHOCCHCIHCIR((Class<T>)this.getDeclaringClass());
   }

   abstract Object invokeInternal(@Nullable Object var1, Object[] var2);

   abstract Type[] getGenericParameterTypes();

   abstract AnnotatedType[] getAnnotatedParameterTypes();

   abstract Type[] getGenericExceptionTypes();

   abstract Annotation[][] getParameterAnnotations();

   abstract Type getGenericReturnType();

   public abstract AnnotatedType getAnnotatedReturnType();

   static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> extends RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, Object> {
      final Method IOROHCHCRRRORHHHHIRHOHOHIRICCH;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(Method var1) {
         super(var1);
         this.IOROHCHCRRRORHHHHIRHOHOHIRICCH = var1;
      }

      @Override
      final Object invokeInternal(@Nullable Object var1, Object[] var2) {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.invoke(var1, var2);
      }

      @Override
      Type getGenericReturnType() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getGenericReturnType();
      }

      @Override
      Type[] getGenericParameterTypes() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getGenericParameterTypes();
      }

      @Override
      AnnotatedType[] getAnnotatedParameterTypes() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getAnnotatedParameterTypes();
      }

      @Override
      public AnnotatedType getAnnotatedReturnType() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getAnnotatedReturnType();
      }

      @Override
      Type[] getGenericExceptionTypes() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getGenericExceptionTypes();
      }

      @Override
      final Annotation[][] getParameterAnnotations() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getParameterAnnotations();
      }

      @Override
      public final TypeVariable<?>[] getTypeParameters() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.getTypeParameters();
      }

      @Override
      public final boolean isOverridable() {
         return !this.HHIHROCCCIHOHRCOHCIHHHCCHRHCHR()
            && !this.RHCRHOCOCOHORIIRRROHCROIHRICCC()
            && !this.RICOOIHIOOCOROICIIRCORRIOHRROR()
            && !Modifier.isFinal(this.getDeclaringClass().getModifiers());
      }

      @Override
      public final boolean isVarArgs() {
         return this.IOROHCHCRRRORHHHHIRHOHOHIRICCH.isVarArgs();
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> extends RRCRRCORICCHOHHIRCHIROOHIIOHCO<T, T> {
      final Constructor<?> ICOHIIROIHIRHHOCIHICIRIRCCOHCH;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Constructor<?> var1) {
         super(var1);
         this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH = var1;
      }

      @Override
      final Object invokeInternal(@Nullable Object var1, Object[] var2) {
         try {
            return this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.newInstance(var2);
         } catch (InstantiationException var4) {
            throw new RuntimeException(this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH + " failed.", var4);
         }
      }

      @Override
      Type getGenericReturnType() {
         Class var1 = this.getDeclaringClass();
         TypeVariable[] var2 = var1.getTypeParameters();
         return var2.length > 0 ? IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newParameterizedType(var1, var2) : var1;
      }

      @Override
      Type[] getGenericParameterTypes() {
         Type[] var1 = this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getGenericParameterTypes();
         if (var1.length > 0 && this.mayNeedHiddenThis()) {
            Class[] var2 = this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getParameterTypes();
            if (var1.length == var2.length && var2[0] == this.getDeclaringClass().getEnclosingClass()) {
               return Arrays.copyOfRange(var1, 1, var1.length);
            }
         }

         return var1;
      }

      @Override
      AnnotatedType[] getAnnotatedParameterTypes() {
         return this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getAnnotatedParameterTypes();
      }

      @Override
      public AnnotatedType getAnnotatedReturnType() {
         return this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getAnnotatedReturnType();
      }

      @Override
      Type[] getGenericExceptionTypes() {
         return this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getGenericExceptionTypes();
      }

      @Override
      final Annotation[][] getParameterAnnotations() {
         return this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getParameterAnnotations();
      }

      @Override
      public final TypeVariable<?>[] getTypeParameters() {
         TypeVariable[] var1 = this.getDeclaringClass().getTypeParameters();
         TypeVariable[] var2 = this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getTypeParameters();
         TypeVariable[] var3 = new TypeVariable[var1.length + var2.length];
         System.arraycopy(var1, 0, var3, 0, var1.length);
         System.arraycopy(var2, 0, var3, var1.length, var2.length);
         return var3;
      }

      @Override
      public final boolean isOverridable() {
         return false;
      }

      @Override
      public final boolean isVarArgs() {
         return this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.isVarArgs();
      }

      private boolean mayNeedHiddenThis() {
         Class var1 = this.ICOHIIROIHIRHHOCIHICIRIRCCOHCH.getDeclaringClass();
         if (var1.getEnclosingConstructor() != null) {
            return true;
         }

         Method var2 = var1.getEnclosingMethod();
         return var2 != null ? !Modifier.isStatic(var2.getModifiers()) : var1.getEnclosingClass() != null && !Modifier.isStatic(var1.getModifiers());
      }
   }
}
