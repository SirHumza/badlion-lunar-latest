package com.lunarclient.common.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LocalServer extends GeneratedMessageV3 implements LocalServerOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RICH_STATUS_FIELD_NUMBER = 1;
   private ServerRichStatus richStatus_;
   private byte memoizedIsInitialized = -1;
   private static final LocalServer DEFAULT_INSTANCE = new LocalServer();
   private static final Parser<LocalServer> PARSER = new AbstractParser<LocalServer>() {
      public LocalServer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LocalServer.Builder var3 = LocalServer.newBuilder();

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

   private LocalServer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LocalServer() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LocalServer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return LocationProto.internal_static_lunarclient_common_v1_LocalServer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return LocationProto.internal_static_lunarclient_common_v1_LocalServer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LocalServer.class, LocalServer.Builder.class);
   }

   @Override
   public boolean hasRichStatus() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ServerRichStatus getRichStatus() {
      return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
   }

   @Override
   public ServerRichStatusOrBuilder getRichStatusOrBuilder() {
      return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
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
         var1.writeMessage(1, this.getRichStatus());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getRichStatus());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LocalServer)) {
         return super.equals(var1);
      } else {
         LocalServer var2 = (LocalServer)var1;
         if (this.hasRichStatus() != var2.hasRichStatus()) {
            return false;
         } else {
            return this.hasRichStatus() && !this.getRichStatus().equals(var2.getRichStatus()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasRichStatus()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getRichStatus().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LocalServer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LocalServer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LocalServer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LocalServer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LocalServer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LocalServer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LocalServer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LocalServer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LocalServer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LocalServer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LocalServer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LocalServer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LocalServer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LocalServer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LocalServer.Builder newBuilder(LocalServer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LocalServer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LocalServer.Builder() : new LocalServer.Builder().mergeFrom(this);
   }

   protected LocalServer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LocalServer.Builder(var1);
   }

   public static LocalServer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LocalServer> parser() {
      return PARSER;
   }

   @Override
   public Parser<LocalServer> getParserForType() {
      return PARSER;
   }

   public LocalServer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LocalServer.Builder> implements LocalServerOrBuilder {
      private int bitField0_;
      private ServerRichStatus richStatus_;
      private SingleFieldBuilderV3<ServerRichStatus, ServerRichStatus.Builder, ServerRichStatusOrBuilder> richStatusBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return LocationProto.internal_static_lunarclient_common_v1_LocalServer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LocationProto.internal_static_lunarclient_common_v1_LocalServer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LocalServer.class, LocalServer.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LocalServer.alwaysUseFieldBuilders) {
            this.getRichStatusFieldBuilder();
         }
      }

      public LocalServer.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.richStatus_ = null;
         if (this.richStatusBuilder_ != null) {
            this.richStatusBuilder_.dispose();
            this.richStatusBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return LocationProto.internal_static_lunarclient_common_v1_LocalServer_descriptor;
      }

      public LocalServer getDefaultInstanceForType() {
         return LocalServer.getDefaultInstance();
      }

      public LocalServer build() {
         LocalServer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LocalServer buildPartial() {
         LocalServer var1 = new LocalServer(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LocalServer var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.richStatus_ = this.richStatusBuilder_ == null ? this.richStatus_ : this.richStatusBuilder_.build();
            var3 |= 1;
         }

         LocalServer var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LocalServer.Builder clone() {
         return (LocalServer.Builder)super.clone();
      }

      public LocalServer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LocalServer.Builder)super.setField(var1, var2);
      }

      public LocalServer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LocalServer.Builder)super.clearField(var1);
      }

      public LocalServer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LocalServer.Builder)super.clearOneof(var1);
      }

      public LocalServer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LocalServer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LocalServer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LocalServer.Builder)super.addRepeatedField(var1, var2);
      }

      public LocalServer.Builder mergeFrom(Message var1) {
         if (var1 instanceof LocalServer) {
            return this.mergeFrom((LocalServer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LocalServer.Builder mergeFrom(LocalServer var1) {
         if (var1 == LocalServer.getDefaultInstance()) {
            return this;
         }

         if (var1.hasRichStatus()) {
            this.mergeRichStatus(var1.getRichStatus());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LocalServer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getRichStatusFieldBuilder().getBuilder(), var2);
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
      public boolean hasRichStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ServerRichStatus getRichStatus() {
         if (this.richStatusBuilder_ == null) {
            return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
         } else {
            return this.richStatusBuilder_.getMessage();
         }
      }

      public LocalServer.Builder setRichStatus(ServerRichStatus var1) {
         if (this.richStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.richStatus_ = var1;
         } else {
            this.richStatusBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LocalServer.Builder setRichStatus(ServerRichStatus.Builder var1) {
         if (this.richStatusBuilder_ == null) {
            this.richStatus_ = var1.build();
         } else {
            this.richStatusBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LocalServer.Builder mergeRichStatus(ServerRichStatus var1) {
         if (this.richStatusBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.richStatus_ != null && this.richStatus_ != ServerRichStatus.getDefaultInstance()) {
               this.getRichStatusBuilder().mergeFrom(var1);
            } else {
               this.richStatus_ = var1;
            }
         } else {
            this.richStatusBuilder_.mergeFrom(var1);
         }

         if (this.richStatus_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public LocalServer.Builder clearRichStatus() {
         this.bitField0_ &= -2;
         this.richStatus_ = null;
         if (this.richStatusBuilder_ != null) {
            this.richStatusBuilder_.dispose();
            this.richStatusBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder getRichStatusBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getRichStatusFieldBuilder().getBuilder();
      }

      @Override
      public ServerRichStatusOrBuilder getRichStatusOrBuilder() {
         if (this.richStatusBuilder_ != null) {
            return this.richStatusBuilder_.getMessageOrBuilder();
         } else {
            return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
         }
      }

      private SingleFieldBuilderV3<ServerRichStatus, ServerRichStatus.Builder, ServerRichStatusOrBuilder> getRichStatusFieldBuilder() {
         if (this.richStatusBuilder_ == null) {
            this.richStatusBuilder_ = new SingleFieldBuilderV3<>(this.getRichStatus(), this.getParentForChildren(), this.isClean());
            this.richStatus_ = null;
         }

         return this.richStatusBuilder_;
      }

      public final LocalServer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LocalServer.Builder)super.setUnknownFields(var1);
      }

      public final LocalServer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LocalServer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
