package com.lunarclient.websocket.analytics.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class AnalyticsService implements Service {
   protected AnalyticsService() {
   }

   public static Service newReflectiveService(final AnalyticsService.Interface var0) {
      return new AnalyticsService() {
         @Override
         public void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3) {
            var0.recordCounters(var1, var2, var3);
         }

         @Override
         public void recordPinnedServerInteraction(
            RpcController var1, RecordPinnedServerInteractionRequest var2, RpcCallback<RecordPinnedServerInteractionResponse> var3
         ) {
            var0.recordPinnedServerInteraction(var1, var2, var3);
         }

         @Override
         public void recordEnabledMods(RpcController var1, RecordEnabledModsRequest var2, RpcCallback<RecordEnabledModsResponse> var3) {
            var0.recordEnabledMods(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final AnalyticsService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return AnalyticsService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != AnalyticsService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.recordCounters(var2, (RecordCountersRequest)var3);
               case 1:
                  return var0.recordPinnedServerInteraction(var2, (RecordPinnedServerInteractionRequest)var3);
               case 2:
                  return var0.recordEnabledMods(var2, (RecordEnabledModsRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != AnalyticsService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return RecordCountersRequest.getDefaultInstance();
               case 1:
                  return RecordPinnedServerInteractionRequest.getDefaultInstance();
               case 2:
                  return RecordEnabledModsRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != AnalyticsService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return RecordCountersResponse.getDefaultInstance();
               case 1:
                  return RecordPinnedServerInteractionResponse.getDefaultInstance();
               case 2:
                  return RecordEnabledModsResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3);

   public abstract void recordPinnedServerInteraction(
      RpcController var1, RecordPinnedServerInteractionRequest var2, RpcCallback<RecordPinnedServerInteractionResponse> var3
   );

   public abstract void recordEnabledMods(RpcController var1, RecordEnabledModsRequest var2, RpcCallback<RecordEnabledModsResponse> var3);

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
            this.recordCounters(var2, (RecordCountersRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.recordPinnedServerInteraction(var2, (RecordPinnedServerInteractionRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.recordEnabledMods(var2, (RecordEnabledModsRequest)var3, RpcUtil.specializeCallback(var4));
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
            return RecordCountersRequest.getDefaultInstance();
         case 1:
            return RecordPinnedServerInteractionRequest.getDefaultInstance();
         case 2:
            return RecordEnabledModsRequest.getDefaultInstance();
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
            return RecordCountersResponse.getDefaultInstance();
         case 1:
            return RecordPinnedServerInteractionResponse.getDefaultInstance();
         case 2:
            return RecordEnabledModsResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static AnalyticsService.Stub newStub(RpcChannel var0) {
      return new AnalyticsService.Stub(var0);
   }

   public static AnalyticsService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new AnalyticsService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      RecordCountersResponse recordCounters(RpcController var1, RecordCountersRequest var2);

      RecordPinnedServerInteractionResponse recordPinnedServerInteraction(RpcController var1, RecordPinnedServerInteractionRequest var2);

      RecordEnabledModsResponse recordEnabledMods(RpcController var1, RecordEnabledModsRequest var2);
   }

   private static final class BlockingStub implements AnalyticsService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public RecordCountersResponse recordCounters(RpcController var1, RecordCountersRequest var2) {
         return (RecordCountersResponse)this.channel
            .callBlockingMethod(AnalyticsService.getDescriptor().getMethods().get(0), var1, var2, RecordCountersResponse.getDefaultInstance());
      }

      @Override
      public RecordPinnedServerInteractionResponse recordPinnedServerInteraction(RpcController var1, RecordPinnedServerInteractionRequest var2) {
         return (RecordPinnedServerInteractionResponse)this.channel
            .callBlockingMethod(AnalyticsService.getDescriptor().getMethods().get(1), var1, var2, RecordPinnedServerInteractionResponse.getDefaultInstance());
      }

      @Override
      public RecordEnabledModsResponse recordEnabledMods(RpcController var1, RecordEnabledModsRequest var2) {
         return (RecordEnabledModsResponse)this.channel
            .callBlockingMethod(AnalyticsService.getDescriptor().getMethods().get(2), var1, var2, RecordEnabledModsResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3);

      void recordPinnedServerInteraction(RpcController var1, RecordPinnedServerInteractionRequest var2, RpcCallback<RecordPinnedServerInteractionResponse> var3);

      void recordEnabledMods(RpcController var1, RecordEnabledModsRequest var2, RpcCallback<RecordEnabledModsResponse> var3);
   }

   public static final class Stub extends AnalyticsService implements AnalyticsService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void recordCounters(RpcController var1, RecordCountersRequest var2, RpcCallback<RecordCountersResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               RecordCountersResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordCountersResponse.class, RecordCountersResponse.getDefaultInstance())
            );
      }

      @Override
      public void recordPinnedServerInteraction(
         RpcController var1, RecordPinnedServerInteractionRequest var2, RpcCallback<RecordPinnedServerInteractionResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               RecordPinnedServerInteractionResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordPinnedServerInteractionResponse.class, RecordPinnedServerInteractionResponse.getDefaultInstance())
            );
      }

      @Override
      public void recordEnabledMods(RpcController var1, RecordEnabledModsRequest var2, RpcCallback<RecordEnabledModsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               RecordEnabledModsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordEnabledModsResponse.class, RecordEnabledModsResponse.getDefaultInstance())
            );
      }
   }
}
