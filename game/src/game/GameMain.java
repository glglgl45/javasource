package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

public class GameMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtScore;
	private JTable table;
	private DefaultTableModel model;
	private GameDAO dao;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMain frame = new GameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GameMain() {
		dao = new GameDAO();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		panel.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("점수");
		panel_4.add(lblNewLabel_4);
		
		model = getModel();
		table = new JTable(model);
		list();
		panel_1.add(table, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		panel_2.add(lblNewLabel_1);
		
		txtName = new JTextField();
		panel_2.add(txtName);
		txtName.setColumns(5);
		
		JLabel lblNewLabel_2 = new JLabel("점수");
		panel_2.add(lblNewLabel_2);
		
		txtScore = new JTextField();
		txtScore.addActionListener(this);
		panel_2.add(txtScore);
		txtScore.setColumns(5);
		
		JButton btnSubject = new JButton("제출");
		btnSubject.addActionListener(this);
		panel_2.add(btnSubject);
		
		JLabel lblNewLabel = new JLabel("명예의 전당");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("새굴림", Font.BOLD, 20));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
	}
	
	public DefaultTableModel getModel() {
		String columnNames[] = {"이름","점수"};
		model = new DefaultTableModel(columnNames,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		return model;
	}

	public void list() {
		Vector<GameVO> vecList = dao.scoreList();
		
		// vecList에 들어있는 값을 table에 보여주기
		for(GameVO vo : vecList) {
			Object[] objList = {vo.getName(),vo.getScore()};
			model.addRow(objList);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("제출") || e.getSource()==txtScore) {
			try {
				if (txtName.getText().equals("") || txtScore.getText().equals("")){
					JOptionPane.showMessageDialog(this, "입력 데이터를 확인해 주세요","확인",JOptionPane.WARNING_MESSAGE);	
				} else {
					GameVO vo = new GameVO();
					vo.setName(txtName.getText());
					vo.setScore(Integer.parseInt(txtScore.getText()));
					int result = dao.scoreInsert(vo);
					if (result > 0) {
						JOptionPane.showMessageDialog(this, "데이터를 성공적으로 입력하였습니다");
						model.setNumRows(0);
						list();
						txtName.setText("");
						txtScore.setText("");
					} else {
						JOptionPane.showMessageDialog(this, "입력 데이터를 확인해 주세요","확인",JOptionPane.WARNING_MESSAGE);				
					}				
				}
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "입력 데이터를 확인해 주세요","확인",JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}
