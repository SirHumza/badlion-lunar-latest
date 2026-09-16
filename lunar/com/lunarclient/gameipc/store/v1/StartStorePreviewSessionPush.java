package com.lunarclient.gameipc.store.v1;

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

public final class StartStorePreviewSessionPush extends GeneratedMessageV3 implements StartStorePreviewSessionPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int BASKET_IDENT_FIELD_NUMBER = 1;
   private volatile Object basketIdent_ = "";
   public static final int CURRENCY_FIELD_NUMBER = 3;
   private volatile Object currency_ = "";
   public static final int PACKAGE_ID_FIELD_NUMBER = 2;
   private int packageId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final StartStorePreviewSessionPush DEFAULT_INSTANCE = new StartStorePreviewSessionPush();
   private static final Parser<StartStorePreviewSessionPush> PARSER = new AbstractParser<StartStorePreviewSessionPush>() {
      public StartStorePreviewSessionPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartStorePreviewSessionPush.Builder var3 = StartStorePreviewSessionPush.newBuilder();

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

   private StartStorePreviewSessionPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartStorePreviewSessionPush() {
      this.basketIdent_ = "";
      this.currency_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartStorePreviewSessionPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartStorePreviewSessionPush.class, StartStorePreviewSessionPush.Builder.class);
   }

   @Override
   public String getBasketIdent() {
      Object var1 = this.basketIdent_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.basketIdent_ = var3;
      return var3;
   }

   @Override
   public ByteString getBasketIdentBytes() {
      Object var1 = this.basketIdent_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.basketIdent_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCurrency() {
      Object var1 = this.currency_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.currency_ = var3;
      return var3;
   }

   @Override
   public ByteString getCurrencyBytes() {
      Object var1 = this.currency_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.currency_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasPackageId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public int getPackageId() {
      return this.packageId_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.basketIdent_)) {
         GeneratedMessageV3.writeString(var1, 1, this.basketIdent_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeInt32(2, this.packageId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.currency_)) {
         GeneratedMessageV3.writeString(var1, 3, this.currency_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.basketIdent_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.basketIdent_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.packageId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.currency_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.currency_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StartStorePreviewSessionPush)) {
         return super.equals(var1);
      } else {
         StartStorePreviewSessionPush var2 = (StartStorePreviewSessionPush)var1;
         if (!this.getBasketIdent().equals(var2.getBasketIdent())) {
            return false;
         } else if (!this.getCurrency().equals(var2.getCurrency())) {
            return false;
         } else if (this.hasPackageId() != var2.hasPackageId()) {
            return false;
         } else {
            return this.hasPackageId() && this.getPackageId() != var2.getPackageId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getBasketIdent().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getCurrency().hashCode();
      if (this.hasPackageId()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPackageId();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartStorePreviewSessionPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartStorePreviewSessionPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartStorePreviewSessionPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartStorePreviewSessionPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartStorePreviewSessionPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartStorePreviewSessionPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartStorePreviewSessionPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartStorePreviewSessionPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartStorePreviewSessionPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartStorePreviewSessionPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartStorePreviewSessionPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartStorePreviewSessionPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartStorePreviewSessionPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartStorePreviewSessionPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartStorePreviewSessionPush.Builder newBuilder(StartStorePreviewSessionPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartStorePreviewSessionPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartStorePreviewSessionPush.Builder() : new StartStorePreviewSessionPush.Builder().mergeFrom(this);
   }

   protected StartStorePreviewSessionPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartStorePreviewSessionPush.Builder(var1);
   }

   public static StartStorePreviewSessionPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartStorePreviewSessionPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartStorePreviewSessionPush> getParserForType() {
      return PARSER;
   }

   public StartStorePreviewSessionPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartStorePreviewSessionPush.Builder> implements StartStorePreviewSessionPushOrBuilder {
      private int bitField0_;
      private Object basketIdent_ = "";
      private Object currency_ = "";
      private int packageId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartStorePreviewSessionPush.class, StartStorePreviewSessionPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartStorePreviewSessionPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.basketIdent_ = "";
         this.currency_ = "";
         this.packageId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_descriptor;
      }

      public StartStorePreviewSessionPush getDefaultInstanceForType() {
         return StartStorePreviewSessionPush.getDefaultInstance();
      }

      public StartStorePreviewSessionPush build() {
         StartStorePreviewSessionPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartStorePreviewSessionPush buildPartial() {
         StartStorePreviewSessionPush var1 = new StartStorePreviewSessionPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StartStorePreviewSessionPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.basketIdent_ = this.basketIdent_;
         }

         if ((var2 & 2) != 0) {
            var1.currency_ = this.currency_;
         }

         byte var3 = 0;
         if ((var2 & 4) != 0) {
            var1.packageId_ = this.packageId_;
            var3 |= 1;
         }

         StartStorePreviewSessionPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public StartStorePreviewSessionPush.Builder clone() {
         return (StartStorePreviewSessionPush.Builder)super.clone();
      }

      public StartStorePreviewSessionPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartStorePreviewSessionPush.Builder)super.setField(var1, var2);
      }

      public StartStorePreviewSessionPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartStorePreviewSessionPush.Builder)super.clearField(var1);
      }

      public StartStorePreviewSessionPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartStorePreviewSessionPush.Builder)super.clearOneof(var1);
      }

      public StartStorePreviewSessionPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartStorePreviewSessionPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartStorePreviewSessionPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartStorePreviewSessionPush.Builder)super.addRepeatedField(var1, var2);
      }

      public StartStorePreviewSessionPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartStorePreviewSessionPush) {
            return this.mergeFrom((StartStorePreviewSessionPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartStorePreviewSessionPush.Builder mergeFrom(StartStorePreviewSessionPush var1) {
         if (var1 == StartStorePreviewSessionPush.getDefaultInstance()) {
            return this;
         }

         if (!var1.getBasketIdent().isEmpty()) {
            this.basketIdent_ = var1.basketIdent_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getCurrency().isEmpty()) {
            this.currency_ = var1.currency_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.hasPackageId()) {
            this.setPackageId(var1.getPackageId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public StartStorePreviewSessionPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.basketIdent_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.packageId_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 26:
                     this.currency_ = var1.readStringRequireUtf8();
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
      public String getBasketIdent() {
         Object var1 = this.basketIdent_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.basketIdent_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getBasketIdentBytes() {
         Object var1 = this.basketIdent_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.basketIdent_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartStorePreviewSessionPush.Builder setBasketIdent(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.basketIdent_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StartStorePreviewSessionPush.Builder clearBasketIdent() {
         this.basketIdent_ = StartStorePreviewSessionPush.getDefaultInstance().getBasketIdent();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public StartStorePreviewSessionPush.Builder setBasketIdentBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartStorePreviewSessionPush.checkByteStringIsUtf8(var1);
         this.basketIdent_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getCurrency() {
         Object var1 = this.currency_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.currency_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCurrencyBytes() {
         Object var1 = this.currency_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.currency_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartStorePreviewSessionPush.Builder setCurrency(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.currency_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StartStorePreviewSessionPush.Builder clearCurrency() {
         this.currency_ = StartStorePreviewSessionPush.getDefaultInstance().getCurrency();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StartStorePreviewSessionPush.Builder setCurrencyBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartStorePreviewSessionPush.checkByteStringIsUtf8(var1);
         this.currency_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPackageId() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public int getPackageId() {
         return this.packageId_;
      }

      public StartStorePreviewSessionPush.Builder setPackageId(int var1) {
         this.packageId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public StartStorePreviewSessionPush.Builder clearPackageId() {
         this.bitField0_ &= -5;
         this.packageId_ = 0;
         this.onChanged();
         return this;
      }

      public final StartStorePreviewSessionPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartStorePreviewSessionPush.Builder)super.setUnknownFields(var1);
      }

      public final StartStorePreviewSessionPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartStorePreviewSessionPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
