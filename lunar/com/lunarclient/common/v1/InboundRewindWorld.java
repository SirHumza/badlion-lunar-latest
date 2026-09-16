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

public final class InboundRewindWorld extends GeneratedMessageV3 implements InboundRewindWorldOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final InboundRewindWorld DEFAULT_INSTANCE = new InboundRewindWorld();
   private static final Parser<InboundRewindWorld> PARSER = new AbstractParser<InboundRewindWorld>() {
      public InboundRewindWorld parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InboundRewindWorld.Builder var3 = InboundRewindWorld.newBuilder();

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

   private InboundRewindWorld(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InboundRewindWorld() {
      this.type_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InboundRewindWorld();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundRewindWorld_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InboundLocationProto.internal_static_lunarclient_common_v1_InboundRewindWorld_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InboundRewindWorld.class, InboundRewindWorld.Builder.class);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public InboundRewindWorld.RewindWorldType getType() {
      InboundRewindWorld.RewindWorldType var1 = InboundRewindWorld.RewindWorldType.forNumber(this.type_);
      return var1 == null ? InboundRewindWorld.RewindWorldType.UNRECOGNIZED : var1;
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
      if (this.type_ != InboundRewindWorld.RewindWorldType.REWIND_WORLD_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.type_);
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
      if (this.type_ != InboundRewindWorld.RewindWorldType.REWIND_WORLD_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.type_);
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

      if (!(var1 instanceof InboundRewindWorld)) {
         return super.equals(var1);
      }

      InboundRewindWorld var2 = (InboundRewindWorld)var1;
      return this.type_ != var2.type_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.type_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InboundRewindWorld parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRewindWorld parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRewindWorld parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRewindWorld parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRewindWorld parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InboundRewindWorld parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InboundRewindWorld parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRewindWorld parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InboundRewindWorld parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InboundRewindWorld parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InboundRewindWorld parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InboundRewindWorld parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InboundRewindWorld.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InboundRewindWorld.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InboundRewindWorld.Builder newBuilder(InboundRewindWorld var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InboundRewindWorld.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InboundRewindWorld.Builder() : new InboundRewindWorld.Builder().mergeFrom(this);
   }

   protected InboundRewindWorld.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InboundRewindWorld.Builder(var1);
   }

   public static InboundRewindWorld getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InboundRewindWorld> parser() {
      return PARSER;
   }

   @Override
   public Parser<InboundRewindWorld> getParserForType() {
      return PARSER;
   }

   public InboundRewindWorld getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InboundRewindWorld.Builder> implements InboundRewindWorldOrBuilder {
      private int bitField0_;
      private int type_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundRewindWorld_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundRewindWorld_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InboundRewindWorld.class, InboundRewindWorld.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InboundRewindWorld.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.type_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InboundLocationProto.internal_static_lunarclient_common_v1_InboundRewindWorld_descriptor;
      }

      public InboundRewindWorld getDefaultInstanceForType() {
         return InboundRewindWorld.getDefaultInstance();
      }

      public InboundRewindWorld build() {
         InboundRewindWorld var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InboundRewindWorld buildPartial() {
         InboundRewindWorld var1 = new InboundRewindWorld(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InboundRewindWorld var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.type_ = this.type_;
         }
      }

      public InboundRewindWorld.Builder clone() {
         return (InboundRewindWorld.Builder)super.clone();
      }

      public InboundRewindWorld.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRewindWorld.Builder)super.setField(var1, var2);
      }

      public InboundRewindWorld.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InboundRewindWorld.Builder)super.clearField(var1);
      }

      public InboundRewindWorld.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InboundRewindWorld.Builder)super.clearOneof(var1);
      }

      public InboundRewindWorld.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InboundRewindWorld.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InboundRewindWorld.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InboundRewindWorld.Builder)super.addRepeatedField(var1, var2);
      }

      public InboundRewindWorld.Builder mergeFrom(Message var1) {
         if (var1 instanceof InboundRewindWorld) {
            return this.mergeFrom((InboundRewindWorld)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InboundRewindWorld.Builder mergeFrom(InboundRewindWorld var1) {
         if (var1 == InboundRewindWorld.getDefaultInstance()) {
            return this;
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

      public InboundRewindWorld.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.type_ = var1.readEnum();
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
      public int getTypeValue() {
         return this.type_;
      }

      public InboundRewindWorld.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public InboundRewindWorld.RewindWorldType getType() {
         InboundRewindWorld.RewindWorldType var1 = InboundRewindWorld.RewindWorldType.forNumber(this.type_);
         return var1 == null ? InboundRewindWorld.RewindWorldType.UNRECOGNIZED : var1;
      }

      public InboundRewindWorld.Builder setType(InboundRewindWorld.RewindWorldType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InboundRewindWorld.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      public final InboundRewindWorld.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InboundRewindWorld.Builder)super.setUnknownFields(var1);
      }

      public final InboundRewindWorld.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InboundRewindWorld.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum RewindWorldType implements ProtocolMessageEnum {
      REWIND_WORLD_TYPE_UNSPECIFIED(0),
      REWIND_WORLD_TYPE_PROJECT(1),
      REWIND_WORLD_TYPE_PREVIEW(2),
      UNRECOGNIZED(-1);

      public static final int REWIND_WORLD_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int REWIND_WORLD_TYPE_PROJECT_VALUE = 1;
      public static final int REWIND_WORLD_TYPE_PREVIEW_VALUE = 2;
      private static final Internal.EnumLiteMap<InboundRewindWorld.RewindWorldType> internalValueMap = new Internal.EnumLiteMap<InboundRewindWorld.RewindWorldType>() {
         public InboundRewindWorld.RewindWorldType findValueByNumber(int var1) {
            return InboundRewindWorld.RewindWorldType.forNumber(var1);
         }
      };
      private static final InboundRewindWorld.RewindWorldType[] VALUES = values();
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
      public static InboundRewindWorld.RewindWorldType valueOf(int var0) {
         return forNumber(var0);
      }

      public static InboundRewindWorld.RewindWorldType forNumber(int var0) {
         switch (var0) {
            case 0:
               return REWIND_WORLD_TYPE_UNSPECIFIED;
            case 1:
               return REWIND_WORLD_TYPE_PROJECT;
            case 2:
               return REWIND_WORLD_TYPE_PREVIEW;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<InboundRewindWorld.RewindWorldType> internalGetValueMap() {
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
         return InboundRewindWorld.getDescriptor().getEnumTypes().get(0);
      }

      public static InboundRewindWorld.RewindWorldType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      RewindWorldType(int var3) {
         this.value = var3;
      }
   }
}
