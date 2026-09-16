package com.lunarclient.apollo.transfer.v1;

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

public final class PingData extends GeneratedMessageV3 implements PingDataOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_IP_FIELD_NUMBER = 1;
   private volatile Object serverIp_ = "";
   public static final int STATUS_FIELD_NUMBER = 2;
   private int status_ = 0;
   public static final int PING_FIELD_NUMBER = 3;
   private int ping_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final PingData DEFAULT_INSTANCE = new PingData();
   private static final Parser<PingData> PARSER = new AbstractParser<PingData>() {
      public PingData parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PingData.Builder var3 = PingData.newBuilder();

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

   private PingData(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PingData() {
      this.serverIp_ = "";
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PingData();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingData_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingData_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PingData.class, PingData.Builder.class);
   }

   @Override
   public String getServerIp() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerIpBytes() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverIp_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public PingData.Status getStatus() {
      PingData.Status var1 = PingData.Status.forNumber(this.status_);
      return var1 == null ? PingData.Status.UNRECOGNIZED : var1;
   }

   @Override
   public int getPing() {
      return this.ping_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         GeneratedMessageV3.writeString(var1, 1, this.serverIp_);
      }

      if (this.status_ != PingData.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.status_);
      }

      if (this.ping_ != 0) {
         var1.writeInt32(3, this.ping_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.serverIp_);
      }

      if (this.status_ != PingData.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.status_);
      }

      if (this.ping_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.ping_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PingData)) {
         return super.equals(var1);
      } else {
         PingData var2 = (PingData)var1;
         if (!this.getServerIp().equals(var2.getServerIp())) {
            return false;
         } else if (this.status_ != var2.status_) {
            return false;
         } else {
            return this.getPing() != var2.getPing() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getServerIp().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.status_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getPing();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PingData parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingData parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingData parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingData parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingData parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PingData parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PingData parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PingData parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PingData parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PingData parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PingData parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PingData parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PingData.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PingData.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PingData.Builder newBuilder(PingData var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PingData.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PingData.Builder() : new PingData.Builder().mergeFrom(this);
   }

   protected PingData.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PingData.Builder(var1);
   }

   public static PingData getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PingData> parser() {
      return PARSER;
   }

   @Override
   public Parser<PingData> getParserForType() {
      return PARSER;
   }

   public PingData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PingData.Builder> implements PingDataOrBuilder {
      private int bitField0_;
      private Object serverIp_ = "";
      private int status_ = 0;
      private int ping_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingData_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PingData.class, PingData.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PingData.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverIp_ = "";
         this.status_ = 0;
         this.ping_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_PingData_descriptor;
      }

      public PingData getDefaultInstanceForType() {
         return PingData.getDefaultInstance();
      }

      public PingData build() {
         PingData var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PingData buildPartial() {
         PingData var1 = new PingData(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PingData var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.serverIp_ = this.serverIp_;
         }

         if ((var2 & 2) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 4) != 0) {
            var1.ping_ = this.ping_;
         }
      }

      public PingData.Builder clone() {
         return (PingData.Builder)super.clone();
      }

      public PingData.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PingData.Builder)super.setField(var1, var2);
      }

      public PingData.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PingData.Builder)super.clearField(var1);
      }

      public PingData.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PingData.Builder)super.clearOneof(var1);
      }

      public PingData.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PingData.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PingData.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PingData.Builder)super.addRepeatedField(var1, var2);
      }

      public PingData.Builder mergeFrom(Message var1) {
         if (var1 instanceof PingData) {
            return this.mergeFrom((PingData)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PingData.Builder mergeFrom(PingData var1) {
         if (var1 == PingData.getDefaultInstance()) {
            return this;
         }

         if (!var1.getServerIp().isEmpty()) {
            this.serverIp_ = var1.serverIp_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.getPing() != 0) {
            this.setPing(var1.getPing());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PingData.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.serverIp_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.ping_ = var1.readInt32();
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
      public String getServerIp() {
         Object var1 = this.serverIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerIpBytes() {
         Object var1 = this.serverIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public PingData.Builder setServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PingData.Builder clearServerIp() {
         this.serverIp_ = PingData.getDefaultInstance().getServerIp();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public PingData.Builder setServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PingData.checkByteStringIsUtf8(var1);
         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getStatusValue() {
         return this.status_;
      }

      public PingData.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public PingData.Status getStatus() {
         PingData.Status var1 = PingData.Status.forNumber(this.status_);
         return var1 == null ? PingData.Status.UNRECOGNIZED : var1;
      }

      public PingData.Builder setStatus(PingData.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public PingData.Builder clearStatus() {
         this.bitField0_ &= -3;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getPing() {
         return this.ping_;
      }

      public PingData.Builder setPing(int var1) {
         this.ping_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PingData.Builder clearPing() {
         this.bitField0_ &= -5;
         this.ping_ = 0;
         this.onChanged();
         return this;
      }

      public final PingData.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PingData.Builder)super.setUnknownFields(var1);
      }

      public final PingData.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PingData.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_SUCCESS(1),
      STATUS_TIMED_OUT(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_SUCCESS_VALUE = 1;
      public static final int STATUS_TIMED_OUT_VALUE = 2;
      private static final Internal.EnumLiteMap<PingData.Status> internalValueMap = new Internal.EnumLiteMap<PingData.Status>() {
         public PingData.Status findValueByNumber(int var1) {
            return PingData.Status.forNumber(var1);
         }
      };
      private static final PingData.Status[] VALUES = values();
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
      public static PingData.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static PingData.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_SUCCESS;
            case 2:
               return STATUS_TIMED_OUT;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<PingData.Status> internalGetValueMap() {
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
         return PingData.getDescriptor().getEnumTypes().get(0);
      }

      public static PingData.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
