package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Duration extends GeneratedMessageV3 implements DurationOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SECONDS_FIELD_NUMBER = 1;
   private long seconds_ = 0L;
   public static final int NANOS_FIELD_NUMBER = 2;
   private int nanos_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Duration DEFAULT_INSTANCE = new Duration();
   private static final Parser<Duration> PARSER = new AbstractParser<Duration>() {
      public Duration parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Duration.Builder var3 = Duration.newBuilder();

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

   private Duration(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Duration() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Duration();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return DurationProto.internal_static_google_protobuf_Duration_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable.ensureFieldAccessorsInitialized(Duration.class, Duration.Builder.class);
   }

   @Override
   public long getSeconds() {
      return this.seconds_;
   }

   @Override
   public int getNanos() {
      return this.nanos_;
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
      if (this.seconds_ != 0L) {
         var1.writeInt64(1, this.seconds_);
      }

      if (this.nanos_ != 0) {
         var1.writeInt32(2, this.nanos_);
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
      if (this.seconds_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(1, this.seconds_);
      }

      if (this.nanos_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.nanos_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Duration)) {
         return super.equals(var1);
      } else {
         Duration var2 = (Duration)var1;
         if (this.getSeconds() != var2.getSeconds()) {
            return false;
         } else {
            return this.getNanos() != var2.getNanos() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashLong(this.getSeconds());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getNanos();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Duration parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Duration parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Duration parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Duration parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Duration parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Duration parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Duration parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Duration parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Duration parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Duration parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Duration parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Duration parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Duration.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Duration.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Duration.Builder newBuilder(Duration var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Duration.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Duration.Builder() : new Duration.Builder().mergeFrom(this);
   }

   protected Duration.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Duration.Builder(var1);
   }

   public static Duration getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Duration> parser() {
      return PARSER;
   }

   @Override
   public Parser<Duration> getParserForType() {
      return PARSER;
   }

   public Duration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Duration.Builder> implements DurationOrBuilder {
      private int bitField0_;
      private long seconds_;
      private int nanos_;

      public static final Descriptors.Descriptor getDescriptor() {
         return DurationProto.internal_static_google_protobuf_Duration_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Duration.class, Duration.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Duration.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.seconds_ = 0L;
         this.nanos_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return DurationProto.internal_static_google_protobuf_Duration_descriptor;
      }

      public Duration getDefaultInstanceForType() {
         return Duration.getDefaultInstance();
      }

      public Duration build() {
         Duration var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Duration buildPartial() {
         Duration var1 = new Duration(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Duration var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.seconds_ = this.seconds_;
         }

         if ((var2 & 2) != 0) {
            var1.nanos_ = this.nanos_;
         }
      }

      public Duration.Builder clone() {
         return (Duration.Builder)super.clone();
      }

      public Duration.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Duration.Builder)super.setField(var1, var2);
      }

      public Duration.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Duration.Builder)super.clearField(var1);
      }

      public Duration.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Duration.Builder)super.clearOneof(var1);
      }

      public Duration.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Duration.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Duration.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Duration.Builder)super.addRepeatedField(var1, var2);
      }

      public Duration.Builder mergeFrom(Message var1) {
         if (var1 instanceof Duration) {
            return this.mergeFrom((Duration)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Duration.Builder mergeFrom(Duration var1) {
         if (var1 == Duration.getDefaultInstance()) {
            return this;
         }

         if (var1.getSeconds() != 0L) {
            this.setSeconds(var1.getSeconds());
         }

         if (var1.getNanos() != 0) {
            this.setNanos(var1.getNanos());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Duration.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.seconds_ = var1.readInt64();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.nanos_ = var1.readInt32();
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
      public long getSeconds() {
         return this.seconds_;
      }

      public Duration.Builder setSeconds(long var1) {
         this.seconds_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Duration.Builder clearSeconds() {
         this.bitField0_ &= -2;
         this.seconds_ = 0L;
         this.onChanged();
         return this;
      }

      @Override
      public int getNanos() {
         return this.nanos_;
      }

      public Duration.Builder setNanos(int var1) {
         this.nanos_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Duration.Builder clearNanos() {
         this.bitField0_ &= -3;
         this.nanos_ = 0;
         this.onChanged();
         return this;
      }

      public final Duration.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Duration.Builder)super.setUnknownFields(var1);
      }

      public final Duration.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Duration.Builder)super.mergeUnknownFields(var1);
      }
   }
}
