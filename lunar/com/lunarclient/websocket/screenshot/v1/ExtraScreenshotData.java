package com.lunarclient.websocket.screenshot.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import com.lunarclient.common.v1.LunarClientVersion;
import com.lunarclient.common.v1.LunarClientVersionOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ExtraScreenshotData extends GeneratedMessageV3 implements ExtraScreenshotDataOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MC_VERSION_FIELD_NUMBER = 1;
   private MinecraftVersion mcVersion_;
   public static final int LUNAR_VERSION_FIELD_NUMBER = 2;
   private LunarClientVersion lunarVersion_;
   public static final int LOCATION_FIELD_NUMBER = 3;
   private Location location_;
   private byte memoizedIsInitialized = -1;
   private static final ExtraScreenshotData DEFAULT_INSTANCE = new ExtraScreenshotData();
   private static final Parser<ExtraScreenshotData> PARSER = new AbstractParser<ExtraScreenshotData>() {
      public ExtraScreenshotData parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ExtraScreenshotData.Builder var3 = ExtraScreenshotData.newBuilder();

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

   private ExtraScreenshotData(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ExtraScreenshotData() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ExtraScreenshotData();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ExtraScreenshotData.class, ExtraScreenshotData.Builder.class);
   }

   @Override
   public boolean hasMcVersion() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public MinecraftVersion getMcVersion() {
      return this.mcVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.mcVersion_;
   }

   @Override
   public MinecraftVersionOrBuilder getMcVersionOrBuilder() {
      return this.mcVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.mcVersion_;
   }

   @Override
   public boolean hasLunarVersion() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public LunarClientVersion getLunarVersion() {
      return this.lunarVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarVersion_;
   }

   @Override
   public LunarClientVersionOrBuilder getLunarVersionOrBuilder() {
      return this.lunarVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarVersion_;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getMcVersion());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getLunarVersion());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getLocation());
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getMcVersion());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLunarVersion());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLocation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ExtraScreenshotData)) {
         return super.equals(var1);
      } else {
         ExtraScreenshotData var2 = (ExtraScreenshotData)var1;
         if (this.hasMcVersion() != var2.hasMcVersion()) {
            return false;
         } else if (this.hasMcVersion() && !this.getMcVersion().equals(var2.getMcVersion())) {
            return false;
         } else if (this.hasLunarVersion() != var2.hasLunarVersion()) {
            return false;
         } else if (this.hasLunarVersion() && !this.getLunarVersion().equals(var2.getLunarVersion())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else {
            return this.hasLocation() && !this.getLocation().equals(var2.getLocation()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasMcVersion()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMcVersion().hashCode();
      }

      if (this.hasLunarVersion()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLunarVersion().hashCode();
      }

      if (this.hasLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ExtraScreenshotData parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ExtraScreenshotData parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ExtraScreenshotData parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ExtraScreenshotData parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ExtraScreenshotData parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ExtraScreenshotData parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ExtraScreenshotData parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExtraScreenshotData parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExtraScreenshotData parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExtraScreenshotData parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExtraScreenshotData parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExtraScreenshotData parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ExtraScreenshotData.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ExtraScreenshotData.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExtraScreenshotData.Builder newBuilder(ExtraScreenshotData var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ExtraScreenshotData.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ExtraScreenshotData.Builder() : new ExtraScreenshotData.Builder().mergeFrom(this);
   }

   protected ExtraScreenshotData.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ExtraScreenshotData.Builder(var1);
   }

   public static ExtraScreenshotData getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ExtraScreenshotData> parser() {
      return PARSER;
   }

   @Override
   public Parser<ExtraScreenshotData> getParserForType() {
      return PARSER;
   }

   public ExtraScreenshotData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ExtraScreenshotData.Builder> implements ExtraScreenshotDataOrBuilder {
      private int bitField0_;
      private MinecraftVersion mcVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> mcVersionBuilder_;
      private LunarClientVersion lunarVersion_;
      private SingleFieldBuilderV3<LunarClientVersion, LunarClientVersion.Builder, LunarClientVersionOrBuilder> lunarVersionBuilder_;
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ExtraScreenshotData.class, ExtraScreenshotData.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ExtraScreenshotData.alwaysUseFieldBuilders) {
            this.getMcVersionFieldBuilder();
            this.getLunarVersionFieldBuilder();
            this.getLocationFieldBuilder();
         }
      }

      public ExtraScreenshotData.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.mcVersion_ = null;
         if (this.mcVersionBuilder_ != null) {
            this.mcVersionBuilder_.dispose();
            this.mcVersionBuilder_ = null;
         }

         this.lunarVersion_ = null;
         if (this.lunarVersionBuilder_ != null) {
            this.lunarVersionBuilder_.dispose();
            this.lunarVersionBuilder_ = null;
         }

         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ExtraScreenshotData_descriptor;
      }

      public ExtraScreenshotData getDefaultInstanceForType() {
         return ExtraScreenshotData.getDefaultInstance();
      }

      public ExtraScreenshotData build() {
         ExtraScreenshotData var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ExtraScreenshotData buildPartial() {
         ExtraScreenshotData var1 = new ExtraScreenshotData(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ExtraScreenshotData var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.mcVersion_ = this.mcVersionBuilder_ == null ? this.mcVersion_ : this.mcVersionBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.lunarVersion_ = this.lunarVersionBuilder_ == null ? this.lunarVersion_ : this.lunarVersionBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 4;
         }

         ExtraScreenshotData var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ExtraScreenshotData.Builder clone() {
         return (ExtraScreenshotData.Builder)super.clone();
      }

      public ExtraScreenshotData.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ExtraScreenshotData.Builder)super.setField(var1, var2);
      }

      public ExtraScreenshotData.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ExtraScreenshotData.Builder)super.clearField(var1);
      }

      public ExtraScreenshotData.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ExtraScreenshotData.Builder)super.clearOneof(var1);
      }

      public ExtraScreenshotData.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ExtraScreenshotData.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ExtraScreenshotData.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ExtraScreenshotData.Builder)super.addRepeatedField(var1, var2);
      }

      public ExtraScreenshotData.Builder mergeFrom(Message var1) {
         if (var1 instanceof ExtraScreenshotData) {
            return this.mergeFrom((ExtraScreenshotData)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ExtraScreenshotData.Builder mergeFrom(ExtraScreenshotData var1) {
         if (var1 == ExtraScreenshotData.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMcVersion()) {
            this.mergeMcVersion(var1.getMcVersion());
         }

         if (var1.hasLunarVersion()) {
            this.mergeLunarVersion(var1.getLunarVersion());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ExtraScreenshotData.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMcVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLunarVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
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
      public boolean hasMcVersion() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public MinecraftVersion getMcVersion() {
         if (this.mcVersionBuilder_ == null) {
            return this.mcVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.mcVersion_;
         } else {
            return this.mcVersionBuilder_.getMessage();
         }
      }

      public ExtraScreenshotData.Builder setMcVersion(MinecraftVersion var1) {
         if (this.mcVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.mcVersion_ = var1;
         } else {
            this.mcVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ExtraScreenshotData.Builder setMcVersion(MinecraftVersion.Builder var1) {
         if (this.mcVersionBuilder_ == null) {
            this.mcVersion_ = var1.build();
         } else {
            this.mcVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ExtraScreenshotData.Builder mergeMcVersion(MinecraftVersion var1) {
         if (this.mcVersionBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.mcVersion_ != null && this.mcVersion_ != MinecraftVersion.getDefaultInstance()) {
               this.getMcVersionBuilder().mergeFrom(var1);
            } else {
               this.mcVersion_ = var1;
            }
         } else {
            this.mcVersionBuilder_.mergeFrom(var1);
         }

         if (this.mcVersion_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ExtraScreenshotData.Builder clearMcVersion() {
         this.bitField0_ &= -2;
         this.mcVersion_ = null;
         if (this.mcVersionBuilder_ != null) {
            this.mcVersionBuilder_.dispose();
            this.mcVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getMcVersionBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getMcVersionFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftVersionOrBuilder getMcVersionOrBuilder() {
         if (this.mcVersionBuilder_ != null) {
            return this.mcVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.mcVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.mcVersion_;
         }
      }

      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getMcVersionFieldBuilder() {
         if (this.mcVersionBuilder_ == null) {
            this.mcVersionBuilder_ = new SingleFieldBuilderV3<>(this.getMcVersion(), this.getParentForChildren(), this.isClean());
            this.mcVersion_ = null;
         }

         return this.mcVersionBuilder_;
      }

      @Override
      public boolean hasLunarVersion() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public LunarClientVersion getLunarVersion() {
         if (this.lunarVersionBuilder_ == null) {
            return this.lunarVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarVersion_;
         } else {
            return this.lunarVersionBuilder_.getMessage();
         }
      }

      public ExtraScreenshotData.Builder setLunarVersion(LunarClientVersion var1) {
         if (this.lunarVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lunarVersion_ = var1;
         } else {
            this.lunarVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ExtraScreenshotData.Builder setLunarVersion(LunarClientVersion.Builder var1) {
         if (this.lunarVersionBuilder_ == null) {
            this.lunarVersion_ = var1.build();
         } else {
            this.lunarVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ExtraScreenshotData.Builder mergeLunarVersion(LunarClientVersion var1) {
         if (this.lunarVersionBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.lunarVersion_ != null && this.lunarVersion_ != LunarClientVersion.getDefaultInstance()) {
               this.getLunarVersionBuilder().mergeFrom(var1);
            } else {
               this.lunarVersion_ = var1;
            }
         } else {
            this.lunarVersionBuilder_.mergeFrom(var1);
         }

         if (this.lunarVersion_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ExtraScreenshotData.Builder clearLunarVersion() {
         this.bitField0_ &= -3;
         this.lunarVersion_ = null;
         if (this.lunarVersionBuilder_ != null) {
            this.lunarVersionBuilder_.dispose();
            this.lunarVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public LunarClientVersion.Builder getLunarVersionBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLunarVersionFieldBuilder().getBuilder();
      }

      @Override
      public LunarClientVersionOrBuilder getLunarVersionOrBuilder() {
         if (this.lunarVersionBuilder_ != null) {
            return this.lunarVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.lunarVersion_ == null ? LunarClientVersion.getDefaultInstance() : this.lunarVersion_;
         }
      }

      private SingleFieldBuilderV3<LunarClientVersion, LunarClientVersion.Builder, LunarClientVersionOrBuilder> getLunarVersionFieldBuilder() {
         if (this.lunarVersionBuilder_ == null) {
            this.lunarVersionBuilder_ = new SingleFieldBuilderV3<>(this.getLunarVersion(), this.getParentForChildren(), this.isClean());
            this.lunarVersion_ = null;
         }

         return this.lunarVersionBuilder_;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public ExtraScreenshotData.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ExtraScreenshotData.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ExtraScreenshotData.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ExtraScreenshotData.Builder clearLocation() {
         this.bitField0_ &= -5;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      public final ExtraScreenshotData.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ExtraScreenshotData.Builder)super.setUnknownFields(var1);
      }

      public final ExtraScreenshotData.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ExtraScreenshotData.Builder)super.mergeUnknownFields(var1);
      }
   }
}
