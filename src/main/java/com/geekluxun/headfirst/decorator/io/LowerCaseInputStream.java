package com.geekluxun.headfirst.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 实现自己的输入流装饰者类
 * 提供新的行为"转换成小写"
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
