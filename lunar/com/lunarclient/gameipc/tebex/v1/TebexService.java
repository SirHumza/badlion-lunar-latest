package com.lunarclient.gameipc.tebex.v1;

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
         public void openTebexJsCheckout(RpcController var1, OpenTebexJsCheckoutRequest var2, RpcCallback<OpenTebexJsCheckoutResponse> var3) {
            var0.openTebexJsCheckout(var1, var2, var3);
         }

         @Override
         public void checkTebexCapabilities(RpcController var1, CheckTebexCapabilitiesRequest var2, RpcCallback<CheckTebexCapabilitiesResponse> var3) {
            var0.checkTebexCapabilities(var1, var2, var3);
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
                  return var0.openTebexJsCheckout(var2, (OpenTebexJsCheckoutRequest)var3);
               case 1:
                  return var0.checkTebexCapabilities(var2, (CheckTebexCapabilitiesRequest)var3);
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
                  return OpenTebexJsCheckoutRequest.getDefaultInstance();
               case 1:
                  return CheckTebexCapabilitiesRequest.getDefaultInstance();
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
                  return OpenTebexJsCheckoutResponse.getDefaultInstance();
               case 1:
                  return CheckTebexCapabilitiesResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void openTebexJsCheckout(RpcController var1, OpenTebexJsCheckoutRequest var2, RpcCallback<OpenTebexJsCheckoutResponse> var3);

   public abstract void checkTebexCapabilities(RpcController var1, CheckTebexCapabilitiesRequest var2, RpcCallback<CheckTebexCapabilitiesResponse> var3);

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
            this.openTebexJsCheckout(var2, (OpenTebexJsCheckoutRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.checkTebexCapabilities(var2, (CheckTebexCapabilitiesRequest)var3, RpcUtil.specializeCallback(var4));
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
            return OpenTebexJsCheckoutRequest.getDefaultInstance();
         case 1:
            return CheckTebexCapabilitiesRequest.getDefaultInstance();
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
            return OpenTebexJsCheckoutResponse.getDefaultInstance();
         case 1:
            return CheckTebexCapabilitiesResponse.getDefaultInstance();
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
      OpenTebexJsCheckoutResponse openTebexJsCheckout(RpcController var1, OpenTebexJsCheckoutRequest var2);

      CheckTebexCapabilitiesResponse checkTebexCapabilities(RpcController var1, CheckTebexCapabilitiesRequest var2);
   }

   private static final class BlockingStub implements TebexService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public OpenTebexJsCheckoutResponse openTebexJsCheckout(RpcController var1, OpenTebexJsCheckoutRequest var2) {
         return (OpenTebexJsCheckoutResponse)this.channel
            .callBlockingMethod(TebexService.getDescriptor().getMethods().get(0), var1, var2, OpenTebexJsCheckoutResponse.getDefaultInstance());
      }

      @Override
      public CheckTebexCapabilitiesResponse checkTebexCapabilities(RpcController var1, CheckTebexCapabilitiesRequest var2) {
         return (CheckTebexCapabilitiesResponse)this.channel
            .callBlockingMethod(TebexService.getDescriptor().getMethods().get(1), var1, var2, CheckTebexCapabilitiesResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void openTebexJsCheckout(RpcController var1, OpenTebexJsCheckoutRequest var2, RpcCallback<OpenTebexJsCheckoutResponse> var3);

      void checkTebexCapabilities(RpcController var1, CheckTebexCapabilitiesRequest var2, RpcCallback<CheckTebexCapabilitiesResponse> var3);
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
      public void openTebexJsCheckout(RpcController var1, OpenTebexJsCheckoutRequest var2, RpcCallback<OpenTebexJsCheckoutResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               OpenTebexJsCheckoutResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, OpenTebexJsCheckoutResponse.class, OpenTebexJsCheckoutResponse.getDefaultInstance())
            );
      }

      @Override
      public void checkTebexCapabilities(RpcController var1, CheckTebexCapabilitiesRequest var2, RpcCallback<CheckTebexCapabilitiesResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               CheckTebexCapabilitiesResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CheckTebexCapabilitiesResponse.class, CheckTebexCapabilitiesResponse.getDefaultInstance())
            );
      }
   }
}
