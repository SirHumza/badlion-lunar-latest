package com.lunarclient.apollo.player.v1;

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

public final class UpdatePlayerWorldMessage extends GeneratedMessageV3 implements UpdatePlayerWorldMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int WORLD_FIELD_NUMBER = 1;
   private volatile Object world_ = "";
   private byte memoizedIsInitialized = -1;
   private static final UpdatePlayerWorldMessage DEFAULT_INSTANCE = new UpdatePlayerWorldMessage();
   private static final Parser<UpdatePlayerWorldMessage> PARSER = new AbstractParser<UpdatePlayerWorldMessage>() {
      public UpdatePlayerWorldMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdatePlayerWorldMessage.Builder var3 = UpdatePlayerWorldMessage.newBuilder();

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

   private UpdatePlayerWorldMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdatePlayerWorldMessage() {
      this.world_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdatePlayerWorldMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return WorldProto.internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return WorldProto.internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdatePlayerWorldMessage.class, UpdatePlayerWorldMessage.Builder.class);
   }

   @Override
   public String getWorld() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.world_ = var3;
      return var3;
   }

   @Override
   public ByteString getWorldBytes() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.world_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         GeneratedMessageV3.writeString(var1, 1, this.world_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.world_);
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

      if (!(var1 instanceof UpdatePlayerWorldMessage)) {
         return super.equals(var1);
      }

      UpdatePlayerWorldMessage var2 = (UpdatePlayerWorldMessage)var1;
      return !this.getWorld().equals(var2.getWorld()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getWorld().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdatePlayerWorldMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdatePlayerWorldMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdatePlayerWorldMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdatePlayerWorldMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdatePlayerWorldMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdatePlayerWorldMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdatePlayerWorldMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdatePlayerWorldMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdatePlayerWorldMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdatePlayerWorldMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdatePlayerWorldMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdatePlayerWorldMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdatePlayerWorldMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdatePlayerWorldMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdatePlayerWorldMessage.Builder newBuilder(UpdatePlayerWorldMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdatePlayerWorldMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdatePlayerWorldMessage.Builder() : new UpdatePlayerWorldMessage.Builder().mergeFrom(this);
   }

   protected UpdatePlayerWorldMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdatePlayerWorldMessage.Builder(var1);
   }

   public static UpdatePlayerWorldMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdatePlayerWorldMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdatePlayerWorldMessage> getParserForType() {
      return PARSER;
   }

   public UpdatePlayerWorldMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdatePlayerWorldMessage.Builder> implements UpdatePlayerWorldMessageOrBuilder {
      private int bitField0_;
      private Object world_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldProto.internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldProto.internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdatePlayerWorldMessage.class, UpdatePlayerWorldMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdatePlayerWorldMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.world_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return WorldProto.internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_descriptor;
      }

      public UpdatePlayerWorldMessage getDefaultInstanceForType() {
         return UpdatePlayerWorldMessage.getDefaultInstance();
      }

      public UpdatePlayerWorldMessage build() {
         UpdatePlayerWorldMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdatePlayerWorldMessage buildPartial() {
         UpdatePlayerWorldMessage var1 = new UpdatePlayerWorldMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdatePlayerWorldMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.world_ = this.world_;
         }
      }

      public UpdatePlayerWorldMessage.Builder clone() {
         return (UpdatePlayerWorldMessage.Builder)super.clone();
      }

      public UpdatePlayerWorldMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdatePlayerWorldMessage.Builder)super.setField(var1, var2);
      }

      public UpdatePlayerWorldMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdatePlayerWorldMessage.Builder)super.clearField(var1);
      }

      public UpdatePlayerWorldMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdatePlayerWorldMessage.Builder)super.clearOneof(var1);
      }

      public UpdatePlayerWorldMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdatePlayerWorldMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdatePlayerWorldMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdatePlayerWorldMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdatePlayerWorldMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdatePlayerWorldMessage) {
            return this.mergeFrom((UpdatePlayerWorldMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdatePlayerWorldMessage.Builder mergeFrom(UpdatePlayerWorldMessage var1) {
         if (var1 == UpdatePlayerWorldMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getWorld().isEmpty()) {
            this.world_ = var1.world_;
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

      public UpdatePlayerWorldMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.world_ = var1.readStringRequireUtf8();
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
      public String getWorld() {
         Object var1 = this.world_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.world_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getWorldBytes() {
         Object var1 = this.world_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.world_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UpdatePlayerWorldMessage.Builder setWorld(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.world_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdatePlayerWorldMessage.Builder clearWorld() {
         this.world_ = UpdatePlayerWorldMessage.getDefaultInstance().getWorld();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public UpdatePlayerWorldMessage.Builder setWorldBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UpdatePlayerWorldMessage.checkByteStringIsUtf8(var1);
         this.world_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final UpdatePlayerWorldMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdatePlayerWorldMessage.Builder)super.setUnknownFields(var1);
      }

      public final UpdatePlayerWorldMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdatePlayerWorldMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
