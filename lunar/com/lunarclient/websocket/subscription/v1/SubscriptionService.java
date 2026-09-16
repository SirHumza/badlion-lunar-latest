package com.lunarclient.websocket.subscription.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class SubscriptionService implements Service {
   protected SubscriptionService() {
   }

   public static Service newReflectiveService(final SubscriptionService.Interface var0) {
      return new SubscriptionService() {
         @Override
         public void subscribe(RpcController var1, SubscribeRequest var2, RpcCallback<SubscribeResponse> var3) {
            var0.subscribe(var1, var2, var3);
         }

         @Override
         public void subscribeV2(RpcController var1, SubscribeV2Request var2, RpcCallback<SubscribeV2Response> var3) {
            var0.subscribeV2(var1, var2, var3);
         }

         @Override
         public void unsubscribe(RpcController var1, UnsubscribeRequest var2, RpcCallback<UnsubscribeResponse> var3) {
            var0.unsubscribe(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final SubscriptionService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return SubscriptionService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != SubscriptionService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.subscribe(var2, (SubscribeRequest)var3);
               case 1:
                  return var0.subscribeV2(var2, (SubscribeV2Request)var3);
               case 2:
                  return var0.unsubscribe(var2, (UnsubscribeRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SubscriptionService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return SubscribeRequest.getDefaultInstance();
               case 1:
                  return SubscribeV2Request.getDefaultInstance();
               case 2:
                  return UnsubscribeRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SubscriptionService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return SubscribeResponse.getDefaultInstance();
               case 1:
                  return SubscribeV2Response.getDefaultInstance();
               case 2:
                  return UnsubscribeResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void subscribe(RpcController var1, SubscribeRequest var2, RpcCallback<SubscribeResponse> var3);

   public abstract void subscribeV2(RpcController var1, SubscribeV2Request var2, RpcCallback<SubscribeV2Response> var3);

   public abstract void unsubscribe(RpcController var1, UnsubscribeRequest var2, RpcCallback<UnsubscribeResponse> var3);

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
            this.subscribe(var2, (SubscribeRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.subscribeV2(var2, (SubscribeV2Request)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.unsubscribe(var2, (UnsubscribeRequest)var3, RpcUtil.specializeCallback(var4));
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
            return SubscribeRequest.getDefaultInstance();
         case 1:
            return SubscribeV2Request.getDefaultInstance();
         case 2:
            return UnsubscribeRequest.getDefaultInstance();
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
            return SubscribeResponse.getDefaultInstance();
         case 1:
            return SubscribeV2Response.getDefaultInstance();
         case 2:
            return UnsubscribeResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static SubscriptionService.Stub newStub(RpcChannel var0) {
      return new SubscriptionService.Stub(var0);
   }

   public static SubscriptionService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new SubscriptionService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      SubscribeResponse subscribe(RpcController var1, SubscribeRequest var2);

      SubscribeV2Response subscribeV2(RpcController var1, SubscribeV2Request var2);

      UnsubscribeResponse unsubscribe(RpcController var1, UnsubscribeRequest var2);
   }

   private static final class BlockingStub implements SubscriptionService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public SubscribeResponse subscribe(RpcController var1, SubscribeRequest var2) {
         return (SubscribeResponse)this.channel
            .callBlockingMethod(SubscriptionService.getDescriptor().getMethods().get(0), var1, var2, SubscribeResponse.getDefaultInstance());
      }

      @Override
      public SubscribeV2Response subscribeV2(RpcController var1, SubscribeV2Request var2) {
         return (SubscribeV2Response)this.channel
            .callBlockingMethod(SubscriptionService.getDescriptor().getMethods().get(1), var1, var2, SubscribeV2Response.getDefaultInstance());
      }

      @Override
      public UnsubscribeResponse unsubscribe(RpcController var1, UnsubscribeRequest var2) {
         return (UnsubscribeResponse)this.channel
            .callBlockingMethod(SubscriptionService.getDescriptor().getMethods().get(2), var1, var2, UnsubscribeResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void subscribe(RpcController var1, SubscribeRequest var2, RpcCallback<SubscribeResponse> var3);

      void subscribeV2(RpcController var1, SubscribeV2Request var2, RpcCallback<SubscribeV2Response> var3);

      void unsubscribe(RpcController var1, UnsubscribeRequest var2, RpcCallback<UnsubscribeResponse> var3);
   }

   public static final class Stub extends SubscriptionService implements SubscriptionService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void subscribe(RpcController var1, SubscribeRequest var2, RpcCallback<SubscribeResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               SubscribeResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SubscribeResponse.class, SubscribeResponse.getDefaultInstance())
            );
      }

      @Override
      public void subscribeV2(RpcController var1, SubscribeV2Request var2, RpcCallback<SubscribeV2Response> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               SubscribeV2Response.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SubscribeV2Response.class, SubscribeV2Response.getDefaultInstance())
            );
      }

      @Override
      public void unsubscribe(RpcController var1, UnsubscribeRequest var2, RpcCallback<UnsubscribeResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               UnsubscribeResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UnsubscribeResponse.class, UnsubscribeResponse.getDefaultInstance())
            );
      }
   }
}
