package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class LiveExperienceService implements Service {
   protected LiveExperienceService() {
   }

   public static Service newReflectiveService(final LiveExperienceService.Interface var0) {
      return new LiveExperienceService() {
         @Override
         public void loadLiveExperience(RpcController var1, LoadLiveExperienceRequest var2, RpcCallback<LoadLiveExperienceResponse> var3) {
            var0.loadLiveExperience(var1, var2, var3);
         }

         @Override
         public void joinLiveExperience(RpcController var1, JoinLiveExperienceRequest var2, RpcCallback<JoinLiveExperienceResponse> var3) {
            var0.joinLiveExperience(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final LiveExperienceService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return LiveExperienceService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != LiveExperienceService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.loadLiveExperience(var2, (LoadLiveExperienceRequest)var3);
               case 1:
                  return var0.joinLiveExperience(var2, (JoinLiveExperienceRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LiveExperienceService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoadLiveExperienceRequest.getDefaultInstance();
               case 1:
                  return JoinLiveExperienceRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LiveExperienceService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoadLiveExperienceResponse.getDefaultInstance();
               case 1:
                  return JoinLiveExperienceResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void loadLiveExperience(RpcController var1, LoadLiveExperienceRequest var2, RpcCallback<LoadLiveExperienceResponse> var3);

   public abstract void joinLiveExperience(RpcController var1, JoinLiveExperienceRequest var2, RpcCallback<JoinLiveExperienceResponse> var3);

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
            this.loadLiveExperience(var2, (LoadLiveExperienceRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.joinLiveExperience(var2, (JoinLiveExperienceRequest)var3, RpcUtil.specializeCallback(var4));
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
            return LoadLiveExperienceRequest.getDefaultInstance();
         case 1:
            return JoinLiveExperienceRequest.getDefaultInstance();
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
            return LoadLiveExperienceResponse.getDefaultInstance();
         case 1:
            return JoinLiveExperienceResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static LiveExperienceService.Stub newStub(RpcChannel var0) {
      return new LiveExperienceService.Stub(var0);
   }

   public static LiveExperienceService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new LiveExperienceService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoadLiveExperienceResponse loadLiveExperience(RpcController var1, LoadLiveExperienceRequest var2);

      JoinLiveExperienceResponse joinLiveExperience(RpcController var1, JoinLiveExperienceRequest var2);
   }

   private static final class BlockingStub implements LiveExperienceService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoadLiveExperienceResponse loadLiveExperience(RpcController var1, LoadLiveExperienceRequest var2) {
         return (LoadLiveExperienceResponse)this.channel
            .callBlockingMethod(LiveExperienceService.getDescriptor().getMethods().get(0), var1, var2, LoadLiveExperienceResponse.getDefaultInstance());
      }

      @Override
      public JoinLiveExperienceResponse joinLiveExperience(RpcController var1, JoinLiveExperienceRequest var2) {
         return (JoinLiveExperienceResponse)this.channel
            .callBlockingMethod(LiveExperienceService.getDescriptor().getMethods().get(1), var1, var2, JoinLiveExperienceResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void loadLiveExperience(RpcController var1, LoadLiveExperienceRequest var2, RpcCallback<LoadLiveExperienceResponse> var3);

      void joinLiveExperience(RpcController var1, JoinLiveExperienceRequest var2, RpcCallback<JoinLiveExperienceResponse> var3);
   }

   public static final class Stub extends LiveExperienceService implements LiveExperienceService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void loadLiveExperience(RpcController var1, LoadLiveExperienceRequest var2, RpcCallback<LoadLiveExperienceResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               LoadLiveExperienceResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadLiveExperienceResponse.class, LoadLiveExperienceResponse.getDefaultInstance())
            );
      }

      @Override
      public void joinLiveExperience(RpcController var1, JoinLiveExperienceRequest var2, RpcCallback<JoinLiveExperienceResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               JoinLiveExperienceResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, JoinLiveExperienceResponse.class, JoinLiveExperienceResponse.getDefaultInstance())
            );
      }
   }
}
