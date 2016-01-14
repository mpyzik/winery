package winery.rss;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJList extends JPanel{

	private static final long serialVersionUID = 1L;
	
	MyJList(String msg) {
		super();
		setSize(520, 80);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		String msgSplit[] = msg.split("\n");
		JLabel l0 = new JLabel(msgSplit[0]);
		l0.setSize(520, 20);
		JLabel l1 = new JLabel(msgSplit[1]);
		l1.setSize(520, 20);
		JLabel l2 = new JLabel(msgSplit[2]);
		l2.setSize(520, 20);
		add(l0);
		add(l1);
		add(l2);	
	}
}
