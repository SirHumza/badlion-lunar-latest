package com.lunarclient.websocket.legacyapi.v1;

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

public final class RecordDeprecatedApiUsageRequest extends GeneratedMessageV3 implements RecordDeprecatedApiUsageRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FEATURE_FIELD_NUMBER = 1;
   private int feature_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RecordDeprecatedApiUsageRequest DEFAULT_INSTANCE = new RecordDeprecatedApiUsageRequest();
   private static final Parser<RecordDeprecatedApiUsageRequest> PARSER = new AbstractParser<RecordDeprecatedApiUsageRequest>() {
      public RecordDeprecatedApiUsageRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecordDeprecatedApiUsageRequest.Builder var3 = RecordDeprecatedApiUsageRequest.newBuilder();

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

   private RecordDeprecatedApiUsageRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecordDeprecatedApiUsageRequest() {
      this.feature_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecordDeprecatedApiUsageRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecordDeprecatedApiUsageRequest.class, RecordDeprecatedApiUsageRequest.Builder.class);
   }

   @Override
   public int getFeatureValue() {
      return this.feature_;
   }

   @Override
   public RecordDeprecatedApiUsageRequest.Feature getFeature() {
      RecordDeprecatedApiUsageRequest.Feature var1 = RecordDeprecatedApiUsageRequest.Feature.forNumber(this.feature_);
      return var1 == null ? RecordDeprecatedApiUsageRequest.Feature.UNRECOGNIZED : var1;
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
      if (this.feature_ != RecordDeprecatedApiUsageRequest.Feature.FEATURE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.feature_);
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
      if (this.feature_ != RecordDeprecatedApiUsageRequest.Feature.FEATURE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.feature_);
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

      if (!(var1 instanceof RecordDeprecatedApiUsageRequest)) {
         return super.equals(var1);
      }

      RecordDeprecatedApiUsageRequest var2 = (RecordDeprecatedApiUsageRequest)var1;
      return this.feature_ != var2.feature_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.feature_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecordDeprecatedApiUsageRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecordDeprecatedApiUsageRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordDeprecatedApiUsageRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecordDeprecatedApiUsageRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecordDeprecatedApiUsageRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecordDeprecatedApiUsageRequest.Builder newBuilder(RecordDeprecatedApiUsageRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecordDeprecatedApiUsageRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecordDeprecatedApiUsageRequest.Builder() : new RecordDeprecatedApiUsageRequest.Builder().mergeFrom(this);
   }

   protected RecordDeprecatedApiUsageRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecordDeprecatedApiUsageRequest.Builder(var1);
   }

   public static RecordDeprecatedApiUsageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecordDeprecatedApiUsageRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecordDeprecatedApiUsageRequest> getParserForType() {
      return PARSER;
   }

   public RecordDeprecatedApiUsageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<RecordDeprecatedApiUsageRequest.Builder>
      implements RecordDeprecatedApiUsageRequestOrBuilder {
      private int bitField0_;
      private int feature_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordDeprecatedApiUsageRequest.class, RecordDeprecatedApiUsageRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RecordDeprecatedApiUsageRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.feature_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_descriptor;
      }

      public RecordDeprecatedApiUsageRequest getDefaultInstanceForType() {
         return RecordDeprecatedApiUsageRequest.getDefaultInstance();
      }

      public RecordDeprecatedApiUsageRequest build() {
         RecordDeprecatedApiUsageRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecordDeprecatedApiUsageRequest buildPartial() {
         RecordDeprecatedApiUsageRequest var1 = new RecordDeprecatedApiUsageRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RecordDeprecatedApiUsageRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.feature_ = this.feature_;
         }
      }

      public RecordDeprecatedApiUsageRequest.Builder clone() {
         return (RecordDeprecatedApiUsageRequest.Builder)super.clone();
      }

      public RecordDeprecatedApiUsageRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.setField(var1, var2);
      }

      public RecordDeprecatedApiUsageRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.clearField(var1);
      }

      public RecordDeprecatedApiUsageRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.clearOneof(var1);
      }

      public RecordDeprecatedApiUsageRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecordDeprecatedApiUsageRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RecordDeprecatedApiUsageRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecordDeprecatedApiUsageRequest) {
            return this.mergeFrom((RecordDeprecatedApiUsageRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecordDeprecatedApiUsageRequest.Builder mergeFrom(RecordDeprecatedApiUsageRequest var1) {
         if (var1 == RecordDeprecatedApiUsageRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.feature_ != 0) {
            this.setFeatureValue(var1.getFeatureValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RecordDeprecatedApiUsageRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.feature_ = var1.readEnum();
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
      public int getFeatureValue() {
         return this.feature_;
      }

      public RecordDeprecatedApiUsageRequest.Builder setFeatureValue(int var1) {
         this.feature_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public RecordDeprecatedApiUsageRequest.Feature getFeature() {
         RecordDeprecatedApiUsageRequest.Feature var1 = RecordDeprecatedApiUsageRequest.Feature.forNumber(this.feature_);
         return var1 == null ? RecordDeprecatedApiUsageRequest.Feature.UNRECOGNIZED : var1;
      }

      public RecordDeprecatedApiUsageRequest.Builder setFeature(RecordDeprecatedApiUsageRequest.Feature var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.feature_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordDeprecatedApiUsageRequest.Builder clearFeature() {
         this.bitField0_ &= -2;
         this.feature_ = 0;
         this.onChanged();
         return this;
      }

      public final RecordDeprecatedApiUsageRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.setUnknownFields(var1);
      }

      public final RecordDeprecatedApiUsageRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecordDeprecatedApiUsageRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Feature implements ProtocolMessageEnum {
      FEATURE_UNSPECIFIED(0),
      FEATURE_TRANSFER_PACKET(1),
      FEATURE_BOSS_BAR(2),
      FEATURE_VOICE(3),
      FEATURE_COOLDOWN(4),
      FEATURE_GHOST(5),
      FEATURE_HOLOGRAM(6),
      FEATURE_MOD_SETTINGS(7),
      FEATURE_NAMETAGS(8),
      FEATURE_NOTIFICATION(9),
      FEATURE_SERVER_RULE(10),
      FEATURE_SERVER_UPDATE(11),
      FEATURE_STAFF_MOD(12),
      FEATURE_TEAMMATES(13),
      FEATURE_TITLE(14),
      FEATURE_WORLD(15),
      FEATURE_WORLD_BORDER(16),
      FEATURE_WAYPOINT(17),
      FEATURE_EMOTE(18),
      UNRECOGNIZED(-1);

      public static final int FEATURE_UNSPECIFIED_VALUE = 0;
      public static final int FEATURE_TRANSFER_PACKET_VALUE = 1;
      public static final int FEATURE_BOSS_BAR_VALUE = 2;
      public static final int FEATURE_VOICE_VALUE = 3;
      public static final int FEATURE_COOLDOWN_VALUE = 4;
      public static final int FEATURE_GHOST_VALUE = 5;
      public static final int FEATURE_HOLOGRAM_VALUE = 6;
      public static final int FEATURE_MOD_SETTINGS_VALUE = 7;
      public static final int FEATURE_NAMETAGS_VALUE = 8;
      public static final int FEATURE_NOTIFICATION_VALUE = 9;
      public static final int FEATURE_SERVER_RULE_VALUE = 10;
      public static final int FEATURE_SERVER_UPDATE_VALUE = 11;
      public static final int FEATURE_STAFF_MOD_VALUE = 12;
      public static final int FEATURE_TEAMMATES_VALUE = 13;
      public static final int FEATURE_TITLE_VALUE = 14;
      public static final int FEATURE_WORLD_VALUE = 15;
      public static final int FEATURE_WORLD_BORDER_VALUE = 16;
      public static final int FEATURE_WAYPOINT_VALUE = 17;
      public static final int FEATURE_EMOTE_VALUE = 18;
      private static final Internal.EnumLiteMap<RecordDeprecatedApiUsageRequest.Feature> internalValueMap = new Internal.EnumLiteMap<RecordDeprecatedApiUsageRequest.Feature>() {
         public RecordDeprecatedApiUsageRequest.Feature findValueByNumber(int var1) {
            return RecordDeprecatedApiUsageRequest.Feature.forNumber(var1);
         }
      };
      private static final RecordDeprecatedApiUsageRequest.Feature[] VALUES = values();
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
      public static RecordDeprecatedApiUsageRequest.Feature valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordDeprecatedApiUsageRequest.Feature forNumber(int var0) {
         switch (var0) {
            case 0:
               return FEATURE_UNSPECIFIED;
            case 1:
               return FEATURE_TRANSFER_PACKET;
            case 2:
               return FEATURE_BOSS_BAR;
            case 3:
               return FEATURE_VOICE;
            case 4:
               return FEATURE_COOLDOWN;
            case 5:
               return FEATURE_GHOST;
            case 6:
               return FEATURE_HOLOGRAM;
            case 7:
               return FEATURE_MOD_SETTINGS;
            case 8:
               return FEATURE_NAMETAGS;
            case 9:
               return FEATURE_NOTIFICATION;
            case 10:
               return FEATURE_SERVER_RULE;
            case 11:
               return FEATURE_SERVER_UPDATE;
            case 12:
               return FEATURE_STAFF_MOD;
            case 13:
               return FEATURE_TEAMMATES;
            case 14:
               return FEATURE_TITLE;
            case 15:
               return FEATURE_WORLD;
            case 16:
               return FEATURE_WORLD_BORDER;
            case 17:
               return FEATURE_WAYPOINT;
            case 18:
               return FEATURE_EMOTE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordDeprecatedApiUsageRequest.Feature> internalGetValueMap() {
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
         return RecordDeprecatedApiUsageRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static RecordDeprecatedApiUsageRequest.Feature valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Feature(int var3) {
         this.value = var3;
      }
   }
}
