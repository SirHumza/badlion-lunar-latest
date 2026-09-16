package org.java_websocket.handshake;

public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
   private short httpstatus;
   private String httpstatusmessage;

   @Override
   public String getHttpStatusMessage() {
      return this.httpstatusmessage;
   }

   @Override
   public short getHttpStatus() {
      return this.httpstatus;
   }

   @Override
   public void setHttpStatusMessage(String var1) {
      this.httpstatusmessage = var1;
   }

   @Override
   public void setHttpStatus(short var1) {
      this.httpstatus = var1;
   }
}
