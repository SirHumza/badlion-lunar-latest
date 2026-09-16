package com.lunarclient.apollo.button.v1;

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
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ButtonContentPart extends GeneratedMessageV3 implements ButtonContentPartOrBuilder {
   private static final long serialVersionUID = 0L;
   private int partCase_ = 0;
   private Object part_;
   public static final int ADVENTURE_JSON_TEXT_FIELD_NUMBER = 1;
   public static final int ICON_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final ButtonContentPart DEFAULT_INSTANCE = new ButtonContentPart();
   private static final Parser<ButtonContentPart> PARSER = new AbstractParser<ButtonContentPart>() {
      public ButtonContentPart parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ButtonContentPart.Builder var3 = ButtonContentPart.newBuilder();

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

   private ButtonContentPart(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ButtonContentPart() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ButtonContentPart();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContentPart_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContentPart_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ButtonContentPart.class, ButtonContentPart.Builder.class);
   }

   @Override
   public ButtonContentPart.PartCase getPartCase() {
      return ButtonContentPart.PartCase.forNumber(this.partCase_);
   }

   @Override
   public boolean hasAdventureJsonText() {
      return this.partCase_ == 1;
   }

   @Override
   public String getAdventureJsonText() {
      Object var1 = "";
      if (this.partCase_ == 1) {
         var1 = this.part_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.partCase_ == 1) {
         this.part_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getAdventureJsonTextBytes() {
      Object var1 = "";
      if (this.partCase_ == 1) {
         var1 = this.part_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.partCase_ == 1) {
            this.part_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasIcon() {
      return this.partCase_ == 2;
   }

   @Override
   public Icon getIcon() {
      return this.partCase_ == 2 ? (Icon)this.part_ : Icon.getDefaultInstance();
   }

   @Override
   public IconOrBuilder getIconOrBuilder() {
      return this.partCase_ == 2 ? (Icon)this.part_ : Icon.getDefaultInstance();
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
      if (this.partCase_ == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.part_);
      }

      if (this.partCase_ == 2) {
         var1.writeMessage(2, (Icon)this.part_);
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
      if (this.partCase_ == 1) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.part_);
      }

      if (this.partCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (Icon)this.part_);
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

      if (!(var1 instanceof ButtonContentPart)) {
         return super.equals(var1);
      }

      ButtonContentPart var2 = (ButtonContentPart)var1;
      if (!this.getPartCase().equals(var2.getPartCase())) {
         return false;
      }

      switch (this.partCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getAdventureJsonText().equals(var2.getAdventureJsonText())) {
               return false;
            }
            break;
         case 2:
            if (!this.getIcon().equals(var2.getIcon())) {
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
      switch (this.partCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getAdventureJsonText().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getIcon().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ButtonContentPart parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonContentPart parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonContentPart parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonContentPart parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonContentPart parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ButtonContentPart parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ButtonContentPart parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonContentPart parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ButtonContentPart parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ButtonContentPart parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ButtonContentPart parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ButtonContentPart parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ButtonContentPart.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ButtonContentPart.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ButtonContentPart.Builder newBuilder(ButtonContentPart var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ButtonContentPart.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ButtonContentPart.Builder() : new ButtonContentPart.Builder().mergeFrom(this);
   }

   protected ButtonContentPart.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ButtonContentPart.Builder(var1);
   }

   public static ButtonContentPart getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ButtonContentPart> parser() {
      return PARSER;
   }

   @Override
   public Parser<ButtonContentPart> getParserForType() {
      return PARSER;
   }

   public ButtonContentPart getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ButtonContentPart.Builder> implements ButtonContentPartOrBuilder {
      private int partCase_ = 0;
      private Object part_;
      private int bitField0_;
      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContentPart_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContentPart_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ButtonContentPart.class, ButtonContentPart.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ButtonContentPart.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.iconBuilder_ != null) {
            this.iconBuilder_.clear();
         }

         this.partCase_ = 0;
         this.part_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ButtonProto.internal_static_lunarclient_apollo_button_v1_ButtonContentPart_descriptor;
      }

      public ButtonContentPart getDefaultInstanceForType() {
         return ButtonContentPart.getDefaultInstance();
      }

      public ButtonContentPart build() {
         ButtonContentPart var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ButtonContentPart buildPartial() {
         ButtonContentPart var1 = new ButtonContentPart(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ButtonContentPart var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(ButtonContentPart var1) {
         var1.partCase_ = this.partCase_;
         var1.part_ = this.part_;
         if (this.partCase_ == 2 && this.iconBuilder_ != null) {
            var1.part_ = this.iconBuilder_.build();
         }
      }

      public ButtonContentPart.Builder clone() {
         return (ButtonContentPart.Builder)super.clone();
      }

      public ButtonContentPart.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonContentPart.Builder)super.setField(var1, var2);
      }

      public ButtonContentPart.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ButtonContentPart.Builder)super.clearField(var1);
      }

      public ButtonContentPart.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ButtonContentPart.Builder)super.clearOneof(var1);
      }

      public ButtonContentPart.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ButtonContentPart.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ButtonContentPart.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ButtonContentPart.Builder)super.addRepeatedField(var1, var2);
      }

      public ButtonContentPart.Builder mergeFrom(Message var1) {
         if (var1 instanceof ButtonContentPart) {
            return this.mergeFrom((ButtonContentPart)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ButtonContentPart.Builder mergeFrom(ButtonContentPart var1) {
         if (var1 == ButtonContentPart.getDefaultInstance()) {
            return this;
         }

         switch (var1.getPartCase()) {
            case ADVENTURE_JSON_TEXT:
               this.partCase_ = 1;
               this.part_ = var1.part_;
               this.onChanged();
               break;
            case ICON:
               this.mergeIcon(var1.getIcon());
            case PART_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ButtonContentPart.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.partCase_ = 1;
                     this.part_ = var5;
                     break;
                  case 18:
                     var1.readMessage(this.getIconFieldBuilder().getBuilder(), var2);
                     this.partCase_ = 2;
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
      public ButtonContentPart.PartCase getPartCase() {
         return ButtonContentPart.PartCase.forNumber(this.partCase_);
      }

      public ButtonContentPart.Builder clearPart() {
         this.partCase_ = 0;
         this.part_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasAdventureJsonText() {
         return this.partCase_ == 1;
      }

      @Override
      public String getAdventureJsonText() {
         Object var1 = "";
         if (this.partCase_ == 1) {
            var1 = this.part_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.partCase_ == 1) {
               this.part_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getAdventureJsonTextBytes() {
         Object var1 = "";
         if (this.partCase_ == 1) {
            var1 = this.part_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.partCase_ == 1) {
               this.part_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ButtonContentPart.Builder setAdventureJsonText(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.partCase_ = 1;
         this.part_ = var1;
         this.onChanged();
         return this;
      }

      public ButtonContentPart.Builder clearAdventureJsonText() {
         if (this.partCase_ == 1) {
            this.partCase_ = 0;
            this.part_ = null;
            this.onChanged();
         }

         return this;
      }

      public ButtonContentPart.Builder setAdventureJsonTextBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ButtonContentPart.checkByteStringIsUtf8(var1);
         this.partCase_ = 1;
         this.part_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasIcon() {
         return this.partCase_ == 2;
      }

      @Override
      public Icon getIcon() {
         if (this.iconBuilder_ == null) {
            return this.partCase_ == 2 ? (Icon)this.part_ : Icon.getDefaultInstance();
         } else {
            return this.partCase_ == 2 ? this.iconBuilder_.getMessage() : Icon.getDefaultInstance();
         }
      }

      public ButtonContentPart.Builder setIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.part_ = var1;
            this.onChanged();
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.partCase_ = 2;
         return this;
      }

      public ButtonContentPart.Builder setIcon(Icon.Builder var1) {
         if (this.iconBuilder_ == null) {
            this.part_ = var1.build();
            this.onChanged();
         } else {
            this.iconBuilder_.setMessage(var1.build());
         }

         this.partCase_ = 2;
         return this;
      }

      public ButtonContentPart.Builder mergeIcon(Icon var1) {
         if (this.iconBuilder_ == null) {
            if (this.partCase_ == 2 && this.part_ != Icon.getDefaultInstance()) {
               this.part_ = Icon.newBuilder((Icon)this.part_).mergeFrom(var1).buildPartial();
            } else {
               this.part_ = var1;
            }

            this.onChanged();
         } else if (this.partCase_ == 2) {
            this.iconBuilder_.mergeFrom(var1);
         } else {
            this.iconBuilder_.setMessage(var1);
         }

         this.partCase_ = 2;
         return this;
      }

      public ButtonContentPart.Builder clearIcon() {
         if (this.iconBuilder_ == null) {
            if (this.partCase_ == 2) {
               this.partCase_ = 0;
               this.part_ = null;
               this.onChanged();
            }
         } else {
            if (this.partCase_ == 2) {
               this.partCase_ = 0;
               this.part_ = null;
            }

            this.iconBuilder_.clear();
         }

         return this;
      }

      public Icon.Builder getIconBuilder() {
         return this.getIconFieldBuilder().getBuilder();
      }

      @Override
      public IconOrBuilder getIconOrBuilder() {
         if (this.partCase_ == 2 && this.iconBuilder_ != null) {
            return this.iconBuilder_.getMessageOrBuilder();
         } else {
            return this.partCase_ == 2 ? (Icon)this.part_ : Icon.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getIconFieldBuilder() {
         if (this.iconBuilder_ == null) {
            if (this.partCase_ != 2) {
               this.part_ = Icon.getDefaultInstance();
            }

            this.iconBuilder_ = new SingleFieldBuilderV3<>((Icon)this.part_, this.getParentForChildren(), this.isClean());
            this.part_ = null;
         }

         this.partCase_ = 2;
         this.onChanged();
         return this.iconBuilder_;
      }

      public final ButtonContentPart.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ButtonContentPart.Builder)super.setUnknownFields(var1);
      }

      public final ButtonContentPart.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ButtonContentPart.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum PartCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      ADVENTURE_JSON_TEXT(1),
      ICON(2),
      PART_NOT_SET(0);

      private final int value;

      PartCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ButtonContentPart.PartCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ButtonContentPart.PartCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return PART_NOT_SET;
            case 1:
               return ADVENTURE_JSON_TEXT;
            case 2:
               return ICON;
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
