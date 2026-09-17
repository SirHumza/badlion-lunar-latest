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

public final class DisableStaffModsMessage extends GeneratedMessageV3 implements DisableStaffModsMessageOrBuilder {
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
   private byte memoizedIsInitialized = -1;
   private static final DisableStaffModsMessage DEFAULT_INSTANCE = new DisableStaffModsMessage();
   private static final Parser<DisableStaffModsMessage> PARSER = new AbstractParser<DisableStaffModsMessage>() {
      public DisableStaffModsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisableStaffModsMessage.Builder var3 = DisableStaffModsMessage.newBuilder();

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

   private DisableStaffModsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisableStaffModsMessage() {
      this.staffMods_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisableStaffModsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisableStaffModsMessage.class, DisableStaffModsMessage.Builder.class);
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
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof DisableStaffModsMessage)) {
         return super.equals(var1);
      }

      DisableStaffModsMessage var2 = (DisableStaffModsMessage)var1;
      return !this.staffMods_.equals(var2.staffMods_) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisableStaffModsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisableStaffModsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisableStaffModsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisableStaffModsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisableStaffModsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisableStaffModsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisableStaffModsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisableStaffModsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisableStaffModsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisableStaffModsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisableStaffModsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisableStaffModsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisableStaffModsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisableStaffModsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisableStaffModsMessage.Builder newBuilder(DisableStaffModsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisableStaffModsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisableStaffModsMessage.Builder() : new DisableStaffModsMessage.Builder().mergeFrom(this);
   }

   protected DisableStaffModsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisableStaffModsMessage.Builder(var1);
   }

   public static DisableStaffModsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisableStaffModsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisableStaffModsMessage> getParserForType() {
      return PARSER;
   }

   public DisableStaffModsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisableStaffModsMessage.Builder> implements DisableStaffModsMessageOrBuilder {
      private int bitField0_;
      private List<Integer> staffMods_ = Collections.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisableStaffModsMessage.class, DisableStaffModsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DisableStaffModsMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.staffMods_ = Collections.emptyList();
         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_descriptor;
      }

      public DisableStaffModsMessage getDefaultInstanceForType() {
         return DisableStaffModsMessage.getDefaultInstance();
      }

      public DisableStaffModsMessage build() {
         DisableStaffModsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisableStaffModsMessage buildPartial() {
         DisableStaffModsMessage var1 = new DisableStaffModsMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(DisableStaffModsMessage var1) {
         if ((this.bitField0_ & 1) != 0) {
            this.staffMods_ = Collections.unmodifiableList(this.staffMods_);
            this.bitField0_ &= -2;
         }

         var1.staffMods_ = this.staffMods_;
      }

      private void buildPartial0(DisableStaffModsMessage var1) {
         int var2 = this.bitField0_;
      }

      public DisableStaffModsMessage.Builder clone() {
         return (DisableStaffModsMessage.Builder)super.clone();
      }

      public DisableStaffModsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisableStaffModsMessage.Builder)super.setField(var1, var2);
      }

      public DisableStaffModsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisableStaffModsMessage.Builder)super.clearField(var1);
      }

      public DisableStaffModsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisableStaffModsMessage.Builder)super.clearOneof(var1);
      }

      public DisableStaffModsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisableStaffModsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisableStaffModsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisableStaffModsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisableStaffModsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisableStaffModsMessage) {
            return this.mergeFrom((DisableStaffModsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisableStaffModsMessage.Builder mergeFrom(DisableStaffModsMessage var1) {
         if (var1 == DisableStaffModsMessage.getDefaultInstance()) {
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

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisableStaffModsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
         return new Internal.ListAdapter<>(this.staffMods_, DisableStaffModsMessage.staffMods_converter_);
      }

      @Override
      public int getStaffModsCount() {
         return this.staffMods_.size();
      }

      @Override
      public StaffMod getStaffMods(int var1) {
         return DisableStaffModsMessage.staffMods_converter_.convert(this.staffMods_.get(var1));
      }

      public DisableStaffModsMessage.Builder setStaffMods(int var1, StaffMod var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStaffModsIsMutable();
         this.staffMods_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public DisableStaffModsMessage.Builder addStaffMods(StaffMod var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStaffModsIsMutable();
         this.staffMods_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public DisableStaffModsMessage.Builder addAllStaffMods(Iterable<? extends StaffMod> var1) {
         this.ensureStaffModsIsMutable();

         for (StaffMod var3 : var1) {
            this.staffMods_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public DisableStaffModsMessage.Builder clearStaffMods() {
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

      public DisableStaffModsMessage.Builder setStaffModsValue(int var1, int var2) {
         this.ensureStaffModsIsMutable();
         this.staffMods_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public DisableStaffModsMessage.Builder addStaffModsValue(int var1) {
         this.ensureStaffModsIsMutable();
         this.staffMods_.add(var1);
         this.onChanged();
         return this;
      }

      public DisableStaffModsMessage.Builder addAllStaffModsValue(Iterable<Integer> var1) {
         this.ensureStaffModsIsMutable();

         for (int var3 : var1) {
            this.staffMods_.add(var3);
         }

         this.onChanged();
         return this;
      }

      public final DisableStaffModsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisableStaffModsMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisableStaffModsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisableStaffModsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
