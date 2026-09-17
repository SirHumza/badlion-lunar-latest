package com.lunarclient.apollo.pingmarker.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RemovePlayerPingMessage extends GeneratedMessageV3 implements RemovePlayerPingMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   private byte memoizedIsInitialized = -1;
   private static final RemovePlayerPingMessage DEFAULT_INSTANCE = new RemovePlayerPingMessage();
   private static final Parser<RemovePlayerPingMessage> PARSER = new AbstractParser<RemovePlayerPingMessage>() {
      public RemovePlayerPingMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemovePlayerPingMessage.Builder var3 = RemovePlayerPingMessage.newBuilder();

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

   private RemovePlayerPingMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemovePlayerPingMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemovePlayerPingMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemovePlayerPingMessage.class, RemovePlayerPingMessage.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
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
         var1.writeMessage(1, this.getId());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RemovePlayerPingMessage)) {
         return super.equals(var1);
      } else {
         RemovePlayerPingMessage var2 = (RemovePlayerPingMessage)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else {
            return this.hasId() && !this.getId().equals(var2.getId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemovePlayerPingMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemovePlayerPingMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemovePlayerPingMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemovePlayerPingMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemovePlayerPingMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemovePlayerPingMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemovePlayerPingMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemovePlayerPingMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemovePlayerPingMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemovePlayerPingMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemovePlayerPingMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemovePlayerPingMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemovePlayerPingMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemovePlayerPingMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemovePlayerPingMessage.Builder newBuilder(RemovePlayerPingMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemovePlayerPingMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemovePlayerPingMessage.Builder() : new RemovePlayerPingMessage.Builder().mergeFrom(this);
   }

   protected RemovePlayerPingMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemovePlayerPingMessage.Builder(var1);
   }

   public static RemovePlayerPingMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemovePlayerPingMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemovePlayerPingMessage> getParserForType() {
      return PARSER;
   }

   public RemovePlayerPingMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemovePlayerPingMessage.Builder> implements RemovePlayerPingMessageOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemovePlayerPingMessage.class, RemovePlayerPingMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RemovePlayerPingMessage.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
         }
      }

      public RemovePlayerPingMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_RemovePlayerPingMessage_descriptor;
      }

      public RemovePlayerPingMessage getDefaultInstanceForType() {
         return RemovePlayerPingMessage.getDefaultInstance();
      }

      public RemovePlayerPingMessage build() {
         RemovePlayerPingMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemovePlayerPingMessage buildPartial() {
         RemovePlayerPingMessage var1 = new RemovePlayerPingMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemovePlayerPingMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         RemovePlayerPingMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RemovePlayerPingMessage.Builder clone() {
         return (RemovePlayerPingMessage.Builder)super.clone();
      }

      public RemovePlayerPingMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemovePlayerPingMessage.Builder)super.setField(var1, var2);
      }

      public RemovePlayerPingMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemovePlayerPingMessage.Builder)super.clearField(var1);
      }

      public RemovePlayerPingMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemovePlayerPingMessage.Builder)super.clearOneof(var1);
      }

      public RemovePlayerPingMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemovePlayerPingMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemovePlayerPingMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemovePlayerPingMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemovePlayerPingMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemovePlayerPingMessage) {
            return this.mergeFrom((RemovePlayerPingMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemovePlayerPingMessage.Builder mergeFrom(RemovePlayerPingMessage var1) {
         if (var1 == RemovePlayerPingMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemovePlayerPingMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public RemovePlayerPingMessage.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemovePlayerPingMessage.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemovePlayerPingMessage.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public RemovePlayerPingMessage.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      public final RemovePlayerPingMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemovePlayerPingMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemovePlayerPingMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemovePlayerPingMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
