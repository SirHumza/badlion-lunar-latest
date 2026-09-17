package com.lunarclient.gameipc.paynow.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class PayNowService implements Service {
   protected PayNowService() {
   }

   public static Service newReflectiveService(final PayNowService.Interface var0) {
      return new PayNowService() {
         @Override
         public void openPayNowJsCheckout(RpcController var1, OpenPayNowJsCheckoutRequest var2, RpcCallback<OpenPayNowJsCheckoutResponse> var3) {
            var0.openPayNowJsCheckout(var1, var2, var3);
         }

         @Override
         public void checkPayNowCapabilities(RpcController var1, CheckPayNowCapabilitiesRequest var2, RpcCallback<CheckPayNowCapabilitiesResponse> var3) {
            var0.checkPayNowCapabilities(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final PayNowService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return PayNowService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != PayNowService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.openPayNowJsCheckout(var2, (OpenPayNowJsCheckoutRequest)var3);
               case 1:
                  return var0.checkPayNowCapabilities(var2, (CheckPayNowCapabilitiesRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != PayNowService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return OpenPayNowJsCheckoutRequest.getDefaultInstance();
               case 1:
                  return CheckPayNowCapabilitiesRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != PayNowService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return OpenPayNowJsCheckoutResponse.getDefaultInstance();
               case 1:
                  return CheckPayNowCapabilitiesResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void openPayNowJsCheckout(RpcController var1, OpenPayNowJsCheckoutRequest var2, RpcCallback<OpenPayNowJsCheckoutResponse> var3);

   public abstract void checkPayNowCapabilities(RpcController var1, CheckPayNowCapabilitiesRequest var2, RpcCallback<CheckPayNowCapabilitiesResponse> var3);

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
            this.openPayNowJsCheckout(var2, (OpenPayNowJsCheckoutRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.checkPayNowCapabilities(var2, (CheckPayNowCapabilitiesRequest)var3, RpcUtil.specializeCallback(var4));
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
            return OpenPayNowJsCheckoutRequest.getDefaultInstance();
         case 1:
            return CheckPayNowCapabilitiesRequest.getDefaultInstance();
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
            return OpenPayNowJsCheckoutResponse.getDefaultInstance();
         case 1:
            return CheckPayNowCapabilitiesResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static PayNowService.Stub newStub(RpcChannel var0) {
      return new PayNowService.Stub(var0);
   }

   public static PayNowService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new PayNowService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      OpenPayNowJsCheckoutResponse openPayNowJsCheckout(RpcController var1, OpenPayNowJsCheckoutRequest var2);

      CheckPayNowCapabilitiesResponse checkPayNowCapabilities(RpcController var1, CheckPayNowCapabilitiesRequest var2);
   }

   private static final class BlockingStub implements PayNowService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public OpenPayNowJsCheckoutResponse openPayNowJsCheckout(RpcController var1, OpenPayNowJsCheckoutRequest var2) {
         return (OpenPayNowJsCheckoutResponse)this.channel
            .callBlockingMethod(PayNowService.getDescriptor().getMethods().get(0), var1, var2, OpenPayNowJsCheckoutResponse.getDefaultInstance());
      }

      @Override
      public CheckPayNowCapabilitiesResponse checkPayNowCapabilities(RpcController var1, CheckPayNowCapabilitiesRequest var2) {
         return (CheckPayNowCapabilitiesResponse)this.channel
            .callBlockingMethod(PayNowService.getDescriptor().getMethods().get(1), var1, var2, CheckPayNowCapabilitiesResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void openPayNowJsCheckout(RpcController var1, OpenPayNowJsCheckoutRequest var2, RpcCallback<OpenPayNowJsCheckoutResponse> var3);

      void checkPayNowCapabilities(RpcController var1, CheckPayNowCapabilitiesRequest var2, RpcCallback<CheckPayNowCapabilitiesResponse> var3);
   }

   public static final class Stub extends PayNowService implements PayNowService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void openPayNowJsCheckout(RpcController var1, OpenPayNowJsCheckoutRequest var2, RpcCallback<OpenPayNowJsCheckoutResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               OpenPayNowJsCheckoutResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, OpenPayNowJsCheckoutResponse.class, OpenPayNowJsCheckoutResponse.getDefaultInstance())
            );
      }

      @Override
      public void checkPayNowCapabilities(RpcController var1, CheckPayNowCapabilitiesRequest var2, RpcCallback<CheckPayNowCapabilitiesResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               CheckPayNowCapabilitiesResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CheckPayNowCapabilitiesResponse.class, CheckPayNowCapabilitiesResponse.getDefaultInstance())
            );
      }
   }
}
