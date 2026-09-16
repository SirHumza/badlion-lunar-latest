package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class SkyblockService implements Service {
   protected SkyblockService() {
   }

   public static Service newReflectiveService(final SkyblockService.Interface var0) {
      return new SkyblockService() {
         @Override
         public void broadcastDungeonUpdate(RpcController var1, BroadcastDungeonUpdateRequest var2, RpcCallback<BroadcastDungeonUpdateResponse> var3) {
            var0.broadcastDungeonUpdate(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final SkyblockService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return SkyblockService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != SkyblockService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.broadcastDungeonUpdate(var2, (BroadcastDungeonUpdateRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SkyblockService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return BroadcastDungeonUpdateRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SkyblockService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return BroadcastDungeonUpdateResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void broadcastDungeonUpdate(RpcController var1, BroadcastDungeonUpdateRequest var2, RpcCallback<BroadcastDungeonUpdateResponse> var3);

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
            this.broadcastDungeonUpdate(var2, (BroadcastDungeonUpdateRequest)var3, RpcUtil.specializeCallback(var4));
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
            return BroadcastDungeonUpdateRequest.getDefaultInstance();
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
            return BroadcastDungeonUpdateResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static SkyblockService.Stub newStub(RpcChannel var0) {
      return new SkyblockService.Stub(var0);
   }

   public static SkyblockService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new SkyblockService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      BroadcastDungeonUpdateResponse broadcastDungeonUpdate(RpcController var1, BroadcastDungeonUpdateRequest var2);
   }

   private static final class BlockingStub implements SkyblockService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public BroadcastDungeonUpdateResponse broadcastDungeonUpdate(RpcController var1, BroadcastDungeonUpdateRequest var2) {
         return (BroadcastDungeonUpdateResponse)this.channel
            .callBlockingMethod(SkyblockService.getDescriptor().getMethods().get(0), var1, var2, BroadcastDungeonUpdateResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void broadcastDungeonUpdate(RpcController var1, BroadcastDungeonUpdateRequest var2, RpcCallback<BroadcastDungeonUpdateResponse> var3);
   }

   public static final class Stub extends SkyblockService implements SkyblockService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void broadcastDungeonUpdate(RpcController var1, BroadcastDungeonUpdateRequest var2, RpcCallback<BroadcastDungeonUpdateResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               BroadcastDungeonUpdateResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, BroadcastDungeonUpdateResponse.class, BroadcastDungeonUpdateResponse.getDefaultInstance())
            );
      }
   }
}
