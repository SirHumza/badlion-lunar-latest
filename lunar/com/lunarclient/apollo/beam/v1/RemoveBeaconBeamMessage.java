package com.lunarclient.apollo.beam.v1;

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

public final class RemoveBeaconBeamMessage extends GeneratedMessageV3 implements RemoveBeaconBeamMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   private byte memoizedIsInitialized = -1;
   private static final RemoveBeaconBeamMessage DEFAULT_INSTANCE = new RemoveBeaconBeamMessage();
   private static final Parser<RemoveBeaconBeamMessage> PARSER = new AbstractParser<RemoveBeaconBeamMessage>() {
      public RemoveBeaconBeamMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveBeaconBeamMessage.Builder var3 = RemoveBeaconBeamMessage.newBuilder();

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

   private RemoveBeaconBeamMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveBeaconBeamMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveBeaconBeamMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveBeaconBeamMessage.class, RemoveBeaconBeamMessage.Builder.class);
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

      if (!(var1 instanceof RemoveBeaconBeamMessage)) {
         return super.equals(var1);
      }

      RemoveBeaconBeamMessage var2 = (RemoveBeaconBeamMessage)var1;
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

   public static RemoveBeaconBeamMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveBeaconBeamMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveBeaconBeamMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveBeaconBeamMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveBeaconBeamMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveBeaconBeamMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveBeaconBeamMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveBeaconBeamMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveBeaconBeamMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveBeaconBeamMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveBeaconBeamMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveBeaconBeamMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveBeaconBeamMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveBeaconBeamMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveBeaconBeamMessage.Builder newBuilder(RemoveBeaconBeamMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveBeaconBeamMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveBeaconBeamMessage.Builder() : new RemoveBeaconBeamMessage.Builder().mergeFrom(this);
   }

   protected RemoveBeaconBeamMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveBeaconBeamMessage.Builder(var1);
   }

   public static RemoveBeaconBeamMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveBeaconBeamMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveBeaconBeamMessage> getParserForType() {
      return PARSER;
   }

   public RemoveBeaconBeamMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveBeaconBeamMessage.Builder> implements RemoveBeaconBeamMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveBeaconBeamMessage.class, RemoveBeaconBeamMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveBeaconBeamMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_beam_v1_RemoveBeaconBeamMessage_descriptor;
      }

      public RemoveBeaconBeamMessage getDefaultInstanceForType() {
         return RemoveBeaconBeamMessage.getDefaultInstance();
      }

      public RemoveBeaconBeamMessage build() {
         RemoveBeaconBeamMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveBeaconBeamMessage buildPartial() {
         RemoveBeaconBeamMessage var1 = new RemoveBeaconBeamMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveBeaconBeamMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }
      }

      public RemoveBeaconBeamMessage.Builder clone() {
         return (RemoveBeaconBeamMessage.Builder)super.clone();
      }

      public RemoveBeaconBeamMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveBeaconBeamMessage.Builder)super.setField(var1, var2);
      }

      public RemoveBeaconBeamMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveBeaconBeamMessage.Builder)super.clearField(var1);
      }

      public RemoveBeaconBeamMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveBeaconBeamMessage.Builder)super.clearOneof(var1);
      }

      public RemoveBeaconBeamMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveBeaconBeamMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveBeaconBeamMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveBeaconBeamMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveBeaconBeamMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveBeaconBeamMessage) {
            return this.mergeFrom((RemoveBeaconBeamMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveBeaconBeamMessage.Builder mergeFrom(RemoveBeaconBeamMessage var1) {
         if (var1 == RemoveBeaconBeamMessage.getDefaultInstance()) {
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

      public RemoveBeaconBeamMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public RemoveBeaconBeamMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveBeaconBeamMessage.Builder clearId() {
         this.id_ = RemoveBeaconBeamMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RemoveBeaconBeamMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RemoveBeaconBeamMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final RemoveBeaconBeamMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveBeaconBeamMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveBeaconBeamMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveBeaconBeamMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
