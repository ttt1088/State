import java.awt.Color;

import javax.swing.JOptionPane;

public class WaitState extends ConnectionState{
	MyPanel panel;
	public WaitThread wait=null;
	public WaitState(MyPanel p)
	{		
		panel=p;
		background=Color.blue;
		state="现在正在发送中，请等待。。。";
		wait=new WaitThread();

		
	}
	public void connect()
	{
		JOptionPane.showMessageDialog(null,"发送中，请等待");
	}
	public void send()
	{
		JOptionPane.showMessageDialog(null,"发送中，请等待");
	}
	public void close()
	{
		JOptionPane.showMessageDialog(null,"发送中，请等待");
	}
	class WaitThread implements Runnable//内部类
	{
		Thread waiting=null;
		public void start()//创建线程并启动
		{
			waiting=new Thread(this);
			waiting.start();
			
		}
		public void run() {
			try {
				Thread.sleep(2000);
				panel.setState(MyFrame.connectedState);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
