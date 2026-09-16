package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Conversation extends GeneratedMessageV3 implements ConversationOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int PARTICIPANTS_FIELD_NUMBER = 2;
   private List<ConversationParticipant> participants_;
   public static final int TYPE_FIELD_NUMBER = 3;
   private int type_ = 0;
   public static final int LAST_ACTIVITY_TIME_FIELD_NUMBER = 4;
   private Timestamp lastActivityTime_;
   public static final int NAME_FIELD_NUMBER = 5;
   private volatile Object name_ = "";
   public static final int CONVERSATION_IMAGE_URL_FIELD_NUMBER = 6;
   private volatile Object conversationImageUrl_ = "";
   public static final int OWNER_UUID_FIELD_NUMBER = 7;
   private Uuid ownerUuid_;
   public static final int USER_STATE_FIELD_NUMBER = 8;
   private UserConversationState userState_;
   public static final int PARTICIPANT_LIMIT_FIELD_NUMBER = 9;
   private int participantLimit_ = 0;
   public static final int INVITE_POLICY_FIELD_NUMBER = 10;
   private int invitePolicy_ = 0;
   public static final int NAME_POLICY_FIELD_NUMBER = 11;
   private int namePolicy_ = 0;
   public static final int ICON_POLICY_FIELD_NUMBER = 12;
   private int iconPolicy_ = 0;
   public static final int MESSAGE_PINNING_POLICY_FIELD_NUMBER = 13;
   private int messagePinningPolicy_ = 0;
   public static final int LATEST_MESSAGE_FIELD_NUMBER = 14;
   private ConversationMessage latestMessage_;
   private byte memoizedIsInitialized = -1;
   private static final Conversation DEFAULT_INSTANCE = new Conversation();
   private static final Parser<Conversation> PARSER = new AbstractParser<Conversation>() {
      public Conversation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Conversation.Builder var3 = Conversation.newBuilder();

         try {
            var3.mergeFrom(var1, var2);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (UninitializedMessageException var6) {
            throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var7) {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   };

   private Conversation(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Conversation() {
      this.participants_ = Collections.emptyList();
      this.type_ = 0;
      this.name_ = "";
      this.conversationImageUrl_ = "";
      this.invitePolicy_ = 0;
      this.namePolicy_ = 0;
      this.iconPolicy_ = 0;
      this.messagePinningPolicy_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Conversation();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_Conversation_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_Conversation_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Conversation.class, Conversation.Builder.class);
   }

   @Override
   public boolean hasConversationReference() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ConversationReference getConversationReference() {
      return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
   }

   @Override
   public ConversationReferenceOrBuilder getConversationReferenceOrBuilder() {
      return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
   }

   @Override
   public List<ConversationParticipant> getParticipantsList() {
      return this.participants_;
   }

   @Override
   public List<? extends ConversationParticipantOrBuilder> getParticipantsOrBuilderList() {
      return this.participants_;
   }

   @Override
   public int getParticipantsCount() {
      return this.participants_.size();
   }

   @Override
   public ConversationParticipant getParticipants(int var1) {
      return this.participants_.get(var1);
   }

   @Override
   public ConversationParticipantOrBuilder getParticipantsOrBuilder(int var1) {
      return this.participants_.get(var1);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public ConversationType getType() {
      ConversationType var1 = ConversationType.forNumber(this.type_);
      return var1 == null ? ConversationType.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasLastActivityTime() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getLastActivityTime() {
      return this.lastActivityTime_ == null ? Timestamp.getDefaultInstance() : this.lastActivityTime_;
   }

   @Override
   public TimestampOrBuilder getLastActivityTimeOrBuilder() {
      return this.lastActivityTime_ == null ? Timestamp.getDefaultInstance() : this.lastActivityTime_;
   }

   @Override
   public boolean hasName() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasConversationImageUrl() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public String getConversationImageUrl() {
      Object var1 = this.conversationImageUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.conversationImageUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getConversationImageUrlBytes() {
      Object var1 = this.conversationImageUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.conversationImageUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasOwnerUuid() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public Uuid getOwnerUuid() {
      return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
   }

   @Override
   public UuidOrBuilder getOwnerUuidOrBuilder() {
      return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
   }

   @Override
   public boolean hasUserState() {
      return (this.bitField0_ & 32) != 0;
   }

   @Override
   public UserConversationState getUserState() {
      return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
   }

   @Override
   public UserConversationStateOrBuilder getUserStateOrBuilder() {
      return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
   }

   @Override
   public boolean hasParticipantLimit() {
      return (this.bitField0_ & 64) != 0;
   }

   @Override
   public int getParticipantLimit() {
      return this.participantLimit_;
   }

   @Override
   public boolean hasInvitePolicy() {
      return (this.bitField0_ & 128) != 0;
   }

   @Override
   public int getInvitePolicyValue() {
      return this.invitePolicy_;
   }

   @Override
   public InvitePolicy getInvitePolicy() {
      InvitePolicy var1 = InvitePolicy.forNumber(this.invitePolicy_);
      return var1 == null ? InvitePolicy.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasNamePolicy() {
      return (this.bitField0_ & 256) != 0;
   }

   @Override
   public int getNamePolicyValue() {
      return this.namePolicy_;
   }

   @Override
   public NamePolicy getNamePolicy() {
      NamePolicy var1 = NamePolicy.forNumber(this.namePolicy_);
      return var1 == null ? NamePolicy.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasIconPolicy() {
      return (this.bitField0_ & 512) != 0;
   }

   @Override
   public int getIconPolicyValue() {
      return this.iconPolicy_;
   }

   @Override
   public IconPolicy getIconPolicy() {
      IconPolicy var1 = IconPolicy.forNumber(this.iconPolicy_);
      return var1 == null ? IconPolicy.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasMessagePinningPolicy() {
      return (this.bitField0_ & 1024) != 0;
   }

   @Override
   public int getMessagePinningPolicyValue() {
      return this.messagePinningPolicy_;
   }

   @Override
   public MessagePinningPolicy getMessagePinningPolicy() {
      MessagePinningPolicy var1 = MessagePinningPolicy.forNumber(this.messagePinningPolicy_);
      return var1 == null ? MessagePinningPolicy.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasLatestMessage() {
      return (this.bitField0_ & 2048) != 0;
   }

   @Override
   public ConversationMessage getLatestMessage() {
      return this.latestMessage_ == null ? ConversationMessage.getDefaultInstance() : this.latestMessage_;
   }

   @Override
   public ConversationMessageOrBuilder getLatestMessageOrBuilder() {
      return this.latestMessage_ == null ? ConversationMessage.getDefaultInstance() : this.latestMessage_;
   }

   @Override
   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      }

      if (var1 == 0) {
         return false;
      }

      this.memoizedIsInitialized = 1;
      return true;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getConversationReference());
      }

      for (int var2 = 0; var2 < this.participants_.size(); var2++) {
         var1.writeMessage(2, this.participants_.get(var2));
      }

      if (this.type_ != ConversationType.CONVERSATION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(4, this.getLastActivityTime());
      }

      if ((this.bitField0_ & 4) != 0) {
         GeneratedMessageV3.writeString(var1, 5, this.name_);
      }

      if ((this.bitField0_ & 8) != 0) {
         GeneratedMessageV3.writeString(var1, 6, this.conversationImageUrl_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(7, this.getOwnerUuid());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(8, this.getUserState());
      }

      if ((this.bitField0_ & 64) != 0) {
         var1.writeInt32(9, this.participantLimit_);
      }

      if ((this.bitField0_ & 128) != 0) {
         var1.writeEnum(10, this.invitePolicy_);
      }

      if ((this.bitField0_ & 256) != 0) {
         var1.writeEnum(11, this.namePolicy_);
      }

      if ((this.bitField0_ & 512) != 0) {
         var1.writeEnum(12, this.iconPolicy_);
      }

      if ((this.bitField0_ & 1024) != 0) {
         var1.writeEnum(13, this.messagePinningPolicy_);
      }

      if ((this.bitField0_ & 2048) != 0) {
         var1.writeMessage(14, this.getLatestMessage());
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getConversationReference());
      }

      for (int var2 = 0; var2 < this.participants_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.participants_.get(var2));
      }

      if (this.type_ != ConversationType.CONVERSATION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getLastActivityTime());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.name_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.conversationImageUrl_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getOwnerUuid());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getUserState());
      }

      if ((this.bitField0_ & 64) != 0) {
         var1 += CodedOutputStream.computeInt32Size(9, this.participantLimit_);
      }

      if ((this.bitField0_ & 128) != 0) {
         var1 += CodedOutputStream.computeEnumSize(10, this.invitePolicy_);
      }

      if ((this.bitField0_ & 256) != 0) {
         var1 += CodedOutputStream.computeEnumSize(11, this.namePolicy_);
      }

      if ((this.bitField0_ & 512) != 0) {
         var1 += CodedOutputStream.computeEnumSize(12, this.iconPolicy_);
      }

      if ((this.bitField0_ & 1024) != 0) {
         var1 += CodedOutputStream.computeEnumSize(13, this.messagePinningPolicy_);
      }

      if ((this.bitField0_ & 2048) != 0) {
         var1 += CodedOutputStream.computeMessageSize(14, this.getLatestMessage());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Conversation)) {
         return super.equals(var1);
      } else {
         Conversation var2 = (Conversation)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (!this.getParticipantsList().equals(var2.getParticipantsList())) {
            return false;
         } else if (this.type_ != var2.type_) {
            return false;
         } else if (this.hasLastActivityTime() != var2.hasLastActivityTime()) {
            return false;
         } else if (this.hasLastActivityTime() && !this.getLastActivityTime().equals(var2.getLastActivityTime())) {
            return false;
         } else if (this.hasName() != var2.hasName()) {
            return false;
         } else if (this.hasName() && !this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasConversationImageUrl() != var2.hasConversationImageUrl()) {
            return false;
         } else if (this.hasConversationImageUrl() && !this.getConversationImageUrl().equals(var2.getConversationImageUrl())) {
            return false;
         } else if (this.hasOwnerUuid() != var2.hasOwnerUuid()) {
            return false;
         } else if (this.hasOwnerUuid() && !this.getOwnerUuid().equals(var2.getOwnerUuid())) {
            return false;
         } else if (this.hasUserState() != var2.hasUserState()) {
            return false;
         } else if (this.hasUserState() && !this.getUserState().equals(var2.getUserState())) {
            return false;
         } else if (this.hasParticipantLimit() != var2.hasParticipantLimit()) {
            return false;
         } else if (this.hasParticipantLimit() && this.getParticipantLimit() != var2.getParticipantLimit()) {
            return false;
         } else if (this.hasInvitePolicy() != var2.hasInvitePolicy()) {
            return false;
         } else if (this.hasInvitePolicy() && this.invitePolicy_ != var2.invitePolicy_) {
            return false;
         } else if (this.hasNamePolicy() != var2.hasNamePolicy()) {
            return false;
         } else if (this.hasNamePolicy() && this.namePolicy_ != var2.namePolicy_) {
            return false;
         } else if (this.hasIconPolicy() != var2.hasIconPolicy()) {
            return false;
         } else if (this.hasIconPolicy() && this.iconPolicy_ != var2.iconPolicy_) {
            return false;
         } else if (this.hasMessagePinningPolicy() != var2.hasMessagePinningPolicy()) {
            return false;
         } else if (this.hasMessagePinningPolicy() && this.messagePinningPolicy_ != var2.messagePinningPolicy_) {
            return false;
         } else if (this.hasLatestMessage() != var2.hasLatestMessage()) {
            return false;
         } else {
            return this.hasLatestMessage() && !this.getLatestMessage().equals(var2.getLatestMessage())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.hasConversationReference()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConversationReference().hashCode();
      }

      if (this.getParticipantsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getParticipantsList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.type_;
      if (this.hasLastActivityTime()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getLastActivityTime().hashCode();
      }

      if (this.hasName()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getName().hashCode();
      }

      if (this.hasConversationImageUrl()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getConversationImageUrl().hashCode();
      }

      if (this.hasOwnerUuid()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getOwnerUuid().hashCode();
      }

      if (this.hasUserState()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getUserState().hashCode();
      }

      if (this.hasParticipantLimit()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getParticipantLimit();
      }

      if (this.hasInvitePolicy()) {
         var1 = 37 * var1 + 10;
         var1 = 53 * var1 + this.invitePolicy_;
      }

      if (this.hasNamePolicy()) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.namePolicy_;
      }

      if (this.hasIconPolicy()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.iconPolicy_;
      }

      if (this.hasMessagePinningPolicy()) {
         var1 = 37 * var1 + 13;
         var1 = 53 * var1 + this.messagePinningPolicy_;
      }

      if (this.hasLatestMessage()) {
         var1 = 37 * var1 + 14;
         var1 = 53 * var1 + this.getLatestMessage().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Conversation parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Conversation parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Conversation parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Conversation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Conversation parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Conversation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Conversation parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Conversation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Conversation parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Conversation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Conversation parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Conversation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Conversation.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Conversation.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Conversation.Builder newBuilder(Conversation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Conversation.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Conversation.Builder() : new Conversation.Builder().mergeFrom(this);
   }

   protected Conversation.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Conversation.Builder(var1);
   }

   public static Conversation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Conversation> parser() {
      return PARSER;
   }

   @Override
   public Parser<Conversation> getParserForType() {
      return PARSER;
   }

   public Conversation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Conversation.Builder> implements ConversationOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private List<ConversationParticipant> participants_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConversationParticipant, ConversationParticipant.Builder, ConversationParticipantOrBuilder> participantsBuilder_;
      private int type_ = 0;
      private Timestamp lastActivityTime_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastActivityTimeBuilder_;
      private Object name_ = "";
      private Object conversationImageUrl_ = "";
      private Uuid ownerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> ownerUuidBuilder_;
      private UserConversationState userState_;
      private SingleFieldBuilderV3<UserConversationState, UserConversationState.Builder, UserConversationStateOrBuilder> userStateBuilder_;
      private int participantLimit_;
      private int invitePolicy_ = 0;
      private int namePolicy_ = 0;
      private int iconPolicy_ = 0;
      private int messagePinningPolicy_ = 0;
      private ConversationMessage latestMessage_;
      private SingleFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> latestMessageBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_Conversation_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_Conversation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Conversation.class, Conversation.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Conversation.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getParticipantsFieldBuilder();
            this.getLastActivityTimeFieldBuilder();
            this.getOwnerUuidFieldBuilder();
            this.getUserStateFieldBuilder();
            this.getLatestMessageFieldBuilder();
         }
      }

      public Conversation.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         if (this.participantsBuilder_ == null) {
            this.participants_ = Collections.emptyList();
         } else {
            this.participants_ = null;
            this.participantsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.type_ = 0;
         this.lastActivityTime_ = null;
         if (this.lastActivityTimeBuilder_ != null) {
            this.lastActivityTimeBuilder_.dispose();
            this.lastActivityTimeBuilder_ = null;
         }

         this.name_ = "";
         this.conversationImageUrl_ = "";
         this.ownerUuid_ = null;
         if (this.ownerUuidBuilder_ != null) {
            this.ownerUuidBuilder_.dispose();
            this.ownerUuidBuilder_ = null;
         }

         this.userState_ = null;
         if (this.userStateBuilder_ != null) {
            this.userStateBuilder_.dispose();
            this.userStateBuilder_ = null;
         }

         this.participantLimit_ = 0;
         this.invitePolicy_ = 0;
         this.namePolicy_ = 0;
         this.iconPolicy_ = 0;
         this.messagePinningPolicy_ = 0;
         this.latestMessage_ = null;
         if (this.latestMessageBuilder_ != null) {
            this.latestMessageBuilder_.dispose();
            this.latestMessageBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_Conversation_descriptor;
      }

      public Conversation getDefaultInstanceForType() {
         return Conversation.getDefaultInstance();
      }

      public Conversation build() {
         Conversation var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Conversation buildPartial() {
         Conversation var1 = new Conversation(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(Conversation var1) {
         if (this.participantsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.participants_ = Collections.unmodifiableList(this.participants_);
               this.bitField0_ &= -3;
            }

            var1.participants_ = this.participants_;
         } else {
            var1.participants_ = this.participantsBuilder_.build();
         }
      }

      private void buildPartial0(Conversation var1) {
         int var2 = this.bitField0_;
         short var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.type_ = this.type_;
         }

         if ((var2 & 8) != 0) {
            var1.lastActivityTime_ = this.lastActivityTimeBuilder_ == null ? this.lastActivityTime_ : this.lastActivityTimeBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 16) != 0) {
            var1.name_ = this.name_;
            var3 |= 4;
         }

         if ((var2 & 32) != 0) {
            var1.conversationImageUrl_ = this.conversationImageUrl_;
            var3 |= 8;
         }

         if ((var2 & 64) != 0) {
            var1.ownerUuid_ = this.ownerUuidBuilder_ == null ? this.ownerUuid_ : this.ownerUuidBuilder_.build();
            var3 |= 16;
         }

         if ((var2 & 128) != 0) {
            var1.userState_ = this.userStateBuilder_ == null ? this.userState_ : this.userStateBuilder_.build();
            var3 |= 32;
         }

         if ((var2 & 256) != 0) {
            var1.participantLimit_ = this.participantLimit_;
            var3 |= 64;
         }

         if ((var2 & 512) != 0) {
            var1.invitePolicy_ = this.invitePolicy_;
            var3 |= 128;
         }

         if ((var2 & 1024) != 0) {
            var1.namePolicy_ = this.namePolicy_;
            var3 |= 256;
         }

         if ((var2 & 2048) != 0) {
            var1.iconPolicy_ = this.iconPolicy_;
            var3 |= 512;
         }

         if ((var2 & 4096) != 0) {
            var1.messagePinningPolicy_ = this.messagePinningPolicy_;
            var3 |= 1024;
         }

         if ((var2 & 8192) != 0) {
            var1.latestMessage_ = this.latestMessageBuilder_ == null ? this.latestMessage_ : this.latestMessageBuilder_.build();
            var3 |= 2048;
         }

         Conversation var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public Conversation.Builder clone() {
         return (Conversation.Builder)super.clone();
      }

      public Conversation.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Conversation.Builder)super.setField(var1, var2);
      }

      public Conversation.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Conversation.Builder)super.clearField(var1);
      }

      public Conversation.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Conversation.Builder)super.clearOneof(var1);
      }

      public Conversation.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Conversation.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Conversation.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Conversation.Builder)super.addRepeatedField(var1, var2);
      }

      public Conversation.Builder mergeFrom(Message var1) {
         if (var1 instanceof Conversation) {
            return this.mergeFrom((Conversation)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Conversation.Builder mergeFrom(Conversation var1) {
         if (var1 == Conversation.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (this.participantsBuilder_ == null) {
            if (!var1.participants_.isEmpty()) {
               if (this.participants_.isEmpty()) {
                  this.participants_ = var1.participants_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureParticipantsIsMutable();
                  this.participants_.addAll(var1.participants_);
               }

               this.onChanged();
            }
         } else if (!var1.participants_.isEmpty()) {
            if (this.participantsBuilder_.isEmpty()) {
               this.participantsBuilder_.dispose();
               this.participantsBuilder_ = null;
               this.participants_ = var1.participants_;
               this.bitField0_ &= -3;
               this.participantsBuilder_ = Conversation.alwaysUseFieldBuilders ? this.getParticipantsFieldBuilder() : null;
            } else {
               this.participantsBuilder_.addAllMessages(var1.participants_);
            }
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (var1.hasLastActivityTime()) {
            this.mergeLastActivityTime(var1.getLastActivityTime());
         }

         if (var1.hasName()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (var1.hasConversationImageUrl()) {
            this.conversationImageUrl_ = var1.conversationImageUrl_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (var1.hasOwnerUuid()) {
            this.mergeOwnerUuid(var1.getOwnerUuid());
         }

         if (var1.hasUserState()) {
            this.mergeUserState(var1.getUserState());
         }

         if (var1.hasParticipantLimit()) {
            this.setParticipantLimit(var1.getParticipantLimit());
         }

         if (var1.hasInvitePolicy()) {
            this.setInvitePolicy(var1.getInvitePolicy());
         }

         if (var1.hasNamePolicy()) {
            this.setNamePolicy(var1.getNamePolicy());
         }

         if (var1.hasIconPolicy()) {
            this.setIconPolicy(var1.getIconPolicy());
         }

         if (var1.hasMessagePinningPolicy()) {
            this.setMessagePinningPolicy(var1.getMessagePinningPolicy());
         }

         if (var1.hasLatestMessage()) {
            this.mergeLatestMessage(var1.getLatestMessage());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Conversation.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         try {
            boolean var3 = false;

            while (!var3) {
               int var4 = var1.readTag();
               switch (var4) {
                  case 0:
                     var3 = true;
                     break;
                  case 10:
                     var1.readMessage(this.getConversationReferenceFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     ConversationParticipant var5 = var1.readMessage(ConversationParticipant.parser(), var2);
                     if (this.participantsBuilder_ == null) {
                        this.ensureParticipantsIsMutable();
                        this.participants_.add(var5);
                     } else {
                        this.participantsBuilder_.addMessage(var5);
                     }
                     break;
                  case 24:
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getLastActivityTimeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.conversationImageUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getOwnerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getUserStateFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     this.participantLimit_ = var1.readInt32();
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.invitePolicy_ = var1.readEnum();
                     this.bitField0_ |= 512;
                     break;
                  case 88:
                     this.namePolicy_ = var1.readEnum();
                     this.bitField0_ |= 1024;
                     break;
                  case 96:
                     this.iconPolicy_ = var1.readEnum();
                     this.bitField0_ |= 2048;
                     break;
                  case 104:
                     this.messagePinningPolicy_ = var1.readEnum();
                     this.bitField0_ |= 4096;
                     break;
                  case 114:
                     var1.readMessage(this.getLatestMessageFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8192;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasConversationReference() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ConversationReference getConversationReference() {
         if (this.conversationReferenceBuilder_ == null) {
            return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
         } else {
            return this.conversationReferenceBuilder_.getMessage();
         }
      }

      public Conversation.Builder setConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.conversationReference_ = var1;
         } else {
            this.conversationReferenceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Conversation.Builder mergeConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.conversationReference_ != null && this.conversationReference_ != ConversationReference.getDefaultInstance()) {
               this.getConversationReferenceBuilder().mergeFrom(var1);
            } else {
               this.conversationReference_ = var1;
            }
         } else {
            this.conversationReferenceBuilder_.mergeFrom(var1);
         }

         if (this.conversationReference_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public Conversation.Builder clearConversationReference() {
         this.bitField0_ &= -2;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationReference.Builder getConversationReferenceBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getConversationReferenceFieldBuilder().getBuilder();
      }

      @Override
      public ConversationReferenceOrBuilder getConversationReferenceOrBuilder() {
         if (this.conversationReferenceBuilder_ != null) {
            return this.conversationReferenceBuilder_.getMessageOrBuilder();
         } else {
            return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
         }
      }

      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> getConversationReferenceFieldBuilder() {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReferenceBuilder_ = new SingleFieldBuilderV3<>(this.getConversationReference(), this.getParentForChildren(), this.isClean());
            this.conversationReference_ = null;
         }

         return this.conversationReferenceBuilder_;
      }

      private void ensureParticipantsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.participants_ = new ArrayList<>(this.participants_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<ConversationParticipant> getParticipantsList() {
         return this.participantsBuilder_ == null ? Collections.unmodifiableList(this.participants_) : this.participantsBuilder_.getMessageList();
      }

      @Override
      public int getParticipantsCount() {
         return this.participantsBuilder_ == null ? this.participants_.size() : this.participantsBuilder_.getCount();
      }

      @Override
      public ConversationParticipant getParticipants(int var1) {
         return this.participantsBuilder_ == null ? this.participants_.get(var1) : this.participantsBuilder_.getMessage(var1);
      }

      public Conversation.Builder setParticipants(int var1, ConversationParticipant var2) {
         if (this.participantsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantsIsMutable();
            this.participants_.set(var1, var2);
            this.onChanged();
         } else {
            this.participantsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public Conversation.Builder setParticipants(int var1, ConversationParticipant.Builder var2) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.participantsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public Conversation.Builder addParticipants(ConversationParticipant var1) {
         if (this.participantsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantsIsMutable();
            this.participants_.add(var1);
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1);
         }

         return this;
      }

      public Conversation.Builder addParticipants(int var1, ConversationParticipant var2) {
         if (this.participantsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantsIsMutable();
            this.participants_.add(var1, var2);
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public Conversation.Builder addParticipants(ConversationParticipant.Builder var1) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.add(var1.build());
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public Conversation.Builder addParticipants(int var1, ConversationParticipant.Builder var2) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public Conversation.Builder addAllParticipants(Iterable<? extends ConversationParticipant> var1) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.participants_);
            this.onChanged();
         } else {
            this.participantsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public Conversation.Builder clearParticipants() {
         if (this.participantsBuilder_ == null) {
            this.participants_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.participantsBuilder_.clear();
         }

         return this;
      }

      public Conversation.Builder removeParticipants(int var1) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.remove(var1);
            this.onChanged();
         } else {
            this.participantsBuilder_.remove(var1);
         }

         return this;
      }

      public ConversationParticipant.Builder getParticipantsBuilder(int var1) {
         return this.getParticipantsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConversationParticipantOrBuilder getParticipantsOrBuilder(int var1) {
         return this.participantsBuilder_ == null ? this.participants_.get(var1) : this.participantsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConversationParticipantOrBuilder> getParticipantsOrBuilderList() {
         return this.participantsBuilder_ != null ? this.participantsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.participants_);
      }

      public ConversationParticipant.Builder addParticipantsBuilder() {
         return this.getParticipantsFieldBuilder().addBuilder(ConversationParticipant.getDefaultInstance());
      }

      public ConversationParticipant.Builder addParticipantsBuilder(int var1) {
         return this.getParticipantsFieldBuilder().addBuilder(var1, ConversationParticipant.getDefaultInstance());
      }

      public List<ConversationParticipant.Builder> getParticipantsBuilderList() {
         return this.getParticipantsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ConversationParticipant, ConversationParticipant.Builder, ConversationParticipantOrBuilder> getParticipantsFieldBuilder() {
         if (this.participantsBuilder_ == null) {
            this.participantsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.participants_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.participants_ = null;
         }

         return this.participantsBuilder_;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public Conversation.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public ConversationType getType() {
         ConversationType var1 = ConversationType.forNumber(this.type_);
         return var1 == null ? ConversationType.UNRECOGNIZED : var1;
      }

      public Conversation.Builder setType(ConversationType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearType() {
         this.bitField0_ &= -5;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLastActivityTime() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Timestamp getLastActivityTime() {
         if (this.lastActivityTimeBuilder_ == null) {
            return this.lastActivityTime_ == null ? Timestamp.getDefaultInstance() : this.lastActivityTime_;
         } else {
            return this.lastActivityTimeBuilder_.getMessage();
         }
      }

      public Conversation.Builder setLastActivityTime(Timestamp var1) {
         if (this.lastActivityTimeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lastActivityTime_ = var1;
         } else {
            this.lastActivityTimeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setLastActivityTime(Timestamp.Builder var1) {
         if (this.lastActivityTimeBuilder_ == null) {
            this.lastActivityTime_ = var1.build();
         } else {
            this.lastActivityTimeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Conversation.Builder mergeLastActivityTime(Timestamp var1) {
         if (this.lastActivityTimeBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.lastActivityTime_ != null && this.lastActivityTime_ != Timestamp.getDefaultInstance()) {
               this.getLastActivityTimeBuilder().mergeFrom(var1);
            } else {
               this.lastActivityTime_ = var1;
            }
         } else {
            this.lastActivityTimeBuilder_.mergeFrom(var1);
         }

         if (this.lastActivityTime_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public Conversation.Builder clearLastActivityTime() {
         this.bitField0_ &= -9;
         this.lastActivityTime_ = null;
         if (this.lastActivityTimeBuilder_ != null) {
            this.lastActivityTimeBuilder_.dispose();
            this.lastActivityTimeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getLastActivityTimeBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getLastActivityTimeFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getLastActivityTimeOrBuilder() {
         if (this.lastActivityTimeBuilder_ != null) {
            return this.lastActivityTimeBuilder_.getMessageOrBuilder();
         } else {
            return this.lastActivityTime_ == null ? Timestamp.getDefaultInstance() : this.lastActivityTime_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastActivityTimeFieldBuilder() {
         if (this.lastActivityTimeBuilder_ == null) {
            this.lastActivityTimeBuilder_ = new SingleFieldBuilderV3<>(this.getLastActivityTime(), this.getParentForChildren(), this.isClean());
            this.lastActivityTime_ = null;
         }

         return this.lastActivityTimeBuilder_;
      }

      @Override
      public boolean hasName() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Conversation.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearName() {
         this.name_ = Conversation.getDefaultInstance().getName();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Conversation.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasConversationImageUrl() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public String getConversationImageUrl() {
         Object var1 = this.conversationImageUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.conversationImageUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getConversationImageUrlBytes() {
         Object var1 = this.conversationImageUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.conversationImageUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Conversation.Builder setConversationImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.conversationImageUrl_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearConversationImageUrl() {
         this.conversationImageUrl_ = Conversation.getDefaultInstance().getConversationImageUrl();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setConversationImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Conversation.checkByteStringIsUtf8(var1);
         this.conversationImageUrl_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOwnerUuid() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Uuid getOwnerUuid() {
         if (this.ownerUuidBuilder_ == null) {
            return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
         } else {
            return this.ownerUuidBuilder_.getMessage();
         }
      }

      public Conversation.Builder setOwnerUuid(Uuid var1) {
         if (this.ownerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ownerUuid_ = var1;
         } else {
            this.ownerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setOwnerUuid(Uuid.Builder var1) {
         if (this.ownerUuidBuilder_ == null) {
            this.ownerUuid_ = var1.build();
         } else {
            this.ownerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public Conversation.Builder mergeOwnerUuid(Uuid var1) {
         if (this.ownerUuidBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.ownerUuid_ != null && this.ownerUuid_ != Uuid.getDefaultInstance()) {
               this.getOwnerUuidBuilder().mergeFrom(var1);
            } else {
               this.ownerUuid_ = var1;
            }
         } else {
            this.ownerUuidBuilder_.mergeFrom(var1);
         }

         if (this.ownerUuid_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public Conversation.Builder clearOwnerUuid() {
         this.bitField0_ &= -65;
         this.ownerUuid_ = null;
         if (this.ownerUuidBuilder_ != null) {
            this.ownerUuidBuilder_.dispose();
            this.ownerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getOwnerUuidBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getOwnerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getOwnerUuidOrBuilder() {
         if (this.ownerUuidBuilder_ != null) {
            return this.ownerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getOwnerUuidFieldBuilder() {
         if (this.ownerUuidBuilder_ == null) {
            this.ownerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getOwnerUuid(), this.getParentForChildren(), this.isClean());
            this.ownerUuid_ = null;
         }

         return this.ownerUuidBuilder_;
      }

      @Override
      public boolean hasUserState() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public UserConversationState getUserState() {
         if (this.userStateBuilder_ == null) {
            return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
         } else {
            return this.userStateBuilder_.getMessage();
         }
      }

      public Conversation.Builder setUserState(UserConversationState var1) {
         if (this.userStateBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.userState_ = var1;
         } else {
            this.userStateBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setUserState(UserConversationState.Builder var1) {
         if (this.userStateBuilder_ == null) {
            this.userState_ = var1.build();
         } else {
            this.userStateBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public Conversation.Builder mergeUserState(UserConversationState var1) {
         if (this.userStateBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.userState_ != null && this.userState_ != UserConversationState.getDefaultInstance()) {
               this.getUserStateBuilder().mergeFrom(var1);
            } else {
               this.userState_ = var1;
            }
         } else {
            this.userStateBuilder_.mergeFrom(var1);
         }

         if (this.userState_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public Conversation.Builder clearUserState() {
         this.bitField0_ &= -129;
         this.userState_ = null;
         if (this.userStateBuilder_ != null) {
            this.userStateBuilder_.dispose();
            this.userStateBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UserConversationState.Builder getUserStateBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getUserStateFieldBuilder().getBuilder();
      }

      @Override
      public UserConversationStateOrBuilder getUserStateOrBuilder() {
         if (this.userStateBuilder_ != null) {
            return this.userStateBuilder_.getMessageOrBuilder();
         } else {
            return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
         }
      }

      private SingleFieldBuilderV3<UserConversationState, UserConversationState.Builder, UserConversationStateOrBuilder> getUserStateFieldBuilder() {
         if (this.userStateBuilder_ == null) {
            this.userStateBuilder_ = new SingleFieldBuilderV3<>(this.getUserState(), this.getParentForChildren(), this.isClean());
            this.userState_ = null;
         }

         return this.userStateBuilder_;
      }

      @Override
      public boolean hasParticipantLimit() {
         return (this.bitField0_ & 256) != 0;
      }

      @Override
      public int getParticipantLimit() {
         return this.participantLimit_;
      }

      public Conversation.Builder setParticipantLimit(int var1) {
         this.participantLimit_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearParticipantLimit() {
         this.bitField0_ &= -257;
         this.participantLimit_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasInvitePolicy() {
         return (this.bitField0_ & 512) != 0;
      }

      @Override
      public int getInvitePolicyValue() {
         return this.invitePolicy_;
      }

      public Conversation.Builder setInvitePolicyValue(int var1) {
         this.invitePolicy_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public InvitePolicy getInvitePolicy() {
         InvitePolicy var1 = InvitePolicy.forNumber(this.invitePolicy_);
         return var1 == null ? InvitePolicy.UNRECOGNIZED : var1;
      }

      public Conversation.Builder setInvitePolicy(InvitePolicy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 512;
         this.invitePolicy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearInvitePolicy() {
         this.bitField0_ &= -513;
         this.invitePolicy_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasNamePolicy() {
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public int getNamePolicyValue() {
         return this.namePolicy_;
      }

      public Conversation.Builder setNamePolicyValue(int var1) {
         this.namePolicy_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      @Override
      public NamePolicy getNamePolicy() {
         NamePolicy var1 = NamePolicy.forNumber(this.namePolicy_);
         return var1 == null ? NamePolicy.UNRECOGNIZED : var1;
      }

      public Conversation.Builder setNamePolicy(NamePolicy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1024;
         this.namePolicy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearNamePolicy() {
         this.bitField0_ &= -1025;
         this.namePolicy_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasIconPolicy() {
         return (this.bitField0_ & 2048) != 0;
      }

      @Override
      public int getIconPolicyValue() {
         return this.iconPolicy_;
      }

      public Conversation.Builder setIconPolicyValue(int var1) {
         this.iconPolicy_ = var1;
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      @Override
      public IconPolicy getIconPolicy() {
         IconPolicy var1 = IconPolicy.forNumber(this.iconPolicy_);
         return var1 == null ? IconPolicy.UNRECOGNIZED : var1;
      }

      public Conversation.Builder setIconPolicy(IconPolicy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2048;
         this.iconPolicy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearIconPolicy() {
         this.bitField0_ &= -2049;
         this.iconPolicy_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasMessagePinningPolicy() {
         return (this.bitField0_ & 4096) != 0;
      }

      @Override
      public int getMessagePinningPolicyValue() {
         return this.messagePinningPolicy_;
      }

      public Conversation.Builder setMessagePinningPolicyValue(int var1) {
         this.messagePinningPolicy_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      @Override
      public MessagePinningPolicy getMessagePinningPolicy() {
         MessagePinningPolicy var1 = MessagePinningPolicy.forNumber(this.messagePinningPolicy_);
         return var1 == null ? MessagePinningPolicy.UNRECOGNIZED : var1;
      }

      public Conversation.Builder setMessagePinningPolicy(MessagePinningPolicy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4096;
         this.messagePinningPolicy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Conversation.Builder clearMessagePinningPolicy() {
         this.bitField0_ &= -4097;
         this.messagePinningPolicy_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLatestMessage() {
         return (this.bitField0_ & 8192) != 0;
      }

      @Override
      public ConversationMessage getLatestMessage() {
         if (this.latestMessageBuilder_ == null) {
            return this.latestMessage_ == null ? ConversationMessage.getDefaultInstance() : this.latestMessage_;
         } else {
            return this.latestMessageBuilder_.getMessage();
         }
      }

      public Conversation.Builder setLatestMessage(ConversationMessage var1) {
         if (this.latestMessageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.latestMessage_ = var1;
         } else {
            this.latestMessageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public Conversation.Builder setLatestMessage(ConversationMessage.Builder var1) {
         if (this.latestMessageBuilder_ == null) {
            this.latestMessage_ = var1.build();
         } else {
            this.latestMessageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public Conversation.Builder mergeLatestMessage(ConversationMessage var1) {
         if (this.latestMessageBuilder_ == null) {
            if ((this.bitField0_ & 8192) != 0 && this.latestMessage_ != null && this.latestMessage_ != ConversationMessage.getDefaultInstance()) {
               this.getLatestMessageBuilder().mergeFrom(var1);
            } else {
               this.latestMessage_ = var1;
            }
         } else {
            this.latestMessageBuilder_.mergeFrom(var1);
         }

         if (this.latestMessage_ != null) {
            this.bitField0_ |= 8192;
            this.onChanged();
         }

         return this;
      }

      public Conversation.Builder clearLatestMessage() {
         this.bitField0_ &= -8193;
         this.latestMessage_ = null;
         if (this.latestMessageBuilder_ != null) {
            this.latestMessageBuilder_.dispose();
            this.latestMessageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder getLatestMessageBuilder() {
         this.bitField0_ |= 8192;
         this.onChanged();
         return this.getLatestMessageFieldBuilder().getBuilder();
      }

      @Override
      public ConversationMessageOrBuilder getLatestMessageOrBuilder() {
         if (this.latestMessageBuilder_ != null) {
            return this.latestMessageBuilder_.getMessageOrBuilder();
         } else {
            return this.latestMessage_ == null ? ConversationMessage.getDefaultInstance() : this.latestMessage_;
         }
      }

      private SingleFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> getLatestMessageFieldBuilder() {
         if (this.latestMessageBuilder_ == null) {
            this.latestMessageBuilder_ = new SingleFieldBuilderV3<>(this.getLatestMessage(), this.getParentForChildren(), this.isClean());
            this.latestMessage_ = null;
         }

         return this.latestMessageBuilder_;
      }

      public final Conversation.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Conversation.Builder)super.setUnknownFields(var1);
      }

      public final Conversation.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Conversation.Builder)super.mergeUnknownFields(var1);
      }
   }
}
