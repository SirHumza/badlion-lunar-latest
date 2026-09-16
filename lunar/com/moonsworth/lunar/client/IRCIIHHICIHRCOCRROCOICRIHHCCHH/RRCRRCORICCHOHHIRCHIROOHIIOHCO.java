package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonObject;
import com.lunarclient.websocket.protocol.v1.WebSocketRichClosePush;
import java.util.Optional;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final long IICCHCIIIHIOCRCRORIOHOHOCOOHHH = 15000L;
   private static final long RRCHIICRCOICORICIORIHCCCOHORIR = 1000L;
   private final long CCRCRRIRHROHHCIHRCCIOCRCRCHHOH;
   private long CIIHRCIOHORICRHIRCIRIHICHIIOCC;
   @Nullable
   private String OCHHROCHHOCHCCCHRHICROHCHROCCC;
   private long IHCHHOHHOHCRHHCOCICHRIIRROIOHH;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable WebSocketRichClosePush var1, long var2) {
      if (var1 != null) {
         this.CIIHRCIOHORICRHIRCIRIHICHIIOCC = switch (var1.getReconnectDelay()) {
            case RECONNECT_DELAY_UNSPECIFIED, UNRECOGNIZED, RECONNECT_DELAY_NORMAL -> 15000L;
            case RECONNECT_DELAY_IMMEDIATE -> 1000L;
         };
         if (!var1.getReconnectAuthenticatorJwt().isEmpty()) {
            this.OCHHROCHHOCHCCCHRHICROHCHROCCC = var1.getReconnectAuthenticatorJwt();
         } else {
            this.OCHHROCHHOCHCCCHRHICROHCHROCCC = null;
         }
      } else {
         this.CIIHRCIOHORICRHIRCIRIHICHIIOCC = 15000L;
         this.OCHHROCHHOCHCCCHRHICROHCHROCCC = null;
      }

      this.IHCHHOHHOHCRHHCOCICHRIIRROIOHH = System.currentTimeMillis();
      this.CCRCRRIRHROHHCIHRCCIOCRCRCHHOH = var2;
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable WebSocketRichClosePush var1) {
      this(var1, 120000L);
   }

   public boolean OICHRIIHIORHOOOIOCHHOCRORIHIOH() {
      long var1 = System.currentTimeMillis() - this.IHCHHOHHOHCRHHCOCICHRIIRROIOHH;
      if (var1 < this.CIIHRCIOHORICRHIRCIRIHICHIIOCC) {
         return false;
      }

      this.CIIHRCIOHORICRHIRCIRIHICHIIOCC = Math.min(this.CIIHRCIOHORICRHIRCIRIHICHIIOCC * 2L, this.CCRCRRIRHROHHCIHRCCIOCRCRCHHOH);
      this.IHCHHOHHOHCRHHCOCICHRIIRROIOHH = System.currentTimeMillis();
      return true;
   }

   public Optional<String> RCHHCIORHROICHORIROHHOOHHCRIHO() {
      if (this.OCHHROCHHOCHCCCHRHICROHCHROCCC == null) {
         return Optional.empty();
      }

      JsonObject var1 = com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.HCHCHOORHHOHHOCICRHICIRRIOHICR(this.OCHHROCHHOCHCCCHRHICROHCHROCCC);
      if (!var1.has("exp")) {
         return Optional.empty();
      }

      long var2 = var1.get("exp").getAsLong() * 1000L;
      return System.currentTimeMillis() >= var2 ? Optional.empty() : Optional.of(this.OCHHROCHHOCHCCCHRHICROHCHROCCC);
   }

   @Generated
   public void IRRHHRCHIRRCHICHIORIICHRCHOCHR(@Nullable String var1) {
      this.OCHHROCHHOCHCCCHRHICROHCHROCCC = var1;
   }
}
