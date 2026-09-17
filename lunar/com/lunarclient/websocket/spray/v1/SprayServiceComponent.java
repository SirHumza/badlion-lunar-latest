package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class SprayService implements Service {
   protected SprayService() {
   }

   public static Service newReflectiveService(final SprayService.Interface var0) {
      return new SprayService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void useSpray(RpcController var1, UseSprayRequest var2, RpcCallback<UseSprayResponse> var3) {
            var0.useSpray(var1, var2, var3);
         }

         @Override
         public void removeSpray(RpcController var1, RemoveSprayRequest var2, RpcCallback<RemoveSprayResponse> var3) {
            var0.removeSpray(var1, var2, var3);
         }

         @Override
         public void updateEquippedSprays(RpcController var1, UpdateEquippedSpraysRequest var2, RpcCallback<UpdateEquippedSpraysResponse> var3) {
            var0.updateEquippedSprays(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final SprayService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return SprayService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != SprayService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.useSpray(var2, (UseSprayRequest)var3);
               case 2:
                  return var0.removeSpray(var2, (RemoveSprayRequest)var3);
               case 3:
                  return var0.updateEquippedSprays(var2, (UpdateEquippedSpraysRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SprayService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return UseSprayRequest.getDefaultInstance();
               case 2:
                  return RemoveSprayRequest.getDefaultInstance();
               case 3:
                  return UpdateEquippedSpraysRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SprayService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return UseSprayResponse.getDefaultInstance();
               case 2:
                  return RemoveSprayResponse.getDefaultInstance();
               case 3:
                  return UpdateEquippedSpraysResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void useSpray(RpcController var1, UseSprayRequest var2, RpcCallback<UseSprayResponse> var3);

   public abstract void removeSpray(RpcController var1, RemoveSprayRequest var2, RpcCallback<RemoveSprayResponse> var3);

   public abstract void updateEquippedSprays(RpcController var1, UpdateEquippedSpraysRequest var2, RpcCallback<UpdateEquippedSpraysResponse> var3);

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
            this.useSpray(var2, (UseSprayRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.removeSpray(var2, (RemoveSprayRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.updateEquippedSprays(var2, (UpdateEquippedSpraysRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UseSprayRequest.getDefaultInstance();
         case 2:
            return RemoveSprayRequest.getDefaultInstance();
         case 3:
            return UpdateEquippedSpraysRequest.getDefaultInstance();
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
            return UseSprayResponse.getDefaultInstance();
         case 2:
            return RemoveSprayResponse.getDefaultInstance();
         case 3:
            return UpdateEquippedSpraysResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static SprayService.Stub newStub(RpcChannel var0) {
      return new SprayService.Stub(var0);
   }

   public static SprayService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new SprayService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      UseSprayResponse useSpray(RpcController var1, UseSprayRequest var2);

      RemoveSprayResponse removeSpray(RpcController var1, RemoveSprayRequest var2);

      UpdateEquippedSpraysResponse updateEquippedSprays(RpcController var1, UpdateEquippedSpraysRequest var2);
   }

   private static final class BlockingStub implements SprayService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(SprayService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public UseSprayResponse useSpray(RpcController var1, UseSprayRequest var2) {
         return (UseSprayResponse)this.channel
            .callBlockingMethod(SprayService.getDescriptor().getMethods().get(1), var1, var2, UseSprayResponse.getDefaultInstance());
      }

      @Override
      public RemoveSprayResponse removeSpray(RpcController var1, RemoveSprayRequest var2) {
         return (RemoveSprayResponse)this.channel
            .callBlockingMethod(SprayService.getDescriptor().getMethods().get(2), var1, var2, RemoveSprayResponse.getDefaultInstance());
      }

      @Override
      public UpdateEquippedSpraysResponse updateEquippedSprays(RpcController var1, UpdateEquippedSpraysRequest var2) {
         return (UpdateEquippedSpraysResponse)this.channel
            .callBlockingMethod(SprayService.getDescriptor().getMethods().get(3), var1, var2, UpdateEquippedSpraysResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void useSpray(RpcController var1, UseSprayRequest var2, RpcCallback<UseSprayResponse> var3);

      void removeSpray(RpcController var1, RemoveSprayRequest var2, RpcCallback<RemoveSprayResponse> var3);

      void updateEquippedSprays(RpcController var1, UpdateEquippedSpraysRequest var2, RpcCallback<UpdateEquippedSpraysResponse> var3);
   }

   public static final class Stub extends SprayService implements SprayService.Interface {
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
      public void useSpray(RpcController var1, UseSprayRequest var2, RpcCallback<UseSprayResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               UseSprayResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UseSprayResponse.class, UseSprayResponse.getDefaultInstance())
            );
      }

      @Override
      public void removeSpray(RpcController var1, RemoveSprayRequest var2, RpcCallback<RemoveSprayResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               RemoveSprayResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RemoveSprayResponse.class, RemoveSprayResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateEquippedSprays(RpcController var1, UpdateEquippedSpraysRequest var2, RpcCallback<UpdateEquippedSpraysResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               UpdateEquippedSpraysResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateEquippedSpraysResponse.class, UpdateEquippedSpraysResponse.getDefaultInstance())
            );
      }
   }
}
