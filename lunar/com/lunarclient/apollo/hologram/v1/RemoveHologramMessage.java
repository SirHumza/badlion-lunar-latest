package com.lunarclient.apollo.hologram.v1;

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

public final class RemoveHologramMessage extends GeneratedMessageV3 implements RemoveHologramMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   private byte memoizedIsInitialized = -1;
   private static final RemoveHologramMessage DEFAULT_INSTANCE = new RemoveHologramMessage();
   private static final Parser<RemoveHologramMessage> PARSER = new AbstractParser<RemoveHologramMessage>() {
      public RemoveHologramMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveHologramMessage.Builder var3 = RemoveHologramMessage.newBuilder();

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

   private RemoveHologramMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveHologramMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveHologramMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveHologramMessage.class, RemoveHologramMessage.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
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

      if (!(var1 instanceof RemoveHologramMessage)) {
         return super.equals(var1);
      }

      RemoveHologramMessage var2 = (RemoveHologramMessage)var1;
      return !this.getId().equals(var2.getId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveHologramMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveHologramMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveHologramMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveHologramMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveHologramMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveHologramMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveHologramMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveHologramMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveHologramMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveHologramMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveHologramMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveHologramMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveHologramMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveHologramMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveHologramMessage.Builder newBuilder(RemoveHologramMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveHologramMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveHologramMessage.Builder() : new RemoveHologramMessage.Builder().mergeFrom(this);
   }

   protected RemoveHologramMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveHologramMessage.Builder(var1);
   }

   public static RemoveHologramMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveHologramMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveHologramMessage> getParserForType() {
      return PARSER;
   }

   public RemoveHologramMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveHologramMessage.Builder> implements RemoveHologramMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveHologramMessage.class, RemoveHologramMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveHologramMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_hologram_v1_RemoveHologramMessage_descriptor;
      }

      public RemoveHologramMessage getDefaultInstanceForType() {
         return RemoveHologramMessage.getDefaultInstance();
      }

      public RemoveHologramMessage build() {
         RemoveHologramMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveHologramMessage buildPartial() {
         RemoveHologramMessage var1 = new RemoveHologramMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveHologramMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }
      }

      public RemoveHologramMessage.Builder clone() {
         return (RemoveHologramMessage.Builder)super.clone();
      }

      public RemoveHologramMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveHologramMessage.Builder)super.setField(var1, var2);
      }

      public RemoveHologramMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveHologramMessage.Builder)super.clearField(var1);
      }

      public RemoveHologramMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveHologramMessage.Builder)super.clearOneof(var1);
      }

      public RemoveHologramMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveHologramMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveHologramMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveHologramMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveHologramMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveHologramMessage) {
            return this.mergeFrom((RemoveHologramMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveHologramMessage.Builder mergeFrom(RemoveHologramMessage var1) {
         if (var1 == RemoveHologramMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
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

      public RemoveHologramMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
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
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RemoveHologramMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveHologramMessage.Builder clearId() {
         this.id_ = RemoveHologramMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RemoveHologramMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RemoveHologramMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final RemoveHologramMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveHologramMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveHologramMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveHologramMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
