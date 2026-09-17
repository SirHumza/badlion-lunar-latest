package com.lunarclient.websocket.legacyapi.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class LegacyApiService implements Service {
   protected LegacyApiService() {
   }

   public static Service newReflectiveService(final LegacyApiService.Interface var0) {
      return new LegacyApiService() {
         @Override
         public void recordDeprecatedApiUsage(RpcController var1, RecordDeprecatedApiUsageRequest var2, RpcCallback<RecordDeprecatedApiUsageResponse> var3) {
            var0.recordDeprecatedApiUsage(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final LegacyApiService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return LegacyApiService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != LegacyApiService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.recordDeprecatedApiUsage(var2, (RecordDeprecatedApiUsageRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LegacyApiService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return RecordDeprecatedApiUsageRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LegacyApiService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return RecordDeprecatedApiUsageResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void recordDeprecatedApiUsage(RpcController var1, RecordDeprecatedApiUsageRequest var2, RpcCallback<RecordDeprecatedApiUsageResponse> var3);

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
            this.recordDeprecatedApiUsage(var2, (RecordDeprecatedApiUsageRequest)var3, RpcUtil.specializeCallback(var4));
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
            return RecordDeprecatedApiUsageRequest.getDefaultInstance();
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
            return RecordDeprecatedApiUsageResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static LegacyApiService.Stub newStub(RpcChannel var0) {
      return new LegacyApiService.Stub(var0);
   }

   public static LegacyApiService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new LegacyApiService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      RecordDeprecatedApiUsageResponse recordDeprecatedApiUsage(RpcController var1, RecordDeprecatedApiUsageRequest var2);
   }

   private static final class BlockingStub implements LegacyApiService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public RecordDeprecatedApiUsageResponse recordDeprecatedApiUsage(RpcController var1, RecordDeprecatedApiUsageRequest var2) {
         return (RecordDeprecatedApiUsageResponse)this.channel
            .callBlockingMethod(LegacyApiService.getDescriptor().getMethods().get(0), var1, var2, RecordDeprecatedApiUsageResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void recordDeprecatedApiUsage(RpcController var1, RecordDeprecatedApiUsageRequest var2, RpcCallback<RecordDeprecatedApiUsageResponse> var3);
   }

   public static final class Stub extends LegacyApiService implements LegacyApiService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void recordDeprecatedApiUsage(RpcController var1, RecordDeprecatedApiUsageRequest var2, RpcCallback<RecordDeprecatedApiUsageResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               RecordDeprecatedApiUsageResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordDeprecatedApiUsageResponse.class, RecordDeprecatedApiUsageResponse.getDefaultInstance())
            );
      }
   }
}
