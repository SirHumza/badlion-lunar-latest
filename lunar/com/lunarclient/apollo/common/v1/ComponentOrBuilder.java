package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

@Deprecated
public interface ComponentOrBuilder extends MessageOrBuilder {
   String getContent();

   ByteString getContentBytes();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();

   List<Component.TextDecorator> getDecoratorsList();

   int getDecoratorsCount();

   Component.TextDecorator getDecorators(int var1);

   List<Integer> getDecoratorsValueList();

   int getDecoratorsValue(int var1);

   List<Component> getChildrenList();

   Component getChildren(int var1);

   int getChildrenCount();

   List<? extends ComponentOrBuilder> getChildrenOrBuilderList();

   ComponentOrBuilder getChildrenOrBuilder(int var1);
}
