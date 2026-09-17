package com.lunarclient.apollo.cooldown.v1;

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

public final class RemoveCooldownMessage extends GeneratedMessageV3 implements RemoveCooldownMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   private byte memoizedIsInitialized = -1;
   private static final RemoveCooldownMessage DEFAULT_INSTANCE = new RemoveCooldownMessage();
   private static final Parser<RemoveCooldownMessage> PARSER = new AbstractParser<RemoveCooldownMessage>() {
      public RemoveCooldownMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveCooldownMessage.Builder var3 = RemoveCooldownMessage.newBuilder();

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

   private RemoveCooldownMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveCooldownMessage() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveCooldownMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveCooldownMessage.class, RemoveCooldownMessage.Builder.class);
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
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

      if (!(var1 instanceof RemoveCooldownMessage)) {
         return super.equals(var1);
      }

      RemoveCooldownMessage var2 = (RemoveCooldownMessage)var1;
      return !this.getName().equals(var2.getName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveCooldownMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveCooldownMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveCooldownMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveCooldownMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveCooldownMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveCooldownMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveCooldownMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveCooldownMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveCooldownMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveCooldownMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveCooldownMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveCooldownMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveCooldownMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveCooldownMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveCooldownMessage.Builder newBuilder(RemoveCooldownMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveCooldownMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveCooldownMessage.Builder() : new RemoveCooldownMessage.Builder().mergeFrom(this);
   }

   protected RemoveCooldownMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveCooldownMessage.Builder(var1);
   }

   public static RemoveCooldownMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveCooldownMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveCooldownMessage> getParserForType() {
      return PARSER;
   }

   public RemoveCooldownMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveCooldownMessage.Builder> implements RemoveCooldownMessageOrBuilder {
      private int bitField0_;
      private Object name_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveCooldownMessage.class, RemoveCooldownMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveCooldownMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cooldown_v1_RemoveCooldownMessage_descriptor;
      }

      public RemoveCooldownMessage getDefaultInstanceForType() {
         return RemoveCooldownMessage.getDefaultInstance();
      }

      public RemoveCooldownMessage build() {
         RemoveCooldownMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveCooldownMessage buildPartial() {
         RemoveCooldownMessage var1 = new RemoveCooldownMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveCooldownMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }
      }

      public RemoveCooldownMessage.Builder clone() {
         return (RemoveCooldownMessage.Builder)super.clone();
      }

      public RemoveCooldownMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveCooldownMessage.Builder)super.setField(var1, var2);
      }

      public RemoveCooldownMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveCooldownMessage.Builder)super.clearField(var1);
      }

      public RemoveCooldownMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveCooldownMessage.Builder)super.clearOneof(var1);
      }

      public RemoveCooldownMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveCooldownMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveCooldownMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveCooldownMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveCooldownMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveCooldownMessage) {
            return this.mergeFrom((RemoveCooldownMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveCooldownMessage.Builder mergeFrom(RemoveCooldownMessage var1) {
         if (var1 == RemoveCooldownMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
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

      public RemoveCooldownMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
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
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RemoveCooldownMessage.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveCooldownMessage.Builder clearName() {
         this.name_ = RemoveCooldownMessage.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RemoveCooldownMessage.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RemoveCooldownMessage.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final RemoveCooldownMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveCooldownMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveCooldownMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveCooldownMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
