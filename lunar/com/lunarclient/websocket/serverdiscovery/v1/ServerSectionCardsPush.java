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
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServerSectionCardsPush extends GeneratedMessageV3 implements ServerSectionCardsPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SECTION_ID_FIELD_NUMBER = 1;
   private volatile Object sectionId_ = "";
   public static final int CARDS_FIELD_NUMBER = 2;
   private List<ServerCard> cards_;
   private byte memoizedIsInitialized = -1;
   private static final ServerSectionCardsPush DEFAULT_INSTANCE = new ServerSectionCardsPush();
   private static final Parser<ServerSectionCardsPush> PARSER = new AbstractParser<ServerSectionCardsPush>() {
      public ServerSectionCardsPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerSectionCardsPush.Builder var3 = ServerSectionCardsPush.newBuilder();

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

   private ServerSectionCardsPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerSectionCardsPush() {
      this.sectionId_ = "";
      this.cards_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerSectionCardsPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerSectionCardsPush.class, ServerSectionCardsPush.Builder.class);
   }

   @Override
   public String getSectionId() {
      Object var1 = this.sectionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.sectionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getSectionIdBytes() {
      Object var1 = this.sectionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.sectionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public List<ServerCard> getCardsList() {
      return this.cards_;
   }

   @Override
   public List<? extends ServerCardOrBuilder> getCardsOrBuilderList() {
      return this.cards_;
   }

   @Override
   public int getCardsCount() {
      return this.cards_.size();
   }

   @Override
   public ServerCard getCards(int var1) {
      return this.cards_.get(var1);
   }

   @Override
   public ServerCardOrBuilder getCardsOrBuilder(int var1) {
      return this.cards_.get(var1);
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
      if (!GeneratedMessageV3.isStringEmpty(this.sectionId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.sectionId_);
      }

      for (int var2 = 0; var2 < this.cards_.size(); var2++) {
         var1.writeMessage(2, this.cards_.get(var2));
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
      if (!GeneratedMessageV3.isStringEmpty(this.sectionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.sectionId_);
      }

      for (int var2 = 0; var2 < this.cards_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.cards_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerSectionCardsPush)) {
         return super.equals(var1);
      } else {
         ServerSectionCardsPush var2 = (ServerSectionCardsPush)var1;
         if (!this.getSectionId().equals(var2.getSectionId())) {
            return false;
         } else {
            return !this.getCardsList().equals(var2.getCardsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSectionId().hashCode();
      if (this.getCardsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getCardsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerSectionCardsPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerSectionCardsPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerSectionCardsPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerSectionCardsPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerSectionCardsPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerSectionCardsPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerSectionCardsPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerSectionCardsPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerSectionCardsPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerSectionCardsPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerSectionCardsPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerSectionCardsPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerSectionCardsPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerSectionCardsPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerSectionCardsPush.Builder newBuilder(ServerSectionCardsPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerSectionCardsPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerSectionCardsPush.Builder() : new ServerSectionCardsPush.Builder().mergeFrom(this);
   }

   protected ServerSectionCardsPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerSectionCardsPush.Builder(var1);
   }

   public static ServerSectionCardsPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerSectionCardsPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerSectionCardsPush> getParserForType() {
      return PARSER;
   }

   public ServerSectionCardsPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerSectionCardsPush.Builder> implements ServerSectionCardsPushOrBuilder {
      private int bitField0_;
      private Object sectionId_ = "";
      private List<ServerCard> cards_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> cardsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerSectionCardsPush.class, ServerSectionCardsPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ServerSectionCardsPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sectionId_ = "";
         if (this.cardsBuilder_ == null) {
            this.cards_ = Collections.emptyList();
         } else {
            this.cards_ = null;
            this.cardsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_descriptor;
      }

      public ServerSectionCardsPush getDefaultInstanceForType() {
         return ServerSectionCardsPush.getDefaultInstance();
      }

      public ServerSectionCardsPush build() {
         ServerSectionCardsPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerSectionCardsPush buildPartial() {
         ServerSectionCardsPush var1 = new ServerSectionCardsPush(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ServerSectionCardsPush var1) {
         if (this.cardsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.cards_ = Collections.unmodifiableList(this.cards_);
               this.bitField0_ &= -3;
            }

            var1.cards_ = this.cards_;
         } else {
            var1.cards_ = this.cardsBuilder_.build();
         }
      }

      private void buildPartial0(ServerSectionCardsPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.sectionId_ = this.sectionId_;
         }
      }

      public ServerSectionCardsPush.Builder clone() {
         return (ServerSectionCardsPush.Builder)super.clone();
      }

      public ServerSectionCardsPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerSectionCardsPush.Builder)super.setField(var1, var2);
      }

      public ServerSectionCardsPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerSectionCardsPush.Builder)super.clearField(var1);
      }

      public ServerSectionCardsPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerSectionCardsPush.Builder)super.clearOneof(var1);
      }

      public ServerSectionCardsPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerSectionCardsPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerSectionCardsPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerSectionCardsPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerSectionCardsPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerSectionCardsPush) {
            return this.mergeFrom((ServerSectionCardsPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerSectionCardsPush.Builder mergeFrom(ServerSectionCardsPush var1) {
         if (var1 == ServerSectionCardsPush.getDefaultInstance()) {
            return this;
         }

         if (!var1.getSectionId().isEmpty()) {
            this.sectionId_ = var1.sectionId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (this.cardsBuilder_ == null) {
            if (!var1.cards_.isEmpty()) {
               if (this.cards_.isEmpty()) {
                  this.cards_ = var1.cards_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureCardsIsMutable();
                  this.cards_.addAll(var1.cards_);
               }

               this.onChanged();
            }
         } else if (!var1.cards_.isEmpty()) {
            if (this.cardsBuilder_.isEmpty()) {
               this.cardsBuilder_.dispose();
               this.cardsBuilder_ = null;
               this.cards_ = var1.cards_;
               this.bitField0_ &= -3;
               this.cardsBuilder_ = ServerSectionCardsPush.alwaysUseFieldBuilders ? this.getCardsFieldBuilder() : null;
            } else {
               this.cardsBuilder_.addAllMessages(var1.cards_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ServerSectionCardsPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.sectionId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     ServerCard var5 = var1.readMessage(ServerCard.parser(), var2);
                     if (this.cardsBuilder_ == null) {
                        this.ensureCardsIsMutable();
                        this.cards_.add(var5);
                     } else {
                        this.cardsBuilder_.addMessage(var5);
                     }
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
      public String getSectionId() {
         Object var1 = this.sectionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.sectionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSectionIdBytes() {
         Object var1 = this.sectionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.sectionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerSectionCardsPush.Builder setSectionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sectionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerSectionCardsPush.Builder clearSectionId() {
         this.sectionId_ = ServerSectionCardsPush.getDefaultInstance().getSectionId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ServerSectionCardsPush.Builder setSectionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerSectionCardsPush.checkByteStringIsUtf8(var1);
         this.sectionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      private void ensureCardsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.cards_ = new ArrayList<>(this.cards_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<ServerCard> getCardsList() {
         return this.cardsBuilder_ == null ? Collections.unmodifiableList(this.cards_) : this.cardsBuilder_.getMessageList();
      }

      @Override
      public int getCardsCount() {
         return this.cardsBuilder_ == null ? this.cards_.size() : this.cardsBuilder_.getCount();
      }

      @Override
      public ServerCard getCards(int var1) {
         return this.cardsBuilder_ == null ? this.cards_.get(var1) : this.cardsBuilder_.getMessage(var1);
      }

      public ServerSectionCardsPush.Builder setCards(int var1, ServerCard var2) {
         if (this.cardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCardsIsMutable();
            this.cards_.set(var1, var2);
            this.onChanged();
         } else {
            this.cardsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ServerSectionCardsPush.Builder setCards(int var1, ServerCard.Builder var2) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.cardsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ServerSectionCardsPush.Builder addCards(ServerCard var1) {
         if (this.cardsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureCardsIsMutable();
            this.cards_.add(var1);
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ServerSectionCardsPush.Builder addCards(int var1, ServerCard var2) {
         if (this.cardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCardsIsMutable();
            this.cards_.add(var1, var2);
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ServerSectionCardsPush.Builder addCards(ServerCard.Builder var1) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.add(var1.build());
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ServerSectionCardsPush.Builder addCards(int var1, ServerCard.Builder var2) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ServerSectionCardsPush.Builder addAllCards(Iterable<? extends ServerCard> var1) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.cards_);
            this.onChanged();
         } else {
            this.cardsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ServerSectionCardsPush.Builder clearCards() {
         if (this.cardsBuilder_ == null) {
            this.cards_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.cardsBuilder_.clear();
         }

         return this;
      }

      public ServerSectionCardsPush.Builder removeCards(int var1) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.remove(var1);
            this.onChanged();
         } else {
            this.cardsBuilder_.remove(var1);
         }

         return this;
      }

      public ServerCard.Builder getCardsBuilder(int var1) {
         return this.getCardsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerCardOrBuilder getCardsOrBuilder(int var1) {
         return this.cardsBuilder_ == null ? this.cards_.get(var1) : this.cardsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerCardOrBuilder> getCardsOrBuilderList() {
         return this.cardsBuilder_ != null ? this.cardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cards_);
      }

      public ServerCard.Builder addCardsBuilder() {
         return this.getCardsFieldBuilder().addBuilder(ServerCard.getDefaultInstance());
      }

      public ServerCard.Builder addCardsBuilder(int var1) {
         return this.getCardsFieldBuilder().addBuilder(var1, ServerCard.getDefaultInstance());
      }

      public List<ServerCard.Builder> getCardsBuilderList() {
         return this.getCardsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> getCardsFieldBuilder() {
         if (this.cardsBuilder_ == null) {
            this.cardsBuilder_ = new RepeatedFieldBuilderV3<>(this.cards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.cards_ = null;
         }

         return this.cardsBuilder_;
      }

      public final ServerSectionCardsPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerSectionCardsPush.Builder)super.setUnknownFields(var1);
      }

      public final ServerSectionCardsPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerSectionCardsPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
