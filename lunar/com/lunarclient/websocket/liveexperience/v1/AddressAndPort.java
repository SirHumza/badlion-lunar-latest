package com.lunarclient.websocket.liveexperience.v1;

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

public final class AddressAndPort extends GeneratedMessageV3 implements AddressAndPortOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ADDRESS_FIELD_NUMBER = 1;
   private volatile Object address_ = "";
   public static final int PORT_FIELD_NUMBER = 2;
   private int port_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final AddressAndPort DEFAULT_INSTANCE = new AddressAndPort();
   private static final Parser<AddressAndPort> PARSER = new AbstractParser<AddressAndPort>() {
      public AddressAndPort parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AddressAndPort.Builder var3 = AddressAndPort.newBuilder();

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

   private AddressAndPort(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AddressAndPort() {
      this.address_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AddressAndPort();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AddressAndPort.class, AddressAndPort.Builder.class);
   }

   @Override
   public String getAddress() {
      Object var1 = this.address_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.address_ = var3;
      return var3;
   }

   @Override
   public ByteString getAddressBytes() {
      Object var1 = this.address_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.address_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getPort() {
      return this.port_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.address_)) {
         GeneratedMessageV3.writeString(var1, 1, this.address_);
      }

      if (this.port_ != 0) {
         var1.writeInt32(2, this.port_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.address_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.address_);
      }

      if (this.port_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.port_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AddressAndPort)) {
         return super.equals(var1);
      } else {
         AddressAndPort var2 = (AddressAndPort)var1;
         if (!this.getAddress().equals(var2.getAddress())) {
            return false;
         } else {
            return this.getPort() != var2.getPort() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getAddress().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getPort();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AddressAndPort parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddressAndPort parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddressAndPort parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddressAndPort parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddressAndPort parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddressAndPort parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddressAndPort parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddressAndPort parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AddressAndPort parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AddressAndPort parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AddressAndPort parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddressAndPort parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AddressAndPort.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AddressAndPort.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AddressAndPort.Builder newBuilder(AddressAndPort var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AddressAndPort.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AddressAndPort.Builder() : new AddressAndPort.Builder().mergeFrom(this);
   }

   protected AddressAndPort.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AddressAndPort.Builder(var1);
   }

   public static AddressAndPort getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AddressAndPort> parser() {
      return PARSER;
   }

   @Override
   public Parser<AddressAndPort> getParserForType() {
      return PARSER;
   }

   public AddressAndPort getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AddressAndPort.Builder> implements AddressAndPortOrBuilder {
      private int bitField0_;
      private Object address_ = "";
      private int port_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AddressAndPort.class, AddressAndPort.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public AddressAndPort.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.address_ = "";
         this.port_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_descriptor;
      }

      public AddressAndPort getDefaultInstanceForType() {
         return AddressAndPort.getDefaultInstance();
      }

      public AddressAndPort build() {
         AddressAndPort var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AddressAndPort buildPartial() {
         AddressAndPort var1 = new AddressAndPort(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AddressAndPort var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.address_ = this.address_;
         }

         if ((var2 & 2) != 0) {
            var1.port_ = this.port_;
         }
      }

      public AddressAndPort.Builder clone() {
         return (AddressAndPort.Builder)super.clone();
      }

      public AddressAndPort.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddressAndPort.Builder)super.setField(var1, var2);
      }

      public AddressAndPort.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AddressAndPort.Builder)super.clearField(var1);
      }

      public AddressAndPort.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AddressAndPort.Builder)super.clearOneof(var1);
      }

      public AddressAndPort.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AddressAndPort.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AddressAndPort.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddressAndPort.Builder)super.addRepeatedField(var1, var2);
      }

      public AddressAndPort.Builder mergeFrom(Message var1) {
         if (var1 instanceof AddressAndPort) {
            return this.mergeFrom((AddressAndPort)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AddressAndPort.Builder mergeFrom(AddressAndPort var1) {
         if (var1 == AddressAndPort.getDefaultInstance()) {
            return this;
         }

         if (!var1.getAddress().isEmpty()) {
            this.address_ = var1.address_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getPort() != 0) {
            this.setPort(var1.getPort());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public AddressAndPort.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.address_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.port_ = var1.readInt32();
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
      public String getAddress() {
         Object var1 = this.address_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.address_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAddressBytes() {
         Object var1 = this.address_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.address_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AddressAndPort.Builder setAddress(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.address_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder clearAddress() {
         this.address_ = AddressAndPort.getDefaultInstance().getAddress();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder setAddressBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AddressAndPort.checkByteStringIsUtf8(var1);
         this.address_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getPort() {
         return this.port_;
      }

      public AddressAndPort.Builder setPort(int var1) {
         this.port_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public AddressAndPort.Builder clearPort() {
         this.bitField0_ &= -3;
         this.port_ = 0;
         this.onChanged();
         return this;
      }

      public final AddressAndPort.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AddressAndPort.Builder)super.setUnknownFields(var1);
      }

      public final AddressAndPort.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AddressAndPort.Builder)super.mergeUnknownFields(var1);
      }
   }
}
