package com.lunarclient.apollo.pingmarker.v1;

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

public final class SetPingMarkerTypesMessage extends GeneratedMessageV3 implements SetPingMarkerTypesMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TYPES_FIELD_NUMBER = 1;
   private List<SetPingMarkerTypeMessage> types_;
   private byte memoizedIsInitialized = -1;
   private static final SetPingMarkerTypesMessage DEFAULT_INSTANCE = new SetPingMarkerTypesMessage();
   private static final Parser<SetPingMarkerTypesMessage> PARSER = new AbstractParser<SetPingMarkerTypesMessage>() {
      public SetPingMarkerTypesMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetPingMarkerTypesMessage.Builder var3 = SetPingMarkerTypesMessage.newBuilder();

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

   private SetPingMarkerTypesMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetPingMarkerTypesMessage() {
      this.types_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetPingMarkerTypesMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetPingMarkerTypesMessage.class, SetPingMarkerTypesMessage.Builder.class);
   }

   @Override
   public List<SetPingMarkerTypeMessage> getTypesList() {
      return this.types_;
   }

   @Override
   public List<? extends SetPingMarkerTypeMessageOrBuilder> getTypesOrBuilderList() {
      return this.types_;
   }

   @Override
   public int getTypesCount() {
      return this.types_.size();
   }

   @Override
   public SetPingMarkerTypeMessage getTypes(int var1) {
      return this.types_.get(var1);
   }

   @Override
   public SetPingMarkerTypeMessageOrBuilder getTypesOrBuilder(int var1) {
      return this.types_.get(var1);
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
      for (int var2 = 0; var2 < this.types_.size(); var2++) {
         var1.writeMessage(1, this.types_.get(var2));
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

      for (int var2 = 0; var2 < this.types_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.types_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof SetPingMarkerTypesMessage)) {
         return super.equals(var1);
      }

      SetPingMarkerTypesMessage var2 = (SetPingMarkerTypesMessage)var1;
      return !this.getTypesList().equals(var2.getTypesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getTypesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTypesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetPingMarkerTypesMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPingMarkerTypesMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPingMarkerTypesMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPingMarkerTypesMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPingMarkerTypesMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetPingMarkerTypesMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetPingMarkerTypesMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetPingMarkerTypesMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetPingMarkerTypesMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetPingMarkerTypesMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetPingMarkerTypesMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetPingMarkerTypesMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetPingMarkerTypesMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetPingMarkerTypesMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetPingMarkerTypesMessage.Builder newBuilder(SetPingMarkerTypesMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetPingMarkerTypesMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetPingMarkerTypesMessage.Builder() : new SetPingMarkerTypesMessage.Builder().mergeFrom(this);
   }

   protected SetPingMarkerTypesMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetPingMarkerTypesMessage.Builder(var1);
   }

   public static SetPingMarkerTypesMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetPingMarkerTypesMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetPingMarkerTypesMessage> getParserForType() {
      return PARSER;
   }

   public SetPingMarkerTypesMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetPingMarkerTypesMessage.Builder> implements SetPingMarkerTypesMessageOrBuilder {
      private int bitField0_;
      private List<SetPingMarkerTypeMessage> types_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<SetPingMarkerTypeMessage, SetPingMarkerTypeMessage.Builder, SetPingMarkerTypeMessageOrBuilder> typesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetPingMarkerTypesMessage.class, SetPingMarkerTypesMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetPingMarkerTypesMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.typesBuilder_ == null) {
            this.types_ = Collections.emptyList();
         } else {
            this.types_ = null;
            this.typesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_pingmarker_v1_SetPingMarkerTypesMessage_descriptor;
      }

      public SetPingMarkerTypesMessage getDefaultInstanceForType() {
         return SetPingMarkerTypesMessage.getDefaultInstance();
      }

      public SetPingMarkerTypesMessage build() {
         SetPingMarkerTypesMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetPingMarkerTypesMessage buildPartial() {
         SetPingMarkerTypesMessage var1 = new SetPingMarkerTypesMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(SetPingMarkerTypesMessage var1) {
         if (this.typesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.types_ = Collections.unmodifiableList(this.types_);
               this.bitField0_ &= -2;
            }

            var1.types_ = this.types_;
         } else {
            var1.types_ = this.typesBuilder_.build();
         }
      }

      private void buildPartial0(SetPingMarkerTypesMessage var1) {
         int var2 = this.bitField0_;
      }

      public SetPingMarkerTypesMessage.Builder clone() {
         return (SetPingMarkerTypesMessage.Builder)super.clone();
      }

      public SetPingMarkerTypesMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetPingMarkerTypesMessage.Builder)super.setField(var1, var2);
      }

      public SetPingMarkerTypesMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetPingMarkerTypesMessage.Builder)super.clearField(var1);
      }

      public SetPingMarkerTypesMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetPingMarkerTypesMessage.Builder)super.clearOneof(var1);
      }

      public SetPingMarkerTypesMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetPingMarkerTypesMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetPingMarkerTypesMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetPingMarkerTypesMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public SetPingMarkerTypesMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetPingMarkerTypesMessage) {
            return this.mergeFrom((SetPingMarkerTypesMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetPingMarkerTypesMessage.Builder mergeFrom(SetPingMarkerTypesMessage var1) {
         if (var1 == SetPingMarkerTypesMessage.getDefaultInstance()) {
            return this;
         }

         if (this.typesBuilder_ == null) {
            if (!var1.types_.isEmpty()) {
               if (this.types_.isEmpty()) {
                  this.types_ = var1.types_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureTypesIsMutable();
                  this.types_.addAll(var1.types_);
               }

               this.onChanged();
            }
         } else if (!var1.types_.isEmpty()) {
            if (this.typesBuilder_.isEmpty()) {
               this.typesBuilder_.dispose();
               this.typesBuilder_ = null;
               this.types_ = var1.types_;
               this.bitField0_ &= -2;
               this.typesBuilder_ = SetPingMarkerTypesMessage.alwaysUseFieldBuilders ? this.getTypesFieldBuilder() : null;
            } else {
               this.typesBuilder_.addAllMessages(var1.types_);
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

      public SetPingMarkerTypesMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     SetPingMarkerTypeMessage var5 = var1.readMessage(SetPingMarkerTypeMessage.parser(), var2);
                     if (this.typesBuilder_ == null) {
                        this.ensureTypesIsMutable();
                        this.types_.add(var5);
                     } else {
                        this.typesBuilder_.addMessage(var5);
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

      private void ensureTypesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.types_ = new ArrayList<>(this.types_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<SetPingMarkerTypeMessage> getTypesList() {
         return this.typesBuilder_ == null ? Collections.unmodifiableList(this.types_) : this.typesBuilder_.getMessageList();
      }

      @Override
      public int getTypesCount() {
         return this.typesBuilder_ == null ? this.types_.size() : this.typesBuilder_.getCount();
      }

      @Override
      public SetPingMarkerTypeMessage getTypes(int var1) {
         return this.typesBuilder_ == null ? this.types_.get(var1) : this.typesBuilder_.getMessage(var1);
      }

      public SetPingMarkerTypesMessage.Builder setTypes(int var1, SetPingMarkerTypeMessage var2) {
         if (this.typesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTypesIsMutable();
            this.types_.set(var1, var2);
            this.onChanged();
         } else {
            this.typesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder setTypes(int var1, SetPingMarkerTypeMessage.Builder var2) {
         if (this.typesBuilder_ == null) {
            this.ensureTypesIsMutable();
            this.types_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.typesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder addTypes(SetPingMarkerTypeMessage var1) {
         if (this.typesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTypesIsMutable();
            this.types_.add(var1);
            this.onChanged();
         } else {
            this.typesBuilder_.addMessage(var1);
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder addTypes(int var1, SetPingMarkerTypeMessage var2) {
         if (this.typesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTypesIsMutable();
            this.types_.add(var1, var2);
            this.onChanged();
         } else {
            this.typesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder addTypes(SetPingMarkerTypeMessage.Builder var1) {
         if (this.typesBuilder_ == null) {
            this.ensureTypesIsMutable();
            this.types_.add(var1.build());
            this.onChanged();
         } else {
            this.typesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder addTypes(int var1, SetPingMarkerTypeMessage.Builder var2) {
         if (this.typesBuilder_ == null) {
            this.ensureTypesIsMutable();
            this.types_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.typesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder addAllTypes(Iterable<? extends SetPingMarkerTypeMessage> var1) {
         if (this.typesBuilder_ == null) {
            this.ensureTypesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.types_);
            this.onChanged();
         } else {
            this.typesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder clearTypes() {
         if (this.typesBuilder_ == null) {
            this.types_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.typesBuilder_.clear();
         }

         return this;
      }

      public SetPingMarkerTypesMessage.Builder removeTypes(int var1) {
         if (this.typesBuilder_ == null) {
            this.ensureTypesIsMutable();
            this.types_.remove(var1);
            this.onChanged();
         } else {
            this.typesBuilder_.remove(var1);
         }

         return this;
      }

      public SetPingMarkerTypeMessage.Builder getTypesBuilder(int var1) {
         return this.getTypesFieldBuilder().getBuilder(var1);
      }

      @Override
      public SetPingMarkerTypeMessageOrBuilder getTypesOrBuilder(int var1) {
         return this.typesBuilder_ == null ? this.types_.get(var1) : this.typesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends SetPingMarkerTypeMessageOrBuilder> getTypesOrBuilderList() {
         return this.typesBuilder_ != null ? this.typesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.types_);
      }

      public SetPingMarkerTypeMessage.Builder addTypesBuilder() {
         return this.getTypesFieldBuilder().addBuilder(SetPingMarkerTypeMessage.getDefaultInstance());
      }

      public SetPingMarkerTypeMessage.Builder addTypesBuilder(int var1) {
         return this.getTypesFieldBuilder().addBuilder(var1, SetPingMarkerTypeMessage.getDefaultInstance());
      }

      public List<SetPingMarkerTypeMessage.Builder> getTypesBuilderList() {
         return this.getTypesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<SetPingMarkerTypeMessage, SetPingMarkerTypeMessage.Builder, SetPingMarkerTypeMessageOrBuilder> getTypesFieldBuilder() {
         if (this.typesBuilder_ == null) {
            this.typesBuilder_ = new RepeatedFieldBuilderV3<>(this.types_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.types_ = null;
         }

         return this.typesBuilder_;
      }

      public final SetPingMarkerTypesMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetPingMarkerTypesMessage.Builder)super.setUnknownFields(var1);
      }

      public final SetPingMarkerTypesMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetPingMarkerTypesMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
