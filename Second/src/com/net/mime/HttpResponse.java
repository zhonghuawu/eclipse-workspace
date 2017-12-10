package com.net.mime;

/***
 * HttpResponse Parse a return message and MIME header from a server. 
 * HTTP/1.0 302 Found = redirection, check Location for where.
 * HTTP/1.0 200 OK = file data comes after mime header.
 * data comes after mime header
 * 
 * @author Huaa
 * 
 */
class HttpResponse {
	int statusCode; // Status-Code in specific
	String reasonPhrase; // Reason-Phrase in specific
	MimeHeader mh;
	static String CRLF = "\r\n";

	void parse(String request) {
		int fsp = request.indexOf(' ');
		int nsp = request.indexOf(' ', fsp + 1);
		int eol = request.indexOf('\n');

		// String protocol = request.substring(0, fsp);
		statusCode = Integer.parseInt(request.substring(fsp + 1, nsp));
		reasonPhrase = request.substring(nsp + 1, eol);

		String raw_mime_header = request.substring(eol + 1);

		mh = new MimeHeader(raw_mime_header);
	}

	HttpResponse(String request) {
		// TODO Auto-generated constructor stub
		parse(request);
	}

	HttpResponse(int code, String reason, MimeHeader m) {
		statusCode = code;
		reasonPhrase = reason;
		mh = m;
	}

	public String toString() {
		return "HTTP/1.0 " + statusCode + " " + reasonPhrase + CRLF + mh + CRLF;
	}

}
