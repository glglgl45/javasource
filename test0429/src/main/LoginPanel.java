package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dbguide.ClickerDAO;
import dbguide.ClickerUserVO;
import system.Pickax;

public class LoginPanel extends JPanel {

	private JTextField txtId; // 아이디 입력창
	private JPasswordField txtPw; // 비밀번호 입력창
	private ClickerDAO dao = new ClickerDAO(); // DB
	private Pickax pick = new Pickax(); // 곡괭이
	private JButton btnLogin, btnSignUp, btnEnd,btnSignUpDel,btnScore;
	private int loginProcess;
	
	public int getLoginProcess() {
		return loginProcess;
	}

	public void setLoginProcess(int loginProcess) {
		this.loginProcess = loginProcess;
	}

	private ImageIcon backGround = new ImageIcon(MiddlePage.class.getResource("/img/bckimg/main-demo.png")); // 배경 이미지 세팅	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(backGround.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	public LoginPanel() {
		setBounds(100, 100, 730, 650); // 패널 크기 설정
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		
		JPanel backPanel = new JPanel();
		backPanel.setLayout(null);
		add(backPanel, BorderLayout.CENTER);
		backPanel.setOpaque(false);
		
		// 아이디
		JLabel lblID = new JLabel("아이디");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblID.setBounds(230, 245, 97, 35);
		backPanel.add(lblID);
		
		// 아이디 입력창
		txtId = new JTextField();
		txtId.setBounds(355, 248, 120, 30);
		backPanel.add(txtId);
		txtId.setColumns(10);
		
		// 비밀번호
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblPw.setBounds(215, 307, 128, 35);
		backPanel.add(lblPw);
		
