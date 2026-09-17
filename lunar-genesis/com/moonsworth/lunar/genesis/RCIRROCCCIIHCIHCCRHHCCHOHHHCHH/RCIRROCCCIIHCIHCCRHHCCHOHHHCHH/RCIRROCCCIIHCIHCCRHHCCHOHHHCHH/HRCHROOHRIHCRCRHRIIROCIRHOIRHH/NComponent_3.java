package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CICOIHIRIIHHCIOICHRHICRIRCIOHC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRIHOIRCHIRRCRIOORCOICORHHORHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<N> {
   public static <N> IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<N> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHHOIIOCRHCHHCRORICCOHOHROOIH<N> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      return new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   public static <N> IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<N> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOHHOIIOCRHCHHCRORICCOHOHROOIH<N> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      if (var0 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            ((OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var0).isDirected(), "Undirected graphs can never be trees."
         );
      }

      if (var0 instanceof IOHIHIIHCCCCCIHRORIOIOORCIOHII) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            ((IOHIHIIHCCCCCIHRORIOIOORCIOHII)var0).isDirected(), "Undirected networks can never be trees."
         );
      }

      return new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(var0);
   }

   public abstract Iterable<N> breadthFirst(N var1);

   public abstract Iterable<N> breadthFirst(Iterable<? extends N> var1);

   public abstract Iterable<N> depthFirstPreOrder(N var1);

   public abstract Iterable<N> depthFirstPreOrder(Iterable<? extends N> var1);

   public abstract Iterable<N> depthFirstPostOrder(N var1);

   public abstract Iterable<N> depthFirstPostOrder(Iterable<? extends N> var1);

   private IIHRHCCOOHOOOOCHRRCOROOIOHCOOO() {
   }

   private static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH<N> extends IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<N> {
      private final IOHHOIIOCRHCHHCRORICCOHOHROOIH<N> HHCCHOIHRHICOOCORRIOIHIHRICIIR;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(IOHHOIIOCRHCHHCRORICCOHOHROOIH<N> var1) {
         this.HHCCHOIHRHICOOCORRIOIHIHRICIIR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public Iterable<N> breadthFirst(N var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.breadthFirst(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((N)var1));
      }

      @Override
      public Iterable<N> breadthFirst(final Iterable<? extends N> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (IRIHOIRCHIRRCRIOORCOICORHHORHH.isEmpty(var1)) {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }

         for (Object var3 : var1) {
            this.checkThatNodeIsInTree((N)var3);
         }

         return new Iterable<N>() {
            @Override
            public Iterator<N> iterator() {
               return HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
            }
         };
      }

      @Override
      public Iterable<N> depthFirstPreOrder(N var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.depthFirstPreOrder(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((N)var1));
      }

      @Override
      public Iterable<N> depthFirstPreOrder(final Iterable<? extends N> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (IRIHOIRCHIRRCRIOORCOICORHHORHH.isEmpty(var1)) {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }

         for (Object var3 : var1) {
            this.checkThatNodeIsInTree((N)var3);
         }

         return new Iterable<N>() {
            @Override
            public Iterator<N> iterator() {
               return HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
            }
         };
      }

      @Override
      public Iterable<N> depthFirstPostOrder(N var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.depthFirstPostOrder(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((N)var1));
      }

      @Override
      public Iterable<N> depthFirstPostOrder(final Iterable<? extends N> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (IRIHOIRCHIRRCRIOORCOICORHHORHH.isEmpty(var1)) {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }

         for (Object var3 : var1) {
            this.checkThatNodeIsInTree((N)var3);
         }

         return new Iterable<N>() {
            @Override
            public Iterator<N> iterator() {
               return HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
            }
         };
      }

      private void checkThatNodeIsInTree(N var1) {
         this.HHCCHOIHRHICOOCORRIOIHIHRICIIR.successors((N)var1);
      }

      private final class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<N> {
         private final Deque<Iterator<? extends N>> OIOOIOIIOICCOICIHIOOCRHIRCOIHI = new ArrayDeque<>();

         HHCCIRHCCCIIRHCROHIORHIRHHIORH(Iterable<? extends N> var2) {
            this.OIOOIOIIOICCOICIHIOOCRHIRCOIHI.addLast(var2.iterator());
         }

         @Override
         public boolean hasNext() {
            return !this.OIOOIOIIOICCOICIHIOOCRHIRCOIHI.isEmpty();
         }

         @Override
         public N next() {
            Iterator var1 = this.OIOOIOIIOICCOICIHIOOCRHIRCOIHI.getLast();
            Object var2 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1.next()
            );
            if (!var1.hasNext()) {
               this.OIOOIOIIOICCOICIHIOOCRHIRCOIHI.removeLast();
            }

            Iterator var3 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.HHCCHOIHRHICOOCORRIOIHIHRICIIR.successors((N)var2).iterator();
            if (var3.hasNext()) {
               this.OIOOIOIIOICCOICIHIOOCRHIRCOIHI.addLast(var3);
            }

            return (N)var2;
         }
      }

      private final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
         extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<N> {
         private final ArrayDeque<IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH<N>.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RHCRRIORRCOCIHIHORHHCIRHCORCOH = new ArrayDeque<>();

         IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterable<? extends N> var2) {
            this.RHCRRIORRCOCIHIHORHHCIRHCORCOH
               .addLast(
                  new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var2)
               );
         }

         @Override
         protected N computeNext() {
            while (!this.RHCRRIORRCOCIHIHORHHCIRHCORCOH.isEmpty()) {
               IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.RHCRRIORRCOCIHIHORHHCIRHCORCOH
                  .getLast();
               if (var1.ICHRHORRCHHRIICRRHORRIHOORCHRC.hasNext()) {
                  Object var2 = var1.ICHRHORRCHHRIICRRHORRIHOORCHRC.next();
                  this.RHCRRIORRCOCIHIHORHHCIRHCORCOH.addLast(this.IIOORRCRHCRIORIOCOHHIROOIIHROC((N)var2));
               } else {
                  this.RHCRRIORRCOCIHIHORHHCIRHCORCOH.removeLast();
                  if (var1.OHICCRIIIHOCCOHIIRROOOHRIHHICC != null) {
                     return var1.OHICCRIIIHOCCOHIIRROOOHRIHHICC;
                  }
               }
            }

            return (N)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }

         IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH<N>.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIOORRCRHCRIORIOCOHHIROOIIHROC(
            N var1
         ) {
            return new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.HHCCHOIHRHICOOCORRIOIHIHRICIIR.successors((N)var1)
            );
         }

         private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
            final @Nullable N OHICCRIIIHOCCOHIIRROOOHRIHHICC;
            final Iterator<? extends N> ICHRHORRCHHRIICRRHORRIHOORCHRC;

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable N var2, Iterable<? extends N> var3) {
               this.OHICCRIIIHOCCOHIIRROOOHRIHHICC = (N)var2;
               this.ICHRHORRCHHRIICRRHORRIHOORCHRC = var3.iterator();
            }
         }
      }

      private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<N> {
         private final Queue<N> OROHOOORROCRCIOOHHCHHHIHORHIHH = new ArrayDeque<>();

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterable<? extends N> var2) {
            for (Object var4 : var2) {
               this.OROHOOORROCRCIOOHHCHHHIHORHIHH.add((N)var4);
            }
         }

         @Override
         public boolean hasNext() {
            return !this.OROHOOORROCRCIOOHHCHHHIHORHIHH.isEmpty();
         }

         @Override
         public N next() {
            Object var1 = this.OROHOOORROCRCIOOHHCHHHIHORHIHH.remove();
            IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(
               this.OROHOOORROCRCIOOHHCHHHIHORHIHH, HHCCIRHCCCIIRHCROHIORHIRHHIORH.this.HHCCHOIHRHICOOCORRIOIHIHRICIIR.successors((N)var1)
            );
            return (N)var1;
         }
      }
   }

   private enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      PREORDER,
      POSTORDER;
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<N> extends IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<N> {
      private final IOHHOIIOCRHCHHCRORICCOHOHROOIH<N> HRRIOCCCOOCHHHOIHOHOOIOIOOCRIC;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOHHOIIOCRHCHHCRORICCOHOHROOIH<N> var1) {
         this.HRRIOCCCOOCHHHOIHOHOOIOIOOCRIC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public Iterable<N> breadthFirst(N var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.breadthFirst(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((N)var1));
      }

      @Override
      public Iterable<N> breadthFirst(final Iterable<? extends N> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (IRIHOIRCHIRRCRIOORCOICORHHORHH.isEmpty(var1)) {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }

         for (Object var3 : var1) {
            this.checkThatNodeIsInGraph((N)var3);
         }

         return new Iterable<N>() {
            @Override
            public Iterator<N> iterator() {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
            }
         };
      }

      @Override
      public Iterable<N> depthFirstPreOrder(N var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.depthFirstPreOrder(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((N)var1));
      }

      @Override
      public Iterable<N> depthFirstPreOrder(final Iterable<? extends N> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (IRIHOIRCHIRRCRIOORCOICORHHORHH.isEmpty(var1)) {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }

         for (Object var3 : var1) {
            this.checkThatNodeIsInGraph((N)var3);
         }

         return new Iterable<N>() {
            @Override
            public Iterator<N> iterator() {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var1, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.PREORDER
               );
            }
         };
      }

      @Override
      public Iterable<N> depthFirstPostOrder(N var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return this.depthFirstPostOrder(CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH((N)var1));
      }

      @Override
      public Iterable<N> depthFirstPostOrder(final Iterable<? extends N> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         if (IRIHOIRCHIRRCRIOORCOICORHHORHH.isEmpty(var1)) {
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         }

         for (Object var3 : var1) {
            this.checkThatNodeIsInGraph((N)var3);
         }

         return new Iterable<N>() {
            @Override
            public Iterator<N> iterator() {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var1, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.POSTORDER
               );
            }
         };
      }

      private void checkThatNodeIsInGraph(N var1) {
         this.HRRIOCCCOOCHHHOIHOHOOIOIOOCRIC.successors((N)var1);
      }

      private final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
         extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<N> {
         private final Deque<IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<N>.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CHORRCROCCRIICHORRRROIOICIROOC = new ArrayDeque<>();
         private final Set<N> RHICRRIOOHHOCROICOCOCIRIRCHIIR = new HashSet<>();
         private final IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH CROOCRCCRRRCRCHRHHOIIICHRCCICR;

         IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterable<? extends N> var2, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3) {
            this.CHORRCROCCRIICHORRRROIOICIROOC
               .push(
                  new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(null, var2)
               );
            this.CROOCRCCRRRCRCHRHHOIIICHRCCICR = var3;
         }

         @Override
         protected N computeNext() {
            while (!this.CHORRCROCCRIICHORRRROIOICIROOC.isEmpty()) {
               IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CHORRCROCCRIICHORRRROIOICIROOC
                  .getFirst();
               boolean var2 = this.RHICRRIOOHHOCROICOCOCIRIRCHIIR.add(var1.ICCOCCCIHCORHRHHOOCIORICHOICRR);
               boolean var3 = !var1.HCIHRHIRHRCORHIOIRCCCRHHIHRROO.hasNext();
               boolean var4 = var2 && this.CROOCRCCRRRCRCHRHHOIIICHRCCICR == IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.PREORDER
                  || var3 && this.CROOCRCCRRRCRCHRHHOIIICHRCCICR == IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.POSTORDER;
               if (var3) {
                  this.CHORRCROCCRIICHORRRROIOICIROOC.pop();
               } else {
                  Object var5 = var1.HCIHRHIRHRCORHIOIRCCCRHHIHRROO.next();
                  if (!this.RHICRRIOOHHOCROICOCOCIRIRCHIIR.contains(var5)) {
                     this.CHORRCROCCRIICHORRRROIOICIROOC.push(this.COCOHIHCICRHOOCHIHCCORHHIRHIOH((N)var5));
                  }
               }

               if (var4 && var1.ICCOCCCIHCORHRHHOOCIORICHOICRR != null) {
                  return var1.ICCOCCCIHCORHRHHOOCIORICHOICRR;
               }
            }

            return (N)this.ROCOROCOICRHOICORCIIRRRROCOHOC();
         }

         IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<N>.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COCOHIHCICRHOOCHIHCCORHHIRHIOH(
            N var1
         ) {
            return new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.HRRIOCCCOOCHHHOIHOHOOIOIOOCRIC.successors((N)var1)
            );
         }

         private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
            final @Nullable N ICCOCCCIHCORHRHHOOCIORICHOICRR;
            final Iterator<? extends N> HCIHRHIRHRCORHIOIRCCCRHHIHRROO;

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable N var2, Iterable<? extends N> var3) {
               this.ICCOCCCIHCORHRHHOOCIORICHOICRR = (N)var2;
               this.HCIHRHIRHRCORHIOIRCCCRHHIHRROO = var3.iterator();
            }
         }
      }

      private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<N> {
         private final Queue<N> OCCRCRIOHHOIRCOCCICCROIICHOCHI = new ArrayDeque<>();
         private final Set<N> CCCCCIRCHROHOCHCRHOOCHHIOHOIHO = new HashSet<>();

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Iterable<? extends N> var2) {
            for (Object var4 : var2) {
               if (this.CCCCCIRCHROHOCHCRHOOCHHIOHOIHO.add((N)var4)) {
                  this.OCCRCRIOHHOIRCOCCICCROIICHOCHI.add((N)var4);
               }
            }
         }

         @Override
         public boolean hasNext() {
            return !this.OCCRCRIOHHOIRCOCCICCROIICHOCHI.isEmpty();
         }

         @Override
         public N next() {
            Object var1 = this.OCCRCRIOHHOIRCOCCICCROIICHOCHI.remove();

            for (Object var3 : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.HRRIOCCCOOCHHHOIHOHOOIOIOOCRIC.successors((N)var1)) {
               if (this.CCCCCIRCHROHOCHCRHOOCHHIOHOIHO.add((N)var3)) {
                  this.OCCRCRIOHHOIRCOCCICCROIICHOCHI.add((N)var3);
               }
            }

            return (N)var1;
         }
      }
   }
}
