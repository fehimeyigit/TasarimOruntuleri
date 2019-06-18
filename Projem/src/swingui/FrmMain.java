package swingui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Fp.FactoryMain;
import abstractFactory.AbstractMain;
import builder.BuilderMain;
import decorator.DecoratorMain;
import singleton.SingletonMain;

import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton singletn = new JButton("Randevu G\u00F6r\u00FCnt\u00FCle");
		singletn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				singleton.SingletonMain sng=new SingletonMain();
				sng.main(null);
			}
		});
		singletn.setBounds(10, 23, 153, 23);
		panel.add(singletn);
		
		JButton Prototype = new JButton("Hasta Listeleri");
		Prototype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prototype.Main pr=new Prototype.Main();
				try {
					pr.main(null);
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Prototype.setBounds(299, 23, 161, 23);
		panel.add(Prototype);
		
		JButton Iterator = new JButton("Poliklinikler");
		Iterator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator.Main it= new Iterator.Main();
				it.main(null);
			}
		});
		Iterator.setBounds(178, 23, 111, 23);
		panel.add(Iterator);
		
		JButton builder = new JButton("Kay\u0131tl\u0131 Hasta Bilgileri");
		builder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuilderMain b=new BuilderMain();
				b.main(null);
			}
		});
		builder.setBounds(10, 87, 158, 23);
		panel.add(builder);
		
		JButton decorator = new JButton("Tetkikler");
		decorator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecoratorMain dc=new DecoratorMain();
				dc.main(null);
			}
		});
		decorator.setBounds(178, 153, 111, 23);
		panel.add(decorator);
		
		JButton abstractFactory = new JButton("Poliklinik \u00C7al\u0131\u015Fanlar\u0131");
		abstractFactory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbstractMain af=new AbstractMain();
				af.main(null);
				
			}
		});
		abstractFactory.setBounds(299, 87, 161, 23);
		panel.add(abstractFactory);
		
		JButton factory = new JButton("Sorumlu Hemsire");
		factory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FactoryMain fm=new FactoryMain();
				fm.main(null);
			}
		});
		factory.setBounds(10, 153, 158, 23);
		panel.add(factory);
		
		JButton memento = new JButton("Hasta S\u0131ras\u0131");
		memento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Memento.Main mem=new Memento.Main();
				mem.main(null);
			}
		});
		memento.setBounds(178, 87, 111, 23);
		panel.add(memento);
		
		JButton mediator = new JButton("Tahlil S\u0131ras\u0131");
		mediator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mediator.Main med=new Mediator.Main();
				med.main(null);
			}
		});
		mediator.setBounds(299, 205, 161, 23);
		panel.add(mediator);
		
		JButton objectpool = new JButton("Ilac Listesi");
		objectpool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OP.Main op=new OP.Main();
				op.main(null);
			}
		});
		objectpool.setBounds(10, 205, 158, 23);
		panel.add(objectpool);
		
		JButton observer = new JButton("Hasta Bildirimleri");
		observer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				observer.Main obs=new observer.Main();
				obs.main(null);
			}
		});
		observer.setBounds(299, 153, 161, 23);
		panel.add(observer);
	}
}
