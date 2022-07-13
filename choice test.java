import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TesteGrila implements ActionListener {
	
	String[] intrebari_geografie= {
			"Care este capitala Australiei?",
			"Cate state are SUA?",
			"Cine a realizat prima calatorie in jurul pamantului?",
			"Care este cel mai vast desert?",
			"Cat de adanca este Groapa Marianelor?"
	};
	
	String[] intrebari_istorie= {
			"In ce a a avut loc Revolutia lui Tudor Vladimirescu?",
			"Cati ani a durat Razboiul de 100 de Ani?",
			"In ce an a fost asasinat John F. Kennedy?",
			"Ce organizatie a primit premiul Nobel in anul 1917?",
			"Cine este zeul suprem in mitologia nordica?"
	};
	
	String[] intrebari_film= {
			"Care film a avut cel mai mare profit?",
			"Cate parti are seria de filme Harry Potter?",
			"Cate oscaruri a primit seria de filme Lord of the Rings?",
			"Care film a fost regizat de Alfred Hitchcock?",
			"Care este actorul principal din filmul Forrest Gump?"
	};
	
	String[][] optiuni_geografie= {
			{"Sydney","Canberra","Melbourne","Adelaide"},
			{"47","48","49","50"},
			{"Vasco da Gama","Cristofor Columb","Fernando Magellan","Amerigo Vespucci"},
			{"Antartic","Sahara","Arctic","Gobi"},
			{"11.100 m","11.000 m","11.050 m","11.022 m "}
	};
	
	String[][] optiuni_istorie= {
			{"1818","1819","1820","1821"},
			{"100","99","114","112"},
			{"1963","1965","1972","1961"},
			{"World Food Programme","CARE","Oxfam International","Red Cross"},
			{"Thor","Odin","Loki","Frigg"}	
	};
	
	String[][] optiuni_film= {
			{"Avatar","Titanic","Jurassic World","Avengers:Endgame"},
			{"6","7","8","9"},
			{"5","7","10","11"},
			{"Psycho","12 Angry Men","One Flew Over the Cuckoo's Nest","It's a Wonderful Life"},
			{"Ryan Gosling","Johnny Depp","Jack Nicholson","Tom Hanks"}	
	};
		
	char[] raspunsuri_geografie= {
			'B',
			'D',
			'C',
			'A',
			'D'
	};
	
	char[] raspunsuri_istorie= {
			'D',
			'C',
			'A',
			'D',
			'B'
	};
	
	char[] raspunsuri_film= {
		'D',
		'C',
		'D',
		'A',
		'D'
	};
	
	String domeniu;
	char raspuns;
	int index;
	int scor=0;
	int nr_intrebari=intrebari_geografie.length;
	
	JFrame frame = new JFrame();
	JProgressBar bar=new JProgressBar(0,600);
	JTextField textfield1=new JTextField();
	JTextField textfield2=new JTextField();
	JButton buttonA=new JButton();
	JButton buttonB=new JButton();
	JButton buttonC=new JButton();
	JButton buttonD=new JButton();
	JLabel raspuns_A=new JLabel();
	JLabel raspuns_B=new JLabel();
	JLabel raspuns_C=new JLabel();
	JLabel raspuns_D=new JLabel();
	JTextField intrebari_ghicite=new JTextField();
	JButton buttonStart=new JButton();
	JButton buttonGeografie=new JButton();
	JButton buttonIstorie=new JButton();
	JButton buttonFilm=new JButton();
	JButton buttonUsor=new JButton();
	JButton buttonMediu=new JButton();
	JButton buttonGreu=new JButton();
	JButton buttonIesire=new JButton();
	JButton playAgain=new JButton();
	
	public TesteGrila() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);
		frame.setResizable(false);
		
		bar.setBounds(100,550,420,50);
		bar.setStringPainted(true);
		bar.setForeground(Color.RED);
	
		textfield1.setBounds(0,0,650,50);
		textfield1.setBackground(Color.DARK_GRAY);
		textfield1.setForeground(Color.BLACK);
		textfield1.setFont(new Font("Georgia",Font.PLAIN,25));
		textfield1.setBorder(BorderFactory.createBevelBorder(1));
		textfield1.setHorizontalAlignment(JTextField.CENTER);
		textfield1.setEditable(false);
		
		textfield2.setBounds(0,50,650,50);
		textfield2.setHorizontalAlignment(JTextField.CENTER);
		textfield2.setBackground(Color.DARK_GRAY);
		textfield2.setForeground(Color.BLACK);
		textfield2.setFont(new Font("Georgia",Font.PLAIN,25));
		textfield2.setBorder(BorderFactory.createBevelBorder(1));
		textfield2.setEditable(false);
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		raspuns_A.setBounds(125,100,500,100);
		raspuns_A.setBackground(Color.BLACK);
		raspuns_A.setForeground(Color.GREEN);
		raspuns_A.setFont(new Font("Georgia",Font.PLAIN,25));
		
		raspuns_B.setBounds(125,200,500,100);
		raspuns_B.setBackground(Color.BLACK);
		raspuns_B.setForeground(Color.GREEN);
		raspuns_B.setFont(new Font("Georgia",Font.PLAIN,25));
		
		raspuns_C.setBounds(125,300,500,100);
		raspuns_C.setBackground(Color.BLACK);
		raspuns_C.setForeground(Color.GREEN);
		raspuns_C.setFont(new Font("Georgia",Font.PLAIN,25));
		
		raspuns_D.setBounds(125,400,500,100);
		raspuns_D.setBackground(Color.BLACK);
		raspuns_D.setForeground(Color.GREEN);
		raspuns_D.setFont(new Font("Georgia",Font.PLAIN,25));
		
		intrebari_ghicite.setBounds(217,225,200,100);
		intrebari_ghicite.setBackground(Color.DARK_GRAY);
		intrebari_ghicite.setForeground(Color.BLACK);
		intrebari_ghicite.setFont(new Font("Georgia",Font.PLAIN,40));
		intrebari_ghicite.setBorder(BorderFactory.createBevelBorder(1));
		intrebari_ghicite.setHorizontalAlignment(JTextField.CENTER);
		intrebari_ghicite.setEditable(false);
		
		buttonStart.setBounds(217,100,200,100);
		buttonStart.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonStart.setFocusable(false);
		buttonStart.addActionListener(this);
		buttonStart.setText("Start");
		buttonStart.setForeground(Color.BLACK);
		
		buttonGeografie.setBounds(17,225,200,100);
		buttonGeografie.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonGeografie.setFocusable(false);
		buttonGeografie.addActionListener(this);
		buttonGeografie.setText("Geografie");
		buttonGeografie.setForeground(Color.BLACK);
		
		buttonIstorie.setBounds(217,225,200,100);
		buttonIstorie.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonIstorie.setFocusable(false);
		buttonIstorie.addActionListener(this);
		buttonIstorie.setText("Istorie");
		buttonIstorie.setForeground(Color.BLACK);
		
		buttonFilm.setBounds(417,225,200,100);
		buttonFilm.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonFilm.setFocusable(false);
		buttonFilm.addActionListener(this);
		buttonFilm.setText("Film");
		buttonFilm.setForeground(Color.BLACK);
		
		buttonUsor.setBounds(17,375,200,100);
		buttonUsor.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonUsor.setFocusable(false);
		buttonUsor.addActionListener(this);
		buttonUsor.setText("Usor");
		buttonUsor.setForeground(Color.BLACK);
		
		buttonMediu.setBounds(217,375,200,100);
		buttonMediu.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonMediu.setFocusable(false);
		buttonMediu.addActionListener(this);
		buttonMediu.setText("Mediu");
		buttonMediu.setForeground(Color.BLACK);
		
		buttonGreu.setBounds(417,375,200,100);
		buttonGreu.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonGreu.setFocusable(false);
		buttonGreu.addActionListener(this);
		buttonGreu.setText("Greu");
		buttonGreu.setForeground(Color.BLACK);
		
		buttonIesire.setBounds(217,500,200,100);
		buttonIesire.setFont(new Font("Georgia",Font.PLAIN,25));
		buttonIesire.setFocusable(false);
		buttonIesire.addActionListener(this);
		buttonIesire.setText("Iesire");
		buttonIesire.setForeground(Color.BLACK);
		
		playAgain.setBounds(217,375,200,100);
		playAgain.setFont(new Font("Georgia",Font.PLAIN,25));
		playAgain.setFocusable(false);
		playAgain.addActionListener(this);
		playAgain.setText("Play Again");
		playAgain.setForeground(Color.BLACK);
		
		
		frame.add(textfield1);
		frame.add(textfield2);
		frame.add(bar);
		frame.setVisible(true);
		
		
		frame.add(intrebari_ghicite);
		intrebari_ghicite.setVisible(false);
		frame.add(playAgain);
		playAgain.setVisible(false);
		
		
		frame.add(raspuns_A);
		raspuns_A.setVisible(false);
	    frame.add(raspuns_B);
	    raspuns_B.setVisible(false);
		frame.add(raspuns_C);
		raspuns_C.setVisible(false);
		frame.add(raspuns_D);
		raspuns_D.setVisible(false);
		
		frame.add(buttonA);
		buttonA.setVisible(false);
		frame.add(buttonB);
		buttonB.setVisible(false);
		frame.add(buttonC);
		buttonC.setVisible(false);
		frame.add(buttonD);
		buttonD.setVisible(false);
		
		meniu();
		bar.setVisible(false);
		fill();
	}
	
	int actual=index;
	
	int timp_dificultate=600;
	
	int check=0;
	
	public void fill() {
		int counter=600;
		while(counter>0) {
			bar.setValue(counter);
			try {
				if(check>1)
					Thread.sleep(timp_dificultate);
				else
					Thread.sleep(600);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			counter-=1;
			
			if(check==1) {
				check++;
				fill();
			}
			
			if(index>actual) {
				actual++;
				fill();
			}
		}
		
		if(index<nr_intrebari)
		{
		actual++;
		arataRaspuns();
		fill();
		}
	}
	
	int dif=0;
	int dom=0;
	public void meniu() {
		textfield1.setText("Teste grila");
		textfield2.setText("Meniu");
		frame.add(buttonStart);
		buttonStart.setEnabled(false);
		frame.add(buttonGeografie);
		frame.add(buttonIstorie);
		frame.add(buttonFilm);
		frame.add(buttonUsor);
		frame.add(buttonMediu);
		frame.add(buttonGreu);
		frame.add(buttonIesire);
	}
	
	public void urmIntrebare() {
		if(index>=nr_intrebari) {
			rezultate();
		}
		else {
			bar.setVisible(true);
			textfield1.setText("Intrebarea "+(index+1));
			if(domeniu=="geografie")
				textfield2.setText(intrebari_geografie[index]);
			else if(domeniu=="istorie")
				textfield2.setText(intrebari_istorie[index]);
			else if(domeniu=="film")
				textfield2.setText(intrebari_film[index]);
			if(domeniu=="geografie")
			{
			    raspuns_A.setText(optiuni_geografie[index][0]);
			    raspuns_B.setText(optiuni_geografie[index][1]);
			    raspuns_C.setText(optiuni_geografie[index][2]);
			    raspuns_D.setText(optiuni_geografie[index][3]);
			}
			else if(domeniu=="istorie")
			{
				raspuns_A.setText(optiuni_istorie[index][0]);
				raspuns_B.setText(optiuni_istorie[index][1]);
				raspuns_C.setText(optiuni_istorie[index][2]);
				raspuns_D.setText(optiuni_istorie[index][3]);
			}
			else if(domeniu=="film")
			{
				raspuns_A.setText(optiuni_film[index][0]);
				raspuns_B.setText(optiuni_film[index][1]);
				raspuns_C.setText(optiuni_film[index][2]);
				raspuns_D.setText(optiuni_film[index][3]);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(e.getSource()==buttonStart) {
			buttonStart.setVisible(false);
			buttonGeografie.setVisible(false);
			buttonIstorie.setVisible(false);
			buttonFilm.setVisible(false);
			buttonUsor.setVisible(false);
			buttonMediu.setVisible(false);
			buttonGreu.setVisible(false);
			buttonIesire.setVisible(false);

			raspuns_A.setVisible(true);
		    raspuns_B.setVisible(true);
			raspuns_C.setVisible(true);
			raspuns_D.setVisible(true);
			buttonA.setVisible(true);
			buttonB.setVisible(true);
			buttonC.setVisible(true);
			buttonD.setVisible(true);
			
			buttonA.setEnabled(true);
			buttonB.setEnabled(true);
			buttonC.setEnabled(true);
			buttonD.setEnabled(true);
			
			check=1;
			
			urmIntrebare();
		}
		
		if(e.getSource()==buttonGeografie) {
			domeniu="geografie";
			buttonGeografie.setForeground(Color.RED);
			buttonIstorie.setForeground(Color.BLACK);
			buttonFilm.setForeground(Color.BLACK);
			dom=1;
			if(dif==1 && dom==1) {
				buttonStart.setEnabled(true);
			}
		}
		
		if(e.getSource()==buttonIstorie) {
			domeniu="istorie";
			buttonIstorie.setForeground(Color.RED);
			buttonGeografie.setForeground(Color.BLACK);
			buttonFilm.setForeground(Color.BLACK);
			dom=1;
			if(dif==1 && dom==1) {
				buttonStart.setEnabled(true);
			}
		}
		
		if(e.getSource()==buttonFilm) {
			domeniu="film";
			buttonFilm.setForeground(Color.RED);
			buttonGeografie.setForeground(Color.BLACK);
			buttonIstorie.setForeground(Color.BLACK);
			dom=1;
			if(dif==1 && dom==1) {
				buttonStart.setEnabled(true);
			}
		}
		
		if(e.getSource()==buttonIesire) {
			System.exit(0);
		}
		
		if(e.getSource()==buttonUsor) {
			timp_dificultate=100;
			buttonUsor.setForeground(Color.RED);
			buttonMediu.setForeground(Color.BLACK);
			buttonGreu.setForeground(Color.BLACK);
			dif=1;
			if(dif==1 && dom==1) {
				buttonStart.setEnabled(true);
			}
		}
		
		if(e.getSource()==buttonMediu) {
			timp_dificultate=50;
			buttonMediu.setForeground(Color.RED);
			buttonGreu.setForeground(Color.BLACK);
			buttonUsor.setForeground(Color.BLACK);
			dif=1;
			if(dif==1 && dom==1) {
				buttonStart.setEnabled(true);
			}
		}
		
		if(e.getSource()==buttonGreu) {
			timp_dificultate=25;
			buttonGreu.setForeground(Color.RED);
			buttonMediu.setForeground(Color.BLACK);
			buttonUsor.setForeground(Color.BLACK);
			dif=1;
			if(dif==1 && dom==1) {
				buttonStart.setEnabled(true);
			}
		}
		
		if(e.getSource()==playAgain) {
			dom=0;
			dif=0;
			index=0;
			scor=0;
			actual=0;
			timp_dificultate=600;
			check=0;
			
			textfield1.setText("Teste grila");
			textfield2.setVisible(true);
			textfield2.setText("Meniu");
			buttonStart.setEnabled(false);
			buttonStart.setVisible(true);
			buttonGeografie.setVisible(true);
			buttonIstorie.setVisible(true);
			buttonFilm.setVisible(true);
			buttonUsor.setVisible(true);
			buttonMediu.setVisible(true);
			buttonGreu.setVisible(true);
			buttonIesire.setVisible(true);
			intrebari_ghicite.setVisible(false);
			playAgain.setVisible(false);
			
			buttonUsor.setForeground(Color.BLACK);
			buttonMediu.setForeground(Color.BLACK);
			buttonGreu.setForeground(Color.BLACK);
			buttonIstorie.setForeground(Color.BLACK);
			buttonGeografie.setForeground(Color.BLACK);
			buttonFilm.setForeground(Color.BLACK);
		}
		
		if(domeniu=="geografie")
		{
			if(e.getSource()==buttonA) {
				raspuns='A';
				if(raspuns==raspunsuri_geografie[index]) {
					scor++;
				}
				arataRaspuns();
				
			}
			if(e.getSource()==buttonB) {
				raspuns='B';
				if(raspuns==raspunsuri_geografie[index]) {
					scor++;
				}
				arataRaspuns();
			}
			if(e.getSource()==buttonC) {
				raspuns='C';
				if(raspuns==raspunsuri_geografie[index]) {
					scor++;
				}
				arataRaspuns();
			}
			if(e.getSource()==buttonD) {
				raspuns='D';
				if(raspuns==raspunsuri_geografie[index]) {
					scor++;
				}
				arataRaspuns();
			}
		} else if(domeniu=="istorie") {
			if(e.getSource()==buttonA) {
				raspuns='A';
				if(raspuns==raspunsuri_istorie[index]) {
					scor++;
				}
				arataRaspuns();
			}
			
			if(e.getSource()==buttonB) {
				raspuns='B';
				if(raspuns==raspunsuri_istorie[index]) {
					scor++;
				}
				arataRaspuns();
			}
			
			if(e.getSource()==buttonC) {
				raspuns='C';
				if(raspuns==raspunsuri_istorie[index]) {
					scor++;
				}
				arataRaspuns();
			}
			
			if(e.getSource()==buttonD) {
				raspuns='D';
				if(raspuns==raspunsuri_istorie[index]) {
					scor++;
				}
				arataRaspuns();
			}
		} else if(domeniu=="film") {
			if(e.getSource()==buttonA) {
				raspuns='A';
				if(raspuns==raspunsuri_film[index]) {
					scor++;
				}
				arataRaspuns();
			}
			
			if(e.getSource()==buttonB) {
				raspuns='B';
				if(raspuns==raspunsuri_film[index]) {
					scor++;
				}
				arataRaspuns();
			}
			
			if(e.getSource()==buttonC) {
				raspuns='C';
				if(raspuns==raspunsuri_film[index]) {
					scor++;
				}
				arataRaspuns();
			}
			
			if(e.getSource()==buttonD) {
				raspuns='D';
				if(raspuns==raspunsuri_film[index]) {
					scor++;
				}
				arataRaspuns();
		}	
	}		
}

	public void arataRaspuns() {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(domeniu=="geografie")
		{
			if(raspunsuri_geografie[index]!='A')
				raspuns_A.setForeground(Color.RED);
			if(raspunsuri_geografie[index]!='B')
				raspuns_B.setForeground(Color.RED);
			if(raspunsuri_geografie[index]!='C')
				raspuns_C.setForeground(Color.RED);
			if(raspunsuri_geografie[index]!='D')
				raspuns_D.setForeground(Color.RED);
		} else if(domeniu=="istorie") {
			if(raspunsuri_istorie[index]!='A')
				raspuns_A.setForeground(Color.RED);
			if(raspunsuri_istorie[index]!='B')
				raspuns_B.setForeground(Color.RED);
			if(raspunsuri_istorie[index]!='C')
				raspuns_C.setForeground(Color.RED);
			if(raspunsuri_istorie[index]!='D')
				raspuns_D.setForeground(Color.RED);
		} else if(domeniu=="film") {
			if(raspunsuri_film[index]!='A')
				raspuns_A.setForeground(Color.RED);
			if(raspunsuri_film[index]!='B')
				raspuns_B.setForeground(Color.RED);
			if(raspunsuri_film[index]!='C')
				raspuns_C.setForeground(Color.RED);
			if(raspunsuri_film[index]!='D')
				raspuns_D.setForeground(Color.RED);
		}
		
		Timer pause = new Timer(300,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				raspuns_A.setForeground(Color.GREEN);
				raspuns_B.setForeground(Color.GREEN);
				raspuns_C.setForeground(Color.GREEN);
				raspuns_D.setForeground(Color.GREEN);
				
				raspuns=' ';
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				
				urmIntrebare();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	
	public void rezultate() {
		raspuns_A.setVisible(false);
	    raspuns_B.setVisible(false);
		raspuns_C.setVisible(false);
		raspuns_D.setVisible(false);
		
		buttonA.setVisible(false);
		buttonB.setVisible(false);
		buttonC.setVisible(false);
		buttonD.setVisible(false);
		
		textfield1.setText("Rezultat!");
		textfield2.setVisible(false);
		
		bar.setVisible(false);
		
		intrebari_ghicite.setText(scor+"/"+nr_intrebari);
		intrebari_ghicite.setVisible(true);
		playAgain.setVisible(true);
		buttonIesire.setVisible(true);
	}
}
