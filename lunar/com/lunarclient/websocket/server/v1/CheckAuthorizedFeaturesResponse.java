package com.lunarclient.websocket.server.v1;

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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class CheckAuthorizedFeaturesResponse extends GeneratedMessageV3 implements CheckAuthorizedFeaturesResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SCOPES_FIELD_NUMBER = 1;
   private LazyStringArrayList scopes_ = LazyStringArrayList.emptyList();
   public static final int ASSOCIATED_COSMETIC_IDS_FIELD_NUMBER = 2;
   private Internal.IntList associatedCosmeticIds_ = emptyIntList();
   private int associatedCosmeticIdsMemoizedSerializedSize = -1;
   public static final int ASSOCIATED_EMOTE_IDS_FIELD_NUMBER = 3;
   private Internal.IntList associatedEmoteIds_ = emptyIntList();
   private int associatedEmoteIdsMemoizedSerializedSize = -1;
   public static final int ASSOCIATED_SPRAY_IDS_FIELD_NUMBER = 4;
   private Internal.IntList associatedSprayIds_ = emptyIntList();
   private int associatedSprayIdsMemoizedSerializedSize = -1;
   private byte memoizedIsInitialized = -1;
   private static final CheckAuthorizedFeaturesResponse DEFAULT_INSTANCE = new CheckAuthorizedFeaturesResponse();
   private static final Parser<CheckAuthorizedFeaturesResponse> PARSER = new AbstractParser<CheckAuthorizedFeaturesResponse>() {
      public CheckAuthorizedFeaturesResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CheckAuthorizedFeaturesResponse.Builder var3 = CheckAuthorizedFeaturesResponse.newBuilder();

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

   private CheckAuthorizedFeaturesResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CheckAuthorizedFeaturesResponse() {
      this.scopes_ = LazyStringArrayList.emptyList();
      this.associatedCosmeticIds_ = emptyIntList();
      this.associatedEmoteIds_ = emptyIntList();
      this.associatedSprayIds_ = emptyIntList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CheckAuthorizedFeaturesResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CheckAuthorizedFeaturesResponse.class, CheckAuthorizedFeaturesResponse.Builder.class);
   }

   public ProtocolStringList getScopesList() {
      return this.scopes_;
   }

   @Override
   public int getScopesCount() {
      return this.scopes_.size();
   }

   @Override
   public String getScopes(int var1) {
      return this.scopes_.get(var1);
   }

   @Override
   public ByteString getScopesBytes(int var1) {
      return this.scopes_.getByteString(var1);
   }

   @Override
   public List<Integer> getAssociatedCosmeticIdsList() {
      return this.associatedCosmeticIds_;
   }

   @Override
   public int getAssociatedCosmeticIdsCount() {
      return this.associatedCosmeticIds_.size();
   }

   @Override
   public int getAssociatedCosmeticIds(int var1) {
      return this.associatedCosmeticIds_.getInt(var1);
   }

   @Override
   public List<Integer> getAssociatedEmoteIdsList() {
      return this.associatedEmoteIds_;
   }

   @Override
   public int getAssociatedEmoteIdsCount() {
      return this.associatedEmoteIds_.size();
   }

   @Override
   public int getAssociatedEmoteIds(int var1) {
      return this.associatedEmoteIds_.getInt(var1);
   }

   @Override
   public List<Integer> getAssociatedSprayIdsList() {
      return this.associatedSprayIds_;
   }

   @Override
   public int getAssociatedSprayIdsCount() {
      return this.associatedSprayIds_.size();
   }

   @Override
   public int getAssociatedSprayIds(int var1) {
      return this.associatedSprayIds_.getInt(var1);
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

      for (int var2 = 0; var2 < this.scopes_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 1, this.scopes_.getRaw(var2));
      }

      if (this.getAssociatedCosmeticIdsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.associatedCosmeticIdsMemoizedSerializedSize);
      }

      for (int var3 = 0; var3 < this.associatedCosmeticIds_.size(); var3++) {
         var1.writeInt32NoTag(this.associatedCosmeticIds_.getInt(var3));
      }

      if (this.getAssociatedEmoteIdsList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.associatedEmoteIdsMemoizedSerializedSize);
      }

      for (int var4 = 0; var4 < this.associatedEmoteIds_.size(); var4++) {
         var1.writeInt32NoTag(this.associatedEmoteIds_.getInt(var4));
      }

      if (this.getAssociatedSprayIdsList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.associatedSprayIdsMemoizedSerializedSize);
      }

      for (int var5 = 0; var5 < this.associatedSprayIds_.size(); var5++) {
         var1.writeInt32NoTag(this.associatedSprayIds_.getInt(var5));
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

      for (int var3 = 0; var3 < this.scopes_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.scopes_.getRaw(var3));
      }

      var4 += var2;
      var4 += 1 * this.getScopesList().size();
      var2 = 0;

      for (int var17 = 0; var17 < this.associatedCosmeticIds_.size(); var17++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.associatedCosmeticIds_.getInt(var17));
      }

      var4 += var2;
      if (!this.getAssociatedCosmeticIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.associatedCosmeticIdsMemoizedSerializedSize = var2;
      var2 = 0;

      for (int var18 = 0; var18 < this.associatedEmoteIds_.size(); var18++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.associatedEmoteIds_.getInt(var18));
      }

      var4 += var2;
      if (!this.getAssociatedEmoteIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.associatedEmoteIdsMemoizedSerializedSize = var2;
      var2 = 0;

      for (int var19 = 0; var19 < this.associatedSprayIds_.size(); var19++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.associatedSprayIds_.getInt(var19));
      }

      var4 += var2;
      if (!this.getAssociatedSprayIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.associatedSprayIdsMemoizedSerializedSize = var2;
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CheckAuthorizedFeaturesResponse)) {
         return super.equals(var1);
      } else {
         CheckAuthorizedFeaturesResponse var2 = (CheckAuthorizedFeaturesResponse)var1;
         if (!this.getScopesList().equals(var2.getScopesList())) {
            return false;
         } else if (!this.getAssociatedCosmeticIdsList().equals(var2.getAssociatedCosmeticIdsList())) {
            return false;
         } else if (!this.getAssociatedEmoteIdsList().equals(var2.getAssociatedEmoteIdsList())) {
            return false;
         } else {
            return !this.getAssociatedSprayIdsList().equals(var2.getAssociatedSprayIdsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getScopesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getScopesList().hashCode();
      }

      if (this.getAssociatedCosmeticIdsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getAssociatedCosmeticIdsList().hashCode();
      }

      if (this.getAssociatedEmoteIdsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getAssociatedEmoteIdsList().hashCode();
      }

      if (this.getAssociatedSprayIdsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getAssociatedSprayIdsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CheckAuthorizedFeaturesResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CheckAuthorizedFeaturesResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckAuthorizedFeaturesResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CheckAuthorizedFeaturesResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CheckAuthorizedFeaturesResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CheckAuthorizedFeaturesResponse.Builder newBuilder(CheckAuthorizedFeaturesResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CheckAuthorizedFeaturesResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CheckAuthorizedFeaturesResponse.Builder() : new CheckAuthorizedFeaturesResponse.Builder().mergeFrom(this);
   }

   protected CheckAuthorizedFeaturesResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CheckAuthorizedFeaturesResponse.Builder(var1);
   }

   public static CheckAuthorizedFeaturesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CheckAuthorizedFeaturesResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CheckAuthorizedFeaturesResponse> getParserForType() {
      return PARSER;
   }

   public CheckAuthorizedFeaturesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<CheckAuthorizedFeaturesResponse.Builder>
      implements CheckAuthorizedFeaturesResponseOrBuilder {
      private int bitField0_;
      private LazyStringArrayList scopes_ = LazyStringArrayList.emptyList();
      private Internal.IntList associatedCosmeticIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
      private Internal.IntList associatedEmoteIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
      private Internal.IntList associatedSprayIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CheckAuthorizedFeaturesResponse.class, CheckAuthorizedFeaturesResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.scopes_ = LazyStringArrayList.emptyList();
         this.associatedCosmeticIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
         this.associatedEmoteIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
         this.associatedSprayIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_descriptor;
      }

      public CheckAuthorizedFeaturesResponse getDefaultInstanceForType() {
         return CheckAuthorizedFeaturesResponse.getDefaultInstance();
      }

      public CheckAuthorizedFeaturesResponse build() {
         CheckAuthorizedFeaturesResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CheckAuthorizedFeaturesResponse buildPartial() {
         CheckAuthorizedFeaturesResponse var1 = new CheckAuthorizedFeaturesResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CheckAuthorizedFeaturesResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.scopes_.makeImmutable();
            var1.scopes_ = this.scopes_;
         }

         if ((var2 & 2) != 0) {
            this.associatedCosmeticIds_.makeImmutable();
            var1.associatedCosmeticIds_ = this.associatedCosmeticIds_;
         }

         if ((var2 & 4) != 0) {
            this.associatedEmoteIds_.makeImmutable();
            var1.associatedEmoteIds_ = this.associatedEmoteIds_;
         }

         if ((var2 & 8) != 0) {
            this.associatedSprayIds_.makeImmutable();
            var1.associatedSprayIds_ = this.associatedSprayIds_;
         }
      }

      public CheckAuthorizedFeaturesResponse.Builder clone() {
         return (CheckAuthorizedFeaturesResponse.Builder)super.clone();
      }

      public CheckAuthorizedFeaturesResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.setField(var1, var2);
      }

      public CheckAuthorizedFeaturesResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.clearField(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.clearOneof(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CheckAuthorizedFeaturesResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CheckAuthorizedFeaturesResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CheckAuthorizedFeaturesResponse) {
            return this.mergeFrom((CheckAuthorizedFeaturesResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder mergeFrom(CheckAuthorizedFeaturesResponse var1) {
         if (var1 == CheckAuthorizedFeaturesResponse.getDefaultInstance()) {
            return this;
         }

         if (!var1.scopes_.isEmpty()) {
            if (this.scopes_.isEmpty()) {
               this.scopes_ = var1.scopes_;
               this.bitField0_ |= 1;
            } else {
               this.ensureScopesIsMutable();
               this.scopes_.addAll(var1.scopes_);
            }

            this.onChanged();
         }

         if (!var1.associatedCosmeticIds_.isEmpty()) {
            if (this.associatedCosmeticIds_.isEmpty()) {
               this.associatedCosmeticIds_ = var1.associatedCosmeticIds_;
               this.associatedCosmeticIds_.makeImmutable();
               this.bitField0_ |= 2;
            } else {
               this.ensureAssociatedCosmeticIdsIsMutable();
               this.associatedCosmeticIds_.addAll(var1.associatedCosmeticIds_);
            }

            this.onChanged();
         }

         if (!var1.associatedEmoteIds_.isEmpty()) {
            if (this.associatedEmoteIds_.isEmpty()) {
               this.associatedEmoteIds_ = var1.associatedEmoteIds_;
               this.associatedEmoteIds_.makeImmutable();
               this.bitField0_ |= 4;
            } else {
               this.ensureAssociatedEmoteIdsIsMutable();
               this.associatedEmoteIds_.addAll(var1.associatedEmoteIds_);
            }

            this.onChanged();
         }

         if (!var1.associatedSprayIds_.isEmpty()) {
            if (this.associatedSprayIds_.isEmpty()) {
               this.associatedSprayIds_ = var1.associatedSprayIds_;
               this.associatedSprayIds_.makeImmutable();
               this.bitField0_ |= 8;
            } else {
               this.ensureAssociatedSprayIdsIsMutable();
               this.associatedSprayIds_.addAll(var1.associatedSprayIds_);
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

      public CheckAuthorizedFeaturesResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var17 = var1.readStringRequireUtf8();
                     this.ensureScopesIsMutable();
                     this.scopes_.add(var17);
                     break;
                  case 16:
                     int var16 = var1.readInt32();
                     this.ensureAssociatedCosmeticIdsIsMutable();
                     this.associatedCosmeticIds_.addInt(var16);
                     break;
                  case 18:
                     int var15 = var1.readRawVarint32();
                     int var19 = var1.pushLimit(var15);
                     this.ensureAssociatedCosmeticIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.associatedCosmeticIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var19);
                     break;
                  case 24:
                     int var14 = var1.readInt32();
                     this.ensureAssociatedEmoteIdsIsMutable();
                     this.associatedEmoteIds_.addInt(var14);
                     break;
                  case 26:
                     int var13 = var1.readRawVarint32();
                     int var18 = var1.pushLimit(var13);
                     this.ensureAssociatedEmoteIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.associatedEmoteIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var18);
                     break;
                  case 32:
                     int var12 = var1.readInt32();
                     this.ensureAssociatedSprayIdsIsMutable();
                     this.associatedSprayIds_.addInt(var12);
                     break;
                  case 34:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureAssociatedSprayIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.associatedSprayIds_.addInt(var1.readInt32());
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

      private void ensureScopesIsMutable() {
         if (!this.scopes_.isModifiable()) {
            this.scopes_ = new LazyStringArrayList(this.scopes_);
         }

         this.bitField0_ |= 1;
      }

      public ProtocolStringList getScopesList() {
         this.scopes_.makeImmutable();
         return this.scopes_;
      }

      @Override
      public int getScopesCount() {
         return this.scopes_.size();
      }

      @Override
      public String getScopes(int var1) {
         return this.scopes_.get(var1);
      }

      @Override
      public ByteString getScopesBytes(int var1) {
         return this.scopes_.getByteString(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder setScopes(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureScopesIsMutable();
         this.scopes_.set(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addScopes(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureScopesIsMutable();
         this.scopes_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAllScopes(Iterable<String> var1) {
         this.ensureScopesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.scopes_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder clearScopes() {
         this.scopes_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addScopesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         CheckAuthorizedFeaturesResponse.checkByteStringIsUtf8(var1);
         this.ensureScopesIsMutable();
         this.scopes_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      private void ensureAssociatedCosmeticIdsIsMutable() {
         if (!this.associatedCosmeticIds_.isModifiable()) {
            this.associatedCosmeticIds_ = CheckAuthorizedFeaturesResponse.makeMutableCopy(this.associatedCosmeticIds_);
         }

         this.bitField0_ |= 2;
      }

      @Override
      public List<Integer> getAssociatedCosmeticIdsList() {
         this.associatedCosmeticIds_.makeImmutable();
         return this.associatedCosmeticIds_;
      }

      @Override
      public int getAssociatedCosmeticIdsCount() {
         return this.associatedCosmeticIds_.size();
      }

      @Override
      public int getAssociatedCosmeticIds(int var1) {
         return this.associatedCosmeticIds_.getInt(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder setAssociatedCosmeticIds(int var1, int var2) {
         this.ensureAssociatedCosmeticIdsIsMutable();
         this.associatedCosmeticIds_.setInt(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAssociatedCosmeticIds(int var1) {
         this.ensureAssociatedCosmeticIdsIsMutable();
         this.associatedCosmeticIds_.addInt(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAllAssociatedCosmeticIds(Iterable<? extends Integer> var1) {
         this.ensureAssociatedCosmeticIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.associatedCosmeticIds_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder clearAssociatedCosmeticIds() {
         this.associatedCosmeticIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureAssociatedEmoteIdsIsMutable() {
         if (!this.associatedEmoteIds_.isModifiable()) {
            this.associatedEmoteIds_ = CheckAuthorizedFeaturesResponse.makeMutableCopy(this.associatedEmoteIds_);
         }

         this.bitField0_ |= 4;
      }

      @Override
      public List<Integer> getAssociatedEmoteIdsList() {
         this.associatedEmoteIds_.makeImmutable();
         return this.associatedEmoteIds_;
      }

      @Override
      public int getAssociatedEmoteIdsCount() {
         return this.associatedEmoteIds_.size();
      }

      @Override
      public int getAssociatedEmoteIds(int var1) {
         return this.associatedEmoteIds_.getInt(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder setAssociatedEmoteIds(int var1, int var2) {
         this.ensureAssociatedEmoteIdsIsMutable();
         this.associatedEmoteIds_.setInt(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAssociatedEmoteIds(int var1) {
         this.ensureAssociatedEmoteIdsIsMutable();
         this.associatedEmoteIds_.addInt(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAllAssociatedEmoteIds(Iterable<? extends Integer> var1) {
         this.ensureAssociatedEmoteIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.associatedEmoteIds_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder clearAssociatedEmoteIds() {
         this.associatedEmoteIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      private void ensureAssociatedSprayIdsIsMutable() {
         if (!this.associatedSprayIds_.isModifiable()) {
            this.associatedSprayIds_ = CheckAuthorizedFeaturesResponse.makeMutableCopy(this.associatedSprayIds_);
         }

         this.bitField0_ |= 8;
      }

      @Override
      public List<Integer> getAssociatedSprayIdsList() {
         this.associatedSprayIds_.makeImmutable();
         return this.associatedSprayIds_;
      }

      @Override
      public int getAssociatedSprayIdsCount() {
         return this.associatedSprayIds_.size();
      }

      @Override
      public int getAssociatedSprayIds(int var1) {
         return this.associatedSprayIds_.getInt(var1);
      }

      public CheckAuthorizedFeaturesResponse.Builder setAssociatedSprayIds(int var1, int var2) {
         this.ensureAssociatedSprayIdsIsMutable();
         this.associatedSprayIds_.setInt(var1, var2);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAssociatedSprayIds(int var1) {
         this.ensureAssociatedSprayIdsIsMutable();
         this.associatedSprayIds_.addInt(var1);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder addAllAssociatedSprayIds(Iterable<? extends Integer> var1) {
         this.ensureAssociatedSprayIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.associatedSprayIds_);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CheckAuthorizedFeaturesResponse.Builder clearAssociatedSprayIds() {
         this.associatedSprayIds_ = CheckAuthorizedFeaturesResponse.emptyIntList();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public final CheckAuthorizedFeaturesResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.setUnknownFields(var1);
      }

      public final CheckAuthorizedFeaturesResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CheckAuthorizedFeaturesResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
