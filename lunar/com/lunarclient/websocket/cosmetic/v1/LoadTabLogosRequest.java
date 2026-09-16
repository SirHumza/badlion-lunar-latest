package com.lunarclient.websocket.cosmetic.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoadTabLogosRequest extends GeneratedMessageV3 implements LoadTabLogosRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLAYER_UUIDS_FIELD_NUMBER = 1;
   private List<Uuid> playerUuids_;
   private byte memoizedIsInitialized = -1;
   private static final LoadTabLogosRequest DEFAULT_INSTANCE = new LoadTabLogosRequest();
   private static final Parser<LoadTabLogosRequest> PARSER = new AbstractParser<LoadTabLogosRequest>() {
      public LoadTabLogosRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadTabLogosRequest.Builder var3 = LoadTabLogosRequest.newBuilder();

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

   private LoadTabLogosRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadTabLogosRequest() {
      this.playerUuids_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadTabLogosRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadTabLogosRequest.class, LoadTabLogosRequest.Builder.class);
   }

   @Override
   public List<Uuid> getPlayerUuidsList() {
      return this.playerUuids_;
   }

   @Override
   public List<? extends UuidOrBuilder> getPlayerUuidsOrBuilderList() {
      return this.playerUuids_;
   }

   @Override
   public int getPlayerUuidsCount() {
      return this.playerUuids_.size();
   }

   @Override
   public Uuid getPlayerUuids(int var1) {
      return this.playerUuids_.get(var1);
   }

   @Override
   public UuidOrBuilder getPlayerUuidsOrBuilder(int var1) {
      return this.playerUuids_.get(var1);
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
      for (int var2 = 0; var2 < this.playerUuids_.size(); var2++) {
         var1.writeMessage(1, this.playerUuids_.get(var2));
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

      for (int var2 = 0; var2 < this.playerUuids_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.playerUuids_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LoadTabLogosRequest)) {
         return super.equals(var1);
      }

      LoadTabLogosRequest var2 = (LoadTabLogosRequest)var1;
      return !this.getPlayerUuidsList().equals(var2.getPlayerUuidsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getPlayerUuidsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuidsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadTabLogosRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadTabLogosRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadTabLogosRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadTabLogosRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadTabLogosRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadTabLogosRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadTabLogosRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadTabLogosRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadTabLogosRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadTabLogosRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadTabLogosRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadTabLogosRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadTabLogosRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadTabLogosRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadTabLogosRequest.Builder newBuilder(LoadTabLogosRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadTabLogosRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadTabLogosRequest.Builder() : new LoadTabLogosRequest.Builder().mergeFrom(this);
   }

   protected LoadTabLogosRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadTabLogosRequest.Builder(var1);
   }

   public static LoadTabLogosRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadTabLogosRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadTabLogosRequest> getParserForType() {
      return PARSER;
   }

   public LoadTabLogosRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadTabLogosRequest.Builder> implements LoadTabLogosRequestOrBuilder {
      private int bitField0_;
      private List<Uuid> playerUuids_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadTabLogosRequest.class, LoadTabLogosRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadTabLogosRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.playerUuidsBuilder_ == null) {
            this.playerUuids_ = Collections.emptyList();
         } else {
            this.playerUuids_ = null;
            this.playerUuidsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v1_LoadTabLogosRequest_descriptor;
      }

      public LoadTabLogosRequest getDefaultInstanceForType() {
         return LoadTabLogosRequest.getDefaultInstance();
      }

      public LoadTabLogosRequest build() {
         LoadTabLogosRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadTabLogosRequest buildPartial() {
         LoadTabLogosRequest var1 = new LoadTabLogosRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoadTabLogosRequest var1) {
         if (this.playerUuidsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.playerUuids_ = Collections.unmodifiableList(this.playerUuids_);
               this.bitField0_ &= -2;
            }

            var1.playerUuids_ = this.playerUuids_;
         } else {
            var1.playerUuids_ = this.playerUuidsBuilder_.build();
         }
      }

      private void buildPartial0(LoadTabLogosRequest var1) {
         int var2 = this.bitField0_;
      }

      public LoadTabLogosRequest.Builder clone() {
         return (LoadTabLogosRequest.Builder)super.clone();
      }

      public LoadTabLogosRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadTabLogosRequest.Builder)super.setField(var1, var2);
      }

      public LoadTabLogosRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadTabLogosRequest.Builder)super.clearField(var1);
      }

      public LoadTabLogosRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadTabLogosRequest.Builder)super.clearOneof(var1);
      }

      public LoadTabLogosRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadTabLogosRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadTabLogosRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadTabLogosRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadTabLogosRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadTabLogosRequest) {
            return this.mergeFrom((LoadTabLogosRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadTabLogosRequest.Builder mergeFrom(LoadTabLogosRequest var1) {
         if (var1 == LoadTabLogosRequest.getDefaultInstance()) {
            return this;
         }

         if (this.playerUuidsBuilder_ == null) {
            if (!var1.playerUuids_.isEmpty()) {
               if (this.playerUuids_.isEmpty()) {
                  this.playerUuids_ = var1.playerUuids_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensurePlayerUuidsIsMutable();
                  this.playerUuids_.addAll(var1.playerUuids_);
               }

               this.onChanged();
            }
         } else if (!var1.playerUuids_.isEmpty()) {
            if (this.playerUuidsBuilder_.isEmpty()) {
               this.playerUuidsBuilder_.dispose();
               this.playerUuidsBuilder_ = null;
               this.playerUuids_ = var1.playerUuids_;
               this.bitField0_ &= -2;
               this.playerUuidsBuilder_ = LoadTabLogosRequest.alwaysUseFieldBuilders ? this.getPlayerUuidsFieldBuilder() : null;
            } else {
               this.playerUuidsBuilder_.addAllMessages(var1.playerUuids_);
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

      public LoadTabLogosRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     Uuid var5 = var1.readMessage(Uuid.parser(), var2);
                     if (this.playerUuidsBuilder_ == null) {
                        this.ensurePlayerUuidsIsMutable();
                        this.playerUuids_.add(var5);
                     } else {
                        this.playerUuidsBuilder_.addMessage(var5);
                     }
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

      private void ensurePlayerUuidsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.playerUuids_ = new ArrayList<>(this.playerUuids_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<Uuid> getPlayerUuidsList() {
         return this.playerUuidsBuilder_ == null ? Collections.unmodifiableList(this.playerUuids_) : this.playerUuidsBuilder_.getMessageList();
      }

      @Override
      public int getPlayerUuidsCount() {
         return this.playerUuidsBuilder_ == null ? this.playerUuids_.size() : this.playerUuidsBuilder_.getCount();
      }

      @Override
      public Uuid getPlayerUuids(int var1) {
         return this.playerUuidsBuilder_ == null ? this.playerUuids_.get(var1) : this.playerUuidsBuilder_.getMessage(var1);
      }

      public LoadTabLogosRequest.Builder setPlayerUuids(int var1, Uuid var2) {
         if (this.playerUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.set(var1, var2);
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoadTabLogosRequest.Builder setPlayerUuids(int var1, Uuid.Builder var2) {
         if (this.playerUuidsBuilder_ == null) {
            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoadTabLogosRequest.Builder addPlayerUuids(Uuid var1) {
         if (this.playerUuidsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.add(var1);
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoadTabLogosRequest.Builder addPlayerUuids(int var1, Uuid var2) {
         if (this.playerUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.add(var1, var2);
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoadTabLogosRequest.Builder addPlayerUuids(Uuid.Builder var1) {
         if (this.playerUuidsBuilder_ == null) {
            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.add(var1.build());
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoadTabLogosRequest.Builder addPlayerUuids(int var1, Uuid.Builder var2) {
         if (this.playerUuidsBuilder_ == null) {
            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoadTabLogosRequest.Builder addAllPlayerUuids(Iterable<? extends Uuid> var1) {
         if (this.playerUuidsBuilder_ == null) {
            this.ensurePlayerUuidsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.playerUuids_);
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoadTabLogosRequest.Builder clearPlayerUuids() {
         if (this.playerUuidsBuilder_ == null) {
            this.playerUuids_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.clear();
         }

         return this;
      }

      public LoadTabLogosRequest.Builder removePlayerUuids(int var1) {
         if (this.playerUuidsBuilder_ == null) {
            this.ensurePlayerUuidsIsMutable();
            this.playerUuids_.remove(var1);
            this.onChanged();
         } else {
            this.playerUuidsBuilder_.remove(var1);
         }

         return this;
      }

      public Uuid.Builder getPlayerUuidsBuilder(int var1) {
         return this.getPlayerUuidsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidOrBuilder getPlayerUuidsOrBuilder(int var1) {
         return this.playerUuidsBuilder_ == null ? this.playerUuids_.get(var1) : this.playerUuidsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidOrBuilder> getPlayerUuidsOrBuilderList() {
         return this.playerUuidsBuilder_ != null ? this.playerUuidsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerUuids_);
      }

      public Uuid.Builder addPlayerUuidsBuilder() {
         return this.getPlayerUuidsFieldBuilder().addBuilder(Uuid.getDefaultInstance());
      }

      public Uuid.Builder addPlayerUuidsBuilder(int var1) {
         return this.getPlayerUuidsFieldBuilder().addBuilder(var1, Uuid.getDefaultInstance());
      }

      public List<Uuid.Builder> getPlayerUuidsBuilderList() {
         return this.getPlayerUuidsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidsFieldBuilder() {
         if (this.playerUuidsBuilder_ == null) {
            this.playerUuidsBuilder_ = new RepeatedFieldBuilderV3<>(this.playerUuids_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.playerUuids_ = null;
         }

         return this.playerUuidsBuilder_;
      }

      public final LoadTabLogosRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadTabLogosRequest.Builder)super.setUnknownFields(var1);
      }

      public final LoadTabLogosRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadTabLogosRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
