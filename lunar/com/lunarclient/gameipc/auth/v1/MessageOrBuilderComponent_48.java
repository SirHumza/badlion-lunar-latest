package com.lunarclient.gameipc.auth.v1;

import com.google.protobuf.MessageOrBuilder;

public interface AddAccountResponseOrBuilder extends MessageOrBuilder {
   boolean getSuccess();

   int getErrorValue();

   AddAccountResponse.AccountError getError();
}
