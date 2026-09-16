package com.lunarclient.common.v1;

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

public final class RadioStation extends GeneratedMessageV3 implements RadioStationOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int DESCRIPTION_FIELD_NUMBER = 2;
   private volatile Object description_ = "";
   public static final int STATION_ID_FIELD_NUMBER = 3;
   private volatile Object stationId_ = "";
   public static final int IMAGE_URL_FIELD_NUMBER = 4;
   private volatile Object imageUrl_ = "";
   private byte memoizedIsInitialized = -1;
   private static final RadioStation DEFAULT_INSTANCE = new RadioStation();
   private static final Parser<RadioStation> PARSER = new AbstractParser<RadioStation>() {
      public RadioStation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RadioStation.Builder var3 = RadioStation.newBuilder();

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

   private RadioStation(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RadioStation() {
      this.name_ = "";
      this.description_ = "";
      this.stationId_ = "";
      this.imageUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RadioStation();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return RadioProto.internal_static_lunarclient_common_v1_RadioStation_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return RadioProto.internal_static_lunarclient_common_v1_RadioStation_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RadioStation.class, RadioStation.Builder.class);
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
   public String getDescription() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.description_ = var3;
      return var3;
   }

   @Override
   public ByteString getDescriptionBytes() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.description_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getStationId() {
      Object var1 = this.stationId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.stationId_ = var3;
      return var3;
   }

   @Override
   public ByteString getStationIdBytes() {
      Object var1 = this.stationId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.stationId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getImageUrl() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.imageUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getImageUrlBytes() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.imageUrl_ = var2;
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

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         GeneratedMessageV3.writeString(var1, 2, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.stationId_)) {
         GeneratedMessageV3.writeString(var1, 3, this.stationId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         GeneratedMessageV3.writeString(var1, 4, this.imageUrl_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.description_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.stationId_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.stationId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.imageUrl_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RadioStation)) {
         return super.equals(var1);
      } else {
         RadioStation var2 = (RadioStation)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getDescription().equals(var2.getDescription())) {
            return false;
         } else if (!this.getStationId().equals(var2.getStationId())) {
            return false;
         } else {
            return !this.getImageUrl().equals(var2.getImageUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getDescription().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getStationId().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getImageUrl().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RadioStation parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioStation parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioStation parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioStation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioStation parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RadioStation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RadioStation parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioStation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RadioStation parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RadioStation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RadioStation parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RadioStation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RadioStation.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RadioStation.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RadioStation.Builder newBuilder(RadioStation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RadioStation.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RadioStation.Builder() : new RadioStation.Builder().mergeFrom(this);
   }

   protected RadioStation.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RadioStation.Builder(var1);
   }

   public static RadioStation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RadioStation> parser() {
      return PARSER;
   }

   @Override
   public Parser<RadioStation> getParserForType() {
      return PARSER;
   }

   public RadioStation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RadioStation.Builder> implements RadioStationOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private Object description_ = "";
      private Object stationId_ = "";
      private Object imageUrl_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioStation_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioStation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RadioStation.class, RadioStation.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RadioStation.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         this.description_ = "";
         this.stationId_ = "";
         this.imageUrl_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return RadioProto.internal_static_lunarclient_common_v1_RadioStation_descriptor;
      }

      public RadioStation getDefaultInstanceForType() {
         return RadioStation.getDefaultInstance();
      }

      public RadioStation build() {
         RadioStation var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RadioStation buildPartial() {
         RadioStation var1 = new RadioStation(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RadioStation var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 2) != 0) {
            var1.description_ = this.description_;
         }

         if ((var2 & 4) != 0) {
            var1.stationId_ = this.stationId_;
         }

         if ((var2 & 8) != 0) {
            var1.imageUrl_ = this.imageUrl_;
         }
      }

      public RadioStation.Builder clone() {
         return (RadioStation.Builder)super.clone();
      }

      public RadioStation.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioStation.Builder)super.setField(var1, var2);
      }

      public RadioStation.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RadioStation.Builder)super.clearField(var1);
      }

      public RadioStation.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RadioStation.Builder)super.clearOneof(var1);
      }

      public RadioStation.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RadioStation.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RadioStation.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RadioStation.Builder)super.addRepeatedField(var1, var2);
      }

      public RadioStation.Builder mergeFrom(Message var1) {
         if (var1 instanceof RadioStation) {
            return this.mergeFrom((RadioStation)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RadioStation.Builder mergeFrom(RadioStation var1) {
         if (var1 == RadioStation.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getDescription().isEmpty()) {
            this.description_ = var1.description_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getStationId().isEmpty()) {
            this.stationId_ = var1.stationId_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getImageUrl().isEmpty()) {
            this.imageUrl_ = var1.imageUrl_;
            this.bitField0_ |= 8;
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

      public RadioStation.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.description_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.stationId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.imageUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
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

      public RadioStation.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder clearName() {
         this.name_ = RadioStation.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioStation.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getDescription() {
         Object var1 = this.description_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.description_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDescriptionBytes() {
         Object var1 = this.description_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.description_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RadioStation.Builder setDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder clearDescription() {
         this.description_ = RadioStation.getDefaultInstance().getDescription();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder setDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioStation.checkByteStringIsUtf8(var1);
         this.description_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getStationId() {
         Object var1 = this.stationId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.stationId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getStationIdBytes() {
         Object var1 = this.stationId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.stationId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RadioStation.Builder setStationId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder clearStationId() {
         this.stationId_ = RadioStation.getDefaultInstance().getStationId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder setStationIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioStation.checkByteStringIsUtf8(var1);
         this.stationId_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getImageUrl() {
         Object var1 = this.imageUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.imageUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getImageUrlBytes() {
         Object var1 = this.imageUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.imageUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RadioStation.Builder setImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.imageUrl_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder clearImageUrl() {
         this.imageUrl_ = RadioStation.getDefaultInstance().getImageUrl();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public RadioStation.Builder setImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RadioStation.checkByteStringIsUtf8(var1);
         this.imageUrl_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public final RadioStation.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RadioStation.Builder)super.setUnknownFields(var1);
      }

      public final RadioStation.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RadioStation.Builder)super.mergeUnknownFields(var1);
      }
   }
}
