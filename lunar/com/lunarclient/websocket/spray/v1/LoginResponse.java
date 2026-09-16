package com.lunarclient.websocket.spray.v1;

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
   public static final int OWNED_SPRAYS_FIELD_NUMBER = 1;
   private List<OwnedSpray> ownedSprays_;
   public static final int EQUIPPED_SPRAYS_FIELD_NUMBER = 2;
   private List<EquippedSpray> equippedSprays_;
   public static final int LUNAR_PLUS_FREE_SPRAY_ID_FIELD_NUMBER = 3;
   private int lunarPlusFreeSprayId_ = 0;
   public static final int HAS_ALL_SPRAYS_FLAG_FIELD_NUMBER = 4;
   private boolean hasAllSpraysFlag_ = false;
   public static final int MAX_ACTIVE_SPRAYS_FIELD_NUMBER = 5;
   private int maxActiveSprays_ = 0;
   public static final int LUNAR_PLUS_FREE_SPRAY_IDS_FIELD_NUMBER = 6;
   private Internal.IntList lunarPlusFreeSprayIds_ = emptyIntList();
   private int lunarPlusFreeSprayIdsMemoizedSerializedSize = -1;
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
      this.ownedSprays_ = Collections.emptyList();
      this.equippedSprays_ = Collections.emptyList();
      this.lunarPlusFreeSprayIds_ = emptyIntList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_spray_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_spray_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public List<OwnedSpray> getOwnedSpraysList() {
      return this.ownedSprays_;
   }

   @Override
   public List<? extends OwnedSprayOrBuilder> getOwnedSpraysOrBuilderList() {
      return this.ownedSprays_;
   }

   @Override
   public int getOwnedSpraysCount() {
      return this.ownedSprays_.size();
   }

   @Override
   public OwnedSpray getOwnedSprays(int var1) {
      return this.ownedSprays_.get(var1);
   }

   @Override
   public OwnedSprayOrBuilder getOwnedSpraysOrBuilder(int var1) {
      return this.ownedSprays_.get(var1);
   }

   @Override
   public List<EquippedSpray> getEquippedSpraysList() {
      return this.equippedSprays_;
   }

   @Override
   public List<? extends EquippedSprayOrBuilder> getEquippedSpraysOrBuilderList() {
      return this.equippedSprays_;
   }

   @Override
   public int getEquippedSpraysCount() {
      return this.equippedSprays_.size();
   }

   @Override
   public EquippedSpray getEquippedSprays(int var1) {
      return this.equippedSprays_.get(var1);
   }

   @Override
   public EquippedSprayOrBuilder getEquippedSpraysOrBuilder(int var1) {
      return this.equippedSprays_.get(var1);
   }

   @Deprecated
   @Override
   public int getLunarPlusFreeSprayId() {
      return this.lunarPlusFreeSprayId_;
   }

   @Override
   public boolean getHasAllSpraysFlag() {
      return this.hasAllSpraysFlag_;
   }

   @Override
   public int getMaxActiveSprays() {
      return this.maxActiveSprays_;
   }

   @Override
   public List<Integer> getLunarPlusFreeSprayIdsList() {
      return this.lunarPlusFreeSprayIds_;
   }

   @Override
   public int getLunarPlusFreeSprayIdsCount() {
      return this.lunarPlusFreeSprayIds_.size();
   }

   @Override
   public int getLunarPlusFreeSprayIds(int var1) {
      return this.lunarPlusFreeSprayIds_.getInt(var1);
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

      for (int var2 = 0; var2 < this.ownedSprays_.size(); var2++) {
         var1.writeMessage(1, this.ownedSprays_.get(var2));
      }

      for (int var3 = 0; var3 < this.equippedSprays_.size(); var3++) {
         var1.writeMessage(2, this.equippedSprays_.get(var3));
      }

      if (this.lunarPlusFreeSprayId_ != 0) {
         var1.writeInt32(3, this.lunarPlusFreeSprayId_);
      }

      if (this.hasAllSpraysFlag_) {
         var1.writeBool(4, this.hasAllSpraysFlag_);
      }

      if (this.maxActiveSprays_ != 0) {
         var1.writeInt32(5, this.maxActiveSprays_);
      }

      if (this.getLunarPlusFreeSprayIdsList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.lunarPlusFreeSprayIdsMemoizedSerializedSize);
      }

      for (int var4 = 0; var4 < this.lunarPlusFreeSprayIds_.size(); var4++) {
         var1.writeInt32NoTag(this.lunarPlusFreeSprayIds_.getInt(var4));
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

      for (int var2 = 0; var2 < this.ownedSprays_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.ownedSprays_.get(var2));
      }

      for (int var8 = 0; var8 < this.equippedSprays_.size(); var8++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.equippedSprays_.get(var8));
      }

      if (this.lunarPlusFreeSprayId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.lunarPlusFreeSprayId_);
      }

      if (this.hasAllSpraysFlag_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.hasAllSpraysFlag_);
      }

      if (this.maxActiveSprays_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.maxActiveSprays_);
      }

      int var9 = 0;

      for (int var3 = 0; var3 < this.lunarPlusFreeSprayIds_.size(); var3++) {
         var9 += CodedOutputStream.computeInt32SizeNoTag(this.lunarPlusFreeSprayIds_.getInt(var3));
      }

      var1 += var9;
      if (!this.getLunarPlusFreeSprayIdsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeInt32SizeNoTag(var9);
      }

      this.lunarPlusFreeSprayIdsMemoizedSerializedSize = var9;
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
         if (!this.getOwnedSpraysList().equals(var2.getOwnedSpraysList())) {
            return false;
         } else if (!this.getEquippedSpraysList().equals(var2.getEquippedSpraysList())) {
            return false;
         } else if (this.getLunarPlusFreeSprayId() != var2.getLunarPlusFreeSprayId()) {
            return false;
         } else if (this.getHasAllSpraysFlag() != var2.getHasAllSpraysFlag()) {
            return false;
         } else if (this.getMaxActiveSprays() != var2.getMaxActiveSprays()) {
            return false;
         } else {
            return !this.getLunarPlusFreeSprayIdsList().equals(var2.getLunarPlusFreeSprayIdsList())
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
      if (this.getOwnedSpraysCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getOwnedSpraysList().hashCode();
      }

      if (this.getEquippedSpraysCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getEquippedSpraysList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getLunarPlusFreeSprayId();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHasAllSpraysFlag());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getMaxActiveSprays();
      if (this.getLunarPlusFreeSprayIdsCount() > 0) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getLunarPlusFreeSprayIdsList().hashCode();
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
      private List<OwnedSpray> ownedSprays_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OwnedSpray, OwnedSpray.Builder, OwnedSprayOrBuilder> ownedSpraysBuilder_;
      private List<EquippedSpray> equippedSprays_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedSpray, EquippedSpray.Builder, EquippedSprayOrBuilder> equippedSpraysBuilder_;
      private int lunarPlusFreeSprayId_;
      private boolean hasAllSpraysFlag_;
      private int maxActiveSprays_;
      private Internal.IntList lunarPlusFreeSprayIds_ = LoginResponse.emptyIntList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_spray_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_spray_v1_LoginResponse_fieldAccessorTable
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
         if (this.ownedSpraysBuilder_ == null) {
            this.ownedSprays_ = Collections.emptyList();
         } else {
            this.ownedSprays_ = null;
            this.ownedSpraysBuilder_.clear();
         }

         this.bitField0_ &= -2;
         if (this.equippedSpraysBuilder_ == null) {
            this.equippedSprays_ = Collections.emptyList();
         } else {
            this.equippedSprays_ = null;
            this.equippedSpraysBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.lunarPlusFreeSprayId_ = 0;
         this.hasAllSpraysFlag_ = false;
         this.maxActiveSprays_ = 0;
         this.lunarPlusFreeSprayIds_ = LoginResponse.emptyIntList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_spray_v1_LoginResponse_descriptor;
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
         if (this.ownedSpraysBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.ownedSprays_ = Collections.unmodifiableList(this.ownedSprays_);
               this.bitField0_ &= -2;
            }

            var1.ownedSprays_ = this.ownedSprays_;
         } else {
            var1.ownedSprays_ = this.ownedSpraysBuilder_.build();
         }

         if (this.equippedSpraysBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.equippedSprays_ = Collections.unmodifiableList(this.equippedSprays_);
               this.bitField0_ &= -3;
            }

            var1.equippedSprays_ = this.equippedSprays_;
         } else {
            var1.equippedSprays_ = this.equippedSpraysBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 4) != 0) {
            var1.lunarPlusFreeSprayId_ = this.lunarPlusFreeSprayId_;
         }

         if ((var2 & 8) != 0) {
            var1.hasAllSpraysFlag_ = this.hasAllSpraysFlag_;
         }

         if ((var2 & 16) != 0) {
            var1.maxActiveSprays_ = this.maxActiveSprays_;
         }

         if ((var2 & 32) != 0) {
            this.lunarPlusFreeSprayIds_.makeImmutable();
            var1.lunarPlusFreeSprayIds_ = this.lunarPlusFreeSprayIds_;
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

         if (this.ownedSpraysBuilder_ == null) {
            if (!var1.ownedSprays_.isEmpty()) {
               if (this.ownedSprays_.isEmpty()) {
                  this.ownedSprays_ = var1.ownedSprays_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureOwnedSpraysIsMutable();
                  this.ownedSprays_.addAll(var1.ownedSprays_);
               }

               this.onChanged();
            }
         } else if (!var1.ownedSprays_.isEmpty()) {
            if (this.ownedSpraysBuilder_.isEmpty()) {
               this.ownedSpraysBuilder_.dispose();
               this.ownedSpraysBuilder_ = null;
               this.ownedSprays_ = var1.ownedSprays_;
               this.bitField0_ &= -2;
               this.ownedSpraysBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOwnedSpraysFieldBuilder() : null;
            } else {
               this.ownedSpraysBuilder_.addAllMessages(var1.ownedSprays_);
            }
         }

         if (this.equippedSpraysBuilder_ == null) {
            if (!var1.equippedSprays_.isEmpty()) {
               if (this.equippedSprays_.isEmpty()) {
                  this.equippedSprays_ = var1.equippedSprays_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureEquippedSpraysIsMutable();
                  this.equippedSprays_.addAll(var1.equippedSprays_);
               }

               this.onChanged();
            }
         } else if (!var1.equippedSprays_.isEmpty()) {
            if (this.equippedSpraysBuilder_.isEmpty()) {
               this.equippedSpraysBuilder_.dispose();
               this.equippedSpraysBuilder_ = null;
               this.equippedSprays_ = var1.equippedSprays_;
               this.bitField0_ &= -3;
               this.equippedSpraysBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getEquippedSpraysFieldBuilder() : null;
            } else {
               this.equippedSpraysBuilder_.addAllMessages(var1.equippedSprays_);
            }
         }

         if (var1.getLunarPlusFreeSprayId() != 0) {
            this.setLunarPlusFreeSprayId(var1.getLunarPlusFreeSprayId());
         }

         if (var1.getHasAllSpraysFlag()) {
            this.setHasAllSpraysFlag(var1.getHasAllSpraysFlag());
         }

         if (var1.getMaxActiveSprays() != 0) {
            this.setMaxActiveSprays(var1.getMaxActiveSprays());
         }

         if (!var1.lunarPlusFreeSprayIds_.isEmpty()) {
            if (this.lunarPlusFreeSprayIds_.isEmpty()) {
               this.lunarPlusFreeSprayIds_ = var1.lunarPlusFreeSprayIds_;
               this.lunarPlusFreeSprayIds_.makeImmutable();
               this.bitField0_ |= 32;
            } else {
               this.ensureLunarPlusFreeSprayIdsIsMutable();
               this.lunarPlusFreeSprayIds_.addAll(var1.lunarPlusFreeSprayIds_);
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
                  case 10:
                     OwnedSpray var14 = var1.readMessage(OwnedSpray.parser(), var2);
                     if (this.ownedSpraysBuilder_ == null) {
                        this.ensureOwnedSpraysIsMutable();
                        this.ownedSprays_.add(var14);
                     } else {
                        this.ownedSpraysBuilder_.addMessage(var14);
                     }
                     break;
                  case 18:
                     EquippedSpray var13 = var1.readMessage(EquippedSpray.parser(), var2);
                     if (this.equippedSpraysBuilder_ == null) {
                        this.ensureEquippedSpraysIsMutable();
                        this.equippedSprays_.add(var13);
                     } else {
                        this.equippedSpraysBuilder_.addMessage(var13);
                     }
                     break;
                  case 24:
                     this.lunarPlusFreeSprayId_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.hasAllSpraysFlag_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.maxActiveSprays_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     int var12 = var1.readInt32();
                     this.ensureLunarPlusFreeSprayIdsIsMutable();
                     this.lunarPlusFreeSprayIds_.addInt(var12);
                     break;
                  case 50:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureLunarPlusFreeSprayIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.lunarPlusFreeSprayIds_.addInt(var1.readInt32());
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

      private void ensureOwnedSpraysIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.ownedSprays_ = new ArrayList<>(this.ownedSprays_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<OwnedSpray> getOwnedSpraysList() {
         return this.ownedSpraysBuilder_ == null ? Collections.unmodifiableList(this.ownedSprays_) : this.ownedSpraysBuilder_.getMessageList();
      }

      @Override
      public int getOwnedSpraysCount() {
         return this.ownedSpraysBuilder_ == null ? this.ownedSprays_.size() : this.ownedSpraysBuilder_.getCount();
      }

      @Override
      public OwnedSpray getOwnedSprays(int var1) {
         return this.ownedSpraysBuilder_ == null ? this.ownedSprays_.get(var1) : this.ownedSpraysBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOwnedSprays(int var1, OwnedSpray var2) {
         if (this.ownedSpraysBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.set(var1, var2);
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOwnedSprays(int var1, OwnedSpray.Builder var2) {
         if (this.ownedSpraysBuilder_ == null) {
            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOwnedSprays(OwnedSpray var1) {
         if (this.ownedSpraysBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.add(var1);
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOwnedSprays(int var1, OwnedSpray var2) {
         if (this.ownedSpraysBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.add(var1, var2);
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOwnedSprays(OwnedSpray.Builder var1) {
         if (this.ownedSpraysBuilder_ == null) {
            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.add(var1.build());
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOwnedSprays(int var1, OwnedSpray.Builder var2) {
         if (this.ownedSpraysBuilder_ == null) {
            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOwnedSprays(Iterable<? extends OwnedSpray> var1) {
         if (this.ownedSpraysBuilder_ == null) {
            this.ensureOwnedSpraysIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.ownedSprays_);
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOwnedSprays() {
         if (this.ownedSpraysBuilder_ == null) {
            this.ownedSprays_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOwnedSprays(int var1) {
         if (this.ownedSpraysBuilder_ == null) {
            this.ensureOwnedSpraysIsMutable();
            this.ownedSprays_.remove(var1);
            this.onChanged();
         } else {
            this.ownedSpraysBuilder_.remove(var1);
         }

         return this;
      }

      public OwnedSpray.Builder getOwnedSpraysBuilder(int var1) {
         return this.getOwnedSpraysFieldBuilder().getBuilder(var1);
      }

      @Override
      public OwnedSprayOrBuilder getOwnedSpraysOrBuilder(int var1) {
         return this.ownedSpraysBuilder_ == null ? this.ownedSprays_.get(var1) : this.ownedSpraysBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OwnedSprayOrBuilder> getOwnedSpraysOrBuilderList() {
         return this.ownedSpraysBuilder_ != null ? this.ownedSpraysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ownedSprays_);
      }

      public OwnedSpray.Builder addOwnedSpraysBuilder() {
         return this.getOwnedSpraysFieldBuilder().addBuilder(OwnedSpray.getDefaultInstance());
      }

      public OwnedSpray.Builder addOwnedSpraysBuilder(int var1) {
         return this.getOwnedSpraysFieldBuilder().addBuilder(var1, OwnedSpray.getDefaultInstance());
      }

      public List<OwnedSpray.Builder> getOwnedSpraysBuilderList() {
         return this.getOwnedSpraysFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OwnedSpray, OwnedSpray.Builder, OwnedSprayOrBuilder> getOwnedSpraysFieldBuilder() {
         if (this.ownedSpraysBuilder_ == null) {
            this.ownedSpraysBuilder_ = new RepeatedFieldBuilderV3<>(this.ownedSprays_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.ownedSprays_ = null;
         }

         return this.ownedSpraysBuilder_;
      }

      private void ensureEquippedSpraysIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.equippedSprays_ = new ArrayList<>(this.equippedSprays_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<EquippedSpray> getEquippedSpraysList() {
         return this.equippedSpraysBuilder_ == null ? Collections.unmodifiableList(this.equippedSprays_) : this.equippedSpraysBuilder_.getMessageList();
      }

      @Override
      public int getEquippedSpraysCount() {
         return this.equippedSpraysBuilder_ == null ? this.equippedSprays_.size() : this.equippedSpraysBuilder_.getCount();
      }

      @Override
      public EquippedSpray getEquippedSprays(int var1) {
         return this.equippedSpraysBuilder_ == null ? this.equippedSprays_.get(var1) : this.equippedSpraysBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setEquippedSprays(int var1, EquippedSpray var2) {
         if (this.equippedSpraysBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.set(var1, var2);
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setEquippedSprays(int var1, EquippedSpray.Builder var2) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addEquippedSprays(EquippedSpray var1) {
         if (this.equippedSpraysBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.add(var1);
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addEquippedSprays(int var1, EquippedSpray var2) {
         if (this.equippedSpraysBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.add(var1, var2);
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addEquippedSprays(EquippedSpray.Builder var1) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.add(var1.build());
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addEquippedSprays(int var1, EquippedSpray.Builder var2) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllEquippedSprays(Iterable<? extends EquippedSpray> var1) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.equippedSprays_);
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearEquippedSprays() {
         if (this.equippedSpraysBuilder_ == null) {
            this.equippedSprays_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeEquippedSprays(int var1) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.remove(var1);
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.remove(var1);
         }

         return this;
      }

      public EquippedSpray.Builder getEquippedSpraysBuilder(int var1) {
         return this.getEquippedSpraysFieldBuilder().getBuilder(var1);
      }

      @Override
      public EquippedSprayOrBuilder getEquippedSpraysOrBuilder(int var1) {
         return this.equippedSpraysBuilder_ == null ? this.equippedSprays_.get(var1) : this.equippedSpraysBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EquippedSprayOrBuilder> getEquippedSpraysOrBuilderList() {
         return this.equippedSpraysBuilder_ != null
            ? this.equippedSpraysBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.equippedSprays_);
      }

      public EquippedSpray.Builder addEquippedSpraysBuilder() {
         return this.getEquippedSpraysFieldBuilder().addBuilder(EquippedSpray.getDefaultInstance());
      }

      public EquippedSpray.Builder addEquippedSpraysBuilder(int var1) {
         return this.getEquippedSpraysFieldBuilder().addBuilder(var1, EquippedSpray.getDefaultInstance());
      }

      public List<EquippedSpray.Builder> getEquippedSpraysBuilderList() {
         return this.getEquippedSpraysFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EquippedSpray, EquippedSpray.Builder, EquippedSprayOrBuilder> getEquippedSpraysFieldBuilder() {
         if (this.equippedSpraysBuilder_ == null) {
            this.equippedSpraysBuilder_ = new RepeatedFieldBuilderV3<>(
               this.equippedSprays_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.equippedSprays_ = null;
         }

         return this.equippedSpraysBuilder_;
      }

      @Deprecated
      @Override
      public int getLunarPlusFreeSprayId() {
         return this.lunarPlusFreeSprayId_;
      }

      @Deprecated
      public LoginResponse.Builder setLunarPlusFreeSprayId(int var1) {
         this.lunarPlusFreeSprayId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearLunarPlusFreeSprayId() {
         this.bitField0_ &= -5;
         this.lunarPlusFreeSprayId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHasAllSpraysFlag() {
         return this.hasAllSpraysFlag_;
      }

      public LoginResponse.Builder setHasAllSpraysFlag(boolean var1) {
         this.hasAllSpraysFlag_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearHasAllSpraysFlag() {
         this.bitField0_ &= -9;
         this.hasAllSpraysFlag_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getMaxActiveSprays() {
         return this.maxActiveSprays_;
      }

      public LoginResponse.Builder setMaxActiveSprays(int var1) {
         this.maxActiveSprays_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearMaxActiveSprays() {
         this.bitField0_ &= -17;
         this.maxActiveSprays_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureLunarPlusFreeSprayIdsIsMutable() {
         if (!this.lunarPlusFreeSprayIds_.isModifiable()) {
            this.lunarPlusFreeSprayIds_ = LoginResponse.makeMutableCopy(this.lunarPlusFreeSprayIds_);
         }

         this.bitField0_ |= 32;
      }

      @Override
      public List<Integer> getLunarPlusFreeSprayIdsList() {
         this.lunarPlusFreeSprayIds_.makeImmutable();
         return this.lunarPlusFreeSprayIds_;
      }

      @Override
      public int getLunarPlusFreeSprayIdsCount() {
         return this.lunarPlusFreeSprayIds_.size();
      }

      @Override
      public int getLunarPlusFreeSprayIds(int var1) {
         return this.lunarPlusFreeSprayIds_.getInt(var1);
      }

      public LoginResponse.Builder setLunarPlusFreeSprayIds(int var1, int var2) {
         this.ensureLunarPlusFreeSprayIdsIsMutable();
         this.lunarPlusFreeSprayIds_.setInt(var1, var2);
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addLunarPlusFreeSprayIds(int var1) {
         this.ensureLunarPlusFreeSprayIdsIsMutable();
         this.lunarPlusFreeSprayIds_.addInt(var1);
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addAllLunarPlusFreeSprayIds(Iterable<? extends Integer> var1) {
         this.ensureLunarPlusFreeSprayIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.lunarPlusFreeSprayIds_);
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearLunarPlusFreeSprayIds() {
         this.lunarPlusFreeSprayIds_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -33;
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
