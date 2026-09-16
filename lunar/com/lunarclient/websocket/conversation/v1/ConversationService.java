package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.BlockingService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcChannel;
import com.google.protobuf.RpcController;
import com.google.protobuf.RpcUtil;
import com.google.protobuf.Service;

public abstract class ConversationService implements Service {
   protected ConversationService() {
   }

   public static Service newReflectiveService(final ConversationService.Interface var0) {
      return new ConversationService() {
         @Override
         public void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3) {
            var0.login(var1, var2, var3);
         }

         @Override
         public void sendConversationMessage(RpcController var1, SendConversationMessageRequest var2, RpcCallback<SendConversationMessageResponse> var3) {
            var0.sendConversationMessage(var1, var2, var3);
         }

         @Override
         public void preSendAction(RpcController var1, PreSendActionRequest var2, RpcCallback<PreSendActionResponse> var3) {
            var0.preSendAction(var1, var2, var3);
         }

         @Override
         public void loadConversation(RpcController var1, LoadConversationRequest var2, RpcCallback<LoadConversationResponse> var3) {
            var0.loadConversation(var1, var2, var3);
         }

         @Override
         public void createConversation(RpcController var1, CreateConversationRequest var2, RpcCallback<CreateConversationResponse> var3) {
            var0.createConversation(var1, var2, var3);
         }

         @Override
         public void deleteConversation(RpcController var1, DeleteConversationRequest var2, RpcCallback<DeleteConversationResponse> var3) {
            var0.deleteConversation(var1, var2, var3);
         }

         @Override
         public void deleteConversationMessage(RpcController var1, DeleteConversationMessageRequest var2, RpcCallback<DeleteConversationMessageResponse> var3) {
            var0.deleteConversationMessage(var1, var2, var3);
         }

         @Override
         public void deleteConversationMessageHistory(
            RpcController var1, DeleteConversationMessageHistoryRequest var2, RpcCallback<DeleteConversationMessageHistoryResponse> var3
         ) {
            var0.deleteConversationMessageHistory(var1, var2, var3);
         }

         @Override
         public void updateConversationOwner(RpcController var1, UpdateConversationOwnerRequest var2, RpcCallback<UpdateConversationOwnerResponse> var3) {
            var0.updateConversationOwner(var1, var2, var3);
         }

         @Override
         public void addConversationParticipants(
            RpcController var1, AddConversationParticipantsRequest var2, RpcCallback<AddConversationParticipantsResponse> var3
         ) {
            var0.addConversationParticipants(var1, var2, var3);
         }

         @Override
         public void removeConversationParticipant(
            RpcController var1, RemoveConversationParticipantRequest var2, RpcCallback<RemoveConversationParticipantResponse> var3
         ) {
            var0.removeConversationParticipant(var1, var2, var3);
         }

         @Override
         public void updateConversationName(RpcController var1, UpdateConversationNameRequest var2, RpcCallback<UpdateConversationNameResponse> var3) {
            var0.updateConversationName(var1, var2, var3);
         }

         @Override
         public void updateConversationIcon(RpcController var1, UpdateConversationIconRequest var2, RpcCallback<UpdateConversationIconResponse> var3) {
            var0.updateConversationIcon(var1, var2, var3);
         }

         @Override
         public void loadPinnedMessages(RpcController var1, LoadPinnedMessagesRequest var2, RpcCallback<LoadPinnedMessagesResponse> var3) {
            var0.loadPinnedMessages(var1, var2, var3);
         }

         @Override
         public void addPinnedMessage(RpcController var1, AddPinnedMessageRequest var2, RpcCallback<AddPinnedMessageResponse> var3) {
            var0.addPinnedMessage(var1, var2, var3);
         }

         @Override
         public void removePinnedMessage(RpcController var1, RemovePinnedMessageRequest var2, RpcCallback<RemovePinnedMessageResponse> var3) {
            var0.removePinnedMessage(var1, var2, var3);
         }

         @Override
         public void setInvitePolicy(RpcController var1, SetInvitePolicyRequest var2, RpcCallback<SetInvitePolicyResponse> var3) {
            var0.setInvitePolicy(var1, var2, var3);
         }

         @Override
         public void setNamePolicy(RpcController var1, SetNamePolicyRequest var2, RpcCallback<SetNamePolicyResponse> var3) {
            var0.setNamePolicy(var1, var2, var3);
         }

         @Override
         public void setIconPolicy(RpcController var1, SetIconPolicyRequest var2, RpcCallback<SetIconPolicyResponse> var3) {
            var0.setIconPolicy(var1, var2, var3);
         }

         @Override
         public void setMessagePinningPolicy(RpcController var1, SetMessagePinningPolicyRequest var2, RpcCallback<SetMessagePinningPolicyResponse> var3) {
            var0.setMessagePinningPolicy(var1, var2, var3);
         }

         @Override
         public void setConversationPinned(RpcController var1, SetConversationPinnedRequest var2, RpcCallback<SetConversationPinnedResponse> var3) {
            var0.setConversationPinned(var1, var2, var3);
         }

         @Override
         public void getUploadUrls(RpcController var1, GetUploadUrlsRequest var2, RpcCallback<GetUploadUrlsResponse> var3) {
            var0.getUploadUrls(var1, var2, var3);
         }

         @Override
         public void unfocusConversations(RpcController var1, UnfocusConversationsRequest var2, RpcCallback<UnfocusConversationsResponse> var3) {
            var0.unfocusConversations(var1, var2, var3);
         }

         @Override
         public void getConversations(RpcController var1, GetConversationsRequest var2, RpcCallback<GetConversationsResponse> var3) {
            var0.getConversations(var1, var2, var3);
         }
      };
   }

   public static BlockingService newReflectiveBlockingService(final ConversationService.BlockingInterface var0) {
      return new BlockingService() {
         @Override
         public final Descriptors.ServiceDescriptor getDescriptorForType() {
            return ConversationService.getDescriptor();
         }

         @Override
         public final Message callBlockingMethod(Descriptors.MethodDescriptor var1, RpcController var2, Message var3) {
            if (var1.getService() != ConversationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.callBlockingMethod() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return var0.login(var2, (LoginRequest)var3);
               case 1:
                  return var0.sendConversationMessage(var2, (SendConversationMessageRequest)var3);
               case 2:
                  return var0.preSendAction(var2, (PreSendActionRequest)var3);
               case 3:
                  return var0.loadConversation(var2, (LoadConversationRequest)var3);
               case 4:
                  return var0.createConversation(var2, (CreateConversationRequest)var3);
               case 5:
                  return var0.deleteConversation(var2, (DeleteConversationRequest)var3);
               case 6:
                  return var0.deleteConversationMessage(var2, (DeleteConversationMessageRequest)var3);
               case 7:
                  return var0.deleteConversationMessageHistory(var2, (DeleteConversationMessageHistoryRequest)var3);
               case 8:
                  return var0.updateConversationOwner(var2, (UpdateConversationOwnerRequest)var3);
               case 9:
                  return var0.addConversationParticipants(var2, (AddConversationParticipantsRequest)var3);
               case 10:
                  return var0.removeConversationParticipant(var2, (RemoveConversationParticipantRequest)var3);
               case 11:
                  return var0.updateConversationName(var2, (UpdateConversationNameRequest)var3);
               case 12:
                  return var0.updateConversationIcon(var2, (UpdateConversationIconRequest)var3);
               case 13:
                  return var0.loadPinnedMessages(var2, (LoadPinnedMessagesRequest)var3);
               case 14:
                  return var0.addPinnedMessage(var2, (AddPinnedMessageRequest)var3);
               case 15:
                  return var0.removePinnedMessage(var2, (RemovePinnedMessageRequest)var3);
               case 16:
                  return var0.setInvitePolicy(var2, (SetInvitePolicyRequest)var3);
               case 17:
                  return var0.setNamePolicy(var2, (SetNamePolicyRequest)var3);
               case 18:
                  return var0.setIconPolicy(var2, (SetIconPolicyRequest)var3);
               case 19:
                  return var0.setMessagePinningPolicy(var2, (SetMessagePinningPolicyRequest)var3);
               case 20:
                  return var0.setConversationPinned(var2, (SetConversationPinnedRequest)var3);
               case 21:
                  return var0.getUploadUrls(var2, (GetUploadUrlsRequest)var3);
               case 22:
                  return var0.unfocusConversations(var2, (UnfocusConversationsRequest)var3);
               case 23:
                  return var0.getConversations(var2, (GetConversationsRequest)var3);
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getRequestPrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ConversationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getRequestPrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginRequest.getDefaultInstance();
               case 1:
                  return SendConversationMessageRequest.getDefaultInstance();
               case 2:
                  return PreSendActionRequest.getDefaultInstance();
               case 3:
                  return LoadConversationRequest.getDefaultInstance();
               case 4:
                  return CreateConversationRequest.getDefaultInstance();
               case 5:
                  return DeleteConversationRequest.getDefaultInstance();
               case 6:
                  return DeleteConversationMessageRequest.getDefaultInstance();
               case 7:
                  return DeleteConversationMessageHistoryRequest.getDefaultInstance();
               case 8:
                  return UpdateConversationOwnerRequest.getDefaultInstance();
               case 9:
                  return AddConversationParticipantsRequest.getDefaultInstance();
               case 10:
                  return RemoveConversationParticipantRequest.getDefaultInstance();
               case 11:
                  return UpdateConversationNameRequest.getDefaultInstance();
               case 12:
                  return UpdateConversationIconRequest.getDefaultInstance();
               case 13:
                  return LoadPinnedMessagesRequest.getDefaultInstance();
               case 14:
                  return AddPinnedMessageRequest.getDefaultInstance();
               case 15:
                  return RemovePinnedMessageRequest.getDefaultInstance();
               case 16:
                  return SetInvitePolicyRequest.getDefaultInstance();
               case 17:
                  return SetNamePolicyRequest.getDefaultInstance();
               case 18:
                  return SetIconPolicyRequest.getDefaultInstance();
               case 19:
                  return SetMessagePinningPolicyRequest.getDefaultInstance();
               case 20:
                  return SetConversationPinnedRequest.getDefaultInstance();
               case 21:
                  return GetUploadUrlsRequest.getDefaultInstance();
               case 22:
                  return UnfocusConversationsRequest.getDefaultInstance();
               case 23:
                  return GetConversationsRequest.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }

         @Override
         public final Message getResponsePrototype(Descriptors.MethodDescriptor var1) {
            if (var1.getService() != ConversationService.getDescriptor()) {
               throw new IllegalArgumentException("Service.getResponsePrototype() given method descriptor for wrong service type.");
            }

            switch (var1.getIndex()) {
               case 0:
                  return LoginResponse.getDefaultInstance();
               case 1:
                  return SendConversationMessageResponse.getDefaultInstance();
               case 2:
                  return PreSendActionResponse.getDefaultInstance();
               case 3:
                  return LoadConversationResponse.getDefaultInstance();
               case 4:
                  return CreateConversationResponse.getDefaultInstance();
               case 5:
                  return DeleteConversationResponse.getDefaultInstance();
               case 6:
                  return DeleteConversationMessageResponse.getDefaultInstance();
               case 7:
                  return DeleteConversationMessageHistoryResponse.getDefaultInstance();
               case 8:
                  return UpdateConversationOwnerResponse.getDefaultInstance();
               case 9:
                  return AddConversationParticipantsResponse.getDefaultInstance();
               case 10:
                  return RemoveConversationParticipantResponse.getDefaultInstance();
               case 11:
                  return UpdateConversationNameResponse.getDefaultInstance();
               case 12:
                  return UpdateConversationIconResponse.getDefaultInstance();
               case 13:
                  return LoadPinnedMessagesResponse.getDefaultInstance();
               case 14:
                  return AddPinnedMessageResponse.getDefaultInstance();
               case 15:
                  return RemovePinnedMessageResponse.getDefaultInstance();
               case 16:
                  return SetInvitePolicyResponse.getDefaultInstance();
               case 17:
                  return SetNamePolicyResponse.getDefaultInstance();
               case 18:
                  return SetIconPolicyResponse.getDefaultInstance();
               case 19:
                  return SetMessagePinningPolicyResponse.getDefaultInstance();
               case 20:
                  return SetConversationPinnedResponse.getDefaultInstance();
               case 21:
                  return GetUploadUrlsResponse.getDefaultInstance();
               case 22:
                  return UnfocusConversationsResponse.getDefaultInstance();
               case 23:
                  return GetConversationsResponse.getDefaultInstance();
               default:
                  throw new AssertionError("Can't get here.");
            }
         }
      };
   }

   public abstract void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

   public abstract void sendConversationMessage(RpcController var1, SendConversationMessageRequest var2, RpcCallback<SendConversationMessageResponse> var3);

   public abstract void preSendAction(RpcController var1, PreSendActionRequest var2, RpcCallback<PreSendActionResponse> var3);

   public abstract void loadConversation(RpcController var1, LoadConversationRequest var2, RpcCallback<LoadConversationResponse> var3);

   public abstract void createConversation(RpcController var1, CreateConversationRequest var2, RpcCallback<CreateConversationResponse> var3);

   public abstract void deleteConversation(RpcController var1, DeleteConversationRequest var2, RpcCallback<DeleteConversationResponse> var3);

   public abstract void deleteConversationMessage(
      RpcController var1, DeleteConversationMessageRequest var2, RpcCallback<DeleteConversationMessageResponse> var3
   );

   public abstract void deleteConversationMessageHistory(
      RpcController var1, DeleteConversationMessageHistoryRequest var2, RpcCallback<DeleteConversationMessageHistoryResponse> var3
   );

   public abstract void updateConversationOwner(RpcController var1, UpdateConversationOwnerRequest var2, RpcCallback<UpdateConversationOwnerResponse> var3);

   public abstract void addConversationParticipants(
      RpcController var1, AddConversationParticipantsRequest var2, RpcCallback<AddConversationParticipantsResponse> var3
   );

   public abstract void removeConversationParticipant(
      RpcController var1, RemoveConversationParticipantRequest var2, RpcCallback<RemoveConversationParticipantResponse> var3
   );

   public abstract void updateConversationName(RpcController var1, UpdateConversationNameRequest var2, RpcCallback<UpdateConversationNameResponse> var3);

   public abstract void updateConversationIcon(RpcController var1, UpdateConversationIconRequest var2, RpcCallback<UpdateConversationIconResponse> var3);

   public abstract void loadPinnedMessages(RpcController var1, LoadPinnedMessagesRequest var2, RpcCallback<LoadPinnedMessagesResponse> var3);

   public abstract void addPinnedMessage(RpcController var1, AddPinnedMessageRequest var2, RpcCallback<AddPinnedMessageResponse> var3);

   public abstract void removePinnedMessage(RpcController var1, RemovePinnedMessageRequest var2, RpcCallback<RemovePinnedMessageResponse> var3);

   public abstract void setInvitePolicy(RpcController var1, SetInvitePolicyRequest var2, RpcCallback<SetInvitePolicyResponse> var3);

   public abstract void setNamePolicy(RpcController var1, SetNamePolicyRequest var2, RpcCallback<SetNamePolicyResponse> var3);

   public abstract void setIconPolicy(RpcController var1, SetIconPolicyRequest var2, RpcCallback<SetIconPolicyResponse> var3);

   public abstract void setMessagePinningPolicy(RpcController var1, SetMessagePinningPolicyRequest var2, RpcCallback<SetMessagePinningPolicyResponse> var3);

   public abstract void setConversationPinned(RpcController var1, SetConversationPinnedRequest var2, RpcCallback<SetConversationPinnedResponse> var3);

   public abstract void getUploadUrls(RpcController var1, GetUploadUrlsRequest var2, RpcCallback<GetUploadUrlsResponse> var3);

   public abstract void unfocusConversations(RpcController var1, UnfocusConversationsRequest var2, RpcCallback<UnfocusConversationsResponse> var3);

   public abstract void getConversations(RpcController var1, GetConversationsRequest var2, RpcCallback<GetConversationsResponse> var3);

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
            this.sendConversationMessage(var2, (SendConversationMessageRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 2:
            this.preSendAction(var2, (PreSendActionRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 3:
            this.loadConversation(var2, (LoadConversationRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 4:
            this.createConversation(var2, (CreateConversationRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 5:
            this.deleteConversation(var2, (DeleteConversationRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 6:
            this.deleteConversationMessage(var2, (DeleteConversationMessageRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 7:
            this.deleteConversationMessageHistory(var2, (DeleteConversationMessageHistoryRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 8:
            this.updateConversationOwner(var2, (UpdateConversationOwnerRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 9:
            this.addConversationParticipants(var2, (AddConversationParticipantsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 10:
            this.removeConversationParticipant(var2, (RemoveConversationParticipantRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 11:
            this.updateConversationName(var2, (UpdateConversationNameRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 12:
            this.updateConversationIcon(var2, (UpdateConversationIconRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 13:
            this.loadPinnedMessages(var2, (LoadPinnedMessagesRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 14:
            this.addPinnedMessage(var2, (AddPinnedMessageRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 15:
            this.removePinnedMessage(var2, (RemovePinnedMessageRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 16:
            this.setInvitePolicy(var2, (SetInvitePolicyRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 17:
            this.setNamePolicy(var2, (SetNamePolicyRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 18:
            this.setIconPolicy(var2, (SetIconPolicyRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 19:
            this.setMessagePinningPolicy(var2, (SetMessagePinningPolicyRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 20:
            this.setConversationPinned(var2, (SetConversationPinnedRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 21:
            this.getUploadUrls(var2, (GetUploadUrlsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 22:
            this.unfocusConversations(var2, (UnfocusConversationsRequest)var3, RpcUtil.specializeCallback(var4));
            return;
         case 23:
            this.getConversations(var2, (GetConversationsRequest)var3, RpcUtil.specializeCallback(var4));
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
            return SendConversationMessageRequest.getDefaultInstance();
         case 2:
            return PreSendActionRequest.getDefaultInstance();
         case 3:
            return LoadConversationRequest.getDefaultInstance();
         case 4:
            return CreateConversationRequest.getDefaultInstance();
         case 5:
            return DeleteConversationRequest.getDefaultInstance();
         case 6:
            return DeleteConversationMessageRequest.getDefaultInstance();
         case 7:
            return DeleteConversationMessageHistoryRequest.getDefaultInstance();
         case 8:
            return UpdateConversationOwnerRequest.getDefaultInstance();
         case 9:
            return AddConversationParticipantsRequest.getDefaultInstance();
         case 10:
            return RemoveConversationParticipantRequest.getDefaultInstance();
         case 11:
            return UpdateConversationNameRequest.getDefaultInstance();
         case 12:
            return UpdateConversationIconRequest.getDefaultInstance();
         case 13:
            return LoadPinnedMessagesRequest.getDefaultInstance();
         case 14:
            return AddPinnedMessageRequest.getDefaultInstance();
         case 15:
            return RemovePinnedMessageRequest.getDefaultInstance();
         case 16:
            return SetInvitePolicyRequest.getDefaultInstance();
         case 17:
            return SetNamePolicyRequest.getDefaultInstance();
         case 18:
            return SetIconPolicyRequest.getDefaultInstance();
         case 19:
            return SetMessagePinningPolicyRequest.getDefaultInstance();
         case 20:
            return SetConversationPinnedRequest.getDefaultInstance();
         case 21:
            return GetUploadUrlsRequest.getDefaultInstance();
         case 22:
            return UnfocusConversationsRequest.getDefaultInstance();
         case 23:
            return GetConversationsRequest.getDefaultInstance();
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
            return SendConversationMessageResponse.getDefaultInstance();
         case 2:
            return PreSendActionResponse.getDefaultInstance();
         case 3:
            return LoadConversationResponse.getDefaultInstance();
         case 4:
            return CreateConversationResponse.getDefaultInstance();
         case 5:
            return DeleteConversationResponse.getDefaultInstance();
         case 6:
            return DeleteConversationMessageResponse.getDefaultInstance();
         case 7:
            return DeleteConversationMessageHistoryResponse.getDefaultInstance();
         case 8:
            return UpdateConversationOwnerResponse.getDefaultInstance();
         case 9:
            return AddConversationParticipantsResponse.getDefaultInstance();
         case 10:
            return RemoveConversationParticipantResponse.getDefaultInstance();
         case 11:
            return UpdateConversationNameResponse.getDefaultInstance();
         case 12:
            return UpdateConversationIconResponse.getDefaultInstance();
         case 13:
            return LoadPinnedMessagesResponse.getDefaultInstance();
         case 14:
            return AddPinnedMessageResponse.getDefaultInstance();
         case 15:
            return RemovePinnedMessageResponse.getDefaultInstance();
         case 16:
            return SetInvitePolicyResponse.getDefaultInstance();
         case 17:
            return SetNamePolicyResponse.getDefaultInstance();
         case 18:
            return SetIconPolicyResponse.getDefaultInstance();
         case 19:
            return SetMessagePinningPolicyResponse.getDefaultInstance();
         case 20:
            return SetConversationPinnedResponse.getDefaultInstance();
         case 21:
            return GetUploadUrlsResponse.getDefaultInstance();
         case 22:
            return UnfocusConversationsResponse.getDefaultInstance();
         case 23:
            return GetConversationsResponse.getDefaultInstance();
         default:
            throw new AssertionError("Can't get here.");
      }
   }

   public static ConversationService.Stub newStub(RpcChannel var0) {
      return new ConversationService.Stub(var0);
   }

   public static ConversationService.BlockingInterface newBlockingStub(BlockingRpcChannel var0) {
      return new ConversationService.BlockingStub(var0);
   }

   public interface BlockingInterface {
      LoginResponse login(RpcController var1, LoginRequest var2);

      SendConversationMessageResponse sendConversationMessage(RpcController var1, SendConversationMessageRequest var2);

      PreSendActionResponse preSendAction(RpcController var1, PreSendActionRequest var2);

      LoadConversationResponse loadConversation(RpcController var1, LoadConversationRequest var2);

      CreateConversationResponse createConversation(RpcController var1, CreateConversationRequest var2);

      DeleteConversationResponse deleteConversation(RpcController var1, DeleteConversationRequest var2);

      DeleteConversationMessageResponse deleteConversationMessage(RpcController var1, DeleteConversationMessageRequest var2);

      DeleteConversationMessageHistoryResponse deleteConversationMessageHistory(RpcController var1, DeleteConversationMessageHistoryRequest var2);

      UpdateConversationOwnerResponse updateConversationOwner(RpcController var1, UpdateConversationOwnerRequest var2);

      AddConversationParticipantsResponse addConversationParticipants(RpcController var1, AddConversationParticipantsRequest var2);

      RemoveConversationParticipantResponse removeConversationParticipant(RpcController var1, RemoveConversationParticipantRequest var2);

      UpdateConversationNameResponse updateConversationName(RpcController var1, UpdateConversationNameRequest var2);

      UpdateConversationIconResponse updateConversationIcon(RpcController var1, UpdateConversationIconRequest var2);

      LoadPinnedMessagesResponse loadPinnedMessages(RpcController var1, LoadPinnedMessagesRequest var2);

      AddPinnedMessageResponse addPinnedMessage(RpcController var1, AddPinnedMessageRequest var2);

      RemovePinnedMessageResponse removePinnedMessage(RpcController var1, RemovePinnedMessageRequest var2);

      SetInvitePolicyResponse setInvitePolicy(RpcController var1, SetInvitePolicyRequest var2);

      SetNamePolicyResponse setNamePolicy(RpcController var1, SetNamePolicyRequest var2);

      SetIconPolicyResponse setIconPolicy(RpcController var1, SetIconPolicyRequest var2);

      SetMessagePinningPolicyResponse setMessagePinningPolicy(RpcController var1, SetMessagePinningPolicyRequest var2);

      SetConversationPinnedResponse setConversationPinned(RpcController var1, SetConversationPinnedRequest var2);

      GetUploadUrlsResponse getUploadUrls(RpcController var1, GetUploadUrlsRequest var2);

      UnfocusConversationsResponse unfocusConversations(RpcController var1, UnfocusConversationsRequest var2);

      GetConversationsResponse getConversations(RpcController var1, GetConversationsRequest var2);
   }

   private static final class BlockingStub implements ConversationService.BlockingInterface {
      private final BlockingRpcChannel channel;

      private BlockingStub(BlockingRpcChannel var1) {
         this.channel = var1;
      }

      @Override
      public LoginResponse login(RpcController var1, LoginRequest var2) {
         return (LoginResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(0), var1, var2, LoginResponse.getDefaultInstance());
      }

      @Override
      public SendConversationMessageResponse sendConversationMessage(RpcController var1, SendConversationMessageRequest var2) {
         return (SendConversationMessageResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(1), var1, var2, SendConversationMessageResponse.getDefaultInstance());
      }

      @Override
      public PreSendActionResponse preSendAction(RpcController var1, PreSendActionRequest var2) {
         return (PreSendActionResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(2), var1, var2, PreSendActionResponse.getDefaultInstance());
      }

      @Override
      public LoadConversationResponse loadConversation(RpcController var1, LoadConversationRequest var2) {
         return (LoadConversationResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(3), var1, var2, LoadConversationResponse.getDefaultInstance());
      }

      @Override
      public CreateConversationResponse createConversation(RpcController var1, CreateConversationRequest var2) {
         return (CreateConversationResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(4), var1, var2, CreateConversationResponse.getDefaultInstance());
      }

      @Override
      public DeleteConversationResponse deleteConversation(RpcController var1, DeleteConversationRequest var2) {
         return (DeleteConversationResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(5), var1, var2, DeleteConversationResponse.getDefaultInstance());
      }

      @Override
      public DeleteConversationMessageResponse deleteConversationMessage(RpcController var1, DeleteConversationMessageRequest var2) {
         return (DeleteConversationMessageResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(6), var1, var2, DeleteConversationMessageResponse.getDefaultInstance());
      }

      @Override
      public DeleteConversationMessageHistoryResponse deleteConversationMessageHistory(RpcController var1, DeleteConversationMessageHistoryRequest var2) {
         return (DeleteConversationMessageHistoryResponse)this.channel
            .callBlockingMethod(
               ConversationService.getDescriptor().getMethods().get(7), var1, var2, DeleteConversationMessageHistoryResponse.getDefaultInstance()
            );
      }

      @Override
      public UpdateConversationOwnerResponse updateConversationOwner(RpcController var1, UpdateConversationOwnerRequest var2) {
         return (UpdateConversationOwnerResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(8), var1, var2, UpdateConversationOwnerResponse.getDefaultInstance());
      }

      @Override
      public AddConversationParticipantsResponse addConversationParticipants(RpcController var1, AddConversationParticipantsRequest var2) {
         return (AddConversationParticipantsResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(9), var1, var2, AddConversationParticipantsResponse.getDefaultInstance());
      }

      @Override
      public RemoveConversationParticipantResponse removeConversationParticipant(RpcController var1, RemoveConversationParticipantRequest var2) {
         return (RemoveConversationParticipantResponse)this.channel
            .callBlockingMethod(
               ConversationService.getDescriptor().getMethods().get(10), var1, var2, RemoveConversationParticipantResponse.getDefaultInstance()
            );
      }

      @Override
      public UpdateConversationNameResponse updateConversationName(RpcController var1, UpdateConversationNameRequest var2) {
         return (UpdateConversationNameResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(11), var1, var2, UpdateConversationNameResponse.getDefaultInstance());
      }

      @Override
      public UpdateConversationIconResponse updateConversationIcon(RpcController var1, UpdateConversationIconRequest var2) {
         return (UpdateConversationIconResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(12), var1, var2, UpdateConversationIconResponse.getDefaultInstance());
      }

      @Override
      public LoadPinnedMessagesResponse loadPinnedMessages(RpcController var1, LoadPinnedMessagesRequest var2) {
         return (LoadPinnedMessagesResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(13), var1, var2, LoadPinnedMessagesResponse.getDefaultInstance());
      }

      @Override
      public AddPinnedMessageResponse addPinnedMessage(RpcController var1, AddPinnedMessageRequest var2) {
         return (AddPinnedMessageResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(14), var1, var2, AddPinnedMessageResponse.getDefaultInstance());
      }

      @Override
      public RemovePinnedMessageResponse removePinnedMessage(RpcController var1, RemovePinnedMessageRequest var2) {
         return (RemovePinnedMessageResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(15), var1, var2, RemovePinnedMessageResponse.getDefaultInstance());
      }

      @Override
      public SetInvitePolicyResponse setInvitePolicy(RpcController var1, SetInvitePolicyRequest var2) {
         return (SetInvitePolicyResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(16), var1, var2, SetInvitePolicyResponse.getDefaultInstance());
      }

      @Override
      public SetNamePolicyResponse setNamePolicy(RpcController var1, SetNamePolicyRequest var2) {
         return (SetNamePolicyResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(17), var1, var2, SetNamePolicyResponse.getDefaultInstance());
      }

      @Override
      public SetIconPolicyResponse setIconPolicy(RpcController var1, SetIconPolicyRequest var2) {
         return (SetIconPolicyResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(18), var1, var2, SetIconPolicyResponse.getDefaultInstance());
      }

      @Override
      public SetMessagePinningPolicyResponse setMessagePinningPolicy(RpcController var1, SetMessagePinningPolicyRequest var2) {
         return (SetMessagePinningPolicyResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(19), var1, var2, SetMessagePinningPolicyResponse.getDefaultInstance());
      }

      @Override
      public SetConversationPinnedResponse setConversationPinned(RpcController var1, SetConversationPinnedRequest var2) {
         return (SetConversationPinnedResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(20), var1, var2, SetConversationPinnedResponse.getDefaultInstance());
      }

      @Override
      public GetUploadUrlsResponse getUploadUrls(RpcController var1, GetUploadUrlsRequest var2) {
         return (GetUploadUrlsResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(21), var1, var2, GetUploadUrlsResponse.getDefaultInstance());
      }

      @Override
      public UnfocusConversationsResponse unfocusConversations(RpcController var1, UnfocusConversationsRequest var2) {
         return (UnfocusConversationsResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(22), var1, var2, UnfocusConversationsResponse.getDefaultInstance());
      }

      @Override
      public GetConversationsResponse getConversations(RpcController var1, GetConversationsRequest var2) {
         return (GetConversationsResponse)this.channel
            .callBlockingMethod(ConversationService.getDescriptor().getMethods().get(23), var1, var2, GetConversationsResponse.getDefaultInstance());
      }
   }

   public interface Interface {
      void login(RpcController var1, LoginRequest var2, RpcCallback<LoginResponse> var3);

      void sendConversationMessage(RpcController var1, SendConversationMessageRequest var2, RpcCallback<SendConversationMessageResponse> var3);

      void preSendAction(RpcController var1, PreSendActionRequest var2, RpcCallback<PreSendActionResponse> var3);

      void loadConversation(RpcController var1, LoadConversationRequest var2, RpcCallback<LoadConversationResponse> var3);

      void createConversation(RpcController var1, CreateConversationRequest var2, RpcCallback<CreateConversationResponse> var3);

      void deleteConversation(RpcController var1, DeleteConversationRequest var2, RpcCallback<DeleteConversationResponse> var3);

      void deleteConversationMessage(RpcController var1, DeleteConversationMessageRequest var2, RpcCallback<DeleteConversationMessageResponse> var3);

      void deleteConversationMessageHistory(
         RpcController var1, DeleteConversationMessageHistoryRequest var2, RpcCallback<DeleteConversationMessageHistoryResponse> var3
      );

      void updateConversationOwner(RpcController var1, UpdateConversationOwnerRequest var2, RpcCallback<UpdateConversationOwnerResponse> var3);

      void addConversationParticipants(RpcController var1, AddConversationParticipantsRequest var2, RpcCallback<AddConversationParticipantsResponse> var3);

      void removeConversationParticipant(RpcController var1, RemoveConversationParticipantRequest var2, RpcCallback<RemoveConversationParticipantResponse> var3);

      void updateConversationName(RpcController var1, UpdateConversationNameRequest var2, RpcCallback<UpdateConversationNameResponse> var3);

      void updateConversationIcon(RpcController var1, UpdateConversationIconRequest var2, RpcCallback<UpdateConversationIconResponse> var3);

      void loadPinnedMessages(RpcController var1, LoadPinnedMessagesRequest var2, RpcCallback<LoadPinnedMessagesResponse> var3);

      void addPinnedMessage(RpcController var1, AddPinnedMessageRequest var2, RpcCallback<AddPinnedMessageResponse> var3);

      void removePinnedMessage(RpcController var1, RemovePinnedMessageRequest var2, RpcCallback<RemovePinnedMessageResponse> var3);

      void setInvitePolicy(RpcController var1, SetInvitePolicyRequest var2, RpcCallback<SetInvitePolicyResponse> var3);

      void setNamePolicy(RpcController var1, SetNamePolicyRequest var2, RpcCallback<SetNamePolicyResponse> var3);

      void setIconPolicy(RpcController var1, SetIconPolicyRequest var2, RpcCallback<SetIconPolicyResponse> var3);

      void setMessagePinningPolicy(RpcController var1, SetMessagePinningPolicyRequest var2, RpcCallback<SetMessagePinningPolicyResponse> var3);

      void setConversationPinned(RpcController var1, SetConversationPinnedRequest var2, RpcCallback<SetConversationPinnedResponse> var3);

      void getUploadUrls(RpcController var1, GetUploadUrlsRequest var2, RpcCallback<GetUploadUrlsResponse> var3);

      void unfocusConversations(RpcController var1, UnfocusConversationsRequest var2, RpcCallback<UnfocusConversationsResponse> var3);

      void getConversations(RpcController var1, GetConversationsRequest var2, RpcCallback<GetConversationsResponse> var3);
   }

   public static final class Stub extends ConversationService implements ConversationService.Interface {
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
      public void sendConversationMessage(RpcController var1, SendConversationMessageRequest var2, RpcCallback<SendConversationMessageResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(1),
               var1,
               var2,
               SendConversationMessageResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SendConversationMessageResponse.class, SendConversationMessageResponse.getDefaultInstance())
            );
      }

      @Override
      public void preSendAction(RpcController var1, PreSendActionRequest var2, RpcCallback<PreSendActionResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(2),
               var1,
               var2,
               PreSendActionResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, PreSendActionResponse.class, PreSendActionResponse.getDefaultInstance())
            );
      }

      @Override
      public void loadConversation(RpcController var1, LoadConversationRequest var2, RpcCallback<LoadConversationResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(3),
               var1,
               var2,
               LoadConversationResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadConversationResponse.class, LoadConversationResponse.getDefaultInstance())
            );
      }

      @Override
      public void createConversation(RpcController var1, CreateConversationRequest var2, RpcCallback<CreateConversationResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(4),
               var1,
               var2,
               CreateConversationResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, CreateConversationResponse.class, CreateConversationResponse.getDefaultInstance())
            );
      }

      @Override
      public void deleteConversation(RpcController var1, DeleteConversationRequest var2, RpcCallback<DeleteConversationResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(5),
               var1,
               var2,
               DeleteConversationResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DeleteConversationResponse.class, DeleteConversationResponse.getDefaultInstance())
            );
      }

      @Override
      public void deleteConversationMessage(RpcController var1, DeleteConversationMessageRequest var2, RpcCallback<DeleteConversationMessageResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(6),
               var1,
               var2,
               DeleteConversationMessageResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DeleteConversationMessageResponse.class, DeleteConversationMessageResponse.getDefaultInstance())
            );
      }

      @Override
      public void deleteConversationMessageHistory(
         RpcController var1, DeleteConversationMessageHistoryRequest var2, RpcCallback<DeleteConversationMessageHistoryResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(7),
               var1,
               var2,
               DeleteConversationMessageHistoryResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, DeleteConversationMessageHistoryResponse.class, DeleteConversationMessageHistoryResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateConversationOwner(RpcController var1, UpdateConversationOwnerRequest var2, RpcCallback<UpdateConversationOwnerResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(8),
               var1,
               var2,
               UpdateConversationOwnerResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateConversationOwnerResponse.class, UpdateConversationOwnerResponse.getDefaultInstance())
            );
      }

      @Override
      public void addConversationParticipants(
         RpcController var1, AddConversationParticipantsRequest var2, RpcCallback<AddConversationParticipantsResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(9),
               var1,
               var2,
               AddConversationParticipantsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, AddConversationParticipantsResponse.class, AddConversationParticipantsResponse.getDefaultInstance())
            );
      }

      @Override
      public void removeConversationParticipant(
         RpcController var1, RemoveConversationParticipantRequest var2, RpcCallback<RemoveConversationParticipantResponse> var3
      ) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(10),
               var1,
               var2,
               RemoveConversationParticipantResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RemoveConversationParticipantResponse.class, RemoveConversationParticipantResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateConversationName(RpcController var1, UpdateConversationNameRequest var2, RpcCallback<UpdateConversationNameResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(11),
               var1,
               var2,
               UpdateConversationNameResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateConversationNameResponse.class, UpdateConversationNameResponse.getDefaultInstance())
            );
      }

      @Override
      public void updateConversationIcon(RpcController var1, UpdateConversationIconRequest var2, RpcCallback<UpdateConversationIconResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(12),
               var1,
               var2,
               UpdateConversationIconResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UpdateConversationIconResponse.class, UpdateConversationIconResponse.getDefaultInstance())
            );
      }

      @Override
      public void loadPinnedMessages(RpcController var1, LoadPinnedMessagesRequest var2, RpcCallback<LoadPinnedMessagesResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(13),
               var1,
               var2,
               LoadPinnedMessagesResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, LoadPinnedMessagesResponse.class, LoadPinnedMessagesResponse.getDefaultInstance())
            );
      }

      @Override
      public void addPinnedMessage(RpcController var1, AddPinnedMessageRequest var2, RpcCallback<AddPinnedMessageResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(14),
               var1,
               var2,
               AddPinnedMessageResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, AddPinnedMessageResponse.class, AddPinnedMessageResponse.getDefaultInstance())
            );
      }

      @Override
      public void removePinnedMessage(RpcController var1, RemovePinnedMessageRequest var2, RpcCallback<RemovePinnedMessageResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(15),
               var1,
               var2,
               RemovePinnedMessageResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, RemovePinnedMessageResponse.class, RemovePinnedMessageResponse.getDefaultInstance())
            );
      }

      @Override
      public void setInvitePolicy(RpcController var1, SetInvitePolicyRequest var2, RpcCallback<SetInvitePolicyResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(16),
               var1,
               var2,
               SetInvitePolicyResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetInvitePolicyResponse.class, SetInvitePolicyResponse.getDefaultInstance())
            );
      }

      @Override
      public void setNamePolicy(RpcController var1, SetNamePolicyRequest var2, RpcCallback<SetNamePolicyResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(17),
               var1,
               var2,
               SetNamePolicyResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetNamePolicyResponse.class, SetNamePolicyResponse.getDefaultInstance())
            );
      }

      @Override
      public void setIconPolicy(RpcController var1, SetIconPolicyRequest var2, RpcCallback<SetIconPolicyResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(18),
               var1,
               var2,
               SetIconPolicyResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetIconPolicyResponse.class, SetIconPolicyResponse.getDefaultInstance())
            );
      }

      @Override
      public void setMessagePinningPolicy(RpcController var1, SetMessagePinningPolicyRequest var2, RpcCallback<SetMessagePinningPolicyResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(19),
               var1,
               var2,
               SetMessagePinningPolicyResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetMessagePinningPolicyResponse.class, SetMessagePinningPolicyResponse.getDefaultInstance())
            );
      }

      @Override
      public void setConversationPinned(RpcController var1, SetConversationPinnedRequest var2, RpcCallback<SetConversationPinnedResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(20),
               var1,
               var2,
               SetConversationPinnedResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, SetConversationPinnedResponse.class, SetConversationPinnedResponse.getDefaultInstance())
            );
      }

      @Override
      public void getUploadUrls(RpcController var1, GetUploadUrlsRequest var2, RpcCallback<GetUploadUrlsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(21),
               var1,
               var2,
               GetUploadUrlsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, GetUploadUrlsResponse.class, GetUploadUrlsResponse.getDefaultInstance())
            );
      }

      @Override
      public void unfocusConversations(RpcController var1, UnfocusConversationsRequest var2, RpcCallback<UnfocusConversationsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(22),
               var1,
               var2,
               UnfocusConversationsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, UnfocusConversationsResponse.class, UnfocusConversationsResponse.getDefaultInstance())
            );
      }

      @Override
      public void getConversations(RpcController var1, GetConversationsRequest var2, RpcCallback<GetConversationsResponse> var3) {
         this.channel
            .callMethod(
               getDescriptor().getMethods().get(23),
               var1,
               var2,
               GetConversationsResponse.getDefaultInstance(),
               RpcUtil.generalizeCallback(var3, GetConversationsResponse.class, GetConversationsResponse.getDefaultInstance())
            );
      }
   }
}
