package com.lunarclient.apollo.stopwatch.v1;

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

public final class ResetTimerMessage extends GeneratedMessageV3 implements ResetTimerMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ResetTimerMessage DEFAULT_INSTANCE = new ResetTimerMessage();
   private static final Parser<ResetTimerMessage> PARSER = new AbstractParser<ResetTimerMessage>() {
      public ResetTimerMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetTimerMessage.Builder var3 = ResetTimerMessage.newBuilder();

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

   private ResetTimerMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetTimerMessage() {
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetTimerMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetTimerMessage.class, ResetTimerMessage.Builder.class);
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

      if (!(var1 instanceof ResetTimerMessage)) {
         return super.equals(var1);
      }

      ResetTimerMessage var2 = (ResetTimerMessage)var1;
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

   public static ResetTimerMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetTimerMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetTimerMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetTimerMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetTimerMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetTimerMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetTimerMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetTimerMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetTimerMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetTimerMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetTimerMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetTimerMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetTimerMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetTimerMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetTimerMessage.Builder newBuilder(ResetTimerMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetTimerMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetTimerMessage.Builder() : new ResetTimerMessage.Builder().mergeFrom(this);
   }

   protected ResetTimerMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetTimerMessage.Builder(var1);
   }

   public static ResetTimerMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetTimerMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetTimerMessage> getParserForType() {
      return PARSER;
   }

   public ResetTimerMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetTimerMessage.Builder> implements ResetTimerMessageOrBuilder {
      private int bitField0_;
      private Object id_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetTimerMessage.class, ResetTimerMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetTimerMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_stopwatch_v1_ResetTimerMessage_descriptor;
      }

      public ResetTimerMessage getDefaultInstanceForType() {
         return ResetTimerMessage.getDefaultInstance();
      }

      public ResetTimerMessage build() {
         ResetTimerMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetTimerMessage buildPartial() {
         ResetTimerMessage var1 = new ResetTimerMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ResetTimerMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }
      }

      public ResetTimerMessage.Builder clone() {
         return (ResetTimerMessage.Builder)super.clone();
      }

      public ResetTimerMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetTimerMessage.Builder)super.setField(var1, var2);
      }

      public ResetTimerMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetTimerMessage.Builder)super.clearField(var1);
      }

      public ResetTimerMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetTimerMessage.Builder)super.clearOneof(var1);
      }

      public ResetTimerMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetTimerMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetTimerMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetTimerMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetTimerMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetTimerMessage) {
            return this.mergeFrom((ResetTimerMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetTimerMessage.Builder mergeFrom(ResetTimerMessage var1) {
         if (var1 == ResetTimerMessage.getDefaultInstance()) {
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

      public ResetTimerMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public ResetTimerMessage.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ResetTimerMessage.Builder clearId() {
         this.id_ = ResetTimerMessage.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ResetTimerMessage.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ResetTimerMessage.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final ResetTimerMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetTimerMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetTimerMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetTimerMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
