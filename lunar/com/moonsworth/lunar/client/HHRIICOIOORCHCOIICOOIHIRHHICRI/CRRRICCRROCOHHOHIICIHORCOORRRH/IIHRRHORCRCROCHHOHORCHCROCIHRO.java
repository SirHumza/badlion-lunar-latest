package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO<T> implements HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> {
   private static final Map<Runnable, Consumer<?>> CCCICOOCOCOIRRRIROORCORHHOCORR = new WeakHashMap<>();
   private final List<Consumer<? super T>> IIRCIRRCIHCHCRRROIOCOICRIIHHIH = new com.moonsworth.lunar.client.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(
      1
   );

   @Override
   public void forEach(Consumer<Consumer<? super T>> var1) {
      this.IIRCIRRCIHCHCRRROIOCOICRIIHHIH.forEach(var1);
   }

   @Override
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Consumer<? super T> var1) {
      this.IIRCIRRCIHCHCRRROIOCOICRIIHHIH.add(var1);
   }

   @Override
   public void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Consumer<? super T> var1) {
      this.IIRCIRRCIHCHCRRROIOCOICRIIHHIH.remove(var1);
   }

   @Override
   public void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(Runnable var1) {
      Consumer var2 = var1x -> var1.run();
      CCCICOOCOCOIRRRIROORCORHHOCORR.put(var1, var2);
      this.IIRCIRRCIHCHCRRROIOCOICRIIHHIH.add(var2);
   }

   @Override
   public void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(Runnable var1) {
      this.IIRCIRRCIHCHCRRROIOCOICRIIHHIH.remove(CCCICOOCOCOIRRRIROORCORHHOCORR.remove(var1));
   }
}
