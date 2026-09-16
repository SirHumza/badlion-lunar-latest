package com.lunarclient.websocket.logupload.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class LogUploadService implements Service {
   protected LogUploadService() {
   }

   public static Service newReflectiveService(final LogUploadService.Interface var0) {
      return new LogUploadService() {
         @Override
         public void startLogUpload(RpcController var1, StartLogUploadRequest var2, RpcCallback<StartLogUploadResponse> var3) {
            var0.startLogUpload(var1, var2, var3);
         }

         @Override
         public void completeLogUpload(RpcController var1, CompleteLogUploadRequest var2, RpcCallback<CompleteLogUploadResponse> var3) {
            var0.completeLogUpload(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final LogUploadService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return LogUploadService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != LogUploadService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.startLogUpload(var2, (StartLogUploadRequest)var3);
               case 1:
                  return var0.completeLogUpload(var2, (CompleteLogUploadRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LogUploadService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return StartLogUploadRequest.getDefaultInstance();
               case 1:
                  return CompleteLogUploadRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != LogUploadService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return StartLogUploadResponse.getDefaultInstance();
               case 1:
                  return CompleteLogUploadResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void startLogUpload(RpcController var1, StartLogUploadRequest var2, RpcCallback<StartLogUploadResponse> var3);

   public abstract void completeLogUpload(RpcController var1, CompleteLogUploadRequest var2, RpcCallback<CompleteLogUploadResponse> var3);

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
            this.startLogUpload(var2, (StartLogUploadRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.completeLogUpload(var2, (CompleteLogUploadRequest)var3, RpcUtil.specializeCallback(var4));
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
            return StartLogUploadRequest.getDefaultInstance();
         case 1:
            return CompleteLogUploadRequest.getDefaultInstance();
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
            return StartLogUploadResponse.getDefaultInstance();
         case 1:
            return CompleteLogUploadResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static LogUploadService.Stub newStub(RpcChannel var0) {
      return new LogUploadService.Stub(var0);
   }

   public static LogUploadService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new LogUploadService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      StartLogUploadResponse startLogUpload(RpcController var1, StartLogUploadRequest var2);

      CompleteLogUploadResponse completeLogUpload(RpcController var1, CompleteLogUploadRequest var2);
   }

   private static final class BlockingStub implements LogUploadService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public StartLogUploadResponse startLogUpload(RpcController var1, StartLogUploadRequest var2) {
         return (StartLogUploadResponse)this.channel
            .callBlockingMethod(LogUploadService.getDescriptor().getMethods().get(0), var1, var2, StartLogUploadResponse.getDefaultInstance());
      }

      @Override
      public CompleteLogUploadResponse completeLogUpload(RpcController var1, CompleteLogUploadRequest var2) {
         return (CompleteLogUploadResponse)this.channel
            .callBlockingMethod(LogUploadService.getDescriptor().getMethods().get(1), var1, var2, CompleteLogUploadResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void startLogUpload(RpcController var1, StartLogUploadRequest var2, RpcCallback<StartLogUploadResponse> var3);

      void completeLogUpload(RpcController var1, CompleteLogUploadRequest var2, RpcCallback<CompleteLogUploadResponse> var3);
   }

   public static final class Stub extends LogUploadService implements LogUploadService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void startLogUpload(RpcController var1, StartLogUploadRequest var2, RpcCallback<StartLogUploadResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               StartLogUploadResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StartLogUploadResponse.class, StartLogUploadResponse.getDefaultInstance())
            );
      }

      @Override
      public void completeLogUpload(RpcController var1, CompleteLogUploadRequest var2, RpcCallback<CompleteLogUploadResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               CompleteLogUploadResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CompleteLogUploadResponse.class, CompleteLogUploadResponse.getDefaultInstance())
            );
      }
   }
}
