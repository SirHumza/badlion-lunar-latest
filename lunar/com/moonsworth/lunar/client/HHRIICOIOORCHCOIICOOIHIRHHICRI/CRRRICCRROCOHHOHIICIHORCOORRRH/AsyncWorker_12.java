package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.function.Consumer;

public interface HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> {
   void forEach(Consumer<Consumer<? super T>> var1);

   void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Consumer<? super T> var1);

   void HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(Consumer<? super T> var1);

   void OIHCOHRCICCCRHRCROOCIOIRRHHHIH(Runnable var1);

   void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(Runnable var1);

   default void COOCCHICCCIIICRHIOCOCIOOORCOCC(T var1) {
      this.forEach(var1x -> var1x.accept((T)var1));
   }

   static <T> HICHRCOHCCRHOHCICOOCHOIHCCHIRI<T> HRIIIOOIIOIHRCCOOCRIIORIRHHOII() {
      return new IIHRRHORCRCROCHHOHORCHCROCIHRO<>();
   }
}
