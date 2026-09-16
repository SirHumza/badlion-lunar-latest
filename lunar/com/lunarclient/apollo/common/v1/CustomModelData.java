package com.lunarclient.apollo.common.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class CustomModelData extends GeneratedMessageV3 implements CustomModelDataOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FLOATS_FIELD_NUMBER = 1;
   private Internal.FloatList floats_ = emptyFloatList();
   private int floatsMemoizedSerializedSize = -1;
   public static final int FLAGS_FIELD_NUMBER = 2;
   private Internal.BooleanList flags_ = emptyBooleanList();
   private int flagsMemoizedSerializedSize = -1;
   public static final int STRINGS_FIELD_NUMBER = 3;
   private LazyStringArrayList strings_ = LazyStringArrayList.emptyList();
   public static final int COLORS_FIELD_NUMBER = 4;
   private Internal.IntList colors_ = emptyIntList();
   private int colorsMemoizedSerializedSize = -1;
   private byte memoizedIsInitialized = -1;
   private static final CustomModelData DEFAULT_INSTANCE = new CustomModelData();
   private static final Parser<CustomModelData> PARSER = new AbstractParser<CustomModelData>() {
      public CustomModelData parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CustomModelData.Builder var3 = CustomModelData.newBuilder();

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

   private CustomModelData(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CustomModelData() {
      this.floats_ = emptyFloatList();
      this.flags_ = emptyBooleanList();
      this.strings_ = LazyStringArrayList.emptyList();
      this.colors_ = emptyIntList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CustomModelData();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ItemProto.internal_static_lunarclient_apollo_common_v1_CustomModelData_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ItemProto.internal_static_lunarclient_apollo_common_v1_CustomModelData_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CustomModelData.class, CustomModelData.Builder.class);
   }

   @Override
   public List<Float> getFloatsList() {
      return this.floats_;
   }

   @Override
   public int getFloatsCount() {
      return this.floats_.size();
   }

   @Override
   public float getFloats(int var1) {
      return this.floats_.getFloat(var1);
   }

   @Override
   public List<Boolean> getFlagsList() {
      return this.flags_;
   }

   @Override
   public int getFlagsCount() {
      return this.flags_.size();
   }

   @Override
   public boolean getFlags(int var1) {
      return this.flags_.getBoolean(var1);
   }

   public ProtocolStringList getStringsList() {
      return this.strings_;
   }

   @Override
   public int getStringsCount() {
      return this.strings_.size();
   }

   @Override
   public String getStrings(int var1) {
      return this.strings_.get(var1);
   }

   @Override
   public ByteString getStringsBytes(int var1) {
      return this.strings_.getByteString(var1);
   }

   @Override
   public List<Integer> getColorsList() {
      return this.colors_;
   }

   @Override
   public int getColorsCount() {
      return this.colors_.size();
   }

   @Override
   public int getColors(int var1) {
      return this.colors_.getInt(var1);
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
      this.getSerializedSize();
      if (this.getFloatsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.floatsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.floats_.size(); var2++) {
         var1.writeFloatNoTag(this.floats_.getFloat(var2));
      }

      if (this.getFlagsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.flagsMemoizedSerializedSize);
      }

      for (int var3 = 0; var3 < this.flags_.size(); var3++) {
         var1.writeBoolNoTag(this.flags_.getBoolean(var3));
      }

      for (int var4 = 0; var4 < this.strings_.size(); var4++) {
         GeneratedMessageV3.writeString(var1, 3, this.strings_.getRaw(var4));
      }

      if (this.getColorsList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.colorsMemoizedSerializedSize);
      }

      for (int var5 = 0; var5 < this.colors_.size(); var5++) {
         var1.writeInt32NoTag(this.colors_.getInt(var5));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var4 = 0;
      int var2 = 0;
      var2 = 4 * this.getFloatsList().size();
      var4 += var2;
      if (!this.getFloatsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.floatsMemoizedSerializedSize = var2;
      int var15 = 0;
      var15 = 1 * this.getFlagsList().size();
      var4 += var15;
      if (!this.getFlagsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var15);
      }

      this.flagsMemoizedSerializedSize = var15;
      var15 = 0;

      for (int var3 = 0; var3 < this.strings_.size(); var3++) {
         var15 += computeStringSizeNoTag(this.strings_.getRaw(var3));
      }

      var4 += var15;
      var4 += 1 * this.getStringsList().size();
      var15 = 0;

      for (int var19 = 0; var19 < this.colors_.size(); var19++) {
         var15 += CodedOutputStream.computeInt32SizeNoTag(this.colors_.getInt(var19));
      }

      var4 += var15;
      if (!this.getColorsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeInt32SizeNoTag(var15);
      }

      this.colorsMemoizedSerializedSize = var15;
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CustomModelData)) {
         return super.equals(var1);
      } else {
         CustomModelData var2 = (CustomModelData)var1;
         if (!this.getFloatsList().equals(var2.getFloatsList())) {
            return false;
         } else if (!this.getFlagsList().equals(var2.getFlagsList())) {
            return false;
         } else if (!this.getStringsList().equals(var2.getStringsList())) {
            return false;
         } else {
            return !this.getColorsList().equals(var2.getColorsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getFloatsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getFloatsList().hashCode();
      }

      if (this.getFlagsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getFlagsList().hashCode();
      }

      if (this.getStringsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getStringsList().hashCode();
      }

      if (this.getColorsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getColorsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CustomModelData parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CustomModelData parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CustomModelData parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CustomModelData parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CustomModelData parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CustomModelData parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CustomModelData parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CustomModelData parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CustomModelData parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CustomModelData parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CustomModelData parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CustomModelData parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CustomModelData.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CustomModelData.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CustomModelData.Builder newBuilder(CustomModelData var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CustomModelData.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CustomModelData.Builder() : new CustomModelData.Builder().mergeFrom(this);
   }

   protected CustomModelData.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CustomModelData.Builder(var1);
   }

   public static CustomModelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CustomModelData> parser() {
      return PARSER;
   }

   @Override
   public Parser<CustomModelData> getParserForType() {
      return PARSER;
   }

   public CustomModelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CustomModelData.Builder> implements CustomModelDataOrBuilder {
      private int bitField0_;
      private Internal.FloatList floats_ = CustomModelData.emptyFloatList();
      private Internal.BooleanList flags_ = CustomModelData.emptyBooleanList();
      private LazyStringArrayList strings_ = LazyStringArrayList.emptyList();
      private Internal.IntList colors_ = CustomModelData.emptyIntList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ItemProto.internal_static_lunarclient_apollo_common_v1_CustomModelData_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ItemProto.internal_static_lunarclient_apollo_common_v1_CustomModelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CustomModelData.class, CustomModelData.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CustomModelData.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.floats_ = CustomModelData.emptyFloatList();
         this.flags_ = CustomModelData.emptyBooleanList();
         this.strings_ = LazyStringArrayList.emptyList();
         this.colors_ = CustomModelData.emptyIntList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ItemProto.internal_static_lunarclient_apollo_common_v1_CustomModelData_descriptor;
      }

      public CustomModelData getDefaultInstanceForType() {
         return CustomModelData.getDefaultInstance();
      }

      public CustomModelData build() {
         CustomModelData var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CustomModelData buildPartial() {
         CustomModelData var1 = new CustomModelData(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CustomModelData var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.floats_.makeImmutable();
            var1.floats_ = this.floats_;
         }

         if ((var2 & 2) != 0) {
            this.flags_.makeImmutable();
            var1.flags_ = this.flags_;
         }

         if ((var2 & 4) != 0) {
            this.strings_.makeImmutable();
            var1.strings_ = this.strings_;
         }

         if ((var2 & 8) != 0) {
            this.colors_.makeImmutable();
            var1.colors_ = this.colors_;
         }
      }

      public CustomModelData.Builder clone() {
         return (CustomModelData.Builder)super.clone();
      }

      public CustomModelData.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CustomModelData.Builder)super.setField(var1, var2);
      }

      public CustomModelData.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CustomModelData.Builder)super.clearField(var1);
      }

      public CustomModelData.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CustomModelData.Builder)super.clearOneof(var1);
      }

      public CustomModelData.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CustomModelData.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CustomModelData.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CustomModelData.Builder)super.addRepeatedField(var1, var2);
      }

      public CustomModelData.Builder mergeFrom(Message var1) {
         if (var1 instanceof CustomModelData) {
            return this.mergeFrom((CustomModelData)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CustomModelData.Builder mergeFrom(CustomModelData var1) {
         if (var1 == CustomModelData.getDefaultInstance()) {
            return this;
         }

         if (!var1.floats_.isEmpty()) {
            if (this.floats_.isEmpty()) {
               this.floats_ = var1.floats_;
               this.floats_.makeImmutable();
               this.bitField0_ |= 1;
            } else {
               this.ensureFloatsIsMutable();
               this.floats_.addAll(var1.floats_);
            }

            this.onChanged();
         }

         if (!var1.flags_.isEmpty()) {
            if (this.flags_.isEmpty()) {
               this.flags_ = var1.flags_;
               this.flags_.makeImmutable();
               this.bitField0_ |= 2;
            } else {
               this.ensureFlagsIsMutable();
               this.flags_.addAll(var1.flags_);
            }

            this.onChanged();
         }

         if (!var1.strings_.isEmpty()) {
            if (this.strings_.isEmpty()) {
               this.strings_ = var1.strings_;
               this.bitField0_ |= 4;
            } else {
               this.ensureStringsIsMutable();
               this.strings_.addAll(var1.strings_);
            }

            this.onChanged();
         }

         if (!var1.colors_.isEmpty()) {
            if (this.colors_.isEmpty()) {
               this.colors_ = var1.colors_;
               this.colors_.makeImmutable();
               this.bitField0_ |= 8;
            } else {
               this.ensureColorsIsMutable();
               this.colors_.addAll(var1.colors_);
            }

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

      public CustomModelData.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     int var18 = var1.readRawVarint32();
                     int var20 = var1.pushLimit(var18);
                     int var21 = var18 > 4096 ? 4096 : var18;
                     this.ensureFloatsIsMutable(var21 / 4);

                     while (var1.getBytesUntilLimit() > 0) {
                        this.floats_.addFloat(var1.readFloat());
                     }

                     var1.popLimit(var20);
                     break;
                  case 13:
                     float var17 = var1.readFloat();
                     this.ensureFloatsIsMutable();
                     this.floats_.addFloat(var17);
                     break;
                  case 16:
                     boolean var16 = var1.readBool();
                     this.ensureFlagsIsMutable();
                     this.flags_.addBoolean(var16);
                     break;
                  case 18:
                     int var15 = var1.readRawVarint32();
                     int var19 = var1.pushLimit(var15);
                     int var7 = var15 > 4096 ? 4096 : var15;
                     this.ensureFlagsIsMutable(var7 / 1);

                     while (var1.getBytesUntilLimit() > 0) {
                        this.flags_.addBoolean(var1.readBool());
                     }

                     var1.popLimit(var19);
                     break;
                  case 26:
                     String var14 = var1.readStringRequireUtf8();
                     this.ensureStringsIsMutable();
                     this.strings_.add(var14);
                     break;
                  case 32:
                     int var13 = var1.readInt32();
                     this.ensureColorsIsMutable();
                     this.colors_.addInt(var13);
                     break;
                  case 34:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureColorsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.colors_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensureFloatsIsMutable() {
         if (!this.floats_.isModifiable()) {
            this.floats_ = CustomModelData.makeMutableCopy(this.floats_);
         }

         this.bitField0_ |= 1;
      }

      private void ensureFloatsIsMutable(int var1) {
         if (!this.floats_.isModifiable()) {
            this.floats_ = CustomModelData.makeMutableCopy(this.floats_, var1);
         }

         this.bitField0_ |= 1;
      }

      @Override
      public List<Float> getFloatsList() {
         this.floats_.makeImmutable();
         return this.floats_;
      }

      @Override
      public int getFloatsCount() {
         return this.floats_.size();
      }

      @Override
      public float getFloats(int var1) {
         return this.floats_.getFloat(var1);
      }

      public CustomModelData.Builder setFloats(int var1, float var2) {
         this.ensureFloatsIsMutable();
         this.floats_.setFloat(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addFloats(float var1) {
         this.ensureFloatsIsMutable();
         this.floats_.addFloat(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addAllFloats(Iterable<? extends Float> var1) {
         this.ensureFloatsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.floats_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder clearFloats() {
         this.floats_ = CustomModelData.emptyFloatList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureFlagsIsMutable() {
         if (!this.flags_.isModifiable()) {
            this.flags_ = CustomModelData.makeMutableCopy(this.flags_);
         }

         this.bitField0_ |= 2;
      }

      private void ensureFlagsIsMutable(int var1) {
         if (!this.flags_.isModifiable()) {
            this.flags_ = CustomModelData.makeMutableCopy(this.flags_, var1);
         }

         this.bitField0_ |= 2;
      }

      @Override
      public List<Boolean> getFlagsList() {
         this.flags_.makeImmutable();
         return this.flags_;
      }

      @Override
      public int getFlagsCount() {
         return this.flags_.size();
      }

      @Override
      public boolean getFlags(int var1) {
         return this.flags_.getBoolean(var1);
      }

      public CustomModelData.Builder setFlags(int var1, boolean var2) {
         this.ensureFlagsIsMutable();
         this.flags_.setBoolean(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addFlags(boolean var1) {
         this.ensureFlagsIsMutable();
         this.flags_.addBoolean(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addAllFlags(Iterable<? extends Boolean> var1) {
         this.ensureFlagsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.flags_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder clearFlags() {
         this.flags_ = CustomModelData.emptyBooleanList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureStringsIsMutable() {
         if (!this.strings_.isModifiable()) {
            this.strings_ = new LazyStringArrayList(this.strings_);
         }

         this.bitField0_ |= 4;
      }

      public ProtocolStringList getStringsList() {
         this.strings_.makeImmutable();
         return this.strings_;
      }

      @Override
      public int getStringsCount() {
         return this.strings_.size();
      }

      @Override
      public String getStrings(int var1) {
         return this.strings_.get(var1);
      }

      @Override
      public ByteString getStringsBytes(int var1) {
         return this.strings_.getByteString(var1);
      }

      public CustomModelData.Builder setStrings(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStringsIsMutable();
         this.strings_.set(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addStrings(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStringsIsMutable();
         this.strings_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addAllStrings(Iterable<String> var1) {
         this.ensureStringsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.strings_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder clearStrings() {
         this.strings_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addStringsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         CustomModelData.checkByteStringIsUtf8(var1);
         this.ensureStringsIsMutable();
         this.strings_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      private void ensureColorsIsMutable() {
         if (!this.colors_.isModifiable()) {
            this.colors_ = CustomModelData.makeMutableCopy(this.colors_);
         }

         this.bitField0_ |= 8;
      }

      @Override
      public List<Integer> getColorsList() {
         this.colors_.makeImmutable();
         return this.colors_;
      }

      @Override
      public int getColorsCount() {
         return this.colors_.size();
      }

      @Override
      public int getColors(int var1) {
         return this.colors_.getInt(var1);
      }

      public CustomModelData.Builder setColors(int var1, int var2) {
         this.ensureColorsIsMutable();
         this.colors_.setInt(var1, var2);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addColors(int var1) {
         this.ensureColorsIsMutable();
         this.colors_.addInt(var1);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder addAllColors(Iterable<? extends Integer> var1) {
         this.ensureColorsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.colors_);
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CustomModelData.Builder clearColors() {
         this.colors_ = CustomModelData.emptyIntList();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public final CustomModelData.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CustomModelData.Builder)super.setUnknownFields(var1);
      }

      public final CustomModelData.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CustomModelData.Builder)super.mergeUnknownFields(var1);
      }
   }
}
