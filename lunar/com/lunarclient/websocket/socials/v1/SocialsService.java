package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class SocialsService implements Service {
   protected SocialsService() {
   }

   public static Service newReflectiveService(final SocialsService.Interface var0) {
      return new SocialsService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void unlinkSocial(RpcController var1, UnlinkSocialRequest var2, RpcCallback<UnlinkSocialResponse> var3) {
            var0.unlinkSocial(var1, var2, var3);
         }

         @Override
         public void setSocialsVisibility(RpcController var1, SetSocialsVisibilityRequest var2, RpcCallback<SetSocialsVisibilityResponse> var3) {
            var0.setSocialsVisibility(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final SocialsService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return SocialsService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != SocialsService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.unlinkSocial(var2, (UnlinkSocialRequest)var3);
               case 2:
                  return var0.setSocialsVisibility(var2, (SetSocialsVisibilityRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SocialsService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return UnlinkSocialRequest.getDefaultInstance();
               case 2:
                  return SetSocialsVisibilityRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != SocialsService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return UnlinkSocialResponse.getDefaultInstance();
               case 2:
                  return SetSocialsVisibilityResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void unlinkSocial(RpcController var1, UnlinkSocialRequest var2, RpcCallback<UnlinkSocialResponse> var3);

   public abstract void setSocialsVisibility(RpcController var1, SetSocialsVisibilityRequest var2, RpcCallback<SetSocialsVisibilityResponse> var3);

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
            this.unlinkSocial(var2, (UnlinkSocialRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.setSocialsVisibility(var2, (SetSocialsVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UnlinkSocialRequest.getDefaultInstance();
         case 2:
            return SetSocialsVisibilityRequest.getDefaultInstance();
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
            return UnlinkSocialResponse.getDefaultInstance();
         case 2:
            return SetSocialsVisibilityResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static SocialsService.Stub newStub(RpcChannel var0) {
      return new SocialsService.Stub(var0);
   }

   public static SocialsService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new SocialsService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      UnlinkSocialResponse unlinkSocial(RpcController var1, UnlinkSocialRequest var2);

      SetSocialsVisibilityResponse setSocialsVisibility(RpcController var1, SetSocialsVisibilityRequest var2);
   }

   private static final class BlockingStub implements SocialsService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(SocialsService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public UnlinkSocialResponse unlinkSocial(RpcController var1, UnlinkSocialRequest var2) {
         return (UnlinkSocialResponse)this.channel
            .callBlockingMethod(SocialsService.getDescriptor().getMethods().get(1), var1, var2, UnlinkSocialResponse.getDefaultInstance());
      }

      @Override
      public SetSocialsVisibilityResponse setSocialsVisibility(RpcController var1, SetSocialsVisibilityRequest var2) {
         return (SetSocialsVisibilityResponse)this.channel
            .callBlockingMethod(SocialsService.getDescriptor().getMethods().get(2), var1, var2, SetSocialsVisibilityResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void unlinkSocial(RpcController var1, UnlinkSocialRequest var2, RpcCallback<UnlinkSocialResponse> var3);

      void setSocialsVisibility(RpcController var1, SetSocialsVisibilityRequest var2, RpcCallback<SetSocialsVisibilityResponse> var3);
   }

   public static final class Stub extends SocialsService implements SocialsService.Interface {
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
      public void unlinkSocial(RpcController var1, UnlinkSocialRequest var2, RpcCallback<UnlinkSocialResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               UnlinkSocialResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UnlinkSocialResponse.class, UnlinkSocialResponse.getDefaultInstance())
            );
      }

      @Override
      public void setSocialsVisibility(RpcController var1, SetSocialsVisibilityRequest var2, RpcCallback<SetSocialsVisibilityResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               SetSocialsVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetSocialsVisibilityResponse.class, SetSocialsVisibilityResponse.getDefaultInstance())
            );
      }
   }
}
