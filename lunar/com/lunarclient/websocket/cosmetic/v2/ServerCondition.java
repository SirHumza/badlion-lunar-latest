package com.lunarclient.websocket.cosmetic.v2;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ServerCondition extends GeneratedMessageV3 implements ServerConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_IP_FIELD_NUMBER = 1;
   private volatile Object serverIp_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ServerCondition DEFAULT_INSTANCE = new ServerCondition();
   private static final Parser<ServerCondition> PARSER = new AbstractParser<ServerCondition>() {
      public ServerCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerCondition.Builder var3 = ServerCondition.newBuilder();

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

   private ServerCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerCondition() {
      this.serverIp_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerCondition.class, ServerCondition.Builder.class);
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ServerCondition)) {
         return super.equals(var1);
      }

      ServerCondition var2 = (ServerCondition)var1;
      return !this.getServerIp().equals(var2.getServerIp()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerCondition.Builder newBuilder(ServerCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerCondition.Builder() : new ServerCondition.Builder().mergeFrom(this);
   }

   protected ServerCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerCondition.Builder(var1);
   }

   public static ServerCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerCondition> getParserForType() {
      return PARSER;
   }

   public ServerCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerCondition.Builder> implements ServerConditionOrBuilder {
      private int bitField0_;
      private Object serverIp_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerCondition.class, ServerCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ServerCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverIp_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_ServerCondition_descriptor;
      }

      public ServerCondition getDefaultInstanceForType() {
         return ServerCondition.getDefaultInstance();
      }

      public ServerCondition build() {
         ServerCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerCondition buildPartial() {
         ServerCondition var1 = new ServerCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ServerCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.serverIp_ = this.serverIp_;
         }
      }

      public ServerCondition.Builder clone() {
         return (ServerCondition.Builder)super.clone();
      }

      public ServerCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerCondition.Builder)super.setField(var1, var2);
      }

      public ServerCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerCondition.Builder)super.clearField(var1);
      }

      public ServerCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerCondition.Builder)super.clearOneof(var1);
      }

      public ServerCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerCondition) {
            return this.mergeFrom((ServerCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerCondition.Builder mergeFrom(ServerCondition var1) {
         if (var1 == ServerCondition.getDefaultInstance()) {
            return this;
         }

         if (!var1.getServerIp().isEmpty()) {
            this.serverIp_ = var1.serverIp_;
            this.bitField0_ |= 1;
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

      public ServerCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public ServerCondition.Builder setServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerCondition.Builder clearServerIp() {
         this.serverIp_ = ServerCondition.getDefaultInstance().getServerIp();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ServerCondition.Builder setServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCondition.checkByteStringIsUtf8(var1);
         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final ServerCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerCondition.Builder)super.setUnknownFields(var1);
      }

      public final ServerCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerCondition.Builder)super.mergeUnknownFields(var1);
      }
   }
}
