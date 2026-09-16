package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROCHRRCORRCOOOOOCOICOCROIIHIHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH OORIRIOIHIOCICOCOOCCHIHOCOOCIO;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
      this.OORIRIOIHIOCICOCOOCCHIHOCOOCIO = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   private HICHRCOHCCRHOHCICOOCHOIHCCHIRI(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OORIRIOIHIOCICOCOOCCHIHOCOOCIO = var1;
   }

   static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Type var0) {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI()
         .RICRIHOOHROHICCHHIIHRHCORHIOHR(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0));
   }

   static HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(Type var0) {
      Type var1 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RHICHOHOCIOOHHRCOHORHIIHCRHIOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0);
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI()
         .RICRIHOOHROHICCHHIIHRHCORHIOHR(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1));
   }

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Type var1, Type var2) {
      HashMap var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMap();
      populateTypeMappings(var3, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1), IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2));
      return this.RICRIHOOHROHICCHHIIHRHCORHIOHR(var3);
   }

   HICHRCOHCCRHOHCICOOCHOIHCCHIRI RICRIHOOHROHICCHHIIHRHCORHIOHR(Map<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, ? extends Type> var1) {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(this.OORIRIOIHIOCICOCOOCCHIHOCOOCIO.RIIHIHHCRHCHRCICHOROHCHIIHCICH(var1));
   }

   private static void populateTypeMappings(final Map<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Type> var0, Type var1, final Type var2) {
      if (!var1.equals(var2)) {
         (new CIOHHCORHRCCRICCCORIHCRHCCCRRR() {
               @Override
               void visitTypeVariable(TypeVariable<?> var1) {
                  var0.put(new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1), var2);
               }

               @Override
               void visitWildcardType(WildcardType var1) {
                  if (var2 instanceof WildcardType) {
                     WildcardType var2x = (WildcardType)var2;
                     Type[] var3 = var1.getUpperBounds();
                     Type[] var4 = var2x.getUpperBounds();
                     Type[] var5 = var1.getLowerBounds();
                     Type[] var6 = var2x.getLowerBounds();
                     IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
                        var3.length == var4.length && var5.length == var6.length, "Incompatible type: %s vs. %s", var1, var2
                     );

                     for (int var7 = 0; var7 < var3.length; var7++) {
                        HICHRCOHCCRHOHCICOOCHOIHCCHIRI.populateTypeMappings(var0, var3[var7], var4[var7]);
                     }

                     for (int var8 = 0; var8 < var5.length; var8++) {
                        HICHRCOHCCRHOHCICOOCHOIHCCHIRI.populateTypeMappings(var0, var5[var8], var6[var8]);
                     }
                  }
               }

               @Override
               void visitParameterizedType(ParameterizedType var1) {
                  if (!(var2 instanceof WildcardType)) {
                     ParameterizedType var2x = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.expectArgument(ParameterizedType.class, var2);
                     if (var1.getOwnerType() != null && var2x.getOwnerType() != null) {
                        HICHRCOHCCRHOHCICOOCHOIHCCHIRI.populateTypeMappings(var0, var1.getOwnerType(), var2x.getOwnerType());
                     }

                     IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1.getRawType().equals(var2x.getRawType()), "Inconsistent raw type: %s vs. %s", var1, var2);
                     Type[] var3 = var1.getActualTypeArguments();
                     Type[] var4 = var2x.getActualTypeArguments();
                     IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var3.length == var4.length, "%s not compatible with %s", var1, var2x);

                     for (int var5 = 0; var5 < var3.length; var5++) {
                        HICHRCOHCCRHOHCICOOCHOIHCCHIRI.populateTypeMappings(var0, var3[var5], var4[var5]);
                     }
                  }
               }

               @Override
               void visitGenericArrayType(GenericArrayType var1) {
                  if (!(var2 instanceof WildcardType)) {
                     Type var2x = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.getComponentType(var2);
                     IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2x != null, "%s is not an array type.", var2);
                     HICHRCOHCCRHOHCICOOCHOIHCCHIRI.populateTypeMappings(var0, var1.getGenericComponentType(), var2x);
                  }
               }

               @Override
               void visitClass(Class<?> var1) {
                  if (!(var2 instanceof WildcardType)) {
                     throw new IllegalArgumentException("No type mapping from " + var1 + " to " + var2);
                  }
               }
            })
            .CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      }
   }

   public Type resolveType(Type var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      if (var1 instanceof TypeVariable) {
         return this.OORIRIOIHIOCICOCOOCCHIHOCOOCIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((TypeVariable<?>)var1);
      } else if (var1 instanceof ParameterizedType) {
         return this.resolveParameterizedType((ParameterizedType)var1);
      } else if (var1 instanceof GenericArrayType) {
         return this.resolveGenericArrayType((GenericArrayType)var1);
      } else {
         return var1 instanceof WildcardType ? this.resolveWildcardType((WildcardType)var1) : var1;
      }
   }

   Type[] resolveTypesInPlace(Type[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.resolveType(var1[var2]);
      }

      return var1;
   }

   private Type[] resolveTypes(Type[] var1) {
      Type[] var2 = new Type[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = this.resolveType(var1[var3]);
      }

      return var2;
   }

   private WildcardType resolveWildcardType(WildcardType var1) {
      Type[] var2 = var1.getLowerBounds();
      Type[] var3 = var1.getUpperBounds();
      return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.resolveTypes(var2), this.resolveTypes(var3));
   }

   private Type resolveGenericArrayType(GenericArrayType var1) {
      Type var2 = var1.getGenericComponentType();
      Type var3 = this.resolveType(var2);
      return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newArrayType(var3);
   }

   private ParameterizedType resolveParameterizedType(ParameterizedType var1) {
      Type var2 = var1.getOwnerType();
      Type var3 = var2 == null ? null : this.resolveType(var2);
      Type var4 = this.resolveType(var1.getRawType());
      Type[] var5 = var1.getActualTypeArguments();
      Type[] var6 = this.resolveTypes(var5);
      return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newParameterizedTypeWithOwner(var3, (Class<?>)var4, var6);
   }

   private static <T> T expectArgument(Class<T> var0, Object var1) {
      try {
         return (T)var0.cast(var1);
      } catch (ClassCastException var3) {
         throw new IllegalArgumentException(var1 + " is not a " + var0.getSimpleName());
      }
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH {
      static final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH RHICHOHOCIOOHHRCOHORHIIHCRHIOC = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH();
      private final AtomicInteger CCOHRCRHIIROICIORRHORHCRHOICOI;

      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
         this(new AtomicInteger());
      }

      private CRRRICCRROCOHHOHIICIHORCOORRRH(AtomicInteger var1) {
         this.CCOHRCRHIIROICIORRHORHCRHOICOI = var1;
      }

      final Type RRCRRCORICCHOHHIRCHIROOHIIOHCO(Type var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         if (var1 instanceof Class) {
            return var1;
         }

         if (var1 instanceof TypeVariable) {
            return var1;
         }

         if (var1 instanceof GenericArrayType) {
            GenericArrayType var8 = (GenericArrayType)var1;
            return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newArrayType(
               this.OHCHCHRICHHOCHIIRRHOIHCCROCOHO().RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8.getGenericComponentType())
            );
         }

         if (!(var1 instanceof ParameterizedType)) {
            if (var1 instanceof WildcardType) {
               WildcardType var7 = (WildcardType)var1;
               Type[] var9 = var7.getLowerBounds();
               return var9.length == 0 ? this.captureAsTypeVariable(var7.getUpperBounds()) : var1;
            } else {
               throw new AssertionError("must have been one of the known types");
            }
         } else {
            ParameterizedType var2 = (ParameterizedType)var1;
            Class var3 = (Class)var2.getRawType();
            TypeVariable[] var4 = var3.getTypeParameters();
            Type[] var5 = var2.getActualTypeArguments();

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4[var6]).RRCRRCORICCHOHHIRCHIROOHIIOHCO(var5[var6]);
            }

            return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newParameterizedTypeWithOwner(
               this.OHCHCHRICHHOCHIIRRHOIHCCROCOHO().captureNullable(var2.getOwnerType()), var3, var5
            );
         }
      }

      TypeVariable<?> captureAsTypeVariable(Type[] var1) {
         String var2 = "capture#"
            + this.CCOHRCRHIIROICIORRHORHCRHOICOI.incrementAndGet()
            + "-of ? extends "
            + IHIRRIIORRHORHRORIHOROIRCORCOO.IIRHCHHOICHRICOOCRORCCIOOIHOIR('&').OCOHORHCROHICRRIHCIHHRRCIHICRI(var1);
         return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newArtificialTypeVariable(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.class, var2, var1);
      }

      private HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH IRCIIHHICIHRCOCRROCOICRIHHCCHH(final TypeVariable<?> var1) {
         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH(this.CCOHRCRHIIROICIORRHORHCRHOICOI) {
            @Override
            TypeVariable<?> captureAsTypeVariable(Type[] var1x) {
               LinkedHashSet var2 = new LinkedHashSet<>(Arrays.asList(var1x));
               var2.addAll(Arrays.asList(var1.getBounds()));
               if (var2.size() > 1) {
                  var2.remove(Object.class);
               }

               return super.captureAsTypeVariable(var2.toArray(new Type[0]));
            }
         };
      }

      private HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH OHCHCHRICHHOCHIIRRHOIHCCROCOHO() {
         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH(this.CCOHRCRHIIROICIORRHORHCRHOICOI);
      }

      private Type captureNullable(@Nullable Type var1) {
         return var1 == null ? null : this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      }
   }

   static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final TypeVariable<?> HCCHHCIRIOCIHHHIRHHRCRHOIRROHO;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(TypeVariable<?> var1) {
         this.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      @Override
      public int hashCode() {
         return HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(
            this.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO.getGenericDeclaration(), this.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO.getName()
         );
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH) {
            HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
            return this.equalsTypeVariable(var2.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO);
         } else {
            return false;
         }
      }

      @Override
      public String toString() {
         return this.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO.toString();
      }

      static HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH CRRRICCRROCOHHOHIICIHORCOORRRH(Type var0) {
         return var0 instanceof TypeVariable ? new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH((TypeVariable<?>)var0) : null;
      }

      boolean equalsType(Type var1) {
         return var1 instanceof TypeVariable ? this.equalsTypeVariable((TypeVariable<?>)var1) : false;
      }

      private boolean equalsTypeVariable(TypeVariable<?> var1) {
         return this.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO.getGenericDeclaration().equals(var1.getGenericDeclaration())
            && this.HCCHHCIRIOCIHHHIRHHRCRHOIRROHO.getName().equals(var1.getName());
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Type> HHHOCCCHOHIIIHHRHCOIHCCHROHIIC;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         this.HHHOCCCHOHIIIHHRHCOIHCCHROHIIC = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR();
      }

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(OOHRIIOOHROIOHCIRIHRHRRICRRHOI<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Type> var1) {
         this.HHHOCCCHOHIIIHHRHCOIHCCHROHIIC = var1;
      }

      final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIIHIHHCRHCHRCICHOROHCHIIHCICH(
         Map<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, ? extends Type> var1
      ) {
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = OOHRIIOOHROIOHCIRIHRHRRICRRHOI.OIRCICCCRCRHORRRCHHORCHRCRRIOH();
         var2.IOHHOIIOCRHCHHCRORICCOHOHROOIH(this.HHHOCCCHOHIIIHHRHCOIHCCHROHIIC);

         for (Entry var4 : var1.entrySet()) {
            HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4.getKey();
            Type var6 = (Type)var4.getValue();
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(!var5.equalsType(var6), "Type variable %s bound to itself", var5);
            var2.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var5, var6);
         }

         return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2.CHRROORCHRCIIRRORRRIORRRRICIRI());
      }

      final Type RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final TypeVariable<?> var1) {
         final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this;
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
            @Override
            public Type RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TypeVariable<?> var1x, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2x) {
               return var1x.getGenericDeclaration().equals(var1.getGenericDeclaration()) ? var1x : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var2x);
            }
         };
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
      }

      Type RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TypeVariable<?> var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         Type var3 = this.HHHOCCCHOHIIIHHRHCOIHCCHROHIIC.get(new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1));
         if (var3 == null) {
            Type[] var4 = var1.getBounds();
            if (var4.length == 0) {
               return var1;
            }

            Type[] var5 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2).resolveTypes(var4);
            return IHHCHHHCRIHOOCOIOOCRIIICIOROIR.CRRRICCRROCOHHOHIICIHORCOORRRH.OHIHHHOOHCRIHHCOHRIRCCRRHRHRII && Arrays.equals(var4, var5)
               ? var1
               : IHHCHHHCRIHOOCOIOOCRIIICIOROIR.newArtificialTypeVariable(var1.getGenericDeclaration(), var1.getName(), var5);
         } else {
            return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2).resolveType(var3);
         }
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CIOHHCORHRCCRICCCORIHCRHCCCRRR {
      private final Map<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Type> IOIIROIHOIIRCOHCCORRORCCIHIROO = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMap();

      static OOHRIIOOHROIOHCIRIHRHRRICRRHOI<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Type> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Type var0) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
         var1.CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
         return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var1.IOIIROIHOIIRCOHCCORRORCCIHIROO);
      }

      @Override
      void visitClass(Class<?> var1) {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.getGenericSuperclass());
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.getGenericInterfaces());
      }

      @Override
      void visitParameterizedType(ParameterizedType var1) {
         Class var2 = (Class)var1.getRawType();
         TypeVariable[] var3 = var2.getTypeParameters();
         Type[] var4 = var1.getActualTypeArguments();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(var3.length == var4.length);

         for (int var5 = 0; var5 < var3.length; var5++) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3[var5]), var4[var5]);
         }

         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2);
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.getOwnerType());
      }

      @Override
      void visitTypeVariable(TypeVariable<?> var1) {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.getBounds());
      }

      @Override
      void visitWildcardType(WildcardType var1) {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1.getUpperBounds());
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, Type var2) {
         if (!this.IOIIROIHOIIRCOHCCORRORCCIHIROO.containsKey(var1)) {
            for (Type var3 = var2;
               var3 != null;
               var3 = this.IOIIROIHOIIRCOHCCORRORCCIHIROO
                  .get(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(var3))
            ) {
               if (var1.equalsType(var3)) {
                  Type var4 = var2;

                  while (var4 != null) {
                     var4 = this.IOIIROIHOIIRCOHCCORRORCCIHIROO
                        .remove(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH(var4));
                  }

                  return;
               }
            }

            this.IOIIROIHOIIRCOHCCORRORCCIHIROO.put(var1, var2);
         }
      }
   }
}
