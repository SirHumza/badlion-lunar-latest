package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class PerformanceService implements Service {
   protected PerformanceService() {
   }

   public static Service newReflectiveService(final PerformanceService.Interface var0) {
      return new PerformanceService() {
         @Override
         public void recordPerfSnapshot(RpcController var1, RecordPerfSnapshotRequest var2, RpcCallback<RecordPerfSnapshotResponse> var3) {
            var0.recordPerfSnapshot(var1, var2, var3);
         }

         @Override
         public void startJfrUpload(RpcController var1, StartJfrUploadRequest var2, RpcCallback<StartJfrUploadResponse> var3) {
            var0.startJfrUpload(var1, var2, var3);
         }

         @Override
         public void completeJfrUpload(RpcController var1, CompleteJfrUploadRequest var2, RpcCallback<CompleteJfrUploadResponse> var3) {
            var0.completeJfrUpload(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final PerformanceService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return PerformanceService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != PerformanceService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.recordPerfSnapshot(var2, (RecordPerfSnapshotRequest)var3);
               case 1:
                  return var0.startJfrUpload(var2, (StartJfrUploadRequest)var3);
               case 2:
                  return var0.completeJfrUpload(var2, (CompleteJfrUploadRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != PerformanceService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return RecordPerfSnapshotRequest.getDefaultInstance();
               case 1:
                  return StartJfrUploadRequest.getDefaultInstance();
               case 2:
                  return CompleteJfrUploadRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != PerformanceService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return RecordPerfSnapshotResponse.getDefaultInstance();
               case 1:
                  return StartJfrUploadResponse.getDefaultInstance();
               case 2:
                  return CompleteJfrUploadResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void recordPerfSnapshot(RpcController var1, RecordPerfSnapshotRequest var2, RpcCallback<RecordPerfSnapshotResponse> var3);

   public abstract void startJfrUpload(RpcController var1, StartJfrUploadRequest var2, RpcCallback<StartJfrUploadResponse> var3);

   public abstract void completeJfrUpload(RpcController var1, CompleteJfrUploadRequest var2, RpcCallback<CompleteJfrUploadResponse> var3);

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
            this.recordPerfSnapshot(var2, (RecordPerfSnapshotRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 1:
            this.startJfrUpload(var2, (StartJfrUploadRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.completeJfrUpload(var2, (CompleteJfrUploadRequest)var3, RpcUtil.specializeCallback(var4));
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
            return RecordPerfSnapshotRequest.getDefaultInstance();
         case 1:
            return StartJfrUploadRequest.getDefaultInstance();
         case 2:
            return CompleteJfrUploadRequest.getDefaultInstance();
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
            return RecordPerfSnapshotResponse.getDefaultInstance();
         case 1:
            return StartJfrUploadResponse.getDefaultInstance();
         case 2:
            return CompleteJfrUploadResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static PerformanceService.Stub newStub(RpcChannel var0) {
      return new PerformanceService.Stub(var0);
   }

   public static PerformanceService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new PerformanceService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      RecordPerfSnapshotResponse recordPerfSnapshot(RpcController var1, RecordPerfSnapshotRequest var2);

      StartJfrUploadResponse startJfrUpload(RpcController var1, StartJfrUploadRequest var2);

      CompleteJfrUploadResponse completeJfrUpload(RpcController var1, CompleteJfrUploadRequest var2);
   }

   private static final class BlockingStub implements PerformanceService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public RecordPerfSnapshotResponse recordPerfSnapshot(RpcController var1, RecordPerfSnapshotRequest var2) {
         return (RecordPerfSnapshotResponse)this.channel
            .callBlockingMethod(PerformanceService.getDescriptor().getMethods().get(0), var1, var2, RecordPerfSnapshotResponse.getDefaultInstance());
      }

      @Override
      public StartJfrUploadResponse startJfrUpload(RpcController var1, StartJfrUploadRequest var2) {
         return (StartJfrUploadResponse)this.channel
            .callBlockingMethod(PerformanceService.getDescriptor().getMethods().get(1), var1, var2, StartJfrUploadResponse.getDefaultInstance());
      }

      @Override
      public CompleteJfrUploadResponse completeJfrUpload(RpcController var1, CompleteJfrUploadRequest var2) {
         return (CompleteJfrUploadResponse)this.channel
            .callBlockingMethod(PerformanceService.getDescriptor().getMethods().get(2), var1, var2, CompleteJfrUploadResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void recordPerfSnapshot(RpcController var1, RecordPerfSnapshotRequest var2, RpcCallback<RecordPerfSnapshotResponse> var3);

      void startJfrUpload(RpcController var1, StartJfrUploadRequest var2, RpcCallback<StartJfrUploadResponse> var3);

      void completeJfrUpload(RpcController var1, CompleteJfrUploadRequest var2, RpcCallback<CompleteJfrUploadResponse> var3);
   }

   public static final class Stub extends PerformanceService implements PerformanceService.Interface {
      private final RpcChannel channel;

      private Stub(RpcChannel var1) {
         this.channel = var1;
      }

      public RpcChannel getChannel() {
         return this.channel;
      }

      @Override
      public void recordPerfSnapshot(RpcController var1, RecordPerfSnapshotRequest var2, RpcCallback<RecordPerfSnapshotResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(0),
               var1,
               var2,
               RecordPerfSnapshotResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordPerfSnapshotResponse.class, RecordPerfSnapshotResponse.getDefaultInstance())
            );
      }

      @Override
      public void startJfrUpload(RpcController var1, StartJfrUploadRequest var2, RpcCallback<StartJfrUploadResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               StartJfrUploadResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, StartJfrUploadResponse.class, StartJfrUploadResponse.getDefaultInstance())
            );
      }

      @Override
      public void completeJfrUpload(RpcController var1, CompleteJfrUploadRequest var2, RpcCallback<CompleteJfrUploadResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               CompleteJfrUploadResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CompleteJfrUploadResponse.class, CompleteJfrUploadResponse.getDefaultInstance())
            );
      }
   }
}
