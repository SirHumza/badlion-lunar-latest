package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class EmoteService implements Service {
   protected EmoteService() {
   }

   public static Service newReflectiveService(final EmoteService.Interface var0) {
      return new EmoteService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void useEmote(RpcController var1, UseEmoteRequest var2, RpcCallback<UseEmoteResponse> var3) {
            var0.useEmote(var1, var2, var3);
         }

         @Override
         public void stopEmote(RpcController var1, StopEmoteRequest var2, RpcCallback<StopEmoteResponse> var3) {
            var0.stopEmote(var1, var2, var3);
         }

         @Override
         public void updateEquippedEmotes(RpcController var1, UpdateEquippedEmotesRequest var2, RpcCallback<UpdateEquippedEmotesResponse> var3) {
            var0.updateEquippedEmotes(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final EmoteService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return EmoteService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != EmoteService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.useEmote(var2, (UseEmoteRequest)var3);
               case 2:
                  return var0.stopEmote(var2, (StopEmoteRequest)var3);
               case 3:
                  return var0.updateEquippedEmotes(var2, (UpdateEquippedEmotesRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != EmoteService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return UseEmoteRequest.getDefaultInstance();
               case 2:
                  return StopEmoteRequest.getDefaultInstance();
               case 3:
                  return UpdateEquippedEmotesRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != EmoteService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return UseEmoteResponse.getDefaultInstance();
               case 2:
                  return StopEmoteResponse.getDefaultInstance();
               case 3:
                  return UpdateEquippedEmotesResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void useEmote(RpcController var1, UseEmoteRequest var2, RpcCallback<UseEmoteResponse> var3);

   public abstract void stopEmote(RpcController var1, StopEmoteRequest var2, RpcCallback<StopEmoteResponse> var3);

   public abstract void updateEquippedEmotes(RpcController var1, UpdateEquippedEmotesRequest var2, RpcCallback<UpdateEquippedEmotesResponse> var3);

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
            this.useEmote(var2, (UseEmoteRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.stopEmote(var2, (StopEmoteRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.updateEquippedEmotes(var2, (UpdateEquippedEmotesRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UseEmoteRequest.getDefaultInstance();
         case 2:
            return StopEmoteRequest.getDefaultInstance();
         case 3:
            return UpdateEquippedEmotesRequest.getDefaultInstance();
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
            return UseEmoteResponse.getDefaultInstance();
         case 2:
            return StopEmoteResponse.getDefaultInstance();
         case 3:
            return UpdateEquippedEmotesResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static EmoteService.Stub newStub(RpcChannel var0) {
      return new EmoteService.Stub(var0);
   }

   public static EmoteService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new EmoteService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      UseEmoteResponse useEmote(RpcController var1, UseEmoteRequest var2);

      StopEmoteResponse stopEmote(RpcController var1, StopEmoteRequest var2);

      UpdateEquippedEmotesResponse updateEquippedEmotes(RpcController var1, UpdateEquippedEmotesRequest var2);
   }

   private static final class BlockingStub implements EmoteService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(EmoteService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public UseEmoteResponse useEmote(RpcController var1, UseEmoteRequest var2) {
         return (UseEmoteResponse)this.channel
            .callBlockingMethod(EmoteService.getDescriptor().getMethods().get(1), var1, var2, UseEmoteResponse.getDefaultInstance());
      }

      @Override
      public StopEmoteResponse stopEmote(RpcController var1, StopEmoteRequest var2) {
         return (StopEmoteResponse)this.channel
            .callBlockingMethod(EmoteService.getDescriptor().getMethods().get(2), var1, var2, StopEmoteResponse.getDefaultInstance());
      }

      @Override
      public UpdateEquippedEmotesResponse updateEquippedEmotes(RpcController var1, UpdateEquippedEmotesRequest var2) {
         return (UpdateEquippedEmotesResponse)this.channel
            .callBlockingMethod(EmoteService.getDescriptor().getMethods().get(3), var1, var2, UpdateEquippedEmotesResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void useEmote(RpcController var1, UseEmoteRequest var2, RpcCallback<UseEmoteResponse> var3);

      void stopEmote(RpcController var1, StopEmoteRequest var2, RpcCallback<StopEmoteResponse> var3);

      void updateEquippedEmotes(RpcController var1, UpdateEquippedEmotesRequest var2, RpcCallback<UpdateEquippedEmotesResponse> var3);
   }

   public static final class Stub extends EmoteService implements EmoteService.Interface {
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
      public void useEmote(RpcController var1, UseEmoteRequest var2, RpcCallback<UseEmoteResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               UseEmoteResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UseEmoteResponse.class, UseEmoteResponse.getDefaultInstance())
            );
      }

      @Override
      public void stopEmote(RpcController var1, StopEmoteRequest var2, RpcCallback<StopEmoteResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               StopEmoteResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StopEmoteResponse.class, StopEmoteResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateEquippedEmotes(RpcController var1, UpdateEquippedEmotesRequest var2, RpcCallback<UpdateEquippedEmotesResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               UpdateEquippedEmotesResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateEquippedEmotesResponse.class, UpdateEquippedEmotesResponse.getDefaultInstance())
            );
      }
   }
}
