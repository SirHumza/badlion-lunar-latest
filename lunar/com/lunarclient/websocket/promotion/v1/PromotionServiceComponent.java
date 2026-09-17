package com.lunarclient.websocket.promotion.v1;

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
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void startPromotionView(RpcController var1, StartPromotionViewRequest var2, RpcCallback<StartPromotionViewResponse> var3) {
            var0.startPromotionView(var1, var2, var3);
         }

         @Override
         public void endPromotionView(RpcController var1, EndPromotionViewRequest var2, RpcCallback<EndPromotionViewResponse> var3) {
            var0.endPromotionView(var1, var2, var3);
         }

         @Override
         public void claimOutplayedReward(RpcController var1, ClaimOutplayedRewardRequest var2, RpcCallback<ClaimOutplayedRewardResponse> var3) {
            var0.claimOutplayedReward(var1, var2, var3);
         }

         @Override
         public void claimRewindPuzzleReward(RpcController var1, ClaimRewindPuzzleRewardRequest var2, RpcCallback<ClaimRewindPuzzleRewardResponse> var3) {
            var0.claimRewindPuzzleReward(var1, var2, var3);
         }

         @Override
         public void claimPendingReward(RpcController var1, ClaimPendingRewardRequest var2, RpcCallback<ClaimPendingRewardResponse> var3) {
            var0.claimPendingReward(var1, var2, var3);
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
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.startPromotionView(var2, (StartPromotionViewRequest)var3);
               case 2:
                  return var0.endPromotionView(var2, (EndPromotionViewRequest)var3);
               case 3:
                  return var0.claimOutplayedReward(var2, (ClaimOutplayedRewardRequest)var3);
               case 4:
                  return var0.claimRewindPuzzleReward(var2, (ClaimRewindPuzzleRewardRequest)var3);
               case 5:
                  return var0.claimPendingReward(var2, (ClaimPendingRewardRequest)var3);
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
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return StartPromotionViewRequest.getDefaultInstance();
               case 2:
                  return EndPromotionViewRequest.getDefaultInstance();
               case 3:
                  return ClaimOutplayedRewardRequest.getDefaultInstance();
               case 4:
                  return ClaimRewindPuzzleRewardRequest.getDefaultInstance();
               case 5:
                  return ClaimPendingRewardRequest.getDefaultInstance();
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
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return StartPromotionViewResponse.getDefaultInstance();
               case 2:
                  return EndPromotionViewResponse.getDefaultInstance();
               case 3:
                  return ClaimOutplayedRewardResponse.getDefaultInstance();
               case 4:
                  return ClaimRewindPuzzleRewardResponse.getDefaultInstance();
               case 5:
                  return ClaimPendingRewardResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void startPromotionView(RpcController var1, StartPromotionViewRequest var2, RpcCallback<StartPromotionViewResponse> var3);

   public abstract void endPromotionView(RpcController var1, EndPromotionViewRequest var2, RpcCallback<EndPromotionViewResponse> var3);

   public abstract void claimOutplayedReward(RpcController var1, ClaimOutplayedRewardRequest var2, RpcCallback<ClaimOutplayedRewardResponse> var3);

   public abstract void claimRewindPuzzleReward(RpcController var1, ClaimRewindPuzzleRewardRequest var2, RpcCallback<ClaimRewindPuzzleRewardResponse> var3);

   public abstract void claimPendingReward(RpcController var1, ClaimPendingRewardRequest var2, RpcCallback<ClaimPendingRewardResponse> var3);

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
            this.login(var2, (LoginRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.startPromotionView(var2, (StartPromotionViewRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.endPromotionView(var2, (EndPromotionViewRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.claimOutplayedReward(var2, (ClaimOutplayedRewardRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.claimRewindPuzzleReward(var2, (ClaimRewindPuzzleRewardRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.claimPendingReward(var2, (ClaimPendingRewardRequest)var3, RpcUtil.specializeCallback(var4));
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
            return LoginRequest.getDefaultInstance();
         case 1:
            return StartPromotionViewRequest.getDefaultInstance();
         case 2:
            return EndPromotionViewRequest.getDefaultInstance();
         case 3:
            return ClaimOutplayedRewardRequest.getDefaultInstance();
         case 4:
            return ClaimRewindPuzzleRewardRequest.getDefaultInstance();
         case 5:
            return ClaimPendingRewardRequest.getDefaultInstance();
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
            return LoginResponse.getDefaultInstance();
         case 1:
            return StartPromotionViewResponse.getDefaultInstance();
         case 2:
            return EndPromotionViewResponse.getDefaultInstance();
         case 3:
            return ClaimOutplayedRewardResponse.getDefaultInstance();
         case 4:
            return ClaimRewindPuzzleRewardResponse.getDefaultInstance();
         case 5:
            return ClaimPendingRewardResponse.getDefaultInstance();
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
      LoginResponse login(RpcController var1, LoginRequest var2);

      StartPromotionViewResponse startPromotionView(RpcController var1, StartPromotionViewRequest var2);

      EndPromotionViewResponse endPromotionView(RpcController var1, EndPromotionViewRequest var2);

      ClaimOutplayedRewardResponse claimOutplayedReward(RpcController var1, ClaimOutplayedRewardRequest var2);

      ClaimRewindPuzzleRewardResponse claimRewindPuzzleReward(RpcController var1, ClaimRewindPuzzleRewardRequest var2);

      ClaimPendingRewardResponse claimPendingReward(RpcController var1, ClaimPendingRewardRequest var2);
   }

   private static final class BlockingStub implements PromotionService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public StartPromotionViewResponse startPromotionView(RpcController var1, StartPromotionViewRequest var2) {
         return (StartPromotionViewResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(1), var1, var2, StartPromotionViewResponse.getDefaultInstance());
      }

      @Override
      public EndPromotionViewResponse endPromotionView(RpcController var1, EndPromotionViewRequest var2) {
         return (EndPromotionViewResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(2), var1, var2, EndPromotionViewResponse.getDefaultInstance());
      }

      @Override
      public ClaimOutplayedRewardResponse claimOutplayedReward(RpcController var1, ClaimOutplayedRewardRequest var2) {
         return (ClaimOutplayedRewardResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(3), var1, var2, ClaimOutplayedRewardResponse.getDefaultInstance());
      }

      @Override
      public ClaimRewindPuzzleRewardResponse claimRewindPuzzleReward(RpcController var1, ClaimRewindPuzzleRewardRequest var2) {
         return (ClaimRewindPuzzleRewardResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(4), var1, var2, ClaimRewindPuzzleRewardResponse.getDefaultInstance());
      }

      @Override
      public ClaimPendingRewardResponse claimPendingReward(RpcController var1, ClaimPendingRewardRequest var2) {
         return (ClaimPendingRewardResponse)this.channel
            .callBlockingMethod(PromotionService.getDescriptor().getMethods().get(5), var1, var2, ClaimPendingRewardResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void startPromotionView(RpcController var1, StartPromotionViewRequest var2, RpcCallback<StartPromotionViewResponse> var3);

      void endPromotionView(RpcController var1, EndPromotionViewRequest var2, RpcCallback<EndPromotionViewResponse> var3);

      void claimOutplayedReward(RpcController var1, ClaimOutplayedRewardRequest var2, RpcCallback<ClaimOutplayedRewardResponse> var3);

      void claimRewindPuzzleReward(RpcController var1, ClaimRewindPuzzleRewardRequest var2, RpcCallback<ClaimRewindPuzzleRewardResponse> var3);

      void claimPendingReward(RpcController var1, ClaimPendingRewardRequest var2, RpcCallback<ClaimPendingRewardResponse> var3);
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
      public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               LoginResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoginResponse.class, LoginResponse.getDefaultInstance())
            );
      }

      @Override
      public void startPromotionView(RpcController var1, StartPromotionViewRequest var2, RpcCallback<StartPromotionViewResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               StartPromotionViewResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StartPromotionViewResponse.class, StartPromotionViewResponse.getDefaultInstance())
            );
      }

      @Override
      public void endPromotionView(RpcController var1, EndPromotionViewRequest var2, RpcCallback<EndPromotionViewResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               EndPromotionViewResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, EndPromotionViewResponse.class, EndPromotionViewResponse.getDefaultInstance())
            );
      }

      @Override
      public void claimOutplayedReward(RpcController var1, ClaimOutplayedRewardRequest var2, RpcCallback<ClaimOutplayedRewardResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               ClaimOutplayedRewardResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ClaimOutplayedRewardResponse.class, ClaimOutplayedRewardResponse.getDefaultInstance())
            );
      }

      @Override
      public void claimRewindPuzzleReward(RpcController var1, ClaimRewindPuzzleRewardRequest var2, RpcCallback<ClaimRewindPuzzleRewardResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               ClaimRewindPuzzleRewardResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ClaimRewindPuzzleRewardResponse.class, ClaimRewindPuzzleRewardResponse.getDefaultInstance())
            );
      }

      @Override
      public void claimPendingReward(RpcController var1, ClaimPendingRewardRequest var2, RpcCallback<ClaimPendingRewardResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               ClaimPendingRewardResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ClaimPendingRewardResponse.class, ClaimPendingRewardResponse.getDefaultInstance())
            );
      }
   }
}
