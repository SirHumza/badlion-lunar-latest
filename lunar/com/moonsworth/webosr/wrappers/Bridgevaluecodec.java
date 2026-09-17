package com.moonsworth.webosr.wrappers;

import com.moonsworth.webosr.BridgeValueCodec;

public final class PromiseJS<T> {
   private volatile long handle;
   private BridgeValueCodec bridgeCodec;
   private Class<?> bridgeValueType;

   private PromiseJS(long var1) {
      this.handle = var1;
   }

   public void resolve(T var1) {
      if (this.handle == 0L) {
         throw new IllegalStateException("Future already completed");
      }

      if (var1 == null) {
         this._resolve((String)null);
      } else if (this.bridgeCodec != null && this.bridgeValueType != null) {
         this._resolve(this.bridgeCodec.objectToString(var1, this.bridgeValueType));
      } else if (var1 instanceof String) {
         this._resolve((String)var1);
      } else {
         throw new IllegalStateException("No type serializer for " + var1.getClass().getName());
      }
   }

   public void _resolve(String var1) {
      if (this.handle == 0L) {
         throw new IllegalStateException("Future already completed");
      }

      this.resolve0(var1);
      this.handle = 0L;
      this.clearBridgeCodec();
   }

   public void resolve() {
      if (this.handle == 0L) {
         throw new IllegalStateException("Future already completed");
      }

      this.resolve1();
      this.handle = 0L;
      this.clearBridgeCodec();
   }

   public void reject(String var1) {
      if (this.handle == 0L) {
         throw new IllegalStateException("Future already completed");
      }

      this.reject0(var1);
      this.handle = 0L;
      this.clearBridgeCodec();
   }

   public void reject() {
      if (this.handle == 0L) {
         throw new IllegalStateException("Future already completed");
      }

      this.reject1();
      this.handle = 0L;
      this.clearBridgeCodec();
   }

   public void bindBridgeCodec(BridgeValueCodec var1, Class<?> var2) {
      this.bridgeCodec = var1;
      this.bridgeValueType = var2;
   }

   private void clearBridgeCodec() {
      this.bridgeCodec = null;
      this.bridgeValueType = null;
   }

   private native void resolve0(String var1);

   private native void resolve1();

   private native void reject0(String var1);

   private native void reject1();
}
