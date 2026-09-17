package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class ProgressBar extends Authenticator {
   ProgressBar(String var1, String var2) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   @Override
   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(
         this.BatModClient,
         this.Button.toCharArray()
      );
   }
}
