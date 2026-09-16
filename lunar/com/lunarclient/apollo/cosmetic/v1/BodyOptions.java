package com.lunarclient.apollo.cosmetic.v1;

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

public final class BodyOptions extends GeneratedMessageV3 implements BodyOptionsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SHOW_OVER_CHESTPLATE_FIELD_NUMBER = 1;
   private boolean showOverChestplate_ = false;
   public static final int SHOW_OVER_LEGGINGS_FIELD_NUMBER = 2;
   private boolean showOverLeggings_ = false;
   public static final int SHOW_OVER_BOOTS_FIELD_NUMBER = 3;
   private boolean showOverBoots_ = false;
   private byte memoizedIsInitialized = -1;
   private static final BodyOptions DEFAULT_INSTANCE = new BodyOptions();
   private static final Parser<BodyOptions> PARSER = new AbstractParser<BodyOptions>() {
      public BodyOptions parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BodyOptions.Builder var3 = BodyOptions.newBuilder();

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

   private BodyOptions(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BodyOptions() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BodyOptions();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BodyOptions.class, BodyOptions.Builder.class);
   }

   @Override
   public boolean getShowOverChestplate() {
      return this.showOverChestplate_;
   }

   @Override
   public boolean getShowOverLeggings() {
      return this.showOverLeggings_;
   }

   @Override
   public boolean getShowOverBoots() {
      return this.showOverBoots_;
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
      if (this.showOverChestplate_) {
         var1.writeBool(1, this.showOverChestplate_);
      }

      if (this.showOverLeggings_) {
         var1.writeBool(2, this.showOverLeggings_);
      }

      if (this.showOverBoots_) {
         var1.writeBool(3, this.showOverBoots_);
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
      if (this.showOverChestplate_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.showOverChestplate_);
      }

      if (this.showOverLeggings_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.showOverLeggings_);
      }

      if (this.showOverBoots_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.showOverBoots_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BodyOptions)) {
         return super.equals(var1);
      } else {
         BodyOptions var2 = (BodyOptions)var1;
         if (this.getShowOverChestplate() != var2.getShowOverChestplate()) {
            return false;
         } else if (this.getShowOverLeggings() != var2.getShowOverLeggings()) {
            return false;
         } else {
            return this.getShowOverBoots() != var2.getShowOverBoots() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverChestplate());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverLeggings());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverBoots());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BodyOptions parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BodyOptions parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BodyOptions parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BodyOptions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BodyOptions parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BodyOptions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BodyOptions parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BodyOptions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BodyOptions parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BodyOptions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BodyOptions parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BodyOptions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BodyOptions.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BodyOptions.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BodyOptions.Builder newBuilder(BodyOptions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BodyOptions.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BodyOptions.Builder() : new BodyOptions.Builder().mergeFrom(this);
   }

   protected BodyOptions.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BodyOptions.Builder(var1);
   }

   public static BodyOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BodyOptions> parser() {
      return PARSER;
   }

   @Override
   public Parser<BodyOptions> getParserForType() {
      return PARSER;
   }

   public BodyOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<BodyOptions.Builder> implements BodyOptionsOrBuilder {
      private int bitField0_;
      private boolean showOverChestplate_;
      private boolean showOverLeggings_;
      private boolean showOverBoots_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BodyOptions.class, BodyOptions.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public BodyOptions.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.showOverChestplate_ = false;
         this.showOverLeggings_ = false;
         this.showOverBoots_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_BodyOptions_descriptor;
      }

      public BodyOptions getDefaultInstanceForType() {
         return BodyOptions.getDefaultInstance();
      }

      public BodyOptions build() {
         BodyOptions var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BodyOptions buildPartial() {
         BodyOptions var1 = new BodyOptions(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BodyOptions var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.showOverChestplate_ = this.showOverChestplate_;
         }

         if ((var2 & 2) != 0) {
            var1.showOverLeggings_ = this.showOverLeggings_;
         }

         if ((var2 & 4) != 0) {
            var1.showOverBoots_ = this.showOverBoots_;
         }
      }

      public BodyOptions.Builder clone() {
         return (BodyOptions.Builder)super.clone();
      }

      public BodyOptions.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BodyOptions.Builder)super.setField(var1, var2);
      }

      public BodyOptions.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BodyOptions.Builder)super.clearField(var1);
      }

      public BodyOptions.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BodyOptions.Builder)super.clearOneof(var1);
      }

      public BodyOptions.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BodyOptions.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BodyOptions.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BodyOptions.Builder)super.addRepeatedField(var1, var2);
      }

      public BodyOptions.Builder mergeFrom(Message var1) {
         if (var1 instanceof BodyOptions) {
            return this.mergeFrom((BodyOptions)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BodyOptions.Builder mergeFrom(BodyOptions var1) {
         if (var1 == BodyOptions.getDefaultInstance()) {
            return this;
         }

         if (var1.getShowOverChestplate()) {
            this.setShowOverChestplate(var1.getShowOverChestplate());
         }

         if (var1.getShowOverLeggings()) {
            this.setShowOverLeggings(var1.getShowOverLeggings());
         }

         if (var1.getShowOverBoots()) {
            this.setShowOverBoots(var1.getShowOverBoots());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BodyOptions.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.showOverChestplate_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.showOverLeggings_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.showOverBoots_ = var1.readBool();
                     this.bitField0_ |= 4;
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
      public boolean getShowOverChestplate() {
         return this.showOverChestplate_;
      }

      public BodyOptions.Builder setShowOverChestplate(boolean var1) {
         this.showOverChestplate_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BodyOptions.Builder clearShowOverChestplate() {
         this.bitField0_ &= -2;
         this.showOverChestplate_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverLeggings() {
         return this.showOverLeggings_;
      }

      public BodyOptions.Builder setShowOverLeggings(boolean var1) {
         this.showOverLeggings_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public BodyOptions.Builder clearShowOverLeggings() {
         this.bitField0_ &= -3;
         this.showOverLeggings_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverBoots() {
         return this.showOverBoots_;
      }

      public BodyOptions.Builder setShowOverBoots(boolean var1) {
         this.showOverBoots_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public BodyOptions.Builder clearShowOverBoots() {
         this.bitField0_ &= -5;
         this.showOverBoots_ = false;
         this.onChanged();
         return this;
      }

      public final BodyOptions.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BodyOptions.Builder)super.setUnknownFields(var1);
      }

      public final BodyOptions.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BodyOptions.Builder)super.mergeUnknownFields(var1);
      }
   }
}
