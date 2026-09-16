package com.lunarclient.websocket.subscription.v1;

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

public final class UnsubscribeRequest extends GeneratedMessageV3 implements UnsubscribeRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TARGET_UUIDS_FIELD_NUMBER = 1;
   private List<Uuid> targetUuids_;
   private byte memoizedIsInitialized = -1;
   private static final UnsubscribeRequest DEFAULT_INSTANCE = new UnsubscribeRequest();
   private static final Parser<UnsubscribeRequest> PARSER = new AbstractParser<UnsubscribeRequest>() {
      public UnsubscribeRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnsubscribeRequest.Builder var3 = UnsubscribeRequest.newBuilder();

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

   private UnsubscribeRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UnsubscribeRequest() {
      this.targetUuids_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UnsubscribeRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UnsubscribeRequest.class, UnsubscribeRequest.Builder.class);
   }

   @Override
   public List<Uuid> getTargetUuidsList() {
      return this.targetUuids_;
   }

   @Override
   public List<? extends UuidOrBuilder> getTargetUuidsOrBuilderList() {
      return this.targetUuids_;
   }

   @Override
   public int getTargetUuidsCount() {
      return this.targetUuids_.size();
   }

   @Override
   public Uuid getTargetUuids(int var1) {
      return this.targetUuids_.get(var1);
   }

   @Override
   public UuidOrBuilder getTargetUuidsOrBuilder(int var1) {
      return this.targetUuids_.get(var1);
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
      for (int var2 = 0; var2 < this.targetUuids_.size(); var2++) {
         var1.writeMessage(1, this.targetUuids_.get(var2));
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

      for (int var2 = 0; var2 < this.targetUuids_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.targetUuids_.get(var2));
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

      if (!(var1 instanceof UnsubscribeRequest)) {
         return super.equals(var1);
      }

      UnsubscribeRequest var2 = (UnsubscribeRequest)var1;
      return !this.getTargetUuidsList().equals(var2.getTargetUuidsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getTargetUuidsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTargetUuidsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UnsubscribeRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnsubscribeRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnsubscribeRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnsubscribeRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnsubscribeRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnsubscribeRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnsubscribeRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnsubscribeRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UnsubscribeRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UnsubscribeRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UnsubscribeRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnsubscribeRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UnsubscribeRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UnsubscribeRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UnsubscribeRequest.Builder newBuilder(UnsubscribeRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UnsubscribeRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UnsubscribeRequest.Builder() : new UnsubscribeRequest.Builder().mergeFrom(this);
   }

   protected UnsubscribeRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UnsubscribeRequest.Builder(var1);
   }

   public static UnsubscribeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UnsubscribeRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UnsubscribeRequest> getParserForType() {
      return PARSER;
   }

   public UnsubscribeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UnsubscribeRequest.Builder> implements UnsubscribeRequestOrBuilder {
      private int bitField0_;
      private List<Uuid> targetUuids_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> targetUuidsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UnsubscribeRequest.class, UnsubscribeRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UnsubscribeRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.targetUuidsBuilder_ == null) {
            this.targetUuids_ = Collections.emptyList();
         } else {
            this.targetUuids_ = null;
            this.targetUuidsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_descriptor;
      }

      public UnsubscribeRequest getDefaultInstanceForType() {
         return UnsubscribeRequest.getDefaultInstance();
      }

      public UnsubscribeRequest build() {
         UnsubscribeRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UnsubscribeRequest buildPartial() {
         UnsubscribeRequest var1 = new UnsubscribeRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(UnsubscribeRequest var1) {
         if (this.targetUuidsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.targetUuids_ = Collections.unmodifiableList(this.targetUuids_);
               this.bitField0_ &= -2;
            }

            var1.targetUuids_ = this.targetUuids_;
         } else {
            var1.targetUuids_ = this.targetUuidsBuilder_.build();
         }
      }

      private void buildPartial0(UnsubscribeRequest var1) {
         int var2 = this.bitField0_;
      }

      public UnsubscribeRequest.Builder clone() {
         return (UnsubscribeRequest.Builder)super.clone();
      }

      public UnsubscribeRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnsubscribeRequest.Builder)super.setField(var1, var2);
      }

      public UnsubscribeRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UnsubscribeRequest.Builder)super.clearField(var1);
      }

      public UnsubscribeRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UnsubscribeRequest.Builder)super.clearOneof(var1);
      }

      public UnsubscribeRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UnsubscribeRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UnsubscribeRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnsubscribeRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UnsubscribeRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UnsubscribeRequest) {
            return this.mergeFrom((UnsubscribeRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UnsubscribeRequest.Builder mergeFrom(UnsubscribeRequest var1) {
         if (var1 == UnsubscribeRequest.getDefaultInstance()) {
            return this;
         }

         if (this.targetUuidsBuilder_ == null) {
            if (!var1.targetUuids_.isEmpty()) {
               if (this.targetUuids_.isEmpty()) {
                  this.targetUuids_ = var1.targetUuids_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureTargetUuidsIsMutable();
                  this.targetUuids_.addAll(var1.targetUuids_);
               }

               this.onChanged();
            }
         } else if (!var1.targetUuids_.isEmpty()) {
            if (this.targetUuidsBuilder_.isEmpty()) {
               this.targetUuidsBuilder_.dispose();
               this.targetUuidsBuilder_ = null;
               this.targetUuids_ = var1.targetUuids_;
               this.bitField0_ &= -2;
               this.targetUuidsBuilder_ = UnsubscribeRequest.alwaysUseFieldBuilders ? this.getTargetUuidsFieldBuilder() : null;
            } else {
               this.targetUuidsBuilder_.addAllMessages(var1.targetUuids_);
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

      public UnsubscribeRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     if (this.targetUuidsBuilder_ == null) {
                        this.ensureTargetUuidsIsMutable();
                        this.targetUuids_.add(var5);
                     } else {
                        this.targetUuidsBuilder_.addMessage(var5);
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

      private void ensureTargetUuidsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.targetUuids_ = new ArrayList<>(this.targetUuids_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<Uuid> getTargetUuidsList() {
         return this.targetUuidsBuilder_ == null ? Collections.unmodifiableList(this.targetUuids_) : this.targetUuidsBuilder_.getMessageList();
      }

      @Override
      public int getTargetUuidsCount() {
         return this.targetUuidsBuilder_ == null ? this.targetUuids_.size() : this.targetUuidsBuilder_.getCount();
      }

      @Override
      public Uuid getTargetUuids(int var1) {
         return this.targetUuidsBuilder_ == null ? this.targetUuids_.get(var1) : this.targetUuidsBuilder_.getMessage(var1);
      }

      public UnsubscribeRequest.Builder setTargetUuids(int var1, Uuid var2) {
         if (this.targetUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.set(var1, var2);
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public UnsubscribeRequest.Builder setTargetUuids(int var1, Uuid.Builder var2) {
         if (this.targetUuidsBuilder_ == null) {
            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public UnsubscribeRequest.Builder addTargetUuids(Uuid var1) {
         if (this.targetUuidsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.add(var1);
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.addMessage(var1);
         }

         return this;
      }

      public UnsubscribeRequest.Builder addTargetUuids(int var1, Uuid var2) {
         if (this.targetUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.add(var1, var2);
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public UnsubscribeRequest.Builder addTargetUuids(Uuid.Builder var1) {
         if (this.targetUuidsBuilder_ == null) {
            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.add(var1.build());
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public UnsubscribeRequest.Builder addTargetUuids(int var1, Uuid.Builder var2) {
         if (this.targetUuidsBuilder_ == null) {
            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public UnsubscribeRequest.Builder addAllTargetUuids(Iterable<? extends Uuid> var1) {
         if (this.targetUuidsBuilder_ == null) {
            this.ensureTargetUuidsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.targetUuids_);
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public UnsubscribeRequest.Builder clearTargetUuids() {
         if (this.targetUuidsBuilder_ == null) {
            this.targetUuids_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.clear();
         }

         return this;
      }

      public UnsubscribeRequest.Builder removeTargetUuids(int var1) {
         if (this.targetUuidsBuilder_ == null) {
            this.ensureTargetUuidsIsMutable();
            this.targetUuids_.remove(var1);
            this.onChanged();
         } else {
            this.targetUuidsBuilder_.remove(var1);
         }

         return this;
      }

      public Uuid.Builder getTargetUuidsBuilder(int var1) {
         return this.getTargetUuidsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidOrBuilder getTargetUuidsOrBuilder(int var1) {
         return this.targetUuidsBuilder_ == null ? this.targetUuids_.get(var1) : this.targetUuidsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidOrBuilder> getTargetUuidsOrBuilderList() {
         return this.targetUuidsBuilder_ != null ? this.targetUuidsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.targetUuids_);
      }

      public Uuid.Builder addTargetUuidsBuilder() {
         return this.getTargetUuidsFieldBuilder().addBuilder(Uuid.getDefaultInstance());
      }

      public Uuid.Builder addTargetUuidsBuilder(int var1) {
         return this.getTargetUuidsFieldBuilder().addBuilder(var1, Uuid.getDefaultInstance());
      }

      public List<Uuid.Builder> getTargetUuidsBuilderList() {
         return this.getTargetUuidsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getTargetUuidsFieldBuilder() {
         if (this.targetUuidsBuilder_ == null) {
            this.targetUuidsBuilder_ = new RepeatedFieldBuilderV3<>(this.targetUuids_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.targetUuids_ = null;
         }

         return this.targetUuidsBuilder_;
      }

      public final UnsubscribeRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UnsubscribeRequest.Builder)super.setUnknownFields(var1);
      }

      public final UnsubscribeRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UnsubscribeRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
