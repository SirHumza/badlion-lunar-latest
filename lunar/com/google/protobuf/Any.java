package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Any extends GeneratedMessageV3 implements AnyOrBuilder {
   private static final long serialVersionUID = 0L;
   private volatile Message cachedUnpackValue;
   public static final int TYPE_URL_FIELD_NUMBER = 1;
   private volatile Object typeUrl_ = "";
   public static final int VALUE_FIELD_NUMBER = 2;
   private ByteString value_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final Any DEFAULT_INSTANCE = new Any();
   private static final Parser<Any> PARSER = new AbstractParser<Any>() {
      public Any parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Any.Builder var3 = Any.newBuilder();

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

   private Any(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Any() {
      this.typeUrl_ = "";
      this.value_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Any();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return AnyProto.internal_static_google_protobuf_Any_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return AnyProto.internal_static_google_protobuf_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(Any.class, Any.Builder.class);
   }

   private static String getTypeUrl(String var0, Descriptors.Descriptor var1) {
      return var0.endsWith("/") ? var0 + var1.getFullName() : var0 + "/" + var1.getFullName();
   }

   private static String getTypeNameFromTypeUrl(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 == -1 ? "" : var0.substring(var1 + 1);
   }

   public static <T extends Message> Any pack(T var0) {
      return newBuilder().setTypeUrl(getTypeUrl("type.googleapis.com", var0.getDescriptorForType())).setValue(var0.toByteString()).build();
   }

   public static <T extends Message> Any pack(T var0, String var1) {
      return newBuilder().setTypeUrl(getTypeUrl(var1, var0.getDescriptorForType())).setValue(var0.toByteString()).build();
   }

   public <T extends Message> boolean is(Class<T> var1) {
      Message var2 = Internal.getDefaultInstance(var1);
      return getTypeNameFromTypeUrl(this.getTypeUrl()).equals(var2.getDescriptorForType().getFullName());
   }

   public boolean isSameTypeAs(Message var1) {
      return getTypeNameFromTypeUrl(this.getTypeUrl()).equals(var1.getDescriptorForType().getFullName());
   }

   public <T extends Message> T unpack(Class<T> var1) {
      boolean var2 = false;
      if (this.cachedUnpackValue != null) {
         if (this.cachedUnpackValue.getClass() == var1) {
            return (T)this.cachedUnpackValue;
         }

         var2 = true;
      }

      if (!var2 && this.is(var1)) {
         Message var3 = Internal.getDefaultInstance(var1);
         Message var4 = var3.getParserForType().parseFrom(this.getValue());
         this.cachedUnpackValue = var4;
         return (T)var4;
      } else {
         throw new InvalidProtocolBufferException("Type of the Any message does not match the given class.");
      }
   }

   public <T extends Message> T unpackSameTypeAs(T var1) {
      boolean var2 = false;
      if (this.cachedUnpackValue != null) {
         if (this.cachedUnpackValue.getClass() == var1.getClass()) {
            return (T)this.cachedUnpackValue;
         }

         var2 = true;
      }

      if (!var2 && this.isSameTypeAs(var1)) {
         Message var3 = var1.getParserForType().parseFrom(this.getValue());
         this.cachedUnpackValue = var3;
         return (T)var3;
      } else {
         throw new InvalidProtocolBufferException("Type of the Any message does not match the given exemplar.");
      }
   }

   @Override
   public String getTypeUrl() {
      Object var1 = this.typeUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.typeUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getTypeUrlBytes() {
      Object var1 = this.typeUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.typeUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public ByteString getValue() {
      return this.value_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.typeUrl_)) {
         GeneratedMessageV3.writeString(var1, 1, this.typeUrl_);
      }

      if (!this.value_.isEmpty()) {
         var1.writeBytes(2, this.value_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.typeUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.typeUrl_);
      }

      if (!this.value_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(2, this.value_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Any)) {
         return super.equals(var1);
      } else {
         Any var2 = (Any)var1;
         if (!this.getTypeUrl().equals(var2.getTypeUrl())) {
            return false;
         } else {
            return !this.getValue().equals(var2.getValue()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getTypeUrl().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getValue().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Any parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Any parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Any parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Any parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Any parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Any parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Any parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Any parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Any parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Any parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Any parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Any parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Any.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Any.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Any.Builder newBuilder(Any var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Any.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Any.Builder() : new Any.Builder().mergeFrom(this);
   }

   protected Any.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Any.Builder(var1);
   }

   public static Any getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Any> parser() {
      return PARSER;
   }

   @Override
   public Parser<Any> getParserForType() {
      return PARSER;
   }

   public Any getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Any.Builder> implements AnyOrBuilder {
      private int bitField0_;
      private Object typeUrl_ = "";
      private ByteString value_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return AnyProto.internal_static_google_protobuf_Any_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AnyProto.internal_static_google_protobuf_Any_fieldAccessorTable.ensureFieldAccessorsInitialized(Any.class, Any.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Any.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.typeUrl_ = "";
         this.value_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return AnyProto.internal_static_google_protobuf_Any_descriptor;
      }

      public Any getDefaultInstanceForType() {
         return Any.getDefaultInstance();
      }

      public Any build() {
         Any var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Any buildPartial() {
         Any var1 = new Any(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Any var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.typeUrl_ = this.typeUrl_;
         }

         if ((var2 & 2) != 0) {
            var1.value_ = this.value_;
         }
      }

      public Any.Builder clone() {
         return (Any.Builder)super.clone();
      }

      public Any.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Any.Builder)super.setField(var1, var2);
      }

      public Any.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Any.Builder)super.clearField(var1);
      }

      public Any.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Any.Builder)super.clearOneof(var1);
      }

      public Any.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Any.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Any.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Any.Builder)super.addRepeatedField(var1, var2);
      }

      public Any.Builder mergeFrom(Message var1) {
         if (var1 instanceof Any) {
            return this.mergeFrom((Any)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Any.Builder mergeFrom(Any var1) {
         if (var1 == Any.getDefaultInstance()) {
            return this;
         }

         if (!var1.getTypeUrl().isEmpty()) {
            this.typeUrl_ = var1.typeUrl_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getValue() != ByteString.EMPTY) {
            this.setValue(var1.getValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Any.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.typeUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.value_ = var1.readBytes();
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
      public String getTypeUrl() {
         Object var1 = this.typeUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.typeUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTypeUrlBytes() {
         Object var1 = this.typeUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.typeUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Any.Builder setTypeUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.typeUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Any.Builder clearTypeUrl() {
         this.typeUrl_ = Any.getDefaultInstance().getTypeUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Any.Builder setTypeUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.typeUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getValue() {
         return this.value_;
      }

      public Any.Builder setValue(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.value_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Any.Builder clearValue() {
         this.bitField0_ &= -3;
         this.value_ = Any.getDefaultInstance().getValue();
         this.onChanged();
         return this;
      }

      public final Any.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Any.Builder)super.setUnknownFields(var1);
      }

      public final Any.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Any.Builder)super.mergeUnknownFields(var1);
      }
   }
}
