package com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII;

import java.net.InetSocketAddress;

public interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   String OCRRHORRCICOORROOOOOCCIOIHHOIH();

   String CHCOIOCIIHHRIOIIRRCOHOHOCOCRII();

   int getPort();

   InetSocketAddress OROORHRRCHCOHRCORCCRHHCIORORCI();

   static IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final InetSocketAddress var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         @Override
         public String OCRRHORRCICOORROOOOOCCIOIHHOIH() {
            return var0.getAddress().getHostName();
         }

         @Override
         public String CHCOIOCIIHHRIOIIRRCOHOHOCOCRII() {
            return var0.getAddress().getHostAddress();
         }

         @Override
         public int getPort() {
            return var0.getPort();
         }

         @Override
         public InetSocketAddress OROORHRRCHCOHRCORCCRHHCIORORCI() {
            return var0;
         }
      };
   }
}
