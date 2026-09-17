package com.lunarclient.websocket.paynow.v1;

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
         public void payNowCheckoutOpened(RpcController var1, PayNowCheckoutOpenedRequest var2, RpcCallback<PayNowCheckoutOpenedResponse> var3) {
            var0.payNowCheckoutOpened(var1, var2, var3);
         }

         @Override
         public void payNowCheckoutClosed(RpcController var1, PayNowCheckoutClosedRequest var2, RpcCallback<PayNowCheckoutClosedResponse> var3) {
            var0.payNowCheckoutClosed(var1, var2, var3);
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
                  return var0.payNowCheckoutOpened(var2, (PayNowCheckoutOpenedRequest)var3);
               case 1:
                  return var0.payNowCheckoutClosed(var2, (PayNowCheckoutClosedRequest)var3);
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
                  return PayNowCheckoutOpenedRequest.getDefaultInstance();
               case 1:
                  return PayNowCheckoutClosedRequest.getDefaultInstance();
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
                  return PayNowCheckoutOpenedResponse.getDefaultInstance();
               case 1:
                  return PayNowCheckoutClosedResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void payNowCheckoutOpened(RpcController var1, PayNowCheckoutOpenedRequest var2, RpcCallback<PayNowCheckoutOpenedResponse> var3);

   public abstract void payNowCheckoutClosed(RpcController var1, PayNowCheckoutClosedRequest var2, RpcCallback<PayNowCheckoutClosedResponse> var3);

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
            this.payNowCheckoutOpened(var2, (PayNowCheckoutOpenedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.payNowCheckoutClosed(var2, (PayNowCheckoutClosedRequest)var3, RpcUtil.specializeCallback(var4));
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
            return PayNowCheckoutOpenedRequest.getDefaultInstance();
         case 1:
            return PayNowCheckoutClosedRequest.getDefaultInstance();
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
            return PayNowCheckoutOpenedResponse.getDefaultInstance();
         case 1:
            return PayNowCheckoutClosedResponse.getDefaultInstance();
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
      PayNowCheckoutOpenedResponse payNowCheckoutOpened(RpcController var1, PayNowCheckoutOpenedRequest var2);

      PayNowCheckoutClosedResponse payNowCheckoutClosed(RpcController var1, PayNowCheckoutClosedRequest var2);
   }

   private static final class BlockingStub implements PayNowService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public PayNowCheckoutOpenedResponse payNowCheckoutOpened(RpcController var1, PayNowCheckoutOpenedRequest var2) {
         return (PayNowCheckoutOpenedResponse)this.channel
            .callBlockingMethod(PayNowService.getDescriptor().getMethods().get(0), var1, var2, PayNowCheckoutOpenedResponse.getDefaultInstance());
      }

      @Override
      public PayNowCheckoutClosedResponse payNowCheckoutClosed(RpcController var1, PayNowCheckoutClosedRequest var2) {
         return (PayNowCheckoutClosedResponse)this.channel
            .callBlockingMethod(PayNowService.getDescriptor().getMethods().get(1), var1, var2, PayNowCheckoutClosedResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void payNowCheckoutOpened(RpcController var1, PayNowCheckoutOpenedRequest var2, RpcCallback<PayNowCheckoutOpenedResponse> var3);

      void payNowCheckoutClosed(RpcController var1, PayNowCheckoutClosedRequest var2, RpcCallback<PayNowCheckoutClosedResponse> var3);
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
      public void payNowCheckoutOpened(RpcController var1, PayNowCheckoutOpenedRequest var2, RpcCallback<PayNowCheckoutOpenedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               PayNowCheckoutOpenedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, PayNowCheckoutOpenedResponse.class, PayNowCheckoutOpenedResponse.getDefaultInstance())
            );
      }

      @Override
      public void payNowCheckoutClosed(RpcController var1, PayNowCheckoutClosedRequest var2, RpcCallback<PayNowCheckoutClosedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               PayNowCheckoutClosedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, PayNowCheckoutClosedResponse.class, PayNowCheckoutClosedResponse.getDefaultInstance())
            );
      }
   }
}
