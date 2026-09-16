package org.java_websocket.protocols;

import java.util.regex.Pattern;

public class Protocol implements IProtocol {
   private static final Pattern patternSpace = Pattern.compile(" ");
   private static final Pattern patternComma = Pattern.compile(",");
   private final String providedProtocol;

   public Protocol(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException();
      }

      this.providedProtocol = var1;
   }

   @Override
   public boolean acceptProvidedProtocol(String var1) {
      String var2 = patternSpace.matcher(var1).replaceAll("");
      String[] var3 = patternComma.split(var2);

      for (String var7 : var3) {
         if (this.providedProtocol.equals(var7)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public String getProvidedProtocol() {
      return this.providedProtocol;
   }

   @Override
   public IProtocol copyInstance() {
      return new Protocol(this.getProvidedProtocol());
   }

   @Override
   public String toString() {
      return this.getProvidedProtocol();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Protocol var2 = (Protocol)var1;
         return this.providedProtocol.equals(var2.providedProtocol);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.providedProtocol.hashCode();
   }
}
