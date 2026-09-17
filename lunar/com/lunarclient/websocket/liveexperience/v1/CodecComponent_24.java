package com.lunarclient.websocket.liveexperience.v1;

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

public final class JoinLiveExperienceResponse extends GeneratedMessageV3 implements JoinLiveExperienceResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int resultCase_ = 0;
   private Object result_;
   public static final int SERVER_FIELD_NUMBER = 1;
   public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final JoinLiveExperienceResponse DEFAULT_INSTANCE = new JoinLiveExperienceResponse();
   private static final Parser<JoinLiveExperienceResponse> PARSER = new AbstractParser<JoinLiveExperienceResponse>() {
      public JoinLiveExperienceResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         JoinLiveExperienceResponse.Builder var3 = JoinLiveExperienceResponse.newBuilder();

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

   private JoinLiveExperienceResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private JoinLiveExperienceResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new JoinLiveExperienceResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(JoinLiveExperienceResponse.class, JoinLiveExperienceResponse.Builder.class);
   }

   @Override
   public JoinLiveExperienceResponse.ResultCase getResultCase() {
      return JoinLiveExperienceResponse.ResultCase.forNumber(this.resultCase_);
   }

   @Override
   public boolean hasServer() {
      return this.resultCase_ == 1;
   }

   @Override
   public AddressAndPort getServer() {
      return this.resultCase_ == 1 ? (AddressAndPort)this.result_ : AddressAndPort.getDefaultInstance();
   }

   @Override
   public AddressAndPortOrBuilder getServerOrBuilder() {
      return this.resultCase_ == 1 ? (AddressAndPort)this.result_ : AddressAndPort.getDefaultInstance();
   }

   @Override
   public boolean hasErrorMessage() {
      return this.resultCase_ == 2;
   }

   @Override
   public String getErrorMessage() {
      Object var1 = "";
      if (this.resultCase_ == 2) {
         var1 = this.result_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.resultCase_ == 2) {
         this.result_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getErrorMessageBytes() {
      Object var1 = "";
      if (this.resultCase_ == 2) {
         var1 = this.result_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.resultCase_ == 2) {
            this.result_ = var2;
         }

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
      if (this.resultCase_ == 1) {
         var1.writeMessage(1, (AddressAndPort)this.result_);
      }

      if (this.resultCase_ == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.result_);
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
      if (this.resultCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (AddressAndPort)this.result_);
      }

      if (this.resultCase_ == 2) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.result_);
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

      if (!(var1 instanceof JoinLiveExperienceResponse)) {
         return super.equals(var1);
      }

      JoinLiveExperienceResponse var2 = (JoinLiveExperienceResponse)var1;
      if (!this.getResultCase().equals(var2.getResultCase())) {
         return false;
      }

      switch (this.resultCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getServer().equals(var2.getServer())) {
               return false;
            }
            break;
         case 2:
            if (!this.getErrorMessage().equals(var2.getErrorMessage())) {
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
      switch (this.resultCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getServer().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getErrorMessage().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static JoinLiveExperienceResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinLiveExperienceResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinLiveExperienceResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinLiveExperienceResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinLiveExperienceResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static JoinLiveExperienceResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static JoinLiveExperienceResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinLiveExperienceResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static JoinLiveExperienceResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static JoinLiveExperienceResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static JoinLiveExperienceResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static JoinLiveExperienceResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public JoinLiveExperienceResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static JoinLiveExperienceResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static JoinLiveExperienceResponse.Builder newBuilder(JoinLiveExperienceResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public JoinLiveExperienceResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new JoinLiveExperienceResponse.Builder() : new JoinLiveExperienceResponse.Builder().mergeFrom(this);
   }

   protected JoinLiveExperienceResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new JoinLiveExperienceResponse.Builder(var1);
   }

   public static JoinLiveExperienceResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<JoinLiveExperienceResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<JoinLiveExperienceResponse> getParserForType() {
      return PARSER;
   }

   public JoinLiveExperienceResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<JoinLiveExperienceResponse.Builder> implements JoinLiveExperienceResponseOrBuilder {
      private int resultCase_ = 0;
      private Object result_;
      private int bitField0_;
      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> serverBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(JoinLiveExperienceResponse.class, JoinLiveExperienceResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public JoinLiveExperienceResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.serverBuilder_ != null) {
            this.serverBuilder_.clear();
         }

         this.resultCase_ = 0;
         this.result_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_liveexperience_v1_JoinLiveExperienceResponse_descriptor;
      }

      public JoinLiveExperienceResponse getDefaultInstanceForType() {
         return JoinLiveExperienceResponse.getDefaultInstance();
      }

      public JoinLiveExperienceResponse build() {
         JoinLiveExperienceResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public JoinLiveExperienceResponse buildPartial() {
         JoinLiveExperienceResponse var1 = new JoinLiveExperienceResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(JoinLiveExperienceResponse var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(JoinLiveExperienceResponse var1) {
         var1.resultCase_ = this.resultCase_;
         var1.result_ = this.result_;
         if (this.resultCase_ == 1 && this.serverBuilder_ != null) {
            var1.result_ = this.serverBuilder_.build();
         }
      }

      public JoinLiveExperienceResponse.Builder clone() {
         return (JoinLiveExperienceResponse.Builder)super.clone();
      }

      public JoinLiveExperienceResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinLiveExperienceResponse.Builder)super.setField(var1, var2);
      }

      public JoinLiveExperienceResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (JoinLiveExperienceResponse.Builder)super.clearField(var1);
      }

      public JoinLiveExperienceResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (JoinLiveExperienceResponse.Builder)super.clearOneof(var1);
      }

      public JoinLiveExperienceResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (JoinLiveExperienceResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public JoinLiveExperienceResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (JoinLiveExperienceResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public JoinLiveExperienceResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof JoinLiveExperienceResponse) {
            return this.mergeFrom((JoinLiveExperienceResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public JoinLiveExperienceResponse.Builder mergeFrom(JoinLiveExperienceResponse var1) {
         if (var1 == JoinLiveExperienceResponse.getDefaultInstance()) {
            return this;
         }

         switch (var1.getResultCase()) {
            case SERVER:
               this.mergeServer(var1.getServer());
               break;
            case ERROR_MESSAGE:
               this.resultCase_ = 2;
               this.result_ = var1.result_;
               this.onChanged();
            case RESULT_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public JoinLiveExperienceResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getServerFieldBuilder().getBuilder(), var2);
                     this.resultCase_ = 1;
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.resultCase_ = 2;
                     this.result_ = var5;
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
      public JoinLiveExperienceResponse.ResultCase getResultCase() {
         return JoinLiveExperienceResponse.ResultCase.forNumber(this.resultCase_);
      }

      public JoinLiveExperienceResponse.Builder clearResult() {
         this.resultCase_ = 0;
         this.result_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasServer() {
         return this.resultCase_ == 1;
      }

      @Override
      public AddressAndPort getServer() {
         if (this.serverBuilder_ == null) {
            return this.resultCase_ == 1 ? (AddressAndPort)this.result_ : AddressAndPort.getDefaultInstance();
         } else {
            return this.resultCase_ == 1 ? this.serverBuilder_.getMessage() : AddressAndPort.getDefaultInstance();
         }
      }

      public JoinLiveExperienceResponse.Builder setServer(AddressAndPort var1) {
         if (this.serverBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.result_ = var1;
            this.onChanged();
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.resultCase_ = 1;
         return this;
      }

      public JoinLiveExperienceResponse.Builder setServer(AddressAndPort.Builder var1) {
         if (this.serverBuilder_ == null) {
            this.result_ = var1.build();
            this.onChanged();
         } else {
            this.serverBuilder_.setMessage(var1.build());
         }

         this.resultCase_ = 1;
         return this;
      }

      public JoinLiveExperienceResponse.Builder mergeServer(AddressAndPort var1) {
         if (this.serverBuilder_ == null) {
            if (this.resultCase_ == 1 && this.result_ != AddressAndPort.getDefaultInstance()) {
               this.result_ = AddressAndPort.newBuilder((AddressAndPort)this.result_).mergeFrom(var1).buildPartial();
            } else {
               this.result_ = var1;
            }

            this.onChanged();
         } else if (this.resultCase_ == 1) {
            this.serverBuilder_.mergeFrom(var1);
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.resultCase_ = 1;
         return this;
      }

      public JoinLiveExperienceResponse.Builder clearServer() {
         if (this.serverBuilder_ == null) {
            if (this.resultCase_ == 1) {
               this.resultCase_ = 0;
               this.result_ = null;
               this.onChanged();
            }
         } else {
            if (this.resultCase_ == 1) {
               this.resultCase_ = 0;
               this.result_ = null;
            }

            this.serverBuilder_.clear();
         }

         return this;
      }

      public AddressAndPort.Builder getServerBuilder() {
         return this.getServerFieldBuilder().getBuilder();
      }

      @Override
      public AddressAndPortOrBuilder getServerOrBuilder() {
         if (this.resultCase_ == 1 && this.serverBuilder_ != null) {
            return this.serverBuilder_.getMessageOrBuilder();
         } else {
            return this.resultCase_ == 1 ? (AddressAndPort)this.result_ : AddressAndPort.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<AddressAndPort, AddressAndPort.Builder, AddressAndPortOrBuilder> getServerFieldBuilder() {
         if (this.serverBuilder_ == null) {
            if (this.resultCase_ != 1) {
               this.result_ = AddressAndPort.getDefaultInstance();
            }

            this.serverBuilder_ = new SingleFieldBuilderV3<>((AddressAndPort)this.result_, this.getParentForChildren(), this.isClean());
            this.result_ = null;
         }

         this.resultCase_ = 1;
         this.onChanged();
         return this.serverBuilder_;
      }

      @Override
      public boolean hasErrorMessage() {
         return this.resultCase_ == 2;
      }

      @Override
      public String getErrorMessage() {
         Object var1 = "";
         if (this.resultCase_ == 2) {
            var1 = this.result_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.resultCase_ == 2) {
               this.result_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getErrorMessageBytes() {
         Object var1 = "";
         if (this.resultCase_ == 2) {
            var1 = this.result_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.resultCase_ == 2) {
               this.result_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public JoinLiveExperienceResponse.Builder setErrorMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.resultCase_ = 2;
         this.result_ = var1;
         this.onChanged();
         return this;
      }

      public JoinLiveExperienceResponse.Builder clearErrorMessage() {
         if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
            this.onChanged();
         }

         return this;
      }

      public JoinLiveExperienceResponse.Builder setErrorMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         JoinLiveExperienceResponse.checkByteStringIsUtf8(var1);
         this.resultCase_ = 2;
         this.result_ = var1;
         this.onChanged();
         return this;
      }

      public final JoinLiveExperienceResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (JoinLiveExperienceResponse.Builder)super.setUnknownFields(var1);
      }

      public final JoinLiveExperienceResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (JoinLiveExperienceResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ResultCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      SERVER(1),
      ERROR_MESSAGE(2),
      RESULT_NOT_SET(0);

      private final int value;

      ResultCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static JoinLiveExperienceResponse.ResultCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static JoinLiveExperienceResponse.ResultCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return RESULT_NOT_SET;
            case 1:
               return SERVER;
            case 2:
               return ERROR_MESSAGE;
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
