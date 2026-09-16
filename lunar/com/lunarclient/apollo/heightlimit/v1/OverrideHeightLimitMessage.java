package com.lunarclient.apollo.heightlimit.v1;

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

public final class OverrideHeightLimitMessage extends GeneratedMessageV3 implements OverrideHeightLimitMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int WORLD_FIELD_NUMBER = 1;
   private volatile Object world_ = "";
   public static final int LIMIT_FIELD_NUMBER = 2;
   private int limit_ = 0;
   public static final int DISPLAY_NAME_ADVENTURE_JSON_LINES_FIELD_NUMBER = 3;
   private volatile Object displayNameAdventureJsonLines_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OverrideHeightLimitMessage DEFAULT_INSTANCE = new OverrideHeightLimitMessage();
   private static final Parser<OverrideHeightLimitMessage> PARSER = new AbstractParser<OverrideHeightLimitMessage>() {
      public OverrideHeightLimitMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideHeightLimitMessage.Builder var3 = OverrideHeightLimitMessage.newBuilder();

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

   private OverrideHeightLimitMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideHeightLimitMessage() {
      this.world_ = "";
      this.displayNameAdventureJsonLines_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideHeightLimitMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideHeightLimitMessage.class, OverrideHeightLimitMessage.Builder.class);
   }

   @Override
   public String getWorld() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.world_ = var3;
      return var3;
   }

   @Override
   public ByteString getWorldBytes() {
      Object var1 = this.world_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.world_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getLimit() {
      return this.limit_;
   }

   @Override
   public String getDisplayNameAdventureJsonLines() {
      Object var1 = this.displayNameAdventureJsonLines_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.displayNameAdventureJsonLines_ = var3;
      return var3;
   }

   @Override
   public ByteString getDisplayNameAdventureJsonLinesBytes() {
      Object var1 = this.displayNameAdventureJsonLines_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.displayNameAdventureJsonLines_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         GeneratedMessageV3.writeString(var1, 1, this.world_);
      }

      if (this.limit_ != 0) {
         var1.writeInt32(2, this.limit_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.displayNameAdventureJsonLines_)) {
         GeneratedMessageV3.writeString(var1, 3, this.displayNameAdventureJsonLines_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.world_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.world_);
      }

      if (this.limit_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.limit_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.displayNameAdventureJsonLines_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.displayNameAdventureJsonLines_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideHeightLimitMessage)) {
         return super.equals(var1);
      } else {
         OverrideHeightLimitMessage var2 = (OverrideHeightLimitMessage)var1;
         if (!this.getWorld().equals(var2.getWorld())) {
            return false;
         } else if (this.getLimit() != var2.getLimit()) {
            return false;
         } else {
            return !this.getDisplayNameAdventureJsonLines().equals(var2.getDisplayNameAdventureJsonLines())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getWorld().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getLimit();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getDisplayNameAdventureJsonLines().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideHeightLimitMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideHeightLimitMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideHeightLimitMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideHeightLimitMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideHeightLimitMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideHeightLimitMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideHeightLimitMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideHeightLimitMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideHeightLimitMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideHeightLimitMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideHeightLimitMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideHeightLimitMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideHeightLimitMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideHeightLimitMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideHeightLimitMessage.Builder newBuilder(OverrideHeightLimitMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideHeightLimitMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideHeightLimitMessage.Builder() : new OverrideHeightLimitMessage.Builder().mergeFrom(this);
   }

   protected OverrideHeightLimitMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideHeightLimitMessage.Builder(var1);
   }

   public static OverrideHeightLimitMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideHeightLimitMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideHeightLimitMessage> getParserForType() {
      return PARSER;
   }

   public OverrideHeightLimitMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OverrideHeightLimitMessage.Builder> implements OverrideHeightLimitMessageOrBuilder {
      private int bitField0_;
      private Object world_ = "";
      private int limit_;
      private Object displayNameAdventureJsonLines_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideHeightLimitMessage.class, OverrideHeightLimitMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OverrideHeightLimitMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.world_ = "";
         this.limit_ = 0;
         this.displayNameAdventureJsonLines_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_heightlimit_v1_OverrideHeightLimitMessage_descriptor;
      }

      public OverrideHeightLimitMessage getDefaultInstanceForType() {
         return OverrideHeightLimitMessage.getDefaultInstance();
      }

      public OverrideHeightLimitMessage build() {
         OverrideHeightLimitMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideHeightLimitMessage buildPartial() {
         OverrideHeightLimitMessage var1 = new OverrideHeightLimitMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideHeightLimitMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.world_ = this.world_;
         }

         if ((var2 & 2) != 0) {
            var1.limit_ = this.limit_;
         }

         if ((var2 & 4) != 0) {
            var1.displayNameAdventureJsonLines_ = this.displayNameAdventureJsonLines_;
         }
      }

      public OverrideHeightLimitMessage.Builder clone() {
         return (OverrideHeightLimitMessage.Builder)super.clone();
      }

      public OverrideHeightLimitMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideHeightLimitMessage.Builder)super.setField(var1, var2);
      }

      public OverrideHeightLimitMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideHeightLimitMessage.Builder)super.clearField(var1);
      }

      public OverrideHeightLimitMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideHeightLimitMessage.Builder)super.clearOneof(var1);
      }

      public OverrideHeightLimitMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideHeightLimitMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideHeightLimitMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideHeightLimitMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideHeightLimitMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideHeightLimitMessage) {
            return this.mergeFrom((OverrideHeightLimitMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideHeightLimitMessage.Builder mergeFrom(OverrideHeightLimitMessage var1) {
         if (var1 == OverrideHeightLimitMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getWorld().isEmpty()) {
            this.world_ = var1.world_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.getLimit() != 0) {
            this.setLimit(var1.getLimit());
         }

         if (!var1.getDisplayNameAdventureJsonLines().isEmpty()) {
            this.displayNameAdventureJsonLines_ = var1.displayNameAdventureJsonLines_;
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

      public OverrideHeightLimitMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.world_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.limit_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.displayNameAdventureJsonLines_ = var1.readStringRequireUtf8();
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
      public String getWorld() {
         Object var1 = this.world_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.world_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getWorldBytes() {
         Object var1 = this.world_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.world_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OverrideHeightLimitMessage.Builder setWorld(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.world_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideHeightLimitMessage.Builder clearWorld() {
         this.world_ = OverrideHeightLimitMessage.getDefaultInstance().getWorld();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OverrideHeightLimitMessage.Builder setWorldBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideHeightLimitMessage.checkByteStringIsUtf8(var1);
         this.world_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getLimit() {
         return this.limit_;
      }

      public OverrideHeightLimitMessage.Builder setLimit(int var1) {
         this.limit_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideHeightLimitMessage.Builder clearLimit() {
         this.bitField0_ &= -3;
         this.limit_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getDisplayNameAdventureJsonLines() {
         Object var1 = this.displayNameAdventureJsonLines_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.displayNameAdventureJsonLines_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDisplayNameAdventureJsonLinesBytes() {
         Object var1 = this.displayNameAdventureJsonLines_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.displayNameAdventureJsonLines_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OverrideHeightLimitMessage.Builder setDisplayNameAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.displayNameAdventureJsonLines_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideHeightLimitMessage.Builder clearDisplayNameAdventureJsonLines() {
         this.displayNameAdventureJsonLines_ = OverrideHeightLimitMessage.getDefaultInstance().getDisplayNameAdventureJsonLines();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public OverrideHeightLimitMessage.Builder setDisplayNameAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideHeightLimitMessage.checkByteStringIsUtf8(var1);
         this.displayNameAdventureJsonLines_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final OverrideHeightLimitMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideHeightLimitMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideHeightLimitMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideHeightLimitMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
