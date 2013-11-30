import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * 创建日期 2009-9-12
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xxzxxz
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class MyPanel extends JPanel implements ActionListener{
	
	ConnectionState state=null;
	public MyPanel()
	{
		JButton link=new JButton("连接");
		JButton send=new JButton("发送信息");
		JButton broken=new JButton("断开");
		link.addActionListener(this);
		send.addActionListener(this);
		broken.addActionListener(this);
		add(link);add(send);add(broken);	
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);		
		setBackground(state.getbackground());
		g.drawString(state.getstate(),200,150);
		
	}
	public void setState(ConnectionState s)
	{
		state=s;
		repaint();
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成方法存根
		if(arg0.getActionCommand().equals("连接"))state.connect();
		else if(arg0.getActionCommand().equals("发送信息"))state.send();
		else if(arg0.getActionCommand().equals("断开"))state.close();		
	}
	
}
