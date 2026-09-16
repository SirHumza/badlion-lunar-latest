package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class CosmeticService implements Service {
   protected CosmeticService() {
   }

   public static Service newReflectiveService(final CosmeticService.Interface var0) {
      return new CosmeticService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void updateCosmeticSettings(RpcController var1, UpdateCosmeticSettingsRequest var2, RpcCallback<UpdateCosmeticSettingsResponse> var3) {
            var0.updateCosmeticSettings(var1, var2, var3);
         }

         @Override
         public void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3) {
            var0.loadTabLogos(var1, var2, var3);
         }

         @Override
         public void setCosmeticOwnershipVisibility(
            RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
         ) {
            var0.setCosmeticOwnershipVisibility(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final CosmeticService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return CosmeticService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != CosmeticService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.updateCosmeticSettings(var2, (UpdateCosmeticSettingsRequest)var3);
               case 2:
                  return var0.loadTabLogos(var2, (LoadTabLogosRequest)var3);
               case 3:
                  return var0.setCosmeticOwnershipVisibility(var2, (SetCosmeticOwnershipVisibilityRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != CosmeticService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return UpdateCosmeticSettingsRequest.getDefaultInstance();
               case 2:
                  return LoadTabLogosRequest.getDefaultInstance();
               case 3:
                  return SetCosmeticOwnershipVisibilityRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != CosmeticService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return UpdateCosmeticSettingsResponse.getDefaultInstance();
               case 2:
                  return LoadTabLogosResponse.getDefaultInstance();
               case 3:
                  return SetCosmeticOwnershipVisibilityResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void updateCosmeticSettings(RpcController var1, UpdateCosmeticSettingsRequest var2, RpcCallback<UpdateCosmeticSettingsResponse> var3);

   public abstract void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3);

   public abstract void setCosmeticOwnershipVisibility(
      RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
   );

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
            this.updateCosmeticSettings(var2, (UpdateCosmeticSettingsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.loadTabLogos(var2, (LoadTabLogosRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.setCosmeticOwnershipVisibility(var2, (SetCosmeticOwnershipVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UpdateCosmeticSettingsRequest.getDefaultInstance();
         case 2:
            return LoadTabLogosRequest.getDefaultInstance();
         case 3:
            return SetCosmeticOwnershipVisibilityRequest.getDefaultInstance();
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
            return UpdateCosmeticSettingsResponse.getDefaultInstance();
         case 2:
            return LoadTabLogosResponse.getDefaultInstance();
         case 3:
            return SetCosmeticOwnershipVisibilityResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static CosmeticService.Stub newStub(RpcChannel var0) {
      return new CosmeticService.Stub(var0);
   }

   public static CosmeticService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new CosmeticService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      UpdateCosmeticSettingsResponse updateCosmeticSettings(RpcController var1, UpdateCosmeticSettingsRequest var2);

      LoadTabLogosResponse loadTabLogos(RpcController var1, LoadTabLogosRequest var2);

      SetCosmeticOwnershipVisibilityResponse setCosmeticOwnershipVisibility(RpcController var1, SetCosmeticOwnershipVisibilityRequest var2);
   }

   private static final class BlockingStub implements CosmeticService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public UpdateCosmeticSettingsResponse updateCosmeticSettings(RpcController var1, UpdateCosmeticSettingsRequest var2) {
         return (UpdateCosmeticSettingsResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(1), var1, var2, UpdateCosmeticSettingsResponse.getDefaultInstance());
      }

      @Override
      public LoadTabLogosResponse loadTabLogos(RpcController var1, LoadTabLogosRequest var2) {
         return (LoadTabLogosResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(2), var1, var2, LoadTabLogosResponse.getDefaultInstance());
      }

      @Override
      public SetCosmeticOwnershipVisibilityResponse setCosmeticOwnershipVisibility(RpcController var1, SetCosmeticOwnershipVisibilityRequest var2) {
         return (SetCosmeticOwnershipVisibilityResponse)this.channel
            .callBlockingMethod(CosmeticService.getDescriptor().getMethods().get(3), var1, var2, SetCosmeticOwnershipVisibilityResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void updateCosmeticSettings(RpcController var1, UpdateCosmeticSettingsRequest var2, RpcCallback<UpdateCosmeticSettingsResponse> var3);

      void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3);

      void setCosmeticOwnershipVisibility(
         RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
      );
   }

   public static final class Stub extends CosmeticService implements CosmeticService.Interface {
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
      public void updateCosmeticSettings(RpcController var1, UpdateCosmeticSettingsRequest var2, RpcCallback<UpdateCosmeticSettingsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               UpdateCosmeticSettingsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateCosmeticSettingsResponse.class, UpdateCosmeticSettingsResponse.getDefaultInstance())
            );
      }

      @Override
      public void loadTabLogos(RpcController var1, LoadTabLogosRequest var2, RpcCallback<LoadTabLogosResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               LoadTabLogosResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadTabLogosResponse.class, LoadTabLogosResponse.getDefaultInstance())
            );
      }

      @Override
      public void setCosmeticOwnershipVisibility(
         RpcController var1, SetCosmeticOwnershipVisibilityRequest var2, RpcCallback<SetCosmeticOwnershipVisibilityResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               SetCosmeticOwnershipVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetCosmeticOwnershipVisibilityResponse.class, SetCosmeticOwnershipVisibilityResponse.getDefaultInstance())
            );
      }
   }
}
