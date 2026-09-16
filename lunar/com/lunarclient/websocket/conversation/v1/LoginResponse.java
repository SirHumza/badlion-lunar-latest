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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoginResponse extends GeneratedMessageV3 implements LoginResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CONVERSATIONS_FIELD_NUMBER = 1;
   private List<ConversationStub> conversations_;
   public static final int PARTICIPANT_LIMIT_FIELD_NUMBER = 2;
   private int participantLimit_ = 0;
   public static final int STICKER_PACKS_FIELD_NUMBER = 3;
   private List<LunarStickerPack> stickerPacks_;
   public static final int EMOJI_CATEGORIES_FIELD_NUMBER = 4;
   private List<LunarEmojiCategory> emojiCategories_;
   public static final int TOTAL_CONVERSATIONS_FIELD_NUMBER = 5;
   private int totalConversations_ = 0;
   public static final int MAX_MESSAGE_LENGTH_FIELD_NUMBER = 6;
   private int maxMessageLength_ = 0;
   public static final int PINNED_CONVERSATION_LIMIT_FIELD_NUMBER = 7;
   private int pinnedConversationLimit_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final LoginResponse DEFAULT_INSTANCE = new LoginResponse();
   private static final Parser<LoginResponse> PARSER = new AbstractParser<LoginResponse>() {
      public LoginResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoginResponse.Builder var3 = LoginResponse.newBuilder();

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

   private LoginResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoginResponse() {
      this.conversations_ = Collections.emptyList();
      this.stickerPacks_ = Collections.emptyList();
      this.emojiCategories_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public List<ConversationStub> getConversationsList() {
      return this.conversations_;
   }

   @Override
   public List<? extends ConversationStubOrBuilder> getConversationsOrBuilderList() {
      return this.conversations_;
   }

   @Override
   public int getConversationsCount() {
      return this.conversations_.size();
   }

   @Override
   public ConversationStub getConversations(int var1) {
      return this.conversations_.get(var1);
   }

   @Override
   public ConversationStubOrBuilder getConversationsOrBuilder(int var1) {
      return this.conversations_.get(var1);
   }

   @Override
   public int getParticipantLimit() {
      return this.participantLimit_;
   }

   @Override
   public List<LunarStickerPack> getStickerPacksList() {
      return this.stickerPacks_;
   }

   @Override
   public List<? extends LunarStickerPackOrBuilder> getStickerPacksOrBuilderList() {
      return this.stickerPacks_;
   }

   @Override
   public int getStickerPacksCount() {
      return this.stickerPacks_.size();
   }

   @Override
   public LunarStickerPack getStickerPacks(int var1) {
      return this.stickerPacks_.get(var1);
   }

   @Override
   public LunarStickerPackOrBuilder getStickerPacksOrBuilder(int var1) {
      return this.stickerPacks_.get(var1);
   }

   @Override
   public List<LunarEmojiCategory> getEmojiCategoriesList() {
      return this.emojiCategories_;
   }

   @Override
   public List<? extends LunarEmojiCategoryOrBuilder> getEmojiCategoriesOrBuilderList() {
      return this.emojiCategories_;
   }

   @Override
   public int getEmojiCategoriesCount() {
      return this.emojiCategories_.size();
   }

   @Override
   public LunarEmojiCategory getEmojiCategories(int var1) {
      return this.emojiCategories_.get(var1);
   }

   @Override
   public LunarEmojiCategoryOrBuilder getEmojiCategoriesOrBuilder(int var1) {
      return this.emojiCategories_.get(var1);
   }

   @Override
   public int getTotalConversations() {
      return this.totalConversations_;
   }

   @Override
   public int getMaxMessageLength() {
      return this.maxMessageLength_;
   }

   @Override
   public int getPinnedConversationLimit() {
      return this.pinnedConversationLimit_;
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
      for (int var2 = 0; var2 < this.conversations_.size(); var2++) {
         var1.writeMessage(1, this.conversations_.get(var2));
      }

      if (this.participantLimit_ != 0) {
         var1.writeInt32(2, this.participantLimit_);
      }

      for (int var3 = 0; var3 < this.stickerPacks_.size(); var3++) {
         var1.writeMessage(3, this.stickerPacks_.get(var3));
      }

      for (int var4 = 0; var4 < this.emojiCategories_.size(); var4++) {
         var1.writeMessage(4, this.emojiCategories_.get(var4));
      }

      if (this.totalConversations_ != 0) {
         var1.writeInt32(5, this.totalConversations_);
      }

      if (this.maxMessageLength_ != 0) {
         var1.writeInt32(6, this.maxMessageLength_);
      }

      if (this.pinnedConversationLimit_ != 0) {
         var1.writeInt32(7, this.pinnedConversationLimit_);
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

      for (int var2 = 0; var2 < this.conversations_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.conversations_.get(var2));
      }

      if (this.participantLimit_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.participantLimit_);
      }

      for (int var5 = 0; var5 < this.stickerPacks_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.stickerPacks_.get(var5));
      }

      for (int var6 = 0; var6 < this.emojiCategories_.size(); var6++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.emojiCategories_.get(var6));
      }

      if (this.totalConversations_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.totalConversations_);
      }

      if (this.maxMessageLength_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.maxMessageLength_);
      }

      if (this.pinnedConversationLimit_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.pinnedConversationLimit_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoginResponse)) {
         return super.equals(var1);
      } else {
         LoginResponse var2 = (LoginResponse)var1;
         if (!this.getConversationsList().equals(var2.getConversationsList())) {
            return false;
         } else if (this.getParticipantLimit() != var2.getParticipantLimit()) {
            return false;
         } else if (!this.getStickerPacksList().equals(var2.getStickerPacksList())) {
            return false;
         } else if (!this.getEmojiCategoriesList().equals(var2.getEmojiCategoriesList())) {
            return false;
         } else if (this.getTotalConversations() != var2.getTotalConversations()) {
            return false;
         } else if (this.getMaxMessageLength() != var2.getMaxMessageLength()) {
            return false;
         } else {
            return this.getPinnedConversationLimit() != var2.getPinnedConversationLimit() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getConversationsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConversationsList().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getParticipantLimit();
      if (this.getStickerPacksCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getStickerPacksList().hashCode();
      }

      if (this.getEmojiCategoriesCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getEmojiCategoriesList().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getTotalConversations();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getMaxMessageLength();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getPinnedConversationLimit();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoginResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoginResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoginResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoginResponse.Builder newBuilder(LoginResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoginResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoginResponse.Builder() : new LoginResponse.Builder().mergeFrom(this);
   }

   protected LoginResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoginResponse.Builder(var1);
   }

   public static LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoginResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoginResponse> getParserForType() {
      return PARSER;
   }

   public LoginResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoginResponse.Builder> implements LoginResponseOrBuilder {
      private int bitField0_;
      private List<ConversationStub> conversations_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConversationStub, ConversationStub.Builder, ConversationStubOrBuilder> conversationsBuilder_;
      private int participantLimit_;
      private List<LunarStickerPack> stickerPacks_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<LunarStickerPack, LunarStickerPack.Builder, LunarStickerPackOrBuilder> stickerPacksBuilder_;
      private List<LunarEmojiCategory> emojiCategories_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<LunarEmojiCategory, LunarEmojiCategory.Builder, LunarEmojiCategoryOrBuilder> emojiCategoriesBuilder_;
      private int totalConversations_;
      private int maxMessageLength_;
      private int pinnedConversationLimit_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.conversationsBuilder_ == null) {
            this.conversations_ = Collections.emptyList();
         } else {
            this.conversations_ = null;
            this.conversationsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.participantLimit_ = 0;
         if (this.stickerPacksBuilder_ == null) {
            this.stickerPacks_ = Collections.emptyList();
         } else {
            this.stickerPacks_ = null;
            this.stickerPacksBuilder_.clear();
         }

         this.bitField0_ &= -5;
         if (this.emojiCategoriesBuilder_ == null) {
            this.emojiCategories_ = Collections.emptyList();
         } else {
            this.emojiCategories_ = null;
            this.emojiCategoriesBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.totalConversations_ = 0;
         this.maxMessageLength_ = 0;
         this.pinnedConversationLimit_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoginResponse_descriptor;
      }

      public LoginResponse getDefaultInstanceForType() {
         return LoginResponse.getDefaultInstance();
      }

      public LoginResponse build() {
         LoginResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoginResponse buildPartial() {
         LoginResponse var1 = new LoginResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoginResponse var1) {
         if (this.conversationsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.conversations_ = Collections.unmodifiableList(this.conversations_);
               this.bitField0_ &= -2;
            }

            var1.conversations_ = this.conversations_;
         } else {
            var1.conversations_ = this.conversationsBuilder_.build();
         }

         if (this.stickerPacksBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.stickerPacks_ = Collections.unmodifiableList(this.stickerPacks_);
               this.bitField0_ &= -5;
            }

            var1.stickerPacks_ = this.stickerPacks_;
         } else {
            var1.stickerPacks_ = this.stickerPacksBuilder_.build();
         }

         if (this.emojiCategoriesBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.emojiCategories_ = Collections.unmodifiableList(this.emojiCategories_);
               this.bitField0_ &= -9;
            }

            var1.emojiCategories_ = this.emojiCategories_;
         } else {
            var1.emojiCategories_ = this.emojiCategoriesBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.participantLimit_ = this.participantLimit_;
         }

         if ((var2 & 16) != 0) {
            var1.totalConversations_ = this.totalConversations_;
         }

         if ((var2 & 32) != 0) {
            var1.maxMessageLength_ = this.maxMessageLength_;
         }

         if ((var2 & 64) != 0) {
            var1.pinnedConversationLimit_ = this.pinnedConversationLimit_;
         }
      }

      public LoginResponse.Builder clone() {
         return (LoginResponse.Builder)super.clone();
      }

      public LoginResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.setField(var1, var2);
      }

      public LoginResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoginResponse.Builder)super.clearField(var1);
      }

      public LoginResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoginResponse.Builder)super.clearOneof(var1);
      }

      public LoginResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoginResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoginResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoginResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoginResponse) {
            return this.mergeFrom((LoginResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoginResponse.Builder mergeFrom(LoginResponse var1) {
         if (var1 == LoginResponse.getDefaultInstance()) {
            return this;
         }

         if (this.conversationsBuilder_ == null) {
            if (!var1.conversations_.isEmpty()) {
               if (this.conversations_.isEmpty()) {
                  this.conversations_ = var1.conversations_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureConversationsIsMutable();
                  this.conversations_.addAll(var1.conversations_);
               }

               this.onChanged();
            }
         } else if (!var1.conversations_.isEmpty()) {
            if (this.conversationsBuilder_.isEmpty()) {
               this.conversationsBuilder_.dispose();
               this.conversationsBuilder_ = null;
               this.conversations_ = var1.conversations_;
               this.bitField0_ &= -2;
               this.conversationsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getConversationsFieldBuilder() : null;
            } else {
               this.conversationsBuilder_.addAllMessages(var1.conversations_);
            }
         }

         if (var1.getParticipantLimit() != 0) {
            this.setParticipantLimit(var1.getParticipantLimit());
         }

         if (this.stickerPacksBuilder_ == null) {
            if (!var1.stickerPacks_.isEmpty()) {
               if (this.stickerPacks_.isEmpty()) {
                  this.stickerPacks_ = var1.stickerPacks_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureStickerPacksIsMutable();
                  this.stickerPacks_.addAll(var1.stickerPacks_);
               }

               this.onChanged();
            }
         } else if (!var1.stickerPacks_.isEmpty()) {
            if (this.stickerPacksBuilder_.isEmpty()) {
               this.stickerPacksBuilder_.dispose();
               this.stickerPacksBuilder_ = null;
               this.stickerPacks_ = var1.stickerPacks_;
               this.bitField0_ &= -5;
               this.stickerPacksBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getStickerPacksFieldBuilder() : null;
            } else {
               this.stickerPacksBuilder_.addAllMessages(var1.stickerPacks_);
            }
         }

         if (this.emojiCategoriesBuilder_ == null) {
            if (!var1.emojiCategories_.isEmpty()) {
               if (this.emojiCategories_.isEmpty()) {
                  this.emojiCategories_ = var1.emojiCategories_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureEmojiCategoriesIsMutable();
                  this.emojiCategories_.addAll(var1.emojiCategories_);
               }

               this.onChanged();
            }
         } else if (!var1.emojiCategories_.isEmpty()) {
            if (this.emojiCategoriesBuilder_.isEmpty()) {
               this.emojiCategoriesBuilder_.dispose();
               this.emojiCategoriesBuilder_ = null;
               this.emojiCategories_ = var1.emojiCategories_;
               this.bitField0_ &= -9;
               this.emojiCategoriesBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getEmojiCategoriesFieldBuilder() : null;
            } else {
               this.emojiCategoriesBuilder_.addAllMessages(var1.emojiCategories_);
            }
         }

         if (var1.getTotalConversations() != 0) {
            this.setTotalConversations(var1.getTotalConversations());
         }

         if (var1.getMaxMessageLength() != 0) {
            this.setMaxMessageLength(var1.getMaxMessageLength());
         }

         if (var1.getPinnedConversationLimit() != 0) {
            this.setPinnedConversationLimit(var1.getPinnedConversationLimit());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoginResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ConversationStub var12 = var1.readMessage(ConversationStub.parser(), var2);
                     if (this.conversationsBuilder_ == null) {
                        this.ensureConversationsIsMutable();
                        this.conversations_.add(var12);
                     } else {
                        this.conversationsBuilder_.addMessage(var12);
                     }
                     break;
                  case 16:
                     this.participantLimit_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     LunarStickerPack var11 = var1.readMessage(LunarStickerPack.parser(), var2);
                     if (this.stickerPacksBuilder_ == null) {
                        this.ensureStickerPacksIsMutable();
                        this.stickerPacks_.add(var11);
                     } else {
                        this.stickerPacksBuilder_.addMessage(var11);
                     }
                     break;
                  case 34:
                     LunarEmojiCategory var5 = var1.readMessage(LunarEmojiCategory.parser(), var2);
                     if (this.emojiCategoriesBuilder_ == null) {
                        this.ensureEmojiCategoriesIsMutable();
                        this.emojiCategories_.add(var5);
                     } else {
                        this.emojiCategoriesBuilder_.addMessage(var5);
                     }
                     break;
                  case 40:
                     this.totalConversations_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.maxMessageLength_ = var1.readInt32();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.pinnedConversationLimit_ = var1.readInt32();
                     this.bitField0_ |= 64;
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

      private void ensureConversationsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.conversations_ = new ArrayList<>(this.conversations_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ConversationStub> getConversationsList() {
         return this.conversationsBuilder_ == null ? Collections.unmodifiableList(this.conversations_) : this.conversationsBuilder_.getMessageList();
      }

      @Override
      public int getConversationsCount() {
         return this.conversationsBuilder_ == null ? this.conversations_.size() : this.conversationsBuilder_.getCount();
      }

      @Override
      public ConversationStub getConversations(int var1) {
         return this.conversationsBuilder_ == null ? this.conversations_.get(var1) : this.conversationsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setConversations(int var1, ConversationStub var2) {
         if (this.conversationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConversationsIsMutable();
            this.conversations_.set(var1, var2);
            this.onChanged();
         } else {
            this.conversationsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setConversations(int var1, ConversationStub.Builder var2) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.conversationsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addConversations(ConversationStub var1) {
         if (this.conversationsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConversationsIsMutable();
            this.conversations_.add(var1);
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addConversations(int var1, ConversationStub var2) {
         if (this.conversationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConversationsIsMutable();
            this.conversations_.add(var1, var2);
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addConversations(ConversationStub.Builder var1) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.add(var1.build());
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addConversations(int var1, ConversationStub.Builder var2) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllConversations(Iterable<? extends ConversationStub> var1) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.conversations_);
            this.onChanged();
         } else {
            this.conversationsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearConversations() {
         if (this.conversationsBuilder_ == null) {
            this.conversations_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.conversationsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeConversations(int var1) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.remove(var1);
            this.onChanged();
         } else {
            this.conversationsBuilder_.remove(var1);
         }

         return this;
      }

      public ConversationStub.Builder getConversationsBuilder(int var1) {
         return this.getConversationsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConversationStubOrBuilder getConversationsOrBuilder(int var1) {
         return this.conversationsBuilder_ == null ? this.conversations_.get(var1) : this.conversationsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConversationStubOrBuilder> getConversationsOrBuilderList() {
         return this.conversationsBuilder_ != null ? this.conversationsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.conversations_);
      }

      public ConversationStub.Builder addConversationsBuilder() {
         return this.getConversationsFieldBuilder().addBuilder(ConversationStub.getDefaultInstance());
      }

      public ConversationStub.Builder addConversationsBuilder(int var1) {
         return this.getConversationsFieldBuilder().addBuilder(var1, ConversationStub.getDefaultInstance());
      }

      public List<ConversationStub.Builder> getConversationsBuilderList() {
         return this.getConversationsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ConversationStub, ConversationStub.Builder, ConversationStubOrBuilder> getConversationsFieldBuilder() {
         if (this.conversationsBuilder_ == null) {
            this.conversationsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.conversations_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.conversations_ = null;
         }

         return this.conversationsBuilder_;
      }

      @Override
      public int getParticipantLimit() {
         return this.participantLimit_;
      }

      public LoginResponse.Builder setParticipantLimit(int var1) {
         this.participantLimit_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearParticipantLimit() {
         this.bitField0_ &= -3;
         this.participantLimit_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureStickerPacksIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.stickerPacks_ = new ArrayList<>(this.stickerPacks_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<LunarStickerPack> getStickerPacksList() {
         return this.stickerPacksBuilder_ == null ? Collections.unmodifiableList(this.stickerPacks_) : this.stickerPacksBuilder_.getMessageList();
      }

      @Override
      public int getStickerPacksCount() {
         return this.stickerPacksBuilder_ == null ? this.stickerPacks_.size() : this.stickerPacksBuilder_.getCount();
      }

      @Override
      public LunarStickerPack getStickerPacks(int var1) {
         return this.stickerPacksBuilder_ == null ? this.stickerPacks_.get(var1) : this.stickerPacksBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setStickerPacks(int var1, LunarStickerPack var2) {
         if (this.stickerPacksBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.set(var1, var2);
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setStickerPacks(int var1, LunarStickerPack.Builder var2) {
         if (this.stickerPacksBuilder_ == null) {
            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addStickerPacks(LunarStickerPack var1) {
         if (this.stickerPacksBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.add(var1);
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addStickerPacks(int var1, LunarStickerPack var2) {
         if (this.stickerPacksBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.add(var1, var2);
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addStickerPacks(LunarStickerPack.Builder var1) {
         if (this.stickerPacksBuilder_ == null) {
            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.add(var1.build());
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addStickerPacks(int var1, LunarStickerPack.Builder var2) {
         if (this.stickerPacksBuilder_ == null) {
            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllStickerPacks(Iterable<? extends LunarStickerPack> var1) {
         if (this.stickerPacksBuilder_ == null) {
            this.ensureStickerPacksIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.stickerPacks_);
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearStickerPacks() {
         if (this.stickerPacksBuilder_ == null) {
            this.stickerPacks_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeStickerPacks(int var1) {
         if (this.stickerPacksBuilder_ == null) {
            this.ensureStickerPacksIsMutable();
            this.stickerPacks_.remove(var1);
            this.onChanged();
         } else {
            this.stickerPacksBuilder_.remove(var1);
         }

         return this;
      }

      public LunarStickerPack.Builder getStickerPacksBuilder(int var1) {
         return this.getStickerPacksFieldBuilder().getBuilder(var1);
      }

      @Override
      public LunarStickerPackOrBuilder getStickerPacksOrBuilder(int var1) {
         return this.stickerPacksBuilder_ == null ? this.stickerPacks_.get(var1) : this.stickerPacksBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends LunarStickerPackOrBuilder> getStickerPacksOrBuilderList() {
         return this.stickerPacksBuilder_ != null ? this.stickerPacksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.stickerPacks_);
      }

      public LunarStickerPack.Builder addStickerPacksBuilder() {
         return this.getStickerPacksFieldBuilder().addBuilder(LunarStickerPack.getDefaultInstance());
      }

      public LunarStickerPack.Builder addStickerPacksBuilder(int var1) {
         return this.getStickerPacksFieldBuilder().addBuilder(var1, LunarStickerPack.getDefaultInstance());
      }

      public List<LunarStickerPack.Builder> getStickerPacksBuilderList() {
         return this.getStickerPacksFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<LunarStickerPack, LunarStickerPack.Builder, LunarStickerPackOrBuilder> getStickerPacksFieldBuilder() {
         if (this.stickerPacksBuilder_ == null) {
            this.stickerPacksBuilder_ = new RepeatedFieldBuilderV3<>(
               this.stickerPacks_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean()
            );
            this.stickerPacks_ = null;
         }

         return this.stickerPacksBuilder_;
      }

      private void ensureEmojiCategoriesIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.emojiCategories_ = new ArrayList<>(this.emojiCategories_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<LunarEmojiCategory> getEmojiCategoriesList() {
         return this.emojiCategoriesBuilder_ == null ? Collections.unmodifiableList(this.emojiCategories_) : this.emojiCategoriesBuilder_.getMessageList();
      }

      @Override
      public int getEmojiCategoriesCount() {
         return this.emojiCategoriesBuilder_ == null ? this.emojiCategories_.size() : this.emojiCategoriesBuilder_.getCount();
      }

      @Override
      public LunarEmojiCategory getEmojiCategories(int var1) {
         return this.emojiCategoriesBuilder_ == null ? this.emojiCategories_.get(var1) : this.emojiCategoriesBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setEmojiCategories(int var1, LunarEmojiCategory var2) {
         if (this.emojiCategoriesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.set(var1, var2);
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setEmojiCategories(int var1, LunarEmojiCategory.Builder var2) {
         if (this.emojiCategoriesBuilder_ == null) {
            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addEmojiCategories(LunarEmojiCategory var1) {
         if (this.emojiCategoriesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.add(var1);
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addEmojiCategories(int var1, LunarEmojiCategory var2) {
         if (this.emojiCategoriesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.add(var1, var2);
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addEmojiCategories(LunarEmojiCategory.Builder var1) {
         if (this.emojiCategoriesBuilder_ == null) {
            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.add(var1.build());
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addEmojiCategories(int var1, LunarEmojiCategory.Builder var2) {
         if (this.emojiCategoriesBuilder_ == null) {
            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllEmojiCategories(Iterable<? extends LunarEmojiCategory> var1) {
         if (this.emojiCategoriesBuilder_ == null) {
            this.ensureEmojiCategoriesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.emojiCategories_);
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearEmojiCategories() {
         if (this.emojiCategoriesBuilder_ == null) {
            this.emojiCategories_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeEmojiCategories(int var1) {
         if (this.emojiCategoriesBuilder_ == null) {
            this.ensureEmojiCategoriesIsMutable();
            this.emojiCategories_.remove(var1);
            this.onChanged();
         } else {
            this.emojiCategoriesBuilder_.remove(var1);
         }

         return this;
      }

      public LunarEmojiCategory.Builder getEmojiCategoriesBuilder(int var1) {
         return this.getEmojiCategoriesFieldBuilder().getBuilder(var1);
      }

      @Override
      public LunarEmojiCategoryOrBuilder getEmojiCategoriesOrBuilder(int var1) {
         return this.emojiCategoriesBuilder_ == null ? this.emojiCategories_.get(var1) : this.emojiCategoriesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends LunarEmojiCategoryOrBuilder> getEmojiCategoriesOrBuilderList() {
         return this.emojiCategoriesBuilder_ != null
            ? this.emojiCategoriesBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.emojiCategories_);
      }

      public LunarEmojiCategory.Builder addEmojiCategoriesBuilder() {
         return this.getEmojiCategoriesFieldBuilder().addBuilder(LunarEmojiCategory.getDefaultInstance());
      }

      public LunarEmojiCategory.Builder addEmojiCategoriesBuilder(int var1) {
         return this.getEmojiCategoriesFieldBuilder().addBuilder(var1, LunarEmojiCategory.getDefaultInstance());
      }

      public List<LunarEmojiCategory.Builder> getEmojiCategoriesBuilderList() {
         return this.getEmojiCategoriesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<LunarEmojiCategory, LunarEmojiCategory.Builder, LunarEmojiCategoryOrBuilder> getEmojiCategoriesFieldBuilder() {
         if (this.emojiCategoriesBuilder_ == null) {
            this.emojiCategoriesBuilder_ = new RepeatedFieldBuilderV3<>(
               this.emojiCategories_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
            );
            this.emojiCategories_ = null;
         }

         return this.emojiCategoriesBuilder_;
      }

      @Override
      public int getTotalConversations() {
         return this.totalConversations_;
      }

      public LoginResponse.Builder setTotalConversations(int var1) {
         this.totalConversations_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearTotalConversations() {
         this.bitField0_ &= -17;
         this.totalConversations_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getMaxMessageLength() {
         return this.maxMessageLength_;
      }

      public LoginResponse.Builder setMaxMessageLength(int var1) {
         this.maxMessageLength_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearMaxMessageLength() {
         this.bitField0_ &= -33;
         this.maxMessageLength_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getPinnedConversationLimit() {
         return this.pinnedConversationLimit_;
      }

      public LoginResponse.Builder setPinnedConversationLimit(int var1) {
         this.pinnedConversationLimit_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearPinnedConversationLimit() {
         this.bitField0_ &= -65;
         this.pinnedConversationLimit_ = 0;
         this.onChanged();
         return this;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
