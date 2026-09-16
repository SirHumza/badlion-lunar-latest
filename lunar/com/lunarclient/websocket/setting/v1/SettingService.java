package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class SettingService implements Service {
   protected SettingService() {
   }

   public static Service newReflectiveService(final SettingService.Interface var0) {
      return new SettingService() {
         @Override
         public void updateLauncherSetting(RpcController var1, UpdateLauncherSettingRequest var2, RpcCallback<UpdateLauncherSettingResponse> var3) {
            var0.updateLauncherSetting(var1, var2, var3);
         }

         @Override
         public void updateClientSetting(RpcController var1, UpdateClientSettingRequest var2, RpcCallback<UpdateClientSettingResponse> var3) {
            var0.updateClientSetting(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final SettingService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return SettingService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != SettingService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.updateLauncherSetting(var2, (UpdateLauncherSettingRequest)var3);
               case 1:
                  return var0.updateClientSetting(var2, (UpdateClientSettingRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SettingService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return UpdateLauncherSettingRequest.getDefaultInstance();
               case 1:
                  return UpdateClientSettingRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SettingService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return UpdateLauncherSettingResponse.getDefaultInstance();
               case 1:
                  return UpdateClientSettingResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void updateLauncherSetting(RpcController var1, UpdateLauncherSettingRequest var2, RpcCallback<UpdateLauncherSettingResponse> var3);

   public abstract void updateClientSetting(RpcController var1, UpdateClientSettingRequest var2, RpcCallback<UpdateClientSettingResponse> var3);

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
            this.updateLauncherSetting(var2, (UpdateLauncherSettingRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.updateClientSetting(var2, (UpdateClientSettingRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UpdateLauncherSettingRequest.getDefaultInstance();
         case 1:
            return UpdateClientSettingRequest.getDefaultInstance();
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
            return UpdateLauncherSettingResponse.getDefaultInstance();
         case 1:
            return UpdateClientSettingResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static SettingService.Stub newStub(RpcChannel var0) {
      return new SettingService.Stub(var0);
   }

   public static SettingService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new SettingService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      UpdateLauncherSettingResponse updateLauncherSetting(RpcController var1, UpdateLauncherSettingRequest var2);

      UpdateClientSettingResponse updateClientSetting(RpcController var1, UpdateClientSettingRequest var2);
   }

   private static final class BlockingStub implements SettingService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public UpdateLauncherSettingResponse updateLauncherSetting(RpcController var1, UpdateLauncherSettingRequest var2) {
         return (UpdateLauncherSettingResponse)this.channel
            .callBlockingMethod(SettingService.getDescriptor().getMethods().get(0), var1, var2, UpdateLauncherSettingResponse.getDefaultInstance());
      }

      @Override
      public UpdateClientSettingResponse updateClientSetting(RpcController var1, UpdateClientSettingRequest var2) {
         return (UpdateClientSettingResponse)this.channel
            .callBlockingMethod(SettingService.getDescriptor().getMethods().get(1), var1, var2, UpdateClientSettingResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void updateLauncherSetting(RpcController var1, UpdateLauncherSettingRequest var2, RpcCallback<UpdateLauncherSettingResponse> var3);

      void updateClientSetting(RpcController var1, UpdateClientSettingRequest var2, RpcCallback<UpdateClientSettingResponse> var3);
   }

   public static final class Stub extends SettingService implements SettingService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void updateLauncherSetting(RpcController var1, UpdateLauncherSettingRequest var2, RpcCallback<UpdateLauncherSettingResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               UpdateLauncherSettingResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateLauncherSettingResponse.class, UpdateLauncherSettingResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateClientSetting(RpcController var1, UpdateClientSettingRequest var2, RpcCallback<UpdateClientSettingResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               UpdateClientSettingResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateClientSettingResponse.class, UpdateClientSettingResponse.getDefaultInstance())
            );
      }
   }
}
