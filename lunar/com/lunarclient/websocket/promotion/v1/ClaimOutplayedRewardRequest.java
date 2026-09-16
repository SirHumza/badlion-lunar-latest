package com.lunarclient.websocket.promotion.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ClaimOutplayedRewardRequest extends GeneratedMessageV3 implements ClaimOutplayedRewardRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int INITIATOR_FIELD_NUMBER = 1;
   private int initiator_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ClaimOutplayedRewardRequest DEFAULT_INSTANCE = new ClaimOutplayedRewardRequest();
   private static final Parser<ClaimOutplayedRewardRequest> PARSER = new AbstractParser<ClaimOutplayedRewardRequest>() {
      public ClaimOutplayedRewardRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClaimOutplayedRewardRequest.Builder var3 = ClaimOutplayedRewardRequest.newBuilder();

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

   private ClaimOutplayedRewardRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClaimOutplayedRewardRequest() {
      this.initiator_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClaimOutplayedRewardRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClaimOutplayedRewardRequest.class, ClaimOutplayedRewardRequest.Builder.class);
   }

   @Override
   public int getInitiatorValue() {
      return this.initiator_;
   }

   @Override
   public ClaimOutplayedRewardRequest.Initiator getInitiator() {
      ClaimOutplayedRewardRequest.Initiator var1 = ClaimOutplayedRewardRequest.Initiator.forNumber(this.initiator_);
      return var1 == null ? ClaimOutplayedRewardRequest.Initiator.UNRECOGNIZED : var1;
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
      if (this.initiator_ != ClaimOutplayedRewardRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.initiator_);
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
      if (this.initiator_ != ClaimOutplayedRewardRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.initiator_);
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

      if (!(var1 instanceof ClaimOutplayedRewardRequest)) {
         return super.equals(var1);
      }

      ClaimOutplayedRewardRequest var2 = (ClaimOutplayedRewardRequest)var1;
      return this.initiator_ != var2.initiator_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.initiator_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ClaimOutplayedRewardRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimOutplayedRewardRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimOutplayedRewardRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimOutplayedRewardRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimOutplayedRewardRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimOutplayedRewardRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimOutplayedRewardRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimOutplayedRewardRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClaimOutplayedRewardRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClaimOutplayedRewardRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClaimOutplayedRewardRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimOutplayedRewardRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClaimOutplayedRewardRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClaimOutplayedRewardRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClaimOutplayedRewardRequest.Builder newBuilder(ClaimOutplayedRewardRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClaimOutplayedRewardRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClaimOutplayedRewardRequest.Builder() : new ClaimOutplayedRewardRequest.Builder().mergeFrom(this);
   }

   protected ClaimOutplayedRewardRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClaimOutplayedRewardRequest.Builder(var1);
   }

   public static ClaimOutplayedRewardRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClaimOutplayedRewardRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClaimOutplayedRewardRequest> getParserForType() {
      return PARSER;
   }

   public ClaimOutplayedRewardRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ClaimOutplayedRewardRequest.Builder> implements ClaimOutplayedRewardRequestOrBuilder {
      private int bitField0_;
      private int initiator_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClaimOutplayedRewardRequest.class, ClaimOutplayedRewardRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ClaimOutplayedRewardRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.initiator_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardRequest_descriptor;
      }

      public ClaimOutplayedRewardRequest getDefaultInstanceForType() {
         return ClaimOutplayedRewardRequest.getDefaultInstance();
      }

      public ClaimOutplayedRewardRequest build() {
         ClaimOutplayedRewardRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClaimOutplayedRewardRequest buildPartial() {
         ClaimOutplayedRewardRequest var1 = new ClaimOutplayedRewardRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClaimOutplayedRewardRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.initiator_ = this.initiator_;
         }
      }

      public ClaimOutplayedRewardRequest.Builder clone() {
         return (ClaimOutplayedRewardRequest.Builder)super.clone();
      }

      public ClaimOutplayedRewardRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimOutplayedRewardRequest.Builder)super.setField(var1, var2);
      }

      public ClaimOutplayedRewardRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClaimOutplayedRewardRequest.Builder)super.clearField(var1);
      }

      public ClaimOutplayedRewardRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClaimOutplayedRewardRequest.Builder)super.clearOneof(var1);
      }

      public ClaimOutplayedRewardRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClaimOutplayedRewardRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClaimOutplayedRewardRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimOutplayedRewardRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public ClaimOutplayedRewardRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClaimOutplayedRewardRequest) {
            return this.mergeFrom((ClaimOutplayedRewardRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClaimOutplayedRewardRequest.Builder mergeFrom(ClaimOutplayedRewardRequest var1) {
         if (var1 == ClaimOutplayedRewardRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.initiator_ != 0) {
            this.setInitiatorValue(var1.getInitiatorValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ClaimOutplayedRewardRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.initiator_ = var1.readEnum();
                     this.bitField0_ |= 1;
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
      public int getInitiatorValue() {
         return this.initiator_;
      }

      public ClaimOutplayedRewardRequest.Builder setInitiatorValue(int var1) {
         this.initiator_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ClaimOutplayedRewardRequest.Initiator getInitiator() {
         ClaimOutplayedRewardRequest.Initiator var1 = ClaimOutplayedRewardRequest.Initiator.forNumber(this.initiator_);
         return var1 == null ? ClaimOutplayedRewardRequest.Initiator.UNRECOGNIZED : var1;
      }

      public ClaimOutplayedRewardRequest.Builder setInitiator(ClaimOutplayedRewardRequest.Initiator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.initiator_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ClaimOutplayedRewardRequest.Builder clearInitiator() {
         this.bitField0_ &= -2;
         this.initiator_ = 0;
         this.onChanged();
         return this;
      }

      public final ClaimOutplayedRewardRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClaimOutplayedRewardRequest.Builder)super.setUnknownFields(var1);
      }

      public final ClaimOutplayedRewardRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClaimOutplayedRewardRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Initiator implements ProtocolMessageEnum {
      INITIATOR_UNSPECIFIED(0),
      INITIATOR_TOPBAR(1),
      INITIATOR_SIDEBAR(2),
      INITIATOR_HOME_BLOG_POST(3),
      INITIATOR_ANNOUNCEMENT(4),
      INITIATOR_HOME_CAROUSEL_CTA(5),
      INITIATOR_GAME_HOME_CTA(6),
      UNRECOGNIZED(-1);

      public static final int INITIATOR_UNSPECIFIED_VALUE = 0;
      public static final int INITIATOR_TOPBAR_VALUE = 1;
      public static final int INITIATOR_SIDEBAR_VALUE = 2;
      public static final int INITIATOR_HOME_BLOG_POST_VALUE = 3;
      public static final int INITIATOR_ANNOUNCEMENT_VALUE = 4;
      public static final int INITIATOR_HOME_CAROUSEL_CTA_VALUE = 5;
      public static final int INITIATOR_GAME_HOME_CTA_VALUE = 6;
      private static final Internal.EnumLiteMap<ClaimOutplayedRewardRequest.Initiator> internalValueMap = new Internal.EnumLiteMap<ClaimOutplayedRewardRequest.Initiator>() {
         public ClaimOutplayedRewardRequest.Initiator findValueByNumber(int var1) {
            return ClaimOutplayedRewardRequest.Initiator.forNumber(var1);
         }
      };
      private static final ClaimOutplayedRewardRequest.Initiator[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static ClaimOutplayedRewardRequest.Initiator valueOf(int var0) {
         return forNumber(var0);
      }

      public static ClaimOutplayedRewardRequest.Initiator forNumber(int var0) {
         switch (var0) {
            case 0:
               return INITIATOR_UNSPECIFIED;
            case 1:
               return INITIATOR_TOPBAR;
            case 2:
               return INITIATOR_SIDEBAR;
            case 3:
               return INITIATOR_HOME_BLOG_POST;
            case 4:
               return INITIATOR_ANNOUNCEMENT;
            case 5:
               return INITIATOR_HOME_CAROUSEL_CTA;
            case 6:
               return INITIATOR_GAME_HOME_CTA;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ClaimOutplayedRewardRequest.Initiator> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return ClaimOutplayedRewardRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static ClaimOutplayedRewardRequest.Initiator valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Initiator(int var3) {
         this.value = var3;
      }
   }
}
