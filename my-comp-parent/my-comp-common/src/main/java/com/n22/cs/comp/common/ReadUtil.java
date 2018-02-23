package com.n22.cs.comp.common;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import com.n22.cs.comp.common.log.LogTool;

/**
 * @desc 用于读取资源文件
 * @note resource 均指class下的路径
 * @author xxx
 * @date 2016年10月29日 下午1:08:38
 */
public class ReadUtil {

	public final static int DEFAULT_BUFFER_SIZE = 1024 * 4;

	public static String read(InputStream in) {
		InputStreamReader reader;
		try {
			reader = new InputStreamReader(in, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
		return read(reader);
	}

	/**
	 * @desc:读取资源文件
	 * @auth:xxx
	 * @date:2016年10月29日 下午1:09:06
	 * @param 类加载路径
	 *            调用者获取方式 Thread.currentThread().getContextClassLoader()
	 * @param resource
	 *            resources路径下的资源
	 * @return
	 * @throws IOException
	 *
	 */
	public static String readFromResource(ClassLoader classLoader, String resource) {
		InputStream in = null;
		try {
			in = classLoader.getResourceAsStream(resource);
			if (in == null) {
				LogTool.info(ReadUtil.class, ">>>>>>无法读取资源文件，请确定类加载路劲是否存在文件:" + classLoader.getResource(resource));
				return null;
			}

			String text = ReadUtil.read(in);
			return text;
		} catch (Exception e) {
			LogTool.error(ReadUtil.class, new Exception(">>>>>>读取资源文件异常", e));
		} finally {
			close(in);
		}
		return null;
	}

	/**
	 * @desc:读取资源文件
	 * @auth:xxx
	 * @date:2016年10月29日 下午1:09:06
	 * @param 类加载路径
	 *            调用者获取方式 Thread.currentThread().getContextClassLoader()
	 * @param resource
	 *            resources路径下的资源
	 * @return
	 * @throws IOException
	 *
	 */
	public static byte[] readByteArrayFromResource(ClassLoader classLoader, String resource) {
		InputStream in = null;
		try {
			in = classLoader.getResourceAsStream(resource);
			if (in == null) {
				LogTool.info(ReadUtil.class, ">>>>>>无法读取资源文件，请确定类加载路劲是否存在文件:" + classLoader.getResource(resource));
				return null;
			}

			return readByteArray(in);
		} catch (Exception e) {
			LogTool.error(ReadUtil.class, new Exception(">>>>>>读取资源文件异常", e));
		} finally {
			close(in);
		}
		return null;
	}

	public static byte[] readByteArray(InputStream input) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		copy(input, output);
		return output.toByteArray();
	}

	public static long copy(InputStream input, OutputStream output) throws IOException {
		final int EOF = -1;

		byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];

		long count = 0;
		int n = 0;
		while (EOF != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
		}
		return count;
	}

	public static String read(Reader reader) {
		try {

			StringWriter writer = new StringWriter();

			char[] buffer = new char[DEFAULT_BUFFER_SIZE];
			int n = 0;
			while (-1 != (n = reader.read(buffer))) {
				writer.write(buffer, 0, n);
			}

			return writer.toString();
		} catch (IOException ex) {
			throw new IllegalStateException("read error", ex);
		}
	}

	public static String read(Reader reader, int length) {
		try {
			char[] buffer = new char[length];

			int offset = 0;
			int rest = length;
			int len;
			while ((len = reader.read(buffer, offset, rest)) != -1) {
				rest -= len;
				offset += len;

				if (rest == 0) {
					break;
				}
			}

			return new String(buffer, 0, length - rest);
		} catch (IOException ex) {
			throw new IllegalStateException("read error", ex);
		}
	}

	public static void close(Closeable x) {
		if (x == null) {
			return;
		}

		try {
			x.close();
		} catch (Exception e) {
			LogTool.info(ReadUtil.class, "close error");
		}
	}

}
