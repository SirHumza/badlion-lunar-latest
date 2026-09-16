package com.lunarclient.common.v1;

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

public final class UserSocial extends GeneratedMessageV3 implements UserSocialOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLATFORM_FIELD_NUMBER = 1;
   private int platform_ = 0;
   public static final int USERNAME_FIELD_NUMBER = 2;
   private volatile Object username_ = "";
   public static final int AVATAR_FIELD_NUMBER = 3;
   private volatile Object avatar_ = "";
   private byte memoizedIsInitialized = -1;
   private static final UserSocial DEFAULT_INSTANCE = new UserSocial();
   private static final Parser<UserSocial> PARSER = new AbstractParser<UserSocial>() {
      public UserSocial parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UserSocial.Builder var3 = UserSocial.newBuilder();

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

   private UserSocial(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UserSocial() {
      this.platform_ = 0;
      this.username_ = "";
      this.avatar_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UserSocial();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SocialProto.internal_static_lunarclient_common_v1_UserSocial_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SocialProto.internal_static_lunarclient_common_v1_UserSocial_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UserSocial.class, UserSocial.Builder.class);
   }

   @Override
   public int getPlatformValue() {
      return this.platform_;
   }

   @Override
   public UserSocialPlatform getPlatform() {
      UserSocialPlatform var1 = UserSocialPlatform.forNumber(this.platform_);
      return var1 == null ? UserSocialPlatform.UNRECOGNIZED : var1;
   }

   @Override
   public String getUsername() {
      Object var1 = this.username_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.username_ = var3;
      return var3;
   }

   @Override
   public ByteString getUsernameBytes() {
      Object var1 = this.username_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.username_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getAvatar() {
      Object var1 = this.avatar_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.avatar_ = var3;
      return var3;
   }

   @Override
   public ByteString getAvatarBytes() {
      Object var1 = this.avatar_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.avatar_ = var2;
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
      if (this.platform_ != UserSocialPlatform.USER_SOCIAL_PLATFORM_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.platform_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.username_)) {
         GeneratedMessageV3.writeString(var1, 2, this.username_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.avatar_)) {
         GeneratedMessageV3.writeString(var1, 3, this.avatar_);
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
      if (this.platform_ != UserSocialPlatform.USER_SOCIAL_PLATFORM_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.platform_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.username_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.username_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.avatar_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.avatar_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UserSocial)) {
         return super.equals(var1);
      } else {
         UserSocial var2 = (UserSocial)var1;
         if (this.platform_ != var2.platform_) {
            return false;
         } else if (!this.getUsername().equals(var2.getUsername())) {
            return false;
         } else {
            return !this.getAvatar().equals(var2.getAvatar()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.platform_;
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getUsername().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getAvatar().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UserSocial parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UserSocial parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UserSocial parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UserSocial parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UserSocial parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UserSocial parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UserSocial parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserSocial parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserSocial parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserSocial parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserSocial parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserSocial parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UserSocial.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UserSocial.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserSocial.Builder newBuilder(UserSocial var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UserSocial.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UserSocial.Builder() : new UserSocial.Builder().mergeFrom(this);
   }

   protected UserSocial.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UserSocial.Builder(var1);
   }

   public static UserSocial getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UserSocial> parser() {
      return PARSER;
   }

   @Override
   public Parser<UserSocial> getParserForType() {
      return PARSER;
   }

   public UserSocial getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UserSocial.Builder> implements UserSocialOrBuilder {
      private int bitField0_;
      private int platform_ = 0;
      private Object username_ = "";
      private Object avatar_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SocialProto.internal_static_lunarclient_common_v1_UserSocial_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SocialProto.internal_static_lunarclient_common_v1_UserSocial_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UserSocial.class, UserSocial.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UserSocial.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.platform_ = 0;
         this.username_ = "";
         this.avatar_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SocialProto.internal_static_lunarclient_common_v1_UserSocial_descriptor;
      }

      public UserSocial getDefaultInstanceForType() {
         return UserSocial.getDefaultInstance();
      }

      public UserSocial build() {
         UserSocial var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UserSocial buildPartial() {
         UserSocial var1 = new UserSocial(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UserSocial var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.platform_ = this.platform_;
         }

         if ((var2 & 2) != 0) {
            var1.username_ = this.username_;
         }

         if ((var2 & 4) != 0) {
            var1.avatar_ = this.avatar_;
         }
      }

      public UserSocial.Builder clone() {
         return (UserSocial.Builder)super.clone();
      }

      public UserSocial.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UserSocial.Builder)super.setField(var1, var2);
      }

      public UserSocial.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UserSocial.Builder)super.clearField(var1);
      }

      public UserSocial.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UserSocial.Builder)super.clearOneof(var1);
      }

      public UserSocial.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UserSocial.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UserSocial.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UserSocial.Builder)super.addRepeatedField(var1, var2);
      }

      public UserSocial.Builder mergeFrom(Message var1) {
         if (var1 instanceof UserSocial) {
            return this.mergeFrom((UserSocial)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UserSocial.Builder mergeFrom(UserSocial var1) {
         if (var1 == UserSocial.getDefaultInstance()) {
            return this;
         }

         if (var1.platform_ != 0) {
            this.setPlatformValue(var1.getPlatformValue());
         }

         if (!var1.getUsername().isEmpty()) {
            this.username_ = var1.username_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getAvatar().isEmpty()) {
            this.avatar_ = var1.avatar_;
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

      public UserSocial.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.platform_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.username_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.avatar_ = var1.readStringRequireUtf8();
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
      public int getPlatformValue() {
         return this.platform_;
      }

      public UserSocial.Builder setPlatformValue(int var1) {
         this.platform_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public UserSocialPlatform getPlatform() {
         UserSocialPlatform var1 = UserSocialPlatform.forNumber(this.platform_);
         return var1 == null ? UserSocialPlatform.UNRECOGNIZED : var1;
      }

      public UserSocial.Builder setPlatform(UserSocialPlatform var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.platform_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UserSocial.Builder clearPlatform() {
         this.bitField0_ &= -2;
         this.platform_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getUsername() {
         Object var1 = this.username_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.username_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUsernameBytes() {
         Object var1 = this.username_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.username_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UserSocial.Builder setUsername(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.username_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UserSocial.Builder clearUsername() {
         this.username_ = UserSocial.getDefaultInstance().getUsername();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public UserSocial.Builder setUsernameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UserSocial.checkByteStringIsUtf8(var1);
         this.username_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getAvatar() {
         Object var1 = this.avatar_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.avatar_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAvatarBytes() {
         Object var1 = this.avatar_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.avatar_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public UserSocial.Builder setAvatar(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.avatar_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UserSocial.Builder clearAvatar() {
         this.avatar_ = UserSocial.getDefaultInstance().getAvatar();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public UserSocial.Builder setAvatarBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UserSocial.checkByteStringIsUtf8(var1);
         this.avatar_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final UserSocial.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UserSocial.Builder)super.setUnknownFields(var1);
      }

      public final UserSocial.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UserSocial.Builder)super.mergeUnknownFields(var1);
      }
   }
}
