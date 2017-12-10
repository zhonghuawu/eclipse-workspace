package com.net.mime;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

class MimeHeader extends Hashtable<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -445246203678188138L;

	void parse(String data) {
		StringTokenizer st = new StringTokenizer(data, "\r\n");

		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			int colon = s.indexOf(':');
			String key = s.substring(0, colon);
			String val = s.substring(colon + 2);// skip ':'
			put(key, val);
		}
	}

	MimeHeader() {
	}

	MimeHeader(String d) {
		parse(d);
	}

	public String toString() {
		String ret = "";
		Enumeration<String> e = keys();

		while (e.hasMoreElements()) {
			String key = e.nextElement();
			String val = get(key);
			ret += key + ": " + val + "\r\n";
		}
		return ret;
	}

	// This simple function converts a mime string from
	// any variant of capitalization to a canonical form.
	// For example: CONTENT-TYPE or content-type to Content-Type,
	// or Content-length or CoNTeNT-LENgth to Content-Length.
	private String fix(String ms) {
		char[] chars = ms.toLowerCase().toCharArray();
		boolean upcaseNext = true;

		for (int i = 0; i < chars.length - 1; i++) {
			char ch = chars[i];
			if (upcaseNext && 'a' <= ch && ch <= 'z') {
				chars[i] = (char) (ch - ('a' - 'A'));
			}
			upcaseNext = ch == '-';
		}
		return new String(chars);
	}

	public String get(String key) {
		return super.get(fix(key));
	}

	public String put(String key, String val) {
		return super.put(fix(key), val);
	}

}
