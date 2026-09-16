package com.lunarclient.apollo.evnt.v1;

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

public final class OverrideCharacterAbilityMessage extends GeneratedMessageV3 implements OverrideCharacterAbilityMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ABILITIES_FIELD_NUMBER = 1;
   private List<CharacterAbilityMessage> abilities_;
   private byte memoizedIsInitialized = -1;
   private static final OverrideCharacterAbilityMessage DEFAULT_INSTANCE = new OverrideCharacterAbilityMessage();
   private static final Parser<OverrideCharacterAbilityMessage> PARSER = new AbstractParser<OverrideCharacterAbilityMessage>() {
      public OverrideCharacterAbilityMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideCharacterAbilityMessage.Builder var3 = OverrideCharacterAbilityMessage.newBuilder();

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

   private OverrideCharacterAbilityMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideCharacterAbilityMessage() {
      this.abilities_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideCharacterAbilityMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideCharacterAbilityMessage.class, OverrideCharacterAbilityMessage.Builder.class);
   }

   @Override
   public List<CharacterAbilityMessage> getAbilitiesList() {
      return this.abilities_;
   }

   @Override
   public List<? extends CharacterAbilityMessageOrBuilder> getAbilitiesOrBuilderList() {
      return this.abilities_;
   }

   @Override
   public int getAbilitiesCount() {
      return this.abilities_.size();
   }

   @Override
   public CharacterAbilityMessage getAbilities(int var1) {
      return this.abilities_.get(var1);
   }

   @Override
   public CharacterAbilityMessageOrBuilder getAbilitiesOrBuilder(int var1) {
      return this.abilities_.get(var1);
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
      for (int var2 = 0; var2 < this.abilities_.size(); var2++) {
         var1.writeMessage(1, this.abilities_.get(var2));
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

      for (int var2 = 0; var2 < this.abilities_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.abilities_.get(var2));
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

      if (!(var1 instanceof OverrideCharacterAbilityMessage)) {
         return super.equals(var1);
      }

      OverrideCharacterAbilityMessage var2 = (OverrideCharacterAbilityMessage)var1;
      return !this.getAbilitiesList().equals(var2.getAbilitiesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getAbilitiesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getAbilitiesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideCharacterAbilityMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterAbilityMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterAbilityMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterAbilityMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterAbilityMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterAbilityMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterAbilityMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterAbilityMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterAbilityMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideCharacterAbilityMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterAbilityMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterAbilityMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideCharacterAbilityMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideCharacterAbilityMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideCharacterAbilityMessage.Builder newBuilder(OverrideCharacterAbilityMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideCharacterAbilityMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideCharacterAbilityMessage.Builder() : new OverrideCharacterAbilityMessage.Builder().mergeFrom(this);
   }

   protected OverrideCharacterAbilityMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideCharacterAbilityMessage.Builder(var1);
   }

   public static OverrideCharacterAbilityMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideCharacterAbilityMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideCharacterAbilityMessage> getParserForType() {
      return PARSER;
   }

   public OverrideCharacterAbilityMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OverrideCharacterAbilityMessage.Builder>
      implements OverrideCharacterAbilityMessageOrBuilder {
      private int bitField0_;
      private List<CharacterAbilityMessage> abilities_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<CharacterAbilityMessage, CharacterAbilityMessage.Builder, CharacterAbilityMessageOrBuilder> abilitiesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideCharacterAbilityMessage.class, OverrideCharacterAbilityMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OverrideCharacterAbilityMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.abilitiesBuilder_ == null) {
            this.abilities_ = Collections.emptyList();
         } else {
            this.abilities_ = null;
            this.abilitiesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_descriptor;
      }

      public OverrideCharacterAbilityMessage getDefaultInstanceForType() {
         return OverrideCharacterAbilityMessage.getDefaultInstance();
      }

      public OverrideCharacterAbilityMessage build() {
         OverrideCharacterAbilityMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideCharacterAbilityMessage buildPartial() {
         OverrideCharacterAbilityMessage var1 = new OverrideCharacterAbilityMessage(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(OverrideCharacterAbilityMessage var1) {
         if (this.abilitiesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.abilities_ = Collections.unmodifiableList(this.abilities_);
               this.bitField0_ &= -2;
            }

            var1.abilities_ = this.abilities_;
         } else {
            var1.abilities_ = this.abilitiesBuilder_.build();
         }
      }

      private void buildPartial0(OverrideCharacterAbilityMessage var1) {
         int var2 = this.bitField0_;
      }

      public OverrideCharacterAbilityMessage.Builder clone() {
         return (OverrideCharacterAbilityMessage.Builder)super.clone();
      }

      public OverrideCharacterAbilityMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterAbilityMessage.Builder)super.setField(var1, var2);
      }

      public OverrideCharacterAbilityMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideCharacterAbilityMessage.Builder)super.clearField(var1);
      }

      public OverrideCharacterAbilityMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideCharacterAbilityMessage.Builder)super.clearOneof(var1);
      }

      public OverrideCharacterAbilityMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideCharacterAbilityMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideCharacterAbilityMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterAbilityMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideCharacterAbilityMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideCharacterAbilityMessage) {
            return this.mergeFrom((OverrideCharacterAbilityMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideCharacterAbilityMessage.Builder mergeFrom(OverrideCharacterAbilityMessage var1) {
         if (var1 == OverrideCharacterAbilityMessage.getDefaultInstance()) {
            return this;
         }

         if (this.abilitiesBuilder_ == null) {
            if (!var1.abilities_.isEmpty()) {
               if (this.abilities_.isEmpty()) {
                  this.abilities_ = var1.abilities_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureAbilitiesIsMutable();
                  this.abilities_.addAll(var1.abilities_);
               }

               this.onChanged();
            }
         } else if (!var1.abilities_.isEmpty()) {
            if (this.abilitiesBuilder_.isEmpty()) {
               this.abilitiesBuilder_.dispose();
               this.abilitiesBuilder_ = null;
               this.abilities_ = var1.abilities_;
               this.bitField0_ &= -2;
               this.abilitiesBuilder_ = OverrideCharacterAbilityMessage.alwaysUseFieldBuilders ? this.getAbilitiesFieldBuilder() : null;
            } else {
               this.abilitiesBuilder_.addAllMessages(var1.abilities_);
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

      public OverrideCharacterAbilityMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     CharacterAbilityMessage var5 = var1.readMessage(CharacterAbilityMessage.parser(), var2);
                     if (this.abilitiesBuilder_ == null) {
                        this.ensureAbilitiesIsMutable();
                        this.abilities_.add(var5);
                     } else {
                        this.abilitiesBuilder_.addMessage(var5);
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

      private void ensureAbilitiesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.abilities_ = new ArrayList<>(this.abilities_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<CharacterAbilityMessage> getAbilitiesList() {
         return this.abilitiesBuilder_ == null ? Collections.unmodifiableList(this.abilities_) : this.abilitiesBuilder_.getMessageList();
      }

      @Override
      public int getAbilitiesCount() {
         return this.abilitiesBuilder_ == null ? this.abilities_.size() : this.abilitiesBuilder_.getCount();
      }

      @Override
      public CharacterAbilityMessage getAbilities(int var1) {
         return this.abilitiesBuilder_ == null ? this.abilities_.get(var1) : this.abilitiesBuilder_.getMessage(var1);
      }

      public OverrideCharacterAbilityMessage.Builder setAbilities(int var1, CharacterAbilityMessage var2) {
         if (this.abilitiesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureAbilitiesIsMutable();
            this.abilities_.set(var1, var2);
            this.onChanged();
         } else {
            this.abilitiesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder setAbilities(int var1, CharacterAbilityMessage.Builder var2) {
         if (this.abilitiesBuilder_ == null) {
            this.ensureAbilitiesIsMutable();
            this.abilities_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.abilitiesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder addAbilities(CharacterAbilityMessage var1) {
         if (this.abilitiesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureAbilitiesIsMutable();
            this.abilities_.add(var1);
            this.onChanged();
         } else {
            this.abilitiesBuilder_.addMessage(var1);
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder addAbilities(int var1, CharacterAbilityMessage var2) {
         if (this.abilitiesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureAbilitiesIsMutable();
            this.abilities_.add(var1, var2);
            this.onChanged();
         } else {
            this.abilitiesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder addAbilities(CharacterAbilityMessage.Builder var1) {
         if (this.abilitiesBuilder_ == null) {
            this.ensureAbilitiesIsMutable();
            this.abilities_.add(var1.build());
            this.onChanged();
         } else {
            this.abilitiesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder addAbilities(int var1, CharacterAbilityMessage.Builder var2) {
         if (this.abilitiesBuilder_ == null) {
            this.ensureAbilitiesIsMutable();
            this.abilities_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.abilitiesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder addAllAbilities(Iterable<? extends CharacterAbilityMessage> var1) {
         if (this.abilitiesBuilder_ == null) {
            this.ensureAbilitiesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.abilities_);
            this.onChanged();
         } else {
            this.abilitiesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder clearAbilities() {
         if (this.abilitiesBuilder_ == null) {
            this.abilities_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.abilitiesBuilder_.clear();
         }

         return this;
      }

      public OverrideCharacterAbilityMessage.Builder removeAbilities(int var1) {
         if (this.abilitiesBuilder_ == null) {
            this.ensureAbilitiesIsMutable();
            this.abilities_.remove(var1);
            this.onChanged();
         } else {
            this.abilitiesBuilder_.remove(var1);
         }

         return this;
      }

      public CharacterAbilityMessage.Builder getAbilitiesBuilder(int var1) {
         return this.getAbilitiesFieldBuilder().getBuilder(var1);
      }

      @Override
      public CharacterAbilityMessageOrBuilder getAbilitiesOrBuilder(int var1) {
         return this.abilitiesBuilder_ == null ? this.abilities_.get(var1) : this.abilitiesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends CharacterAbilityMessageOrBuilder> getAbilitiesOrBuilderList() {
         return this.abilitiesBuilder_ != null ? this.abilitiesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.abilities_);
      }

      public CharacterAbilityMessage.Builder addAbilitiesBuilder() {
         return this.getAbilitiesFieldBuilder().addBuilder(CharacterAbilityMessage.getDefaultInstance());
      }

      public CharacterAbilityMessage.Builder addAbilitiesBuilder(int var1) {
         return this.getAbilitiesFieldBuilder().addBuilder(var1, CharacterAbilityMessage.getDefaultInstance());
      }

      public List<CharacterAbilityMessage.Builder> getAbilitiesBuilderList() {
         return this.getAbilitiesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<CharacterAbilityMessage, CharacterAbilityMessage.Builder, CharacterAbilityMessageOrBuilder> getAbilitiesFieldBuilder() {
         if (this.abilitiesBuilder_ == null) {
            this.abilitiesBuilder_ = new RepeatedFieldBuilderV3<>(this.abilities_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.abilities_ = null;
         }

         return this.abilitiesBuilder_;
      }

      public final OverrideCharacterAbilityMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterAbilityMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideCharacterAbilityMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterAbilityMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
