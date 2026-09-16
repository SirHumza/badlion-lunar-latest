package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class PromotionService implements Service {
   protected PromotionService() {
   }

   public static Service newReflectiveService(final PromotionService.Interface var0) {
      return new PromotionService() {
         @Override
         public void checkPendingPromotion(RpcController var1, CheckPendingPromotionRequest var2, RpcCallback<CheckPendingPromotionResponse> var3) {
            var0.checkPendingPromotion(var1, var2, var3);
         }

         @Override
         public void playPromotion(RpcController var1, PlayPromotionRequest var2, RpcCallback<PlayPromotionResponse> var3) {
            var0.playPromotion(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final PromotionService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return PromotionService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != PromotionService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.checkPendingPromotion(var2, (CheckPendingPromotionRequest)var3);
               case 1:
                  return var0.playPromotion(var2, (PlayPromotionRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != PromotionService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return CheckPendingPromotionRequest.getDefaultInstance();
               case 1:
                  return PlayPromotionRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != PromotionService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return CheckPendingPromotionResponse.getDefaultInstance();
               case 1:
                  return PlayPromotionResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void checkPendingPromotion(RpcController var1, CheckPendingPromotionRequest var2, RpcCallback<CheckPendingPromotionResponse> var3);

   public abstract void playPromotion(RpcController var1, PlayPromotionRequest var2, RpcCallback<PlayPromotionResponse> var3);

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
            this.checkPendingPromotion(var2, (CheckPendingPromotionRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.playPromotion(var2, (PlayPromotionRequest)var3, RpcUtil.specializeCallback(var4));
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
            return CheckPendingPromotionRequest.getDefaultInstance();
         case 1:
            return PlayPromotionRequest.getDefaultInstance();
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
            return CheckPendingPromotionResponse.getDefaultInstance();
         case 1:
            return PlayPromotionResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static PromotionService.Stub newStub(RpcChannel var0) {
      return new PromotionService.Stub(var0);
   }

   public static PromotionService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new PromotionService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      CheckPendingPromotionResponse checkPendingPromotion(RpcController var1, CheckPendingPromotionRequest var2);

      PlayPromotionResponse playPromotion(RpcController var1, PlayPromotionRequest var2);
   }

   private static final class BlockingStub implements PromotionService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public CheckPendingPromotionResponse checkPendingPromotion(RpcController var1, CheckPendingPromotionRequest var2) {
         return (CheckPendingPromotionResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(0), var1, var2, CheckPendingPromotionResponse.getDefaultInstance());
      }

      @Override
      public PlayPromotionResponse playPromotion(RpcController var1, PlayPromotionRequest var2) {
         return (PlayPromotionResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(1), var1, var2, PlayPromotionResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void checkPendingPromotion(RpcController var1, CheckPendingPromotionRequest var2, RpcCallback<CheckPendingPromotionResponse> var3);

      void playPromotion(RpcController var1, PlayPromotionRequest var2, RpcCallback<PlayPromotionResponse> var3);
   }

   public static final class Stub extends PromotionService implements PromotionService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void checkPendingPromotion(RpcController var1, CheckPendingPromotionRequest var2, RpcCallback<CheckPendingPromotionResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               CheckPendingPromotionResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CheckPendingPromotionResponse.class, CheckPendingPromotionResponse.getDefaultInstance())
            );
      }

      @Override
      public void playPromotion(RpcController var1, PlayPromotionRequest var2, RpcCallback<PlayPromotionResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               PlayPromotionResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, PlayPromotionResponse.class, PlayPromotionResponse.getDefaultInstance())
            );
      }
   }
}
