package org.jctools.util;

public interface UnsafeJvmInfo {
   int PAGE_SIZE = UnsafeAccess.UNSAFE.pageSize();
}
