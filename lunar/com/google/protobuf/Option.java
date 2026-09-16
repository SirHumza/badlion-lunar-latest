package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Option extends GeneratedMessageV3 implements OptionOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int VALUE_FIELD_NUMBER = 2;
   private Any value_;
   private byte memoizedIsInitialized = -1;
   private static final Option DEFAULT_INSTANCE = new Option();
   private static final Parser<Option> PARSER = new AbstractParser<Option>() {
      public Option parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Option.Builder var3 = Option.newBuilder();

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

   private Option(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Option() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Option();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return TypeProto.internal_static_google_protobuf_Option_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return TypeProto.internal_static_google_protobuf_Option_fieldAccessorTable.ensureFieldAccessorsInitialized(Option.class, Option.Builder.class);
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
   public boolean hasValue() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Any getValue() {
      return this.value_ == null ? Any.getDefaultInstance() : this.value_;
   }

   @Override
   public AnyOrBuilder getValueOrBuilder() {
      return this.value_ == null ? Any.getDefaultInstance() : this.value_;
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

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getValue());
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

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getValue());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Option)) {
         return super.equals(var1);
      } else {
         Option var2 = (Option)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasValue() != var2.hasValue()) {
            return false;
         } else {
            return this.hasValue() && !this.getValue().equals(var2.getValue()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getName().hashCode();
      if (this.hasValue()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getValue().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Option parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Option parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Option parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Option parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Option parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Option parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Option parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Option parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Option parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Option parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Option parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Option parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Option.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Option.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Option.Builder newBuilder(Option var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Option.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Option.Builder() : new Option.Builder().mergeFrom(this);
   }

   protected Option.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Option.Builder(var1);
   }

   public static Option getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Option> parser() {
      return PARSER;
   }

   @Override
   public Parser<Option> getParserForType() {
      return PARSER;
   }

   public Option getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Option.Builder> implements OptionOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private Any value_;
      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> valueBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return TypeProto.internal_static_google_protobuf_Option_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TypeProto.internal_static_google_protobuf_Option_fieldAccessorTable.ensureFieldAccessorsInitialized(Option.class, Option.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            this.getValueFieldBuilder();
         }
      }

      public Option.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         this.value_ = null;
         if (this.valueBuilder_ != null) {
            this.valueBuilder_.dispose();
            this.valueBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return TypeProto.internal_static_google_protobuf_Option_descriptor;
      }

      public Option getDefaultInstanceForType() {
         return Option.getDefaultInstance();
      }

      public Option build() {
         Option var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Option buildPartial() {
         Option var1 = new Option(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Option var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.value_ = this.valueBuilder_ == null ? this.value_ : this.valueBuilder_.build();
            var3 |= 1;
         }

         var1.bitField0_ |= var3;
      }

      public Option.Builder clone() {
         return (Option.Builder)super.clone();
      }

      public Option.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Option.Builder)super.setField(var1, var2);
      }

      public Option.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Option.Builder)super.clearField(var1);
      }

      public Option.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Option.Builder)super.clearOneof(var1);
      }

      public Option.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Option.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Option.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Option.Builder)super.addRepeatedField(var1, var2);
      }

      public Option.Builder mergeFrom(Message var1) {
         if (var1 instanceof Option) {
            return this.mergeFrom((Option)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Option.Builder mergeFrom(Option var1) {
         if (var1 == Option.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasValue()) {
            this.mergeValue(var1.getValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Option.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 18:
                     var1.readMessage(this.getValueFieldBuilder().getBuilder(), var2);
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

      public Option.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Option.Builder clearName() {
         this.name_ = Option.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Option.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasValue() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Any getValue() {
         if (this.valueBuilder_ == null) {
            return this.value_ == null ? Any.getDefaultInstance() : this.value_;
         } else {
            return this.valueBuilder_.getMessage();
         }
      }

      public Option.Builder setValue(Any var1) {
         if (this.valueBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.value_ = var1;
         } else {
            this.valueBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Option.Builder setValue(Any.Builder var1) {
         if (this.valueBuilder_ == null) {
            this.value_ = var1.build();
         } else {
            this.valueBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Option.Builder mergeValue(Any var1) {
         if (this.valueBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.value_ != null && this.value_ != Any.getDefaultInstance()) {
               this.getValueBuilder().mergeFrom(var1);
            } else {
               this.value_ = var1;
            }
         } else {
            this.valueBuilder_.mergeFrom(var1);
         }

         if (this.value_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public Option.Builder clearValue() {
         this.bitField0_ &= -3;
         this.value_ = null;
         if (this.valueBuilder_ != null) {
            this.valueBuilder_.dispose();
            this.valueBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Any.Builder getValueBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getValueFieldBuilder().getBuilder();
      }

      @Override
      public AnyOrBuilder getValueOrBuilder() {
         if (this.valueBuilder_ != null) {
            return this.valueBuilder_.getMessageOrBuilder();
         } else {
            return this.value_ == null ? Any.getDefaultInstance() : this.value_;
         }
      }

      private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getValueFieldBuilder() {
         if (this.valueBuilder_ == null) {
            this.valueBuilder_ = new SingleFieldBuilderV3<>(this.getValue(), this.getParentForChildren(), this.isClean());
            this.value_ = null;
         }

         return this.valueBuilder_;
      }

      public final Option.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Option.Builder)super.setUnknownFields(var1);
      }

      public final Option.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Option.Builder)super.mergeUnknownFields(var1);
      }
   }
}
