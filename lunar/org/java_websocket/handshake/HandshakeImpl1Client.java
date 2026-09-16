package org.java_websocket.handshake;

public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
   private String resourceDescriptor = "*";

   @Override
   public void setResourceDescriptor(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("http resource descriptor must not be null");
      }

      this.resourceDescriptor = var1;
   }

   @Override
   public String getResourceDescriptor() {
      return this.resourceDescriptor;
   }
}
