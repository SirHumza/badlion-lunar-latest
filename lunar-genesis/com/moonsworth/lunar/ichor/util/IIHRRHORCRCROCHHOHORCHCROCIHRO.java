package com.moonsworth.lunar.ichor.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   private final ArrayList<Consumer<Throwable>> ORHHRCOHOIHORCHHIOCHRCRCOCOHCI = new ArrayList<>();
   private final HashSet<String> HCIHIRICOCHOCHRRCCOCHCHRRHIRRC = new HashSet<>();
   private final ArrayList<Throwable> HHOOIHHCIRHCCOIHRHOHCIOCIICRIO = new ArrayList<>();

   public synchronized void RRHOOOORORHHOOIHRCCHIIHHIIIIOH(Consumer<Throwable> var1) {
      this.ORHHRCOHOIHORCHHIOCHRCRCOCOHCI.add(var1);
      this.HHOOIHHCIRHCCOIHRHOHCIOCIICRIO.forEach(var1);
   }

   public synchronized void CIOHHCORHRCCRICCCORIHCRHCCCRRR(Throwable var1) {
      String var2 = var1.getClass().getName() + " " + var1.getMessage();
      if (this.HCIHIRICOCHOCHRRCCOCHCHRRHIRRC.add(var2)) {
         this.HHOOIHHCIRHCCOIHRHOHCIOCIICRIO.add(var1);

         for (Consumer var4 : this.ORHHRCOHOIHORCHHIOCHRCRCOCOHCI) {
            var4.accept(var1);
         }
      }
   }
}
