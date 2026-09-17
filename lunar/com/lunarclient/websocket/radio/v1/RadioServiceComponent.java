package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class RadioService implements Service {
   protected RadioService() {
   }

   public static Service newReflectiveService(final RadioService.Interface var0) {
      return new RadioService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void broadcastRadioInfoChange(RpcController var1, BroadcastRadioInfoChangeRequest var2, RpcCallback<BroadcastRadioInfoChangeResponse> var3) {
            var0.broadcastRadioInfoChange(var1, var2, var3);
         }

         @Override
         public void setRadioPlayingVisibility(RpcController var1, SetRadioPlayingVisibilityRequest var2, RpcCallback<SetRadioPlayingVisibilityResponse> var3) {
            var0.setRadioPlayingVisibility(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final RadioService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return RadioService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != RadioService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.broadcastRadioInfoChange(var2, (BroadcastRadioInfoChangeRequest)var3);
               case 2:
                  return var0.setRadioPlayingVisibility(var2, (SetRadioPlayingVisibilityRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != RadioService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return BroadcastRadioInfoChangeRequest.getDefaultInstance();
               case 2:
                  return SetRadioPlayingVisibilityRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != RadioService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return BroadcastRadioInfoChangeResponse.getDefaultInstance();
               case 2:
                  return SetRadioPlayingVisibilityResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void broadcastRadioInfoChange(RpcController var1, BroadcastRadioInfoChangeRequest var2, RpcCallback<BroadcastRadioInfoChangeResponse> var3);

   public abstract void setRadioPlayingVisibility(
      RpcController var1, SetRadioPlayingVisibilityRequest var2, RpcCallback<SetRadioPlayingVisibilityResponse> var3
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
            this.broadcastRadioInfoChange(var2, (BroadcastRadioInfoChangeRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.setRadioPlayingVisibility(var2, (SetRadioPlayingVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
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
            return BroadcastRadioInfoChangeRequest.getDefaultInstance();
         case 2:
            return SetRadioPlayingVisibilityRequest.getDefaultInstance();
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
            return BroadcastRadioInfoChangeResponse.getDefaultInstance();
         case 2:
            return SetRadioPlayingVisibilityResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static RadioService.Stub newStub(RpcChannel var0) {
      return new RadioService.Stub(var0);
   }

   public static RadioService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new RadioService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      BroadcastRadioInfoChangeResponse broadcastRadioInfoChange(RpcController var1, BroadcastRadioInfoChangeRequest var2);

      SetRadioPlayingVisibilityResponse setRadioPlayingVisibility(RpcController var1, SetRadioPlayingVisibilityRequest var2);
   }

   private static final class BlockingStub implements RadioService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(RadioService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public BroadcastRadioInfoChangeResponse broadcastRadioInfoChange(RpcController var1, BroadcastRadioInfoChangeRequest var2) {
         return (BroadcastRadioInfoChangeResponse)this.channel
            .callBlockingMethod(RadioService.getDescriptor().getMethods().get(1), var1, var2, BroadcastRadioInfoChangeResponse.getDefaultInstance());
      }

      @Override
      public SetRadioPlayingVisibilityResponse setRadioPlayingVisibility(RpcController var1, SetRadioPlayingVisibilityRequest var2) {
         return (SetRadioPlayingVisibilityResponse)this.channel
            .callBlockingMethod(RadioService.getDescriptor().getMethods().get(2), var1, var2, SetRadioPlayingVisibilityResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void broadcastRadioInfoChange(RpcController var1, BroadcastRadioInfoChangeRequest var2, RpcCallback<BroadcastRadioInfoChangeResponse> var3);

      void setRadioPlayingVisibility(RpcController var1, SetRadioPlayingVisibilityRequest var2, RpcCallback<SetRadioPlayingVisibilityResponse> var3);
   }

   public static final class Stub extends RadioService implements RadioService.Interface {
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
      public void broadcastRadioInfoChange(RpcController var1, BroadcastRadioInfoChangeRequest var2, RpcCallback<BroadcastRadioInfoChangeResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               BroadcastRadioInfoChangeResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, BroadcastRadioInfoChangeResponse.class, BroadcastRadioInfoChangeResponse.getDefaultInstance())
            );
      }

      @Override
      public void setRadioPlayingVisibility(RpcController var1, SetRadioPlayingVisibilityRequest var2, RpcCallback<SetRadioPlayingVisibilityResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               SetRadioPlayingVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetRadioPlayingVisibilityResponse.class, SetRadioPlayingVisibilityResponse.getDefaultInstance())
            );
      }
   }
}
