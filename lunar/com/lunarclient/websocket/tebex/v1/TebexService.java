package com.lunarclient.websocket.tebex.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class TebexService implements Service {
   protected TebexService() {
   }

   public static Service newReflectiveService(final TebexService.Interface var0) {
      return new TebexService() {
         @Override
         public void tebexJsCheckoutOpened(RpcController var1, TebexJsCheckoutOpenedRequest var2, RpcCallback<TebexJsCheckoutOpenedResponse> var3) {
            var0.tebexJsCheckoutOpened(var1, var2, var3);
         }

         @Override
         public void tebexJsCheckoutClosed(RpcController var1, TebexJsCheckoutClosedRequest var2, RpcCallback<TebexJsCheckoutClosedResponse> var3) {
            var0.tebexJsCheckoutClosed(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final TebexService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return TebexService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != TebexService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.tebexJsCheckoutOpened(var2, (TebexJsCheckoutOpenedRequest)var3);
               case 1:
                  return var0.tebexJsCheckoutClosed(var2, (TebexJsCheckoutClosedRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != TebexService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return TebexJsCheckoutOpenedRequest.getDefaultInstance();
               case 1:
                  return TebexJsCheckoutClosedRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != TebexService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return TebexJsCheckoutOpenedResponse.getDefaultInstance();
               case 1:
                  return TebexJsCheckoutClosedResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void tebexJsCheckoutOpened(RpcController var1, TebexJsCheckoutOpenedRequest var2, RpcCallback<TebexJsCheckoutOpenedResponse> var3);

   public abstract void tebexJsCheckoutClosed(RpcController var1, TebexJsCheckoutClosedRequest var2, RpcCallback<TebexJsCheckoutClosedResponse> var3);

   public static final Descriptors.ServiceDescriptor getDescriptor() {
      return ServiceProto.getDescriptor().getServices().get(0);
   }

   @Override
   public final Descriptors.ServiceDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   @Override
   public final void callMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3, RpcCallback<Message> var4) {
      if (var1.getService() != getDescriptor()) {
         throw new IllegalArgumentException("Service.callMethod() given method descriptor for wrong service type.");
      }

      switch (var1.getIndex()) {
         case 0:
            this.tebexJsCheckoutOpened(var2, (TebexJsCheckoutOpenedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.tebexJsCheckoutClosed(var2, (TebexJsCheckoutClosedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   @Override
   public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
      if (var1.getService() != getDescriptor()) {
         throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
      }

      switch (var1.getIndex()) {
         case 0:
            return TebexJsCheckoutOpenedRequest.getDefaultInstance();
         case 1:
            return TebexJsCheckoutClosedRequest.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   @Override
   public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
      if (var1.getService() != getDescriptor()) {
         throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
      }

      switch (var1.getIndex()) {
         case 0:
            return TebexJsCheckoutOpenedResponse.getDefaultInstance();
         case 1:
            return TebexJsCheckoutClosedResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static TebexService.Stub newStub(RpcChannel var0) {
      return new TebexService.Stub(var0);
   }

   public static TebexService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new TebexService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      TebexJsCheckoutOpenedResponse tebexJsCheckoutOpened(RpcController var1, TebexJsCheckoutOpenedRequest var2);

      TebexJsCheckoutClosedResponse tebexJsCheckoutClosed(RpcController var1, TebexJsCheckoutClosedRequest var2);
   }

   private static final class BlockingStub implements TebexService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public TebexJsCheckoutOpenedResponse tebexJsCheckoutOpened(RpcController var1, TebexJsCheckoutOpenedRequest var2) {
         return (TebexJsCheckoutOpenedResponse)this.channel
            .callBlockingMethod(TebexService.getDescriptor().getMethods().get(0), var1, var2, TebexJsCheckoutOpenedResponse.getDefaultInstance());
      }

      @Override
      public TebexJsCheckoutClosedResponse tebexJsCheckoutClosed(RpcController var1, TebexJsCheckoutClosedRequest var2) {
         return (TebexJsCheckoutClosedResponse)this.channel
            .callBlockingMethod(TebexService.getDescriptor().getMethods().get(1), var1, var2, TebexJsCheckoutClosedResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void tebexJsCheckoutOpened(RpcController var1, TebexJsCheckoutOpenedRequest var2, RpcCallback<TebexJsCheckoutOpenedResponse> var3);

      void tebexJsCheckoutClosed(RpcController var1, TebexJsCheckoutClosedRequest var2, RpcCallback<TebexJsCheckoutClosedResponse> var3);
   }

   public static final class Stub extends TebexService implements TebexService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void tebexJsCheckoutOpened(RpcController var1, TebexJsCheckoutOpenedRequest var2, RpcCallback<TebexJsCheckoutOpenedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               TebexJsCheckoutOpenedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, TebexJsCheckoutOpenedResponse.class, TebexJsCheckoutOpenedResponse.getDefaultInstance())
            );
      }

      @Override
      public void tebexJsCheckoutClosed(RpcController var1, TebexJsCheckoutClosedRequest var2, RpcCallback<TebexJsCheckoutClosedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               TebexJsCheckoutClosedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, TebexJsCheckoutClosedResponse.class, TebexJsCheckoutClosedResponse.getDefaultInstance())
            );
      }
   }
}
