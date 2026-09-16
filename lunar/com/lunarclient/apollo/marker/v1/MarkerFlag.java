package com.lunarclient.apollo.marker.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MarkerFlag extends GeneratedMessageV3 implements MarkerFlagOrBuilder {
   private static final long serialVersionUID = 0L;
   private int flagCase_ = 0;
   private Object flag_;
   public static final int NORMAL_FIELD_NUMBER = 1;
   public static final int DANGER_FIELD_NUMBER = 2;
   public static final int INFO_FIELD_NUMBER = 3;
   public static final int INTEREST_FIELD_NUMBER = 4;
   private byte memoizedIsInitialized = -1;
   private static final MarkerFlag DEFAULT_INSTANCE = new MarkerFlag();
   private static final Parser<MarkerFlag> PARSER = new AbstractParser<MarkerFlag>() {
      public MarkerFlag parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MarkerFlag.Builder var3 = MarkerFlag.newBuilder();

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

   private MarkerFlag(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MarkerFlag() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MarkerFlag();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerFlag_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerFlag_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MarkerFlag.class, MarkerFlag.Builder.class);
   }

   @Override
   public MarkerFlag.FlagCase getFlagCase() {
      return MarkerFlag.FlagCase.forNumber(this.flagCase_);
   }

   @Override
   public boolean hasNormal() {
      return this.flagCase_ == 1;
   }

   @Override
   public NormalMarker getNormal() {
      return this.flagCase_ == 1 ? (NormalMarker)this.flag_ : NormalMarker.getDefaultInstance();
   }

   @Override
   public NormalMarkerOrBuilder getNormalOrBuilder() {
      return this.flagCase_ == 1 ? (NormalMarker)this.flag_ : NormalMarker.getDefaultInstance();
   }

   @Override
   public boolean hasDanger() {
      return this.flagCase_ == 2;
   }

   @Override
   public DangerMarker getDanger() {
      return this.flagCase_ == 2 ? (DangerMarker)this.flag_ : DangerMarker.getDefaultInstance();
   }

   @Override
   public DangerMarkerOrBuilder getDangerOrBuilder() {
      return this.flagCase_ == 2 ? (DangerMarker)this.flag_ : DangerMarker.getDefaultInstance();
   }

   @Override
   public boolean hasInfo() {
      return this.flagCase_ == 3;
   }

   @Override
   public InfoMarker getInfo() {
      return this.flagCase_ == 3 ? (InfoMarker)this.flag_ : InfoMarker.getDefaultInstance();
   }

   @Override
   public InfoMarkerOrBuilder getInfoOrBuilder() {
      return this.flagCase_ == 3 ? (InfoMarker)this.flag_ : InfoMarker.getDefaultInstance();
   }

   @Override
   public boolean hasInterest() {
      return this.flagCase_ == 4;
   }

   @Override
   public InterestMarker getInterest() {
      return this.flagCase_ == 4 ? (InterestMarker)this.flag_ : InterestMarker.getDefaultInstance();
   }

   @Override
   public InterestMarkerOrBuilder getInterestOrBuilder() {
      return this.flagCase_ == 4 ? (InterestMarker)this.flag_ : InterestMarker.getDefaultInstance();
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
      if (this.flagCase_ == 1) {
         var1.writeMessage(1, (NormalMarker)this.flag_);
      }

      if (this.flagCase_ == 2) {
         var1.writeMessage(2, (DangerMarker)this.flag_);
      }

      if (this.flagCase_ == 3) {
         var1.writeMessage(3, (InfoMarker)this.flag_);
      }

      if (this.flagCase_ == 4) {
         var1.writeMessage(4, (InterestMarker)this.flag_);
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
      if (this.flagCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (NormalMarker)this.flag_);
      }

      if (this.flagCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (DangerMarker)this.flag_);
      }

      if (this.flagCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (InfoMarker)this.flag_);
      }

      if (this.flagCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (InterestMarker)this.flag_);
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

      if (!(var1 instanceof MarkerFlag)) {
         return super.equals(var1);
      }

      MarkerFlag var2 = (MarkerFlag)var1;
      if (!this.getFlagCase().equals(var2.getFlagCase())) {
         return false;
      }

      switch (this.flagCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getNormal().equals(var2.getNormal())) {
               return false;
            }
            break;
         case 2:
            if (!this.getDanger().equals(var2.getDanger())) {
               return false;
            }
            break;
         case 3:
            if (!this.getInfo().equals(var2.getInfo())) {
               return false;
            }
            break;
         case 4:
            if (!this.getInterest().equals(var2.getInterest())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.flagCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getNormal().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getDanger().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getInfo().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getInterest().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static MarkerFlag parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerFlag parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerFlag parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerFlag parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerFlag parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkerFlag parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkerFlag parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkerFlag parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MarkerFlag parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MarkerFlag parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MarkerFlag parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkerFlag parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MarkerFlag.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MarkerFlag.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MarkerFlag.Builder newBuilder(MarkerFlag var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MarkerFlag.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MarkerFlag.Builder() : new MarkerFlag.Builder().mergeFrom(this);
   }

   protected MarkerFlag.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MarkerFlag.Builder(var1);
   }

   public static MarkerFlag getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MarkerFlag> parser() {
      return PARSER;
   }

   @Override
   public Parser<MarkerFlag> getParserForType() {
      return PARSER;
   }

   public MarkerFlag getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<MarkerFlag.Builder> implements MarkerFlagOrBuilder {
      private int flagCase_ = 0;
      private Object flag_;
      private int bitField0_;
      private SingleFieldBuilderV3<NormalMarker, NormalMarker.Builder, NormalMarkerOrBuilder> normalBuilder_;
      private SingleFieldBuilderV3<DangerMarker, DangerMarker.Builder, DangerMarkerOrBuilder> dangerBuilder_;
      private SingleFieldBuilderV3<InfoMarker, InfoMarker.Builder, InfoMarkerOrBuilder> infoBuilder_;
      private SingleFieldBuilderV3<InterestMarker, InterestMarker.Builder, InterestMarkerOrBuilder> interestBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerFlag_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerFlag_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MarkerFlag.class, MarkerFlag.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MarkerFlag.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.normalBuilder_ != null) {
            this.normalBuilder_.clear();
         }

         if (this.dangerBuilder_ != null) {
            this.dangerBuilder_.clear();
         }

         if (this.infoBuilder_ != null) {
            this.infoBuilder_.clear();
         }

         if (this.interestBuilder_ != null) {
            this.interestBuilder_.clear();
         }

         this.flagCase_ = 0;
         this.flag_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_MarkerFlag_descriptor;
      }

      public MarkerFlag getDefaultInstanceForType() {
         return MarkerFlag.getDefaultInstance();
      }

      public MarkerFlag build() {
         MarkerFlag var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MarkerFlag buildPartial() {
         MarkerFlag var1 = new MarkerFlag(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(MarkerFlag var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(MarkerFlag var1) {
         var1.flagCase_ = this.flagCase_;
         var1.flag_ = this.flag_;
         if (this.flagCase_ == 1 && this.normalBuilder_ != null) {
            var1.flag_ = this.normalBuilder_.build();
         }

         if (this.flagCase_ == 2 && this.dangerBuilder_ != null) {
            var1.flag_ = this.dangerBuilder_.build();
         }

         if (this.flagCase_ == 3 && this.infoBuilder_ != null) {
            var1.flag_ = this.infoBuilder_.build();
         }

         if (this.flagCase_ == 4 && this.interestBuilder_ != null) {
            var1.flag_ = this.interestBuilder_.build();
         }
      }

      public MarkerFlag.Builder clone() {
         return (MarkerFlag.Builder)super.clone();
      }

      public MarkerFlag.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkerFlag.Builder)super.setField(var1, var2);
      }

      public MarkerFlag.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MarkerFlag.Builder)super.clearField(var1);
      }

      public MarkerFlag.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MarkerFlag.Builder)super.clearOneof(var1);
      }

      public MarkerFlag.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MarkerFlag.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MarkerFlag.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkerFlag.Builder)super.addRepeatedField(var1, var2);
      }

      public MarkerFlag.Builder mergeFrom(Message var1) {
         if (var1 instanceof MarkerFlag) {
            return this.mergeFrom((MarkerFlag)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MarkerFlag.Builder mergeFrom(MarkerFlag var1) {
         if (var1 == MarkerFlag.getDefaultInstance()) {
            return this;
         }

         switch (var1.getFlagCase()) {
            case NORMAL:
               this.mergeNormal(var1.getNormal());
               break;
            case DANGER:
               this.mergeDanger(var1.getDanger());
               break;
            case INFO:
               this.mergeInfo(var1.getInfo());
               break;
            case INTEREST:
               this.mergeInterest(var1.getInterest());
            case FLAG_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public MarkerFlag.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNormalFieldBuilder().getBuilder(), var2);
                     this.flagCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getDangerFieldBuilder().getBuilder(), var2);
                     this.flagCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getInfoFieldBuilder().getBuilder(), var2);
                     this.flagCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getInterestFieldBuilder().getBuilder(), var2);
                     this.flagCase_ = 4;
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
      public MarkerFlag.FlagCase getFlagCase() {
         return MarkerFlag.FlagCase.forNumber(this.flagCase_);
      }

      public MarkerFlag.Builder clearFlag() {
         this.flagCase_ = 0;
         this.flag_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasNormal() {
         return this.flagCase_ == 1;
      }

      @Override
      public NormalMarker getNormal() {
         if (this.normalBuilder_ == null) {
            return this.flagCase_ == 1 ? (NormalMarker)this.flag_ : NormalMarker.getDefaultInstance();
         } else {
            return this.flagCase_ == 1 ? this.normalBuilder_.getMessage() : NormalMarker.getDefaultInstance();
         }
      }

      public MarkerFlag.Builder setNormal(NormalMarker var1) {
         if (this.normalBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.flag_ = var1;
            this.onChanged();
         } else {
            this.normalBuilder_.setMessage(var1);
         }

         this.flagCase_ = 1;
         return this;
      }

      public MarkerFlag.Builder setNormal(NormalMarker.Builder var1) {
         if (this.normalBuilder_ == null) {
            this.flag_ = var1.build();
            this.onChanged();
         } else {
            this.normalBuilder_.setMessage(var1.build());
         }

         this.flagCase_ = 1;
         return this;
      }

      public MarkerFlag.Builder mergeNormal(NormalMarker var1) {
         if (this.normalBuilder_ == null) {
            if (this.flagCase_ == 1 && this.flag_ != NormalMarker.getDefaultInstance()) {
               this.flag_ = NormalMarker.newBuilder((NormalMarker)this.flag_).mergeFrom(var1).buildPartial();
            } else {
               this.flag_ = var1;
            }

            this.onChanged();
         } else if (this.flagCase_ == 1) {
            this.normalBuilder_.mergeFrom(var1);
         } else {
            this.normalBuilder_.setMessage(var1);
         }

         this.flagCase_ = 1;
         return this;
      }

      public MarkerFlag.Builder clearNormal() {
         if (this.normalBuilder_ == null) {
            if (this.flagCase_ == 1) {
               this.flagCase_ = 0;
               this.flag_ = null;
               this.onChanged();
            }
         } else {
            if (this.flagCase_ == 1) {
               this.flagCase_ = 0;
               this.flag_ = null;
            }

            this.normalBuilder_.clear();
         }

         return this;
      }

      public NormalMarker.Builder getNormalBuilder() {
         return this.getNormalFieldBuilder().getBuilder();
      }

      @Override
      public NormalMarkerOrBuilder getNormalOrBuilder() {
         if (this.flagCase_ == 1 && this.normalBuilder_ != null) {
            return this.normalBuilder_.getMessageOrBuilder();
         } else {
            return this.flagCase_ == 1 ? (NormalMarker)this.flag_ : NormalMarker.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<NormalMarker, NormalMarker.Builder, NormalMarkerOrBuilder> getNormalFieldBuilder() {
         if (this.normalBuilder_ == null) {
            if (this.flagCase_ != 1) {
               this.flag_ = NormalMarker.getDefaultInstance();
            }

            this.normalBuilder_ = new SingleFieldBuilderV3<>((NormalMarker)this.flag_, this.getParentForChildren(), this.isClean());
            this.flag_ = null;
         }

         this.flagCase_ = 1;
         this.onChanged();
         return this.normalBuilder_;
      }

      @Override
      public boolean hasDanger() {
         return this.flagCase_ == 2;
      }

      @Override
      public DangerMarker getDanger() {
         if (this.dangerBuilder_ == null) {
            return this.flagCase_ == 2 ? (DangerMarker)this.flag_ : DangerMarker.getDefaultInstance();
         } else {
            return this.flagCase_ == 2 ? this.dangerBuilder_.getMessage() : DangerMarker.getDefaultInstance();
         }
      }

      public MarkerFlag.Builder setDanger(DangerMarker var1) {
         if (this.dangerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.flag_ = var1;
            this.onChanged();
         } else {
            this.dangerBuilder_.setMessage(var1);
         }

         this.flagCase_ = 2;
         return this;
      }

      public MarkerFlag.Builder setDanger(DangerMarker.Builder var1) {
         if (this.dangerBuilder_ == null) {
            this.flag_ = var1.build();
            this.onChanged();
         } else {
            this.dangerBuilder_.setMessage(var1.build());
         }

         this.flagCase_ = 2;
         return this;
      }

      public MarkerFlag.Builder mergeDanger(DangerMarker var1) {
         if (this.dangerBuilder_ == null) {
            if (this.flagCase_ == 2 && this.flag_ != DangerMarker.getDefaultInstance()) {
               this.flag_ = DangerMarker.newBuilder((DangerMarker)this.flag_).mergeFrom(var1).buildPartial();
            } else {
               this.flag_ = var1;
            }

            this.onChanged();
         } else if (this.flagCase_ == 2) {
            this.dangerBuilder_.mergeFrom(var1);
         } else {
            this.dangerBuilder_.setMessage(var1);
         }

         this.flagCase_ = 2;
         return this;
      }

      public MarkerFlag.Builder clearDanger() {
         if (this.dangerBuilder_ == null) {
            if (this.flagCase_ == 2) {
               this.flagCase_ = 0;
               this.flag_ = null;
               this.onChanged();
            }
         } else {
            if (this.flagCase_ == 2) {
               this.flagCase_ = 0;
               this.flag_ = null;
            }

            this.dangerBuilder_.clear();
         }

         return this;
      }

      public DangerMarker.Builder getDangerBuilder() {
         return this.getDangerFieldBuilder().getBuilder();
      }

      @Override
      public DangerMarkerOrBuilder getDangerOrBuilder() {
         if (this.flagCase_ == 2 && this.dangerBuilder_ != null) {
            return this.dangerBuilder_.getMessageOrBuilder();
         } else {
            return this.flagCase_ == 2 ? (DangerMarker)this.flag_ : DangerMarker.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<DangerMarker, DangerMarker.Builder, DangerMarkerOrBuilder> getDangerFieldBuilder() {
         if (this.dangerBuilder_ == null) {
            if (this.flagCase_ != 2) {
               this.flag_ = DangerMarker.getDefaultInstance();
            }

            this.dangerBuilder_ = new SingleFieldBuilderV3<>((DangerMarker)this.flag_, this.getParentForChildren(), this.isClean());
            this.flag_ = null;
         }

         this.flagCase_ = 2;
         this.onChanged();
         return this.dangerBuilder_;
      }

      @Override
      public boolean hasInfo() {
         return this.flagCase_ == 3;
      }

      @Override
      public InfoMarker getInfo() {
         if (this.infoBuilder_ == null) {
            return this.flagCase_ == 3 ? (InfoMarker)this.flag_ : InfoMarker.getDefaultInstance();
         } else {
            return this.flagCase_ == 3 ? this.infoBuilder_.getMessage() : InfoMarker.getDefaultInstance();
         }
      }

      public MarkerFlag.Builder setInfo(InfoMarker var1) {
         if (this.infoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.flag_ = var1;
            this.onChanged();
         } else {
            this.infoBuilder_.setMessage(var1);
         }

         this.flagCase_ = 3;
         return this;
      }

      public MarkerFlag.Builder setInfo(InfoMarker.Builder var1) {
         if (this.infoBuilder_ == null) {
            this.flag_ = var1.build();
            this.onChanged();
         } else {
            this.infoBuilder_.setMessage(var1.build());
         }

         this.flagCase_ = 3;
         return this;
      }

      public MarkerFlag.Builder mergeInfo(InfoMarker var1) {
         if (this.infoBuilder_ == null) {
            if (this.flagCase_ == 3 && this.flag_ != InfoMarker.getDefaultInstance()) {
               this.flag_ = InfoMarker.newBuilder((InfoMarker)this.flag_).mergeFrom(var1).buildPartial();
            } else {
               this.flag_ = var1;
            }

            this.onChanged();
         } else if (this.flagCase_ == 3) {
            this.infoBuilder_.mergeFrom(var1);
         } else {
            this.infoBuilder_.setMessage(var1);
         }

         this.flagCase_ = 3;
         return this;
      }

      public MarkerFlag.Builder clearInfo() {
         if (this.infoBuilder_ == null) {
            if (this.flagCase_ == 3) {
               this.flagCase_ = 0;
               this.flag_ = null;
               this.onChanged();
            }
         } else {
            if (this.flagCase_ == 3) {
               this.flagCase_ = 0;
               this.flag_ = null;
            }

            this.infoBuilder_.clear();
         }

         return this;
      }

      public InfoMarker.Builder getInfoBuilder() {
         return this.getInfoFieldBuilder().getBuilder();
      }

      @Override
      public InfoMarkerOrBuilder getInfoOrBuilder() {
         if (this.flagCase_ == 3 && this.infoBuilder_ != null) {
            return this.infoBuilder_.getMessageOrBuilder();
         } else {
            return this.flagCase_ == 3 ? (InfoMarker)this.flag_ : InfoMarker.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InfoMarker, InfoMarker.Builder, InfoMarkerOrBuilder> getInfoFieldBuilder() {
         if (this.infoBuilder_ == null) {
            if (this.flagCase_ != 3) {
               this.flag_ = InfoMarker.getDefaultInstance();
            }

            this.infoBuilder_ = new SingleFieldBuilderV3<>((InfoMarker)this.flag_, this.getParentForChildren(), this.isClean());
            this.flag_ = null;
         }

         this.flagCase_ = 3;
         this.onChanged();
         return this.infoBuilder_;
      }

      @Override
      public boolean hasInterest() {
         return this.flagCase_ == 4;
      }

      @Override
      public InterestMarker getInterest() {
         if (this.interestBuilder_ == null) {
            return this.flagCase_ == 4 ? (InterestMarker)this.flag_ : InterestMarker.getDefaultInstance();
         } else {
            return this.flagCase_ == 4 ? this.interestBuilder_.getMessage() : InterestMarker.getDefaultInstance();
         }
      }

      public MarkerFlag.Builder setInterest(InterestMarker var1) {
         if (this.interestBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.flag_ = var1;
            this.onChanged();
         } else {
            this.interestBuilder_.setMessage(var1);
         }

         this.flagCase_ = 4;
         return this;
      }

      public MarkerFlag.Builder setInterest(InterestMarker.Builder var1) {
         if (this.interestBuilder_ == null) {
            this.flag_ = var1.build();
            this.onChanged();
         } else {
            this.interestBuilder_.setMessage(var1.build());
         }

         this.flagCase_ = 4;
         return this;
      }

      public MarkerFlag.Builder mergeInterest(InterestMarker var1) {
         if (this.interestBuilder_ == null) {
            if (this.flagCase_ == 4 && this.flag_ != InterestMarker.getDefaultInstance()) {
               this.flag_ = InterestMarker.newBuilder((InterestMarker)this.flag_).mergeFrom(var1).buildPartial();
            } else {
               this.flag_ = var1;
            }

            this.onChanged();
         } else if (this.flagCase_ == 4) {
            this.interestBuilder_.mergeFrom(var1);
         } else {
            this.interestBuilder_.setMessage(var1);
         }

         this.flagCase_ = 4;
         return this;
      }

      public MarkerFlag.Builder clearInterest() {
         if (this.interestBuilder_ == null) {
            if (this.flagCase_ == 4) {
               this.flagCase_ = 0;
               this.flag_ = null;
               this.onChanged();
            }
         } else {
            if (this.flagCase_ == 4) {
               this.flagCase_ = 0;
               this.flag_ = null;
            }

            this.interestBuilder_.clear();
         }

         return this;
      }

      public InterestMarker.Builder getInterestBuilder() {
         return this.getInterestFieldBuilder().getBuilder();
      }

      @Override
      public InterestMarkerOrBuilder getInterestOrBuilder() {
         if (this.flagCase_ == 4 && this.interestBuilder_ != null) {
            return this.interestBuilder_.getMessageOrBuilder();
         } else {
            return this.flagCase_ == 4 ? (InterestMarker)this.flag_ : InterestMarker.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InterestMarker, InterestMarker.Builder, InterestMarkerOrBuilder> getInterestFieldBuilder() {
         if (this.interestBuilder_ == null) {
            if (this.flagCase_ != 4) {
               this.flag_ = InterestMarker.getDefaultInstance();
            }

            this.interestBuilder_ = new SingleFieldBuilderV3<>((InterestMarker)this.flag_, this.getParentForChildren(), this.isClean());
            this.flag_ = null;
         }

         this.flagCase_ = 4;
         this.onChanged();
         return this.interestBuilder_;
      }

      public final MarkerFlag.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MarkerFlag.Builder)super.setUnknownFields(var1);
      }

      public final MarkerFlag.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MarkerFlag.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum FlagCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      NORMAL(1),
      DANGER(2),
      INFO(3),
      INTEREST(4),
      FLAG_NOT_SET(0);

      private final int value;

      FlagCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static MarkerFlag.FlagCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static MarkerFlag.FlagCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return FLAG_NOT_SET;
            case 1:
               return NORMAL;
            case 2:
               return DANGER;
            case 3:
               return INFO;
            case 4:
               return INTEREST;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
