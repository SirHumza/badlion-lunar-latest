package com.lunarclient.gameipc.location.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class LocationService implements Service {
   protected LocationService() {
   }

   public static Service newReflectiveService(final LocationService.Interface var0) {
      return new LocationService() {
         @Override
         public void updateFocus(RpcController var1, UpdateFocusRequest var2, RpcCallback<UpdateFocusResponse> var3) {
            var0.updateFocus(var1, var2, var3);
         }

         @Override
         public void updateLocation(RpcController var1, UpdateLocationRequest var2, RpcCallback<UpdateLocationResponse> var3) {
            var0.updateLocation(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final LocationService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return LocationService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != LocationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.updateFocus(var2, (UpdateFocusRequest)var3);
               case 1:
                  return var0.updateLocation(var2, (UpdateLocationRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LocationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return UpdateFocusRequest.getDefaultInstance();
               case 1:
                  return UpdateLocationRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LocationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return UpdateFocusResponse.getDefaultInstance();
               case 1:
                  return UpdateLocationResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void updateFocus(RpcController var1, UpdateFocusRequest var2, RpcCallback<UpdateFocusResponse> var3);

   public abstract void updateLocation(RpcController var1, UpdateLocationRequest var2, RpcCallback<UpdateLocationResponse> var3);

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
            this.updateFocus(var2, (UpdateFocusRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.updateLocation(var2, (UpdateLocationRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UpdateFocusRequest.getDefaultInstance();
         case 1:
            return UpdateLocationRequest.getDefaultInstance();
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
            return UpdateFocusResponse.getDefaultInstance();
         case 1:
            return UpdateLocationResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static LocationService.Stub newStub(RpcChannel var0) {
      return new LocationService.Stub(var0);
   }

   public static LocationService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new LocationService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      UpdateFocusResponse updateFocus(RpcController var1, UpdateFocusRequest var2);

      UpdateLocationResponse updateLocation(RpcController var1, UpdateLocationRequest var2);
   }

   private static final class BlockingStub implements LocationService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public UpdateFocusResponse updateFocus(RpcController var1, UpdateFocusRequest var2) {
         return (UpdateFocusResponse)this.channel
            .callBlockingMethod(LocationService.getDescriptor().getMethods().get(0), var1, var2, UpdateFocusResponse.getDefaultInstance());
      }

      @Override
      public UpdateLocationResponse updateLocation(RpcController var1, UpdateLocationRequest var2) {
         return (UpdateLocationResponse)this.channel
            .callBlockingMethod(LocationService.getDescriptor().getMethods().get(1), var1, var2, UpdateLocationResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void updateFocus(RpcController var1, UpdateFocusRequest var2, RpcCallback<UpdateFocusResponse> var3);

      void updateLocation(RpcController var1, UpdateLocationRequest var2, RpcCallback<UpdateLocationResponse> var3);
   }

   public static final class Stub extends LocationService implements LocationService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void updateFocus(RpcController var1, UpdateFocusRequest var2, RpcCallback<UpdateFocusResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               UpdateFocusResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateFocusResponse.class, UpdateFocusResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateLocation(RpcController var1, UpdateLocationRequest var2, RpcCallback<UpdateLocationResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               UpdateLocationResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateLocationResponse.class, UpdateLocationResponse.getDefaultInstance())
            );
      }
   }
}
