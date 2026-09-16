package com.moonsworth.lunar.lib.adventure.title;

import com.moonsworth.lunar.lib.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface TitlePart<T> {
   TitlePart<Component> TITLE = new TitlePart<Component>() {
      @Override
      public String toString() {
         return "TitlePart.TITLE";
      }
   };
   TitlePart<Component> SUBTITLE = new TitlePart<Component>() {
      @Override
      public String toString() {
         return "TitlePart.SUBTITLE";
      }
   };
   TitlePart<Title.Times> TIMES = new TitlePart<Title.Times>() {
      @Override
      public String toString() {
         return "TitlePart.TIMES";
      }
   };
}
