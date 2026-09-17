package com.typesafe.config.impl;

interface ReplaceableMergeStack extends Container {
   AbstractConfigValue makeReplacement(ResolveContext var1, int var2);
}
