package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UserSocial;
import com.lunarclient.common.v1.UserSocialOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FriendSocials extends GeneratedMessageV3 implements FriendSocialsOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int HIDDEN_FIELD_NUMBER = 1;
   private boolean hidden_ = false;
   public static final int LINKED_FIELD_NUMBER = 2;
   private List<UserSocial> linked_;
   private byte memoizedIsInitialized = -1;
   private static final FriendSocials DEFAULT_INSTANCE = new FriendSocials();
   private static final Parser<FriendSocials> PARSER = new AbstractParser<FriendSocials>() {
      public FriendSocials parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendSocials.Builder var3 = FriendSocials.newBuilder();

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

   private FriendSocials(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendSocials() {
      this.linked_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendSocials();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendSocials_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendSocials_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendSocials.class, FriendSocials.Builder.class);
   }

   @Override
   public boolean getHidden() {
      return this.hidden_;
   }

   @Override
   public List<UserSocial> getLinkedList() {
      return this.linked_;
   }

   @Override
   public List<? extends UserSocialOrBuilder> getLinkedOrBuilderList() {
      return this.linked_;
   }

   @Override
   public int getLinkedCount() {
      return this.linked_.size();
   }

   @Override
   public UserSocial getLinked(int var1) {
      return this.linked_.get(var1);
   }

   @Override
   public UserSocialOrBuilder getLinkedOrBuilder(int var1) {
      return this.linked_.get(var1);
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
      if (this.hidden_) {
         var1.writeBool(1, this.hidden_);
      }

      for (int var2 = 0; var2 < this.linked_.size(); var2++) {
         var1.writeMessage(2, this.linked_.get(var2));
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
      if (this.hidden_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.hidden_);
      }

      for (int var2 = 0; var2 < this.linked_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.linked_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendSocials)) {
         return super.equals(var1);
      } else {
         FriendSocials var2 = (FriendSocials)var1;
         if (this.getHidden() != var2.getHidden()) {
            return false;
         } else {
            return !this.getLinkedList().equals(var2.getLinkedList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getHidden());
      if (this.getLinkedCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLinkedList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendSocials parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendSocials parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendSocials parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendSocials parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendSocials parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendSocials parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendSocials parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendSocials parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendSocials parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendSocials parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendSocials parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendSocials parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendSocials.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendSocials.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendSocials.Builder newBuilder(FriendSocials var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendSocials.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendSocials.Builder() : new FriendSocials.Builder().mergeFrom(this);
   }

   protected FriendSocials.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendSocials.Builder(var1);
   }

   public static FriendSocials getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendSocials> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendSocials> getParserForType() {
      return PARSER;
   }

   public FriendSocials getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendSocials.Builder> implements FriendSocialsOrBuilder {
      private int bitField0_;
      private boolean hidden_;
      private List<UserSocial> linked_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<UserSocial, UserSocial.Builder, UserSocialOrBuilder> linkedBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendSocials_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendSocials_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendSocials.class, FriendSocials.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public FriendSocials.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.hidden_ = false;
         if (this.linkedBuilder_ == null) {
            this.linked_ = Collections.emptyList();
         } else {
            this.linked_ = null;
            this.linkedBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendSocials_descriptor;
      }

      public FriendSocials getDefaultInstanceForType() {
         return FriendSocials.getDefaultInstance();
      }

      public FriendSocials build() {
         FriendSocials var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendSocials buildPartial() {
         FriendSocials var1 = new FriendSocials(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(FriendSocials var1) {
         if (this.linkedBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.linked_ = Collections.unmodifiableList(this.linked_);
               this.bitField0_ &= -3;
            }

            var1.linked_ = this.linked_;
         } else {
            var1.linked_ = this.linkedBuilder_.build();
         }
      }

      private void buildPartial0(FriendSocials var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.hidden_ = this.hidden_;
         }
      }

      public FriendSocials.Builder clone() {
         return (FriendSocials.Builder)super.clone();
      }

      public FriendSocials.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendSocials.Builder)super.setField(var1, var2);
      }

      public FriendSocials.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendSocials.Builder)super.clearField(var1);
      }

      public FriendSocials.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendSocials.Builder)super.clearOneof(var1);
      }

      public FriendSocials.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendSocials.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendSocials.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendSocials.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendSocials.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendSocials) {
            return this.mergeFrom((FriendSocials)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendSocials.Builder mergeFrom(FriendSocials var1) {
         if (var1 == FriendSocials.getDefaultInstance()) {
            return this;
         }

         if (var1.getHidden()) {
            this.setHidden(var1.getHidden());
         }

         if (this.linkedBuilder_ == null) {
            if (!var1.linked_.isEmpty()) {
               if (this.linked_.isEmpty()) {
                  this.linked_ = var1.linked_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureLinkedIsMutable();
                  this.linked_.addAll(var1.linked_);
               }

               this.onChanged();
            }
         } else if (!var1.linked_.isEmpty()) {
            if (this.linkedBuilder_.isEmpty()) {
               this.linkedBuilder_.dispose();
               this.linkedBuilder_ = null;
               this.linked_ = var1.linked_;
               this.bitField0_ &= -3;
               this.linkedBuilder_ = FriendSocials.alwaysUseFieldBuilders ? this.getLinkedFieldBuilder() : null;
            } else {
               this.linkedBuilder_.addAllMessages(var1.linked_);
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

      public FriendSocials.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.hidden_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     UserSocial var5 = var1.readMessage(UserSocial.parser(), var2);
                     if (this.linkedBuilder_ == null) {
                        this.ensureLinkedIsMutable();
                        this.linked_.add(var5);
                     } else {
                        this.linkedBuilder_.addMessage(var5);
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
      public boolean getHidden() {
         return this.hidden_;
      }

      public FriendSocials.Builder setHidden(boolean var1) {
         this.hidden_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendSocials.Builder clearHidden() {
         this.bitField0_ &= -2;
         this.hidden_ = false;
         this.onChanged();
         return this;
      }

      private void ensureLinkedIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.linked_ = new ArrayList<>(this.linked_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<UserSocial> getLinkedList() {
         return this.linkedBuilder_ == null ? Collections.unmodifiableList(this.linked_) : this.linkedBuilder_.getMessageList();
      }

      @Override
      public int getLinkedCount() {
         return this.linkedBuilder_ == null ? this.linked_.size() : this.linkedBuilder_.getCount();
      }

      @Override
      public UserSocial getLinked(int var1) {
         return this.linkedBuilder_ == null ? this.linked_.get(var1) : this.linkedBuilder_.getMessage(var1);
      }

      public FriendSocials.Builder setLinked(int var1, UserSocial var2) {
         if (this.linkedBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureLinkedIsMutable();
            this.linked_.set(var1, var2);
            this.onChanged();
         } else {
            this.linkedBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public FriendSocials.Builder setLinked(int var1, UserSocial.Builder var2) {
         if (this.linkedBuilder_ == null) {
            this.ensureLinkedIsMutable();
            this.linked_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.linkedBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public FriendSocials.Builder addLinked(UserSocial var1) {
         if (this.linkedBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureLinkedIsMutable();
            this.linked_.add(var1);
            this.onChanged();
         } else {
            this.linkedBuilder_.addMessage(var1);
         }

         return this;
      }

      public FriendSocials.Builder addLinked(int var1, UserSocial var2) {
         if (this.linkedBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureLinkedIsMutable();
            this.linked_.add(var1, var2);
            this.onChanged();
         } else {
            this.linkedBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public FriendSocials.Builder addLinked(UserSocial.Builder var1) {
         if (this.linkedBuilder_ == null) {
            this.ensureLinkedIsMutable();
            this.linked_.add(var1.build());
            this.onChanged();
         } else {
            this.linkedBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public FriendSocials.Builder addLinked(int var1, UserSocial.Builder var2) {
         if (this.linkedBuilder_ == null) {
            this.ensureLinkedIsMutable();
            this.linked_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.linkedBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public FriendSocials.Builder addAllLinked(Iterable<? extends UserSocial> var1) {
         if (this.linkedBuilder_ == null) {
            this.ensureLinkedIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.linked_);
            this.onChanged();
         } else {
            this.linkedBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public FriendSocials.Builder clearLinked() {
         if (this.linkedBuilder_ == null) {
            this.linked_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.linkedBuilder_.clear();
         }

         return this;
      }

      public FriendSocials.Builder removeLinked(int var1) {
         if (this.linkedBuilder_ == null) {
            this.ensureLinkedIsMutable();
            this.linked_.remove(var1);
            this.onChanged();
         } else {
            this.linkedBuilder_.remove(var1);
         }

         return this;
      }

      public UserSocial.Builder getLinkedBuilder(int var1) {
         return this.getLinkedFieldBuilder().getBuilder(var1);
      }

      @Override
      public UserSocialOrBuilder getLinkedOrBuilder(int var1) {
         return this.linkedBuilder_ == null ? this.linked_.get(var1) : this.linkedBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UserSocialOrBuilder> getLinkedOrBuilderList() {
         return this.linkedBuilder_ != null ? this.linkedBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.linked_);
      }

      public UserSocial.Builder addLinkedBuilder() {
         return this.getLinkedFieldBuilder().addBuilder(UserSocial.getDefaultInstance());
      }

      public UserSocial.Builder addLinkedBuilder(int var1) {
         return this.getLinkedFieldBuilder().addBuilder(var1, UserSocial.getDefaultInstance());
      }

      public List<UserSocial.Builder> getLinkedBuilderList() {
         return this.getLinkedFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<UserSocial, UserSocial.Builder, UserSocialOrBuilder> getLinkedFieldBuilder() {
         if (this.linkedBuilder_ == null) {
            this.linkedBuilder_ = new RepeatedFieldBuilderV3<>(this.linked_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.linked_ = null;
         }

         return this.linkedBuilder_;
      }

      public final FriendSocials.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendSocials.Builder)super.setUnknownFields(var1);
      }

      public final FriendSocials.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendSocials.Builder)super.mergeUnknownFields(var1);
      }
   }
}
