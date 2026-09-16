package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SourceContext extends GeneratedMessageV3 implements SourceContextOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FILE_NAME_FIELD_NUMBER = 1;
   private volatile Object fileName_ = "";
   private byte memoizedIsInitialized = -1;
   private static final SourceContext DEFAULT_INSTANCE = new SourceContext();
   private static final Parser<SourceContext> PARSER = new AbstractParser<SourceContext>() {
      public SourceContext parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SourceContext.Builder var3 = SourceContext.newBuilder();

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

   private SourceContext(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SourceContext() {
      this.fileName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SourceContext();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SourceContextProto.internal_static_google_protobuf_SourceContext_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SourceContextProto.internal_static_google_protobuf_SourceContext_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SourceContext.class, SourceContext.Builder.class);
   }

   @Override
   public String getFileName() {
      Object var1 = this.fileName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.fileName_ = var3;
      return var3;
   }

   @Override
   public ByteString getFileNameBytes() {
      Object var1 = this.fileName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.fileName_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.fileName_)) {
         GeneratedMessageV3.writeString(var1, 1, this.fileName_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.fileName_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.fileName_);
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

      if (!(var1 instanceof SourceContext)) {
         return super.equals(var1);
      }

      SourceContext var2 = (SourceContext)var1;
      return !this.getFileName().equals(var2.getFileName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getFileName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SourceContext parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SourceContext parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SourceContext parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SourceContext parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SourceContext parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SourceContext parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SourceContext parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SourceContext parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SourceContext parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SourceContext parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SourceContext parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SourceContext parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SourceContext.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SourceContext.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SourceContext.Builder newBuilder(SourceContext var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SourceContext.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SourceContext.Builder() : new SourceContext.Builder().mergeFrom(this);
   }

   protected SourceContext.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SourceContext.Builder(var1);
   }

   public static SourceContext getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SourceContext> parser() {
      return PARSER;
   }

   @Override
   public Parser<SourceContext> getParserForType() {
      return PARSER;
   }

   public SourceContext getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SourceContext.Builder> implements SourceContextOrBuilder {
      private int bitField0_;
      private Object fileName_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SourceContextProto.internal_static_google_protobuf_SourceContext_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SourceContextProto.internal_static_google_protobuf_SourceContext_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SourceContext.class, SourceContext.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SourceContext.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.fileName_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SourceContextProto.internal_static_google_protobuf_SourceContext_descriptor;
      }

      public SourceContext getDefaultInstanceForType() {
         return SourceContext.getDefaultInstance();
      }

      public SourceContext build() {
         SourceContext var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SourceContext buildPartial() {
         SourceContext var1 = new SourceContext(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SourceContext var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.fileName_ = this.fileName_;
         }
      }

      public SourceContext.Builder clone() {
         return (SourceContext.Builder)super.clone();
      }

      public SourceContext.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SourceContext.Builder)super.setField(var1, var2);
      }

      public SourceContext.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SourceContext.Builder)super.clearField(var1);
      }

      public SourceContext.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SourceContext.Builder)super.clearOneof(var1);
      }

      public SourceContext.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SourceContext.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SourceContext.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SourceContext.Builder)super.addRepeatedField(var1, var2);
      }

      public SourceContext.Builder mergeFrom(Message var1) {
         if (var1 instanceof SourceContext) {
            return this.mergeFrom((SourceContext)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SourceContext.Builder mergeFrom(SourceContext var1) {
         if (var1 == SourceContext.getDefaultInstance()) {
            return this;
         }

         if (!var1.getFileName().isEmpty()) {
            this.fileName_ = var1.fileName_;
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

      public SourceContext.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.fileName_ = var1.readStringRequireUtf8();
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
      public String getFileName() {
         Object var1 = this.fileName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.fileName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getFileNameBytes() {
         Object var1 = this.fileName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.fileName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SourceContext.Builder setFileName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.fileName_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SourceContext.Builder clearFileName() {
         this.fileName_ = SourceContext.getDefaultInstance().getFileName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public SourceContext.Builder setFileNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.fileName_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final SourceContext.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SourceContext.Builder)super.setUnknownFields(var1);
      }

      public final SourceContext.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SourceContext.Builder)super.mergeUnknownFields(var1);
      }
   }
}
