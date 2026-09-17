package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO<F, T> {
   private final LoadingCache<F, T> CROORIRIROCCHHOORCIOIHCOOCHRRI = CacheBuilder.newBuilder()
      .maximumSize(2500L)
      .expireAfterAccess(5L, TimeUnit.MINUTES)
      .build(new CacheLoader<F, T>() {
         @NotNull
         public T load(@NotNull F var1) {
            return (T)RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(var1);
         }
      });

   protected abstract RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(F var1);

   protected abstract T IRCIIHHICIHRCOCRROCOICRIHHCCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1);

   private T OIHCOHRCICCCRHRCROOCIOIRRHHHIH(F var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH((F)var1);
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOHCCHIIRCOHRROCRRRRHCIIHRRORC()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
   }

   public T ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(F var1) {
      try {
         return (T)this.CROORIRIROCCHHOORCIOIHCOOCHRRI.get(var1);
      } catch (ExecutionException | UncheckedExecutionException var3) {
         throw new IllegalStateException(var3);
      }
   }

   public void invalidateAll() {
      this.CROORIRIROCCHHOORCIOIHCOOCHRRI.invalidateAll();
   }
}
