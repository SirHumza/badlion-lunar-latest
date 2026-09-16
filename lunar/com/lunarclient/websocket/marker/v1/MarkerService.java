package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class MarkerService implements Service {
   protected MarkerService() {
   }

   public static Service newReflectiveService(final MarkerService.Interface var0) {
      return new MarkerService() {
         @Override
         public void broadcastNewMarker(RpcController var1, BroadcastNewMarkerRequest var2, RpcCallback<BroadcastNewMarkerResponse> var3) {
            var0.broadcastNewMarker(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final MarkerService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return MarkerService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != MarkerService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.broadcastNewMarker(var2, (BroadcastNewMarkerRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != MarkerService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return BroadcastNewMarkerRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != MarkerService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return BroadcastNewMarkerResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void broadcastNewMarker(RpcController var1, BroadcastNewMarkerRequest var2, RpcCallback<BroadcastNewMarkerResponse> var3);

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
            this.broadcastNewMarker(var2, (BroadcastNewMarkerRequest)var3, RpcUtil.specializeCallback(var4));
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
            return BroadcastNewMarkerRequest.getDefaultInstance();
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
            return BroadcastNewMarkerResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static MarkerService.Stub newStub(RpcChannel var0) {
      return new MarkerService.Stub(var0);
   }

   public static MarkerService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new MarkerService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      BroadcastNewMarkerResponse broadcastNewMarker(RpcController var1, BroadcastNewMarkerRequest var2);
   }

   private static final class BlockingStub implements MarkerService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public BroadcastNewMarkerResponse broadcastNewMarker(RpcController var1, BroadcastNewMarkerRequest var2) {
         return (BroadcastNewMarkerResponse)this.channel
            .callBlockingMethod(MarkerService.getDescriptor().getMethods().get(0), var1, var2, BroadcastNewMarkerResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void broadcastNewMarker(RpcController var1, BroadcastNewMarkerRequest var2, RpcCallback<BroadcastNewMarkerResponse> var3);
   }

   public static final class Stub extends MarkerService implements MarkerService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void broadcastNewMarker(RpcController var1, BroadcastNewMarkerRequest var2, RpcCallback<BroadcastNewMarkerResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               BroadcastNewMarkerResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, BroadcastNewMarkerResponse.class, BroadcastNewMarkerResponse.getDefaultInstance())
            );
      }
   }
}
