package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public class IHIRRIIORRHORHRORIHOROIRCORCOO {
   private final String IIHCIICCOHICRRHIHOOIHIORIIIRRH;

   public static IHIRRIIORRHORHRORIHOROIRCORCOO COOOROIICHHICCCHCCIOIRRRRIIORO(String var0) {
      return new IHIRRIIORRHORHRORIHOROIRCORCOO(var0);
   }

   public static IHIRRIIORRHORHRORIHOROIRCORCOO IIRHCHHOICHRICOOCRORCCIOOIHOIR(char var0) {
      return new IHIRRIIORRHORHRORIHOROIRCORCOO(String.valueOf(var0));
   }

   private IHIRRIIORRHORHRORIHOROIRCORCOO(String var1) {
      this.IIHCIICCOHICRRHIHOOIHIORIIIRRH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
   }

   private IHIRRIIORRHORHRORIHOROIRCORCOO(IHIRRIIORRHORHRORIHOROIRCORCOO var1) {
      this.IIHCIICCOHICRRHIHOOIHIORIIIRRH = var1.IIHCIICCOHICRRHIHOOIHIORIIIRRH;
   }

   @CanIgnoreReturnValue
   public <A extends Appendable> A appendTo(A var1, Iterable<?> var2) {
      return this.appendTo((A)var1, var2.iterator());
   }

   @CanIgnoreReturnValue
   public <A extends Appendable> A appendTo(A var1, Iterator<?> var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      if (var2.hasNext()) {
         var1.append(this.toString(var2.next()));

         while (var2.hasNext()) {
            var1.append(this.IIHCIICCOHICRRHIHOOIHIORIIIRRH);
            var1.append(this.toString(var2.next()));
         }
      }

      return (A)var1;
   }

   @CanIgnoreReturnValue
   public final <A extends Appendable> A RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(A var1, Object[] var2) {
      return this.appendTo((A)var1, Arrays.asList(var2));
   }

   @CanIgnoreReturnValue
   public final <A extends Appendable> A RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(A var1, @Nullable Object var2, @Nullable Object var3, Object... var4) {
      return this.appendTo((A)var1, iterable(var2, var3, var4));
   }

   @CanIgnoreReturnValue
   public final StringBuilder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuilder var1, Iterable<?> var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2.iterator());
   }

   @CanIgnoreReturnValue
   public final StringBuilder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuilder var1, Iterator<?> var2) {
      try {
         this.appendTo(var1, var2);
         return var1;
      } catch (IOException var4) {
         throw new AssertionError(var4);
      }
   }

   @CanIgnoreReturnValue
   public final StringBuilder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuilder var1, Object[] var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, Arrays.asList(var2));
   }

   @CanIgnoreReturnValue
   public final StringBuilder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuilder var1, @Nullable Object var2, @Nullable Object var3, Object... var4) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, iterable(var2, var3, var4));
   }

   public final String CRRRICCRROCOHHOHIICIHORCOORRRH(Iterable<?> var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.iterator());
   }

   public final String IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterator<?> var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new StringBuilder(), var1).toString();
   }

   public final String OCOHORHCROHICRRIHCIHHRRCIHICRI(Object[] var1) {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(Arrays.asList(var1));
   }

   public final String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable Object var1, @Nullable Object var2, Object... var3) {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(iterable(var1, var2, var3));
   }

   public IHIRRIIORRHORHRORIHOROIRCORCOO CIHOHCROHHHORHHCHRORHHCHRHOOCH(final String var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return new IHIRRIIORRHORHRORIHOROIRCORCOO(this) {
         @Override
         CharSequence toString(@Nullable Object var1x) {
            return var1x == null ? var1 : IHIRRIIORRHORHRORIHOROIRCORCOO.this.toString(var1x);
         }

         @Override
         public IHIRRIIORRHORHRORIHOROIRCORCOO CIHOHCROHHHORHHCHRORHHCHRHOOCH(String var1x) {
            throw new UnsupportedOperationException("already specified useForNull");
         }

         @Override
         public IHIRRIIORRHORHRORIHOROIRCORCOO CCHCOHCOIRIOORIRHOHRRCRHCCRIRO() {
            throw new UnsupportedOperationException("already specified useForNull");
         }
      };
   }

   public IHIRRIIORRHORHRORIHOROIRCORCOO CCHCOHCOIRIOORIRHOHRRCRHCCRIRO() {
      return new IHIRRIIORRHORHRORIHOROIRCORCOO(this) {
         @Override
         public <A extends Appendable> A appendTo(A var1, Iterator<?> var2) {
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "appendable");
            IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2, "parts");

            while (var2.hasNext()) {
               Object var3 = var2.next();
               if (var3 != null) {
                  var1.append(IHIRRIIORRHORHRORIHOROIRCORCOO.this.toString(var3));
                  break;
               }
            }

            while (var2.hasNext()) {
               Object var4 = var2.next();
               if (var4 != null) {
                  var1.append(IHIRRIIORRHORHRORIHOROIRCORCOO.this.IIHCIICCOHICRRHIHOOIHIORIIIRRH);
                  var1.append(IHIRRIIORRHORHRORIHOROIRCORCOO.this.toString(var4));
               }
            }

            return (A)var1;
         }

         @Override
         public IHIRRIIORRHORHRORIHOROIRCORCOO CIHOHCROHHHORHHCHRORHHCHRHOOCH(String var1) {
            throw new UnsupportedOperationException("already specified skipNulls");
         }

         @Override
         public IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHRORHRHOOCCHHCCCOROHHORRIRHRO(String var1) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
         }
      };
   }

   public IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHHRIOHROOIHOROCIRHCHORIHRRRRI(char var1) {
      return this.CHRORHRHOOCCHHCCCOROHHORRIRHRO(String.valueOf(var1));
   }

   public IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHRORHRHOOCCHHCCCOROHHORRIRHRO(String var1) {
      return new IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   CharSequence toString(Object var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return var1 instanceof CharSequence ? (CharSequence)var1 : var1.toString();
   }

   private static Iterable<Object> iterable(final Object var0, final Object var1, final Object[] var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      return new AbstractList<Object>() {
         @Override
         public int size() {
            return var2.length + 2;
         }

         @Override
         public Object get(int var1x) {
            switch (var1x) {
               case 0:
                  return var0;
               case 1:
                  return var1;
               default:
                  return var2[var1x - 2];
            }
         }
      };
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final IHIRRIIORRHORHRORIHOROIRCORCOO RIOCICHHHHOIHRCRIHIHIOOCHCCHCH;
      private final String HRRRRHRRHHHCHOOORRHICHCICCIOOO;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO var1, String var2) {
         this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH = var1;
         this.HRRRRHRRHHHCHOOORRHICHCICCIOOO = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      }

      @CanIgnoreReturnValue
      public <A extends Appendable> A appendTo(A var1, Map<?, ?> var2) {
         return this.appendTo((A)var1, var2.entrySet());
      }

      @CanIgnoreReturnValue
      public StringBuilder appendTo(StringBuilder var1, Map<?, ?> var2) {
         return this.appendTo(var1, var2.entrySet());
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      @CanIgnoreReturnValue
      public <A extends Appendable> A appendTo(A var1, Iterable<? extends Entry<?, ?>> var2) {
         return this.appendTo((A)var1, var2.iterator());
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      @CanIgnoreReturnValue
      public <A extends Appendable> A appendTo(A var1, Iterator<? extends Entry<?, ?>> var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         if (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            var1.append(this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH.toString(var3.getKey()));
            var1.append(this.HRRRRHRRHHHCHOOORRHICHCICCIOOO);
            var1.append(this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH.toString(var3.getValue()));

            while (var2.hasNext()) {
               var1.append(this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH.IIHCIICCOHICRRHIHOOIHIORIIIRRH);
               Entry var4 = (Entry)var2.next();
               var1.append(this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH.toString(var4.getKey()));
               var1.append(this.HRRRRHRRHHHCHOOORRHICHCICCIOOO);
               var1.append(this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH.toString(var4.getValue()));
            }
         }

         return (A)var1;
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      @CanIgnoreReturnValue
      public StringBuilder appendTo(StringBuilder var1, Iterable<? extends Entry<?, ?>> var2) {
         return this.appendTo(var1, var2.iterator());
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      @CanIgnoreReturnValue
      public StringBuilder appendTo(StringBuilder var1, Iterator<? extends Entry<?, ?>> var2) {
         try {
            this.appendTo((StringBuilder)var1, var2);
            return var1;
         } catch (IOException var4) {
            throw new AssertionError(var4);
         }
      }

      public String join(Map<?, ?> var1) {
         return this.join(var1.entrySet());
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public String join(Iterable<? extends Entry<?, ?>> var1) {
         return this.join(var1.iterator());
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      public String join(Iterator<? extends Entry<?, ?>> var1) {
         return this.appendTo(new StringBuilder(), var1).toString();
      }

      public IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCIHRIOOOHIORICIRRRRIHCOCIHIRC(String var1) {
         return new IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.RIOCICHHHHOIHRCRIHIHIOOCHCCHCH.CIHOHCROHHHORHHCHRORHHCHRHOOCH(var1), this.HRRRRHRRHHHCHOOORRHICHCICCIOOO
         );
      }
   }
}
