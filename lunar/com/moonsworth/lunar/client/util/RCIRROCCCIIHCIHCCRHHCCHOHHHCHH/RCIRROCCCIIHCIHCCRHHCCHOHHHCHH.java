package com.moonsworth.lunar.client.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
   ExecutorService IIRRRHIOIHROHIICROHCOCHIOHCOCI = Executors.newFixedThreadPool(
      ROOOCRHIIIRCOIIHOICIRRCICHOCCC(), new ThreadFactoryBuilder().setNameFormat("lunar-async-resource").setDaemon(true).build()
   );

   private static int ROOOCRHIIIRCOIIHOICIRRCICHOCCC() {
      int var0 = Runtime.getRuntime().availableProcessors();
      if (var0 >= 16) {
         return 6;
      } else if (var0 >= 8) {
         return 4;
      } else {
         return var0 <= 4 ? 2 : 3;
      }
   }

   void HHCHOCHCOICCORICHRIOCRRHIHCICO(boolean var1);

   boolean IRIHHHOROHICICOCIOOIHHRRRCOHIO();

   T get();

   Optional<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1);

   void HOIHOROOIOOCOIHCRIRIRIRRICIIHC(Consumer<T> var1);

   void OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(Consumer<T> var1);

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2);

   IHHCHHHCRIHOOCOIOOCRIIICIOROIR OCCRIIIOCIRHCHCICHOIRHIHHHCOHC();
}
