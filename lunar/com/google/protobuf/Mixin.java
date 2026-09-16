package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Mixin extends GeneratedMessageV3 implements MixinOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int ROOT_FIELD_NUMBER = 2;
   private volatile Object root_ = "";
   private byte memoizedIsInitialized = -1;
   private static final Mixin DEFAULT_INSTANCE = new Mixin();
   private static final Parser<Mixin> PARSER = new AbstractParser<Mixin>() {
      public Mixin parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Mixin.Builder var3 = Mixin.newBuilder();

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

   private Mixin(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Mixin() {
      this.name_ = "";
      this.root_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Mixin();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ApiProto.internal_static_google_protobuf_Mixin_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ApiProto.internal_static_google_protobuf_Mixin_fieldAccessorTable.ensureFieldAccessorsInitialized(Mixin.class, Mixin.Builder.class);
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
   public String getRoot() {
      Object var1 = this.root_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.root_ = var3;
      return var3;
   }

   @Override
   public ByteString getRootBytes() {
      Object var1 = this.root_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.root_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.root_)) {
         GeneratedMessageV3.writeString(var1, 2, this.root_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.root_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.root_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Mixin)) {
         return super.equals(var1);
      } else {
         Mixin var2 = (Mixin)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else {
            return !this.getRoot().equals(var2.getRoot()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getRoot().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Mixin parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Mixin parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Mixin parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Mixin parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Mixin parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Mixin parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Mixin parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Mixin parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Mixin parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Mixin parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Mixin parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Mixin parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Mixin.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Mixin.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Mixin.Builder newBuilder(Mixin var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Mixin.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Mixin.Builder() : new Mixin.Builder().mergeFrom(this);
   }

   protected Mixin.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Mixin.Builder(var1);
   }

   public static Mixin getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Mixin> parser() {
      return PARSER;
   }

   @Override
   public Parser<Mixin> getParserForType() {
      return PARSER;
   }

   public Mixin getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Mixin.Builder> implements MixinOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private Object root_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ApiProto.internal_static_google_protobuf_Mixin_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ApiProto.internal_static_google_protobuf_Mixin_fieldAccessorTable.ensureFieldAccessorsInitialized(Mixin.class, Mixin.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Mixin.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         this.root_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ApiProto.internal_static_google_protobuf_Mixin_descriptor;
      }

      public Mixin getDefaultInstanceForType() {
         return Mixin.getDefaultInstance();
      }

      public Mixin build() {
         Mixin var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Mixin buildPartial() {
         Mixin var1 = new Mixin(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Mixin var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 2) != 0) {
            var1.root_ = this.root_;
         }
      }

      public Mixin.Builder clone() {
         return (Mixin.Builder)super.clone();
      }

      public Mixin.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Mixin.Builder)super.setField(var1, var2);
      }

      public Mixin.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Mixin.Builder)super.clearField(var1);
      }

      public Mixin.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Mixin.Builder)super.clearOneof(var1);
      }

      public Mixin.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Mixin.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Mixin.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Mixin.Builder)super.addRepeatedField(var1, var2);
      }

      public Mixin.Builder mergeFrom(Message var1) {
         if (var1 instanceof Mixin) {
            return this.mergeFrom((Mixin)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Mixin.Builder mergeFrom(Mixin var1) {
         if (var1 == Mixin.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getRoot().isEmpty()) {
            this.root_ = var1.root_;
            this.bitField0_ |= 2;
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

      public Mixin.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.root_ = var1.readStringRequireUtf8();
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

      public Mixin.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Mixin.Builder clearName() {
         this.name_ = Mixin.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public Mixin.Builder setNameBytes(ByteString var1) {
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
      public String getRoot() {
         Object var1 = this.root_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.root_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRootBytes() {
         Object var1 = this.root_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.root_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Mixin.Builder setRoot(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.root_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Mixin.Builder clearRoot() {
         this.root_ = Mixin.getDefaultInstance().getRoot();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public Mixin.Builder setRootBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AbstractMessageLite.checkByteStringIsUtf8(var1);
         this.root_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final Mixin.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Mixin.Builder)super.setUnknownFields(var1);
      }

      public final Mixin.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Mixin.Builder)super.mergeUnknownFields(var1);
      }
   }
}
