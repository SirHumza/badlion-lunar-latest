package com.lunarclient.apollo.chat.v1;

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

public final class DisplayLiveChatMessageMessage extends GeneratedMessageV3 implements DisplayLiveChatMessageMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MESSAGE_ID_FIELD_NUMBER = 1;
   private int messageId_ = 0;
   public static final int ADVENTURE_JSON_LINES_FIELD_NUMBER = 2;
   private volatile Object adventureJsonLines_ = "";
   private byte memoizedIsInitialized = -1;
   private static final DisplayLiveChatMessageMessage DEFAULT_INSTANCE = new DisplayLiveChatMessageMessage();
   private static final Parser<DisplayLiveChatMessageMessage> PARSER = new AbstractParser<DisplayLiveChatMessageMessage>() {
      public DisplayLiveChatMessageMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayLiveChatMessageMessage.Builder var3 = DisplayLiveChatMessageMessage.newBuilder();

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

   private DisplayLiveChatMessageMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayLiveChatMessageMessage() {
      this.adventureJsonLines_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayLiveChatMessageMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayLiveChatMessageMessage.class, DisplayLiveChatMessageMessage.Builder.class);
   }

   @Override
   public int getMessageId() {
      return this.messageId_;
   }

   @Override
   public String getAdventureJsonLines() {
      Object var1 = this.adventureJsonLines_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.adventureJsonLines_ = var3;
      return var3;
   }

   @Override
   public ByteString getAdventureJsonLinesBytes() {
      Object var1 = this.adventureJsonLines_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.adventureJsonLines_ = var2;
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
      if (this.messageId_ != 0) {
         var1.writeInt32(1, this.messageId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.adventureJsonLines_)) {
         GeneratedMessageV3.writeString(var1, 2, this.adventureJsonLines_);
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
      if (this.messageId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.messageId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.adventureJsonLines_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.adventureJsonLines_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayLiveChatMessageMessage)) {
         return super.equals(var1);
      } else {
         DisplayLiveChatMessageMessage var2 = (DisplayLiveChatMessageMessage)var1;
         if (this.getMessageId() != var2.getMessageId()) {
            return false;
         } else {
            return !this.getAdventureJsonLines().equals(var2.getAdventureJsonLines()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getMessageId();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getAdventureJsonLines().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayLiveChatMessageMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayLiveChatMessageMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayLiveChatMessageMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayLiveChatMessageMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayLiveChatMessageMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayLiveChatMessageMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayLiveChatMessageMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayLiveChatMessageMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayLiveChatMessageMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayLiveChatMessageMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayLiveChatMessageMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayLiveChatMessageMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayLiveChatMessageMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayLiveChatMessageMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayLiveChatMessageMessage.Builder newBuilder(DisplayLiveChatMessageMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayLiveChatMessageMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayLiveChatMessageMessage.Builder() : new DisplayLiveChatMessageMessage.Builder().mergeFrom(this);
   }

   protected DisplayLiveChatMessageMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayLiveChatMessageMessage.Builder(var1);
   }

   public static DisplayLiveChatMessageMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayLiveChatMessageMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayLiveChatMessageMessage> getParserForType() {
      return PARSER;
   }

   public DisplayLiveChatMessageMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<DisplayLiveChatMessageMessage.Builder>
      implements DisplayLiveChatMessageMessageOrBuilder {
      private int bitField0_;
      private int messageId_;
      private Object adventureJsonLines_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayLiveChatMessageMessage.class, DisplayLiveChatMessageMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DisplayLiveChatMessageMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.messageId_ = 0;
         this.adventureJsonLines_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_DisplayLiveChatMessageMessage_descriptor;
      }

      public DisplayLiveChatMessageMessage getDefaultInstanceForType() {
         return DisplayLiveChatMessageMessage.getDefaultInstance();
      }

      public DisplayLiveChatMessageMessage build() {
         DisplayLiveChatMessageMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayLiveChatMessageMessage buildPartial() {
         DisplayLiveChatMessageMessage var1 = new DisplayLiveChatMessageMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayLiveChatMessageMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.messageId_ = this.messageId_;
         }

         if ((var2 & 2) != 0) {
            var1.adventureJsonLines_ = this.adventureJsonLines_;
         }
      }

      public DisplayLiveChatMessageMessage.Builder clone() {
         return (DisplayLiveChatMessageMessage.Builder)super.clone();
      }

      public DisplayLiveChatMessageMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayLiveChatMessageMessage.Builder)super.setField(var1, var2);
      }

      public DisplayLiveChatMessageMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayLiveChatMessageMessage.Builder)super.clearField(var1);
      }

      public DisplayLiveChatMessageMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayLiveChatMessageMessage.Builder)super.clearOneof(var1);
      }

      public DisplayLiveChatMessageMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayLiveChatMessageMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayLiveChatMessageMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayLiveChatMessageMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayLiveChatMessageMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayLiveChatMessageMessage) {
            return this.mergeFrom((DisplayLiveChatMessageMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayLiveChatMessageMessage.Builder mergeFrom(DisplayLiveChatMessageMessage var1) {
         if (var1 == DisplayLiveChatMessageMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getMessageId() != 0) {
            this.setMessageId(var1.getMessageId());
         }

         if (!var1.getAdventureJsonLines().isEmpty()) {
            this.adventureJsonLines_ = var1.adventureJsonLines_;
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

      public DisplayLiveChatMessageMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.messageId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.adventureJsonLines_ = var1.readStringRequireUtf8();
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
      public int getMessageId() {
         return this.messageId_;
      }

      public DisplayLiveChatMessageMessage.Builder setMessageId(int var1) {
         this.messageId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayLiveChatMessageMessage.Builder clearMessageId() {
         this.bitField0_ &= -2;
         this.messageId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getAdventureJsonLines() {
         Object var1 = this.adventureJsonLines_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.adventureJsonLines_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAdventureJsonLinesBytes() {
         Object var1 = this.adventureJsonLines_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.adventureJsonLines_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayLiveChatMessageMessage.Builder setAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.adventureJsonLines_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayLiveChatMessageMessage.Builder clearAdventureJsonLines() {
         this.adventureJsonLines_ = DisplayLiveChatMessageMessage.getDefaultInstance().getAdventureJsonLines();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public DisplayLiveChatMessageMessage.Builder setAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayLiveChatMessageMessage.checkByteStringIsUtf8(var1);
         this.adventureJsonLines_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final DisplayLiveChatMessageMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayLiveChatMessageMessage.Builder)super.setUnknownFields(var1);
      }

      public final DisplayLiveChatMessageMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayLiveChatMessageMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
