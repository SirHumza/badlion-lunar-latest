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

public final class UpdateEquippedEmotesRequest extends GeneratedMessageV3 implements UpdateEquippedEmotesRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EQUIPPED_EMOTE_IDS_FIELD_NUMBER = 1;
   private Internal.IntList equippedEmoteIds_ = emptyIntList();
   private int equippedEmoteIdsMemoizedSerializedSize = -1;
   public static final int EQUIPPED_EMOTES_FIELD_NUMBER = 2;
   private List<EquippedEmote> equippedEmotes_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateEquippedEmotesRequest DEFAULT_INSTANCE = new UpdateEquippedEmotesRequest();
   private static final Parser<UpdateEquippedEmotesRequest> PARSER = new AbstractParser<UpdateEquippedEmotesRequest>() {
      public UpdateEquippedEmotesRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateEquippedEmotesRequest.Builder var3 = UpdateEquippedEmotesRequest.newBuilder();

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

   private UpdateEquippedEmotesRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateEquippedEmotesRequest() {
      this.equippedEmoteIds_ = emptyIntList();
      this.equippedEmotes_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateEquippedEmotesRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateEquippedEmotesRequest.class, UpdateEquippedEmotesRequest.Builder.class);
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
      if (this.getEquippedEmoteIdsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.equippedEmoteIdsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.equippedEmoteIds_.size(); var2++) {
         var1.writeInt32NoTag(this.equippedEmoteIds_.getInt(var2));
      }

      for (int var3 = 0; var3 < this.equippedEmotes_.size(); var3++) {
         var1.writeMessage(2, this.equippedEmotes_.get(var3));
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

      for (int var3 = 0; var3 < this.equippedEmoteIds_.size(); var3++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.equippedEmoteIds_.getInt(var3));
      }

      var4 += var2;
      if (!this.getEquippedEmoteIdsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.equippedEmoteIdsMemoizedSerializedSize = var2;

      for (int var8 = 0; var8 < this.equippedEmotes_.size(); var8++) {
         var4 += CodedOutputStream.computeMessageSize(2, this.equippedEmotes_.get(var8));
      }

      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateEquippedEmotesRequest)) {
         return super.equals(var1);
      } else {
         UpdateEquippedEmotesRequest var2 = (UpdateEquippedEmotesRequest)var1;
         if (!this.getEquippedEmoteIdsList().equals(var2.getEquippedEmoteIdsList())) {
            return false;
         } else {
            return !this.getEquippedEmotesList().equals(var2.getEquippedEmotesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getEquippedEmoteIdsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getEquippedEmoteIdsList().hashCode();
      }

      if (this.getEquippedEmotesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getEquippedEmotesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateEquippedEmotesRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateEquippedEmotesRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateEquippedEmotesRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateEquippedEmotesRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateEquippedEmotesRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateEquippedEmotesRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateEquippedEmotesRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateEquippedEmotesRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateEquippedEmotesRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateEquippedEmotesRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateEquippedEmotesRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateEquippedEmotesRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateEquippedEmotesRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateEquippedEmotesRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateEquippedEmotesRequest.Builder newBuilder(UpdateEquippedEmotesRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateEquippedEmotesRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateEquippedEmotesRequest.Builder() : new UpdateEquippedEmotesRequest.Builder().mergeFrom(this);
   }

   protected UpdateEquippedEmotesRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateEquippedEmotesRequest.Builder(var1);
   }

   public static UpdateEquippedEmotesRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateEquippedEmotesRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateEquippedEmotesRequest> getParserForType() {
      return PARSER;
   }

   public UpdateEquippedEmotesRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateEquippedEmotesRequest.Builder> implements UpdateEquippedEmotesRequestOrBuilder {
      private int bitField0_;
      private Internal.IntList equippedEmoteIds_ = UpdateEquippedEmotesRequest.emptyIntList();
      private List<EquippedEmote> equippedEmotes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedEmote, EquippedEmote.Builder, EquippedEmoteOrBuilder> equippedEmotesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateEquippedEmotesRequest.class, UpdateEquippedEmotesRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateEquippedEmotesRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.equippedEmoteIds_ = UpdateEquippedEmotesRequest.emptyIntList();
         if (this.equippedEmotesBuilder_ == null) {
            this.equippedEmotes_ = Collections.emptyList();
         } else {
            this.equippedEmotes_ = null;
            this.equippedEmotesBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_descriptor;
      }

      public UpdateEquippedEmotesRequest getDefaultInstanceForType() {
         return UpdateEquippedEmotesRequest.getDefaultInstance();
      }

      public UpdateEquippedEmotesRequest build() {
         UpdateEquippedEmotesRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateEquippedEmotesRequest buildPartial() {
         UpdateEquippedEmotesRequest var1 = new UpdateEquippedEmotesRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(UpdateEquippedEmotesRequest var1) {
         if (this.equippedEmotesBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.equippedEmotes_ = Collections.unmodifiableList(this.equippedEmotes_);
               this.bitField0_ &= -3;
            }

            var1.equippedEmotes_ = this.equippedEmotes_;
         } else {
            var1.equippedEmotes_ = this.equippedEmotesBuilder_.build();
         }
      }

      private void buildPartial0(UpdateEquippedEmotesRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.equippedEmoteIds_.makeImmutable();
            var1.equippedEmoteIds_ = this.equippedEmoteIds_;
         }
      }

      public UpdateEquippedEmotesRequest.Builder clone() {
         return (UpdateEquippedEmotesRequest.Builder)super.clone();
      }

      public UpdateEquippedEmotesRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateEquippedEmotesRequest.Builder)super.setField(var1, var2);
      }

      public UpdateEquippedEmotesRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateEquippedEmotesRequest.Builder)super.clearField(var1);
      }

      public UpdateEquippedEmotesRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateEquippedEmotesRequest.Builder)super.clearOneof(var1);
      }

      public UpdateEquippedEmotesRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateEquippedEmotesRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateEquippedEmotesRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateEquippedEmotesRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateEquippedEmotesRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateEquippedEmotesRequest) {
            return this.mergeFrom((UpdateEquippedEmotesRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateEquippedEmotesRequest.Builder mergeFrom(UpdateEquippedEmotesRequest var1) {
         if (var1 == UpdateEquippedEmotesRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.equippedEmoteIds_.isEmpty()) {
            if (this.equippedEmoteIds_.isEmpty()) {
               this.equippedEmoteIds_ = var1.equippedEmoteIds_;
               this.equippedEmoteIds_.makeImmutable();
               this.bitField0_ |= 1;
            } else {
               this.ensureEquippedEmoteIdsIsMutable();
               this.equippedEmoteIds_.addAll(var1.equippedEmoteIds_);
            }

            this.onChanged();
         }

         if (this.equippedEmotesBuilder_ == null) {
            if (!var1.equippedEmotes_.isEmpty()) {
               if (this.equippedEmotes_.isEmpty()) {
                  this.equippedEmotes_ = var1.equippedEmotes_;
                  this.bitField0_ &= -3;
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
               this.bitField0_ &= -3;
               this.equippedEmotesBuilder_ = UpdateEquippedEmotesRequest.alwaysUseFieldBuilders ? this.getEquippedEmotesFieldBuilder() : null;
            } else {
               this.equippedEmotesBuilder_.addAllMessages(var1.equippedEmotes_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateEquippedEmotesRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     int var13 = var1.readInt32();
                     this.ensureEquippedEmoteIdsIsMutable();
                     this.equippedEmoteIds_.addInt(var13);
                     break;
                  case 10:
                     int var12 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var12);
                     this.ensureEquippedEmoteIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.equippedEmoteIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  case 18:
                     EquippedEmote var5 = var1.readMessage(EquippedEmote.parser(), var2);
                     if (this.equippedEmotesBuilder_ == null) {
                        this.ensureEquippedEmotesIsMutable();
                        this.equippedEmotes_.add(var5);
                     } else {
                        this.equippedEmotesBuilder_.addMessage(var5);
                     }
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

      private void ensureEquippedEmoteIdsIsMutable() {
         if (!this.equippedEmoteIds_.isModifiable()) {
            this.equippedEmoteIds_ = UpdateEquippedEmotesRequest.makeMutableCopy(this.equippedEmoteIds_);
         }

         this.bitField0_ |= 1;
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
      public UpdateEquippedEmotesRequest.Builder setEquippedEmoteIds(int var1, int var2) {
         this.ensureEquippedEmoteIdsIsMutable();
         this.equippedEmoteIds_.setInt(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public UpdateEquippedEmotesRequest.Builder addEquippedEmoteIds(int var1) {
         this.ensureEquippedEmoteIdsIsMutable();
         this.equippedEmoteIds_.addInt(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public UpdateEquippedEmotesRequest.Builder addAllEquippedEmoteIds(Iterable<? extends Integer> var1) {
         this.ensureEquippedEmoteIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.equippedEmoteIds_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public UpdateEquippedEmotesRequest.Builder clearEquippedEmoteIds() {
         this.equippedEmoteIds_ = UpdateEquippedEmotesRequest.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureEquippedEmotesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.equippedEmotes_ = new ArrayList<>(this.equippedEmotes_);
            this.bitField0_ |= 2;
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

      public UpdateEquippedEmotesRequest.Builder setEquippedEmotes(int var1, EquippedEmote var2) {
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

      public UpdateEquippedEmotesRequest.Builder setEquippedEmotes(int var1, EquippedEmote.Builder var2) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public UpdateEquippedEmotesRequest.Builder addEquippedEmotes(EquippedEmote var1) {
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

      public UpdateEquippedEmotesRequest.Builder addEquippedEmotes(int var1, EquippedEmote var2) {
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

      public UpdateEquippedEmotesRequest.Builder addEquippedEmotes(EquippedEmote.Builder var1) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.add(var1.build());
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public UpdateEquippedEmotesRequest.Builder addEquippedEmotes(int var1, EquippedEmote.Builder var2) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            this.equippedEmotes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public UpdateEquippedEmotesRequest.Builder addAllEquippedEmotes(Iterable<? extends EquippedEmote> var1) {
         if (this.equippedEmotesBuilder_ == null) {
            this.ensureEquippedEmotesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.equippedEmotes_);
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public UpdateEquippedEmotesRequest.Builder clearEquippedEmotes() {
         if (this.equippedEmotesBuilder_ == null) {
            this.equippedEmotes_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.equippedEmotesBuilder_.clear();
         }

         return this;
      }

      public UpdateEquippedEmotesRequest.Builder removeEquippedEmotes(int var1) {
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
               this.equippedEmotes_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.equippedEmotes_ = null;
         }

         return this.equippedEmotesBuilder_;
      }

      public final UpdateEquippedEmotesRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateEquippedEmotesRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateEquippedEmotesRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateEquippedEmotesRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
