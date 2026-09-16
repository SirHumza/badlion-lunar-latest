package org.checkerframework.framework.qual;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface CFComment {
   String[] value();
}
