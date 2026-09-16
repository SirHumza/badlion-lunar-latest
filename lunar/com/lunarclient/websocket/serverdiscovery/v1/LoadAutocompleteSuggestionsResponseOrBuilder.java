package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoadAutocompleteSuggestionsResponseOrBuilder extends MessageOrBuilder {
   List<AutocompleteSuggestion> getSuggestionsList();

   AutocompleteSuggestion getSuggestions(int var1);

   int getSuggestionsCount();

   List<? extends AutocompleteSuggestionOrBuilder> getSuggestionsOrBuilderList();

   AutocompleteSuggestionOrBuilder getSuggestionsOrBuilder(int var1);
}
