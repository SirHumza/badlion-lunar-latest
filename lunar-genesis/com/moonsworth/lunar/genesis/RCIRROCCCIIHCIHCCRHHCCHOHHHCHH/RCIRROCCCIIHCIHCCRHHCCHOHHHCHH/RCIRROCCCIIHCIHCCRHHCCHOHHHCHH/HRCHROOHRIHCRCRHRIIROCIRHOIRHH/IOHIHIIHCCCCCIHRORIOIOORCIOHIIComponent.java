package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CICOIHIRIIHHCIOICHRHICRIRCIOHC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCROCOHHHICRHIHHOOCIIRRRCCIRR;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ICRHCCCCOIICOCHHCRCOOIHICROIHI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROCHRRCORRCOOOOOCOICOCROIIHIHH;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO<N, E> implements IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> {
   @Override
   public IRRCCOICORICIHCHRHIHIHROIRHOCR<N> CRCOCCRIOIHIRRROHCCRIRIICOICCO() {
      return new HHCCIRHCCCIIRHCROHIORHIRHHIORH<N>() {
         @Override
         public Set<N> nodes() {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.nodes();
         }

         @Override
         public Set<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> edges() {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.allowsParallelEdges()
               ? super.edges()
               : new AbstractSet<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>>() {
                  @Override
                  public Iterator<CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> iterator() {
                     return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.edges().iterator(),
                        new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<E, CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>>(
                           
                        ) {
                           public CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HIOHICORCIOOHORHORIHHRIOCRCCRR(E var1) {
                              return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.HIRIHCORIRIORCCHCOORIHIOIICOIH(var1);
                           }
                        }
                     );
                  }

                  @Override
                  public int size() {
                     return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.edges().size();
                  }

                  @Override
                  public boolean contains(@Nullable Object var1) {
                     if (!(var1 instanceof CIOHHCORHRCCRICCCORIHCRHCCCRRR)) {
                        return false;
                     }

                     CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
                     return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2)
                        && nodes().contains(var2.RHICCHICCROOHCCCIRICICRCOIIIOO())
                        && successors((N)var2.RHICCHICCROOHCCCIRICICRCOIIIOO()).contains(var2.HORHROCIIOHIICOIHOIOOIICCHHCCO());
                  }
               };
         }

         @Override
         public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RIHHOCIHIOCCRRCRRRICCOROCCRHHC() {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.RIHHOCIHIOCCRRCRRRICCOROCCRHHC();
         }

         @Override
         public OCOHORHCROHICRRIHCIHHRRCIHICRI<N> RHHOOIICORCROOHHHRIOIIHRCORRHO() {
            return OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIIIRCHRRCIRIHRCHCIOCHRCRIOOO();
         }

         @Override
         public boolean isDirected() {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.isDirected();
         }

         @Override
         public boolean allowsSelfLoops() {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.allowsSelfLoops();
         }

         @Override
         public Set<N> adjacentNodes(N var1) {
            return (Set<N>)RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.adjacentNodes(var1);
         }

         @Override
         public Set<N> predecessors(N var1) {
            return (Set<N>)RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.predecessors(var1);
         }

         @Override
         public Set<N> successors(N var1) {
            return (Set<N>)RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.successors(var1);
         }
      };
   }

   @Override
   public int degree(N var1) {
      return this.isDirected()
         ? com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedAdd(
            this.inEdges((N)var1).size(), this.outEdges((N)var1).size()
         )
         : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH.saturatedAdd(
            this.incidentEdges((N)var1).size(), this.edgesConnecting((N)var1, (N)var1).size()
         );
   }

   @Override
   public int inDegree(N var1) {
      return this.isDirected() ? this.inEdges((N)var1).size() : this.degree((N)var1);
   }

   @Override
   public int outDegree(N var1) {
      return this.isDirected() ? this.outEdges((N)var1).size() : this.degree((N)var1);
   }

   @Override
   public Set<E> adjacentEdges(E var1) {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = this.HIRIHCORIRIORCCHCOORIHIOIICOIH((E)var1);
      ICRHCCCCOIICOCHHCRCOOIHICROIHI.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = ICRHCCCCOIICOCHHCRCOOIHICROIHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         this.incidentEdges((N)var2.RHICCHICCROOHCCCIRICICRCOIIIOO()), this.incidentEdges((N)var2.HORHROCIIOHIICOIHOIOOIICCHHCCO())
      );
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH(var1));
   }

   @Override
   public Set<E> edgesConnecting(N var1, N var2) {
      Set var3 = this.outEdges((N)var1);
      Set var4 = this.inEdges((N)var2);
      return var3.size() <= var4.size()
         ? Collections.unmodifiableSet(
            ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH((N)var1, (N)var2))
         )
         : Collections.unmodifiableSet(
            ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH((N)var2, (N)var1))
         );
   }

   @Override
   public Set<E> CRRRICCRROCOHHOHIICIHORCOORRRH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      return this.edgesConnecting((N)var1.RHICCHICCROOHCCCIRICICRCOIIIOO(), (N)var1.HORHROCIIOHIICOIHOIOOIICCHHCCO());
   }

   private com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<E> OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
      final N var1, final N var2
   ) {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<E>(
         
      ) {
         @Override
         public boolean apply(E var1x) {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.HIRIHCORIRIORCCHCOORIHIOIICOIH(var1x).CRIHRCICOICHCHCHIHRHROCCHCCCII(var1).equals(var2);
         }
      };
   }

   @Override
   public Optional<E> edgeConnecting(N var1, N var2) {
      return Optional.ofNullable(this.edgeConnectingOrNull((N)var1, (N)var2));
   }

   @Override
   public Optional<E> RRCRRCORICCHOHHIRCHIROOHIIOHCO(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      return this.edgeConnecting((N)var1.RHICCHICCROOHCCCIRICICRCOIIIOO(), (N)var1.HORHROCIIOHIICOIHOIOOIICCHHCCO());
   }

   @Override
   public @Nullable E edgeConnectingOrNull(N var1, N var2) {
      Set var3 = this.edgesConnecting((N)var1, (N)var2);
      switch (var3.size()) {
         case 0:
            return null;
         case 1:
            return (E)var3.iterator().next();
         default:
            throw new IllegalArgumentException(
               String.format(
                  "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", var1, var2
               )
            );
      }
   }

   @Override
   public @Nullable E RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      return this.edgeConnectingOrNull((N)var1.RHICCHICCROOHCCCIRICICRCOIIIOO(), (N)var1.HORHROCIIOHIICOIHOIOOIICCHHCCO());
   }

   @Override
   public boolean hasEdgeConnecting(N var1, N var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      return this.nodes().contains(var1) && this.successors((N)var1).contains(var2);
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return !this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1)
         ? false
         : this.hasEdgeConnecting((N)var1.RHICCHICCROOHCCCIRICICRCOIIIOO(), (N)var1.HORHROCIIOHIICOIHOIOOIICCHHCCO());
   }

   protected final void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1), "Mismatch: unordered endpoints cannot be used with directed graphs"
      );
   }

   protected final boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(CIOHHCORHRCCRICCCORIHCRHCCCRRR<?> var1) {
      return var1.isOrdered() || !this.isDirected();
   }

   @Override
   public final boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof IOHIHIIHCCCCCIHRORIOIOORCIOHII)) {
         return false;
      }

      IOHIHIIHCCCCCIHRORIOIOORCIOHII var2 = (IOHIHIIHCCCCCIHRORIOIOORCIOHII)var1;
      return this.isDirected() == var2.isDirected()
         && this.nodes().equals(var2.nodes())
         && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this).equals(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2));
   }

   @Override
   public final int hashCode() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this).hashCode();
   }

   @Override
   public String toString() {
      return "isDirected: "
         + this.isDirected()
         + ", allowsParallelEdges: "
         + this.allowsParallelEdges()
         + ", allowsSelfLoops: "
         + this.allowsSelfLoops()
         + ", nodes: "
         + this.nodes()
         + ", edges: "
         + RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   private static <N, E> Map<E, CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final IOHIHIIHCCCCCIHRORIOIOORCIOHII<N, E> var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR var1 = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<E, CIOHHCORHRCCRICCCORIHCRHCCCRRR<N>>(
         
      ) {
         public CIOHHCORHRCCRICCCORIHCRHCCCRRR<N> HIOHICORCIOOHORHORIHHRIOCRCCRR(E var1) {
            return var0.HIRIHCORIRIORCCHCOORIHIOIICOIH(var1);
         }
      };
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.edges(), var1);
   }
}
