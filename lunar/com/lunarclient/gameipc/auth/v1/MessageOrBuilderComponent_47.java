package com.lunarclient.gameipc.auth.v1;

import com.google.protobuf.MessageOrBuilder;

public interface RefreshAccountResponseOrBuilder extends MessageOrBuilder {
   boolean getSuccess();

   int getErrorValue();

   RefreshAccountResponse.AccountError getError();
}
