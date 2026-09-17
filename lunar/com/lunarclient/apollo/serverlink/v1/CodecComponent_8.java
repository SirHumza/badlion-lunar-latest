package com.lunarclient.apollo.serverlink.v1;

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

public final class RemoveServerLinkMessage extends GeneratedMessageV3 implements RemoveServerLinkMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_LINK_IDS_FIELD_NUMBER = 1;
   private LazyStringArrayList serverLinkIds_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final RemoveServerLinkMessage DEFAULT_INSTANCE = new RemoveServerLinkMessage();
   private static final Parser<RemoveServerLinkMessage> PARSER = new AbstractParser<RemoveServerLinkMessage>() {
      public RemoveServerLinkMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveServerLinkMessage.Builder var3 = RemoveServerLinkMessage.newBuilder();

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

   private RemoveServerLinkMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveServerLinkMessage() {
      this.serverLinkIds_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveServerLinkMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveServerLinkMessage.class, RemoveServerLinkMessage.Builder.class);
   }

   public ProtocolStringList getServerLinkIdsList() {
      return this.serverLinkIds_;
   }

   @Override
   public int getServerLinkIdsCount() {
      return this.serverLinkIds_.size();
   }

   @Override
   public String getServerLinkIds(int var1) {
      return this.serverLinkIds_.get(var1);
   }

   @Override
   public ByteString getServerLinkIdsBytes(int var1) {
      return this.serverLinkIds_.getByteString(var1);
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
      for (int var2 = 0; var2 < this.serverLinkIds_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 1, this.serverLinkIds_.getRaw(var2));
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

      for (int var3 = 0; var3 < this.serverLinkIds_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.serverLinkIds_.getRaw(var3));
      }

      var4 += var2;
      var4 += 1 * this.getServerLinkIdsList().size();
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof RemoveServerLinkMessage)) {
         return super.equals(var1);
      }

      RemoveServerLinkMessage var2 = (RemoveServerLinkMessage)var1;
      return !this.getServerLinkIdsList().equals(var2.getServerLinkIdsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getServerLinkIdsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getServerLinkIdsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveServerLinkMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveServerLinkMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveServerLinkMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveServerLinkMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveServerLinkMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveServerLinkMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveServerLinkMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveServerLinkMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveServerLinkMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveServerLinkMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveServerLinkMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveServerLinkMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveServerLinkMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveServerLinkMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveServerLinkMessage.Builder newBuilder(RemoveServerLinkMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveServerLinkMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveServerLinkMessage.Builder() : new RemoveServerLinkMessage.Builder().mergeFrom(this);
   }

   protected RemoveServerLinkMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveServerLinkMessage.Builder(var1);
   }

   public static RemoveServerLinkMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveServerLinkMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveServerLinkMessage> getParserForType() {
      return PARSER;
   }

   public RemoveServerLinkMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveServerLinkMessage.Builder> implements RemoveServerLinkMessageOrBuilder {
      private int bitField0_;
      private LazyStringArrayList serverLinkIds_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveServerLinkMessage.class, RemoveServerLinkMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveServerLinkMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverLinkIds_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServerlinkProto.internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_descriptor;
      }

      public RemoveServerLinkMessage getDefaultInstanceForType() {
         return RemoveServerLinkMessage.getDefaultInstance();
      }

      public RemoveServerLinkMessage build() {
         RemoveServerLinkMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveServerLinkMessage buildPartial() {
         RemoveServerLinkMessage var1 = new RemoveServerLinkMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveServerLinkMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.serverLinkIds_.makeImmutable();
            var1.serverLinkIds_ = this.serverLinkIds_;
         }
      }

      public RemoveServerLinkMessage.Builder clone() {
         return (RemoveServerLinkMessage.Builder)super.clone();
      }

      public RemoveServerLinkMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveServerLinkMessage.Builder)super.setField(var1, var2);
      }

      public RemoveServerLinkMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveServerLinkMessage.Builder)super.clearField(var1);
      }

      public RemoveServerLinkMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveServerLinkMessage.Builder)super.clearOneof(var1);
      }

      public RemoveServerLinkMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveServerLinkMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveServerLinkMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveServerLinkMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveServerLinkMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveServerLinkMessage) {
            return this.mergeFrom((RemoveServerLinkMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveServerLinkMessage.Builder mergeFrom(RemoveServerLinkMessage var1) {
         if (var1 == RemoveServerLinkMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.serverLinkIds_.isEmpty()) {
            if (this.serverLinkIds_.isEmpty()) {
               this.serverLinkIds_ = var1.serverLinkIds_;
               this.bitField0_ |= 1;
            } else {
               this.ensureServerLinkIdsIsMutable();
               this.serverLinkIds_.addAll(var1.serverLinkIds_);
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

      public RemoveServerLinkMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureServerLinkIdsIsMutable();
                     this.serverLinkIds_.add(var5);
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

      private void ensureServerLinkIdsIsMutable() {
         if (!this.serverLinkIds_.isModifiable()) {
            this.serverLinkIds_ = new LazyStringArrayList(this.serverLinkIds_);
         }

         this.bitField0_ |= 1;
      }

      public ProtocolStringList getServerLinkIdsList() {
         this.serverLinkIds_.makeImmutable();
         return this.serverLinkIds_;
      }

      @Override
      public int getServerLinkIdsCount() {
         return this.serverLinkIds_.size();
      }

      @Override
      public String getServerLinkIds(int var1) {
         return this.serverLinkIds_.get(var1);
      }

      @Override
      public ByteString getServerLinkIdsBytes(int var1) {
         return this.serverLinkIds_.getByteString(var1);
      }

      public RemoveServerLinkMessage.Builder setServerLinkIds(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureServerLinkIdsIsMutable();
         this.serverLinkIds_.set(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveServerLinkMessage.Builder addServerLinkIds(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureServerLinkIdsIsMutable();
         this.serverLinkIds_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveServerLinkMessage.Builder addAllServerLinkIds(Iterable<String> var1) {
         this.ensureServerLinkIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.serverLinkIds_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveServerLinkMessage.Builder clearServerLinkIds() {
         this.serverLinkIds_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RemoveServerLinkMessage.Builder addServerLinkIdsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RemoveServerLinkMessage.checkByteStringIsUtf8(var1);
         this.ensureServerLinkIdsIsMutable();
         this.serverLinkIds_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final RemoveServerLinkMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveServerLinkMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveServerLinkMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveServerLinkMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
