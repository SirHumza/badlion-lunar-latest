package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CICOIHIRIIHHCIOICHRHICRIRCIOHC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCROCOHHHICRHIHHOOCIIRRRCCIRR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRIHOIRCHIRRCRIOORCOICORHHORHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROCHRRCORRCOOOOOCOICOCROIIHIHH;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public final class IHIRRIIORRHORHRORIHOROIRCORCOO {
   private IHIRRIIORRHORHRORIHOROIRCORCOO() {
   }

   public static <N> boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0) {
      int var1 = var0.edges().size();
      if (var1 == 0) {
         return false;
      }

      if (!var0.isDirected() && var1 >= var0.nodes().size()) {
         return true;
      }

      HashMap var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMapWithExpectedSize(var0.nodes().size());

      for (Object var4 : var0.nodes()) {
         if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2, var4, null)) {
            return true;
         }
      }

      return false;
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOHIHIIHCCCCCIHRORIOIOORCIOHII<?, ?> var0) {
      return !var0.isDirected() && var0.allowsParallelEdges() && var0.edges().size() > var0.CRCOCCRIOIHIRRROHCCRIRIICOICCO().edges().size()
         ? true
         : IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.CRCOCCRIOIHIRRROHCCRIRIICOICCO());
   }

   private static <N> boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0, Map<Object, IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1, N var2, @Nullable N var3
   ) {
      IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get(var2);
      if (var4 == IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.COMPLETE) {
         return false;
      }

      if (var4 == IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PENDING) {
         return true;
      }

      var1.put(var2, IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PENDING);

      for (Object var6 : var0.successors(var2)) {
         if (IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var6, var3) && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var6, var2)) {
            return true;
         }
      }

      var1.put(var2, IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.COMPLETE);
      return false;
   }

   private static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<?> var0, Object var1, @Nullable Object var2) {
      return var0.isDirected()
         || !com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var2, var1
         );
   }

   public static <N> IRRCCOICORICIHCHRHIHIHROIRHOCR<N> HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var1 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0)
         .ICIOCCCCCCHRRHIRHOORHROOIROHOR(true)
         .RCOHIORCCIOHCRIORCOCHOCHHIHOHH();
      if (var0.isDirected()) {
         for (Object var3 : var0.nodes()) {
            for (Object var5 : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3)) {
               var1.putEdge(var3, var5);
            }
         }
      } else {
         HashSet var11 = new HashSet();

         for (Object var13 : var0.nodes()) {
            if (!var11.contains(var13)) {
               Set var14 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var13);
               var11.addAll(var14);
               int var6 = 1;

               for (Object var8 : var14) {
                  for (Object var10 : IRIHOIRCHIRRCRIOORCOICORHHORHH.limit(var14, var6++)) {
                     var1.putEdge(var8, var10);
                  }
               }
            }
         }
      }

      return var1;
   }

   public static <N> Set<N> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0, N var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0.nodes().contains(var1), "Node %s is not an element of this graph.", var1
      );
      return CICOIHIRIIHHCIOICHRHICRIRCIOHC.IOHIHIIHCCCCCIHRORIOIOORCIOHII(
         IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0).breadthFirst((N)var1)
      );
   }

   public static <N> IRRCCOICORICIHCHRHIHIHROIRHOCR<N> CRRRICCRROCOHHOHIICIHORCOORRRH(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0) {
      if (!var0.isDirected()) {
         return var0;
      } else {
         return var0 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH
            ? ((IHIRRIIORRHORHRORIHOROIRCORCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var0).RRHOOCOOCIIHRICOHHRCOICRCORHRO
            : new IHIRRIIORRHORHRORIHOROIRCORCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var0);
      }
   }

   public static <N, V> RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> var0) {
      if (!var0.isDirected()) {
         return var0;
      } else {
         return var0 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO.CRRRICCRROCOHHOHIICIHORCOORRRH
            ? ((IHIRRIIORRHORHRORIHOROIRCORCOO.CRRRICCRROCOHHOHIICIHORCOORRRH)var0).CICOCIHHIHHIRIIOOOCCCRCIHCHCCR
            : new IHIRRIIORRHORHRORIHOROIRCORCOO.CRRRICCRROCOHHOHIICIHORCOORRRH<>(var0);
      }
   }

   public static <N, E> IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> HHCCIRHCCCIIRHCROHIORHIRHHIORH(IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> var0) {
      if (!var0.isDirected()) {
         return var0;
      } else {
         return var0 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH
            ? ((IHIRRIIORRHORHRORIHOROIRCORCOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var0).IORHHOICIICIIOIHOCRIRORRHOCCCO
            : new IHIRRIIORRHORHRORIHOROIRCORCOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(var0);
      }
   }

   static <N> CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var0) {
      return var0.isOrdered() ? CIOHHCORHRCCRICCCORIHCRHCCCRRR.IHICORCROOROHCIHIHCOIHRRHICICO((N)var0.target(), (N)var0.source()) : var0;
   }

   public static <N> RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<N> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0, Iterable<? extends N> var1) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var2 = var1 instanceof Collection
         ? RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0)
            .CRIHHIRCHOOCIIRRRRCCRCCCRCOIHI(((Collection)var1).size())
            .RCOHIORCCIOHCRIORCOCHOCHHIHOHH()
         : RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0).RCOHIORCCIOHCRIORCOCHOCHHIHOHH();

      for (Object var4 : var1) {
         var2.addNode(var4);
      }

      for (Object var8 : var2.nodes()) {
         for (Object var6 : var0.successors(var8)) {
            if (var2.nodes().contains(var6)) {
               var2.putEdge(var8, var6);
            }
         }
      }

      return var2;
   }

   public static <N, V> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<N, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> var0, Iterable<? extends N> var1
   ) {
      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var2 = var1 instanceof Collection
         ? IIOIROIHIHHCCRICRCOOCHIICHRCOI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0)
            .OHCICOOIHRRRHHRHCOICICCROHCIII(((Collection)var1).size())
            .CIOHOCHCRHRHICRRROIIHRIROOIRHR()
         : IIOIROIHIHHCCRICRCOOCHIICHRCOI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0).CIOHOCHCRHRHICRRROIIHRIROOIRHR();

      for (Object var4 : var1) {
         var2.addNode(var4);
      }

      for (Object var8 : var2.nodes()) {
         for (Object var6 : var0.successors(var8)) {
            if (var2.nodes().contains(var6)) {
               var2.putEdgeValue(var8, var6, var0.edgeValueOrDefault(var8, var6, null));
            }
         }
      }

      return var2;
   }

   public static <N, E> OIHCOHRCICCCRHRCROOCIOIRRHHHIH<N, E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> var0, Iterable<? extends N> var1
   ) {
      OIHCOHRCICCCRHRCROOCIOIRRHHHIH var2 = var1 instanceof Collection
         ? RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0)
            .CROIROCHRIRRICHRORIIHCORCCIICC(((Collection)var1).size())
            .RCROIIIRIHCICRROOROROCICOCRRRR()
         : RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0).RCROIIIRIHCICRROOROROCICOCRRRR();

      for (Object var4 : var1) {
         var2.addNode(var4);
      }

      for (Object var9 : var2.nodes()) {
         for (Object var6 : var0.outEdges(var9)) {
            Object var7 = var0.HIRIHCORIRIORCCHCOORIHIOIICOIH(var6).CRIHRCICOICHCHCHIHRHROCCHCCCII(var9);
            if (var2.nodes().contains(var7)) {
               var2.addEdge(var9, var7, var6);
            }
         }
      }

      return var2;
   }

   public static <N> RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<N> RRCRRCORICCHOHHIRCHIROOHIIOHCO(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var0) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var1 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0)
         .CRIHHIRCHOOCIIRRRRCCRCCCRCOIHI(var0.nodes().size())
         .RCOHIORCCIOHCRIORCOCHOCHHIHOHH();

      for (Object var3 : var0.nodes()) {
         var1.addNode(var3);
      }

      for (CIOHHCORHRCCRICCCORIHCRHCCCRRR var5 : var0.edges()) {
         var1.putEdge(var5.RHICCHICCROOHCCCIRICICRCOIIIOO(), var5.HORHROCIIOHIICOIHOIOOIICCHHCCO());
      }

      return var1;
   }

   public static <N, V> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<N, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> var0) {
      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var1 = IIOIROIHIHHCCRICRCOOCHIICHRCOI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0)
         .OHCICOOIHRRRHHRHCOICICCROHCIII(var0.nodes().size())
         .CIOHOCHCRHRHICRRROIIHRIROOIRHR();

      for (Object var3 : var0.nodes()) {
         var1.addNode(var3);
      }

      for (CIOHHCORHRCCRICCCORIHCRHCCCRRR var5 : var0.edges()) {
         var1.putEdgeValue(
            var5.RHICCHICCROOHCCCIRICICRCOIIIOO(),
            var5.HORHROCIIOHIICOIHOIOOIICCHHCCO(),
            var0.edgeValueOrDefault(var5.RHICCHICCROOHCCCIRICICRCOIIIOO(), var5.HORHROCIIOHIICOIHOIOOIICCHHCCO(), null)
         );
      }

      return var1;
   }

   public static <N, E> OIHCOHRCICCCRHRCROOCIOIRRHHHIH<N, E> CRRRICCRROCOHHOHIICIHORCOORRRH(IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> var0) {
      OIHCOHRCICCCRHRCROOCIOIRRHHHIH var1 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0)
         .CROIROCHRIRRICHRORIIHCORCCIICC(var0.nodes().size())
         .RHHICROROCCOOOIRHCRCIHRHHOIHCR(var0.edges().size())
         .RCROIIIRIHCICRROOROROCICOCRRRR();

      for (Object var3 : var0.nodes()) {
         var1.addNode(var3);
      }

      for (Object var6 : var0.edges()) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var4 = var0.HIRIHCORIRIORCCHCOORIHIOIICOIH(var6);
         var1.addEdge(var4.RHICCHICCROOHCCCIRICICRCOIIIOO(), var4.HORHROCIIOHIICOIHOIOOIICCHHCCO(), var6);
      }

      return var1;
   }

   @CanIgnoreReturnValue
   static int checkNonNegative(int var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0 >= 0, "Not true that %s is non-negative.", var0
      );
      return var0;
   }

   @CanIgnoreReturnValue
   static long checkNonNegative(long var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0 >= 0L, "Not true that %s is non-negative.", var0
      );
      return var0;
   }

   @CanIgnoreReturnValue
   static int checkPositive(int var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0 > 0, "Not true that %s is positive.", var0
      );
      return var0;
   }

   @CanIgnoreReturnValue
   static long checkPositive(long var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0 > 0L, "Not true that %s is positive.", var0
      );
      return var0;
   }

   private static class CRRRICCRROCOHHOHIICIHORCOORRRH<N, V> extends RHOCHHIRRCHHHOHOIRROIROHHHIHIO<N, V> {
      private final RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> CICOCIHHIHHIRIIOOOCCCRCIHCHCCR;

      CRRRICCRROCOHHOHIICIHORCOORRRH(RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> var1) {
         this.CICOCIHHIHHIRIIOOOCCCRCIHCHCCR = var1;
      }

      @Override
      protected RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<N, V> HHCCCCCHIHOOOICCHRRRIHIOICHIRH() {
         return this.CICOCIHHIHHIRIIOOOCCCRCIHCHCCR;
      }

      @Override
      public Set<N> predecessors(N var1) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().successors((N)var1);
      }

      @Override
      public Set<N> successors(N var1) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().predecessors((N)var1);
      }

      @Override
      public int inDegree(N var1) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().outDegree((N)var1);
      }

      @Override
      public int outDegree(N var1) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().inDegree((N)var1);
      }

      @Override
      public boolean hasEdgeConnecting(N var1, N var2) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().hasEdgeConnecting((N)var2, (N)var1);
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }

      @Override
      public Optional<V> edgeValue(N var1, N var2) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().edgeValue((N)var2, (N)var1);
      }

      @Override
      public Optional<V> CORCOCICIRIOHROHROIIOOHICCHCRR(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().CORCOCICIRIOHROHROIIOOHICCHCRR(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }

      @Override
      public @Nullable V edgeValueOrDefault(N var1, N var2, @Nullable V var3) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH().edgeValueOrDefault((N)var2, (N)var1, (V)var3);
      }

      @Override
      public @Nullable V RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1, @Nullable V var2) {
         return this.HHCCCCCHIHOOOICCHRRRIHIOICHIRH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1), (V)var2);
      }
   }

   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<N, E> extends OHHRIOHROOIHOROCIRHCHORIHRRRRI<N, E> {
      private final IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> IORHHOICIICIIOIHOCRIRORRHOCCCO;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> var1) {
         this.IORHHOICIICIIOIHOCRIRORRHOCCCO = var1;
      }

      @Override
      protected IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> COHRCHRIOOHICOCRCCHHOOIICRRIRR() {
         return this.IORHHOICIICIIOIHOCRIRORRHOCCCO;
      }

      @Override
      public Set<N> predecessors(N var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().successors((N)var1);
      }

      @Override
      public Set<N> successors(N var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().predecessors((N)var1);
      }

      @Override
      public int inDegree(N var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().outDegree((N)var1);
      }

      @Override
      public int outDegree(N var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().inDegree((N)var1);
      }

      @Override
      public Set<E> inEdges(N var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().outEdges((N)var1);
      }

      @Override
      public Set<E> outEdges(N var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().inEdges((N)var1);
      }

      @Override
      public CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HIRIHCORIRIORCCHCOORIHIOIICOIH(E var1) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().HIRIHCORIRIORCCHCOORIHIOIICOIH((E)var1);
         return CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.IORHHOICIICIIOIHOCRIRORRHOCCCO, (N)var2.HORHROCIIOHIICOIHOIOOIICCHHCCO(), (N)var2.RHICCHICCROOHCCCIRICICRCOIIIOO()
         );
      }

      @Override
      public Set<E> edgesConnecting(N var1, N var2) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().edgesConnecting((N)var2, (N)var1);
      }

      @Override
      public Set<E> CRRRICCRROCOHHOHIICIHORCOORRRH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().CRRRICCRROCOHHOHIICIHORCOORRRH(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }

      @Override
      public Optional<E> edgeConnecting(N var1, N var2) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().edgeConnecting((N)var2, (N)var1);
      }

      @Override
      public Optional<E> RRCRRCORICCHOHHIRCHIROOHIIOHCO(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().RRCRRCORICCHOHHIRCHIROOHIIOHCO(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }

      @Override
      public E edgeConnectingOrNull(N var1, N var2) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().edgeConnectingOrNull((N)var2, (N)var1);
      }

      @Override
      public E RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }

      @Override
      public boolean hasEdgeConnecting(N var1, N var2) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().hasEdgeConnecting((N)var2, (N)var1);
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.COHRCHRIOOHICOCRCCHHOOIICRRIRR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<N> extends IIRHCHHOICHRICOOCRORCCIOOIHOIR<N> {
      private final IRRCCOICORICIHCHRHIHIHROIRHOCR<N> RRHOOCOOCIIHRICOHHRCOICRCORHRO;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRRCCOICORICIHCHRHIHIHROIRHOCR<N> var1) {
         this.RRHOOCOOCIIHRICOHHRCOICRCORHRO = var1;
      }

      protected IRRCCOICORICIHCHRHIHIHROIRHOCR<N> IRHCRRHHHCRHHROHHICCCCOCIHIHOO() {
         return this.RRHOOCOOCIIHRICOHHRCOICRCORHRO;
      }

      @Override
      public Set<N> predecessors(N var1) {
         return this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().successors((N)var1);
      }

      @Override
      public Set<N> successors(N var1) {
         return this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().predecessors((N)var1);
      }

      @Override
      public Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> incidentEdges(N var1) {
         return new RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<N>(this, var1) {
            @Override
            public Iterator<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> iterator() {
               return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().incidentEdges(this.ROIRIHRHCIHICOHRRIHICHCIOHICHI).iterator(),
                  new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>, CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>>(
                     
                  ) {
                     public CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> IIHRRHORCRCROCHHOHORCHCROCIHRO(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
                        return CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO(),
                           (N)var1.HORHROCIIOHIICOIHOIOOIICCHHCCO(),
                           (N)var1.RHICCHICCROOHCCCIRICICRCOIIIOO()
                        );
                     }
                  }
               );
            }
         };
      }

      @Override
      public int inDegree(N var1) {
         return this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().outDegree((N)var1);
      }

      @Override
      public int outDegree(N var1) {
         return this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().inDegree((N)var1);
      }

      @Override
      public boolean hasEdgeConnecting(N var1, N var2) {
         return this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().hasEdgeConnecting((N)var2, (N)var1);
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
         return this.IRHCRRHHHCRHHROHHICCCCOCIHIHOO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1));
      }
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      PENDING,
      COMPLETE;
   }
}
