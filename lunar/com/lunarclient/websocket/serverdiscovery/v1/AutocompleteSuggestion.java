package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class AutocompleteSuggestion extends GeneratedMessageV3 implements AutocompleteSuggestionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_ = "";
   public static final int PRIMARY_ADDRESS_FIELD_NUMBER = 2;
   private volatile Object primaryAddress_ = "";
   public static final int ADDRESSES_FIELD_NUMBER = 3;
   private LazyStringArrayList addresses_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final AutocompleteSuggestion DEFAULT_INSTANCE = new AutocompleteSuggestion();
   private static final Parser<AutocompleteSuggestion> PARSER = new AbstractParser<AutocompleteSuggestion>() {
      public AutocompleteSuggestion parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AutocompleteSuggestion.Builder var3 = AutocompleteSuggestion.newBuilder();

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

   private AutocompleteSuggestion(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AutocompleteSuggestion() {
      this.name_ = "";
      this.primaryAddress_ = "";
      this.addresses_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AutocompleteSuggestion();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AutocompleteSuggestion.class, AutocompleteSuggestion.Builder.class);
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
   public String getPrimaryAddress() {
      Object var1 = this.primaryAddress_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.primaryAddress_ = var3;
      return var3;
   }

   @Override
   public ByteString getPrimaryAddressBytes() {
      Object var1 = this.primaryAddress_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.primaryAddress_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public ProtocolStringList getAddressesList() {
      return this.addresses_;
   }

   @Override
   public int getAddressesCount() {
      return this.addresses_.size();
   }

   @Override
   public String getAddresses(int var1) {
      return this.addresses_.get(var1);
   }

   @Override
   public ByteString getAddressesBytes(int var1) {
      return this.addresses_.getByteString(var1);
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

      if (!GeneratedMessageV3.isStringEmpty(this.primaryAddress_)) {
         GeneratedMessageV3.writeString(var1, 2, this.primaryAddress_);
      }

      for (int var2 = 0; var2 < this.addresses_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 3, this.addresses_.getRaw(var2));
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

      if (!GeneratedMessageV3.isStringEmpty(this.primaryAddress_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.primaryAddress_);
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.addresses_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.addresses_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getAddressesList().size();
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AutocompleteSuggestion)) {
         return super.equals(var1);
      } else {
         AutocompleteSuggestion var2 = (AutocompleteSuggestion)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getPrimaryAddress().equals(var2.getPrimaryAddress())) {
            return false;
         } else {
            return !this.getAddressesList().equals(var2.getAddressesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getPrimaryAddress().hashCode();
      if (this.getAddressesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getAddressesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AutocompleteSuggestion parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AutocompleteSuggestion parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AutocompleteSuggestion parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AutocompleteSuggestion parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AutocompleteSuggestion parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AutocompleteSuggestion parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AutocompleteSuggestion parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AutocompleteSuggestion parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AutocompleteSuggestion parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AutocompleteSuggestion parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AutocompleteSuggestion parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AutocompleteSuggestion parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AutocompleteSuggestion.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AutocompleteSuggestion.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AutocompleteSuggestion.Builder newBuilder(AutocompleteSuggestion var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AutocompleteSuggestion.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AutocompleteSuggestion.Builder() : new AutocompleteSuggestion.Builder().mergeFrom(this);
   }

   protected AutocompleteSuggestion.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AutocompleteSuggestion.Builder(var1);
   }

   public static AutocompleteSuggestion getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AutocompleteSuggestion> parser() {
      return PARSER;
   }

   @Override
   public Parser<AutocompleteSuggestion> getParserForType() {
      return PARSER;
   }

   public AutocompleteSuggestion getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AutocompleteSuggestion.Builder> implements AutocompleteSuggestionOrBuilder {
      private int bitField0_;
      private Object name_ = "";
      private Object primaryAddress_ = "";
      private LazyStringArrayList addresses_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AutocompleteSuggestion.class, AutocompleteSuggestion.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public AutocompleteSuggestion.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.name_ = "";
         this.primaryAddress_ = "";
         this.addresses_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_descriptor;
      }

      public AutocompleteSuggestion getDefaultInstanceForType() {
         return AutocompleteSuggestion.getDefaultInstance();
      }

      public AutocompleteSuggestion build() {
         AutocompleteSuggestion var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AutocompleteSuggestion buildPartial() {
         AutocompleteSuggestion var1 = new AutocompleteSuggestion(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AutocompleteSuggestion var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 2) != 0) {
            var1.primaryAddress_ = this.primaryAddress_;
         }

         if ((var2 & 4) != 0) {
            this.addresses_.makeImmutable();
            var1.addresses_ = this.addresses_;
         }
      }

      public AutocompleteSuggestion.Builder clone() {
         return (AutocompleteSuggestion.Builder)super.clone();
      }

      public AutocompleteSuggestion.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AutocompleteSuggestion.Builder)super.setField(var1, var2);
      }

      public AutocompleteSuggestion.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AutocompleteSuggestion.Builder)super.clearField(var1);
      }

      public AutocompleteSuggestion.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AutocompleteSuggestion.Builder)super.clearOneof(var1);
      }

      public AutocompleteSuggestion.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AutocompleteSuggestion.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AutocompleteSuggestion.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AutocompleteSuggestion.Builder)super.addRepeatedField(var1, var2);
      }

      public AutocompleteSuggestion.Builder mergeFrom(Message var1) {
         if (var1 instanceof AutocompleteSuggestion) {
            return this.mergeFrom((AutocompleteSuggestion)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AutocompleteSuggestion.Builder mergeFrom(AutocompleteSuggestion var1) {
         if (var1 == AutocompleteSuggestion.getDefaultInstance()) {
            return this;
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getPrimaryAddress().isEmpty()) {
            this.primaryAddress_ = var1.primaryAddress_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.addresses_.isEmpty()) {
            if (this.addresses_.isEmpty()) {
               this.addresses_ = var1.addresses_;
               this.bitField0_ |= 4;
            } else {
               this.ensureAddressesIsMutable();
               this.addresses_.addAll(var1.addresses_);
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

      public AutocompleteSuggestion.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.primaryAddress_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureAddressesIsMutable();
                     this.addresses_.add(var5);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
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

      public AutocompleteSuggestion.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder clearName() {
         this.name_ = AutocompleteSuggestion.getDefaultInstance().getName();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AutocompleteSuggestion.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getPrimaryAddress() {
         Object var1 = this.primaryAddress_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.primaryAddress_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPrimaryAddressBytes() {
         Object var1 = this.primaryAddress_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.primaryAddress_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AutocompleteSuggestion.Builder setPrimaryAddress(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.primaryAddress_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder clearPrimaryAddress() {
         this.primaryAddress_ = AutocompleteSuggestion.getDefaultInstance().getPrimaryAddress();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder setPrimaryAddressBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AutocompleteSuggestion.checkByteStringIsUtf8(var1);
         this.primaryAddress_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      private void ensureAddressesIsMutable() {
         if (!this.addresses_.isModifiable()) {
            this.addresses_ = new LazyStringArrayList(this.addresses_);
         }

         this.bitField0_ |= 4;
      }

      public ProtocolStringList getAddressesList() {
         this.addresses_.makeImmutable();
         return this.addresses_;
      }

      @Override
      public int getAddressesCount() {
         return this.addresses_.size();
      }

      @Override
      public String getAddresses(int var1) {
         return this.addresses_.get(var1);
      }

      @Override
      public ByteString getAddressesBytes(int var1) {
         return this.addresses_.getByteString(var1);
      }

      public AutocompleteSuggestion.Builder setAddresses(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAddressesIsMutable();
         this.addresses_.set(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder addAddresses(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAddressesIsMutable();
         this.addresses_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder addAllAddresses(Iterable<String> var1) {
         this.ensureAddressesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.addresses_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder clearAddresses() {
         this.addresses_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public AutocompleteSuggestion.Builder addAddressesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AutocompleteSuggestion.checkByteStringIsUtf8(var1);
         this.ensureAddressesIsMutable();
         this.addresses_.add(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final AutocompleteSuggestion.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AutocompleteSuggestion.Builder)super.setUnknownFields(var1);
      }

      public final AutocompleteSuggestion.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AutocompleteSuggestion.Builder)super.mergeUnknownFields(var1);
      }
   }
}
