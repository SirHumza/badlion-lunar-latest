package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
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
   public static final int OWNED_EMOTE_IDS_FIELD_NUMBER = 1;
   private Internal.IntList ownedEmoteIds_ = emptyIntList();
   private int ownedEmoteIdsMemoizedSerializedSize = -1;
   public static final int EQUIPPED_EMOTE_IDS_FIELD_NUMBER = 2;
   private Internal.IntList equippedEmoteIds_ = emptyIntList();
   private int equippedEmoteIdsMemoizedSerializedSize = -1;
   public static final int LUNAR_PLUS_FREE_EMOTE_ID_FIELD_NUMBER = 3;
   private int lunarPlusFreeEmoteId_ = 0;
   public static final int OWNED_EMOTES_FIELD_NUMBER = 7;
   private List<OwnedEmote> ownedEmotes_;
   public static final int HAS_ALL_EMOTES_FLAG_FIELD_NUMBER = 5;
   private boolean hasAllEmotesFlag_ = false;
   public static final int EQUIPPED_EMOTES_FIELD_NUMBER = 8;
   private List<EquippedEmote> equippedEmotes_;
   public static final int LUNAR_PLUS_FREE_EMOTE_IDS_FIELD_NUMBER = 9;
   private Internal.IntList lunarPlusFreeEmoteIds_ = emptyIntList();
   private int lunarPlusFreeEmoteIdsMemoizedSerializedSize = -1;
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
      this.ownedEmoteIds_ = emptyIntList();
      this.equippedEmoteIds_ = emptyIntList();
      this.ownedEmotes_ = Collections.emptyList();
      this.equippedEmotes_ = Collections.emptyList();
      this.lunarPlusFreeEmoteIds_ = emptyIntList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Deprecated
   @Override
   public List<Integer> getOwnedEmoteIdsList() {
      return this.ownedEmoteIds_;
   }

   @Deprecated
   @Override
   public int getOwnedEmoteIdsCount() {
      return this.ownedEmoteIds_.size();
   }

   @Deprecated
   @Override
   public int getOwnedEmoteIds(int var1) {
      return this.ownedEmoteIds_.getInt(var1);
   }

   @Deprecated
   @Override
   public List<Integer> getEquippedEmoteIdsList() {
      return this.equippedEmoteIds_;
   }

   @Deprecated
   @Override
   public int getEquippedEmoteIdsCount() {
      return this.equippedEmoteIds_.size();
   }

   @Deprecated
   @Override
   public int getEquippedEmoteIds(int var1) {
      return this.equippedEmoteIds_.getInt(var1);
   }

   @Deprecated
   @Override
   public int getLunarPlusFreeEmoteId() {
      return this.lunarPlusFreeEmoteId_;
   }

   @Override
   public List<OwnedEmote> getOwnedEmotesList() {
      return this.ownedEmotes_;
   }

   @Override
   public List<? extends OwnedEmoteOrBuilder> getOwnedEmotesOrBuilderList() {
      return this.ownedEmotes_;
   }

   @Override
   public int getOwnedEmotesCount() {
      return this.ownedEmotes_.size();
   }

   @Override
   public OwnedEmote getOwnedEmotes(int var1) {
      return this.ownedEmotes_.get(var1);
   }

   @Override
   public OwnedEmoteOrBuilder getOwnedEmotesOrBuilder(int var1) {
      return this.ownedEmotes_.get(var1);
   }

   @Override
   public boolean getHasAllEmotesFlag() {
      return this.hasAllEmotesFlag_;
   }

   @Override
   public List<EquippedEmote> getEquippedEmotesList() {
      return this.equippedEmotes_;
   }

   @Override
   public List<? extends EquippedEmoteOrBuilder> getEquippedEmotesOrBuilderList() {
      return this.equippedEmotes_;
   }

   @Override
   public int getEquippedEmotesCount() {
      return this.equippedEmotes_.size();
   }

   @Override
   public EquippedEmote getEquippedEmotes(int var1) {
      return this.equippedEmotes_.get(var1);
   }

   @Override
   public EquippedEmoteOrBuilder getEquippedEmotesOrBuilder(int var1) {
      return this.equippedEmotes_.get(var1);
   }

   @Override
   public List<Integer> getLunarPlusFreeEmoteIdsList() {
      return this.lunarPlusFreeEmoteIds_;
   }

   @Override
   public int getLunarPlusFreeEmoteIdsCount() {
      return this.lunarPlusFreeEmoteIds_.size();
   }

   @Override
   public int getLunarPlusFreeEmoteIds(int var1) {
      return this.lunarPlusFreeEmoteIds_.getInt(var1);
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
      this.getSerializedSize();
      if (this.getOwnedEmoteIdsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.ownedEmoteIdsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.ownedEmoteIds_.size(); var2++) {
         var1.writeInt32NoTag(this.ownedEmoteIds_.getInt(var2));
      }

      if (this.getEquippedEmoteIdsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.equippedEmoteIdsMemoizedSerializedSize);
      }

      for (int var3 = 0; var3 < this.equippedEmoteIds_.size(); var3++) {
         var1.writeInt32NoTag(this.equippedEmoteIds_.getInt(var3));
      }

      if (this.lunarPlusFreeEmoteId_ != 0) {
         var1.writeInt32(3, this.lunarPlusFreeEmoteId_);
      }

      if (this.hasAllEmotesFlag_) {
         var1.writeBool(5, this.hasAllEmotesFlag_);
      }

      for (int var4 = 0; var4 < this.ownedEmotes_.size(); var4++) {
         var1.writeMessage(7, this.ownedEmotes_.get(var4));
      }

      for (int var5 = 0; var5 < this.equippedEmotes_.size(); var5++) {
         var1.writeMessage(8, this.equippedEmotes_.get(var5));
      }

      if (this.getLunarPlusFreeEmoteIdsList().size() > 0) {
         var1.writeUInt32NoTag(74);
         var1.writeUInt32NoTag(this.lunarPlusFreeEmoteIdsMemoizedSerializedSize);
      }

      for (int var6 = 0; var6 < this.lunarPlusFreeEmoteIds_.size(); var6++) {
         var1.writeInt32NoTag(this.lunarPlusFreeEmoteIds_.getInt(var6));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var4 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.ownedEmoteIds_.size(); var3++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.ownedEmoteIds_.getInt(var3));
      }

      var4 += var2;
      if (!this.getOwnedEmoteIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.ownedEmoteIdsMemoizedSerializedSize = var2;
      var2 = 0;

      for (int var16 = 0; var16 < this.equippedEmoteIds_.size(); var16++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.equippedEmoteIds_.getInt(var16));
      }

      var4 += var2;
      if (!this.getEquippedEmoteIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.equippedEmoteIdsMemoizedSerializedSize = var2;
      if (this.lunarPlusFreeEmoteId_ != 0) {
         var4 += CodedOutputStream.computeInt32Size(3, this.lunarPlusFreeEmoteId_);
      }

      if (this.hasAllEmotesFlag_) {
         var4 += CodedOutputStream.computeBoolSize(5, this.hasAllEmotesFlag_);
      }

      for (int var13 = 0; var13 < this.ownedEmotes_.size(); var13++) {
         var4 += CodedOutputStream.computeMessageSize(7, this.ownedEmotes_.get(var13));
      }

      for (int var14 = 0; var14 < this.equippedEmotes_.size(); var14++) {
         var4 += CodedOutputStream.computeMessageSize(8, this.equippedEmotes_.get(var14));
      }

      var2 = 0;

      for (int var17 = 0; var17 < this.lunarPlusFreeEmoteIds_.size(); var17++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.lunarPlusFreeEmoteIds_.getInt(var17));
      }

      var4 += var2;
      if (!this.getLunarPlusFreeEmoteIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.lunarPlusFreeEmoteIdsMemoizedSerializedSize = var2;
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoginResponse)) {
         return super.equals(var1);
      } else {
         LoginResponse var2 = (LoginResponse)var1;
         if (!this.getOwnedEmoteIdsList().equals(var2.getOwnedEmoteIdsList())) {
            return false;
         } else if (!this.getEquippedEmoteIdsList().equals(var2.getEquippedEmoteIdsList())) {
            return false;
         } else if (this.getLunarPlusFreeEmoteId() != var2.getLunarPlusFreeEmoteId()) {
            return false;
         } else if (!this.getOwnedEmotesList().equals(var2.getOwnedEmotesList())) {
            return false;
         } else if (this.getHasAllEmotesFlag() != var2.getHasAllEmotesFlag()) {
            return false;
         } else if (!this.getEquippedEmotesList().equals(var2.getEquippedEmotesList())) {
            return false;
         } else {
            return !this.getLunarPlusFreeEmoteIdsList().equals(var2.getLunarPlusFreeEmoteIdsList())
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
      if (this.getOwnedEmoteIdsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOwnedEmoteIdsList().hashCode();
      }

      if (this.getEquippedEmoteIdsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getEquippedEmoteIdsList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getLunarPlusFreeEmoteId();
      if (this.getOwnedEmotesCount() > 0) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getOwnedEmotesList().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHasAllEmotesFlag());
      if (this.getEquippedEmotesCount() > 0) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getEquippedEmotesList().hashCode();
      }

      if (this.getLunarPlusFreeEmoteIdsCount() > 0) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getLunarPlusFreeEmoteIdsList().hashCode();
      }

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
      private Internal.IntList ownedEmoteIds_ = LoginResponse.emptyIntList();
      private Internal.IntList equippedEmoteIds_ = LoginResponse.emptyIntList();
      private int lunarPlusFreeEmoteId_;
      private List<OwnedEmote> ownedEmotes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OwnedEmote, OwnedEmote.Builder, OwnedEmoteOrBuilder> ownedEmotesBuilder_;
      private boolean hasAllEmotesFlag_;
      private List<EquippedEmote> equippedEmotes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedEmote, EquippedEmote.Builder, EquippedEmoteOrBuilder> equippedEmotesBuilder_;
      private Internal.IntList lunarPlusFreeEmoteIds_ = LoginResponse.emptyIntList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_LoginResponse_fieldAccessorTable
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
         this.ownedEmoteIds_ = LoginResponse.emptyIntList();
         this.equippedEmoteIds_ = LoginResponse.emptyIntList();
         this.lunarPlusFreeEmoteId_ = 0;
         if (this.ownedEmotesBuilder_ == null) {
            this.ownedEmotes_ = Collections.emptyList();
         } else {
            this.ownedEmotes_ = null;
            this.ownedEmotesBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.hasAllEmotesFlag_ = false;
         if (this.equippedEmotesBuilder_ == null) {
            this.equippedEmotes_ = Collections.emptyList();
         } else {
            this.equippedEmotes_ = null;
            this.equippedEmotesBuilder_.clear();
         }

         this.bitField0_ &= -33;
         this.lunarPlusFreeEmoteIds_ = LoginResponse.emptyIntList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_LoginResponse_descriptor;
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
         if (this.ownedEmotesBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.ownedEmotes_ = Collections.unmodifiableList(this.ownedEmotes_);
               this.bitField0_ &= -9;
            }

            var1.ownedEmotes_ = this.ownedEmotes_;
         } else {
            var1.ownedEmotes_ = this.ownedEmotesBuilder_.build();
         }

         if (this.equippedEmotesBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0) {
               this.equippedEmotes_ = Collections.unmodifiableList(this.equippedEmotes_);
               this.bitField0_ &= -33;
            }

            var1.equippedEmotes_ = this.equippedEmotes_;
         } else {
            var1.equippedEmotes_ = this.equippedEmotesBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.ownedEmoteIds_.makeImmutable();
            var1.ownedEmoteIds_ = this.ownedEmoteIds_;
         }

         if ((var2 & 2) != 0) {
            this.equippedEmoteIds_.makeImmutable();
            var1.equippedEmoteIds_ = this.equippedEmoteIds_;
         }

         if ((var2 & 4) != 0) {
            var1.lunarPlusFreeEmoteId_ = this.lunarPlusFreeEmoteId_;
         }

         if ((var2 & 16) != 0) {
            var1.hasAllEmotesFlag_ = this.hasAllEmotesFlag_;
         }

         if ((var2 & 64) != 0) {
            this.lunarPlusFreeEmoteIds_.makeImmutable();
            var1.lunarPlusFreeEmoteIds_ = this.lunarPlusFreeEmoteIds_;
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

         if (!var1.ownedEmoteIds_.isEmpty()) {
            if (this.ownedEmoteIds_.isEmpty()) {
               this.ownedEmoteIds_ = var1.ownedEmoteIds_;
               this.ownedEmoteIds_.makeImmutable();
               this.bitField0_ |= 1;
            } else {
               this.ensureOwnedEmoteIdsIsMutable();
               this.ownedEmoteIds_.addAll(var1.ownedEmoteIds_);
            }

            this.onChanged();
         }

         if (!var1.equippedEmoteIds_.isEmpty()) {
            if (this.equippedEmoteIds_.isEmpty()) {
               this.equippedEmoteIds_ = var1.equippedEmoteIds_;
               this.equippedEmoteIds_.makeImmutable();
               this.bitField0_ |= 2;
            } else {
               this.ensureEquippedEmoteIdsIsMutable();
               this.equippedEmoteIds_.addAll(var1.equippedEmoteIds_);
            }

            this.onChanged();
         }

         if (var1.getLunarPlusFreeEmoteId() != 0) {
            this.setLunarPlusFreeEmoteId(var1.getLunarPlusFreeEmoteId());
         }

         if (this.ownedEmotesBuilder_ == null) {
            if (!var1.ownedEmotes_.isEmpty()) {
               if (this.ownedEmotes_.isEmpty()) {
                  this.ownedEmotes_ = var1.ownedEmotes_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureOwnedEmotesIsMutable();
                  this.ownedEmotes_.addAll(var1.ownedEmotes_);
               }

               this.onChanged();
            }
         } else if (!var1.ownedEmotes_.isEmpty()) {
            if (this.ownedEmotesBuilder_.isEmpty()) {
               this.ownedEmotesBuilder_.dispose();
               this.ownedEmotesBuilder_ = null;
               this.ownedEmotes_ = var1.ownedEmotes_;
               this.bitField0_ &= -9;
               this.ownedEmotesBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOwnedEmotesFieldBuilder() : null;
            } else {
               this.ownedEmotesBuilder_.addAllMessages(var1.ownedEmotes_);
            }
         }

         if (var1.getHasAllEmotesFlag()) {
            this.setHasAllEmotesFlag(var1.getHasAllEmotesFlag());
         }

         if (this.equippedEmotesBuilder_ == null) {
            if (!var1.equippedEmotes_.isEmpty()) {
               if (this.equippedEmotes_.isEmpty()) {
                  this.equippedEmotes_ = var1.equippedEmotes_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensureEquippedEmotesIsMutable();
                  this.equippedEmotes_.addAll(var1.equippedEmotes_);
               }

               this.onChanged();
            }
         } else if (!var1.equippedEmotes_.isEmpty()) {
            if (this.equippedEmotesBuilder_.isEmpty()) {
               this.equippedEmotesBuilder_.dispose();
               this.equippedEmotesBuilder_ = null;
               this.equippedEmotes_ = var1.equippedEmotes_;
               this.bitField0_ &= -33;
               this.equippedEmotesBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getEquippedEmotesFieldBuilder() : null;
            } else {
               this.equippedEmotesBuilder_.addAllMessages(var1.equippedEmotes_);
            }
         }

         if (!var1.lunarPlusFreeEmoteIds_.isEmpty()) {
            if (this.lunarPlusFreeEmoteIds_.isEmpty()) {
               this.lunarPlusFreeEmoteIds_ = var1.lunarPlusFreeEmoteIds_;
               this.lunarPlusFreeEmoteIds_.makeImmutable();
               this.bitField0_ |= 64;
            } else {
               this.ensureLunarPlusFreeEmoteIdsIsMutable();
               this.lunarPlusFreeEmoteIds_.addAll(var1.lunarPlusFreeEmoteIds_);
            }

            this.onChanged();
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
                  case 8:
                     int var18 = var1.readInt32();
                     this.ensureOwnedEmoteIdsIsMutable();
                     this.ownedEmoteIds_.addInt(var18);
                     break;
                  case 10:
                     int var17 = var1.readRawVarint32();
                     int var20 = var1.pushLimit(var17);
                     this.ensureOwnedEmoteIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.ownedEmoteIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var20);
                     break;
                  case 16:
                     int var16 = var1.readInt32();
                     this.ensureEquippedEmoteIdsIsMutable();
                     this.equippedEmoteIds_.addInt(var16);
                     break;
                  case 18:
                     int var15 = var1.readRawVarint32();
                     int var19 = var1.pushLimit(var15);
                     this.ensureEquippedEmoteIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.equippedEmoteIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var19);
                     break;
                  case 24:
                     this.lunarPlusFreeEmoteId_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 40:
                     this.hasAllEmotesFlag_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 58:
                     OwnedEmote var14 = var1.readMessage(OwnedEmote.parser(), var2);
                     if (this.ownedEmotesBuilder_ == null) {
                        this.ensureOwnedEmotesIsMutable();
                        this.ownedEmotes_.add(var14);
                     } else {
                        this.ownedEmotesBuilder_.addMessage(var14);
                     }
                     break;
                  case 66:
                     EquippedEmote var13 = var1.readMessage(EquippedEmote.parser(), var2);
                     if (this.equippedEmotesBuilder_ == null) {
                        this.ensureEquippedEmotesIsMutable();
                        this.equippedEmotes_.add(var13);
                     } else {
                        this.equippedEmotesBuilder_.addMessage(var13);
                     }
                     break;
                  case 72:
                     int var12 = var1.readInt32();
                     this.ensureLunarPlusFreeEmoteIdsIsMutable();
                     this.lunarPlusFreeEmoteIds_.addInt(var12);
                     break;
                  case 74:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureLunarPlusFreeEmoteIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.lunarPlusFreeEmoteIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var10) {
            throw var10.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensureOwnedEmoteIdsIsMutable() {
         if (!this.ownedEmoteIds_.isModifiable()) {
            this.ownedEmoteIds_ = LoginResponse.makeMutableCopy(this.ownedEmoteIds_);
         }

         this.bitField0_ |= 1;
      }

      @Deprecated
      @Override
      public List<Integer> getOwnedEmoteIdsList() {
         this.ownedEmoteIds_.makeImmutable();
         return this.ownedEmoteIds_;
      }

      @Deprecated
      @Override
      public int getOwnedEmoteIdsCount() {
         return this.ownedEmoteIds_.size();
      }

      @Deprecated
      @Override
      public int getOwnedEmoteIds(int var1) {
         return this.ownedEmoteIds_.getInt(var1);
      }

      @Deprecated
      public LoginResponse.Builder setOwnedEmoteIds(int var1, int var2) {
         this.ensureOwnedEmoteIdsIsMutable();
         this.ownedEmoteIds_.setInt(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder addOwnedEmoteIds(int var1) {
         this.ensureOwnedEmoteIdsIsMutable();
         this.ownedEmoteIds_.addInt(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder addAllOwnedEmoteIds(Iterable<? extends Integer> var1) {
         this.ensureOwnedEmoteIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.ownedEmoteIds_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearOwnedEmoteIds() {
         this.ownedEmoteIds_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureEquippedEmoteIdsIsMutable() {
         if (!this.equippedEmoteIds_.isModifiable()) {
            this.equippedEmoteIds_ = LoginResponse.makeMutableCopy(this.equippedEmoteIds_);
         }

         this.bitField0_ |= 2;
      }

      @Deprecated
      @Override
      public List<Integer> getEquippedEmoteIdsList() {
         this.equippedEmoteIds_.makeImmutable();
         return this.equippedEmoteIds_;
      }

      @Deprecated
      @Override
      public int getEquippedEmoteIdsCount() {
         return this.equippedEmoteIds_.size();
      }

      @Deprecated
      @Override
      public int getEquippedEmoteIds(int var1) {
         return this.equippedEmoteIds_.getInt(var1);
      }

      @Deprecated
      public LoginResponse.Builder setEquippedEmoteIds(int var1, int var2) {
         this.ensureEquippedEmoteIdsIsMutable();
         this.equippedEmoteIds_.setInt(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder addEquippedEmoteIds(int var1) {
         this.ensureEquippedEmoteIdsIsMutable();
         this.equippedEmoteIds_.addInt(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder addAllEquippedEmoteIds(Iterable<? extends Integer> var1) {
         this.ensureEquippedEmoteIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.equippedEmoteIds_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearEquippedEmoteIds() {
         this.equippedEmoteIds_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Deprecated
      @Override
      public int getLunarPlusFreeEmoteId() {
         return this.lunarPlusFreeEmoteId_;
      }

      @Deprecated
      public LoginResponse.Builder setLunarPlusFreeEmoteId(int var1) {
         this.lunarPlusFreeEmoteId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearLunarPlusFreeEmoteId() {
         this.bitField0_ &= -5;
         this.lunarPlusFreeEmoteId_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureOwnedEmotesIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.ownedEmotes_ = new ArrayList<>(this.ownedEmotes_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<OwnedEmote> getOwnedEmotesList() {
         return this.ownedEmotesBuilder_ == null ? Collections.unmodifiableList(this.ownedEmotes_) : this.ownedEmotesBuilder_.getMessageList();
      }

      @Override
      public int getOwnedEmotesCount() {
         return this.ownedEmotesBuilder_ == null ? this.ownedEmotes_.size() : this.ownedEmotesBuilder_.getCount();
      }

      @Override
      public OwnedEmote getOwnedEmotes(int var1) {
         return this.ownedEmotesBuilder_ == null ? this.ownedEmotes_.get(var1) : this.ownedEmotesBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOwnedEmotes(int var1, OwnedEmote var2) {
         if (this.ownedEmotesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.set(var1, var2);
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOwnedEmotes(int var1, OwnedEmote.Builder var2) {
         if (this.ownedEmotesBuilder_ == null) {
            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOwnedEmotes(OwnedEmote var1) {
         if (this.ownedEmotesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.add(var1);
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOwnedEmotes(int var1, OwnedEmote var2) {
         if (this.ownedEmotesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.add(var1, var2);
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOwnedEmotes(OwnedEmote.Builder var1) {
         if (this.ownedEmotesBuilder_ == null) {
            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.add(var1.build());
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOwnedEmotes(int var1, OwnedEmote.Builder var2) {
         if (this.ownedEmotesBuilder_ == null) {
            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOwnedEmotes(Iterable<? extends OwnedEmote> var1) {
         if (this.ownedEmotesBuilder_ == null) {
            this.ensureOwnedEmotesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.ownedEmotes_);
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOwnedEmotes() {
         if (this.ownedEmotesBuilder_ == null) {
            this.ownedEmotes_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOwnedEmotes(int var1) {
         if (this.ownedEmotesBuilder_ == null) {
            this.ensureOwnedEmotesIsMutable();
            this.ownedEmotes_.remove(var1);
            this.onChanged();
         } else {
            this.ownedEmotesBuilder_.remove(var1);
         }

         return this;
      }

      public OwnedEmote.Builder getOwnedEmotesBuilder(int var1) {
         return this.getOwnedEmotesFieldBuilder().getBuilder(var1);
      }

      @Override
      public OwnedEmoteOrBuilder getOwnedEmotesOrBuilder(int var1) {
         return this.ownedEmotesBuilder_ == null ? this.ownedEmotes_.get(var1) : this.ownedEmotesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OwnedEmoteOrBuilder> getOwnedEmotesOrBuilderList() {
         return this.ownedEmotesBuilder_ != null ? this.ownedEmotesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ownedEmotes_);
      }

      public OwnedEmote.Builder addOwnedEmotesBuilder() {
         return this.getOwnedEmotesFieldBuilder().addBuilder(OwnedEmote.getDefaultInstance());
      }

      public OwnedEmote.Builder addOwnedEmotesBuilder(int var1) {
         return this.getOwnedEmotesFieldBuilder().addBuilder(var1, OwnedEmote.getDefaultInstance());
      }

      public List<OwnedEmote.Builder> getOwnedEmotesBuilderList() {
         return this.getOwnedEmotesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OwnedEmote, OwnedEmote.Builder, OwnedEmoteOrBuilder> getOwnedEmotesFieldBuilder() {
         if (this.ownedEmotesBuilder_ == null) {
            this.ownedEmotesBuilder_ = new RepeatedFieldBuilderV3<>(this.ownedEmotes_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.ownedEmotes_ = null;
         }

         return this.ownedEmotesBuilder_;
      }

      @Override
      public boolean getHasAllEmotesFlag() {
         return this.hasAllEmotesFlag_;
      }

      public LoginResponse.Builder setHasAllEmotesFlag(boolean var1) {
         this.hasAllEmotesFlag_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearHasAllEmotesFlag() {
         this.bitField0_ &= -17;
         this.hasAllEmotesFlag_ = false;
         this.onChanged();
         return this;
      }

      private void ensureEquippedEmotesIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.equippedEmotes_ = new ArrayList<>(this.equippedEmotes_);
            this.bitField0_ |= 32;
         }
      }

      @Override
      public List<EquippedEmote> getEquippedEmotesList() {
         return this.equippedEmotesBuilder_ == null ? Collections.unmodifiableList(this.equippedEmotes_) : this.equippedEmotesBuilder_.getMessageList();
      }

      @Override
      public int getEquippedEmotesCount() {
         return this.equippedEmotesBuilder_ == null ? this.equippedEmotes_.size() : this.equippedEmotesBuilder_.getCount();
      }

      @Override
      public EquippedEmote getEquippedEmotes(int var1) {
         return this.equippedEmotesBuilder_ == null ? this.equippedEmotes_.get(var1) : this.equippedEmotesBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setEquippedEmotes(int var1, EquippedEmote var2) {
         if (this.equippedEmotesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.set(var1, var2);
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setEquippedEmotes(int var1, EquippedEmote.Builder var2) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addEquippedEmotes(EquippedEmote var1) {
         if (this.equippedEmotesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.add(var1);
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addEquippedEmotes(int var1, EquippedEmote var2) {
         if (this.equippedEmotesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.add(var1, var2);
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addEquippedEmotes(EquippedEmote.Builder var1) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.add(var1.build());
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addEquippedEmotes(int var1, EquippedEmote.Builder var2) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllEquippedEmotes(Iterable<? extends EquippedEmote> var1) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.equippedEmotes_);
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearEquippedEmotes() {
         if (this.equippedEmotesBuilder_ == null) {
            this.equippedEmotes_ = Collections.emptyList();
            this.bitField0_ &= -33;
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeEquippedEmotes(int var1) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.remove(var1);
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.remove(var1);
         }

         return this;
      }

      public EquippedEmote.Builder getEquippedEmotesBuilder(int var1) {
         return this.getEquippedEmotesFieldBuilder().getBuilder(var1);
      }

      @Override
      public EquippedEmoteOrBuilder getEquippedEmotesOrBuilder(int var1) {
         return this.equippedEmotesBuilder_ == null ? this.equippedEmotes_.get(var1) : this.equippedEmotesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EquippedEmoteOrBuilder> getEquippedEmotesOrBuilderList() {
         return this.equippedEmotesBuilder_ != null
            ? this.equippedEmotesBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.equippedEmotes_);
      }

      public EquippedEmote.Builder addEquippedEmotesBuilder() {
         return this.getEquippedEmotesFieldBuilder().addBuilder(EquippedEmote.getDefaultInstance());
      }

      public EquippedEmote.Builder addEquippedEmotesBuilder(int var1) {
         return this.getEquippedEmotesFieldBuilder().addBuilder(var1, EquippedEmote.getDefaultInstance());
      }

      public List<EquippedEmote.Builder> getEquippedEmotesBuilderList() {
         return this.getEquippedEmotesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EquippedEmote, EquippedEmote.Builder, EquippedEmoteOrBuilder> getEquippedEmotesFieldBuilder() {
         if (this.equippedEmotesBuilder_ == null) {
            this.equippedEmotesBuilder_ = new RepeatedFieldBuilderV3<>(
               this.equippedEmotes_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean()
            );
            this.equippedEmotes_ = null;
         }

         return this.equippedEmotesBuilder_;
      }

      private void ensureLunarPlusFreeEmoteIdsIsMutable() {
         if (!this.lunarPlusFreeEmoteIds_.isModifiable()) {
            this.lunarPlusFreeEmoteIds_ = LoginResponse.makeMutableCopy(this.lunarPlusFreeEmoteIds_);
         }

         this.bitField0_ |= 64;
      }

      @Override
      public List<Integer> getLunarPlusFreeEmoteIdsList() {
         this.lunarPlusFreeEmoteIds_.makeImmutable();
         return this.lunarPlusFreeEmoteIds_;
      }

      @Override
      public int getLunarPlusFreeEmoteIdsCount() {
         return this.lunarPlusFreeEmoteIds_.size();
      }

      @Override
      public int getLunarPlusFreeEmoteIds(int var1) {
         return this.lunarPlusFreeEmoteIds_.getInt(var1);
      }

      public LoginResponse.Builder setLunarPlusFreeEmoteIds(int var1, int var2) {
         this.ensureLunarPlusFreeEmoteIdsIsMutable();
         this.lunarPlusFreeEmoteIds_.setInt(var1, var2);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addLunarPlusFreeEmoteIds(int var1) {
         this.ensureLunarPlusFreeEmoteIdsIsMutable();
         this.lunarPlusFreeEmoteIds_.addInt(var1);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addAllLunarPlusFreeEmoteIds(Iterable<? extends Integer> var1) {
         this.ensureLunarPlusFreeEmoteIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.lunarPlusFreeEmoteIds_);
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearLunarPlusFreeEmoteIds() {
         this.lunarPlusFreeEmoteIds_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -65;
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
