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
public class ListenState extends ConnectionState {

	MyPanel panel;
	public ListenState(MyPanel p)
	{
		panel=p;
		background=Color.yellow;
		state="现在监听状态。。。";
	}
	public void connect()
	{
		panel.setState(MyFrame.connectedState);
	}
	public void send()
	{
		JOptionPane.showMessageDialog(null,"现在是监听状态，不能发送信号，请先连接");
	}
	public void close()
	{
		JOptionPane.showMessageDialog(null,"还未连接，已经是监听状态");
	}
}
