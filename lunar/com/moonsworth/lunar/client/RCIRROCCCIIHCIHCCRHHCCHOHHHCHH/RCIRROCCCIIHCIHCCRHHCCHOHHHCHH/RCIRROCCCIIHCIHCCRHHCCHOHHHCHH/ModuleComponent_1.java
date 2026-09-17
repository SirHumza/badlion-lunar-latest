package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.apollo.module.autotexthotkey.AutoTextHotkeyModule;
import com.lunarclient.apollo.option.Option;
import java.util.Collection;
import java.util.List;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super("auto_text_hotkey", "Auto Text Hotkey");
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(AutoTextHotkeyModule.BLOCK_TEXT_INPUTS, AutoTextHotkeyModule.BLOCKED_TEXT_INPUTS, AutoTextHotkeyModule.BLOCK_CHAT_MESSAGE_TEXT_INPUTS);
   }
}
