package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.Immutable;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCROCOHHHICRHIHHOOCIIRRRCCIRR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH;
import org.checkerframework.checker.nullness.qual.Nullable;

@Immutable(containerOf = "N")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> implements Iterable<N> {
   private final N OOROHICCCCOROOHIOHCHCHHORCIHRR;
   private final N HHCRHOICRRHROCHHCOCIORHROIHHRO;

   private CIOHHCORHRCCRICCCORIHCRHCCCRRR(N var1, N var2) {
      this.OOROHICCCCOROOHIOHCHCHHORCIHRR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (N)var1
      );
      this.HHCRHOICRRHROCHHCOCIORHROIHHRO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (N)var2
      );
   }

   public static <N> CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> IHICORCROOROHCIHIHCOIHRRHICICO(N var0, N var1) {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0, var1);
   }

   public static <N> CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HCHRIROHHHCORIOCROOCHRCIOROOCI(N var0, N var1) {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var1, var0);
   }

   static <N> CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<?> var0, N var1, N var2) {
      return var0.isDirected() ? IHICORCROOROHCIHIHCOIHRRHICICO((N)var1, (N)var2) : HCHRIROHHHCORIOCROOCHRCIOROOCI((N)var1, (N)var2);
   }

   static <N> CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHIHIIHCCCCCIHRORIOIOORCIOHII<?, ?> var0, N var1, N var2) {
      return var0.isDirected() ? IHICORCROOROHCIHIHCOIHRRHICICO((N)var1, (N)var2) : HCHRIROHHHCORIOCROOCHRCIOROOCI((N)var1, (N)var2);
   }

   public abstract N source();

   public abstract N target();

   public final N RHICCHICCROOHCCCIRICICRCOIIIOO() {
      return this.OOROHICCCCOROOHIOHCHCHHORCIHRR;
   }

   public final N HORHROCIIOHIICOIHOIOOIICCHHCCO() {
      return this.HHCRHOICRRHROCHHCOCIORHROIHHRO;
   }

   public final N CRIHRCICOICHCHCHIHRHROCCHCCCII(Object var1) {
      if (var1.equals(this.OOROHICCCCOROOHIOHCHCHHORCIHRR)) {
         return this.HHCRHOICRRHROCHHCOCIORHROIHHRO;
      } else if (var1.equals(this.HHCRHOICRRHROCHHCOCIORHROIHHRO)) {
         return this.OOROHICCCCOROOHIOHCHCHHORCIHRR;
      } else {
         throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + var1);
      }
   }

   public abstract boolean isOrdered();

   public final IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<N> COHCHCHRICICOROIIOCORROOHHRCOO() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(this.OOROHICCCCOROOHIOHCHCHHORCIHRR, this.HHCRHOICRRHROCHHCOCIORHROIHHRO);
   }

   @Override
   public abstract boolean equals(@Nullable Object var1);

   @Override
   public abstract int hashCode();

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH<N> extends CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> {
      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(N var1, N var2) {
         super(var1, var2);
      }

      @Override
      public N source() {
         throw new UnsupportedOperationException(
            "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't."
         );
      }

      @Override
      public N target() {
         throw new UnsupportedOperationException(
            "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't."
         );
      }

      @Override
      public boolean isOrdered() {
         return false;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof CIOHHCORHRCCRICCCORIHCRHCCCRRR)) {
            return false;
         } else {
            CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
            if (this.isOrdered() != var2.isOrdered()) {
               return false;
            } else {
               return this.RHICCHICCROOHCCCIRICICRCOIIIOO().equals(var2.RHICCHICCROOHCCCIRICICRCOIIIOO())
                  ? this.HORHROCIIOHIICOIHOIOOIICCHHCCO().equals(var2.HORHROCIIOHIICOIHOIOOIICCHHCCO())
                  : this.RHICCHICCROOHCCCIRICICRCOIIIOO().equals(var2.HORHROCIIOHIICOIHOIOOIICCHHCCO())
                     && this.HORHROCIIOHIICOIHOIOOIICCHHCCO().equals(var2.RHICCHICCROOHCCCIRICICRCOIIIOO());
            }
         }
      }

      @Override
      public int hashCode() {
         return this.RHICCHICCROOHCCCIRICICRCOIIIOO().hashCode() + this.HORHROCIIOHIICOIHOIOOIICCHHCCO().hashCode();
      }

      @Override
      public String toString() {
         return "[" + this.RHICCHICCROOHCCCIRICICRCOIIIOO() + ", " + this.HORHROCIIOHIICOIHOIOOIICCHHCCO() + "]";
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<N> extends CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(N var1, N var2) {
         super(var1, var2);
      }

      @Override
      public N source() {
         return this.RHICCHICCROOHCCCIRICICRCOIIIOO();
      }

      @Override
      public N target() {
         return this.HORHROCIIOHIICOIHOIOOIICCHHCCO();
      }

      @Override
      public boolean isOrdered() {
         return true;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (!(var1 instanceof CIOHHCORHRCCRICCCORIHCRHCCCRRR)) {
            return false;
         }

         CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
         return this.isOrdered() != var2.isOrdered() ? false : this.source().equals(var2.source()) && this.target().equals(var2.target());
      }

      @Override
      public int hashCode() {
         return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.hashCode(
            this.source(), this.target()
         );
      }

      @Override
      public String toString() {
         return "<" + this.source() + " -> " + this.target() + ">";
      }
   }
}
