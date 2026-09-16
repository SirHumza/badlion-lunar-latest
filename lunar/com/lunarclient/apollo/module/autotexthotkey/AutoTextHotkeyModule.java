package com.lunarclient.apollo.module.autotexthotkey;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.ListOption;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ModuleDefinition(id = "auto_text_hotkey", name = "Auto Text Hotkey")
public final class AutoTextHotkeyModule extends ApolloModule {
   public static final SimpleOption<Boolean> BLOCK_TEXT_INPUTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to block certain text inputs, otherwise 'false'."))
                  .node("block-text-inputs"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final ListOption<String> BLOCKED_TEXT_INPUTS = ((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)Option.list()
                     .comment("A list of text inputs that are blocked and cannot be used by the user."))
                  .node("blocked-text-inputs"))
               .type(new TypeToken<List<String>>() {}))
            .defaultValue(new ArrayList<>(Arrays.asList("/sellall", "/msg", "/pay"))))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> BLOCK_CHAT_MESSAGE_TEXT_INPUTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to block chat message text inputs, otherwise 'false'."))
                  .node("block-chat-message-text-inputs"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   AutoTextHotkeyModule() {
      this.registerOptions(BLOCK_TEXT_INPUTS, BLOCKED_TEXT_INPUTS, BLOCK_CHAT_MESSAGE_TEXT_INPUTS);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }
}
