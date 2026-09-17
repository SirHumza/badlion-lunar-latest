package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final Any CIIOOHHOIIIRIRROIHHCRCOOOCHHIR;

   public <T extends Message> Optional<T> unpack(Class<T> var1) {
      if (!this.CIIOOHHOIIIRIRROIHHCRCOOOCHHIR.is(var1)) {
         return Optional.empty();
      }

      try {
         Message var2 = this.CIIOOHHOIIIRIRROIHHCRCOOOCHHIR.unpack(var1);
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CIRCCCHCCCROROIIOIHIOROIHCHRCH().CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
         return Optional.of((T)var2);
      } catch (Exception var3) {
         return Optional.empty();
      }
   }

   @Generated
   public Any getPacket() {
      return this.CIIOOHHOIIIRIRROIHHCRCOOOCHHIR;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Any var1) {
      this.CIIOOHHOIIIRIRROIHHCRCOOOCHHIR = var1;
   }
}
