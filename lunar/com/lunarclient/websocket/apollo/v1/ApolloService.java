package com.lunarclient.websocket.apollo.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class ApolloService implements Service {
   protected ApolloService() {
   }

   public static Service newReflectiveService(final ApolloService.Interface var0) {
      return new ApolloService() {
         @Override
         public void trackFeatureAdoption(RpcController var1, TrackFeatureAdoptionRequest var2, RpcCallback<TrackFeatureAdoptionResponse> var3) {
            var0.trackFeatureAdoption(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final ApolloService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return ApolloService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != ApolloService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.trackFeatureAdoption(var2, (TrackFeatureAdoptionRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ApolloService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return TrackFeatureAdoptionRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ApolloService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return TrackFeatureAdoptionResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void trackFeatureAdoption(RpcController var1, TrackFeatureAdoptionRequest var2, RpcCallback<TrackFeatureAdoptionResponse> var3);

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
            this.trackFeatureAdoption(var2, (TrackFeatureAdoptionRequest)var3, RpcUtil.specializeCallback(var4));
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
            return TrackFeatureAdoptionRequest.getDefaultInstance();
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
            return TrackFeatureAdoptionResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static ApolloService.Stub newStub(RpcChannel var0) {
      return new ApolloService.Stub(var0);
   }

   public static ApolloService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new ApolloService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      TrackFeatureAdoptionResponse trackFeatureAdoption(RpcController var1, TrackFeatureAdoptionRequest var2);
   }

   private static final class BlockingStub implements ApolloService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public TrackFeatureAdoptionResponse trackFeatureAdoption(RpcController var1, TrackFeatureAdoptionRequest var2) {
         return (TrackFeatureAdoptionResponse)this.channel
            .callBlockingMethod(ApolloService.getDescriptor().getMethods().get(0), var1, var2, TrackFeatureAdoptionResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void trackFeatureAdoption(RpcController var1, TrackFeatureAdoptionRequest var2, RpcCallback<TrackFeatureAdoptionResponse> var3);
   }

   public static final class Stub extends ApolloService implements ApolloService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void trackFeatureAdoption(RpcController var1, TrackFeatureAdoptionRequest var2, RpcCallback<TrackFeatureAdoptionResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               TrackFeatureAdoptionResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, TrackFeatureAdoptionResponse.class, TrackFeatureAdoptionResponse.getDefaultInstance())
            );
      }
   }
}
