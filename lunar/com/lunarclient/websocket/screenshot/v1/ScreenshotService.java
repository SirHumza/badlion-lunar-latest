package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class ScreenshotService implements Service {
   protected ScreenshotService() {
   }

   public static Service newReflectiveService(final ScreenshotService.Interface var0) {
      return new ScreenshotService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void recordScreenshot(RpcController var1, RecordScreenshotRequest var2, RpcCallback<RecordScreenshotResponse> var3) {
            var0.recordScreenshot(var1, var2, var3);
         }

         @Override
         public void setDefaultUploadPrivacy(RpcController var1, SetDefaultUploadPrivacyRequest var2, RpcCallback<SetDefaultUploadPrivacyResponse> var3) {
            var0.setDefaultUploadPrivacy(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final ScreenshotService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return ScreenshotService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != ScreenshotService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.recordScreenshot(var2, (RecordScreenshotRequest)var3);
               case 2:
                  return var0.setDefaultUploadPrivacy(var2, (SetDefaultUploadPrivacyRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ScreenshotService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return RecordScreenshotRequest.getDefaultInstance();
               case 2:
                  return SetDefaultUploadPrivacyRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ScreenshotService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return RecordScreenshotResponse.getDefaultInstance();
               case 2:
                  return SetDefaultUploadPrivacyResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void recordScreenshot(RpcController var1, RecordScreenshotRequest var2, RpcCallback<RecordScreenshotResponse> var3);

   public abstract void setDefaultUploadPrivacy(RpcController var1, SetDefaultUploadPrivacyRequest var2, RpcCallback<SetDefaultUploadPrivacyResponse> var3);

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
            this.recordScreenshot(var2, (RecordScreenshotRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.setDefaultUploadPrivacy(var2, (SetDefaultUploadPrivacyRequest)var3, RpcUtil.specializeCallback(var4));
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
            return RecordScreenshotRequest.getDefaultInstance();
         case 2:
            return SetDefaultUploadPrivacyRequest.getDefaultInstance();
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
            return RecordScreenshotResponse.getDefaultInstance();
         case 2:
            return SetDefaultUploadPrivacyResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static ScreenshotService.Stub newStub(RpcChannel var0) {
      return new ScreenshotService.Stub(var0);
   }

   public static ScreenshotService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new ScreenshotService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      RecordScreenshotResponse recordScreenshot(RpcController var1, RecordScreenshotRequest var2);

      SetDefaultUploadPrivacyResponse setDefaultUploadPrivacy(RpcController var1, SetDefaultUploadPrivacyRequest var2);
   }

   private static final class BlockingStub implements ScreenshotService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(ScreenshotService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public RecordScreenshotResponse recordScreenshot(RpcController var1, RecordScreenshotRequest var2) {
         return (RecordScreenshotResponse)this.channel
            .callBlockingMethod(ScreenshotService.getDescriptor().getMethods().get(1), var1, var2, RecordScreenshotResponse.getDefaultInstance());
      }

      @Override
      public SetDefaultUploadPrivacyResponse setDefaultUploadPrivacy(RpcController var1, SetDefaultUploadPrivacyRequest var2) {
         return (SetDefaultUploadPrivacyResponse)this.channel
            .callBlockingMethod(ScreenshotService.getDescriptor().getMethods().get(2), var1, var2, SetDefaultUploadPrivacyResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void recordScreenshot(RpcController var1, RecordScreenshotRequest var2, RpcCallback<RecordScreenshotResponse> var3);

      void setDefaultUploadPrivacy(RpcController var1, SetDefaultUploadPrivacyRequest var2, RpcCallback<SetDefaultUploadPrivacyResponse> var3);
   }

   public static final class Stub extends ScreenshotService implements ScreenshotService.Interface {
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
      public void recordScreenshot(RpcController var1, RecordScreenshotRequest var2, RpcCallback<RecordScreenshotResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               RecordScreenshotResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RecordScreenshotResponse.class, RecordScreenshotResponse.getDefaultInstance())
            );
      }

      @Override
      public void setDefaultUploadPrivacy(RpcController var1, SetDefaultUploadPrivacyRequest var2, RpcCallback<SetDefaultUploadPrivacyResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               SetDefaultUploadPrivacyResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetDefaultUploadPrivacyResponse.class, SetDefaultUploadPrivacyResponse.getDefaultInstance())
            );
      }
   }
}
