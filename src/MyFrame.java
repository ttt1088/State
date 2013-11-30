import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	JMenuBar jb=new JMenuBar();
	JMenu op=new JMenu("操作");
	JMenuItem exit=new JMenuItem("退出");
	JMenuItem listen=new JMenuItem("监听");
	JMenuItem close=new JMenuItem("关闭");
	MyPanel mp;
	static ListenState  listenState;
	static CloseState closeState;
	static ConnectedState connectedState;
	static WaitState waitState;
	
	public MyFrame()
	{
		this.setJMenuBar(jb);
		jb.add(op);
		
		op.add(listen);op.add(close);op.add(exit);
		setSize(500,300);
		exit.addActionListener(this);
		listen.addActionListener(this);
		close.addActionListener(this);
		mp=new MyPanel();
		init();
		mp.setState(closeState);
		getContentPane().add(mp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
	}
	
	public void init()
	{
		listenState=new ListenState(mp);
		closeState=new CloseState(mp);
		connectedState=new ConnectedState(mp);
		waitState=new WaitState(mp);
		
	}
	/* （非 Javadoc）
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("监听"))mp.setState(listenState);
		else if(arg0.getActionCommand().equals("关闭"))mp.setState(closeState);
		else if(arg0.getActionCommand().equals("退出"))System.exit(0);
	}



}
