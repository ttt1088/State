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
public class CloseState extends ConnectionState {

	MyPanel panel;
	public CloseState(MyPanel p)
	{
		panel=p;
		background=Color.gray;
		state="现在关闭状态。。。";
		
	}
	public void connect()
	{
		JOptionPane.showMessageDialog(null,"现在是关闭状态，不能连接");
	}
	public void send()
	{
		JOptionPane.showMessageDialog(null,"现在是关闭状态，不能发送信号");
	}
	public void close()
	{
		JOptionPane.showMessageDialog(null,"现在是关闭状态，不能发送信号");

	}
}
