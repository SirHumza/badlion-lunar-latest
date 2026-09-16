package com.lunarclient.apollo.marker.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class InterestMarker extends GeneratedMessageV3 implements InterestMarkerOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int COLOR_FIELD_NUMBER = 1;
   private Color color_;
   private byte memoizedIsInitialized = -1;
   private static final InterestMarker DEFAULT_INSTANCE = new InterestMarker();
   private static final Parser<InterestMarker> PARSER = new AbstractParser<InterestMarker>() {
      public InterestMarker parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InterestMarker.Builder var3 = InterestMarker.newBuilder();

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

   private InterestMarker(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InterestMarker() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InterestMarker();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_InterestMarker_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_marker_v1_InterestMarker_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InterestMarker.class, InterestMarker.Builder.class);
   }

   @Override
   public boolean hasColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getColor() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public ColorOrBuilder getColorOrBuilder() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getColor());
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getColor());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InterestMarker)) {
         return super.equals(var1);
      } else {
         InterestMarker var2 = (InterestMarker)var1;
         if (this.hasColor() != var2.hasColor()) {
            return false;
         } else {
            return this.hasColor() && !this.getColor().equals(var2.getColor()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasColor()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InterestMarker parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InterestMarker parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InterestMarker parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InterestMarker parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InterestMarker parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InterestMarker parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InterestMarker parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InterestMarker parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InterestMarker parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InterestMarker parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InterestMarker parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InterestMarker parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InterestMarker.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InterestMarker.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InterestMarker.Builder newBuilder(InterestMarker var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InterestMarker.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InterestMarker.Builder() : new InterestMarker.Builder().mergeFrom(this);
   }

   protected InterestMarker.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InterestMarker.Builder(var1);
   }

   public static InterestMarker getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InterestMarker> parser() {
      return PARSER;
   }

   @Override
   public Parser<InterestMarker> getParserForType() {
      return PARSER;
   }

   public InterestMarker getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InterestMarker.Builder> implements InterestMarkerOrBuilder {
      private int bitField0_;
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_InterestMarker_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_InterestMarker_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InterestMarker.class, InterestMarker.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InterestMarker.alwaysUseFieldBuilders) {
            this.getColorFieldBuilder();
         }
      }

      public InterestMarker.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_marker_v1_InterestMarker_descriptor;
      }

      public InterestMarker getDefaultInstanceForType() {
         return InterestMarker.getDefaultInstance();
      }

      public InterestMarker build() {
         InterestMarker var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InterestMarker buildPartial() {
         InterestMarker var1 = new InterestMarker(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InterestMarker var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 1;
         }

         InterestMarker var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public InterestMarker.Builder clone() {
         return (InterestMarker.Builder)super.clone();
      }

      public InterestMarker.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InterestMarker.Builder)super.setField(var1, var2);
      }

      public InterestMarker.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InterestMarker.Builder)super.clearField(var1);
      }

      public InterestMarker.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InterestMarker.Builder)super.clearOneof(var1);
      }

      public InterestMarker.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InterestMarker.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InterestMarker.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InterestMarker.Builder)super.addRepeatedField(var1, var2);
      }

      public InterestMarker.Builder mergeFrom(Message var1) {
         if (var1 instanceof InterestMarker) {
            return this.mergeFrom((InterestMarker)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InterestMarker.Builder mergeFrom(InterestMarker var1) {
         if (var1 == InterestMarker.getDefaultInstance()) {
            return this;
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InterestMarker.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
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
      public boolean hasColor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public InterestMarker.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InterestMarker.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public InterestMarker.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public InterestMarker.Builder clearColor() {
         this.bitField0_ &= -2;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getColorOrBuilder() {
         if (this.colorBuilder_ != null) {
            return this.colorBuilder_.getMessageOrBuilder();
         } else {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getColorFieldBuilder() {
         if (this.colorBuilder_ == null) {
            this.colorBuilder_ = new SingleFieldBuilderV3<>(this.getColor(), this.getParentForChildren(), this.isClean());
            this.color_ = null;
         }

         return this.colorBuilder_;
      }

      public final InterestMarker.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InterestMarker.Builder)super.setUnknownFields(var1);
      }

      public final InterestMarker.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InterestMarker.Builder)super.mergeUnknownFields(var1);
      }
   }
}
