package com.lunarclient.apollo.button.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ButtonTooltip extends GeneratedMessageV3 implements ButtonTooltipOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ADVENTURE_JSON_LINES_FIELD_NUMBER = 1;
   private LazyStringArrayList adventureJsonLines_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final ButtonTooltip DEFAULT_INSTANCE = new ButtonTooltip();
   private static final Parser<ButtonTooltip> PARSER = new AbstractParser<ButtonTooltip>() {
      public ButtonTooltip parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ButtonTooltip.Builder var3 = ButtonTooltip.newBuilder();

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

   private ButtonTooltip(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ButtonTooltip() {
      this.adventureJsonLines_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ButtonTooltip();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonTooltip_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonTooltip_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ButtonTooltip.class, ButtonTooltip.Builder.class);
   }

   public ProtocolStringList getAdventureJsonLinesList() {
      return this.adventureJsonLines_;
   }

   @Override
   public int getAdventureJsonLinesCount() {
      return this.adventureJsonLines_.size();
   }

   @Override
   public String getAdventureJsonLines(int var1) {
      return this.adventureJsonLines_.get(var1);
   }

   @Override
   public ByteString getAdventureJsonLinesBytes(int var1) {
      return this.adventureJsonLines_.getByteString(var1);
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
      for (int var2 = 0; var2 < this.adventureJsonLines_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 1, this.adventureJsonLines_.getRaw(var2));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var4 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.adventureJsonLines_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.adventureJsonLines_.getRaw(var3));
      }

      var4 += var2;
      var4 += 1 * this.getAdventureJsonLinesList().size();
      var4 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var4;
      return var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ButtonTooltip)) {
         return super.equals(var1);
      }

      ButtonTooltip var2 = (ButtonTooltip)var1;
      return !this.getAdventureJsonLinesList().equals(var2.getAdventureJsonLinesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getAdventureJsonLinesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getAdventureJsonLinesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ButtonTooltip parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonTooltip parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonTooltip parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonTooltip parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonTooltip parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonTooltip parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonTooltip parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonTooltip parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ButtonTooltip parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ButtonTooltip parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ButtonTooltip parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonTooltip parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ButtonTooltip.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ButtonTooltip.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ButtonTooltip.Builder newBuilder(ButtonTooltip var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ButtonTooltip.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ButtonTooltip.Builder() : new ButtonTooltip.Builder().mergeFrom(this);
   }

   protected ButtonTooltip.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ButtonTooltip.Builder(var1);
   }

   public static ButtonTooltip getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ButtonTooltip> parser() {
      return PARSER;
   }

   @Override
   public Parser<ButtonTooltip> getParserForType() {
      return PARSER;
   }

   public ButtonTooltip getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ButtonTooltip.Builder> implements ButtonTooltipOrBuilder {
      private int bitField0_;
      private LazyStringArrayList adventureJsonLines_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonTooltip_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonTooltip_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ButtonTooltip.class, ButtonTooltip.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ButtonTooltip.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.adventureJsonLines_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonTooltip_descriptor;
      }

      public ButtonTooltip getDefaultInstanceForType() {
         return ButtonTooltip.getDefaultInstance();
      }

      public ButtonTooltip build() {
         ButtonTooltip var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ButtonTooltip buildPartial() {
         ButtonTooltip var1 = new ButtonTooltip(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ButtonTooltip var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.adventureJsonLines_.makeImmutable();
            var1.adventureJsonLines_ = this.adventureJsonLines_;
         }
      }

      public ButtonTooltip.Builder clone() {
         return (ButtonTooltip.Builder)super.clone();
      }

      public ButtonTooltip.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonTooltip.Builder)super.setField(var1, var2);
      }

      public ButtonTooltip.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ButtonTooltip.Builder)super.clearField(var1);
      }

      public ButtonTooltip.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ButtonTooltip.Builder)super.clearOneof(var1);
      }

      public ButtonTooltip.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ButtonTooltip.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ButtonTooltip.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonTooltip.Builder)super.addRepeatedField(var1, var2);
      }

      public ButtonTooltip.Builder mergeFrom(Message var1) {
         if (var1 instanceof ButtonTooltip) {
            return this.mergeFrom((ButtonTooltip)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ButtonTooltip.Builder mergeFrom(ButtonTooltip var1) {
         if (var1 == ButtonTooltip.getDefaultInstance()) {
            return this;
         }

         if (!var1.adventureJsonLines_.isEmpty()) {
            if (this.adventureJsonLines_.isEmpty()) {
               this.adventureJsonLines_ = var1.adventureJsonLines_;
               this.bitField0_ |= 1;
            } else {
               this.ensureAdventureJsonLinesIsMutable();
               this.adventureJsonLines_.addAll(var1.adventureJsonLines_);
            }

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

      public ButtonTooltip.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureAdventureJsonLinesIsMutable();
                     this.adventureJsonLines_.add(var5);
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

      private void ensureAdventureJsonLinesIsMutable() {
         if (!this.adventureJsonLines_.isModifiable()) {
            this.adventureJsonLines_ = new LazyStringArrayList(this.adventureJsonLines_);
         }

         this.bitField0_ |= 1;
      }

      public ProtocolStringList getAdventureJsonLinesList() {
         this.adventureJsonLines_.makeImmutable();
         return this.adventureJsonLines_;
      }

      @Override
      public int getAdventureJsonLinesCount() {
         return this.adventureJsonLines_.size();
      }

      @Override
      public String getAdventureJsonLines(int var1) {
         return this.adventureJsonLines_.get(var1);
      }

      @Override
      public ByteString getAdventureJsonLinesBytes(int var1) {
         return this.adventureJsonLines_.getByteString(var1);
      }

      public ButtonTooltip.Builder setAdventureJsonLines(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.set(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ButtonTooltip.Builder addAdventureJsonLines(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ButtonTooltip.Builder addAllAdventureJsonLines(Iterable<String> var1) {
         this.ensureAdventureJsonLinesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.adventureJsonLines_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ButtonTooltip.Builder clearAdventureJsonLines() {
         this.adventureJsonLines_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ButtonTooltip.Builder addAdventureJsonLinesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ButtonTooltip.checkByteStringIsUtf8(var1);
         this.ensureAdventureJsonLinesIsMutable();
         this.adventureJsonLines_.add(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final ButtonTooltip.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ButtonTooltip.Builder)super.setUnknownFields(var1);
      }

      public final ButtonTooltip.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ButtonTooltip.Builder)super.mergeUnknownFields(var1);
      }
   }
}
