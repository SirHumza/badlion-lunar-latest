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

public final class InboundServer extends GeneratedMessageV3 implements InboundServerOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SERVER_IP_FIELD_NUMBER = 1;
   private volatile Object serverIp_ = "";
   public static final int RICH_STATUS_FIELD_NUMBER = 2;
   private ServerRichStatus richStatus_;
   private byte memoizedIsInitialized = -1;
   private static final InboundServer DEFAULT_INSTANCE = new InboundServer();
   private static final Parser<InboundServer> PARSER = new AbstractParser<InboundServer>() {
      public InboundServer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundServer.Builder var3 = InboundServer.newBuilder();

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

   private InboundServer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundServer() {
      this.serverIp_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundServer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundServer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundServer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundServer.class, InboundServer.Builder.class);
   }

   @Override
   public String getServerIp() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerIpBytes() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverIp_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         GeneratedMessageV3.writeString(var1, 1, this.serverIp_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getRichStatus());
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.serverIp_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getRichStatus());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InboundServer)) {
         return super.equals(var1);
      } else {
         InboundServer var2 = (InboundServer)var1;
         if (!this.getServerIp().equals(var2.getServerIp())) {
            return false;
         } else if (this.hasRichStatus() != var2.hasRichStatus()) {
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getServerIp().hashCode();
      if (this.hasRichStatus()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRichStatus().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundServer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundServer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundServer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundServer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundServer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundServer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundServer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundServer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundServer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundServer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundServer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundServer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundServer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundServer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundServer.Builder newBuilder(InboundServer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundServer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundServer.Builder() : new InboundServer.Builder().mergeFrom(this);
   }

   protected InboundServer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundServer.Builder(var1);
   }

   public static InboundServer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundServer> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundServer> getParserForType() {
      return PARSER;
   }

   public InboundServer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundServer.Builder> implements InboundServerOrBuilder {
      private int bitField0_;
      private Object serverIp_ = "";
      private ServerRichStatus richStatus_;
      private SingleFieldBuilderV3<ServerRichStatus, ServerRichStatus.Builder, ServerRichStatusOrBuilder> richStatusBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundServer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundServer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundServer.class, InboundServer.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InboundServer.alwaysUseFieldBuilders) {
            this.getRichStatusFieldBuilder();
         }
      }

      public InboundServer.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverIp_ = "";
         this.richStatus_ = null;
         if (this.richStatusBuilder_ != null) {
            this.richStatusBuilder_.dispose();
            this.richStatusBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundServer_descriptor;
      }

      public InboundServer getDefaultInstanceForType() {
         return InboundServer.getDefaultInstance();
      }

      public InboundServer build() {
         InboundServer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundServer buildPartial() {
         InboundServer var1 = new InboundServer(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundServer var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.serverIp_ = this.serverIp_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.richStatus_ = this.richStatusBuilder_ == null ? this.richStatus_ : this.richStatusBuilder_.build();
            var3 |= 1;
         }

         InboundServer var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InboundServer.Builder clone() {
         return (InboundServer.Builder)super.clone();
      }

      public InboundServer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundServer.Builder)super.setField(var1, var2);
      }

      public InboundServer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundServer.Builder)super.clearField(var1);
      }

      public InboundServer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundServer.Builder)super.clearOneof(var1);
      }

      public InboundServer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundServer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundServer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundServer.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundServer.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundServer) {
            return this.mergeFrom((InboundServer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundServer.Builder mergeFrom(InboundServer var1) {
         if (var1 == InboundServer.getDefaultInstance()) {
            return this;
         }

         if (!var1.getServerIp().isEmpty()) {
            this.serverIp_ = var1.serverIp_;
            this.bitField0_ |= 1;
            this.onChanged();
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

      public InboundServer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.serverIp_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getRichStatusFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public String getServerIp() {
         Object var1 = this.serverIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerIpBytes() {
         Object var1 = this.serverIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InboundServer.Builder setServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InboundServer.Builder clearServerIp() {
         this.serverIp_ = InboundServer.getDefaultInstance().getServerIp();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public InboundServer.Builder setServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InboundServer.checkByteStringIsUtf8(var1);
         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasRichStatus() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ServerRichStatus getRichStatus() {
         if (this.richStatusBuilder_ == null) {
            return this.richStatus_ == null ? ServerRichStatus.getDefaultInstance() : this.richStatus_;
         } else {
            return this.richStatusBuilder_.getMessage();
         }
      }

      public InboundServer.Builder setRichStatus(ServerRichStatus var1) {
         if (this.richStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.richStatus_ = var1;
         } else {
            this.richStatusBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundServer.Builder setRichStatus(ServerRichStatus.Builder var1) {
         if (this.richStatusBuilder_ == null) {
            this.richStatus_ = var1.build();
         } else {
            this.richStatusBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InboundServer.Builder mergeRichStatus(ServerRichStatus var1) {
         if (this.richStatusBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.richStatus_ != null && this.richStatus_ != ServerRichStatus.getDefaultInstance()) {
               this.getRichStatusBuilder().mergeFrom(var1);
            } else {
               this.richStatus_ = var1;
            }
         } else {
            this.richStatusBuilder_.mergeFrom(var1);
         }

         if (this.richStatus_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public InboundServer.Builder clearRichStatus() {
         this.bitField0_ &= -3;
         this.richStatus_ = null;
         if (this.richStatusBuilder_ != null) {
            this.richStatusBuilder_.dispose();
            this.richStatusBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ServerRichStatus.Builder getRichStatusBuilder() {
         this.bitField0_ |= 2;
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

      public final InboundServer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundServer.Builder)super.setUnknownFields(var1);
      }

      public final InboundServer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundServer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
