package com.lunarclient.websocket.handshake.v1;

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

public final class InstalledMod extends GeneratedMessageV3 implements InstalledModOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int VERSION_FIELD_NUMBER = 3;
   private volatile Object version_ = "";
   public static final int TYPE_FIELD_NUMBER = 4;
   private int type_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final InstalledMod DEFAULT_INSTANCE = new InstalledMod();
   private static final Parser<InstalledMod> PARSER = new AbstractParser<InstalledMod>() {
      public InstalledMod parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InstalledMod.Builder var3 = InstalledMod.newBuilder();

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

   private InstalledMod(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InstalledMod() {
      this.id_ = "";
      this.name_ = "";
      this.version_ = "";
      this.type_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InstalledMod();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_InstalledMod_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_handshake_v1_InstalledMod_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InstalledMod.class, InstalledMod.Builder.class);
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
   public String getVersion() {
      Object var1 = this.version_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.version_ = var3;
      return var3;
   }

   @Override
   public ByteString getVersionBytes() {
      Object var1 = this.version_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.version_ = var2;
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
   public InstalledMod.Type getType() {
      InstalledMod.Type var1 = InstalledMod.Type.forNumber(this.type_);
      return var1 == null ? InstalledMod.Type.UNRECOGNIZED : var1;
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
         GeneratedMessageV3.writeString(var1, 3, this.version_);
      }

      if (this.type_ != InstalledMod.Type.TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(4, this.type_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.version_);
      }

      if (this.type_ != InstalledMod.Type.TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(4, this.type_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InstalledMod)) {
         return super.equals(var1);
      } else {
         InstalledMod var2 = (InstalledMod)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getVersion().equals(var2.getVersion())) {
            return false;
         } else {
            return this.type_ != var2.type_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getVersion().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.type_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InstalledMod parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledMod parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledMod parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledMod parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledMod parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InstalledMod parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InstalledMod parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InstalledMod parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InstalledMod parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InstalledMod parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InstalledMod parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InstalledMod parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InstalledMod.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InstalledMod.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InstalledMod.Builder newBuilder(InstalledMod var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InstalledMod.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InstalledMod.Builder() : new InstalledMod.Builder().mergeFrom(this);
   }

   protected InstalledMod.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InstalledMod.Builder(var1);
   }

   public static InstalledMod getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InstalledMod> parser() {
      return PARSER;
   }

   @Override
   public Parser<InstalledMod> getParserForType() {
      return PARSER;
   }

   public InstalledMod getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InstalledMod.Builder> implements InstalledModOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private Object version_ = "";
      private int type_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_InstalledMod_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_InstalledMod_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InstalledMod.class, InstalledMod.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InstalledMod.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.version_ = "";
         this.type_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_handshake_v1_InstalledMod_descriptor;
      }

      public InstalledMod getDefaultInstanceForType() {
         return InstalledMod.getDefaultInstance();
      }

      public InstalledMod build() {
         InstalledMod var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InstalledMod buildPartial() {
         InstalledMod var1 = new InstalledMod(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InstalledMod var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.version_ = this.version_;
         }

         if ((var2 & 8) != 0) {
            var1.type_ = this.type_;
         }
      }

      public InstalledMod.Builder clone() {
         return (InstalledMod.Builder)super.clone();
      }

      public InstalledMod.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InstalledMod.Builder)super.setField(var1, var2);
      }

      public InstalledMod.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InstalledMod.Builder)super.clearField(var1);
      }

      public InstalledMod.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InstalledMod.Builder)super.clearOneof(var1);
      }

      public InstalledMod.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InstalledMod.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InstalledMod.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InstalledMod.Builder)super.addRepeatedField(var1, var2);
      }

      public InstalledMod.Builder mergeFrom(Message var1) {
         if (var1 instanceof InstalledMod) {
            return this.mergeFrom((InstalledMod)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InstalledMod.Builder mergeFrom(InstalledMod var1) {
         if (var1 == InstalledMod.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getVersion().isEmpty()) {
            this.version_ = var1.version_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InstalledMod.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.version_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.type_ = var1.readEnum();
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

      public InstalledMod.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder clearId() {
         this.id_ = InstalledMod.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InstalledMod.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
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

      public InstalledMod.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder clearName() {
         this.name_ = InstalledMod.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InstalledMod.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getVersion() {
         Object var1 = this.version_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.version_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getVersionBytes() {
         Object var1 = this.version_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.version_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public InstalledMod.Builder setVersion(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.version_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder clearVersion() {
         this.version_ = InstalledMod.getDefaultInstance().getVersion();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder setVersionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         InstalledMod.checkByteStringIsUtf8(var1);
         this.version_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public InstalledMod.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public InstalledMod.Type getType() {
         InstalledMod.Type var1 = InstalledMod.Type.forNumber(this.type_);
         return var1 == null ? InstalledMod.Type.UNRECOGNIZED : var1;
      }

      public InstalledMod.Builder setType(InstalledMod.Type var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 8;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InstalledMod.Builder clearType() {
         this.bitField0_ &= -9;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      public final InstalledMod.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InstalledMod.Builder)super.setUnknownFields(var1);
      }

      public final InstalledMod.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InstalledMod.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Type implements ProtocolMessageEnum {
      TYPE_UNSPECIFIED(0),
      TYPE_FABRIC_INTERNAL(1),
      TYPE_FABRIC_EXTERNAL(2),
      TYPE_FORGE_INTERNAL(3),
      TYPE_FORGE_EXTERNAL(4),
      UNRECOGNIZED(-1);

      public static final int TYPE_UNSPECIFIED_VALUE = 0;
      public static final int TYPE_FABRIC_INTERNAL_VALUE = 1;
      public static final int TYPE_FABRIC_EXTERNAL_VALUE = 2;
      public static final int TYPE_FORGE_INTERNAL_VALUE = 3;
      public static final int TYPE_FORGE_EXTERNAL_VALUE = 4;
      private static final Internal.EnumLiteMap<InstalledMod.Type> internalValueMap = new Internal.EnumLiteMap<InstalledMod.Type>() {
         public InstalledMod.Type findValueByNumber(int var1) {
            return InstalledMod.Type.forNumber(var1);
         }
      };
      private static final InstalledMod.Type[] VALUES = values();
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
      public static InstalledMod.Type valueOf(int var0) {
         return forNumber(var0);
      }

      public static InstalledMod.Type forNumber(int var0) {
         switch (var0) {
            case 0:
               return TYPE_UNSPECIFIED;
            case 1:
               return TYPE_FABRIC_INTERNAL;
            case 2:
               return TYPE_FABRIC_EXTERNAL;
            case 3:
               return TYPE_FORGE_INTERNAL;
            case 4:
               return TYPE_FORGE_EXTERNAL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<InstalledMod.Type> internalGetValueMap() {
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
         return InstalledMod.getDescriptor().getEnumTypes().get(0);
      }

      public static InstalledMod.Type valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Type(int var3) {
         this.value = var3;
      }
   }
}
