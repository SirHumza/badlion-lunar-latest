package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.COIRRRCIORROCHIROCHROCHICCICIC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRIHOIRCHIRRCRIOORCOICORHHORHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.Nullable;

final class IHHCHHHCRIHOOCOIOOCRIIICIOROIR {
   private static final IRRCCOICORICIHCHRHIHIHROIRHOCR<Type, String> OIRIIOIHIRHIIORIHHRICOHHORHCIR = new IRRCCOICORICIHCHRHIHIHROIRHOCR<Type, String>() {
      public String apply(Type var1) {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.typeName(var1);
      }
   };
   private static final IHIRRIIORRHORHRORIHOROIRCORCOO HOHICCCCRRHHHOCHOCCHIHOICOIORR = IHIRRIIORRHORHRORIHOROIRCORCOO.COOOROIICHHICCCHCCIOIRRRRIIORO(", ")
      .CIHOHCROHHHORHHCHRORHHCHRHOOCH("null");

   static Type newArrayType(Type var0) {
      if (var0 instanceof WildcardType) {
         WildcardType var1 = (WildcardType)var0;
         Type[] var2 = var1.getLowerBounds();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2.length <= 1, "Wildcard cannot have more than one lower bounds.");
         if (var2.length == 1) {
            return supertypeOf(newArrayType(var2[0]));
         }

         Type[] var3 = var1.getUpperBounds();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var3.length == 1, "Wildcard should have only one upper bound.");
         return subtypeOf(newArrayType(var3[0]));
      } else {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.newArrayType(var0);
      }
   }

   static ParameterizedType newParameterizedTypeWithOwner(@Nullable Type var0, Class<?> var1, Type... var2) {
      if (var0 == null) {
         return newParameterizedType(var1, var2);
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1.getEnclosingClass() != null, "Owner type for unenclosed %s", var1);
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2);
   }

   static ParameterizedType newParameterizedType(Class<?> var0, Type... var1) {
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.JVM_BEHAVIOR.getOwnerType(var0), var0, var1
      );
   }

   static <D extends GenericDeclaration> TypeVariable<D> newArtificialTypeVariable(D var0, String var1, Type... var2) {
      return newTypeVariableImpl((D)var0, var1, var2.length == 0 ? new Type[]{Object.class} : var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static WildcardType subtypeOf(Type var0) {
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new Type[0], new Type[]{var0});
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static WildcardType supertypeOf(Type var0) {
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(new Type[]{var0}, new Type[]{Object.class});
   }

   static String toString(Type var0) {
      return var0 instanceof Class ? ((Class)var0).getName() : var0.toString();
   }

   static @Nullable Type getComponentType(Type var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      final AtomicReference var1 = new AtomicReference();
      (new CIOHHCORHRCCRICCCORIHCRHCCCRRR() {
         @Override
         void visitTypeVariable(TypeVariable<?> var1x) {
            var1.set(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.subtypeOfComponentType(var1x.getBounds()));
         }

         @Override
         void visitWildcardType(WildcardType var1x) {
            var1.set(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.subtypeOfComponentType(var1x.getUpperBounds()));
         }

         @Override
         void visitGenericArrayType(GenericArrayType var1x) {
            var1.set(var1x.getGenericComponentType());
         }

         @Override
         void visitClass(Class<?> var1x) {
            var1.set(var1x.getComponentType());
         }
      }).CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
      return (Type)var1.get();
   }

   private static @Nullable Type subtypeOfComponentType(Type[] var0) {
      for (Type var4 : var0) {
         Type var5 = getComponentType(var4);
         if (var5 != null) {
            if (var5 instanceof Class) {
               Class var6 = (Class)var5;
               if (var6.isPrimitive()) {
                  return var6;
               }
            }

            return subtypeOf(var5);
         }
      }

      return null;
   }

   private static <D extends GenericDeclaration> TypeVariable<D> newTypeVariableImpl(D var0, String var1, Type[] var2) {
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 = new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<>(var0, var1, var2);
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.newProxy(
         TypeVariable.class, new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var3)
      );
   }

   private static Type[] toArray(Collection<Type> var0) {
      return var0.toArray(new Type[0]);
   }

   private static Iterable<Type> filterUpperBounds(Iterable<Type> var0) {
      return IRIHOIRCHIRRCRIOORCOICORHHORHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI(Object.class))
      );
   }

   private static void disallowPrimitiveType(Type[] var0, String var1) {
      for (Type var5 : var0) {
         if (var5 instanceof Class) {
            Class var6 = (Class)var5;
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var6.isPrimitive(), "Primitive type '%s' used as %s", var6, var1);
         }
      }
   }

   static Class<?> getArrayClass(Class<?> var0) {
      return Array.newInstance(var0, 0).getClass();
   }

   private IHHCHHHCRIHOOCOIOOCRIIICIOROIR() {
   }

   static final class CRRRICCRROCOHHOHIICIHORCOORRRH<X> {
      static final boolean OHIHHHOOHCRIHHCOHRIRCCRRHRHRII = !IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CRRRICCRROCOHHOHIICIHORCOORRRH.class.getTypeParameters()[0]
         .equals(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newArtificialTypeVariable(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CRRRICCRROCOHHOHIICIHORCOORRRH.class, "X"));
   }

   enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      JAVA6 {
         GenericArrayType newArrayType(Type var1) {
            return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         }

         @Override
         Type usedInGenericType(Type var1) {
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
            if (var1 instanceof Class) {
               Class var2 = (Class)var1;
               if (var2.isArray()) {
                  return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2.getComponentType());
               }
            }

            return var1;
         }
      },
      JAVA7 {
         @Override
         Type newArrayType(Type var1) {
            return var1 instanceof Class
               ? IHHCHHHCRIHOOCOIOOCRIIICIOROIR.getArrayClass((Class<?>)var1)
               : new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
         }

         @Override
         Type usedInGenericType(Type var1) {
            return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         }
      },
      JAVA8 {
         @Override
         Type newArrayType(Type var1) {
            return JAVA7.newArrayType(var1);
         }

         @Override
         Type usedInGenericType(Type var1) {
            return JAVA7.usedInGenericType(var1);
         }

         @Override
         String typeName(Type var1) {
            try {
               Method var2 = Type.class.getMethod("getTypeName");
               return (String)var2.invoke(var1);
            } catch (NoSuchMethodException var3) {
               throw new AssertionError("Type.getTypeName should be available in Java 8");
            } catch (InvocationTargetException var4) {
               throw new RuntimeException(var4);
            } catch (IllegalAccessException var5) {
               throw new RuntimeException(var5);
            }
         }
      },
      JAVA9 {
         @Override
         Type newArrayType(Type var1) {
            return JAVA8.newArrayType(var1);
         }

         @Override
         Type usedInGenericType(Type var1) {
            return JAVA8.usedInGenericType(var1);
         }

         @Override
         String typeName(Type var1) {
            return JAVA8.typeName(var1);
         }

         @Override
         boolean jdkTypeDuplicatesOwnerName() {
            return false;
         }
      };

      static final IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CURRENT;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }

      abstract Type newArrayType(Type var1);

      abstract Type usedInGenericType(Type var1);

      final COIRRRCIORROCHIROCHROCHICCICIC<Type> usedInGenericType(Type[] var1) {
         COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = COIRRRCIORROCHIROCHROCHICCICIC.HOOCHHHRHCRIRHCIHIRIRCOICCOIOR();

         for (Type var6 : var1) {
            var2.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(this.usedInGenericType(var6));
         }

         return var2.IORRHROIIRHIIOOHCOOIRHOIHRHRHI();
      }

      String typeName(Type var1) {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.toString(var1);
      }

      boolean jdkTypeDuplicatesOwnerName() {
         return true;
      }

      static {
         if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if ((new CORCOCICIRIOHROHROIIOOHICCHCRR<Entry<String, int[][]>>() {})
               .HRRCOCOCOOIRCOIORORHHRHOOORHOR()
               .toString()
               .contains("java.util.Map.java.util.Map")) {
               CURRENT = JAVA8;
            } else {
               CURRENT = JAVA9;
            }
         } else if ((new CORCOCICIRIOHROHROIIOOHICCHCRR<int[]>() {}).HRRCOCOCOOIRCOIORORHHRHOOORHOR() instanceof Class) {
            CURRENT = JAVA7;
         } else {
            CURRENT = JAVA6;
         }
      }
   }

   private static final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements InvocationHandler {
      private static final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<String, Method> IOCOCOHOIRCHOIHCOOHHCHHOHOROII;
      private final IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<?> OIOOIHIHHRIHOROIHIRHOHCHCCOIOO;

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<?> var1) {
         this.OIOOIHIHHRIHOROIHIRHOHCHCCOIOO = var1;
      }

      @Override
      public Object invoke(Object var1, Method var2, Object[] var3) {
         String var4 = var2.getName();
         Method var5 = IOCOCOHOIRCHOIHCOOHHCHHOHOROII.get(var4);
         if (var5 == null) {
            throw new UnsupportedOperationException(var4);
         }

         try {
            return var5.invoke(this.OIOOIHIHHRIHOROIHIRHOHCHCCOIOO, var3);
         } catch (InvocationTargetException var7) {
            throw var7.getCause();
         }
      }

      static {
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.OIRCICCCRCRHORRRCHHORCHRCRRIOH();

         for (Method var4 : IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class.getMethods()) {
            if (var4.getDeclaringClass().equals(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class)) {
               try {
                  var4.setAccessible(true);
               } catch (AccessControlException var6) {
               }

               var0.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var4.getName(), var4);
            }
         }

         IOCOCOHOIRCHOIHCOOHHCHHOHOROII = var0.CHRROORCHRCIIRRORRRIORRRRICIRI();
      }
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Serializable, GenericArrayType {
      private final Type OOHCHRROIORCHIOIRRRIHCOROOOORC;
      private static final long OHHIHRRHHOORRIOHOOIHIICRRRCOOR = 0L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(Type var1) {
         this.OOHCHRROIORCHIOIRRRIHCOROOOORC = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.usedInGenericType(var1);
      }

      @Override
      public Type getGenericComponentType() {
         return this.OOHCHRROIORCHIOIRRRIHCOROOOORC;
      }

      @Override
      public String toString() {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.toString(this.OOHCHRROIORCHIOIRRRIHCOROOOORC) + "[]";
      }

      @Override
      public int hashCode() {
         return this.OOHCHRROIORCHIOIRRRIHCOROOOORC.hashCode();
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 instanceof GenericArrayType) {
            GenericArrayType var2 = (GenericArrayType)var1;
            return HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.getGenericComponentType(), var2.getGenericComponentType());
         } else {
            return false;
         }
      }
   }

   static final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR implements Serializable, WildcardType {
      private final COIRRRCIORROCHIROCHROCHICCICIC<Type> HHCRRRIHCCROIROIHRICCHRRRCHHCI;
      private final COIRRRCIORROCHIROCHROCHICCICIC<Type> COOCORRIRCIHCOIHCOROCIHCIIHCRR;
      private static final long HICIHIOCICCCIHICORHIROHRHOORIH = 0L;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Type[] var1, Type[] var2) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.disallowPrimitiveType(var1, "lower bound for wildcard");
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.disallowPrimitiveType(var2, "upper bound for wildcard");
         this.HHCRRRIHCCROIROIHRICCHRRRCHHCI = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.usedInGenericType(var1);
         this.COOCORRIRCIHCOIHCOROCIHCIIHCRR = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.usedInGenericType(var2);
      }

      @Override
      public Type[] getLowerBounds() {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.toArray(this.HHCRRRIHCCROIROIHRICCHRRRCHHCI);
      }

      @Override
      public Type[] getUpperBounds() {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.toArray(this.COOCORRIRCIHCOIHCOROCIHCIIHCRR);
      }

      @Override
      public boolean equals(Object var1) {
         if (!(var1 instanceof WildcardType)) {
            return false;
         }

         WildcardType var2 = (WildcardType)var1;
         return this.HHCRRRIHCCROIROIHRICCHRRRCHHCI.equals(Arrays.asList(var2.getLowerBounds()))
            && this.COOCORRIRCIHCOIHCOROCIHCIIHCRR.equals(Arrays.asList(var2.getUpperBounds()));
      }

      @Override
      public int hashCode() {
         return this.HHCRRRIHCCROIROIHRICCHRRRCHHCI.hashCode() ^ this.COOCORRIRCIHCOIHCOROCIHCIIHCRR.hashCode();
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder("?");
         IRRCHIRICCIHCCIHOHRCHRHRHCRCOH var2 = this.HHCRRRIHCCROIROIHRICCHRRRCHHCI.IOHOCICRRIRHHCCCRICOCOHOIIOCRH();

         while (var2.hasNext()) {
            Type var3 = (Type)var2.next();
            var1.append(" super ").append(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.typeName(var3));
         }

         for (Type var5 : IHHCHHHCRIHOOCOIOOCRIIICIOROIR.filterUpperBounds(this.COOCORRIRCIHCOIHCOROCIHCIIHCRR)) {
            var1.append(" extends ").append(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.typeName(var5));
         }

         return var1.toString();
      }
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      OWNED_BY_ENCLOSING_CLASS {
         @Override
         @Nullable Class<?> getOwnerType(Class<?> var1) {
            return var1.getEnclosingClass();
         }
      },
      LOCAL_CLASS_HAS_NO_OWNER {
         @Override
         @Nullable Class<?> getOwnerType(Class<?> var1) {
            return var1.isLocalClass() ? null : var1.getEnclosingClass();
         }
      };

      static final IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH JVM_BEHAVIOR = detectJvmBehavior();

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      abstract @Nullable Class<?> getOwnerType(Class<?> var1);

      private static IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH detectJvmBehavior() {
         Class var0 = (new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<String>() {}).getClass();
         ParameterizedType var1 = (ParameterizedType)var0.getGenericSuperclass();

         for (IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : values()) {
            class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
            }

            if (var5.getOwnerType(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class) == var1.getOwnerType()) {
               return var5;
            }
         }

         throw new AssertionError();
      }
   }

   private static final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<D extends GenericDeclaration> {
      private final D IOCHHHIHCOHRIHHIRCHRRCRCICORRH;
      private final String ROOHRCOCCHRORIOOIIOHOORIIRIORH;
      private final COIRRRCIORROCHIROCHROCHICCICIC<Type> RRIHCIRCOICRHHOOHOHHHOOHIRIHOC;

      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(D var1, String var2, Type[] var3) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.disallowPrimitiveType(var3, "bound for type variable");
         this.IOCHHHIHCOHRIHHIRCHRRCRCICORRH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull((D)var1);
         this.ROOHRCOCCHRORIOOIIOHOORIIRIORH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         this.RRIHCIRCOICRHHOOHOHHHOOHIRIHOC = COIRRRCIORROCHIROCHROCHICCICIC.IRRCCOICORICIHCHRHIHIHROIRHOCR(var3);
      }

      public Type[] getBounds() {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.toArray(this.RRIHCIRCOICRHHOOHOHHHOOHIRIHOC);
      }

      public D getGenericDeclaration() {
         return this.IOCHHHIHCOHRIHHIRCHRRCRCICORRH;
      }

      public String getName() {
         return this.ROOHRCOCCHRORIOOIIOHOORIIRIORH;
      }

      public String getTypeName() {
         return this.ROOHRCOCCHRORIOOIIOHOORIIRIORH;
      }

      @Override
      public String toString() {
         return this.ROOHRCOCCHRORIOOIIOHOORIIRIORH;
      }

      @Override
      public int hashCode() {
         return this.IOCHHHIHCOHRIHHIRCHRRCRCICORRH.hashCode() ^ this.ROOHRCOCCHRORIOOIIOHOORIIRIORH.hashCode();
      }

      @Override
      public boolean equals(Object var1) {
         if (IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CRRRICCRROCOHHOHIICIHORCOORRRH.OHIHHHOOHCRIHHCOHRIRCCRRHRHRII) {
            if (var1 != null
               && Proxy.isProxyClass(var1.getClass())
               && Proxy.getInvocationHandler(var1) instanceof IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH) {
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)Proxy.getInvocationHandler(
                  var1
               );
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 = var4.OIOOIHIHHRIHOROIHIRHOHCHCCOIOO;
               return this.ROOHRCOCCHRORIOOIIOHOORIIRIORH.equals(var3.getName())
                  && this.IOCHHHIHCOHRIHHIRCHRRCRCICORRH.equals(var3.getGenericDeclaration())
                  && this.RRIHCIRCOICRHHOOHOHHHOOHIRIHOC.equals(var3.RRIHCIRCOICRHHOOHOHHHOOHIRIHOC);
            } else {
               return false;
            }
         } else {
            if (!(var1 instanceof TypeVariable)) {
               return false;
            }

            TypeVariable var2 = (TypeVariable)var1;
            return this.ROOHRCOCCHRORIOOIIOHOORIIRIORH.equals(var2.getName()) && this.IOCHHHIHCOHRIHHIRCHRRCRCICORRH.equals(var2.getGenericDeclaration());
         }
      }
   }

   private static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements Serializable, ParameterizedType {
      private final @Nullable Type RORIIOOIIHCHCCHCOOCHROHIHCRIHR;
      private final COIRRRCIORROCHIROCHROCHICCICIC<Type> ICCOOIRCIOCIRHHRCRIROHOHCIORII;
      private final Class<?> IIIOICIRORCCRIICORCROICRRROIIO;
      private static final long OCICRCCCRHHCHOOHICIIHIORCOICOR = 0L;

      RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable Type var1, Class<?> var2, Type[] var3) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var3.length == var2.getTypeParameters().length);
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR.disallowPrimitiveType(var3, "type parameter");
         this.RORIIOOIIHCHCCHCOOCHROHIHCRIHR = var1;
         this.IIIOICIRORCCRIICORCROICRRROIIO = var2;
         this.ICCOOIRCIOCIRHHRCRIROHOHCIORII = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.usedInGenericType(var3);
      }

      @Override
      public Type[] getActualTypeArguments() {
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.toArray(this.ICCOOIRCIOCIRHHRCRIROHOHCIORII);
      }

      @Override
      public Type getRawType() {
         return this.IIIOICIRORCCRIICORCROICRRROIIO;
      }

      @Override
      public Type getOwnerType() {
         return this.RORIIOOIIHCHCCHCOOCHROHIHCRIHR;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder();
         if (this.RORIIOOIIHCHCCHCOOCHROHIHCRIHR != null && IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.jdkTypeDuplicatesOwnerName()) {
            var1.append(IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CURRENT.typeName(this.RORIIOOIIHCHCCHCOOCHROHIHCRIHR)).append('.');
         }

         return var1.append(this.IIIOICIRORCCRIICORCROICRRROIIO.getName())
            .append('<')
            .append(
               IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HOHICCCCRRHHHOCHOCCHIHOICOIORR
                  .CRRRICCRROCOHHOHIICIHORCOORRRH(
                     IRIHOIRCHIRRCRIOORCOICORHHORHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        this.ICCOOIRCIOCIRHHRCRIROHOHCIORII, IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OIRIIOIHIRHIIORIHHRICOHHORHCIR
                     )
                  )
            )
            .append('>')
            .toString();
      }

      @Override
      public int hashCode() {
         return (this.RORIIOOIIHCHCCHCOOCHROHIHCRIHR == null ? 0 : this.RORIIOOIIHCHCCHCOOCHROHIHCRIHR.hashCode())
            ^ this.ICCOOIRCIOCIRHHRCRIROHOHCIORII.hashCode()
            ^ this.IIIOICIRORCCRIICORCROICRRROIIO.hashCode();
      }

      @Override
      public boolean equals(Object var1) {
         if (!(var1 instanceof ParameterizedType)) {
            return false;
         }

         ParameterizedType var2 = (ParameterizedType)var1;
         return this.getRawType().equals(var2.getRawType())
            && HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(this.getOwnerType(), var2.getOwnerType())
            && Arrays.equals(this.getActualTypeArguments(), var2.getActualTypeArguments());
      }
   }
}
