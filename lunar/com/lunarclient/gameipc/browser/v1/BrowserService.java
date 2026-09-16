package com.lunarclient.gameipc.browser.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class BrowserService implements Service {
   protected BrowserService() {
   }

   public static Service newReflectiveService(final BrowserService.Interface var0) {
      return new BrowserService() {
         @Override
         public void openUrl(RpcController var1, OpenUrlRequest var2, RpcCallback<OpenUrlResponse> var3) {
            var0.openUrl(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final BrowserService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return BrowserService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != BrowserService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.openUrl(var2, (OpenUrlRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != BrowserService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return OpenUrlRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != BrowserService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return OpenUrlResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void openUrl(RpcController var1, OpenUrlRequest var2, RpcCallback<OpenUrlResponse> var3);

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
            this.openUrl(var2, (OpenUrlRequest)var3, RpcUtil.specializeCallback(var4));
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
            return OpenUrlRequest.getDefaultInstance();
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
            return OpenUrlResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static BrowserService.Stub newStub(RpcChannel var0) {
      return new BrowserService.Stub(var0);
   }

   public static BrowserService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new BrowserService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      OpenUrlResponse openUrl(RpcController var1, OpenUrlRequest var2);
   }

   private static final class BlockingStub implements BrowserService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public OpenUrlResponse openUrl(RpcController var1, OpenUrlRequest var2) {
         return (OpenUrlResponse)this.channel
            .callBlockingMethod(BrowserService.getDescriptor().getMethods().get(0), var1, var2, OpenUrlResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void openUrl(RpcController var1, OpenUrlRequest var2, RpcCallback<OpenUrlResponse> var3);
   }

   public static final class Stub extends BrowserService implements BrowserService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void openUrl(RpcController var1, OpenUrlRequest var2, RpcCallback<OpenUrlResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               OpenUrlResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, OpenUrlResponse.class, OpenUrlResponse.getDefaultInstance())
            );
      }
   }
}
