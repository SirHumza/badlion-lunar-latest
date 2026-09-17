package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class HeartbeatService implements Service {
   protected HeartbeatService() {
   }

   public static Service newReflectiveService(final HeartbeatService.Interface var0) {
      return new HeartbeatService() {
         @Override
         public void launcherHeartbeat(RpcController var1, LauncherHeartbeatRequest var2, RpcCallback<LauncherHeartbeatResponse> var3) {
            var0.launcherHeartbeat(var1, var2, var3);
         }

         @Override
         public void gameHeartbeat(RpcController var1, GameHeartbeatRequest var2, RpcCallback<GameHeartbeatResponse> var3) {
            var0.gameHeartbeat(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final HeartbeatService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return HeartbeatService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != HeartbeatService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.launcherHeartbeat(var2, (LauncherHeartbeatRequest)var3);
               case 1:
                  return var0.gameHeartbeat(var2, (GameHeartbeatRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != HeartbeatService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LauncherHeartbeatRequest.getDefaultInstance();
               case 1:
                  return GameHeartbeatRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != HeartbeatService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LauncherHeartbeatResponse.getDefaultInstance();
               case 1:
                  return GameHeartbeatResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void launcherHeartbeat(RpcController var1, LauncherHeartbeatRequest var2, RpcCallback<LauncherHeartbeatResponse> var3);

   public abstract void gameHeartbeat(RpcController var1, GameHeartbeatRequest var2, RpcCallback<GameHeartbeatResponse> var3);

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
            this.launcherHeartbeat(var2, (LauncherHeartbeatRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.gameHeartbeat(var2, (GameHeartbeatRequest)var3, RpcUtil.specializeCallback(var4));
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
            return LauncherHeartbeatRequest.getDefaultInstance();
         case 1:
            return GameHeartbeatRequest.getDefaultInstance();
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
            return LauncherHeartbeatResponse.getDefaultInstance();
         case 1:
            return GameHeartbeatResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static HeartbeatService.Stub newStub(RpcChannel var0) {
      return new HeartbeatService.Stub(var0);
   }

   public static HeartbeatService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new HeartbeatService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LauncherHeartbeatResponse launcherHeartbeat(RpcController var1, LauncherHeartbeatRequest var2);

      GameHeartbeatResponse gameHeartbeat(RpcController var1, GameHeartbeatRequest var2);
   }

   private static final class BlockingStub implements HeartbeatService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LauncherHeartbeatResponse launcherHeartbeat(RpcController var1, LauncherHeartbeatRequest var2) {
         return (LauncherHeartbeatResponse)this.channel
            .callBlockingMethod(HeartbeatService.getDescriptor().getMethods().get(0), var1, var2, LauncherHeartbeatResponse.getDefaultInstance());
      }

      @Override
      public GameHeartbeatResponse gameHeartbeat(RpcController var1, GameHeartbeatRequest var2) {
         return (GameHeartbeatResponse)this.channel
            .callBlockingMethod(HeartbeatService.getDescriptor().getMethods().get(1), var1, var2, GameHeartbeatResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void launcherHeartbeat(RpcController var1, LauncherHeartbeatRequest var2, RpcCallback<LauncherHeartbeatResponse> var3);

      void gameHeartbeat(RpcController var1, GameHeartbeatRequest var2, RpcCallback<GameHeartbeatResponse> var3);
   }

   public static final class Stub extends HeartbeatService implements HeartbeatService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void launcherHeartbeat(RpcController var1, LauncherHeartbeatRequest var2, RpcCallback<LauncherHeartbeatResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               LauncherHeartbeatResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LauncherHeartbeatResponse.class, LauncherHeartbeatResponse.getDefaultInstance())
            );
      }

      @Override
      public void gameHeartbeat(RpcController var1, GameHeartbeatRequest var2, RpcCallback<GameHeartbeatResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               GameHeartbeatResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, GameHeartbeatResponse.class, GameHeartbeatResponse.getDefaultInstance())
            );
      }
   }
}
