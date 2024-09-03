package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BinaryFile {
  public static byte[] read(File bFile) throws IOException{
      try (BufferedInputStream bf = new BufferedInputStream(
              Files.newInputStream(bFile.toPath()))) {
          byte[] data = new byte[bf.available()];
          bf.read(data);
          return data;
      }
  }

  public static byte[]
  read(String bFile) throws IOException {
    return read(new File(bFile).getAbsoluteFile());
  }
}
