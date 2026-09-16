package com.lunarclient.websocket.emote.v1;

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

public final class RecommendedJam extends GeneratedMessageV3 implements RecommendedJamOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int JAM_ID_FIELD_NUMBER = 1;
   private int jamId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RecommendedJam DEFAULT_INSTANCE = new RecommendedJam();
   private static final Parser<RecommendedJam> PARSER = new AbstractParser<RecommendedJam>() {
      public RecommendedJam parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecommendedJam.Builder var3 = RecommendedJam.newBuilder();

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

   private RecommendedJam(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecommendedJam() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecommendedJam();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_emote_v1_RecommendedJam_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_emote_v1_RecommendedJam_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecommendedJam.class, RecommendedJam.Builder.class);
   }

   @Override
   public int getJamId() {
      return this.jamId_;
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
      if (this.jamId_ != 0) {
         var1.writeInt32(1, this.jamId_);
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
      if (this.jamId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.jamId_);
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

      if (!(var1 instanceof RecommendedJam)) {
         return super.equals(var1);
      }

      RecommendedJam var2 = (RecommendedJam)var1;
      return this.getJamId() != var2.getJamId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getJamId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecommendedJam parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecommendedJam parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecommendedJam parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecommendedJam parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecommendedJam parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecommendedJam parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecommendedJam parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecommendedJam parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecommendedJam parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecommendedJam parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecommendedJam parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecommendedJam parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecommendedJam.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecommendedJam.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecommendedJam.Builder newBuilder(RecommendedJam var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecommendedJam.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecommendedJam.Builder() : new RecommendedJam.Builder().mergeFrom(this);
   }

   protected RecommendedJam.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecommendedJam.Builder(var1);
   }

   public static RecommendedJam getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecommendedJam> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecommendedJam> getParserForType() {
      return PARSER;
   }

   public RecommendedJam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RecommendedJam.Builder> implements RecommendedJamOrBuilder {
      private int bitField0_;
      private int jamId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_emote_v1_RecommendedJam_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_emote_v1_RecommendedJam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecommendedJam.class, RecommendedJam.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RecommendedJam.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.jamId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_emote_v1_RecommendedJam_descriptor;
      }

      public RecommendedJam getDefaultInstanceForType() {
         return RecommendedJam.getDefaultInstance();
      }

      public RecommendedJam build() {
         RecommendedJam var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecommendedJam buildPartial() {
         RecommendedJam var1 = new RecommendedJam(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RecommendedJam var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.jamId_ = this.jamId_;
         }
      }

      public RecommendedJam.Builder clone() {
         return (RecommendedJam.Builder)super.clone();
      }

      public RecommendedJam.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecommendedJam.Builder)super.setField(var1, var2);
      }

      public RecommendedJam.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecommendedJam.Builder)super.clearField(var1);
      }

      public RecommendedJam.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecommendedJam.Builder)super.clearOneof(var1);
      }

      public RecommendedJam.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecommendedJam.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecommendedJam.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecommendedJam.Builder)super.addRepeatedField(var1, var2);
      }

      public RecommendedJam.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecommendedJam) {
            return this.mergeFrom((RecommendedJam)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecommendedJam.Builder mergeFrom(RecommendedJam var1) {
         if (var1 == RecommendedJam.getDefaultInstance()) {
            return this;
         }

         if (var1.getJamId() != 0) {
            this.setJamId(var1.getJamId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RecommendedJam.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.jamId_ = var1.readInt32();
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
      public int getJamId() {
         return this.jamId_;
      }

      public RecommendedJam.Builder setJamId(int var1) {
         this.jamId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RecommendedJam.Builder clearJamId() {
         this.bitField0_ &= -2;
         this.jamId_ = 0;
         this.onChanged();
         return this;
      }

      public final RecommendedJam.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecommendedJam.Builder)super.setUnknownFields(var1);
      }

      public final RecommendedJam.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecommendedJam.Builder)super.mergeUnknownFields(var1);
      }
   }
}
