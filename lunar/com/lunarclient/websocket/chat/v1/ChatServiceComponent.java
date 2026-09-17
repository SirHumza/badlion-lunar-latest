package com.lunarclient.websocket.chat.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class ChatService implements Service {
   protected ChatService() {
   }

   public static Service newReflectiveService(final ChatService.Interface var0) {
      return new ChatService() {
         @Override
         public void sendChat(RpcController var1, SendChatRequest var2, RpcCallback<SendChatResponse> var3) {
            var0.sendChat(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final ChatService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return ChatService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != ChatService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.sendChat(var2, (SendChatRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ChatService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return SendChatRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ChatService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return SendChatResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void sendChat(RpcController var1, SendChatRequest var2, RpcCallback<SendChatResponse> var3);

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
            this.sendChat(var2, (SendChatRequest)var3, RpcUtil.specializeCallback(var4));
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
            return SendChatRequest.getDefaultInstance();
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
            return SendChatResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static ChatService.Stub newStub(RpcChannel var0) {
      return new ChatService.Stub(var0);
   }

   public static ChatService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new ChatService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      SendChatResponse sendChat(RpcController var1, SendChatRequest var2);
   }

   private static final class BlockingStub implements ChatService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public SendChatResponse sendChat(RpcController var1, SendChatRequest var2) {
         return (SendChatResponse)this.channel
            .callBlockingMethod(ChatService.getDescriptor().getMethods().get(0), var1, var2, SendChatResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void sendChat(RpcController var1, SendChatRequest var2, RpcCallback<SendChatResponse> var3);
   }

   public static final class Stub extends ChatService implements ChatService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void sendChat(RpcController var1, SendChatRequest var2, RpcCallback<SendChatResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               SendChatResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SendChatResponse.class, SendChatResponse.getDefaultInstance())
            );
      }
   }
}
