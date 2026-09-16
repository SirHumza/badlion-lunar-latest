package org.apache.commons.compress.archivers.zip;

public interface ZipExtraField {
   ZipShort getHeaderId();

   ZipShort getLocalFileDataLength();

   ZipShort getCentralDirectoryLength();

   byte[] getLocalFileDataData();

   byte[] getCentralDirectoryData();

   void parseFromLocalFileData(byte[] var1, int var2, int var3);

   void parseFromCentralDirectoryData(byte[] var1, int var2, int var3);
}
