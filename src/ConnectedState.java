import java.awt.Color;

import javax.swing.JOptionPane;



/*
 * 创建日期 2009-10-11
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
public class ConnectedState extends ConnectionState {

	MyPanel panel;
	
	public ConnectedState(MyPanel p)
	{
		panel=p;
		background=Color.green;
		state="现在连接状态。。。可以接收信息";
	}
	public void connect()
	{
		JOptionPane.showMessageDialog(null,"现在是已经是连接状态，可以发送信号了");
		
	}
	public void send()
	{
		//JOptionPane.showMessageDialog(null,"现在发送信号成功");
		panel.setState(MyFrame.waitState);
		MyFrame.waitState.wait.start();
	}
	public void close()
	{
		panel.setState(MyFrame.listenState);
	}
}
