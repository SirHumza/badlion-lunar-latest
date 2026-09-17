package com.lunarclient.websocket.language.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class LanguageService implements Service {
   protected LanguageService() {
   }

   public static Service newReflectiveService(final LanguageService.Interface var0) {
      return new LanguageService() {
         @Override
         public void updateLanguage(RpcController var1, UpdateLanguageRequest var2, RpcCallback<UpdateLanguageResponse> var3) {
            var0.updateLanguage(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final LanguageService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return LanguageService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != LanguageService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.updateLanguage(var2, (UpdateLanguageRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LanguageService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return UpdateLanguageRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LanguageService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return UpdateLanguageResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void updateLanguage(RpcController var1, UpdateLanguageRequest var2, RpcCallback<UpdateLanguageResponse> var3);

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
            this.updateLanguage(var2, (UpdateLanguageRequest)var3, RpcUtil.specializeCallback(var4));
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
            return UpdateLanguageRequest.getDefaultInstance();
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
            return UpdateLanguageResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static LanguageService.Stub newStub(RpcChannel var0) {
      return new LanguageService.Stub(var0);
   }

   public static LanguageService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new LanguageService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      UpdateLanguageResponse updateLanguage(RpcController var1, UpdateLanguageRequest var2);
   }

   private static final class BlockingStub implements LanguageService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public UpdateLanguageResponse updateLanguage(RpcController var1, UpdateLanguageRequest var2) {
         return (UpdateLanguageResponse)this.channel
            .callBlockingMethod(LanguageService.getDescriptor().getMethods().get(0), var1, var2, UpdateLanguageResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void updateLanguage(RpcController var1, UpdateLanguageRequest var2, RpcCallback<UpdateLanguageResponse> var3);
   }

   public static final class Stub extends LanguageService implements LanguageService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void updateLanguage(RpcController var1, UpdateLanguageRequest var2, RpcCallback<UpdateLanguageResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               UpdateLanguageResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateLanguageResponse.class, UpdateLanguageResponse.getDefaultInstance())
            );
      }
   }
}
