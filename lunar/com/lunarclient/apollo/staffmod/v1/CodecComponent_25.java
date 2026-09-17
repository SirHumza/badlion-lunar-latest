package com.lunarclient.apollo.staffmod.v1;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EnableStaffModsMessage extends GeneratedMessageV3 implements EnableStaffModsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STAFF_MODS_FIELD_NUMBER = 1;
   private List<Integer> staffMods_;
   private static final Internal.ListAdapter.Converter<Integer, StaffMod> staffMods_converter_ = new Internal.ListAdapter.Converter<Integer, StaffMod>() {
      public StaffMod convert(Integer var1) {
         StaffMod var2 = StaffMod.forNumber(var1);
         return var2 == null ? StaffMod.UNRECOGNIZED : var2;
      }
   };
   private int staffModsMemoizedSerializedSize;
   public static final int ENABLED_BY_DEFAULT_FIELD_NUMBER = 2;
   private boolean enabledByDefault_ = false;
   private byte memoizedIsInitialized = -1;
   private static final EnableStaffModsMessage DEFAULT_INSTANCE = new EnableStaffModsMessage();
   private static final Parser<EnableStaffModsMessage> PARSER = new AbstractParser<EnableStaffModsMessage>() {
      public EnableStaffModsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EnableStaffModsMessage.Builder var3 = EnableStaffModsMessage.newBuilder();

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

   private EnableStaffModsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EnableStaffModsMessage() {
      this.staffMods_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EnableStaffModsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EnableStaffModsMessage.class, EnableStaffModsMessage.Builder.class);
   }

   @Override
   public List<StaffMod> getStaffModsList() {
      return new Internal.ListAdapter<>(this.staffMods_, staffMods_converter_);
   }

   @Override
   public int getStaffModsCount() {
      return this.staffMods_.size();
   }

   @Override
   public StaffMod getStaffMods(int var1) {
      return staffMods_converter_.convert(this.staffMods_.get(var1));
   }

   @Override
   public List<Integer> getStaffModsValueList() {
      return this.staffMods_;
   }

   @Override
   public int getStaffModsValue(int var1) {
      return this.staffMods_.get(var1);
   }

   @Override
   public boolean getEnabledByDefault() {
      return this.enabledByDefault_;
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
      if (this.getStaffModsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.staffModsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.staffMods_.size(); var2++) {
         var1.writeEnumNoTag(this.staffMods_.get(var2));
      }

      if (this.enabledByDefault_) {
         var1.writeBool(2, this.enabledByDefault_);
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

      for (int var3 = 0; var3 < this.staffMods_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.staffMods_.get(var3));
      }

      var4 += var2;
      if (!this.getStaffModsList().isEmpty()) {
         var4 = ++var4 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.staffModsMemoizedSerializedSize = var2;
      if (this.enabledByDefault_) {
         var4 += CodedOutputStream.computeBoolSize(2, this.enabledByDefault_);
      }

      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EnableStaffModsMessage)) {
         return super.equals(var1);
      } else {
         EnableStaffModsMessage var2 = (EnableStaffModsMessage)var1;
         if (!this.staffMods_.equals(var2.staffMods_)) {
            return false;
         } else {
            return this.getEnabledByDefault() != var2.getEnabledByDefault() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getStaffModsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.staffMods_.hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getEnabledByDefault());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EnableStaffModsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EnableStaffModsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EnableStaffModsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EnableStaffModsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EnableStaffModsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EnableStaffModsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EnableStaffModsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EnableStaffModsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EnableStaffModsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EnableStaffModsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EnableStaffModsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EnableStaffModsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EnableStaffModsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EnableStaffModsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EnableStaffModsMessage.Builder newBuilder(EnableStaffModsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EnableStaffModsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EnableStaffModsMessage.Builder() : new EnableStaffModsMessage.Builder().mergeFrom(this);
   }

   protected EnableStaffModsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EnableStaffModsMessage.Builder(var1);
   }

   public static EnableStaffModsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EnableStaffModsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EnableStaffModsMessage> getParserForType() {
      return PARSER;
   }

   public EnableStaffModsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EnableStaffModsMessage.Builder> implements EnableStaffModsMessageOrBuilder {
      private int bitField0_;
      private List<Integer> staffMods_ = Collections.emptyList();
      private boolean enabledByDefault_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EnableStaffModsMessage.class, EnableStaffModsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EnableStaffModsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.staffMods_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.enabledByDefault_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_descriptor;
      }

      public EnableStaffModsMessage getDefaultInstanceForType() {
         return EnableStaffModsMessage.getDefaultInstance();
      }

      public EnableStaffModsMessage build() {
         EnableStaffModsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EnableStaffModsMessage buildPartial() {
         EnableStaffModsMessage var1 = new EnableStaffModsMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(EnableStaffModsMessage var1) {
         if ((this.bitField0_ & 1) != 0) {
            this.staffMods_ = Collections.unmodifiableList(this.staffMods_);
            this.bitField0_ &= -2;
         }

         var1.staffMods_ = this.staffMods_;
      }

      private void buildPartial0(EnableStaffModsMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 2) != 0) {
            var1.enabledByDefault_ = this.enabledByDefault_;
         }
      }

      public EnableStaffModsMessage.Builder clone() {
         return (EnableStaffModsMessage.Builder)super.clone();
      }

      public EnableStaffModsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EnableStaffModsMessage.Builder)super.setField(var1, var2);
      }

      public EnableStaffModsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EnableStaffModsMessage.Builder)super.clearField(var1);
      }

      public EnableStaffModsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EnableStaffModsMessage.Builder)super.clearOneof(var1);
      }

      public EnableStaffModsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EnableStaffModsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EnableStaffModsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EnableStaffModsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EnableStaffModsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EnableStaffModsMessage) {
            return this.mergeFrom((EnableStaffModsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EnableStaffModsMessage.Builder mergeFrom(EnableStaffModsMessage var1) {
         if (var1 == EnableStaffModsMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.staffMods_.isEmpty()) {
            if (this.staffMods_.isEmpty()) {
               this.staffMods_ = var1.staffMods_;
               this.bitField0_ &= -2;
            } else {
               this.ensureStaffModsIsMutable();
               this.staffMods_.addAll(var1.staffMods_);
            }

            this.onChanged();
         }

         if (var1.getEnabledByDefault()) {
            this.setEnabledByDefault(var1.getEnabledByDefault());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EnableStaffModsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     int var13 = var1.readEnum();
                     this.ensureStaffModsIsMutable();
                     this.staffMods_.add(var13);
                     break;
                  case 10:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureStaffModsIsMutable();
                        this.staffMods_.add(var7);
                     }

                     var1.popLimit(var6);
                     break;
                  case 16:
                     this.enabledByDefault_ = var1.readBool();
                     this.bitField0_ |= 2;
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

      private void ensureStaffModsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.staffMods_ = new ArrayList<>(this.staffMods_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<StaffMod> getStaffModsList() {
         return new Internal.ListAdapter<>(this.staffMods_, EnableStaffModsMessage.staffMods_converter_);
      }

      @Override
      public int getStaffModsCount() {
         return this.staffMods_.size();
      }

      @Override
      public StaffMod getStaffMods(int var1) {
         return EnableStaffModsMessage.staffMods_converter_.convert(this.staffMods_.get(var1));
      }

      public EnableStaffModsMessage.Builder setStaffMods(int var1, StaffMod var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStaffModsIsMutable();
         this.staffMods_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public EnableStaffModsMessage.Builder addStaffMods(StaffMod var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStaffModsIsMutable();
         this.staffMods_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public EnableStaffModsMessage.Builder addAllStaffMods(Iterable<? extends StaffMod> var1) {
         this.ensureStaffModsIsMutable();

         for (StaffMod var3 : var1) {
            this.staffMods_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public EnableStaffModsMessage.Builder clearStaffMods() {
         this.staffMods_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getStaffModsValueList() {
         return Collections.unmodifiableList(this.staffMods_);
      }

      @Override
      public int getStaffModsValue(int var1) {
         return this.staffMods_.get(var1);
      }

      public EnableStaffModsMessage.Builder setStaffModsValue(int var1, int var2) {
         this.ensureStaffModsIsMutable();
         this.staffMods_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public EnableStaffModsMessage.Builder addStaffModsValue(int var1) {
         this.ensureStaffModsIsMutable();
         this.staffMods_.add(var1);
         this.onChanged();
         return this;
      }

      public EnableStaffModsMessage.Builder addAllStaffModsValue(Iterable<Integer> var1) {
         this.ensureStaffModsIsMutable();

         for (int var3 : var1) {
            this.staffMods_.add(var3);
         }

         this.onChanged();
         return this;
      }

      @Override
      public boolean getEnabledByDefault() {
         return this.enabledByDefault_;
      }

      public EnableStaffModsMessage.Builder setEnabledByDefault(boolean var1) {
         this.enabledByDefault_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EnableStaffModsMessage.Builder clearEnabledByDefault() {
         this.bitField0_ &= -3;
         this.enabledByDefault_ = false;
         this.onChanged();
         return this;
      }

      public final EnableStaffModsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EnableStaffModsMessage.Builder)super.setUnknownFields(var1);
      }

      public final EnableStaffModsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EnableStaffModsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
