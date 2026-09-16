package com.lunarclient.common.v1;

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

public final class Uuid extends GeneratedMessageV3 implements UuidOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int HIGH64_FIELD_NUMBER = 1;
   private long high64_ = 0L;
   public static final int LOW64_FIELD_NUMBER = 2;
   private long low64_ = 0L;
   private byte memoizedIsInitialized = -1;
   private static final Uuid DEFAULT_INSTANCE = new Uuid();
   private static final Parser<Uuid> PARSER = new AbstractParser<Uuid>() {
      public Uuid parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Uuid.Builder var3 = Uuid.newBuilder();

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

   private Uuid(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Uuid() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Uuid();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return UuidProto.internal_static_lunarclient_common_v1_Uuid_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return UuidProto.internal_static_lunarclient_common_v1_Uuid_fieldAccessorTable.ensureFieldAccessorsInitialized(Uuid.class, Uuid.Builder.class);
   }

   @Override
   public long getHigh64() {
      return this.high64_;
   }

   @Override
   public long getLow64() {
      return this.low64_;
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
      if (this.high64_ != 0L) {
         var1.writeFixed64(1, this.high64_);
      }

      if (this.low64_ != 0L) {
         var1.writeFixed64(2, this.low64_);
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
      if (this.high64_ != 0L) {
         var1 += CodedOutputStream.computeFixed64Size(1, this.high64_);
      }

      if (this.low64_ != 0L) {
         var1 += CodedOutputStream.computeFixed64Size(2, this.low64_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Uuid)) {
         return super.equals(var1);
      } else {
         Uuid var2 = (Uuid)var1;
         if (this.getHigh64() != var2.getHigh64()) {
            return false;
         } else {
            return this.getLow64() != var2.getLow64() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashLong(this.getHigh64());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashLong(this.getLow64());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Uuid parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Uuid parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Uuid parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Uuid parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Uuid parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Uuid parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Uuid parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Uuid parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Uuid parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Uuid parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Uuid parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Uuid parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Uuid.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Uuid.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Uuid.Builder newBuilder(Uuid var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Uuid.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Uuid.Builder() : new Uuid.Builder().mergeFrom(this);
   }

   protected Uuid.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Uuid.Builder(var1);
   }

   public static Uuid getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Uuid> parser() {
      return PARSER;
   }

   @Override
   public Parser<Uuid> getParserForType() {
      return PARSER;
   }

   public Uuid getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Uuid.Builder> implements UuidOrBuilder {
      private int bitField0_;
      private long high64_;
      private long low64_;

      public static final Descriptors.Descriptor getDescriptor() {
         return UuidProto.internal_static_lunarclient_common_v1_Uuid_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UuidProto.internal_static_lunarclient_common_v1_Uuid_fieldAccessorTable.ensureFieldAccessorsInitialized(Uuid.class, Uuid.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Uuid.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.high64_ = 0L;
         this.low64_ = 0L;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return UuidProto.internal_static_lunarclient_common_v1_Uuid_descriptor;
      }

      public Uuid getDefaultInstanceForType() {
         return Uuid.getDefaultInstance();
      }

      public Uuid build() {
         Uuid var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Uuid buildPartial() {
         Uuid var1 = new Uuid(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Uuid var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.high64_ = this.high64_;
         }

         if ((var2 & 2) != 0) {
            var1.low64_ = this.low64_;
         }
      }

      public Uuid.Builder clone() {
         return (Uuid.Builder)super.clone();
      }

      public Uuid.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Uuid.Builder)super.setField(var1, var2);
      }

      public Uuid.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Uuid.Builder)super.clearField(var1);
      }

      public Uuid.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Uuid.Builder)super.clearOneof(var1);
      }

      public Uuid.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Uuid.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Uuid.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Uuid.Builder)super.addRepeatedField(var1, var2);
      }

      public Uuid.Builder mergeFrom(Message var1) {
         if (var1 instanceof Uuid) {
            return this.mergeFrom((Uuid)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Uuid.Builder mergeFrom(Uuid var1) {
         if (var1 == Uuid.getDefaultInstance()) {
            return this;
         }

         if (var1.getHigh64() != 0L) {
            this.setHigh64(var1.getHigh64());
         }

         if (var1.getLow64() != 0L) {
            this.setLow64(var1.getLow64());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Uuid.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 9:
                     this.high64_ = var1.readFixed64();
                     this.bitField0_ |= 1;
                     break;
                  case 17:
                     this.low64_ = var1.readFixed64();
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
      public long getHigh64() {
         return this.high64_;
      }

      public Uuid.Builder setHigh64(long var1) {
         this.high64_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Uuid.Builder clearHigh64() {
         this.bitField0_ &= -2;
         this.high64_ = 0L;
         this.onChanged();
         return this;
      }

      @Override
      public long getLow64() {
         return this.low64_;
      }

      public Uuid.Builder setLow64(long var1) {
         this.low64_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Uuid.Builder clearLow64() {
         this.bitField0_ &= -3;
         this.low64_ = 0L;
         this.onChanged();
         return this;
      }

      public final Uuid.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Uuid.Builder)super.setUnknownFields(var1);
      }

      public final Uuid.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Uuid.Builder)super.mergeUnknownFields(var1);
      }
   }
}
