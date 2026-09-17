package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class NotificationService implements Service {
   protected NotificationService() {
   }

   public static Service newReflectiveService(final NotificationService.Interface var0) {
      return new NotificationService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void openNotification(RpcController var1, OpenNotificationRequest var2, RpcCallback<OpenNotificationResponse> var3) {
            var0.openNotification(var1, var2, var3);
         }

         @Override
         public void markAllNotificationsAsRead(
            RpcController var1, MarkAllNotificationsAsReadRequest var2, RpcCallback<MarkAllNotificationsAsReadResponse> var3
         ) {
            var0.markAllNotificationsAsRead(var1, var2, var3);
         }

         @Override
         public void openAlert(RpcController var1, OpenAlertRequest var2, RpcCallback<OpenAlertResponse> var3) {
            var0.openAlert(var1, var2, var3);
         }

         @Override
         public void deleteNotification(RpcController var1, DeleteNotificationRequest var2, RpcCallback<DeleteNotificationResponse> var3) {
            var0.deleteNotification(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final NotificationService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return NotificationService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != NotificationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.openNotification(var2, (OpenNotificationRequest)var3);
               case 2:
                  return var0.markAllNotificationsAsRead(var2, (MarkAllNotificationsAsReadRequest)var3);
               case 3:
                  return var0.openAlert(var2, (OpenAlertRequest)var3);
               case 4:
                  return var0.deleteNotification(var2, (DeleteNotificationRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != NotificationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return OpenNotificationRequest.getDefaultInstance();
               case 2:
                  return MarkAllNotificationsAsReadRequest.getDefaultInstance();
               case 3:
                  return OpenAlertRequest.getDefaultInstance();
               case 4:
                  return DeleteNotificationRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != NotificationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return OpenNotificationResponse.getDefaultInstance();
               case 2:
                  return MarkAllNotificationsAsReadResponse.getDefaultInstance();
               case 3:
                  return OpenAlertResponse.getDefaultInstance();
               case 4:
                  return DeleteNotificationResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void openNotification(RpcController var1, OpenNotificationRequest var2, RpcCallback<OpenNotificationResponse> var3);

   public abstract void markAllNotificationsAsRead(
      RpcController var1, MarkAllNotificationsAsReadRequest var2, RpcCallback<MarkAllNotificationsAsReadResponse> var3
   );

   public abstract void openAlert(RpcController var1, OpenAlertRequest var2, RpcCallback<OpenAlertResponse> var3);

   public abstract void deleteNotification(RpcController var1, DeleteNotificationRequest var2, RpcCallback<DeleteNotificationResponse> var3);

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
            this.openNotification(var2, (OpenNotificationRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.markAllNotificationsAsRead(var2, (MarkAllNotificationsAsReadRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.openAlert(var2, (OpenAlertRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.deleteNotification(var2, (DeleteNotificationRequest)var3, RpcUtil.specializeCallback(var4));
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
            return OpenNotificationRequest.getDefaultInstance();
         case 2:
            return MarkAllNotificationsAsReadRequest.getDefaultInstance();
         case 3:
            return OpenAlertRequest.getDefaultInstance();
         case 4:
            return DeleteNotificationRequest.getDefaultInstance();
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
            return OpenNotificationResponse.getDefaultInstance();
         case 2:
            return MarkAllNotificationsAsReadResponse.getDefaultInstance();
         case 3:
            return OpenAlertResponse.getDefaultInstance();
         case 4:
            return DeleteNotificationResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static NotificationService.Stub newStub(RpcChannel var0) {
      return new NotificationService.Stub(var0);
   }

   public static NotificationService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new NotificationService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      OpenNotificationResponse openNotification(RpcController var1, OpenNotificationRequest var2);

      MarkAllNotificationsAsReadResponse markAllNotificationsAsRead(RpcController var1, MarkAllNotificationsAsReadRequest var2);

      OpenAlertResponse openAlert(RpcController var1, OpenAlertRequest var2);

      DeleteNotificationResponse deleteNotification(RpcController var1, DeleteNotificationRequest var2);
   }

   private static final class BlockingStub implements NotificationService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(NotificationService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public OpenNotificationResponse openNotification(RpcController var1, OpenNotificationRequest var2) {
         return (OpenNotificationResponse)this.channel
            .callBlockingMethod(NotificationService.getDescriptor().getMethods().get(1), var1, var2, OpenNotificationResponse.getDefaultInstance());
      }

      @Override
      public MarkAllNotificationsAsReadResponse markAllNotificationsAsRead(RpcController var1, MarkAllNotificationsAsReadRequest var2) {
         return (MarkAllNotificationsAsReadResponse)this.channel
            .callBlockingMethod(NotificationService.getDescriptor().getMethods().get(2), var1, var2, MarkAllNotificationsAsReadResponse.getDefaultInstance());
      }

      @Override
      public OpenAlertResponse openAlert(RpcController var1, OpenAlertRequest var2) {
         return (OpenAlertResponse)this.channel
            .callBlockingMethod(NotificationService.getDescriptor().getMethods().get(3), var1, var2, OpenAlertResponse.getDefaultInstance());
      }

      @Override
      public DeleteNotificationResponse deleteNotification(RpcController var1, DeleteNotificationRequest var2) {
         return (DeleteNotificationResponse)this.channel
            .callBlockingMethod(NotificationService.getDescriptor().getMethods().get(4), var1, var2, DeleteNotificationResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void openNotification(RpcController var1, OpenNotificationRequest var2, RpcCallback<OpenNotificationResponse> var3);

      void markAllNotificationsAsRead(RpcController var1, MarkAllNotificationsAsReadRequest var2, RpcCallback<MarkAllNotificationsAsReadResponse> var3);

      void openAlert(RpcController var1, OpenAlertRequest var2, RpcCallback<OpenAlertResponse> var3);

      void deleteNotification(RpcController var1, DeleteNotificationRequest var2, RpcCallback<DeleteNotificationResponse> var3);
   }

   public static final class Stub extends NotificationService implements NotificationService.Interface {
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
      public void openNotification(RpcController var1, OpenNotificationRequest var2, RpcCallback<OpenNotificationResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               OpenNotificationResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, OpenNotificationResponse.class, OpenNotificationResponse.getDefaultInstance())
            );
      }

      @Override
      public void markAllNotificationsAsRead(RpcController var1, MarkAllNotificationsAsReadRequest var2, RpcCallback<MarkAllNotificationsAsReadResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               MarkAllNotificationsAsReadResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, MarkAllNotificationsAsReadResponse.class, MarkAllNotificationsAsReadResponse.getDefaultInstance())
            );
      }

      @Override
      public void openAlert(RpcController var1, OpenAlertRequest var2, RpcCallback<OpenAlertResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               OpenAlertResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, OpenAlertResponse.class, OpenAlertResponse.getDefaultInstance())
            );
      }

      @Override
      public void deleteNotification(RpcController var1, DeleteNotificationRequest var2, RpcCallback<DeleteNotificationResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               DeleteNotificationResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DeleteNotificationResponse.class, DeleteNotificationResponse.getDefaultInstance())
            );
      }
   }
}
