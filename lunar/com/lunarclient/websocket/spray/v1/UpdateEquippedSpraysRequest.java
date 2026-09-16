package com.lunarclient.websocket.spray.v1;

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

public final class UpdateEquippedSpraysRequest extends GeneratedMessageV3 implements UpdateEquippedSpraysRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EQUIPPED_SPRAYS_FIELD_NUMBER = 1;
   private List<EquippedSpray> equippedSprays_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateEquippedSpraysRequest DEFAULT_INSTANCE = new UpdateEquippedSpraysRequest();
   private static final Parser<UpdateEquippedSpraysRequest> PARSER = new AbstractParser<UpdateEquippedSpraysRequest>() {
      public UpdateEquippedSpraysRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateEquippedSpraysRequest.Builder var3 = UpdateEquippedSpraysRequest.newBuilder();

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

   private UpdateEquippedSpraysRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateEquippedSpraysRequest() {
      this.equippedSprays_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateEquippedSpraysRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateEquippedSpraysRequest.class, UpdateEquippedSpraysRequest.Builder.class);
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
      for (int var2 = 0; var2 < this.equippedSprays_.size(); var2++) {
         var1.writeMessage(1, this.equippedSprays_.get(var2));
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

      for (int var2 = 0; var2 < this.equippedSprays_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.equippedSprays_.get(var2));
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

      if (!(var1 instanceof UpdateEquippedSpraysRequest)) {
         return super.equals(var1);
      }

      UpdateEquippedSpraysRequest var2 = (UpdateEquippedSpraysRequest)var1;
      return !this.getEquippedSpraysList().equals(var2.getEquippedSpraysList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getEquippedSpraysCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getEquippedSpraysList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateEquippedSpraysRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateEquippedSpraysRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateEquippedSpraysRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateEquippedSpraysRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateEquippedSpraysRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateEquippedSpraysRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateEquippedSpraysRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateEquippedSpraysRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateEquippedSpraysRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateEquippedSpraysRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateEquippedSpraysRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateEquippedSpraysRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateEquippedSpraysRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateEquippedSpraysRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateEquippedSpraysRequest.Builder newBuilder(UpdateEquippedSpraysRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateEquippedSpraysRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateEquippedSpraysRequest.Builder() : new UpdateEquippedSpraysRequest.Builder().mergeFrom(this);
   }

   protected UpdateEquippedSpraysRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateEquippedSpraysRequest.Builder(var1);
   }

   public static UpdateEquippedSpraysRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateEquippedSpraysRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateEquippedSpraysRequest> getParserForType() {
      return PARSER;
   }

   public UpdateEquippedSpraysRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateEquippedSpraysRequest.Builder> implements UpdateEquippedSpraysRequestOrBuilder {
      private int bitField0_;
      private List<EquippedSpray> equippedSprays_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedSpray, EquippedSpray.Builder, EquippedSprayOrBuilder> equippedSpraysBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateEquippedSpraysRequest.class, UpdateEquippedSpraysRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateEquippedSpraysRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.equippedSpraysBuilder_ == null) {
            this.equippedSprays_ = Collections.emptyList();
         } else {
            this.equippedSprays_ = null;
            this.equippedSpraysBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_spray_v1_UpdateEquippedSpraysRequest_descriptor;
      }

      public UpdateEquippedSpraysRequest getDefaultInstanceForType() {
         return UpdateEquippedSpraysRequest.getDefaultInstance();
      }

      public UpdateEquippedSpraysRequest build() {
         UpdateEquippedSpraysRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateEquippedSpraysRequest buildPartial() {
         UpdateEquippedSpraysRequest var1 = new UpdateEquippedSpraysRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(UpdateEquippedSpraysRequest var1) {
         if (this.equippedSpraysBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.equippedSprays_ = Collections.unmodifiableList(this.equippedSprays_);
               this.bitField0_ &= -2;
            }

            var1.equippedSprays_ = this.equippedSprays_;
         } else {
            var1.equippedSprays_ = this.equippedSpraysBuilder_.build();
         }
      }

      private void buildPartial0(UpdateEquippedSpraysRequest var1) {
         int var2 = this.bitField0_;
      }

      public UpdateEquippedSpraysRequest.Builder clone() {
         return (UpdateEquippedSpraysRequest.Builder)super.clone();
      }

      public UpdateEquippedSpraysRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateEquippedSpraysRequest.Builder)super.setField(var1, var2);
      }

      public UpdateEquippedSpraysRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateEquippedSpraysRequest.Builder)super.clearField(var1);
      }

      public UpdateEquippedSpraysRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateEquippedSpraysRequest.Builder)super.clearOneof(var1);
      }

      public UpdateEquippedSpraysRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateEquippedSpraysRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateEquippedSpraysRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateEquippedSpraysRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateEquippedSpraysRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateEquippedSpraysRequest) {
            return this.mergeFrom((UpdateEquippedSpraysRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateEquippedSpraysRequest.Builder mergeFrom(UpdateEquippedSpraysRequest var1) {
         if (var1 == UpdateEquippedSpraysRequest.getDefaultInstance()) {
            return this;
         }

         if (this.equippedSpraysBuilder_ == null) {
            if (!var1.equippedSprays_.isEmpty()) {
               if (this.equippedSprays_.isEmpty()) {
                  this.equippedSprays_ = var1.equippedSprays_;
                  this.bitField0_ &= -2;
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
               this.bitField0_ &= -2;
               this.equippedSpraysBuilder_ = UpdateEquippedSpraysRequest.alwaysUseFieldBuilders ? this.getEquippedSpraysFieldBuilder() : null;
            } else {
               this.equippedSpraysBuilder_.addAllMessages(var1.equippedSprays_);
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

      public UpdateEquippedSpraysRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     EquippedSpray var5 = var1.readMessage(EquippedSpray.parser(), var2);
                     if (this.equippedSpraysBuilder_ == null) {
                        this.ensureEquippedSpraysIsMutable();
                        this.equippedSprays_.add(var5);
                     } else {
                        this.equippedSpraysBuilder_.addMessage(var5);
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

      private void ensureEquippedSpraysIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.equippedSprays_ = new ArrayList<>(this.equippedSprays_);
            this.bitField0_ |= 1;
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

      public UpdateEquippedSpraysRequest.Builder setEquippedSprays(int var1, EquippedSpray var2) {
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

      public UpdateEquippedSpraysRequest.Builder setEquippedSprays(int var1, EquippedSpray.Builder var2) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public UpdateEquippedSpraysRequest.Builder addEquippedSprays(EquippedSpray var1) {
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

      public UpdateEquippedSpraysRequest.Builder addEquippedSprays(int var1, EquippedSpray var2) {
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

      public UpdateEquippedSpraysRequest.Builder addEquippedSprays(EquippedSpray.Builder var1) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.add(var1.build());
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public UpdateEquippedSpraysRequest.Builder addEquippedSprays(int var1, EquippedSpray.Builder var2) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            this.equippedSprays_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public UpdateEquippedSpraysRequest.Builder addAllEquippedSprays(Iterable<? extends EquippedSpray> var1) {
         if (this.equippedSpraysBuilder_ == null) {
            this.ensureEquippedSpraysIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.equippedSprays_);
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public UpdateEquippedSpraysRequest.Builder clearEquippedSprays() {
         if (this.equippedSpraysBuilder_ == null) {
            this.equippedSprays_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.equippedSpraysBuilder_.clear();
         }

         return this;
      }

      public UpdateEquippedSpraysRequest.Builder removeEquippedSprays(int var1) {
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
               this.equippedSprays_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.equippedSprays_ = null;
         }

         return this.equippedSpraysBuilder_;
      }

      public final UpdateEquippedSpraysRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateEquippedSpraysRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateEquippedSpraysRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateEquippedSpraysRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
