package com.lunarclient.apollo.marker.v1;

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

public final class RemoveMarkerMessage extends GeneratedMessageV3 implements RemoveMarkerMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   private byte memoizedIsInitialized = -1;
   private static final RemoveMarkerMessage DEFAULT_INSTANCE = new RemoveMarkerMessage();
   private static final Parser<RemoveMarkerMessage> PARSER = new AbstractParser<RemoveMarkerMessage>() {
      public RemoveMarkerMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveMarkerMessage.Builder var3 = RemoveMarkerMessage.newBuilder();

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

   private RemoveMarkerMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveMarkerMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveMarkerMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveMarkerMessage.class, RemoveMarkerMessage.Builder.class);
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

      if (!(var1 instanceof RemoveMarkerMessage)) {
         return super.equals(var1);
      }

      RemoveMarkerMessage var2 = (RemoveMarkerMessage)var1;
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

   public static RemoveMarkerMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveMarkerMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveMarkerMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveMarkerMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveMarkerMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveMarkerMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveMarkerMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveMarkerMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveMarkerMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveMarkerMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveMarkerMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveMarkerMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveMarkerMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveMarkerMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveMarkerMessage.Builder newBuilder(RemoveMarkerMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveMarkerMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveMarkerMessage.Builder() : new RemoveMarkerMessage.Builder().mergeFrom(this);
   }

   protected RemoveMarkerMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveMarkerMessage.Builder(var1);
   }

   public static RemoveMarkerMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveMarkerMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveMarkerMessage> getParserForType() {
      return PARSER;
   }

   public RemoveMarkerMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveMarkerMessage.Builder> implements RemoveMarkerMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveMarkerMessage.class, RemoveMarkerMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveMarkerMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_RemoveMarkerMessage_descriptor;
      }

      public RemoveMarkerMessage getDefaultInstanceForType() {
         return RemoveMarkerMessage.getDefaultInstance();
      }

      public RemoveMarkerMessage build() {
         RemoveMarkerMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveMarkerMessage buildPartial() {
         RemoveMarkerMessage var1 = new RemoveMarkerMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveMarkerMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }
      }

      public RemoveMarkerMessage.Builder clone() {
         return (RemoveMarkerMessage.Builder)super.clone();
      }

      public RemoveMarkerMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveMarkerMessage.Builder)super.setField(var1, var2);
      }

      public RemoveMarkerMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveMarkerMessage.Builder)super.clearField(var1);
      }

      public RemoveMarkerMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveMarkerMessage.Builder)super.clearOneof(var1);
      }

      public RemoveMarkerMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveMarkerMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveMarkerMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveMarkerMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveMarkerMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveMarkerMessage) {
            return this.mergeFrom((RemoveMarkerMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveMarkerMessage.Builder mergeFrom(RemoveMarkerMessage var1) {
         if (var1 == RemoveMarkerMessage.getDefaultInstance()) {
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

      public RemoveMarkerMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public RemoveMarkerMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveMarkerMessage.Builder clearId() {
         this.id_ = RemoveMarkerMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RemoveMarkerMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RemoveMarkerMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final RemoveMarkerMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveMarkerMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveMarkerMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveMarkerMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
