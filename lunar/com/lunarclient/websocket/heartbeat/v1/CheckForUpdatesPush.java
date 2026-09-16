package com.lunarclient.websocket.heartbeat.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CheckForUpdatesPush extends GeneratedMessageV3 implements CheckForUpdatesPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FORCE_INSTALL_FIELD_NUMBER = 1;
   private boolean forceInstall_ = false;
   private byte memoizedIsInitialized = -1;
   private static final CheckForUpdatesPush DEFAULT_INSTANCE = new CheckForUpdatesPush();
   private static final Parser<CheckForUpdatesPush> PARSER = new AbstractParser<CheckForUpdatesPush>() {
      public CheckForUpdatesPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CheckForUpdatesPush.Builder var3 = CheckForUpdatesPush.newBuilder();

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

   private CheckForUpdatesPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CheckForUpdatesPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CheckForUpdatesPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CheckForUpdatesPush.class, CheckForUpdatesPush.Builder.class);
   }

   @Override
   public boolean getForceInstall() {
      return this.forceInstall_;
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
      if (this.forceInstall_) {
         var1.writeBool(1, this.forceInstall_);
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
      if (this.forceInstall_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.forceInstall_);
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

      if (!(var1 instanceof CheckForUpdatesPush)) {
         return super.equals(var1);
      }

      CheckForUpdatesPush var2 = (CheckForUpdatesPush)var1;
      return this.getForceInstall() != var2.getForceInstall() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getForceInstall());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CheckForUpdatesPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckForUpdatesPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckForUpdatesPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckForUpdatesPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckForUpdatesPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckForUpdatesPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckForUpdatesPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckForUpdatesPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CheckForUpdatesPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CheckForUpdatesPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CheckForUpdatesPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckForUpdatesPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CheckForUpdatesPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CheckForUpdatesPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CheckForUpdatesPush.Builder newBuilder(CheckForUpdatesPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CheckForUpdatesPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CheckForUpdatesPush.Builder() : new CheckForUpdatesPush.Builder().mergeFrom(this);
   }

   protected CheckForUpdatesPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CheckForUpdatesPush.Builder(var1);
   }

   public static CheckForUpdatesPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CheckForUpdatesPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<CheckForUpdatesPush> getParserForType() {
      return PARSER;
   }

   public CheckForUpdatesPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CheckForUpdatesPush.Builder> implements CheckForUpdatesPushOrBuilder {
      private int bitField0_;
      private boolean forceInstall_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CheckForUpdatesPush.class, CheckForUpdatesPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CheckForUpdatesPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.forceInstall_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_CheckForUpdatesPush_descriptor;
      }

      public CheckForUpdatesPush getDefaultInstanceForType() {
         return CheckForUpdatesPush.getDefaultInstance();
      }

      public CheckForUpdatesPush build() {
         CheckForUpdatesPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CheckForUpdatesPush buildPartial() {
         CheckForUpdatesPush var1 = new CheckForUpdatesPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CheckForUpdatesPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.forceInstall_ = this.forceInstall_;
         }
      }

      public CheckForUpdatesPush.Builder clone() {
         return (CheckForUpdatesPush.Builder)super.clone();
      }

      public CheckForUpdatesPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckForUpdatesPush.Builder)super.setField(var1, var2);
      }

      public CheckForUpdatesPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CheckForUpdatesPush.Builder)super.clearField(var1);
      }

      public CheckForUpdatesPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CheckForUpdatesPush.Builder)super.clearOneof(var1);
      }

      public CheckForUpdatesPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CheckForUpdatesPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CheckForUpdatesPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckForUpdatesPush.Builder)super.addRepeatedField(var1, var2);
      }

      public CheckForUpdatesPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof CheckForUpdatesPush) {
            return this.mergeFrom((CheckForUpdatesPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CheckForUpdatesPush.Builder mergeFrom(CheckForUpdatesPush var1) {
         if (var1 == CheckForUpdatesPush.getDefaultInstance()) {
            return this;
         }

         if (var1.getForceInstall()) {
            this.setForceInstall(var1.getForceInstall());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CheckForUpdatesPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.forceInstall_ = var1.readBool();
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
      public boolean getForceInstall() {
         return this.forceInstall_;
      }

      public CheckForUpdatesPush.Builder setForceInstall(boolean var1) {
         this.forceInstall_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CheckForUpdatesPush.Builder clearForceInstall() {
         this.bitField0_ &= -2;
         this.forceInstall_ = false;
         this.onChanged();
         return this;
      }

      public final CheckForUpdatesPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CheckForUpdatesPush.Builder)super.setUnknownFields(var1);
      }

      public final CheckForUpdatesPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CheckForUpdatesPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
