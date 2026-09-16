package com.lunarclient.common.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MinecraftVersion extends GeneratedMessageV3 implements MinecraftVersionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ENUM_FIELD_NUMBER = 1;
   private volatile Object enum_ = "";
   public static final int TYPE_FIELD_NUMBER = 2;
   private int type_ = 0;
   public static final int ID_FIELD_NUMBER = 3;
   private volatile Object id_ = "";
   private byte memoizedIsInitialized = -1;
   private static final MinecraftVersion DEFAULT_INSTANCE = new MinecraftVersion();
   private static final Parser<MinecraftVersion> PARSER = new AbstractParser<MinecraftVersion>() {
      public MinecraftVersion parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MinecraftVersion.Builder var3 = MinecraftVersion.newBuilder();

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

   private MinecraftVersion(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MinecraftVersion() {
      this.enum_ = "";
      this.type_ = 0;
      this.id_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MinecraftVersion();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return VersionProto.internal_static_lunarclient_common_v1_MinecraftVersion_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return VersionProto.internal_static_lunarclient_common_v1_MinecraftVersion_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MinecraftVersion.class, MinecraftVersion.Builder.class);
   }

   @Override
   public String getEnum() {
      Object var1 = this.enum_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.enum_ = var3;
      return var3;
   }

   @Override
   public ByteString getEnumBytes() {
      Object var1 = this.enum_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.enum_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public MinecraftVersion.MinecraftVersionType getType() {
      MinecraftVersion.MinecraftVersionType var1 = MinecraftVersion.MinecraftVersionType.forNumber(this.type_);
      return var1 == null ? MinecraftVersion.MinecraftVersionType.UNRECOGNIZED : var1;
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.enum_)) {
         GeneratedMessageV3.writeString(var1, 1, this.enum_);
      }

      if (this.type_ != MinecraftVersion.MinecraftVersionType.MINECRAFT_VERSION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.type_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 3, this.id_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.enum_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.enum_);
      }

      if (this.type_ != MinecraftVersion.MinecraftVersionType.MINECRAFT_VERSION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.type_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.id_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MinecraftVersion)) {
         return super.equals(var1);
      } else {
         MinecraftVersion var2 = (MinecraftVersion)var1;
         if (!this.getEnum().equals(var2.getEnum())) {
            return false;
         } else if (this.type_ != var2.type_) {
            return false;
         } else {
            return !this.getId().equals(var2.getId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getEnum().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.type_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MinecraftVersion parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftVersion parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftVersion parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftVersion parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftVersion parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MinecraftVersion parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MinecraftVersion parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MinecraftVersion parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MinecraftVersion parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MinecraftVersion parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MinecraftVersion parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MinecraftVersion parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MinecraftVersion.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MinecraftVersion.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MinecraftVersion.Builder newBuilder(MinecraftVersion var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MinecraftVersion.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MinecraftVersion.Builder() : new MinecraftVersion.Builder().mergeFrom(this);
   }

   protected MinecraftVersion.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MinecraftVersion.Builder(var1);
   }

   public static MinecraftVersion getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MinecraftVersion> parser() {
      return PARSER;
   }

   @Override
   public Parser<MinecraftVersion> getParserForType() {
      return PARSER;
   }

   public MinecraftVersion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MinecraftVersion.Builder> implements MinecraftVersionOrBuilder {
      private int bitField0_;
      private Object enum_ = "";
      private int type_ = 0;
      private Object id_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return VersionProto.internal_static_lunarclient_common_v1_MinecraftVersion_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return VersionProto.internal_static_lunarclient_common_v1_MinecraftVersion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MinecraftVersion.class, MinecraftVersion.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MinecraftVersion.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.enum_ = "";
         this.type_ = 0;
         this.id_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return VersionProto.internal_static_lunarclient_common_v1_MinecraftVersion_descriptor;
      }

      public MinecraftVersion getDefaultInstanceForType() {
         return MinecraftVersion.getDefaultInstance();
      }

      public MinecraftVersion build() {
         MinecraftVersion var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MinecraftVersion buildPartial() {
         MinecraftVersion var1 = new MinecraftVersion(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MinecraftVersion var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.enum_ = this.enum_;
         }

         if ((var2 & 2) != 0) {
            var1.type_ = this.type_;
         }

         if ((var2 & 4) != 0) {
            var1.id_ = this.id_;
         }
      }

      public MinecraftVersion.Builder clone() {
         return (MinecraftVersion.Builder)super.clone();
      }

      public MinecraftVersion.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MinecraftVersion.Builder)super.setField(var1, var2);
      }

      public MinecraftVersion.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MinecraftVersion.Builder)super.clearField(var1);
      }

      public MinecraftVersion.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MinecraftVersion.Builder)super.clearOneof(var1);
      }

      public MinecraftVersion.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MinecraftVersion.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MinecraftVersion.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MinecraftVersion.Builder)super.addRepeatedField(var1, var2);
      }

      public MinecraftVersion.Builder mergeFrom(Message var1) {
         if (var1 instanceof MinecraftVersion) {
            return this.mergeFrom((MinecraftVersion)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MinecraftVersion.Builder mergeFrom(MinecraftVersion var1) {
         if (var1 == MinecraftVersion.getDefaultInstance()) {
            return this;
         }

         if (!var1.getEnum().isEmpty()) {
            this.enum_ = var1.enum_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 4;
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

      public MinecraftVersion.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.enum_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.id_ = var1.readStringRequireUtf8();
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
      public String getEnum() {
         Object var1 = this.enum_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.enum_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEnumBytes() {
         Object var1 = this.enum_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.enum_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MinecraftVersion.Builder setEnum(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.enum_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder clearEnum() {
         this.enum_ = MinecraftVersion.getDefaultInstance().getEnum();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder setEnumBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         MinecraftVersion.checkByteStringIsUtf8(var1);
         this.enum_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public MinecraftVersion.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public MinecraftVersion.MinecraftVersionType getType() {
         MinecraftVersion.MinecraftVersionType var1 = MinecraftVersion.MinecraftVersionType.forNumber(this.type_);
         return var1 == null ? MinecraftVersion.MinecraftVersionType.UNRECOGNIZED : var1;
      }

      public MinecraftVersion.Builder setType(MinecraftVersion.MinecraftVersionType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder clearType() {
         this.bitField0_ &= -3;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MinecraftVersion.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder clearId() {
         this.id_ = MinecraftVersion.getDefaultInstance().getId();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         MinecraftVersion.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final MinecraftVersion.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MinecraftVersion.Builder)super.setUnknownFields(var1);
      }

      public final MinecraftVersion.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MinecraftVersion.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum MinecraftVersionType implements ProtocolMessageEnum {
      MINECRAFT_VERSION_TYPE_UNSPECIFIED(0),
      MINECRAFT_VERSION_TYPE_RELEASE(1),
      MINECRAFT_VERSION_TYPE_SNAPSHOT(2),
      MINECRAFT_VERSION_TYPE_OLD_BETA(3),
      MINECRAFT_VERSION_TYPE_OLD_ALPHA(4),
      UNRECOGNIZED(-1);

      public static final int MINECRAFT_VERSION_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int MINECRAFT_VERSION_TYPE_RELEASE_VALUE = 1;
      public static final int MINECRAFT_VERSION_TYPE_SNAPSHOT_VALUE = 2;
      public static final int MINECRAFT_VERSION_TYPE_OLD_BETA_VALUE = 3;
      public static final int MINECRAFT_VERSION_TYPE_OLD_ALPHA_VALUE = 4;
      private static final Internal.EnumLiteMap<MinecraftVersion.MinecraftVersionType> internalValueMap = new Internal.EnumLiteMap<MinecraftVersion.MinecraftVersionType>() {
         public MinecraftVersion.MinecraftVersionType findValueByNumber(int var1) {
            return MinecraftVersion.MinecraftVersionType.forNumber(var1);
         }
      };
      private static final MinecraftVersion.MinecraftVersionType[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static MinecraftVersion.MinecraftVersionType valueOf(int var0) {
         return forNumber(var0);
      }

      public static MinecraftVersion.MinecraftVersionType forNumber(int var0) {
         switch (var0) {
            case 0:
               return MINECRAFT_VERSION_TYPE_UNSPECIFIED;
            case 1:
               return MINECRAFT_VERSION_TYPE_RELEASE;
            case 2:
               return MINECRAFT_VERSION_TYPE_SNAPSHOT;
            case 3:
               return MINECRAFT_VERSION_TYPE_OLD_BETA;
            case 4:
               return MINECRAFT_VERSION_TYPE_OLD_ALPHA;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<MinecraftVersion.MinecraftVersionType> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return MinecraftVersion.getDescriptor().getEnumTypes().get(0);
      }

      public static MinecraftVersion.MinecraftVersionType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      MinecraftVersionType(int var3) {
         this.value = var3;
      }
   }
}
