package com.lunarclient.apollo.cosmetic.v1;

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

public final class Emote extends GeneratedMessageV3 implements EmoteOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private int id_ = 0;
   public static final int METADATA_FIELD_NUMBER = 2;
   private int metadata_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Emote DEFAULT_INSTANCE = new Emote();
   private static final Parser<Emote> PARSER = new AbstractParser<Emote>() {
      public Emote parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Emote.Builder var3 = Emote.newBuilder();

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

   private Emote(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Emote() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Emote();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Emote_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Emote_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Emote.class, Emote.Builder.class);
   }

   @Override
   public int getId() {
      return this.id_;
   }

   @Override
   public int getMetadata() {
      return this.metadata_;
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
      if (this.id_ != 0) {
         var1.writeInt32(1, this.id_);
      }

      if (this.metadata_ != 0) {
         var1.writeInt32(2, this.metadata_);
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
      if (this.id_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.id_);
      }

      if (this.metadata_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.metadata_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Emote)) {
         return super.equals(var1);
      } else {
         Emote var2 = (Emote)var1;
         if (this.getId() != var2.getId()) {
            return false;
         } else {
            return this.getMetadata() != var2.getMetadata() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getId();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getMetadata();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Emote parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Emote parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Emote parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Emote parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Emote parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Emote parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Emote parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Emote parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Emote parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Emote parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Emote parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Emote parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Emote.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Emote.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Emote.Builder newBuilder(Emote var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Emote.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Emote.Builder() : new Emote.Builder().mergeFrom(this);
   }

   protected Emote.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Emote.Builder(var1);
   }

   public static Emote getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Emote> parser() {
      return PARSER;
   }

   @Override
   public Parser<Emote> getParserForType() {
      return PARSER;
   }

   public Emote getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Emote.Builder> implements EmoteOrBuilder {
      private int bitField0_;
      private int id_;
      private int metadata_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Emote_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Emote_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Emote.class, Emote.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Emote.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = 0;
         this.metadata_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_cosmetic_v1_Emote_descriptor;
      }

      public Emote getDefaultInstanceForType() {
         return Emote.getDefaultInstance();
      }

      public Emote build() {
         Emote var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Emote buildPartial() {
         Emote var1 = new Emote(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Emote var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.metadata_ = this.metadata_;
         }
      }

      public Emote.Builder clone() {
         return (Emote.Builder)super.clone();
      }

      public Emote.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Emote.Builder)super.setField(var1, var2);
      }

      public Emote.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Emote.Builder)super.clearField(var1);
      }

      public Emote.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Emote.Builder)super.clearOneof(var1);
      }

      public Emote.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Emote.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Emote.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Emote.Builder)super.addRepeatedField(var1, var2);
      }

      public Emote.Builder mergeFrom(Message var1) {
         if (var1 instanceof Emote) {
            return this.mergeFrom((Emote)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Emote.Builder mergeFrom(Emote var1) {
         if (var1 == Emote.getDefaultInstance()) {
            return this;
         }

         if (var1.getId() != 0) {
            this.setId(var1.getId());
         }

         if (var1.getMetadata() != 0) {
            this.setMetadata(var1.getMetadata());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Emote.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.metadata_ = var1.readInt32();
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
      public int getId() {
         return this.id_;
      }

      public Emote.Builder setId(int var1) {
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Emote.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getMetadata() {
         return this.metadata_;
      }

      public Emote.Builder setMetadata(int var1) {
         this.metadata_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Emote.Builder clearMetadata() {
         this.bitField0_ &= -3;
         this.metadata_ = 0;
         this.onChanged();
         return this;
      }

      public final Emote.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Emote.Builder)super.setUnknownFields(var1);
      }

      public final Emote.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Emote.Builder)super.mergeUnknownFields(var1);
      }
   }
}