		// 비밀번호 입력창 
		txtPw = new JPasswordField();
		txtPw.setBounds(355, 310, 120, 30);
		backPanel.add(txtPw);
		txtPw.setColumns(10); 
		txtPw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClickerUserVO vo = new ClickerUserVO();
				vo = dao.searchUser(txtId.getText()); //DB 존재 유/무 조회
				if(vo!=null) {
					if(e.getActionCommand().equals("로그인") || e.getSource()==txtPw) {	//로그인버튼 및 txtPw에서 엔터 입력 시 진행
						if(vo.getId().equals(txtId.getText()) && //DB의 아이디와 비밀번호가 모두 일치시 진행
								vo.getPwd().equals(new String(txtPw.getPassword()))) {	
							if(vo.getProgress()==1) {
//								dispose();
								String options[] = {"확인","계정삭제","랭킹보기"};
								int sel=JOptionPane.showOptionDialog(getParent(), "이미 클리어한 계정입니다.\n삭제 후 재가입하여 이용해 주세요.", "클리어 유저", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
								if(sel==2) {									
									Ranking rank = new Ranking();
								}else if(sel==1) {
									int result=dao.deleteUser(txtId.getText());
									if(result>0) {
										JOptionPane.showMessageDialog(getParent(), "삭제 완료\n재가입 후 이용해 주세요.");
										txtId.setText("");
										txtPw.setText("");
									}									
								}
							}else {
								// 로그인 성공
								pick=dao.insertPickax(txtId.getText());		//DB의 정보를 Pickax의 변수에 입력 
								Frame.setLoginProcess(1);
							}
						}else {
							JOptionPane.showMessageDialog(getParent(), "비밀번호를 확인해 주세요.");				
						}
					}else {
						JOptionPane.showMessageDialog(getParent(), "ID를 확인해 주세요.");
					}
				}else {
					JOptionPane.showMessageDialog(getParent(), "존재하지 않는 계정입니다.\n회원가입 후 이용해 주세요.");
					txtId.setText("");
					txtPw.setText("");
				}
			}
		});		
		
		// 로그인 버튼
		btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnLogin.setBounds(235, 368, 240, 30);
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClickerUserVO vo = new ClickerUserVO();
				vo = dao.searchUser(txtId.getText()); //DB 존재 유/무 조회
				if(vo!=null) {
					if(e.getActionCommand().equals("로그인") || e.getSource()==txtPw) {	//로그인버튼 및 txtPw에서 엔터 입력 시 진행
						if(vo.getId().equals(txtId.getText()) && //DB의 아이디와 비밀번호가 모두 일치시 진행
								vo.getPwd().equals(new String(txtPw.getPassword()))) {	
							if(vo.getProgress()==1) {
//								dispose();
								String options[] = {"확인","계정삭제","랭킹보기"};
								int sel=JOptionPane.showOptionDialog(getParent(), "이미 클리한 계정입니다.\n삭제 후 재가입하여 이용해 주세요.", "클리어 유저", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
								if(sel==2) {									
									Ranking rank = new Ranking();
								}else if(sel==1) {
									int result=dao.deleteUser(txtId.getText());
									if(result>0) {
										JOptionPane.showMessageDialog(getParent(), "삭제 완료\n재가입 후 이용해 주세요.");
										txtId.setText("");
										txtPw.setText("");
									}									
								}
							}else {								
								pick=dao.insertPickax(txtId.getText());		//DB의 정보를 Pickax의 변수에 입력
								loginProcess = 1;
//								setVisible(false);
//								JPanel middlePage = new JPanel();
//								middlePage.setLayout(new BorderLayout());
//								add(middlePage);
//								middlePage.add(new MiddlePane());
//								setVisible(true);
							}
						}else {
							JOptionPane.showMessageDialog(getParent(), "비밀번호를 확인해 주세요.");				
						}
					}else {
						JOptionPane.showMessageDialog(getParent(), "ID를 확인해 주세요.");
					}
				}else {
					JOptionPane.showMessageDialog(getParent(), "존재하지 않는 계정입니다.\n회원가입 후 이용해 주세요.");
					txtId.setText("");
					txtPw.setText("");
				}
			}
		});
		backPanel.add(btnLogin); // 패널에 로그인 버튼 추가
		
		// 회원가입 버튼
		btnSignUp = new JButton("회원가입");
		btnSignUp.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnSignUp.setBounds(235, 408, 240, 30);
		btnSignUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUp s = new SignUp();
			}
		});
		backPanel.add(btnSignUp);

		// 종료 버튼
		btnEnd = new JButton(new ImageIcon(MainPage.class.getResource("/img/system/Exit.png")));
		btnEnd.setContentAreaFilled(false);
		btnEnd.setBorderPainted(false);
		btnEnd.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnEnd.setBounds(597, 511, 91, 79);
		btnEnd.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				}
			}
		);
		btnEnd.addMouseListener(
			new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {}
				
				@Override
				public void mousePressed(MouseEvent e) {}
				// 마우스 롤아웃 이미지 변경
				@Override
				public void mouseExited(MouseEvent e) {
					btnEnd.setIcon(new ImageIcon(MainPage.class.getResource("/img/system/Exit.png")));
				}
				// 마우스 롤오버 이미지 변경
				@Override
				public void mouseEntered(MouseEvent e) {
					btnEnd.setIcon(new ImageIcon(MainPage.class.getResource("/img/system/redExit.png")));
				}
				@Override
				public void mouseClicked(MouseEvent e) {}
			}
		);
		backPanel.add(btnEnd);

		// 회원삭제 버튼
		btnSignUpDel = new JButton("회원삭제");
		btnSignUpDel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnSignUpDel.setBounds(235, 448, 240, 30);
		btnSignUpDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDel ud = new UserDel();
			}
		});
		backPanel.add(btnSignUpDel);
		
		// 점수보기 버튼
		btnScore = new JButton("점수보기");
		btnScore.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnScore.setBounds(235, 487, 240, 30);
		btnScore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Ranking ra = new Ranking();
			}
		});
		backPanel.add(btnScore);
		
		setVisible(true);	

	}

}
