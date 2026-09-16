package com.lunarclient.websocket.wrapped.v1;

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

public final class CounterUpdate extends GeneratedMessageV3 implements CounterUpdateOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COUNTER_FIELD_NUMBER = 1;
   private volatile Object counter_ = "";
   public static final int DELTA_FIELD_NUMBER = 2;
   private int delta_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final CounterUpdate DEFAULT_INSTANCE = new CounterUpdate();
   private static final Parser<CounterUpdate> PARSER = new AbstractParser<CounterUpdate>() {
      public CounterUpdate parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CounterUpdate.Builder var3 = CounterUpdate.newBuilder();

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

   private CounterUpdate(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CounterUpdate() {
      this.counter_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CounterUpdate();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_wrapped_v1_CounterUpdate_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_wrapped_v1_CounterUpdate_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CounterUpdate.class, CounterUpdate.Builder.class);
   }

   @Override
   public String getCounter() {
      Object var1 = this.counter_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.counter_ = var3;
      return var3;
   }

   @Override
   public ByteString getCounterBytes() {
      Object var1 = this.counter_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.counter_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getDelta() {
      return this.delta_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.counter_)) {
         GeneratedMessageV3.writeString(var1, 1, this.counter_);
      }

      if (this.delta_ != 0) {
         var1.writeInt32(2, this.delta_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.counter_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.counter_);
      }

      if (this.delta_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.delta_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CounterUpdate)) {
         return super.equals(var1);
      } else {
         CounterUpdate var2 = (CounterUpdate)var1;
         if (!this.getCounter().equals(var2.getCounter())) {
            return false;
         } else {
            return this.getDelta() != var2.getDelta() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getCounter().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getDelta();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CounterUpdate parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CounterUpdate parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CounterUpdate parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CounterUpdate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CounterUpdate parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CounterUpdate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CounterUpdate parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CounterUpdate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CounterUpdate parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CounterUpdate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CounterUpdate parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CounterUpdate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CounterUpdate.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CounterUpdate.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CounterUpdate.Builder newBuilder(CounterUpdate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CounterUpdate.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CounterUpdate.Builder() : new CounterUpdate.Builder().mergeFrom(this);
   }

   protected CounterUpdate.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CounterUpdate.Builder(var1);
   }

   public static CounterUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CounterUpdate> parser() {
      return PARSER;
   }

   @Override
   public Parser<CounterUpdate> getParserForType() {
      return PARSER;
   }

   public CounterUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CounterUpdate.Builder> implements CounterUpdateOrBuilder {
      private int bitField0_;
      private Object counter_ = "";
      private int delta_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_wrapped_v1_CounterUpdate_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_wrapped_v1_CounterUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CounterUpdate.class, CounterUpdate.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CounterUpdate.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.counter_ = "";
         this.delta_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_wrapped_v1_CounterUpdate_descriptor;
      }

      public CounterUpdate getDefaultInstanceForType() {
         return CounterUpdate.getDefaultInstance();
      }

      public CounterUpdate build() {
         CounterUpdate var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CounterUpdate buildPartial() {
         CounterUpdate var1 = new CounterUpdate(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CounterUpdate var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.counter_ = this.counter_;
         }

         if ((var2 & 2) != 0) {
            var1.delta_ = this.delta_;
         }
      }

      public CounterUpdate.Builder clone() {
         return (CounterUpdate.Builder)super.clone();
      }

      public CounterUpdate.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CounterUpdate.Builder)super.setField(var1, var2);
      }

      public CounterUpdate.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CounterUpdate.Builder)super.clearField(var1);
      }

      public CounterUpdate.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CounterUpdate.Builder)super.clearOneof(var1);
      }

      public CounterUpdate.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CounterUpdate.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CounterUpdate.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CounterUpdate.Builder)super.addRepeatedField(var1, var2);
      }

      public CounterUpdate.Builder mergeFrom(Message var1) {
         if (var1 instanceof CounterUpdate) {
            return this.mergeFrom((CounterUpdate)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CounterUpdate.Builder mergeFrom(CounterUpdate var1) {
         if (var1 == CounterUpdate.getDefaultInstance()) {
            return this;
         }

         if (!var1.getCounter().isEmpty()) {
            this.counter_ = var1.counter_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getDelta() != 0) {
            this.setDelta(var1.getDelta());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CounterUpdate.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.counter_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.delta_ = var1.readInt32();
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
      public String getCounter() {
         Object var1 = this.counter_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.counter_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCounterBytes() {
         Object var1 = this.counter_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.counter_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public CounterUpdate.Builder setCounter(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.counter_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CounterUpdate.Builder clearCounter() {
         this.counter_ = CounterUpdate.getDefaultInstance().getCounter();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public CounterUpdate.Builder setCounterBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         CounterUpdate.checkByteStringIsUtf8(var1);
         this.counter_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getDelta() {
         return this.delta_;
      }

      public CounterUpdate.Builder setDelta(int var1) {
         this.delta_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CounterUpdate.Builder clearDelta() {
         this.bitField0_ &= -3;
         this.delta_ = 0;
         this.onChanged();
         return this;
      }

      public final CounterUpdate.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CounterUpdate.Builder)super.setUnknownFields(var1);
      }

      public final CounterUpdate.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CounterUpdate.Builder)super.mergeUnknownFields(var1);
      }
   }
}
