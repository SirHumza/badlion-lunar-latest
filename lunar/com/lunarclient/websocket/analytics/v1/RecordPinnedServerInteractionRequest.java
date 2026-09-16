package com.lunarclient.websocket.analytics.v1;

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

public final class RecordPinnedServerInteractionRequest extends GeneratedMessageV3 implements RecordPinnedServerInteractionRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SERVER_IP_FIELD_NUMBER = 1;
   private volatile Object serverIp_ = "";
   public static final int INTERACTION_TYPE_FIELD_NUMBER = 2;
   private int interactionType_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RecordPinnedServerInteractionRequest DEFAULT_INSTANCE = new RecordPinnedServerInteractionRequest();
   private static final Parser<RecordPinnedServerInteractionRequest> PARSER = new AbstractParser<RecordPinnedServerInteractionRequest>() {
      public RecordPinnedServerInteractionRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecordPinnedServerInteractionRequest.Builder var3 = RecordPinnedServerInteractionRequest.newBuilder();

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

   private RecordPinnedServerInteractionRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecordPinnedServerInteractionRequest() {
      this.serverIp_ = "";
      this.interactionType_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecordPinnedServerInteractionRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecordPinnedServerInteractionRequest.class, RecordPinnedServerInteractionRequest.Builder.class);
   }

   @Override
   public String getServerIp() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerIpBytes() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverIp_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getInteractionTypeValue() {
      return this.interactionType_;
   }

   @Override
   public RecordPinnedServerInteractionRequest.InteractionType getInteractionType() {
      RecordPinnedServerInteractionRequest.InteractionType var1 = RecordPinnedServerInteractionRequest.InteractionType.forNumber(this.interactionType_);
      return var1 == null ? RecordPinnedServerInteractionRequest.InteractionType.UNRECOGNIZED : var1;
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         GeneratedMessageV3.writeString(var1, 1, this.serverIp_);
      }

      if (this.interactionType_ != RecordPinnedServerInteractionRequest.InteractionType.INTERACTION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.interactionType_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.serverIp_);
      }

      if (this.interactionType_ != RecordPinnedServerInteractionRequest.InteractionType.INTERACTION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.interactionType_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RecordPinnedServerInteractionRequest)) {
         return super.equals(var1);
      } else {
         RecordPinnedServerInteractionRequest var2 = (RecordPinnedServerInteractionRequest)var1;
         if (!this.getServerIp().equals(var2.getServerIp())) {
            return false;
         } else {
            return this.interactionType_ != var2.interactionType_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getServerIp().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.interactionType_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecordPinnedServerInteractionRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecordPinnedServerInteractionRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecordPinnedServerInteractionRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordPinnedServerInteractionRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecordPinnedServerInteractionRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecordPinnedServerInteractionRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecordPinnedServerInteractionRequest.Builder newBuilder(RecordPinnedServerInteractionRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecordPinnedServerInteractionRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecordPinnedServerInteractionRequest.Builder() : new RecordPinnedServerInteractionRequest.Builder().mergeFrom(this);
   }

   protected RecordPinnedServerInteractionRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecordPinnedServerInteractionRequest.Builder(var1);
   }

   public static RecordPinnedServerInteractionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecordPinnedServerInteractionRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecordPinnedServerInteractionRequest> getParserForType() {
      return PARSER;
   }

   public RecordPinnedServerInteractionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<RecordPinnedServerInteractionRequest.Builder>
      implements RecordPinnedServerInteractionRequestOrBuilder {
      private int bitField0_;
      private Object serverIp_ = "";
      private int interactionType_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordPinnedServerInteractionRequest.class, RecordPinnedServerInteractionRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RecordPinnedServerInteractionRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.serverIp_ = "";
         this.interactionType_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_descriptor;
      }

      public RecordPinnedServerInteractionRequest getDefaultInstanceForType() {
         return RecordPinnedServerInteractionRequest.getDefaultInstance();
      }

      public RecordPinnedServerInteractionRequest build() {
         RecordPinnedServerInteractionRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecordPinnedServerInteractionRequest buildPartial() {
         RecordPinnedServerInteractionRequest var1 = new RecordPinnedServerInteractionRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RecordPinnedServerInteractionRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.serverIp_ = this.serverIp_;
         }

         if ((var2 & 2) != 0) {
            var1.interactionType_ = this.interactionType_;
         }
      }

      public RecordPinnedServerInteractionRequest.Builder clone() {
         return (RecordPinnedServerInteractionRequest.Builder)super.clone();
      }

      public RecordPinnedServerInteractionRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordPinnedServerInteractionRequest.Builder)super.setField(var1, var2);
      }

      public RecordPinnedServerInteractionRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecordPinnedServerInteractionRequest.Builder)super.clearField(var1);
      }

      public RecordPinnedServerInteractionRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecordPinnedServerInteractionRequest.Builder)super.clearOneof(var1);
      }

      public RecordPinnedServerInteractionRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecordPinnedServerInteractionRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecordPinnedServerInteractionRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordPinnedServerInteractionRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RecordPinnedServerInteractionRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecordPinnedServerInteractionRequest) {
            return this.mergeFrom((RecordPinnedServerInteractionRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecordPinnedServerInteractionRequest.Builder mergeFrom(RecordPinnedServerInteractionRequest var1) {
         if (var1 == RecordPinnedServerInteractionRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getServerIp().isEmpty()) {
            this.serverIp_ = var1.serverIp_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.interactionType_ != 0) {
            this.setInteractionTypeValue(var1.getInteractionTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RecordPinnedServerInteractionRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.serverIp_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.interactionType_ = var1.readEnum();
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
      public String getServerIp() {
         Object var1 = this.serverIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerIpBytes() {
         Object var1 = this.serverIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RecordPinnedServerInteractionRequest.Builder setServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RecordPinnedServerInteractionRequest.Builder clearServerIp() {
         this.serverIp_ = RecordPinnedServerInteractionRequest.getDefaultInstance().getServerIp();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public RecordPinnedServerInteractionRequest.Builder setServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RecordPinnedServerInteractionRequest.checkByteStringIsUtf8(var1);
         this.serverIp_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getInteractionTypeValue() {
         return this.interactionType_;
      }

      public RecordPinnedServerInteractionRequest.Builder setInteractionTypeValue(int var1) {
         this.interactionType_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPinnedServerInteractionRequest.InteractionType getInteractionType() {
         RecordPinnedServerInteractionRequest.InteractionType var1 = RecordPinnedServerInteractionRequest.InteractionType.forNumber(this.interactionType_);
         return var1 == null ? RecordPinnedServerInteractionRequest.InteractionType.UNRECOGNIZED : var1;
      }

      public RecordPinnedServerInteractionRequest.Builder setInteractionType(RecordPinnedServerInteractionRequest.InteractionType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.interactionType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPinnedServerInteractionRequest.Builder clearInteractionType() {
         this.bitField0_ &= -3;
         this.interactionType_ = 0;
         this.onChanged();
         return this;
      }

      public final RecordPinnedServerInteractionRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecordPinnedServerInteractionRequest.Builder)super.setUnknownFields(var1);
      }

      public final RecordPinnedServerInteractionRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecordPinnedServerInteractionRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum InteractionType implements ProtocolMessageEnum {
      INTERACTION_TYPE_UNSPECIFIED(0),
      INTERACTION_TYPE_HOVER(1),
      INTERACTION_TYPE_PLAY(2),
      UNRECOGNIZED(-1);

      public static final int INTERACTION_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int INTERACTION_TYPE_HOVER_VALUE = 1;
      public static final int INTERACTION_TYPE_PLAY_VALUE = 2;
      private static final Internal.EnumLiteMap<RecordPinnedServerInteractionRequest.InteractionType> internalValueMap = new Internal.EnumLiteMap<RecordPinnedServerInteractionRequest.InteractionType>() {
         public RecordPinnedServerInteractionRequest.InteractionType findValueByNumber(int var1) {
            return RecordPinnedServerInteractionRequest.InteractionType.forNumber(var1);
         }
      };
      private static final RecordPinnedServerInteractionRequest.InteractionType[] VALUES = values();
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
      public static RecordPinnedServerInteractionRequest.InteractionType valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPinnedServerInteractionRequest.InteractionType forNumber(int var0) {
         switch (var0) {
            case 0:
               return INTERACTION_TYPE_UNSPECIFIED;
            case 1:
               return INTERACTION_TYPE_HOVER;
            case 2:
               return INTERACTION_TYPE_PLAY;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPinnedServerInteractionRequest.InteractionType> internalGetValueMap() {
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
         return RecordPinnedServerInteractionRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static RecordPinnedServerInteractionRequest.InteractionType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      InteractionType(int var3) {
         this.value = var3;
      }
   }
}
