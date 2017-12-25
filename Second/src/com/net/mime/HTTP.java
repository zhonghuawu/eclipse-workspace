package com.net.mime;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class HTTP extends Applet implements LogMessage, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6717783145274739452L;
	private int m_port = 80;
	private String m_docroot = ".";
	private Httpd m_httpd;
	private TextArea m_log;
	private Label status;

	private final String PARAM_port = "port";
	private final String PARAM_docroot = "docroot";

	private HTTP() {

	}

	public void init() {
		setBackground(Color.white);
		String param;

		// port: Port number to listen on
		param = getParameter(PARAM_port);
		if (param != null) {
			m_port = Integer.parseInt(param);
		}

		// docroot: web document root
		param = getParameter(PARAM_docroot);
		if (param != null) {
			m_docroot = param;
		}

		this.setLayout(new BorderLayout());

		Label lab = new Label("Java HTTPD");

		lab.setFont(new Font("SansSerif", Font.BOLD, 18));
		this.add("North", lab);
		m_log = new TextArea("", 24, 80);
		this.add("Center", m_log);
		Panel p = new Panel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));
		this.add("South", p);
		Button bstart = new Button("Start");
		bstart.addActionListener(this);
		p.add(bstart);
		Button bstop = new Button("Stop");
		bstop.addActionListener(this);
		p.add(bstop);

		status = new Label("raw");
		status.setForeground(Color.green);
		status.setFont(new Font("SansSerif", Font.BOLD, 10));
		p.add(status);
		m_httpd = new Httpd(m_port, m_docroot, this);

	}

	public void destroy() {
		stop();
	}

	public void paint(Graphics g) {

	}

	public void start() {
		m_httpd.start();
		status.setText("Running ");
		clear_log("Log started on " + new Date() + "\n");
	}

	public void stop() {
		m_httpd.stop();
		status.setText("Stopped ");
	}

	private void clear_log(String msg) {
		// TODO Auto-generated method stub
		m_log.setText(msg + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String label = ae.getActionCommand();
		if (label.equals("Start")) {
			start();
		} else {
			stop();
		}
	}

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		m_log.append(msg);
		status.setText(m_httpd.hits_served + " hits (" + (m_httpd.bytes_served / 1024) + "K), " + m_httpd.files_in_cache
				+ " cached files (" + (m_httpd.bytes_in_cache / 1024) + "K), " + m_httpd.hits_to_cache
				+ " cached hits");
		status.setSize(status.getPreferredSize());
	}

}
