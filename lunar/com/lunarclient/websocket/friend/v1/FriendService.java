package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class FriendService implements Service {
   protected FriendService() {
   }

   public static Service newReflectiveService(final FriendService.Interface var0) {
      return new FriendService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void broadcastLocationChange(RpcController var1, BroadcastLocationChangeRequest var2, RpcCallback<BroadcastLocationChangeResponse> var3) {
            var0.broadcastLocationChange(var1, var2, var3);
         }

         @Override
         public void broadcastStatusChange(RpcController var1, BroadcastStatusChangeRequest var2, RpcCallback<BroadcastStatusChangeResponse> var3) {
            var0.broadcastStatusChange(var1, var2, var3);
         }

         @Override
         public void broadcastServerKick(RpcController var1, BroadcastServerKickRequest var2, RpcCallback<BroadcastServerKickResponse> var3) {
            var0.broadcastServerKick(var1, var2, var3);
         }

         @Override
         public void removeFriend(RpcController var1, RemoveFriendRequest var2, RpcCallback<RemoveFriendResponse> var3) {
            var0.removeFriend(var1, var2, var3);
         }

         @Override
         public void toggleFriendRequests(RpcController var1, ToggleFriendRequestsRequest var2, RpcCallback<ToggleFriendRequestsResponse> var3) {
            var0.toggleFriendRequests(var1, var2, var3);
         }

         @Override
         public void sendFriendRequest(RpcController var1, SendFriendRequestRequest var2, RpcCallback<SendFriendRequestResponse> var3) {
            var0.sendFriendRequest(var1, var2, var3);
         }

         @Override
         public void cancelFriendRequest(RpcController var1, CancelFriendRequestRequest var2, RpcCallback<CancelFriendRequestResponse> var3) {
            var0.cancelFriendRequest(var1, var2, var3);
         }

         @Override
         public void acceptFriendRequest(RpcController var1, AcceptFriendRequestRequest var2, RpcCallback<AcceptFriendRequestResponse> var3) {
            var0.acceptFriendRequest(var1, var2, var3);
         }

         @Override
         public void denyFriendRequest(RpcController var1, DenyFriendRequestRequest var2, RpcCallback<DenyFriendRequestResponse> var3) {
            var0.denyFriendRequest(var1, var2, var3);
         }

         @Override
         public void addFriendPin(RpcController var1, AddFriendPinRequest var2, RpcCallback<AddFriendPinResponse> var3) {
            var0.addFriendPin(var1, var2, var3);
         }

         @Override
         public void removeFriendPin(RpcController var1, RemoveFriendPinRequest var2, RpcCallback<RemoveFriendPinResponse> var3) {
            var0.removeFriendPin(var1, var2, var3);
         }

         @Override
         public void setLastSeenVisibility(RpcController var1, SetLastSeenVisibilityRequest var2, RpcCallback<SetLastSeenVisibilityResponse> var3) {
            var0.setLastSeenVisibility(var1, var2, var3);
         }

         @Override
         public void setCountryFlagVisibility(RpcController var1, SetCountryFlagVisibilityRequest var2, RpcCallback<SetCountryFlagVisibilityResponse> var3) {
            var0.setCountryFlagVisibility(var1, var2, var3);
         }

         @Override
         public void setGroupChatInvitePrivacy(RpcController var1, SetGroupChatInvitePrivacyRequest var2, RpcCallback<SetGroupChatInvitePrivacyResponse> var3) {
            var0.setGroupChatInvitePrivacy(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final FriendService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return FriendService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != FriendService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.broadcastLocationChange(var2, (BroadcastLocationChangeRequest)var3);
               case 2:
                  return var0.broadcastStatusChange(var2, (BroadcastStatusChangeRequest)var3);
               case 3:
                  return var0.broadcastServerKick(var2, (BroadcastServerKickRequest)var3);
               case 4:
                  return var0.removeFriend(var2, (RemoveFriendRequest)var3);
               case 5:
                  return var0.toggleFriendRequests(var2, (ToggleFriendRequestsRequest)var3);
               case 6:
                  return var0.sendFriendRequest(var2, (SendFriendRequestRequest)var3);
               case 7:
                  return var0.cancelFriendRequest(var2, (CancelFriendRequestRequest)var3);
               case 8:
                  return var0.acceptFriendRequest(var2, (AcceptFriendRequestRequest)var3);
               case 9:
                  return var0.denyFriendRequest(var2, (DenyFriendRequestRequest)var3);
               case 10:
                  return var0.addFriendPin(var2, (AddFriendPinRequest)var3);
               case 11:
                  return var0.removeFriendPin(var2, (RemoveFriendPinRequest)var3);
               case 12:
                  return var0.setLastSeenVisibility(var2, (SetLastSeenVisibilityRequest)var3);
               case 13:
                  return var0.setCountryFlagVisibility(var2, (SetCountryFlagVisibilityRequest)var3);
               case 14:
                  return var0.setGroupChatInvitePrivacy(var2, (SetGroupChatInvitePrivacyRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != FriendService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return BroadcastLocationChangeRequest.getDefaultInstance();
               case 2:
                  return BroadcastStatusChangeRequest.getDefaultInstance();
               case 3:
                  return BroadcastServerKickRequest.getDefaultInstance();
               case 4:
                  return RemoveFriendRequest.getDefaultInstance();
               case 5:
                  return ToggleFriendRequestsRequest.getDefaultInstance();
               case 6:
                  return SendFriendRequestRequest.getDefaultInstance();
               case 7:
                  return CancelFriendRequestRequest.getDefaultInstance();
               case 8:
                  return AcceptFriendRequestRequest.getDefaultInstance();
               case 9:
                  return DenyFriendRequestRequest.getDefaultInstance();
               case 10:
                  return AddFriendPinRequest.getDefaultInstance();
               case 11:
                  return RemoveFriendPinRequest.getDefaultInstance();
               case 12:
                  return SetLastSeenVisibilityRequest.getDefaultInstance();
               case 13:
                  return SetCountryFlagVisibilityRequest.getDefaultInstance();
               case 14:
                  return SetGroupChatInvitePrivacyRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != FriendService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return BroadcastLocationChangeResponse.getDefaultInstance();
               case 2:
                  return BroadcastStatusChangeResponse.getDefaultInstance();
               case 3:
                  return BroadcastServerKickResponse.getDefaultInstance();
               case 4:
                  return RemoveFriendResponse.getDefaultInstance();
               case 5:
                  return ToggleFriendRequestsResponse.getDefaultInstance();
               case 6:
                  return SendFriendRequestResponse.getDefaultInstance();
               case 7:
                  return CancelFriendRequestResponse.getDefaultInstance();
               case 8:
                  return AcceptFriendRequestResponse.getDefaultInstance();
               case 9:
                  return DenyFriendRequestResponse.getDefaultInstance();
               case 10:
                  return AddFriendPinResponse.getDefaultInstance();
               case 11:
                  return RemoveFriendPinResponse.getDefaultInstance();
               case 12:
                  return SetLastSeenVisibilityResponse.getDefaultInstance();
               case 13:
                  return SetCountryFlagVisibilityResponse.getDefaultInstance();
               case 14:
                  return SetGroupChatInvitePrivacyResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void broadcastLocationChange(RpcController var1, BroadcastLocationChangeRequest var2, RpcCallback<BroadcastLocationChangeResponse> var3);

   public abstract void broadcastStatusChange(RpcController var1, BroadcastStatusChangeRequest var2, RpcCallback<BroadcastStatusChangeResponse> var3);

   public abstract void broadcastServerKick(RpcController var1, BroadcastServerKickRequest var2, RpcCallback<BroadcastServerKickResponse> var3);

   public abstract void removeFriend(RpcController var1, RemoveFriendRequest var2, RpcCallback<RemoveFriendResponse> var3);

   public abstract void toggleFriendRequests(RpcController var1, ToggleFriendRequestsRequest var2, RpcCallback<ToggleFriendRequestsResponse> var3);

   public abstract void sendFriendRequest(RpcController var1, SendFriendRequestRequest var2, RpcCallback<SendFriendRequestResponse> var3);

   public abstract void cancelFriendRequest(RpcController var1, CancelFriendRequestRequest var2, RpcCallback<CancelFriendRequestResponse> var3);

   public abstract void acceptFriendRequest(RpcController var1, AcceptFriendRequestRequest var2, RpcCallback<AcceptFriendRequestResponse> var3);

   public abstract void denyFriendRequest(RpcController var1, DenyFriendRequestRequest var2, RpcCallback<DenyFriendRequestResponse> var3);

   public abstract void addFriendPin(RpcController var1, AddFriendPinRequest var2, RpcCallback<AddFriendPinResponse> var3);

   public abstract void removeFriendPin(RpcController var1, RemoveFriendPinRequest var2, RpcCallback<RemoveFriendPinResponse> var3);

   public abstract void setLastSeenVisibility(RpcController var1, SetLastSeenVisibilityRequest var2, RpcCallback<SetLastSeenVisibilityResponse> var3);

   public abstract void setCountryFlagVisibility(RpcController var1, SetCountryFlagVisibilityRequest var2, RpcCallback<SetCountryFlagVisibilityResponse> var3);

   public abstract void setGroupChatInvitePrivacy(
      RpcController var1, SetGroupChatInvitePrivacyRequest var2, RpcCallback<SetGroupChatInvitePrivacyResponse> var3
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
            this.broadcastLocationChange(var2, (BroadcastLocationChangeRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.broadcastStatusChange(var2, (BroadcastStatusChangeRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.broadcastServerKick(var2, (BroadcastServerKickRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.removeFriend(var2, (RemoveFriendRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.toggleFriendRequests(var2, (ToggleFriendRequestsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 6:
            this.sendFriendRequest(var2, (SendFriendRequestRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 7:
            this.cancelFriendRequest(var2, (CancelFriendRequestRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 8:
            this.acceptFriendRequest(var2, (AcceptFriendRequestRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 9:
            this.denyFriendRequest(var2, (DenyFriendRequestRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 10:
            this.addFriendPin(var2, (AddFriendPinRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 11:
            this.removeFriendPin(var2, (RemoveFriendPinRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 12:
            this.setLastSeenVisibility(var2, (SetLastSeenVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 13:
            this.setCountryFlagVisibility(var2, (SetCountryFlagVisibilityRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 14:
            this.setGroupChatInvitePrivacy(var2, (SetGroupChatInvitePrivacyRequest)var3, RpcUtil.specializeCallback(var4));
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
            return BroadcastLocationChangeRequest.getDefaultInstance();
         case 2:
            return BroadcastStatusChangeRequest.getDefaultInstance();
         case 3:
            return BroadcastServerKickRequest.getDefaultInstance();
         case 4:
            return RemoveFriendRequest.getDefaultInstance();
         case 5:
            return ToggleFriendRequestsRequest.getDefaultInstance();
         case 6:
            return SendFriendRequestRequest.getDefaultInstance();
         case 7:
            return CancelFriendRequestRequest.getDefaultInstance();
         case 8:
            return AcceptFriendRequestRequest.getDefaultInstance();
         case 9:
            return DenyFriendRequestRequest.getDefaultInstance();
         case 10:
            return AddFriendPinRequest.getDefaultInstance();
         case 11:
            return RemoveFriendPinRequest.getDefaultInstance();
         case 12:
            return SetLastSeenVisibilityRequest.getDefaultInstance();
         case 13:
            return SetCountryFlagVisibilityRequest.getDefaultInstance();
         case 14:
            return SetGroupChatInvitePrivacyRequest.getDefaultInstance();
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
            return BroadcastLocationChangeResponse.getDefaultInstance();
         case 2:
            return BroadcastStatusChangeResponse.getDefaultInstance();
         case 3:
            return BroadcastServerKickResponse.getDefaultInstance();
         case 4:
            return RemoveFriendResponse.getDefaultInstance();
         case 5:
            return ToggleFriendRequestsResponse.getDefaultInstance();
         case 6:
            return SendFriendRequestResponse.getDefaultInstance();
         case 7:
            return CancelFriendRequestResponse.getDefaultInstance();
         case 8:
            return AcceptFriendRequestResponse.getDefaultInstance();
         case 9:
            return DenyFriendRequestResponse.getDefaultInstance();
         case 10:
            return AddFriendPinResponse.getDefaultInstance();
         case 11:
            return RemoveFriendPinResponse.getDefaultInstance();
         case 12:
            return SetLastSeenVisibilityResponse.getDefaultInstance();
         case 13:
            return SetCountryFlagVisibilityResponse.getDefaultInstance();
         case 14:
            return SetGroupChatInvitePrivacyResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static FriendService.Stub newStub(RpcChannel var0) {
      return new FriendService.Stub(var0);
   }

   public static FriendService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new FriendService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      BroadcastLocationChangeResponse broadcastLocationChange(RpcController var1, BroadcastLocationChangeRequest var2);

      BroadcastStatusChangeResponse broadcastStatusChange(RpcController var1, BroadcastStatusChangeRequest var2);

      BroadcastServerKickResponse broadcastServerKick(RpcController var1, BroadcastServerKickRequest var2);

      RemoveFriendResponse removeFriend(RpcController var1, RemoveFriendRequest var2);

      ToggleFriendRequestsResponse toggleFriendRequests(RpcController var1, ToggleFriendRequestsRequest var2);

      SendFriendRequestResponse sendFriendRequest(RpcController var1, SendFriendRequestRequest var2);

      CancelFriendRequestResponse cancelFriendRequest(RpcController var1, CancelFriendRequestRequest var2);

      AcceptFriendRequestResponse acceptFriendRequest(RpcController var1, AcceptFriendRequestRequest var2);

      DenyFriendRequestResponse denyFriendRequest(RpcController var1, DenyFriendRequestRequest var2);

      AddFriendPinResponse addFriendPin(RpcController var1, AddFriendPinRequest var2);

      RemoveFriendPinResponse removeFriendPin(RpcController var1, RemoveFriendPinRequest var2);

      SetLastSeenVisibilityResponse setLastSeenVisibility(RpcController var1, SetLastSeenVisibilityRequest var2);

      SetCountryFlagVisibilityResponse setCountryFlagVisibility(RpcController var1, SetCountryFlagVisibilityRequest var2);

      SetGroupChatInvitePrivacyResponse setGroupChatInvitePrivacy(RpcController var1, SetGroupChatInvitePrivacyRequest var2);
   }

   private static final class BlockingStub implements FriendService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public BroadcastLocationChangeResponse broadcastLocationChange(RpcController var1, BroadcastLocationChangeRequest var2) {
         return (BroadcastLocationChangeResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(1), var1, var2, BroadcastLocationChangeResponse.getDefaultInstance());
      }

      @Override
      public BroadcastStatusChangeResponse broadcastStatusChange(RpcController var1, BroadcastStatusChangeRequest var2) {
         return (BroadcastStatusChangeResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(2), var1, var2, BroadcastStatusChangeResponse.getDefaultInstance());
      }

      @Override
      public BroadcastServerKickResponse broadcastServerKick(RpcController var1, BroadcastServerKickRequest var2) {
         return (BroadcastServerKickResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(3), var1, var2, BroadcastServerKickResponse.getDefaultInstance());
      }

      @Override
      public RemoveFriendResponse removeFriend(RpcController var1, RemoveFriendRequest var2) {
         return (RemoveFriendResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(4), var1, var2, RemoveFriendResponse.getDefaultInstance());
      }

      @Override
      public ToggleFriendRequestsResponse toggleFriendRequests(RpcController var1, ToggleFriendRequestsRequest var2) {
         return (ToggleFriendRequestsResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(5), var1, var2, ToggleFriendRequestsResponse.getDefaultInstance());
      }

      @Override
      public SendFriendRequestResponse sendFriendRequest(RpcController var1, SendFriendRequestRequest var2) {
         return (SendFriendRequestResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(6), var1, var2, SendFriendRequestResponse.getDefaultInstance());
      }

      @Override
      public CancelFriendRequestResponse cancelFriendRequest(RpcController var1, CancelFriendRequestRequest var2) {
         return (CancelFriendRequestResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(7), var1, var2, CancelFriendRequestResponse.getDefaultInstance());
      }

      @Override
      public AcceptFriendRequestResponse acceptFriendRequest(RpcController var1, AcceptFriendRequestRequest var2) {
         return (AcceptFriendRequestResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(8), var1, var2, AcceptFriendRequestResponse.getDefaultInstance());
      }

      @Override
      public DenyFriendRequestResponse denyFriendRequest(RpcController var1, DenyFriendRequestRequest var2) {
         return (DenyFriendRequestResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(9), var1, var2, DenyFriendRequestResponse.getDefaultInstance());
      }

      @Override
      public AddFriendPinResponse addFriendPin(RpcController var1, AddFriendPinRequest var2) {
         return (AddFriendPinResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(10), var1, var2, AddFriendPinResponse.getDefaultInstance());
      }

      @Override
      public RemoveFriendPinResponse removeFriendPin(RpcController var1, RemoveFriendPinRequest var2) {
         return (RemoveFriendPinResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(11), var1, var2, RemoveFriendPinResponse.getDefaultInstance());
      }

      @Override
      public SetLastSeenVisibilityResponse setLastSeenVisibility(RpcController var1, SetLastSeenVisibilityRequest var2) {
         return (SetLastSeenVisibilityResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(12), var1, var2, SetLastSeenVisibilityResponse.getDefaultInstance());
      }

      @Override
      public SetCountryFlagVisibilityResponse setCountryFlagVisibility(RpcController var1, SetCountryFlagVisibilityRequest var2) {
         return (SetCountryFlagVisibilityResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(13), var1, var2, SetCountryFlagVisibilityResponse.getDefaultInstance());
      }

      @Override
      public SetGroupChatInvitePrivacyResponse setGroupChatInvitePrivacy(RpcController var1, SetGroupChatInvitePrivacyRequest var2) {
         return (SetGroupChatInvitePrivacyResponse)this.channel
            .callBlockingMethod(FriendService.getDescriptor().getMethods().get(14), var1, var2, SetGroupChatInvitePrivacyResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void broadcastLocationChange(RpcController var1, BroadcastLocationChangeRequest var2, RpcCallback<BroadcastLocationChangeResponse> var3);

      void broadcastStatusChange(RpcController var1, BroadcastStatusChangeRequest var2, RpcCallback<BroadcastStatusChangeResponse> var3);

      void broadcastServerKick(RpcController var1, BroadcastServerKickRequest var2, RpcCallback<BroadcastServerKickResponse> var3);

      void removeFriend(RpcController var1, RemoveFriendRequest var2, RpcCallback<RemoveFriendResponse> var3);

      void toggleFriendRequests(RpcController var1, ToggleFriendRequestsRequest var2, RpcCallback<ToggleFriendRequestsResponse> var3);

      void sendFriendRequest(RpcController var1, SendFriendRequestRequest var2, RpcCallback<SendFriendRequestResponse> var3);

      void cancelFriendRequest(RpcController var1, CancelFriendRequestRequest var2, RpcCallback<CancelFriendRequestResponse> var3);

      void acceptFriendRequest(RpcController var1, AcceptFriendRequestRequest var2, RpcCallback<AcceptFriendRequestResponse> var3);

      void denyFriendRequest(RpcController var1, DenyFriendRequestRequest var2, RpcCallback<DenyFriendRequestResponse> var3);

      void addFriendPin(RpcController var1, AddFriendPinRequest var2, RpcCallback<AddFriendPinResponse> var3);

      void removeFriendPin(RpcController var1, RemoveFriendPinRequest var2, RpcCallback<RemoveFriendPinResponse> var3);

      void setLastSeenVisibility(RpcController var1, SetLastSeenVisibilityRequest var2, RpcCallback<SetLastSeenVisibilityResponse> var3);

      void setCountryFlagVisibility(RpcController var1, SetCountryFlagVisibilityRequest var2, RpcCallback<SetCountryFlagVisibilityResponse> var3);

      void setGroupChatInvitePrivacy(RpcController var1, SetGroupChatInvitePrivacyRequest var2, RpcCallback<SetGroupChatInvitePrivacyResponse> var3);
   }

   public static final class Stub extends FriendService implements FriendService.Interface {
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
      public void broadcastLocationChange(RpcController var1, BroadcastLocationChangeRequest var2, RpcCallback<BroadcastLocationChangeResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               BroadcastLocationChangeResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, BroadcastLocationChangeResponse.class, BroadcastLocationChangeResponse.getDefaultInstance())
            );
      }

      @Override
      public void broadcastStatusChange(RpcController var1, BroadcastStatusChangeRequest var2, RpcCallback<BroadcastStatusChangeResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               BroadcastStatusChangeResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, BroadcastStatusChangeResponse.class, BroadcastStatusChangeResponse.getDefaultInstance())
            );
      }

      @Override
      public void broadcastServerKick(RpcController var1, BroadcastServerKickRequest var2, RpcCallback<BroadcastServerKickResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               BroadcastServerKickResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, BroadcastServerKickResponse.class, BroadcastServerKickResponse.getDefaultInstance())
            );
      }

      @Override
      public void removeFriend(RpcController var1, RemoveFriendRequest var2, RpcCallback<RemoveFriendResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               RemoveFriendResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RemoveFriendResponse.class, RemoveFriendResponse.getDefaultInstance())
            );
      }

      @Override
      public void toggleFriendRequests(RpcController var1, ToggleFriendRequestsRequest var2, RpcCallback<ToggleFriendRequestsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               ToggleFriendRequestsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, ToggleFriendRequestsResponse.class, ToggleFriendRequestsResponse.getDefaultInstance())
            );
      }

      @Override
      public void sendFriendRequest(RpcController var1, SendFriendRequestRequest var2, RpcCallback<SendFriendRequestResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(6),
               var1,
               var2,
               SendFriendRequestResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SendFriendRequestResponse.class, SendFriendRequestResponse.getDefaultInstance())
            );
      }

      @Override
      public void cancelFriendRequest(RpcController var1, CancelFriendRequestRequest var2, RpcCallback<CancelFriendRequestResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(7),
               var1,
               var2,
               CancelFriendRequestResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CancelFriendRequestResponse.class, CancelFriendRequestResponse.getDefaultInstance())
            );
      }

      @Override
      public void acceptFriendRequest(RpcController var1, AcceptFriendRequestRequest var2, RpcCallback<AcceptFriendRequestResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(8),
               var1,
               var2,
               AcceptFriendRequestResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, AcceptFriendRequestResponse.class, AcceptFriendRequestResponse.getDefaultInstance())
            );
      }

      @Override
      public void denyFriendRequest(RpcController var1, DenyFriendRequestRequest var2, RpcCallback<DenyFriendRequestResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(9),
               var1,
               var2,
               DenyFriendRequestResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DenyFriendRequestResponse.class, DenyFriendRequestResponse.getDefaultInstance())
            );
      }

      @Override
      public void addFriendPin(RpcController var1, AddFriendPinRequest var2, RpcCallback<AddFriendPinResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(10),
               var1,
               var2,
               AddFriendPinResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, AddFriendPinResponse.class, AddFriendPinResponse.getDefaultInstance())
            );
      }

      @Override
      public void removeFriendPin(RpcController var1, RemoveFriendPinRequest var2, RpcCallback<RemoveFriendPinResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(11),
               var1,
               var2,
               RemoveFriendPinResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RemoveFriendPinResponse.class, RemoveFriendPinResponse.getDefaultInstance())
            );
      }

      @Override
      public void setLastSeenVisibility(RpcController var1, SetLastSeenVisibilityRequest var2, RpcCallback<SetLastSeenVisibilityResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(12),
               var1,
               var2,
               SetLastSeenVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetLastSeenVisibilityResponse.class, SetLastSeenVisibilityResponse.getDefaultInstance())
            );
      }

      @Override
      public void setCountryFlagVisibility(RpcController var1, SetCountryFlagVisibilityRequest var2, RpcCallback<SetCountryFlagVisibilityResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(13),
               var1,
               var2,
               SetCountryFlagVisibilityResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetCountryFlagVisibilityResponse.class, SetCountryFlagVisibilityResponse.getDefaultInstance())
            );
      }

      @Override
      public void setGroupChatInvitePrivacy(RpcController var1, SetGroupChatInvitePrivacyRequest var2, RpcCallback<SetGroupChatInvitePrivacyResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(14),
               var1,
               var2,
               SetGroupChatInvitePrivacyResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetGroupChatInvitePrivacyResponse.class, SetGroupChatInvitePrivacyResponse.getDefaultInstance())
            );
      }
   }
}
