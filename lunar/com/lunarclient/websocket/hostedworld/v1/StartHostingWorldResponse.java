package com.lunarclient.websocket.hostedworld.v1;

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

public final class StartHostingWorldResponse extends GeneratedMessageV3 implements StartHostingWorldResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int JOIN_IP_FIELD_NUMBER = 2;
   private volatile Object joinIp_ = "";
   private byte memoizedIsInitialized = -1;
   private static final StartHostingWorldResponse DEFAULT_INSTANCE = new StartHostingWorldResponse();
   private static final Parser<StartHostingWorldResponse> PARSER = new AbstractParser<StartHostingWorldResponse>() {
      public StartHostingWorldResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartHostingWorldResponse.Builder var3 = StartHostingWorldResponse.newBuilder();

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

   private StartHostingWorldResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartHostingWorldResponse() {
      this.status_ = 0;
      this.joinIp_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartHostingWorldResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartHostingWorldResponse.class, StartHostingWorldResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public StartHostingWorldResponse.Status getStatus() {
      StartHostingWorldResponse.Status var1 = StartHostingWorldResponse.Status.forNumber(this.status_);
      return var1 == null ? StartHostingWorldResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public String getJoinIp() {
      Object var1 = this.joinIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.joinIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getJoinIpBytes() {
      Object var1 = this.joinIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.joinIp_ = var2;
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
      if (this.status_ != StartHostingWorldResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.joinIp_)) {
         GeneratedMessageV3.writeString(var1, 2, this.joinIp_);
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
      if (this.status_ != StartHostingWorldResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.joinIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.joinIp_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof StartHostingWorldResponse)) {
         return super.equals(var1);
      } else {
         StartHostingWorldResponse var2 = (StartHostingWorldResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return !this.getJoinIp().equals(var2.getJoinIp()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.status_;
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getJoinIp().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartHostingWorldResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartHostingWorldResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartHostingWorldResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartHostingWorldResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartHostingWorldResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartHostingWorldResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartHostingWorldResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartHostingWorldResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartHostingWorldResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartHostingWorldResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartHostingWorldResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartHostingWorldResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartHostingWorldResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartHostingWorldResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartHostingWorldResponse.Builder newBuilder(StartHostingWorldResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartHostingWorldResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartHostingWorldResponse.Builder() : new StartHostingWorldResponse.Builder().mergeFrom(this);
   }

   protected StartHostingWorldResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartHostingWorldResponse.Builder(var1);
   }

   public static StartHostingWorldResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartHostingWorldResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartHostingWorldResponse> getParserForType() {
      return PARSER;
   }

   public StartHostingWorldResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartHostingWorldResponse.Builder> implements StartHostingWorldResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private Object joinIp_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartHostingWorldResponse.class, StartHostingWorldResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartHostingWorldResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.joinIp_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_hostedworld_v1_StartHostingWorldResponse_descriptor;
      }

      public StartHostingWorldResponse getDefaultInstanceForType() {
         return StartHostingWorldResponse.getDefaultInstance();
      }

      public StartHostingWorldResponse build() {
         StartHostingWorldResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartHostingWorldResponse buildPartial() {
         StartHostingWorldResponse var1 = new StartHostingWorldResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StartHostingWorldResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 2) != 0) {
            var1.joinIp_ = this.joinIp_;
         }
      }

      public StartHostingWorldResponse.Builder clone() {
         return (StartHostingWorldResponse.Builder)super.clone();
      }

      public StartHostingWorldResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartHostingWorldResponse.Builder)super.setField(var1, var2);
      }

      public StartHostingWorldResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartHostingWorldResponse.Builder)super.clearField(var1);
      }

      public StartHostingWorldResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartHostingWorldResponse.Builder)super.clearOneof(var1);
      }

      public StartHostingWorldResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartHostingWorldResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartHostingWorldResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartHostingWorldResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public StartHostingWorldResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartHostingWorldResponse) {
            return this.mergeFrom((StartHostingWorldResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartHostingWorldResponse.Builder mergeFrom(StartHostingWorldResponse var1) {
         if (var1 == StartHostingWorldResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (!var1.getJoinIp().isEmpty()) {
            this.joinIp_ = var1.joinIp_;
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

      public StartHostingWorldResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.joinIp_ = var1.readStringRequireUtf8();
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
      public int getStatusValue() {
         return this.status_;
      }

      public StartHostingWorldResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public StartHostingWorldResponse.Status getStatus() {
         StartHostingWorldResponse.Status var1 = StartHostingWorldResponse.Status.forNumber(this.status_);
         return var1 == null ? StartHostingWorldResponse.Status.UNRECOGNIZED : var1;
      }

      public StartHostingWorldResponse.Builder setStatus(StartHostingWorldResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public StartHostingWorldResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getJoinIp() {
         Object var1 = this.joinIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.joinIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getJoinIpBytes() {
         Object var1 = this.joinIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.joinIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartHostingWorldResponse.Builder setJoinIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.joinIp_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public StartHostingWorldResponse.Builder clearJoinIp() {
         this.joinIp_ = StartHostingWorldResponse.getDefaultInstance().getJoinIp();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public StartHostingWorldResponse.Builder setJoinIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartHostingWorldResponse.checkByteStringIsUtf8(var1);
         this.joinIp_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final StartHostingWorldResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartHostingWorldResponse.Builder)super.setUnknownFields(var1);
      }

      public final StartHostingWorldResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartHostingWorldResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_ALREADY_HOSTING_WORLD(2),
      STATUS_HOSTING_DISABLED(3),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_ALREADY_HOSTING_WORLD_VALUE = 2;
      public static final int STATUS_HOSTING_DISABLED_VALUE = 3;
      private static final Internal.EnumLiteMap<StartHostingWorldResponse.Status> internalValueMap = new Internal.EnumLiteMap<StartHostingWorldResponse.Status>() {
         public StartHostingWorldResponse.Status findValueByNumber(int var1) {
            return StartHostingWorldResponse.Status.forNumber(var1);
         }
      };
      private static final StartHostingWorldResponse.Status[] VALUES = values();
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
      public static StartHostingWorldResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static StartHostingWorldResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_ALREADY_HOSTING_WORLD;
            case 3:
               return STATUS_HOSTING_DISABLED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<StartHostingWorldResponse.Status> internalGetValueMap() {
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
         return StartHostingWorldResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static StartHostingWorldResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
