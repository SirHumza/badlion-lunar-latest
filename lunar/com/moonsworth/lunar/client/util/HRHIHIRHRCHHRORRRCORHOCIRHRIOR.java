package com.moonsworth.lunar.client.util;

import com.google.protobuf.RpcCallback;
import java.util.function.Consumer;

public class HRHIHIRHRCHHRORRRCORHOCIRHRIOR {
   public static <T> void HHCCIRHCCCIIRHCROHIORHIRHHIORH(T var0, Consumer<T> var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> {
         try {
            var1.accept(var0);
         } catch (Exception var3) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "PacketUtil");
         }
      });
   }

   public static <T> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var0, RpcCallback<T> var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> {
         try {
            var1.run(var0);
         } catch (Exception var3) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "PacketUtil");
         }
      });
   }
}
